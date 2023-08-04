import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Array {
    private int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    public void fill(){
        int j=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter value for element "+i+" : ");
            a[j] = validNum();
            j++;
        }
    }
    public void display(){
        System.out.println(this);
    }
    public void max(){
        OptionalInt maxx = Arrays.stream(a).max();
        System.out.println("The maximum element is : "+maxx.getAsInt());
    }
    public void min(){
        OptionalInt minn = Arrays.stream(a).min();
        System.out.println("The minimum element is : "+minn.getAsInt());
    }
    //HELPER
    private int validNum() {
        int n ;
        while(true){
            try{
                n = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Enter Numerical values only : ");
            }
        }
        return n;
    }

    @Override
    public String toString() {
        return "Array{" +
                "a=" + Arrays.toString(a) +
                '}';
    }
}
