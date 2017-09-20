import java.util.Scanner;

public class Sorting {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names you want to enter.");
		int n = sc.nextInt();
		String [] s = new String[n];

		System.out.println("Enter the names...");
		for(int i=0; i<n; i++)
		{
			s[i] = sc.next();
		}
				
		for(int i=0; i<n; i++)
		{
			s[i] = s[i].toLowerCase();
		}
		String t = new String();
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(s[i].compareTo(s[j]) > 0)
				{
					t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
		
		System.out.println("The names in the sorted order are:");
		for(int i=0; i<n; i++)
		{
			System.out.println(s[i]);
		}
	}
}