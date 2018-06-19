import java.io.*;
import java.util.*;
class leap
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%4==0)
{
System.out.print("leap");
}
else
{
System.out.print("not a leap year");
}
}
}
