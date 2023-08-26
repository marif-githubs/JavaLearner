public class Multiplier {
    void table(int num,int n){
        int i;
        for(i = 0; i<=n; i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
    void tableT2(int Table_S,int Table_E,int Start,int End){
        int i, j;
        for(i = Table_S; i<=Table_E; i++){
            System.out.println("------");
            for(j =Start;j<=End; j++){
                System.out.println(i+"*"+j+"="+(j*i));
            }

        }
    }
    public static void main(String[] args){
        Multiplier M = new Multiplier();
        M.table(5,10);
        M.tableT2(5,10,1,10);

    }
}
//EASY BRO