import java.util.*;
class prime1Ton
{
    public static void main(String args[])
    {
        int i,k,j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n:");
      int n = scanner.nextInt();
      scanner.close();
        for(i=1;i<n;i++)
        {
            k=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println(i);
            }
        }
    }
}