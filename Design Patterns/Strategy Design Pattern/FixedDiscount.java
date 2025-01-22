public class FixedDiscount implements DiscountStrategy {

    @Override
    public void getDiscount(int amount){
        System.out.println("Inside Fixed Discount class");
        double result= amount-50;
        System.out.println("Price after discount : "+result);
    }
}
