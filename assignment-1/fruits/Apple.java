package fruits;

import java.util.Scanner;

public class Apple extends Fruit{
    private int costOfApple;
    Scanner sc = new Scanner(System.in);
    @Override
    protected void cost() {
        System.out.println("Enter cost of an Apple");
        costOfApple = validCost();
        display();
    }
    public int validCost(){
        boolean truth = true;
        int cost = 0;
        while(truth){
            try {
                cost = sc.nextInt();
                truth = false;
            }catch(Exception e){
                System.out.println("Please Enter numerical values only");
                sc.next();
            }

        }
        return cost;
    }

    public void display(){
        System.out.println("The cost of an apple is:"+costOfApple);
    }
}
