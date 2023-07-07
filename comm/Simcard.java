package comm;

 class Simcard {
	private int number;
	private String service_provider;

	
	


	public int getNumber() {
		return number;
	}





	public void setNumber(int number) {
		this.number = number;
	}





	public String getService_provider() {
		return service_provider;
	}





	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}





	void display() {

		System.out.println(number);
		System.out.println(service_provider);

	}

}
