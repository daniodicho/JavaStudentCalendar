
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = new Calendar();
		Assignment a1 = new Assignment("A1", "Math", "05/05/2015", "09:00", 0, 3);
	//	String[] days = {"Monday","Wednesday"};
	//	Class c1 = new Class("math",4,days,"10:00","12:00",5,0.9,false);
		c.addToDay(1, "05:29", "22:00");
		c.slots[1].printAvailableTimes();
	}
}