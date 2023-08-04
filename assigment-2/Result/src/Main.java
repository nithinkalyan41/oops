// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.input();
        System.out.println("The total marks are : "+r.total());
        System.out.println("The average marks are : "+r.average());
        r.show();
    }
}