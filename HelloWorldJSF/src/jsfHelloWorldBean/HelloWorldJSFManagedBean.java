package jsfHelloWorldBean;

import java.io.Serializable;

public class HelloWorldJSFManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private UserFormView userFormView;

	public HelloWorldJSFManagedBean() {
		this.userFormView = new UserFormView();
	}

	public UserFormView getUserFormView() {
		return userFormView;
	}

	public void setUserFormView(UserFormView userFormView) {
		this.userFormView = userFormView;
	}

	public String showUserDetails() {
		System.out.println("The Name Of the user is :" + this.userFormView.getUserName());
		return "welcomePage";
	}
}