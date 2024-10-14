package Siminar6;

import Siminar6.Good;

import java.time.LocalDateTime;

public class Water extends Good {
    public boolean isSparkling;

    public Water(double price, String vendorCode, LocalDateTime creationDate, int guarantee, boolean isSparkling) {
        super(price, vendorCode, creationDate, guarantee);
        this.isSparkling = isSparkling;
    }


}
