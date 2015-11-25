package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import service.JogadaService;
import forms.JogadaForm;

public class JogadaAction extends Action {
	private JogadaService jogadaService;
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		JogadaForm jogadaForm = (JogadaForm) form;
		if (jogadaService.jogada(jogadaForm.getClickLinha() - 1, jogadaForm.getClickColuna() - 1) == 1){
			return mapping.findForward("perdeu");
		} 
		else 
		{
			if (jogadaService.jogada(jogadaForm.getClickLinha() - 1,jogadaForm.getClickColuna() - 1) == 2){	
				return mapping.findForward("venceu");
			}
			return mapping.findForward("hello");
		}
	}
	public void setJogadaService(JogadaService jogadaService) {
		this.jogadaService = jogadaService;
	}

}
