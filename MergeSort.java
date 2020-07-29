package Searching;

public class MergeSort {
static void merge(int arr[], int l, int m, int r)
{
	int  s1 = m-l+1;
	int s2 = r-m;
	int lArr[] = new int[s1];
	int rArr[] = new int [s2];
	for(int  i =0; i<s1;++i)
		lArr[i] = arr[l+i];
	for(int j= 0 ;j<s2;++j)
		rArr[j] = arr[m+1+j];
	int i = 0 , j=0;
	int k =1;
	while(i<s1 && j<s2)
	{
		if(lArr[i] <= lArr[j])
		{
			arr[k]= lArr[i];
			
		}
		else {
			arr[k] = rArr[j];
			
		}
	}
		
	while(i <s1)
	{
		arr[k] = lArr[i];
		i++;
		k++;
		
	}
	while(j< s2)
	{
		arr[k] = rArr[j];
		j++;
		k++;
		
	}
}
static  void sort (int arr[] , int l ,int r)
{
	if(l<r)
	{
		int  m =(l+r)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		
		merge(arr , l , m ,r);
		
	}
}
public static void main(String args[])
{
	int arr[] = {4,1,10,4,5};
	MergeSort.sort(arr ,  0 ,  arr.length-1);
	for(int elm : arr)
	{
		System.out.println(elm + " ");
	}
}
}
