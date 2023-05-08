package com.jessicabrohard.packages;

public class Main {
    public static void main(String[] args) {
        if(args.length!=3)
            System.out.println("Incorrect number of arguments provided");
        else {
            double amt = Double.parseDouble(args[0]);
            double rate = Double.parseDouble(args[1]);
            int nper = Integer.parseInt(args[2]);


            double answer = compoundInterest(amt, rate, nper);

            System.out.println(answer);
        }
    }

    static double compoundInterest(double amt, double rate, int nper){
        double newamt=amt;
        for (int i=0;i<nper;i++)
        {
            newamt=newamt+newamt*rate;
        }
        return newamt-amt;
    }

 /* static double simpleInterest(double amt, double rate, int periods){
 double holder;
 holder=amt*rate*periods;
 return holder;
 //System.out.println(holder);
 }
*/

}