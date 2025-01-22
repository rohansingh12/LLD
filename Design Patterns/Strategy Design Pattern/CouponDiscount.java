public class CouponDiscount implements DiscountStrategy {

    @Override
    public void getDiscount(int amount){
        System.out.println("Inside Coupon Class");
        double result= amount/2;
        System.out.println("Price after discount: "+result);
    }
}
