package _21to30;

public class _28_SpiralDiagonalSum {

    public static void main(String[] args) {
        int n = 1001;  // diagonale de 1001
        getRes(n);  // à chaque tour, l'equart entre chaque nombre des diagonale qui se suivent augmente de 2
    }

    private static void getRes(int n){

        int res = 1;
        int diff = 2;

        int num = 1;

        for(int i=0;i <n/2;i++){

            for (int j=0; j<4;j++) {
                num = num + diff;
                res = res + num;
            }
            diff = diff +2;
        }

        System.out.println(res);

    }
}
