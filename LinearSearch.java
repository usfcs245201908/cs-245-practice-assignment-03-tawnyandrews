public class LinearSearch implements Practice03Search
{
	int target;
	int[]a;

	public int search(int[]a,int target)
	{
		for(int i=0;i<a.length;i++) 
		{
			if(target==a[i])
				return i;
		}
		return -1;
	}
	public String searchName()
	{
		return "Linear Search";
	}
}