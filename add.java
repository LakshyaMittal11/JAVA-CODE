import java.util.*;
class add
{
public static void main(String k[])
{
Scanner ob = new Scanner (System.in);
System.out.println("enter row and column size");
int R=ob.nextInt();
int C=ob.nextInt();
int a[][]=new int[R][C];
System.out.println("enter values");
int i,j;
for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
a[i][j]=ob.nextInt();
}
}

int b[][]=new int[R][C];
System.out.println("enter values");
for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
b[i][j]=ob.nextInt();
}
}
int c[][]=new int[R][C];

for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}

}
}
