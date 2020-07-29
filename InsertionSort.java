package Searching;

public class InsertionSort {
int j;
static void sort(int[] arr)
{
	int len = arr.length;
	for(int i = 0 ; i<len; i++)
	{
		int key = arr[i];
		int j = i-1;
		while(j>= 0 && arr[j]>key)
		{
			arr[j+1]  =arr[j];
			j=j-1;
			
		}
		arr[j+1] = key;
		
		
	}
}
public static void main(String args[])
{
	int[] arr = {4,-2,-3,9,8};
	InsertionSort.sort(arr);
	for(int elm : arr)
	{
		System.out.println(elm+ " ");
		
	}
}
}
