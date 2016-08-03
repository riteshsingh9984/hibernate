package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.employee.bo.EmployeeBo;
import com.mkyong.employee.model.Employee;
import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Stock;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
    	
    	EmployeeBo employeeBo = (EmployeeBo)appContext.getBean("employeeBo");
    	
    	/** insert **/
    	Employee employee = new Employee();
    	employee.setEmployeeCode("7668");
    	employee.setEmployeeName("HAIO");
    	employeeBo.save(employee);
    	
    	/** select **/
    	Employee employee2 = employeeBo.findByEmployeeCode("7668");
    	System.out.println(employee2);
    	
    	/** update **/
    	employee2.setEmployeeName("HAIO-1");
    	employeeBo.update(employee2);
    	
    	/** delete **/
    	//employeeBo.delete(employee2);
    	
    	System.out.println("Done");
    	
    }
}
