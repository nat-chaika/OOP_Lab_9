package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PayPalPayment implements Payment{
    private final String name;
    private final String description;

    public PayPalPayment() {
        name = "PayPal";
        description = "PayPal Payment";

    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid with payment");
    }
}
