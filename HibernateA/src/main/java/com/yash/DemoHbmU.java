package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoHbmU {
	public static void main(String s[])
	{
			ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
			UserDAO udao = (UserDAO) objAC.getBean("userdao");
			User objE = new User();
			objE.setFirstname("nitin");
			objE.setLastname("wagh");
			objE.setAdd1("karve nagar");
			objE.setAdd2("snehankit colony");
			objE.setDob("26 nov 1990");
			objE.setEmail("niting71@gmail.com");
			objE.setPassword("nitin123");
			objE.setCity("pune");
			objE.setMobile("9146900428");
			udao.saveUser(objE);
			
			
			
					
			
	}
}



