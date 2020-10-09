//João Vitor de Oliveira e Paulo Rubens de Moraes Leme Júnior

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VeiculoTest {

	@Test
	void testGetIndiceSucateamento() {
		Veiculo furgaoRenault = new Veiculo();
		Manutencao m1 = new Manutencao();
		
		m1.setNumero(4);
		m1.setDescricao("Troca do pára-brisas");
		m1.setCusto(603);
		m1.setTempo(1);
		furgaoRenault.addManutencao(m1);
		
		Manutencao m2 = new Manutencao();
		
		m2.setNumero(8);
		m2.setDescricao("Substituição do cardan");
		m2.setCusto(3002);
		m2.setTempo(18);
		furgaoRenault.addManutencao(m2);
		
		Manutencao m3 = new Manutencao();
		
		m3.setNumero(16);
		m3.setDescricao("Troca de filtro de ar do ar-condicionado");
		m3.setCusto(89);
		m3.setTempo(2);
		furgaoRenault.addManutencao(m3);
		
		assertEquals(furgaoRenault.getIndiceSucateamento(), 0.5);
		
		
	}

	@Test
	void testGetCustoMedio() {
		Veiculo furgaoRenault = new Veiculo();
		Manutencao m1 = new Manutencao();
		
		m1.setNumero(4);
		m1.setDescricao("Troca do pára-brisas");
		m1.setCusto(603);
		m1.setTempo(1);
		furgaoRenault.addManutencao(m1);
		
		Manutencao m2 = new Manutencao();
		
		m2.setNumero(8);
		m2.setDescricao("Substituição do cardan");
		m2.setCusto(3002);
		m2.setTempo(18);
		furgaoRenault.addManutencao(m2);
		
		Manutencao m3 = new Manutencao();
		
		m3.setNumero(16);
		m3.setDescricao("Troca de filtro de ar do ar-condicionado");
		m3.setCusto(89);
		m3.setTempo(2);
		furgaoRenault.addManutencao(m3);
		double threshold = 0.01;
		assertEquals(furgaoRenault.getCustoMedio(), 1231.33, threshold);
	}
	
	@Test
	void testGetCustoMedioDiario() {
		Manutencao m1 = new Manutencao();
		
		m1.setNumero(4);
		m1.setDescricao("Troca do pára-brisas");
		m1.setCusto(603);
		m1.setTempo(1);
		
		Manutencao m2 = new Manutencao();
		
		m2.setNumero(8);
		m2.setDescricao("Substituição do cardan");
		m2.setCusto(3002);
		m2.setTempo(18);

		double threshold = 0.1;
		//assertEquals(m1.getCustoMedioDiario(), 603); Funciona!Apenas para testar
		assertEquals(m2.getCustoMedioDiario(), 166.7, threshold);
		
		
	}

}
