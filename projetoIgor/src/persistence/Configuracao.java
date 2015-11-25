package persistence;

public class Configuracao {

	private int id;
	private int  linha,coluna,bomba;

	public Configuracao()
	{
		
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public int getBomba() {
		return bomba;
	}
	public void setBomba(int bomba) {
		this.bomba = bomba;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
