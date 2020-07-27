package Algo;
import java.util.Scanner;
import java.util.Scanner.*;
public class SelectionExample2 {
	public static void main(String args[])
	{
		int size , i ,j ,temp;
		int arr[]= new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size");
		size = sc.nextInt();
		System.out.println("Enter Array Elemens");
		for(i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
			
		}
				System.out.println("Sorting Array using Selection sorting");
				for(i=0;i<size;i++)
				{
					for(j=i+1; j<size;j++)
					{
						if(arr[i]>arr[j])
						{
							temp = arr[i];
							arr[i]= arr[j];
							arr[j]= temp;
						}
					}
				}
				System.out.println("Now the Array after sorting");
				for(i=0;i<size;i++)
				{
					System.out.println(arr[i] + " ");
				}
	}

}
