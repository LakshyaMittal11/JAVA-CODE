import java.util.*;
class SumForLoop  
{  
public static void main(String K[])   
{  
    Scanner ob=new Scanner(System.in);
    System.out.print("enter the no.=")
    int n=ob.nextInt();
int i,sum = 0;  
for(i = 1; i <= n; i++)  
{  
sum = sum + i;  
}  
System.out.println("Sum of Natural Numbers " + sum);  
}  
}