package service;

public class JogadorService {
	private String nome;
	private int pontos=0;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos += pontos;
	}
	public void zerarPontos()
	{
		this.pontos=0;
	}
}
