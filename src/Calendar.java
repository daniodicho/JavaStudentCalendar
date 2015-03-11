import java.util.LinkedList;
import java.util.Date;

public class Calendar {

	Class classes[] = new Class[10];
	LinkedList <Assignment> current = new LinkedList<Assignment>();
	DaySlots[] slots;
	Date date = new Date();
	int today = date.getDay();
	int day = 0;	
	
	
	Calendar(){
		slots = new DaySlots[14];
		for(int i=0;i<14;i++){
			slots[i] = new DaySlots();
		}
	}
	
	public void addToDay(String date, String start, String finish){
		for(int i=0;i<14;i++){
			if(slots[i].getDate() == date){
				slots[i].newTime(start, finish);
			}
		}
	}
	
	public void addClass(Class c){
		for(int i=0;i<10;i++){
			if (classes[i] == null){
				classes[i] =  c ;
			}
		}
	}
	
	public void deleteClass(Class c){
		for(int i=0;i<10;i++){
			if ( classes[i].name == c.name){
				classes[i] =  null ;
			}
		}	
	}
	
	public void addToDay(int index, String start, String finish){
		slots[index].newTime(start, finish);
	}
}
