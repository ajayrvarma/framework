package bean;

import delegate.DataBean;

public class LoginResponseDataBean implements DataBean{

	private String success;
	
	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

}
