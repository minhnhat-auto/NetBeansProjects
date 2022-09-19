
package assignment1;

/**
 *
 * @author Minh Nhat Vo - 101224717
 */
public class GraduateStudent extends Student{
    private String subject;
    private int yearOfEntry;
    private String thesisTopic;

    public GraduateStudent(int StudentID, String stdFirstName, String stdLastName, double[] stdMarks, Address stdAddress,
            String subject, int yearOfEntry, String thesisTopic){
        super(StudentID, stdFirstName, stdLastName, stdMarks, stdAddress);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
        this.thesisTopic = thesisTopic;
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

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
    
    public boolean Graduate(double Average){
        return (Average > 70);
    }
    
}
