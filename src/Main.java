import java.util.Arrays;

class Cal{
    int divide(int a, int b){
        try{
            return a/b;
        }
        catch (Exception e){
            System.out.println("Cal.divide");
//            return a/b;
            return 0;
        }
    }
}

class CarOver extends Car{

    @Override
    String[] getCarNames(){
        super.getCarNames();
        return new String[]{"ca1", "car2"};
    }
}
class Main{
    public static void main (String[] args){
        Cal cal;
        cal = new Cal();
        System.out.println("Salaam");
        System.out.println(cal.divide(10,0));
        System.out.println(cal.divide(11,6));

        System.out.println("getMyCarName(): "+Car.getMyCarName());
        System.out.println("getCarName(): "+ Arrays.toString(new Car().getCarNames()));

        Plane plane = new Altorz();
        plane.planeName();

        Vehicle vehicle = new Altorz();
        vehicle.vehicleName();

        Altorz altorz = new Altorz();
        altorz.planeName();
        altorz.vehicleName();


    }
}