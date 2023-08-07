/*Write a class Car that contains the following attributes:
        The name of car
        The direction of car (E, W, N, S)
        The position of car (from imaginary zero point)
        The class has following member functions:
       ** A constructor to initialize the attributes
       ** Turn function to change the direction of car to one step right side (e.g. if the direction is
        to E, it should be changed to S and so on.)
       ** Overload the Turn function to change the direction to any side directly. It should accept
        the direction as parameter.
       **  Move function to change the position of car away from zero point. It should accept the
        distance as parameter.
       ** Show function to display all the data for a car
        In main function, create an object and make use of all functions. The program should display a
        proper menu to the user and perform the appropriate function according to the user choice.
        The menu should be continuously displayed to the user again and again until user gives proper
        choice to exit the program.*/
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.show();
        int n ;
        while(true){
            System.out.println("Car menu :");
            System.out.println("Enter your choice : \n1.TurnRight\n2.Turn\n3.Move position\n4.show\n5.exit");
            while(true) {
                try {
                    n = Car.sc.nextInt();
                    if(n < 0 || n > 6){
                        System.out.println("Enter valid option :");
                    }
                    else{
                        break;
                    }
                }catch (Exception e){
                    System.out.println("Enter numerical values only :");
                    Car.sc.next();
                }
            }
            switch (n){
                case 1:
                    car.turn();
                    break;
                case 2:
                    System.out.println("1.North\n2.East\n3.West\n4.South");
                    System.out.println("Enter direction value to Turn : ");
                    int temp;
                    while(true){
                        try{
                            temp = Car.sc.nextInt();
                            if(temp >0 && temp<5){
                                car.turn(temp);
                                break;
                            }else{
                                System.out.println("Enter valid options");
                            }
                        }catch(Exception e){
                            System.out.println("Enter numerical values only :");
                            Car.sc.next();
                        }
                    }
                    break;
                case 3:
                    int m;
                    while(true){
                        try{
                            m=Car.sc.nextInt();
                            car.move(m);
                            break;
                        }catch(Exception e){
                            System.out.println("Enter numerical values only :");
                            Car.sc.next();
                        }
                    }
                    break;
                case 4:
                    car.show();
                    break;
                case 5:
                    System.out.println("exited sucessfully");
                    return;
            }
        }
    }
}