public class LableDemo
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("outer loop"+i);
            for(int j=1;j<=10;j++)
            {
                if(j>i)
                    break;
                    System.out.println("I am in outside loop");
            }

        }
    }
}
