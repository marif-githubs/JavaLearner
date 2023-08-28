public class javaArray {
    int[] arr = new int[500];
    void tableT2(int Table_S,int Table_E,int Start,int End){
        int i, j, num, k = 0;
        for(i = Table_S; i<=Table_E; i++){
            System.out.println("------");
            for(j =Start;j<=End; j++){
                num = j*i;
                System.out.println(num);
                arr[k]=num;
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
    public static void main(String[] args){
        javaArray ja;
        ja = new javaArray();

        ja.tableT2(1,10,1,10);
        ja.printArray();
    }

}
