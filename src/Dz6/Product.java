package Dz6;
import java.time.LocalDateTime;

public abstract class Product {
    protected String brand;
    protected String model;
    protected LocalDateTime creationDate;
    protected int ramMemory;
    protected int diskCapacity;
    protected String typeOfSystem;

    public Product(String brand, String model, LocalDateTime creationDate, int ramMemory, int diskCapacity, String typeOfSystem) {
        this.brand = brand;
        this.model = model;
        this.creationDate = creationDate;
        this.ramMemory = ramMemory;
        this.diskCapacity = diskCapacity;
        this.typeOfSystem = typeOfSystem;
    }
    public String getOs() {
        return typeOfSystem;
    }
    public int getRam() {
        return ramMemory;
    }
    public int getDiskCap() {
        return diskCapacity;
    }

    public String getProductType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        String vd = "";
        if (getProductType().equals("Laptops"))
            vd = "Видеокарта : " + Laptops.graphicsCard;
        if (getProductType().equals("Phones"))
            vd = "Поддержка 5G : " + Phones.fiveG;
        return "Тип изделия : " + getProductType() + "; " +
                "Производитель : " + brand + "; " +
                "Модель : " + model + "; " +
                "Дата выпуска : " + creationDate + "; " +
                "Объем оперативной памяти : " + ramMemory + "GB; " +
                "Объем носителя : " + diskCapacity + "GB; " +
                "Тип системы : " + typeOfSystem + "; "+ vd + "]";
    }
}


