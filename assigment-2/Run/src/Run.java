import java.util.Scanner;

public class Run {
    private String nameOfRunner;
    private float distanceCovered;
    private static float maxDistance = 0;
    private static String runner;
    Scanner sc = new Scanner(System.in);
    public void set(){
        System.out.println("Enter the name of the runner : ");
        nameOfRunner = validName();
        System.out.println("Enter distance covered by the runner :");
        distanceCovered = validNum();
        if(distanceCovered > maxDistance){
            runner = nameOfRunner;
        }
    }
    public static void display(){
        System.out.println("The highest distance covered by : "+runner);
    }

    private float validNum() {
        float d;
        while(true){
            try{
                d = sc.nextFloat();
                break;
            }catch(Exception e){
                System.out.println("Enter numerical values only :");
                sc.next();
            }
        }
        return d;
    }

    private String validName() {
        String n = null;

        while (true){
                int c = 0;
                n = sc.next();
                n = n.toLowerCase();
                for(int i=0;i<n.length();i++){
                    int temp = n.charAt(i);
                    if(temp < 97 || temp > 122){
                        c++; break;
                    }
                }
            if(c==0){
                break;
            }
            else{
                System.out.println("Enter alphabets only : ");
            }
        }
        return n;
    }
}
