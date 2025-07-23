/**
 * Write a description of class Teacher here.
 *
 * @author (Sujan Paudel)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TeacherGUI {
    // ArrayList to store teacher objects
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private JFrame frame;  // JFrame for the GUI frame
    private JPanel panel;   // JPanel for organizing components
    
    // JTextFields for input fields
    private JTextField teacherIdTxt, teacherNameTxt, addressTxt, workingTypeTxt, employmentStatusTxt,
            workingHoursTxt, departmentTxt, yearsOfExperienceTxt, gradedScoreTxt, salaryTxt, specializationTxt,
            academicQualificationsTxt, performanceIndexTxt;
    
    // JLabels for field labels
    private JLabel teacherIdLabel, teacherNameLabel, addressLabel, workingTypeLabel, employmentStatusLabel,
            workingHoursLabel, departmentLabel, yearsOfExperienceLabel, gradedScoreLabel, salaryLabel,
            specializationLabel, academicLabel, academicQualificationsLabel, performanceIndexLabel;
           
    // JButtons for different actions
    private JButton addLecturerButton, addTutorButton, gradeAssignmentButton, setSalaryButton, removeTutorButton, displayButton,
    clearButton;

    public TeacherGUI() { // Constructor to initialize the GUI
        frame = new JFrame();
        frame.setTitle("Teacher GUI SUJAN PAUDEL 23050272");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with GridBagLayout for organizing components
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        // Create and add JTextFields and JLabels to the panel  
        teacherIdLabel = new JLabel("TeacherId:");
        teacherIdTxt = new JTextField(20);
        // Add to panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(teacherIdLabel, constraints);
        constraints.gridx = 1;
        panel.add(teacherIdTxt, constraints);

        teacherNameLabel = new JLabel("Teacher Name:");
        teacherNameTxt = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(teacherNameLabel, constraints);

        constraints.gridx = 1;
        panel.add(teacherNameTxt, constraints);

        addressLabel = new JLabel("Address:");
        addressTxt = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(addressLabel, constraints);

        constraints.gridx = 1;
        panel.add(addressTxt, constraints);

        workingTypeLabel = new JLabel("Working Type:");
        workingTypeTxt = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(workingTypeLabel, constraints);

        constraints.gridx = 1;
        panel.add(workingTypeTxt, constraints);

        employmentStatusLabel = new JLabel("Employment Status:");
        employmentStatusTxt = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(employmentStatusLabel, constraints);

        constraints.gridx = 1;
        panel.add(employmentStatusTxt, constraints);

        workingHoursLabel = new JLabel("Working Hours:");
        workingHoursTxt = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(workingHoursLabel, constraints);

        constraints.gridx = 1;
        panel.add(workingHoursTxt, constraints);

        // Components for the right-hand side

        departmentLabel = new JLabel("Department:");
        departmentTxt = new JTextField(20);

        constraints.gridx = 2;
        constraints.gridy = 0;
        panel.add(departmentLabel, constraints);

        constraints.gridx = 3;
        panel.add(departmentTxt, constraints);

        yearsOfExperienceLabel = new JLabel("Years Of Experience:");
        yearsOfExperienceTxt = new JTextField(20);

        constraints.gridx = 2;
        constraints.gridy = 1;
        panel.add(yearsOfExperienceLabel, constraints);

        constraints.gridx = 3;
        panel.add(yearsOfExperienceTxt, constraints);

        gradedScoreLabel = new JLabel("Graded Score:");
        gradedScoreTxt = new JTextField(20);

        constraints.gridx = 2;
        constraints.gridy = 2;
        panel.add(gradedScoreLabel, constraints);

        constraints.gridx = 3;
        panel.add(gradedScoreTxt, constraints);

        salaryLabel = new JLabel("Salary:");
        salaryTxt = new JTextField(20);

        constraints.gridx = 2;
        constraints.gridy = 3;
        panel.add(salaryLabel, constraints);

        constraints.gridx = 3;
        panel.add(salaryTxt, constraints);

        specializationLabel = new JLabel("Specialization:");
        specializationTxt = new JTextField(20);

        constraints.gridx = 2;
        constraints.gridy = 4;
        panel.add(specializationLabel, constraints);

        constraints.gridx = 3;
        panel.add(specializationTxt, constraints);

        academicQualificationsLabel = new JLabel("Academic Qualifications:");
        academicQualificationsTxt = new JTextField(20);

        constraints.gridx = 2;
        constraints.gridy = 5;
        panel.add(academicQualificationsLabel, constraints);

        constraints.gridx = 3;
        panel.add(academicQualificationsTxt, constraints);

        performanceIndexLabel = new JLabel("Performance Index:");
        performanceIndexTxt = new JTextField(20);

        constraints.gridx = 2;
        constraints.gridy = 6;
        panel.add(performanceIndexLabel, constraints);

        constraints.gridx = 3;
        panel.add(performanceIndexTxt, constraints);

        addLecturerButton = new JButton("Add Lecturer");
        addLecturerButton.addActionListener(new ActionListener()
         {       
            public void actionPerformed(ActionEvent e)
             {
                try {
                      int teacherId = Integer.parseInt(teacherIdTxt.getText());
                       //  To find if there is already existing Teacher id
                        boolean teacherFound = false;
                      for (Teacher teacher : teacherList) {
                       if (teacherId == teacher.getteacherId()) {
                       teacherFound = true;
                        break;
                             }
                                }
                                      if (teacherFound == false) {
                         
                            String teacherName = teacherNameTxt.getText();
                            String address = addressTxt.getText();
                            String workingType = workingTypeTxt.getText();
                            String employmentStatus = employmentStatusTxt.getText();
                            int workingHours = Integer.parseInt(workingHoursTxt.getText());
                            String department = departmentTxt.getText();                       
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());
                       
                       
                      // Creating a new Lecturer object
                        Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,workingHours,
                               department,yearsOfExperience);
                        teacherList.add(lecturer);

                        JOptionPane.showMessageDialog(frame, "Lecturer added successfully with teacher ID " + teacherId + ".");
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Teacher with teacher ID: " + teacherId + " already exists.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "It look like you didnt enter a proper number or field all the required fileds. Please enter Proper Number.");
                }
            }
        });
       
   // Creating a JButton for adding a tutor
   
             addTutorButton = new JButton("Add Tutor");
             addTutorButton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
               try {
                      int teacherId = Integer.parseInt(teacherIdTxt.getText());
                       //  To find if there is already existing Teacher id
                        boolean teacherFound = false;
                          for (Teacher teacher : teacherList) {
                          if (teacherId == teacher.getteacherId()) {
                          teacherFound = true;
                           break;
                         }
                    }
                      if (teacherFound == false) {
                           // Extracting details from text fields
                        String teacherName = teacherNameTxt.getText();
                        String address = addressTxt.getText();
                        String workingType = workingTypeTxt.getText();
                        String employmentStatus = employmentStatusTxt.getText();
                        int workingHours = Integer.parseInt(workingHoursTxt.getText());
                         double salary = Double.parseDouble(salaryTxt.getText());
                        String specialization = specializationTxt.getText();
                        String academicQualifications = academicQualificationsTxt.getText();
                        int performanceIndex = Integer.parseInt(performanceIndexTxt.getText());
                       
                        // Creating a new Tutor object
                       
                        Tutor Tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus,
                               workingHours, salary, specialization, academicQualifications, performanceIndex);
                        // Adding the new Tutor to the list
                        teacherList.add(Tutor);
                      // Displaying success message
                        JOptionPane.showMessageDialog(frame, "Tutor added successfully with teacher ID " + teacherId + ".");
                    } else {
                        //Display error message if the teacher id exists already
                        JOptionPane.showMessageDialog(frame,
                                "Teacher with teacher ID: " + teacherId + " already exists.");
                    }

                 } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "It look like you didnt enter a proper number. Please enter Proper Number.");
                }
            }
        });
       
        
        gradeAssignmentButton = new JButton("Add Grade Assignments");
        gradeAssignmentButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
            int teacherId = Integer.parseInt(teacherIdTxt.getText());
            boolean teacherFound = false;
            for (Teacher teacher : teacherList) {
                if (teacherId == teacher.getteacherId()) {
                    teacherFound = true;
                    if (teacher instanceof Lecturer) {
                        Lecturer lecturer = (Lecturer) teacher;
                        try {
                            int gradedScore = Integer.parseInt(gradedScoreTxt.getText());
                            String department = departmentTxt.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());

                            JOptionPane.showMessageDialog(frame,
                                    "Teacher ID: " + teacherId + "\nGraded Score: " + gradedScore + "\nDepartment: "
                                            + department + "\nYears of experience: " + yearsOfExperience);

                            lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                        } catch (NumberFormatException e2) {
                            JOptionPane.showMessageDialog(frame, "It look like you didnt enter a proper number. Please enter Proper Number.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Teacher with teacher ID: " + teacherId + " was found but is not a Lecturer.");
                    }
                }
            }

            if (teacherFound == false) {
                JOptionPane.showMessageDialog(frame, "Lecturer not found.");
            }
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame,
                    "looks  like there's a problem with the numbers!\nPlease ensure all fields are filled correctly with valid numbers.");
        }
     }
   });


     setSalaryButton = new JButton("Set Salary");
     setSalaryButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            int teacherId = Integer.parseInt(teacherIdTxt.getText());

            boolean teacherFound = false;
            boolean isTutor = false; // Flag variable to track if the teacher is a Tutor
           
            for (Teacher teacher : teacherList) {
                if (teacherId == teacher.getteacherId()) {
                    teacherFound = true;
                    if (teacher instanceof Tutor) {
                        isTutor = true;
                        Tutor tutor = (Tutor) teacher;
                        try {
                            double newSalary = Double.parseDouble(salaryTxt.getText());
                            int newPerformanceIndex = Integer.parseInt(performanceIndexTxt.getText());

                            JOptionPane.showMessageDialog(frame, "\nNew Salary: " + newSalary
                                    + "\nNew Performance Index: " + newPerformanceIndex);

                            tutor.setSalary(newSalary, newPerformanceIndex);
                        } catch (NumberFormatException e2) {
                            JOptionPane.showMessageDialog(frame, "Invalid input for salary or performance index.");
                        }
                    }
                }
            }

            if (!teacherFound) {
                JOptionPane.showMessageDialog(frame, "Sorry, tutor not found.");
            } else if (!isTutor) {
                JOptionPane.showMessageDialog(frame, "The Teacher with teacher ID: " + teacherId + " is not a Tutor.");
            }
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame,
                    "Oops, there seems to be a problem with the number format!\nMake sure all fields are filled correctly.");
        }
    }
});


        removeTutorButton = new JButton("Remove Tutor");
        removeTutorButton.addActionListener(new ActionListener()
        {
         
    public void actionPerformed(ActionEvent e) {
        try {
            int teacherId = Integer.parseInt(teacherIdTxt.getText());

            boolean tutorRemoved = false;
            for (Teacher teacher : teacherList) {
                if (teacherId == teacher.getteacherId() && teacher instanceof Tutor) {
                    Tutor tutor = (Tutor) teacher;
                    tutor.removeTutor();
                    teacherList.remove(teacher); // Remove the tutor from the list
                    JOptionPane.showMessageDialog(frame, "Tutor removed successfully.");
                    tutorRemoved = true;
                    break; // Exit the loop once the tutor is found and removed
                }
            }

            if (!tutorRemoved) {
                JOptionPane.showMessageDialog(frame, "Tutor not found or not of correct type.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame,
                    "Error: Invalid input detected. Please ensure all fields are properly filled and the Teacher ID is a valid number.");
        }
    }
});

        displayButton = new JButton("Display");
        displayButton.addActionListener(new ActionListener()
       {
   
         public void actionPerformed(ActionEvent e)
            {
                try {
                    int teacherId = Integer.parseInt(teacherIdTxt.getText());

                    boolean teacherFound = false;
                    for (Teacher teacher : teacherList) {
                        if (teacherId == teacher.getteacherId()) {
                            teacherFound = true;
                               String displayInfo = teacher.display();
                    JOptionPane.showMessageDialog(frame, displayInfo);
                        }
                    }
                            if (!teacherFound) {
                        JOptionPane.showMessageDialog(frame, "The teacher with ID " + teacherId + " was not found.");
                    }
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(frame,
                            " looks like there's an issue with the input.\nPlease ensure all fields are properly filled.");
                }
            }
        });
   clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener()
{
            public void actionPerformed(ActionEvent e)
            {
                teacherIdTxt.setText("");
                teacherNameTxt.setText("");
                addressTxt.setText("");
                workingTypeTxt.setText("");
                employmentStatusTxt.setText("");
                workingHoursTxt.setText("");
                departmentTxt.setText("");
                yearsOfExperienceTxt.setText("");
                gradedScoreTxt.setText("");
                salaryTxt.setText("");
                specializationTxt.setText("");
                academicQualificationsTxt.setText("");
                performanceIndexTxt.setText("");
            }
        });

       
       
        constraints.gridx = 0;
        constraints.gridy = 7;
        panel.add(addLecturerButton, constraints);

       
        constraints.gridx = 1;
        constraints.gridy = 7;
        panel.add(addTutorButton, constraints);

       
        constraints.gridx = 2;
        constraints.gridy = 7;
        panel.add(gradeAssignmentButton, constraints);

       
        constraints.gridx = 3;
        constraints.gridy = 7;
        panel.add(setSalaryButton, constraints);

       
        constraints.gridx = 0;
        constraints.gridy = 8;
        panel.add(removeTutorButton, constraints);

       
        constraints.gridx = 1;
        constraints.gridy = 8;
        panel.add(displayButton, constraints);

       
        constraints.gridx = 2;
        constraints.gridy = 8;
        panel.add(clearButton, constraints);
        
        JComboBox<String> comboBox = new JComboBox<>(new String[]{
                "-> Teacher ID",
                 "->Teacher- Teacher ID,Teacher Name, Address,Working Hours, Working Type, Years of Experience",
                "-> Lecturer- Teacher ID, Teacher Name, Address, Working Type, Employment Status, Department, Years of Experience, Working Hours",
                
                "-> Tutor- Teacher ID, Teacher Name, Address, Working Type, Employment Status, Working Hours, Salary, Specialization, Academic Qualifications, Performance Index",
                "-> Teacher ID",
                "-> Teacher ID, Salary, Performance Index",
                "-> None"
        });
       constraints.gridx = 0; // Adjust the column position
       constraints.gridy = 10; // Adjust the row position
       constraints.gridwidth = 5;
        panel.add(comboBox, constraints);
         
        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
       
        // Styling
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add padding
       panel.setBackground(new Color(173, 216, 230)); // Set background color
       
       
}
// Main method to start the GUI
public static void main(String[] args) {
        new TeacherGUI();
    }
}