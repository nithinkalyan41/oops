import java.util.Scanner;

public class Marks {
    private int english;
    private int maths;
    private int science;

    Scanner sc = new Scanner(System.in);

    public Marks(){
        english = 0;
        maths = 0;
        science = 0;
    }

    public void in(){
        System.out.println("Enter marks for english : ");
        english = validInput();
        System.out.println("Enter marks for maths : ");
        maths = validInput();
        System.out.println("Enter marks for science : ");
        science = validInput();
    }

    private int validInput() {
        int marks;
        while(true){
            try{
                marks = sc.nextInt();
                if(marks>=0 && marks<=100){
                    break;
                }
                System.out.println("Enter valid numbers : ");
            }catch(Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }
        }
       return marks;
    }

    public int sum(){
        return english+science+maths;
    }
    public int average(){
       return (english+science+maths)/3;
    }

}
