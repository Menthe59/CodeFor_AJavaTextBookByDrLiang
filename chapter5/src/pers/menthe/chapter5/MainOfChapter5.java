package pers.menthe.chapter5;
import java.util.*;

public class MainOfChapter5 {
    public static void main(String[] args) {
        /*Please remove the double slash used for comments before test.
        测试相关题目前请删去对应注释。
        */
        Scanner input = new Scanner(System.in);

        //quiz5.1
        int posNum = 0, negNum = 0, intNum = 0, flag;
        double totalNum = 0;
        System.out.println("Enter an integer, the input ends if it is 0:");
        while((flag = input.nextInt()) != 0){
            if (flag > 0){
                posNum++;
            }
            if (flag < 0){
                negNum++;
            }
            intNum++;
            totalNum += flag;
        }
        if(intNum == 0){
            System.out.println("No numbers are enters except 0");
        }else{
            System.out.printf("The number of positive is %d\n",posNum);
            System.out.printf("The number of negative is %d\n",negNum);
            System.out.printf("The total is %.2f\n",totalNum);
            System.out.printf("The average is %.2f\n",totalNum / intNum);
        }

    }
}
