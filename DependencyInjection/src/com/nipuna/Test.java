package com.nipuna;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Test 
{
	public static void main(String args[])
	{
	   Resource resource=new ClassPathResource("applicationContext.xml"); 
	   BeanFactory factory=new XmlBeanFactory(resource); 
	      
	    Employee s=(Employee)factory.getBean("e");
	    s.show();  
}
	
}