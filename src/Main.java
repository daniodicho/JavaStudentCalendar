import java.util.LinkedList;


public class Main {

	static Calendar c;
	static Class c1;
	static Class c2;
	static LinkedList<Assignment> ass = new LinkedList<Assignment>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c = new Calendar();
		c1 = new Class("Math",4,"MW","10:00","12:00",5,0.9,false);
		c2 = new Class("Comp 110",4,"MW","12:15","14:00",5,0.8,false);
		c.current.add(new Assignment("A1", c1, 2015031512, 0));
		c.current.add(new Assignment("A1", c2, 2015031610, 0));
		
		System.out.println(c.current.get(0).getPriority());
		System.out.println(c.current.get(1).getPriority());

	//	String[] days = {"Monday","Wednesday"};
	//	Class c1 = new Class("math",4,days,"10:00","12:00",5,0.9,false);
	//	c.addToDay(1, "05:29", "22:00");
	//	c.slots[1].printAvailableTimes();
	}
	
	public void sync(){
	
	}
}