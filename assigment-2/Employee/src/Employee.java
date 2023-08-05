import java.util.Scanner;

public class Employee {
    private int employeeNumber;
    private float employeeCompensationRupees;
    Scanner sc = new Scanner(System.in);
    public void intializeValues(){
        System.out.println("Enter the employee number : ");
        employeeNumber = validNum();
        System.out.println("Enter employee compensation in rupees ₹ :");
        employeeCompensationRupees = validNo();
    }
    public void display(){
        System.out.println(this);
    }

    private int validNum() {
        int num ;
        while(true){
            try{
                num = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Enter numerial values only : ");
                sc.next();
            }
        }
        return num;
    }
    private float validNo() {
        float num ;
        while(true){
            try{
                num = sc.nextFloat();
                break;
            }catch(Exception e){
                System.out.println("Enter numerial values only : ");
                sc.next();
            }
        }
        return num;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "employeeNumber=" + employeeNumber +
                ", employeeCompensationRupees=" + employeeCompensationRupees +
                ']';
    }
}
