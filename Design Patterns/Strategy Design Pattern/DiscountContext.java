public class DiscountContext {
    private DiscountStrategy discountStrategy;

    //Parameterized constructor to initialize Context with strategy
    DiscountContext(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }

    public void setStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }

    public void calculateDiscount(int amount){
        discountStrategy.getDiscount(amount);
    }
}
