package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import service.ConfiguraService;
import forms.ConfiguraForm;

public class ConfiguraAction extends Action {
	private ConfiguraService configService;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		 ConfiguraForm configuraForm = (ConfiguraForm) form;
		 if(getErrors(request) == null ||getErrors(request).size() == 0){  
			 configService.configurar(configuraForm);
			 return mapping.findForward("hello");
		 }
		 else{
			 return mapping.getInputForward();
		 }
	}
	public void setConfigService(ConfiguraService configService) {
		this.configService = configService;
	}
}
