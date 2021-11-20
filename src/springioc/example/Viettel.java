package springioc.example;

public class Viettel implements Sim{

	@Override
	public void calling() {
		System.out.print("calling using Vietel sim \n");
		
	}

	@Override
	public void data() {
		System.out.print("internet using Viettel sim \n");
		
	}

}
