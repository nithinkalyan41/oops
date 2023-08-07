import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Tollbooth tollbooth = new Tollbooth();
            Scanner sc = new Scanner(System.in);
            int choice;
            while(true) {
                while(true){
                    System.out.println("TollBooth menu : \n1.Paying car\n2.No paying car\n3.Display\n4.exit");
                    try{
                        choice = sc.nextInt();
                        if(choice >0 && choice <5){
                            break;
                        }
                        else{
                            System.out.println("Enter valid choices :");
                        }
                    }catch(Exception e){
                        System.out.println("Enter numerical numbers :");
                        sc.next();
                    }
                }
                switch (choice) {
                    case 1:
                        tollbooth.payingCar();
                        break;
                    case 2:
                        tollbooth.noPayingCar();
                        break;
                    case 3:
                        tollbooth.display();
                        break;
                    case 4:
                        System.out.println("Exited sucessfully.");
                        return;
                }
            }
    }
}
  /*  Imagine a tollbooth at a bridge. Cars passing by the booth are expected to pay 50 rupees toll.
        Mostly they do, but sometimes a car goes by without paying. The tollbooth keeps track of the
        number of cars they have gone by, and of total amount of money collected.
        Model this tollbooth with a class called tollbooth. The two data items are a type unsigned int to
        hold the total number of cars and a type int to hold the total amount of money collected. A
        constructor initializes both of these to zero. A member function called payingCar() increments
        the car total and adds 50 to the cash total. Another function called noPayCar() increments the
        car total but adds nothing to the cash total. Finally, a member function called display() displays
        the two totals. Make appropriate member function const.
        In main function, create an object of this class. The program should display a proper menu to
        the user and perform the appropriate function according to the user choice. The menu should
        be continuously displayed to the user again and again until user gives proper choice to exit the
        program*/