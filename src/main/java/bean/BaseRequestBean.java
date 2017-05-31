package bean;

public class BaseRequestBean {

	private String mobileHash;
	private String appPassCode;
	
	public String getAppPassCode() {
		return appPassCode;
	}

	public void setAppPassCode(String appPassCode) {
		this.appPassCode = appPassCode;
	}

	public String getMobileHash() {
		return mobileHash;
	}

	public void setMobileHash(String mobileHash) {
		this.mobileHash = mobileHash;
	}

}
