public class Tollbooth {
     private long totalNumberOfCars;
     private int totalAmount;
    public Tollbooth(){
        totalNumberOfCars =0;
        totalAmount = 0;
    }
    public void payingCar(){
        totalNumberOfCars++;
        System.out.println("car added sucessfully.");
        totalAmount+=50;
        System.out.println("Car paid amount rupees : "+50);
    }
    public void noPayingCar(){
        totalNumberOfCars++;
        System.out.println("car added sucessfully but nothing paid.");
    }
    public void display(){
        System.out.println("The total number of cars : "+totalNumberOfCars);
        System.out.println("The total amount collected : "+totalAmount);
    }

}
