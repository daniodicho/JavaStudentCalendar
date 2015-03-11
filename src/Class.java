public class Class {

    String name ;
    String days[];
    int difficulty;
    String startTime;
    String endTime;
    int units;
    double currentGrade ;
    Assignment assignments ;
    boolean requiresReading ;

    public Class() {
        name = null;
        difficulty = 0;
        startTime = null;
        endTime = null;
        units = 0;
        currentGrade = 0;
        requiresReading = false;
    }
    
    public Class(String n, int d, String day[], String sT, String tL, int u, double cG, boolean rR) {
        name = n;
        days = day;
        difficulty = d;
        startTime = sT;
        endTime = tL;
        units = u;
        currentGrade = cG;
        requiresReading = rR;
    }

    public String getName() {
        return this.name;  
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public int getDifficulty() {
        return this.difficulty;  
    }
    
    public void setDifficulty(int d) {
        this.difficulty = d;
    }
    
    public String getStartTime() {
        return this.startTime;  
    }
    
    public void setStartTIme(String sT) {
        this.startTime = sT;
    }

    public String getTimeLength() {
        return this.endTime;  
    }
    
    public void setTimeLength(String tL) {
        this.endTime = tL;
    }

    public int getUnits() {
        return this.units;
    }
    
    public void setUnits(int u) {
        this.units = u;
    }
    
    public Assignment getAssignments() {
        return this.assignments;
    }
    
    public void setAssignments(Assignment aS) {
        this.assignments = aS;
    }
    
    public double getCurrentGrade() {
        return this.currentGrade;
    }
    
    public void setCurrentGrade(double cG) {
        this.currentGrade = cG;
    }

    public boolean isRequiresReading() {
        return this.requiresReading;
    }
    
    public void setRequiresReading(boolean rR) {
        this.requiresReading = rR;
    }
}