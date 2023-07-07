package comm;

public class Mobile {
	private Battery b;
	{
		b = new Battery();

	}
	public Battery getBattery() {
		return b;
	}
	public Simcard getSimcard() {
		return s1;
	}
	
	public void setNumber(Simcard s1) {
		this.s1 = s1;
	}
	private Simcard s1;
	

	public void setsim(Simcard s1) {
		this.s1= s1 ;

	}
	

}
