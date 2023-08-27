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
    void tableT3(int Table_S,int Table_E,int Start,int End) {
        int i, j;
        for (j = Start; j <= End; j++) {
            for (i = Table_S; i <= Table_E; i++) {
                System.out.print(i+"*"+j+"="+i * j+"\t\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args){
        Multiplier M = new Multiplier();
        //M.table(5,10);
        M.table(5,100);
        M.tableT2(1,100,0,100);
        M.tableT3(1,100,0,100);

    }
}
//EASY BRO