package com.learn.spring.autowiring;

public class AutoWiringService {
	
	private AutoWiringDAO autoWiringDAO;


	//构造器 ,自动装配和dytype类型有关和autoWiringDAO名字无关
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		System.out.println("In AutoWiringService construction Function...");
		this.autoWiringDAO = autoWiringDAO;
	}

	public AutoWiringService() {
	}


	//dytype和byname(此时autoWiringDAO必须和配置中一致),必须有个set方法setAutoWiringDAO
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("In setAutoWiringDAO Function...");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
