public class Main {
    public static void main(String[] args) {
       Time t1 = new Time(12,45,2);
       Time t2 = new Time(1,80,365);
       Time t3 = Time.add(t1,t2);
       t3.adjustTime();
       t3.display();
    }
}