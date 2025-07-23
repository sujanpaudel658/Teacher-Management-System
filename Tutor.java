/**
 * Write a description of class Tutor here.
 *
 * @author (Sujan Paudel)
 * @version (a version number or a date)
 */
public class Tutor extends Teacher

{
 private double salary;
 private String specialization;
 private String academicQualifications;
 private int performanceIndex;
 private boolean isCertified;
public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workinghours,double salary,String specialization,String academicqualifications,int performanceIndex)
 {
   super(teacherId,teacherName,address,workingType,employmentStatus);
   this.salary = salary;
   this.specialization = specialization;
   
   this.academicQualifications = academicqualifications;
   this.performanceIndex = performanceIndex;
   this.isCertified = false;
    
}

//By using the Accessor Methods//
public double getsalary(){
      return salary;
}
public String getspecialization(){
    return specialization;
}
public String getacademicQualification(){
    return academicQualifications;
}
public int getperformanceIndex(){
    return performanceIndex;
}
public boolean isCertified(){
    return isCertified;
}
//By using the method to set salary and certify tutor
public void setSalary(double newSalary, int newPerformanceIndex){
    if(newPerformanceIndex>5 && getworkingHours()>20){
        double appraisal=0;
        if(newPerformanceIndex>=5&& newPerformanceIndex<=7){
            appraisal=0.05;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisal = 0.10;
            } else if (newPerformanceIndex == 10) {
                appraisal = 0.20;
            }
            double approvedSalary = salary + (appraisal * salary);
            this.salary = approvedSalary;
            this.performanceIndex = newPerformanceIndex;
            isCertified = true;
        } else {
            System.out.println("Salary approval is not possible.The tutor is not certified yet.");
        }
    }

    public void removeTutor() {
        if (!isCertified) {
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;
            isCertified = false;
        } else {
            System.out.println("The Tutor is certified. It Cannot be removed.");
        }
    }

    public String display() {
    String displayInfo = super.display();

    if (isCertified) {
        displayInfo += "Salary: " + salary + "\n";
        displayInfo += "Specialization: " + specialization + "\n";
        displayInfo += "Academic Qualifications: " + academicQualifications + "\n";
        displayInfo += "Performance Index: " + performanceIndex + "\n";
    }

    return displayInfo;
}
}
