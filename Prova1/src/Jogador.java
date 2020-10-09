//João Vitor de Oliveira e Paulo Rubens de Moraes Leme Júnior


public class Jogador 
{
    private String nome;
    private String posicao;
    private double altura;
    private int idade;



    public Jogador(String nome, String posicao, double altura, int idade)
    {
        this.nome = nome;
        this.posicao = posicao;
        this.altura = altura;
        this.idade = idade;
    }

    public Jogador() {}


    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setPosicao(String posicao)
    {
        this.posicao = posicao;
    }

    public String getPosicao()
    {
        return this.posicao;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getAltura()
    {
        return this.altura;
    }

    public void setIdade(int idade)
    {
        if (idade > 0)
        this.idade = idade;
    }

    public int getIdade()
    {
        return this.idade;
    }





}