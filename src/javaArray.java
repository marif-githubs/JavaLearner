import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class javaArray {

    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> arr_even = new ArrayList<>();
    ArrayList<Integer> arr_rm = new ArrayList<>();


    void tableT2(int Table_S,int Table_E,int Start,int End){
        int i, j, num, k = 0;
        for(i = Table_S; i<=Table_E; i++){
            System.out.println("------");
            for(j =Start;j<=End; j++){
                num = j*i;
                System.out.println(num);
                arr.add(k, num);
                k++;
            }

        }
    }
    void printArray(){
        int ii = 0;
        System.out.println("display array element");
        System.out.print("Integer Array: [ ");
        for (int i : arr) {
            System.out.print(i + " ");
            ii++;
        }
        System.out.println("]");
        System.out.println(ii);
    }
    void sortArray(){
        int ii = 0;
        Collections.sort(arr);
        System.out.print("Array after Sort: [");
        for (int i : arr) {
            System.out.print(i + " ");
            ii++;
        }
        System.out.println("]");
        System.out.println(ii);

    }
    void even(){
        int ii = 0;
        for (int i : arr){
            if (i % 2 == 0){
                arr_even.add(i);
            }
            ii++;
        }
    }
    void printArray2(){
        int i2 = 0;
        System.out.print("even Integer Array: [ ");
        for (int i : arr_even) {
            System.out.print(i + " ");
            i2++;
        }
        System.out.println("]");
        System.out.println(i2);
    }
    void rm_dublicate() {
        for (int a : arr_even) {
            if (!arr_rm.contains(a)) {
                arr_rm.add(a);
            }
        }
    }
    void printArray3(){
        int ii = 0;
        System.out.print("final Array: [ ");
        for (int i : arr_rm) {
            System.out.print(i + " ");
            ii++;
        }
        System.out.println("]");
        System.out.println(ii);
    }
    public static void main(String[] args){
        javaArray ja;
        ja = new javaArray();

        ja.tableT2(1,10,1,10);
        ja.printArray();
        ja.sortArray();
        ja.even();
        ja.printArray2();
        ja.rm_dublicate();
        ja.printArray3();
    }

}
