package pers.menthe59.chapter6;

public class quiz01 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++){
            System.out.printf("%7d",getPentagonalNumber(i));
            count++;
            if (count % 10 ==0 ){
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n*(3*n-1)/2;
    }
}
