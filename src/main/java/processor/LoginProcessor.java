package processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import bean.BaseRequestBean;
import bean.LoginRequestBean;
import bean.LoginResponseDataBean;
import dao.UserDao;
import delegate.DataBean;
import delegate.Processor;
import entity.User;

@Service
public class LoginProcessor implements Processor {

	@Autowired
	private UserDao userDao;

	private LoginResponseDataBean dataBean = new LoginResponseDataBean();

	@Override
	public DataBean process(BaseRequestBean theRequestBean) {
		LoginRequestBean requestBean = (LoginRequestBean) theRequestBean;

		User user = userDao.getByEmail(requestBean.getAppPassCode());
		System.out.println(user.getName());

		return dataBean;
	}

}
