package com.donateit.framework;

import bean.BaseRequestBean;
import bean.GenericResponseBean;
import constants.Constants;
import delegate.DataBean;

public final class GenericResponseGenerator {

	private GenericResponseBean responseBean = new GenericResponseBean();

	public GenericResponseBean generateResponse(BaseRequestBean requestBean, DataBean dataBean) {
		responseBean.setMobileHash(new MobileHashGenerator().generateMobileHash());
		responseBean.setDataBean(dataBean);
		responseBean.setSuccess(Constants.SUCCESS);
		responseBean.setErrorCode(Constants.CODE_SUCCESS);
		responseBean.setErrorDescription(Constants.DESC_SUCCESS);

		return responseBean;
	}
}
