public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.get();
        Book book2 = new Book();
        book2.set(11035,99,120.99f);
        if(book1.getPrice() > book2.getPrice()){
            book1.show();
        }
        else{
            book2.show();
        }
    }
}