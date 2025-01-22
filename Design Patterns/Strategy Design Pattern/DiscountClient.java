public class DiscountClient {
    public static void main(String args[]){
        DiscountContext discountContext= new DiscountContext(new PercentageDiscount());

        discountContext.calculateDiscount(100);

        discountContext.setStrategy(new CouponDiscount());

        discountContext.calculateDiscount(100);

        discountContext.setStrategy(new FixedDiscount());

        discountContext.calculateDiscount(100);
    }
}
