import java.util.Date;
import java.util.LinkedList;


public class Main {

	static Calendar c;
	static Class c1;
	static Class c2;
	static Routine job;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c = new Calendar();
		c1 = new Class("Math",2,"R","06:00","11:00",5,0.9,false);
		c2 = new Class("Comp 110",4,"MW","11:15","14:00",3,0.8,false);
		job = new Routine("Job","F","08:00", "11:00");
		
		c.addInPlace(new Assignment("A1", c1, 1503282245, 0));
		c.addInPlace(new Assignment("A2", c2, 1504031030, 1));
		c.addInPlace(new Assignment("A0", c1, 1504052300, 2));
		c.addClass(c1);
		c.addClass(c2);
		c.addRoutine(job);
		for(int i=0;i<c.current.size();i++)
		System.out.println(c.current.get(i).Name+" "+c.current.get(i).getAllocatedTime());

	//	String[] days = {"Monday","Wednesday"};
	//	Class c1 = new Class("math",4,days,"10:00","12:00",5,0.9,false);
    //		c.addToDay(new Date(2015,2,20,12,0), "05:29", "22:00");
		c.update();
	//	c.slots[1].printAvailableTimes();
		for (int i=0;i<14;i++){
			c.slots[i].printBusyTimes();
		}
		
		for (int i=0;i<14;i++){
			c.slots[i].printAvailableTimes();
		}
	
	}
	
	public void sync(){
	
	}
}