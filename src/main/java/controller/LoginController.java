package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donateit.framework.GenericResponseGenerator;

import bean.BaseRequestBean;
import bean.GenericResponseBean;
import bean.LoginRequestBean;
import bean.LoginResponseDataBean;
import constants.Constants;
import processor.LoginProcessor;
import validator.LoginValidator;

@RestController
public class LoginController extends BaseController {
	
	@Autowired
	private LoginProcessor loginProcessor;

	@RequestMapping(value = Constants.loginUrl, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public GenericResponseBean processRequest(@Valid @RequestBody LoginRequestBean requestBean) throws Exception {

		// validate input fields
		new LoginValidator().validate(requestBean);

		// call business logic and populate data bean
		LoginResponseDataBean loginDataBean = (LoginResponseDataBean) loginProcessor.process(requestBean);
		
		// generate and return response bean
		return new GenericResponseGenerator().generateResponse(requestBean, loginDataBean);
	}

}
