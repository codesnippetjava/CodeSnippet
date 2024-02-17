package solid.l;

public class Car extends MotorVehicles{
    @Override
    public Integer hasNumberOfWheels() {
        return 4;
    }

    @Override
    public Integer enginePower() {
        return 1200;
    }
}
