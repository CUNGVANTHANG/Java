public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber,
            Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return String.format(
                "Car:\n"
                        + "\tBrand: %s\n"
                        + "\tModel: %s\n"
                        + "\tRegistration Number: %s\n"
                        + "\tNumber of Doors: %d\n"
                        + "\tBelongs to %s - %s",
                this.getBrand(), this.getModel(), this.getRegistrationNumber(),
                this.getNumberOfDoors(),
                this.owner.getName(), this.owner.getAddress());
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
