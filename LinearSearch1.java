package Searching;

public class LinearSearch1 {
	static int linearSearch(int arr[], int elm)
	{
		int idx = -1;
		for(int i = 0; i<arr.length;i++)
		{
			if(elm==arr[i])
			{
				idx = i;
				break;
				
				
			}
		}
		return idx;
		
	}
	public static void main(String args[])
	{
		int arr[] = {1,3,5,6,8};
		int elm = 5;
		int foundIdx = LinearSearch.linearSearch(arr , elm);
	}
}
