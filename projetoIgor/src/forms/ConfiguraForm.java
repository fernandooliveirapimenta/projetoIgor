package forms;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ConfiguraForm extends ActionForm {
	 private static final long serialVersionUID = 7352021000623040587L;
	 private String nome;
	 private int linha;
	 private int coluna;
	 private int bomba;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors(); 
		if(this.nome == null || this.nome.trim().equals(""))
			errors.add("name", new ActionMessage("errors.required","Name"));
		if(this.linha == 0 )
			errors.add("linha", new ActionMessage("errors.required","Linha"));
		if(this.coluna == 0)
			errors.add("coluna", new ActionMessage("errors.required","Coluna"));
		if(this.bomba == 0)
			errors.add("bomba", new ActionMessage("errors.required","Bomba"));
		return errors;
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.nome = null;
		super.reset(mapping, request);
	}

}
