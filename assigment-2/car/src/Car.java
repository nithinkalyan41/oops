import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private String name;
    private Direction direction;
    private int position;
   static Scanner sc = new Scanner(System.in);
    public Car(){
            name = setValidname();
            direction = setValidDirection();
            position = setValidPosition();
    }
    public void turn(){
        System.out.println("Enter direction option to Turn Right :");
        int n ;
        while (true){
            System.out.println("1.North\n2.East\n3.West\n4.South");
            try{
                n = sc.nextInt();
                if (n < 1 || n > 4) {
                    System.out.println("Enter valid numbers  :");
                } else {
                    switch (n) {
                        case 1:
                            direction = Direction.E;
                            break;
                        case 2:
                            direction = Direction.N;
                            break;
                        case 3:
                            direction = Direction.S;
                            break;
                        case 4:
                            direction = Direction.W;
                            break;
                    }
                    break;
                }
            }catch(Exception e){
                System.out.println("Enter numerical values only :");
                sc.next();
            }
        }
    }
    public void turn(int n){
        System.out.println("1.North\n2.East\n3.West\n4.South");
        if (n < 1 || n > 4) {
            System.out.println("Enter valid numbers :");
        } else {
            switch (n) {
                case 1:
                    direction = Direction.N;
                    break;
                case 2:
                    direction = Direction.E;
                    break;
                case 3:
                    direction = Direction.W;
                    break;
                case 4:
                    direction = Direction.S;
                    break;
            }
        }
    }
    public void move(int n){
        position = n;
    }
    public void show(){
        System.out.println(this);
    }

    private String setValidname() {
        System.out.println("Enter name of the car :");
        String s = null;
        while(true){
            s = sc.next();
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");
            Matcher matcher = pattern.matcher(s);
            if(matcher.matches()){
                break;
            }else{
                System.out.println("Enter valid name :");
            }
        }
        return s;
    }
    private Direction setValidDirection(){
        System.out.println("Enter direction of car :");
         int d;
         Direction temp = null;
        while(true) {
            try {
                System.out.println("1.North\n2.East\n3.West\n4.South");
                d = sc.nextInt();
                if (d < 1 || d > 4) {
                    System.out.println("Enter valid numbers  :");
                } else {
                    switch (d) {
                        case 1:
                            temp = Direction.N;
                            break;
                        case 2:
                            temp = Direction.E;
                            break;
                        case 3:
                            temp = Direction.W;
                            break;
                        case 4:
                            temp = Direction.S;
                            break;
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter alphabets only :");
                sc.next();
            }
        }
        return temp;
    }
    private int setValidPosition() {
        System.out.println("Enter position of car :");
        int n;
        while(true){
            try{
                n = sc.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Enter numerical values only : ");
                sc.next();
            }
        }
        return n;
    }


    enum Direction{
        N,
        E,
        W,
        S
    }

    @Override
    public String toString() {
        return "Car[" +
                "name='" + name + '\'' +
                ", direction=" + direction +
                ", position=" + position +
                ']';
    }
}
