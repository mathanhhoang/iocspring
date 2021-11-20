package springioc.example;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
//		Viettel viettel = new Viettel();
//		viettel.calling();
//		viettel.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		System.out.print("load conf susscessfull");
//		Viettel viettel = (Viettel)context.getBean("viettel");
//		viettel.calling();
//		viettel.data();
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
		Sim sim1 = context.getBean("sim1", Sim.class);
		sim1.calling();
		sim1.data();
//		
	}

}
