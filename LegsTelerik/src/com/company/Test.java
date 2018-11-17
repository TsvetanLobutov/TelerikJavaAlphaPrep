package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String args[])
    {

        System.out.println("enter number which comibnation of sum you want");
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        for(int i=0;i<=3;i++)
        {
            int sum = 0;
            for(int j=0;j<=3;j++)
            {
                for(int k=0;k<=3;k++)
                {
                    sum=i+j+k;
                    if(sum == num)
                    {
                        System.out.println(+i+""+j+""+k);
                    }

                }
            }
        }

        input.close();
    }

}
