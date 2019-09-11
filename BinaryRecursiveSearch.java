public class BinaryRecursiveSearch implements Practice03Search
{
	int target;
	int[]a;

	//this method will overload the search method
	public int search(int[]a, int target){
		return search(a,target,0,a.length-1);
	}
	
	public int search(int[]a, int target, int low, int high)
	{
		if(low>high)
			return -1;
		
		if(low<=high) {
			int mid = (low+high)/2;

			if(a[mid]==target)
				return mid;
		
			if(target>a[mid])
				return search(a,target,mid+1,high);

			else
				high = mid-1;
				return search(a,target,low,high);
			
		}
		return -1;
	}

	public String searchName()
	{
		return "Binary Recursive Search";
	}

}
