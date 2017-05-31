package delegate;

import bean.BaseRequestBean;

public interface Processor {

	public DataBean process(BaseRequestBean bean);
}
