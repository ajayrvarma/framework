package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import bean.BaseRequestBean;
import bean.LoginRequestBean;

@SuppressWarnings("rawtypes")
@Component
public class BaseValidator implements Validator {

	public boolean supports( Class clazz) {
		return LoginRequestBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		BaseRequestBean bean = (BaseRequestBean) target;
		if (bean.getMobileHash().equals("")) {
			errors.reject("Invalid MobileHash");
		}else if(bean.getAppPassCode().equals("")) {
			errors.reject("Invalid AppPassCode");
		}
	}

}
