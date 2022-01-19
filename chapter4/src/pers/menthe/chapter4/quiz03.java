package pers.menthe.chapter4;

public class quiz03 {
    public static void main(String[] args) {

        /*
         * GPS Location:
         * Atlanta:(35.2270869,-80.8431267)
         * Orlando:(33.7489954,-84.3879824)
         * Savannah:(32.0835407,-81.0998342)
         * Charlotte:(28.5383355,-81.3792365)
         */

        final double AVERAGE_RADIUS = 6371.01;
        final double ATLANTA_X = 35.2270869;
        final double ATLANTA_Y = -80.8431267;
        final double ORLANDO_X = 33.7489954;
        final double ORLANDO_Y = -84.3879824;
        final double SAVANNAH_X = 32.0835407;
        final double SAVANNAH_Y = -81.0998342;
        final double CHARLOTTE_X = 28.5383355;
        final double CHARLOTTE_Y = -81.3792365;

        double distanceAO,distanceOS,distanceSC,distanceCA,distanceAS,perArea1,perArea2,area1,area2,area;
        distanceAO = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(ATLANTA_X)) * Math.sin(Math.toRadians(ORLANDO_X)) +
                Math.cos(Math.toRadians(ATLANTA_X)) * Math.cos(Math.toRadians(ORLANDO_X)) * Math.cos(Math.toRadians(ATLANTA_Y-ORLANDO_Y)));
        distanceOS = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(ORLANDO_X)) * Math.sin(Math.toRadians(SAVANNAH_X)) +
                Math.cos(Math.toRadians(ORLANDO_X)) * Math.cos(Math.toRadians(SAVANNAH_X)) * Math.cos(Math.toRadians(ORLANDO_Y-SAVANNAH_Y)));
        distanceSC = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(SAVANNAH_X)) * Math.sin(Math.toRadians(CHARLOTTE_X)) +
                Math.cos(Math.toRadians(SAVANNAH_X)) * Math.cos(Math.toRadians(CHARLOTTE_X)) * Math.cos(Math.toRadians(SAVANNAH_Y-CHARLOTTE_Y)));
        distanceCA = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(CHARLOTTE_X)) * Math.sin(Math.toRadians(ATLANTA_X)) +
                Math.cos(Math.toRadians(CHARLOTTE_X)) * Math.cos(Math.toRadians(ATLANTA_X)) * Math.cos(Math.toRadians(CHARLOTTE_Y-ATLANTA_Y)));
        distanceAS = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(ATLANTA_X)) * Math.sin(Math.toRadians(SAVANNAH_X)) +
                Math.cos(Math.toRadians(ATLANTA_X)) * Math.cos(Math.toRadians(SAVANNAH_X)) * Math.cos(Math.toRadians(ATLANTA_Y-SAVANNAH_Y)));
        perArea1 = (distanceAO + distanceOS +distanceAS) / 2;
        area1 = Math.sqrt(perArea1*(perArea1-distanceAO)*(perArea1-distanceOS)*(perArea1-distanceAS));
        perArea2 = (distanceCA + distanceSC + distanceAS) / 2;
        area2 = Math.sqrt(perArea2*(perArea2-distanceCA)*(perArea2-distanceSC)*(perArea2-distanceAS));
        area = area1+ area2;
        System.out.println("The area closed by four cities is " + area +" km²");
        //I don't know where's wrong，but the answers is wrong.

    }
}
