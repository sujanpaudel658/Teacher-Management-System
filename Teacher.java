/**
 * Write a description of class Teacher here.
 *
 * @author (Sujan Paudel)
 * @version (a version number or a date)
 */
public class Teacher
{
   
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private double workingHours;
    
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    public int getteacherId(){
        return teacherId;
    }
    
    public String getteacherName(){
        return teacherName;
    }
    
    public String getaddress(){
        return address;
    }
    
    public String getworkingType(){
        return workingType;
    }
    
    public String getemploymentStatus(){
        return employmentStatus;
    }
    
    public double getworkingHours(){
        return workingHours;
    }
    
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
  
    public String display() {
        String displayInfo = "Teacher ID: " + teacherId + "\n";
        displayInfo += "Teacher Name: " + teacherName + "\n";
        displayInfo += "Address: " + address + "\n";
        displayInfo += "Working Type: " + workingType + "\n";
        displayInfo += "Employment Status: " + employmentStatus + "\n";

        if (workingHours == 0) {
            displayInfo += "Working Hours has not been assigned.";
        } else {
            displayInfo += "Working Hours: " + workingHours;
        }

        return displayInfo;
    }
}