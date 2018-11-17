package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();



        String data = in.nextLine();
        String tmpDataArray[] = data.split(" ");
        String arr[] = new String[tmpDataArray.length];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = in.nextLine();
        }

        String f = "";
        for (String s: arr)
            f += s;
        char[] s = f.toCharArray();


       // String s;
        char s1 ;
        int br=0;
        for (int i=1; i<=n;i++) {

            s1 = s[i];
            int a=0,b=0;

            for (int j=0;i<arr.length;j++) {
                if (s[j]%2==0)
                {
                    if (s[j]=='0')
                        s[j]='9';
                    else
                        s[j]--;
                }
                else
                {
                    if (s[j]=='9')
                        s[j]='0';
                    else
                        s[j]++;
                }

                a = a*10+ s[j] - 48;
                b = b*10 + s1 - 48;
            }

            if (nod(a,b)<10)
                br++;
        }

        System.out.println(br);




    }
    static int nod(int a, int b)
    {
        while (b != a)
            if (a > b)
                a = a - b;
            else
                b = b - a;
        return a;
    }
}
