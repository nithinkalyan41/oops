package fruits;

import java.util.Scanner;

public class Mango extends Fruit{
    private int costOfMango;
    Scanner sc = new Scanner(System.in);
    @Override
    protected void cost(){
        System.out.println("Enter the cost of Mango");
        costOfMango = validCost();
        display();
    }
    public void display() {
        System.out.println("The cost of mango is:"+costOfMango);
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
}
