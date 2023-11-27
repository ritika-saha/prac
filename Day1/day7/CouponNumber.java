//package day7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumber {
    public static void main(String[] args) {
        Set<Integer> coupons = new HashSet<>();
        int totalCoupons = 10; 
        int randomCount = generateCoupons(coupons, totalCoupons);
        System.out.println("Total random numbers needed to have all distinct coupons: " + randomCount);
    }

    private static int generateCoupons(Set<Integer> coupons, int totalCoupons) {
        Random random = new Random();
        int count = 0;
        while (coupons.size() < totalCoupons) {
            int randomCoupon = random.nextInt(totalCoupons) + 1;
            coupons.add(randomCoupon);
            count++;
        }
        return count;
    }
}
