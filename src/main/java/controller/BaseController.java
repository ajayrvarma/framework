package controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import bean.BaseRequestBean;
import bean.GenericResponseBean;
import validator.BaseValidator;

public abstract class BaseController extends BaseErrorController {

	//public abstract GenericResponseBean processRequest(BaseRequestBean requestBean) throws Exception;
	
	// basic validations
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new BaseValidator());
	}

}
