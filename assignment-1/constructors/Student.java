package constructors;

import java.util.Scanner;

public class Student {
    private int rollno;
    private String name;
    private int mark1;
    private int mark2;
    private  int mark3;
    private int totalmarks;
    Scanner sc = new Scanner(System.in);
    public Student() {
        System.out.println("Enter the details of the student");
        rollno = sc.nextInt();
        name = validName();
        mark1 = validMarks();
        mark2 = validMarks();
        mark3 = validMarks();
    }
    public int validMarks(){
        boolean truth = true;
        int marks = 0;
        while (truth) {
            try {
                marks = sc.nextInt();
                if (marks > 0 && marks <= 100) {
                    truth = false;
                    break;
                }
                System.out.println("Enter valid details");
            } catch (Exception e) {
                System.out.println("Enter the Numerical values");
                sc.next();
            }
        }
        return marks;
    }
    public String validName(){
        boolean truth = true;
        String s = null;
        while(truth) {
            s = sc.next();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                int temp = s.charAt(i);
                if (temp >= 97 && temp <= 122) {
                    truth = true;
                }
                else{
                    truth=false;
                    break;
                }
            }
            if(!truth){
                System.out.println("Enter alphabets only");
                truth = true;
            }
            else{
                truth=false;
            }
        }
        return s;
    }
    public void calculateTotal(){
        totalmarks = mark1+mark2+mark3;
    }
    public void displayStudent(){
        calculateTotal();
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Student.Student[" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", mark3=" + mark3 +
                ",totalmarks="+totalmarks+
                ']';
    }
}
