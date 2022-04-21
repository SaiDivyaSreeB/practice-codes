package assignments;
import java.util.ArrayList;
import java.util.List; 
 class Customer4 {
	String name;
	int numberOfRooms;
	public Customer4(String name, int numberOfRooms) {
		
	}
	

}




class Hotel {
	List<String> customerName = new ArrayList<>();
	int roomsBooked=0;
	int flag=0;
	
	public String checkIn(Customer4 customer) {
		if(roomsBooked<=10) 
		{
			flag=1;
			roomsBooked+=1;
			customerName.add(customer.name);
			return " Checked in";
			
		}
		else
			return "No rooms available";
		
		
	}
	
	public String checkRooms(Customer4 customer) {
		if(flag==1)
			return "Yes";
		else
			return "No";
		
	}
	

}



public class question47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer4 cust=new Customer4("Doselect", 4);
		Hotel hotel=new Hotel();
		String out =hotel.checkIn(cust);
		System.out.println(out);
	}
}
