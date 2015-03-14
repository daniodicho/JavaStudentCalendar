//package csun.aims.aimssmartcalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;

public class Assignment {

	int Id;
	String Name; 
	Class Course;
	long DueDateandTime;
	//String DueTime;
	int Type ;
	double Priority;
	String SuggestedTime;
	Double AllocatedTime;
	String ActualCompletedTime;
	Boolean Finished;
	double Grade ;
	
	Assignment(String newName, Class newClass, long newDueDate,  int newType ){
		Name = newName;
		DueDateandTime = newDueDate;
		//DueTime = newDueTime;
		Type = newType;
		Course = newClass;
		Finished = false;
		Priority = calculatePriority();
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	public Class getCourse() {
		return Course;
	}
	public void setCourse(Class theClass) {
		Course = theClass;
	}
	public long getDueDate() {
		return DueDateandTime;
	}
	public void setDueDate(long dueDate) {
		DueDateandTime = dueDate;
	}
	
	public String getType() {
		if(Type==0){
			return "homework";
		}
		else if (Type ==1){
			return "project";
		}
		else
		{
			return "test";
		}
	}
	public void setType(int type) {
		Type = type;
	}
	public double getPriority() {
		return Priority;
	}
	public void setPriority(double priority) {
		Priority = priority;
	}
	public String getSuggestedTime() {
		return SuggestedTime;
	}
	public void setSuggestedTime(String suggestedTime) {
		SuggestedTime = suggestedTime;
	}
	public Double getAllocatedTime() {
		return AllocatedTime;
	}
	public void setAllocatedTime(Double allocatedTime) {
		AllocatedTime = allocatedTime;
	}
	public String getActualCompletedTime() {
		return ActualCompletedTime;
	}
	public void setActualCompletedTime(String actualCompletedTime) {
		ActualCompletedTime = actualCompletedTime;
	}
	public Boolean getFinished() {
		return Finished;
	}
	public void setFinished(Boolean finished) {
		Finished = finished;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	public int getId(){
		return this.Id;
	}
	public void setId(int newId){
		this.Id = newId;
	}
	public double calculatePriority(){
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/HH:MM:SS");
       
        DateFormat df = new SimpleDateFormat("YYYYMMddHH");
        long d = getDueDate();
        

        
        String now = df.format(new Date());
        int nowInt = Integer.parseInt(now);
        
        long diff = (d - nowInt)+((d%100) -(nowInt%100))*3;


        System.out.println(diff);
		return 100*(7.0/(diff) )* (1+Type)*(1/getCourse().getCurrentGrade())*getCourse().getDifficulty();
		
	}
	
}
