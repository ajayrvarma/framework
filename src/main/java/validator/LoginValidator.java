package validator;

import bean.LoginRequestBean;
import constants.Constants;
import delegate.CustomValidator;

public class LoginValidator implements CustomValidator{

	@Override
	public void validate(Object obj) throws Exception {
		LoginRequestBean bean = (LoginRequestBean)obj;
		if(bean.getUserName().equals(""))
			throw new Exception(Constants.VALIDATION_ERROR+"[Missing Parameter]");
	}

}
