import java.util.Scanner;

public class Book {
    private int bookId;
    private int pages;
    private float price;

    Scanner sc = new Scanner(System.in);
    public void get() {
        System.out.println("Enter bookId : ");
        bookId = validNum();
        System.out.println("Enter pages of book : ");
        pages = validNum();
        System.out.println("Enter price of the book : ");
        price = validPrice();
    }
    public void show(){
        System.out.println(this);
    }

    public void set(int bookId, int pages, float price) {
        this.bookId = bookId;
        this.pages = pages;
        this.price = price;
    }
    public float getPrice(){
        return price;
    }

    //HELPER
    private float validPrice() {
        float pric;
        while (true){
            try{
                pric = sc.nextFloat();
                break;
            }catch (Exception e){
                System.out.println("the numerical values only :");
                sc.next();
            }
        }
        return pric;
    }

    private int validNum() {
        int num;
        while (true){
            try{
                num = sc.nextInt();
                break;
            }catch (Exception e){
                System.out.println("the numerical values only :");
                sc.next();
            }
        }
        return num;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[" +
                "bookId=" + bookId +
                ", pages=" + pages +
                ", price=" + price +
                ']';
    }
}