package com.intel.yj.dp.businessdelegate;

public class BusinessDelegateApp {
	public static void test(){
		BusinessDelegate businessDelegate = new BusinessDelegate();
		Client client = new Client(businessDelegate);
		
		businessDelegate.setServiceType(ServiceType.EJB);
		client.doTask();

		businessDelegate.setServiceType(ServiceType.JMS);
		client.doTask();
	}
}
