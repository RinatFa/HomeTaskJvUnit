package main.java.org._811286.Calculator;

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double amountPurchaseDiscount = 0;
        if (purchaseAmount >= 0 & discountAmount >= 0 & discountAmount <= 100) {
            amountPurchaseDiscount = purchaseAmount - purchaseAmount * discountAmount / 100;
        } else {
            throw new ArithmeticException("The discount amount is not possible");
        }
        return amountPurchaseDiscount;
    }
}
