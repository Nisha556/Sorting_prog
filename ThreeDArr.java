package Searching;
import java.util.*;
public class ThreeDArr {
public static void main(String args[])
{
	Scanner input = new Scanner(System.in);
	int std[][][] = new int[2][2][2];
	for(int i = 0 ; i<std.length;i++)
	{
		for(int j = 0 ; j<std[i].length;j++)
		{
			System.out.println("please enter exam part1 for the student:" +(i+1)+ "Exam:" +(j+1));
			 std[i][j][0]= input.nextInt();
			 System.out.println("please enter exam part2 for the student:" +(i+1)+ "Exam:" +(j+1));
			 std[i][j][1]= input.nextInt();
			 
			
		}
	}
	for(int i =0; i<std.length;i++)
	{
		for(int j= 0; j<std[i].length;j++)
		{
			for(int k= 0; k<std[i][j].length;k++)
			{
				System.out.println(std[i][j][k]+" ");
				
			}
			
			System.out.println(" ");
			
		}
	}
	
}
}
