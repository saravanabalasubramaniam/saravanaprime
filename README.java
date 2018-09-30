import java.io.*;
import java.util.*;
class Prime
    {
        public static void main (String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            for (int i=a;i<=b ;i++ )
                {
                    int c=0;
                    for (int j=1;j<=b;j++)
                    {
                        int num;
                        num=i;
                        if(num%j==0)
                        {
                            c++;
                        }
                    }
                    if(c==2)
                        {
                            System.out.println(i);
                        }
                        
                }     
        }
    }
