package pers.menthe.chapter4;

public class quiz06 {
    public static void main(String[] args) {
        double x1,y1,x2,y2,x3,y3;
        double angleA,angleB,angleC,angle;
        double a,b,c;
        final double radius = 40.0;

        angle = Math.random() * 2 * Math.PI;
        x1 = radius * Math.cos(angle);
        y1 = radius * Math.sin(angle);
        angle = Math.random() * 2 * Math.PI;
        x2 = radius * Math.cos(angle);
        y2 = radius * Math.sin(angle);
        angle = Math.random() * 2 * Math.PI;
        x3 = radius * Math.cos(angle);
        y3 = radius * Math.sin(angle);

        a = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        b = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
        c = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1-y3,2));

        angleA = Math.toDegrees(Math.acos((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c)));
        angleB = Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c)));
        angleC = Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b)));

        System.out.println("The first angle in degree is " + angleA);
        System.out.println("The second angle in degree is " + angleB);
        System.out.println("The third angle in degree is " + angleC);
    }
}
