
import java.util.ArrayList;  

public class Realtor extends User{
	private int years_of_experience;
	private ArrayList<Customer> clients;
	public int getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(int years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	public Realtor(String name, String phone, String email, int years) {
		super(name, phone, email);
		years_of_experience = years;
		clients=new ArrayList<Customer>();
	}

	@Override
	public void showList() {
		System.out.println("Рієлтор "+name+" співпрацює з "+clients.size()+" покупцями:");
		for(Customer client:clients) {
			System.out.println(client.getName());
		}
		
	}

	public void addClient(Customer client) {
		clients.add(client);
	}

}
