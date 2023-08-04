package customer;

import java.util.Scanner;

import static javax.lang.model.SourceVersion.isName;

public class Customer {
    private  int custId;
    private String custName;
    private String custAddress;
    Scanner sc = new Scanner(System.in);
    public Customer(){
        System.out.println("Enter the details of the customer");
        custId = validId();
        custName = validName();
        System.out.println("Enter Address of Customer:");
        custAddress = sc.next();
    }

    private int validId() {
        System.out.println("Enter Id for customer:");
        boolean truth = true;
        int id =0;
        while(truth){
            try{
                id = sc.nextInt();
                truth=false;
            }catch(Exception e){
                System.out.println("Enter numerical values only.");
                sc.next();
            }
        }
        return id;
    }

    private String validName() {
        System.out.println("Enter alphabets only for customer name:");
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
                System.out.println("Enter alphabets only for customer name:");
                truth = true;
            }
            else{
                truth=false;
            }
        }

        return s;

    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }
}
