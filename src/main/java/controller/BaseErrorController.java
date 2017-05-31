package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import bean.GenericResponseBean;
import constants.Constants;
import util.StringUtils;

public class BaseErrorController {
	
	// Generic Exception handling
	@ExceptionHandler(Exception.class)
	public GenericResponseBean processError(HttpServletRequest request, Exception exception) {
		GenericResponseBean bean = new GenericResponseBean();
		bean.setMobileHash(null);
		bean.setSuccess(Constants.FAILURE);
		bean.setErrorCode(StringUtils.getErrorMessage(exception.getMessage())[0]);
		bean.setErrorDescription(StringUtils.getErrorMessage(exception.getMessage())[1]);
		return bean;
	}

}
