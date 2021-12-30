package pers.menthe.chapter1;

public class quiz11 {

    public static void estiOfPopulation() {

        double currentPopulation = 312032486;
        //egde of overflow
        int secOf5Year = 365*24*60*60;

        for(int n = 1; n <= 5; n++){

            double populationOfEach = currentPopulation + n * secOf5Year * 1/7.0 - n * secOf5Year * 1/13.0 + n * secOf5Year * 1/45.0;
            System.out.printf("The population after %d year is %.0f.\n",n,populationOfEach);

        }

    }

}
