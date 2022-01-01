package pers.menthe.chapter2;

public class quiz06 {
    public static int sumOfInt(int enterInt) {
        int indPosi = enterInt % 10;
        int tenPosi = (enterInt / 10) % 10;
        int  hundPosi = (enterInt / 10) / 10;

        int finnalSum = indPosi + tenPosi + hundPosi;
        return finnalSum;
    }
}
