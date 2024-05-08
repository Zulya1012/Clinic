package plk;
import java.util.Scanner;
public class PolikMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1.Add clinic");
		System.out.println("2.Add doctor");
		System.out.println("3.Add medical card for pasient");
		
		int choice = s.nextInt();
		
		if (choice == 1) {
			System.out.println("Enter number clinic");
			int number = s.nextInt();
			System.out.println("Enter address");
			String address = s.nextLine();
			
			Clinic c = new Clinic();
			c.setNumber(number);
			c.setAddress(address);
			
			System.out.println(c.getNumber()+ " " + c.getAddress());
		}
		
		  else if (choice == 2) {
			  System.out.println("Enter name doctor");
			  String name = s.nextLine();
			  System.out.println("Enter lastName doctor");
			  String lastName = s.nextLine();
			  System.out.println("Enter number district");
			  int district = s.nextInt();
			  
			  Doctor d = new Doctor();
			  d.setName(name);
			  d.setLastName(lastName);
			  d.setNumberDistrict(district);
			  
			  System.out.println(d.getName()+ " "+ d.getLastName()+ " "+ d.getNumberDistrict());	 
			
		}
		
		  else if (choice==3) {
		      System.out.println("Enter name pasient");
			  String name = s.nextLine();
			  System.out.println("Enter lastName pasient");
			  String lastName = s.nextLine();
			  System.out.println("Enter address pasient");
			  String address = s.nextLine();
			  System.out.println("Enter phoneNumber pasient");
			  String phoneNumber = s.nextLine();
			  System.out.println("Enter districtDoctor");
			  String districtDoctor = s.nextLine();
			  
			  Pasient p = new Pasient();
			  p.setName(name);
			  p.setLastName(lastName);
			  p.setAddress(address);
			  p.setPhoneNumber(phoneNumber);
			  p.setDistrictDoctor(districtDoctor);
			  
			  
			  
			  System.out.println(p.getName()+ " "+ p.getLastName()+ " " + p.getAddress()+ " " + p.getDistrictDoctor());
		  }
		
		  else if (choice == 4) {
			  System.out.println("Enter new passient");
			  
		  }
		
		

	}

}
