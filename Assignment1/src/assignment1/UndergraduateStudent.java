/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Minh Nhat Vo - 101224717
 */
public class UndergraduateStudent extends Student {

    private String subject;
    private int yearOfEntry;

    public UndergraduateStudent(int StudentID, String stdFirstName, String stdLastName, double[] stdMarks, Address stdAddress, String subject, int yearOfEntry) 
    {
        super(StudentID, stdFirstName, stdLastName, stdMarks ,stdAddress);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public boolean Graduate(double Average) {
        return (Average > 50);
    }
    
}
