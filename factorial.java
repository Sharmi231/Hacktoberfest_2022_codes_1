import java.util.*;
public class factorial
{
public static void main(String args[])
{
int i,f=1,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit");
num=sc.nextInt();

for(i=1;i<=num;i++)
{
f=f*i;
}
System.out.println("The factorial is:"+f);
}
}