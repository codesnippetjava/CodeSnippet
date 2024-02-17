package solid.l;

import java.util.ArrayList;
import java.util.List;

public class VehicleApplication {
    public static void main(String[] args) {
        List<MotorVehicles> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());


        vehicles.forEach(vehicle -> {
            System.out.println(
                    vehicle.enginePower()
            );
        });
    }
}
