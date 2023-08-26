public class Learner {
    int  division(int a, int b){
        try{
            return a/b;
        }catch (Exception e) {
            System.out.println(e);
            return  0;
        }
    }
    public  static void main(String []args ){
        System.out.println("in learners Class");
        System.out.println("By Saad");
        Learner L= new Learner();
        System.out.println(L.division(10,0));
    }
}
