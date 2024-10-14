package Dz6;

import java.time.LocalDateTime;

public class Phones extends Product{
    public static boolean fiveG;

    public Phones(String brand, String model, LocalDateTime creationDate, int ramMemory, int diskCapacity, boolean fiveG, String typeOfSystem) {
        super(brand, model, creationDate, ramMemory, diskCapacity, typeOfSystem);
        this.fiveG = fiveG;
    }
}
