
public class SortingFunctions 
{
	// Swap Method for swapping two array elements basis the location in array
	static void swap(Company arr[], int fromlocation, int tolocation)
	{
		Company temp = arr[tolocation];
		arr[tolocation] = arr[fromlocation];
		arr[fromlocation] = temp;
	}
	//Array to partition the array basis low and high bounds of the array
	static int partitionarray (Company arr[], int low, int high, String SortType)
	{
		double pivot = arr[high].StockPrice;
		int i = low - 1;
		for (int j = low; j <= high ; j++)
		{
			if (SortType.equals("Ascending"))
			{
				if (arr[j].StockPrice < pivot)
				{
					i++;
					swap(arr,i,j);
				}
			}
			if (SortType.equals("Decending"))
			{
				if (arr[j].StockPrice > pivot)
				{
					i++;
					swap(arr,i,j);
				}
			}
		
		}
		swap(arr,i+1,high);
		return i+1;
	}
	static Company[] quicksort(Company arr[],int low, int high, String SortType)
	{
		if (low < high)
		{
		//First partition array	
			int pivot= partitionarray(arr,low,high, SortType);
		//Recursively call quick sort for left and right side of array against the pivot	
			quicksort(arr,low,pivot-1, SortType);
			quicksort (arr,pivot+1,high, SortType);
		}
		return arr;
	}
	

}
