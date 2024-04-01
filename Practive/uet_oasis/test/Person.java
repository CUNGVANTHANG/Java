import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Removes a vehicle.
     * 
     * @param registrationNumber the registration number.
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
            }
        }
    }

    /**
     * get Vehicles info.
     *
     * @return string.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            StringBuilder info = new StringBuilder(name + " has:\n\n");
            for (Vehicle vehicle : vehicleList) {
                info.append(vehicle.getInfo()).append("\n");
            }
            return info.toString();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
