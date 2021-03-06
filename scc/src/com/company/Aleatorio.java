package com.company;


public class Aleatorio
{

    static double exponencial (double m)
    {
        return (-m*Math.log(RandomGenerator.rand(1)));

    }


    public static  double []normal (double m, double d, int randStream)
    {

        double V1, V2, W;

        double Y [] = new double [2];

        do
        {
            V1 = 2 * RandomGenerator.rand(randStream) - 1;
            V2 = 2 * RandomGenerator.rand(randStream) - 1;
            W = V1*V1 + V2*V2;
        } while(W > 1);

        Y[0] = Math.abs((V1*Math.sqrt(-2 * Math.log(W) / W))*d + m);
        Y[1] = Math.abs((V2*Math.sqrt(-2 * Math.log(W) / W))*d + m);

        return Y;
    }

    public static  double uniform (double m, double d, int seed)
    {
        return (m-d) + RandomGenerator.rand(seed) * (2*d);
    }

    public static boolean isToGasolina(){


        if(RandomGenerator.rand64(1) > 0.2)
            return false;

        return true;
    }
}