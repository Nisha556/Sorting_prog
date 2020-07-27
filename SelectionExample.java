package Algo;

public class SelectionExample {
public static void selection(int arr[])
{
	for(int i=0; i<arr.length-1;i++)
	{
		System.out.println( "print 1st "+i);
		int index = i;
		for(int j= i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[index])
			{
				index=j;
				System.out.println(  "print" +j);
			}
		}
		int smallerNumber = arr[index];
		arr[index]= arr[i];
		arr[i]=smallerNumber;
		System.out.println( "print i"+i);
	}
}
public static void main(String args[])
{
	int[] arr1 = {9,14,83,45,2,4,6,0};
	System.out.println("Before Selection Sorting");
	for(int i:arr1)
	{
		System.out.println(i+" ");
		
	}
	System.out.println();
	selection(arr1);
	System.out.println("After selection sort");
	for(int i : arr1)
	{
		System.out.println(i+" ");
	}
}
}
