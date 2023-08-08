import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    static int uniqueId;
    private int rollNo;
    private String name;
    private int marks[] = new int[5];
    Scanner sc = new Scanner(System.in);
    public Student(){
        uniqueId++;
        rollNo = uniqueId;
        name = null;
    }
    public void input(){
        System.out.println("Enter name of the Student :");
        while(true){
            name = sc.next();
            String temp = name.replaceAll("\\s","");;
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(temp);
            if(matcher.find()){
                break;
            }
            else{
                System.out.println("Enter alphabets only :");
            }
        }
        int j=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter marks for subject "+i+" :");
            marks[j]= Entermarks();
            j++;
        }
    }
    public void show(){
        System.out.println(this);
    }
    public static int totalStudents(){
        return uniqueId;
    }
    public int totalMarks(){
        int total = Arrays.stream(marks).sum();
        return total;
    }
    public int getHighest(){
        OptionalInt max = Arrays.stream(marks).max();
        return max.getAsInt();
    }
    public int getLowest(){
        OptionalInt min = Arrays.stream(marks).min();
        return min.getAsInt();
    }
    public double getAverage(){
        OptionalDouble avg = Arrays.stream(marks).average();
        return avg.getAsDouble();
    }
    public int getPassCount(){
        int c = (int) Arrays.stream(marks)
                .filter(i -> i > 50)
                .count();
        return c;
    }

    private int Entermarks() {
        int n;
        while(true){
            try{
                n = sc.nextInt();
                if(n >= 0 && n <=100){
                    break;
                }
                else{
                    System.out.println("Enter valid marks :");
                }
            }catch(Exception e){
                System.out.println("Enter numerical values only :");
                sc.next();
            }
        }
        return n;
    }

    @Override
    public String toString() {
        return "Student[" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ']';
    }
}
