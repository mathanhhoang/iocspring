package springioc.example;

public class Mobifone implements Sim{
	@Override
	public void calling() {
		System.out.print("calling using Mobi sim \n");
		
	}

	@Override
	public void data() {
		System.out.print("internet using Mobi sim \n");
		
	}

}
