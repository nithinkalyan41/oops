public class Counter {
    private static int count;
    private int assignNumber;
    public Counter(){
        count++;
        assignNumber = count;
    }
    public void display(){
        System.out.println("I am object number "+assignNumber);
    }
}
