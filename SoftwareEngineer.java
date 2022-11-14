package coursrworktwo;

public class SoftwareEngineer extends Employee {

	public String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SoftwareEngineer(String name, double pay, String title) {
		super(name, pay);
		this.title = title;
		// TODO Auto-generated constructor stub
	}

}
