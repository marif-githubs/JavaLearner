
interface Vehicle{
    void vehicleName();
    void vehicleNumber();
}

interface Plane{
    void planeName();
}

class Altorz implements Vehicle, Plane{
    @Override
    public void vehicleName() {
        System.out.println("Tata Altroz");
    }

    @Override
    public void vehicleNumber() {
        System.out.println("4468");
    }

    @Override
    public void planeName() {
        System.out.println("Aeroplane");
    }
}

class Alto implements Vehicle{
    @Override
    public void vehicleName(){
        System.out.println("Suzuki Alto");
    }

    @Override
    public void vehicleNumber() {
        System.out.println("800");
    }
}

public class Car {


    protected String getCarName() {
        return "Car";
    }


    static String getMyCarName() {
        return "Static Car Name";
    }

    int getCarVersion() {
        return 45678;
    }

    String[] getCarNames() {
        return new String[]{"Altroz", "Audi", "Tesla"};
    }
}
