import java.util.*;
class armstrong
{
public static void main(String K[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter the number=");
int a=ob.nextInt();
int r,s=0;
int t=a;
while(a>0)
{
r=a%10;
a=a/10;
s=(s)+(r*r*r);
}
if(s==t)
System.out.println("armstrong");
else
System.out.println("not a armstrong");
}
}

