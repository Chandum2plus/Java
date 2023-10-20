package JavaRep.loops;

import java.util.Scanner;

// write a program to calculate the sum of 10 natural number
public class SumNaturalNum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num;
        int sum=0;
        System.out.print("Enter the number - ");
        num=s.nextInt();
        for (int i=1;i<=num;i++){
            System.out.print(" "+i);
            sum=sum+i;
        }
        System.out.println("\nSum of Natural Number - "+sum);
    }



}
