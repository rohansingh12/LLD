public class PercentageDiscount implements DiscountStrategy {
    
    @Override
    public void getDiscount(int amount){
        System.out.println("Inside Percentage Discount Class");
        double result = amount*0.8;
        System.out.println("Price after discount: "+result);
    }
}
