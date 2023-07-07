package comm;

public class Driver {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setsim(new Simcard());
		m.getSimcard().setService_provider("jio");
		m.getBattery().mah=50000;
		m.getSimcard().display();
		m.getBattery().displaydetails();
	}

}
