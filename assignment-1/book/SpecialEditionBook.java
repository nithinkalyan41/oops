package book;

public class SpecialEditionBook extends Book{
        private float discount;
        public SpecialEditionBook(){
            System.out.println("Enter discount for the Book");
            discount = validPrice();
        }

    @Override
    public void display() {
            super.display();
        System.out.println("Discount price "+discount);
    }
}
