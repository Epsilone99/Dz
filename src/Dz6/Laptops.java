package Dz6;

import java.time.LocalDateTime;

public class Laptops extends Product{
    public static String graphicsCard;

    public Laptops(String brand, String model, LocalDateTime creationDate, int ramMemory, int diskCapacity, String graphicsCard, String typeOfSystem) {
        super(brand, model, creationDate, ramMemory, diskCapacity, typeOfSystem);
        Laptops.graphicsCard = graphicsCard;
    }
}
