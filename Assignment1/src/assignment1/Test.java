package assignment1;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.text.html.HTML;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Minh Nhat Vo - 101224717
 */
//public class Assignment1 {
/**
 * @param args the command line arguments
 */
//    public static void myFunc(Scanner input, Student[] stdList, int choiceentry, int count) {
//
//        System.out.print("Enter STUDENT ID: ");
//        int iD = input.nextInt();
//
//        System.out.print("Enter FIRST NAME Of STUDENT: ");
//        String fN = input.next();
//
//        System.out.print("Enter LAST NAME Of STUDENT: ");
//        String lN = input.next();
//
//        System.out.print("Enter The STUDENT MARKS: ");
//        String[] mkStr = input.next().split(",");
//        double[] mkArray = Arrays.stream(mkStr).mapToDouble(Double::parseDouble).toArray();
//
//        System.out.print("Enter STREET NAME: ");
//        String strName = input.next();
//
//        input.nextLine();
//
//        System.out.print("Enter CITY: ");
//        String cityName = input.next();
//
//        System.out.print("Enter POSTAL CODE: ");
//        String postalNum = input.next();
//
//        input.nextLine();
//
//        System.out.print("Enter PROVINCE: ");
//        String proName = input.next();
//
//        System.out.print("Enter COUNTRY: ");
//        String couName = input.next();
//
//        System.out.println("Enter The STUDENT SUBJECT: ");
//        String subName = input.next();
//
//        System.out.println("YEAR OF ENTRY: ");
//        int year = input.nextInt();
//
//        Address stdHome = new Address(strName, cityName, postalNum, proName, couName);
//
//        if (choiceentry == 1) {
//            UndergraduateStudent Understd = new UndergraduateStudent(iD, fN, lN, mkArray, stdHome, subName, year);
//            if (count < 10){
//                stdList[count] = Understd;
//                
//            }else{
//                System.out.println("List is full");
//            }
//        } else if (choiceentry == 2) {
//            System.out.println("THESISTOPIC: ");
//            String topic = input.next();
//            
//            GraduateStudent Grastd = new GraduateStudent(iD, fN, lN, mkArray, stdHome, subName, year, topic);
//            
//            if (count < 10){
//                stdList[count] = Grastd;
//                
//            }else{
//                System.out.println("List is full");
//            }
//        }
//
//    }
public class Test {

    public static void increase(int[] x) {
        for (int i = 0; i < x.length;i++)
            x[i]++;
    }

    public static void increase(int y) {
        y++;
    }

    public static void main(String[] args) {

//        System.out.println("Enter one of the following commands:");
//        System.out.println("1. ADD UNDERGRADUATE STUDENT");
//        System.out.println("2. ADD GRADUATE STUDENT");
//        System.out.println("3. VIEW ALL THE STUDENTS");
//        System.out.println("4. VIEW Only ELIGIBLE STUDENTS For GRADUATION");
//        System.out.println("5. EXIT");
//        System.out.println();
//
//        Scanner input = new Scanner(System.in);
//        int choiceentry;
//        System.out.println("Enter \"1\", \"2\", \"3\", \"4\" or \"5\"");
//        choiceentry = input.nextInt();
//        
//        Student[] stdList = new Student[10];
//        int count = 0;
//        do{
//        if(choiceentry == 1){
//            myFunc(input, stdList, choiceentry, count);
//            count += 1;
//            
//        }else if(choiceentry == 2){
//            myFunc(input, stdList, choiceentry, count);
//            count += 1;
//        }else if(choiceentry == 3){
//            System.out.println(count);
//            for (int i = 0; i <count; i++){
//                System.out.println(stdList[i].toString());
//            }
//        }else if(choiceentry == 4){
//            System.out.println(count);
//            for (int i = 0; i <count; i++){
//                
//                    
//                }
//                System.out.println(stdList[i].toString());
//            }
//        }else{
//            System.out.println("Thank you!");
//        }
//        System.out.println("Enter \"1\", \"2\", \"3\", \"4\" or \"5\"");
//        choiceentry = input.nextInt();
//        }
//        while(choiceentry != 5);
        int[] x = {1, 2, 3, 4, 5};
        increase(x);

        int[] y = {1, 2, 3, 4, 5};
        increase(y[0]);

        System.out.println(x[0] + " " + y[0]);

    }

}


