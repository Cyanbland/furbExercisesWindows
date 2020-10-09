public class Cliente {
	private String usuario;
	private Endereco endereco;
	private Telefone telefone;

	public Cliente(String usuario, Endereco endereco, Telefone telefone) {
		this.setUsuario(usuario);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}

	public Cliente() {
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return this.telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}