import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Date;

public class Calendar {

	LinkedList <Routine>routines = new LinkedList<Routine>();
	LinkedList <Class>classes = new LinkedList<Class>();

	LinkedList <Assignment> current = new LinkedList<Assignment>();
	DaySlots[] slots;
	Date date = new Date();
	int today = date.getDay();
	int day = 0;	
	
	
	Calendar(){
		slots = new DaySlots[14];
		
		GregorianCalendar calendar = new GregorianCalendar();
		for(int i=0;i<14;i++){
			Date d = calendar.getTime();
			slots[i] = new DaySlots(d);
			calendar.add(calendar.DAY_OF_MONTH, 1);
		}
	}
	
	public void addToDay(Date date, String start, String finish){
		for(int i=0;i<14;i++){
			if((slots[i].getDate().getMonth() == date.getMonth())&&(slots[i].getDate().getDate() == date.getDate())){
				slots[i].newTime(start, finish);
			}
		}
	}
	
	public void addClass(Class c){
		addRoutine(c);
		classes.add(c);
	}
	
	public void addRoutine(Routine r){
		routines.add(r);
	}
	
	public void deleteClass(Class c){
		deleteRoutine(c);
		for(int i=0;i<classes.size();i++){
			if ( classes.get(i).name == c.name){
				classes.remove(i);
			}
		}
	}
	
	void deleteRoutine(Routine r){
		for(int i=0;i<routines.size();i++){
			if ( routines.get(i).name == r.name){
				routines.remove(i);
			}
		}
	}
	public void addToDay(int index, String start, String finish){
		slots[index].newTime(start, finish);
	}
	
	public void update(){
		
		int firstDay = slots[0].getDate().getDay();
		for(int i=0;i<routines.size();i++){
			String s = routines.get(i).getDays();
			for(int j=0;j<s.length();j++){
				switch (s.charAt(j)){
				case 'S':
					addToDay(slots[7-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					addToDay(slots[14-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					break;
				case 'M':
					if(firstDay>1){
						addToDay(slots[8-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[15-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					else
					{
						addToDay(slots[1-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[8-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					break;
				case 'T':
					if(firstDay>2){
						addToDay(slots[9-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[16-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					else
					{
						addToDay(slots[2-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[9-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					break;
				case 'W':
					if(firstDay>3){
						addToDay(slots[10-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[17-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					else
					{
						addToDay(slots[3-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[10-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					break;
				case 'H':
					if(firstDay>4){
						addToDay(slots[11-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[18-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					else
					{
						addToDay(slots[4-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[11-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					break;
				case 'F':
					if(firstDay>5){
						addToDay(slots[12-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[19-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					else
					{
						addToDay(slots[5-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
						addToDay(slots[12-firstDay].getDate(),routines.get(i).startTime,routines.get(i).endTime);
					}
					break;
				}
			}
		}
	}
}
