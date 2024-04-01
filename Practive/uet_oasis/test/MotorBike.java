public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String model, String registrationNumber,
            Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return String.format(
                "Motor Bike:\n"
                        + "\tBrand: %s\n"
                        + "\tModel: %s\n"
                        + "\tRegistration Number: %s\n"
                        + "\tHas Side Car: %b\n"
                        + "\tBelongs to %s - %s",
                this.getBrand(), this.getModel(), this.getRegistrationNumber(),
                this.isHasSidecar(),
                this.owner.getName(), this.owner.getAddress());
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
