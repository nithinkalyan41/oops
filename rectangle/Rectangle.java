package rectangle;

import java.util.Scanner;

public class Rectangle {
    private float length;
    private float breadth;
    Scanner sc = new Scanner(System.in);
    public Rectangle(){
        System.out.println("Enter the values for length and breadth");
        length = validLength();
        breadth = validBreadth();
        area();
    }

    private float validBreadth() {
        boolean truth = true;
        float b = 0;
        while(truth){
            try{
                b = sc.nextFloat();
                truth=false;
            }catch(Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }
        }
        return b;
    }

    private float validLength() {
        boolean truth = true;
        float l = 0;
        while(truth){
            try{
                l = sc.nextFloat();
                truth=false;
            }catch(Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }
        }
        return l;
    }
    public void area(){
        float area = length*breadth;
        System.out.println("The area of the rectangle is:"+area);
    }

}
