import java.util.Scanner;

public class AreaDemo
{
    public static void main(String [] args)
    {
        
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter radius of circle area");
        float radius=Sc.nextFloat();
        final float pi=3.13f;
        float area=pi*radius*radius;
        System.out.println("area of circle is"+area);
    }
}