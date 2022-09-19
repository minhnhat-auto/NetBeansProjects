package assignment1;

import java.util.Arrays;

/**
 *
 * @author Minh Nhat Vo - 101224717
 */
public class Student {

   

    private int StudentID;
    private String stdFirstName;
    private String stdLastName;
    private double[] stdMarks;
    private Address stdAddress;
    

    public Student(int StudentID, String stdFirstName, String stdLastName, double[] stdMarks, Address stdAddress) {
        this.StudentID = StudentID;
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
        this.stdMarks = stdMarks;
        this.stdAddress = stdAddress;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        this.stdLastName = stdLastName;
    }

    public double[] getStdMarks() {
        return stdMarks;
    }

    public void setStdMarks(double[] stdMarks) {
        this.stdMarks = stdMarks;
    }
    
    public Address getStdAddress(){
        return stdAddress;
    }
    public void setStdAddress(Address stdAddress){
        this.stdAddress = stdAddress;
    }
    
    public double Average(){
        double sum = 0;
        for (double stdMark : stdMarks){
            
            sum += stdMark;
            
        }
        double avg = sum/stdMarks.length;
        double rnNum = Math.round(avg*100.0)/100.0;
        return rnNum;
    }
    
    
    @Override
    public String toString(){
        
        return    "-------------- STUDENT INFORMATION -------------"
                + "\nID STUDENT: " + StudentID + "\n"
                + "FIRST STUDENT NAME: " + stdFirstName + "\n"
                + "LAST STUDENT NAME: " + stdLastName + "\n"
                + "STUDENT MARKS: " + Arrays.toString(stdMarks)+ "\n"
                + "THE AVERAGE MARKS: " + Average() + "\n" + stdAddress
                ;
    } 

   
     
           
}
