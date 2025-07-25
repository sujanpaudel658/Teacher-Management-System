/**
 * Write a description of class Teacher here.
 *
 * @author (Sujan Paudel)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher
{
  
//adding attributes for lecturer 
 
  private String department;
  private int yearsOfExperience;
  private int gradedScore;
  private boolean hasGraded;
// Constructor for creating a Lecturer object 
public Lecturer(int teacherId,String teacherName,String address,String workingType,String employmentStatus,double workinghours,String department,int yearsOfExperience) //Constructor calling 
 {
  super(teacherId,teacherName,address,workingType,employmentStatus);
  super.setWorkingHours(workinghours);
   this.department = department;
  this.yearsOfExperience = yearsOfExperience;
 
  this.gradedScore = 0;
  this.hasGraded = false;
 
}

public String getdepartment() 
{
    return department;
}

public int getyearsOfExperience() 
{
    return yearsOfExperience;
}

public int getgradedScore() 
{
    return gradedScore;
}

public boolean gethasGraded() //getter method for hasGraded
{
    return hasGraded;
}

//mutator or setter method for graded Score 

public void setgradedScore(int gradedScore)
{
this.gradedScore=gradedScore;
}

public void gradeAssignment(int gradedScore,String Department,int YearsOfExperience) //method to grade the assignment
{
  if(YearsOfExperience >= 5 && this.department.equals(department)) {
    if(gradedScore >= 70) {
       System.out.println("The Grade is A");
    }
    else if(gradedScore >= 60) {
        System.out.println("The Grade is B");
    }
    else if(gradedScore >= 50) {
        System.out.println(" The Grade is C");
    }
    else if(gradedScore >= 40) {
       System.out.println(" The Grade is D");
    }
    else {
        System.out.println(" The Grade is E");
    }
    this.gradedScore = gradedScore;
    this.hasGraded = true;
 }
 else {
     System.out.println("Assignment has not been graded yet");
 }
 
}
public String display() { //method to display details of lecturer
    String displayInfo = super.display(); // Call display() method of the superclass to get basic teacher info

    displayInfo += "Department: " + department + "\n";
    displayInfo += "Years of Experience: " + yearsOfExperience + "\n";

    if (hasGraded) {
        displayInfo += "Graded Score: " + gradedScore + "\n";
    } else {
        displayInfo += "Assignment not graded yet\n";
    }

    return displayInfo;
}


}
