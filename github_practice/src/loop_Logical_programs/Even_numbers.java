package loop_Logical_programs;

import java.util.Scanner;

public class Even_numbers 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);				
			}
		}
		sc.close();
	}
}
