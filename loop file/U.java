import java.util.*;
class U
{
public static void main(String k[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=5;j++)
{
if((j==i)||(j==5-i+1))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}