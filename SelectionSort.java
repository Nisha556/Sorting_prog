package Searching;

public class SelectionSort {
	
	static void sort(int[] arr)
	{
		int  j;
		int len = arr.length;
		for(int  i = 0 ; i<len-1; i++)
		{
			for( j = 0 ; j< len-i-1; j++)
			{
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					
				}
			}
		}
	}
	public static void main(String ags[])
	{
		int[]arr = {4,-3,8,4,2};
		SelectionSort.sort(arr);
		for(int elm : arr) {
			
		
		System.out.println(elm + " ");
	}
	}

}
