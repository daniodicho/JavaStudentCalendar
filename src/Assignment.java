public class Assignment {

	int Id;
	String Name; 
	String Course;
	String DueDate;
	String DueTime;
	int Type ;
	int Priority;
	String SuggestedTime;
	Double AllocatedTime;
	String ActualCompletedTime;
	Boolean Finished;
	double Grade ;
	
	Assignment(String newName, String newClass, String newDueDate, String newDueTime, int newType, int newPriority  ){
		Name = newName;
		DueDate = newDueDate;
		DueTime = newDueTime;
		Type = newType;
		Priority = newPriority;
		Course = newClass;
		Finished = false;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String theClass) {
		Course = theClass;
	}
	public String getDueDate() {
		return DueDate;
	}
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}
	public String getDueTime() {
		return DueTime;
	}
	public void setDueTime(String dueTime) {
		DueTime = dueTime;
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
	public int getPriority() {
		return Priority;
	}
	public void setPriority(int priority) {
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
	
}
