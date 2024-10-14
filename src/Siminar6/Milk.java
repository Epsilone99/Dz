package Siminar6;

import Siminar6.Good;

import java.time.LocalDateTime;

public class Milk extends Good {

    public static String color;

    public Milk(
            double price,
            String vendorCode,
            LocalDateTime creationDate,
            int guarantee,
            String color
    ) {
        super(price, vendorCode, creationDate, guarantee);
        this.color = color;
    }

    @Override
    public String getGoodType() {
        return getClass().getSimpleName();
    }
}
