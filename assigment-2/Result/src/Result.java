import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Result {
    private int rollno;
    private String name;
    private int marks[] = new int[3];

    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Enter rollno of student : ");
        rollno = validNum();
        System.out.println("Enter name of student : ");
        name = validName();
        int j=0;
        for(int i=1;i<=3;i++){
            System.out.println("Enter marks of subject "+ i +" : ");
            marks[j] = validmarks();
            j++;
        }
    }

    public void show(){
        System.out.println(this);
    }
    public int total(){
        int sum = Arrays.stream(marks).sum();
        return sum;
    }
    public int average(){
        int avg = (Arrays.stream(marks).sum())/3;
        return avg;
    }
    //HELPER METHODS
    private int validNum() {
        int num;
        while (true){
            try{
                num = sc.nextInt();
                if(num >0){
                    break;
                }
                System.out.println("Enter valid numbers : ");
            }catch (Exception e){
                System.out.println("Enter numerical values only : ");
                sc.next();
            }
        }
        return num;
    }
    private String validName() {
        String s = null;
        boolean truth = true;
        while (truth){
            s = sc.next();
            s = s.toLowerCase();
            for(int i=0;i<s.length();i++){
                int temp = s.charAt(i);
                if(temp >= 97 && temp <=122){
                    truth = true;

                }
                else{
                    truth = false;
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
    private int validmarks() {
        int marks;
        while (true){
            try{
                marks = sc.nextInt();
                if(marks > 0 && marks <= 100){
                    break;
                }
                System.out.println("Enter valid marks :");
            }catch(Exception e){
                System.out.println("Enter numerical values only : ");
                sc.next();
            }
        }
        return marks;
    }

    @Override
    public String toString() {
        return "Result[" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ']';
    }
}
