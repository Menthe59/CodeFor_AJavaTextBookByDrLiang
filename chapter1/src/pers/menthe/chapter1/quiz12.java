package pers.menthe.chapter1;

public class quiz12 {

    public static void aveSpeedForKilo() {

        double kilos = ( 24*1.6 )/( 1 + (40 + 35.0/60 )/60 );
        System.out.printf("The average speed of a runner who runs 24 miles in 1h40'35'' is %.2f km per hour.", kilos);

    }

}
