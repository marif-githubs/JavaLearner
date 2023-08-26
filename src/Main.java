

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

class Main{
    public static void main (String[] args){
        Cal cal, cal1, cal2;
        cal = new Cal();
        System.out.println("Salaam");
        System.out.println(cal.divide(10,0));
        System.out.println(cal.divide(11,6));

        System.out.println("getMyCarName(): "+Car.getMyCarName());
        System.out.println("getCarName(): "+ new Car().getCarName());



    }
}