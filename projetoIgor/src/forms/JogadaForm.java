package forms;

import org.apache.struts.action.ActionForm;
public class JogadaForm extends ActionForm {
	private static final long serialVersionUID = 7352021000623040587L;
	private int clickLinha;
	private int clickColuna;
	public int getClickLinha() {
		return clickLinha;
	}
	public void setClickLinha(int clickLinha) {
		this.clickLinha = clickLinha;
	}
	public int getClickColuna() {
		return clickColuna;
	}
	public void setClickColuna(int clickColuna) {
		this.clickColuna = clickColuna;
	}
}
