public class NameList
{
	private static Name[] array;
	public NameList()
	{
		array = new Name[20];
		initArray();
	}
	public void initArray()
	{	
		array[0] = new Name("john", "doe");
		array[1] = new Name("jane", "doe");
		array[2] = new Name("michael", "jackson");
		array[3] = new Name("donald", "trump");
		array[4] = new Name("hillary", "clinton");
		array[5] = new Name("bernie", "sanders");
		array[6] = new Name("barack", "obama");
		array[7] = new Name("elton", "john");
		array[8] = new Name("oprah", "winfrey");
		array[9] = new Name("jeff", "bezos");
		array[10] = new Name("bill", "gates");
		array[11] = new Name("spongebob", "squarepants");
		array[12] = new Name("abraham", "lincoln");
		array[13] = new Name("elvis", "presley");
		array[14] = new Name("tiger", "woods");
		array[15] = new Name("bill", "clinton");
		array[16] = new Name("michael", "jordan");
		array[17] = new Name("julius", "ceasar");
		array[18] = new Name("george", "washington");
		array[19] = new Name("grigori", "rasputin");
	}
	public void bubbleSort()
	{  
		int n = array.length;  
		Name temp;
		for(int i= 0; i < n; i++)
		{  
			for(int j=1; j < (n-i); j++)
			{  
				if(array[j-1].compareTo(array[j]) > 0)
				{  
					temp = (array[j-1]);  
					array[j-1] = array[j];  
					array[j] = temp;  
				}  
			}
		}
	}
	public static int binarySearch(Name name) 
	{
		int low = 0;
		int high = array.length - 1;
		int mid;

		while (low <= high)
		{
			mid = (low + high) / 2;
			if (array[mid].compareTo(name) < 0)
			{
				low = mid + 1;
			} 
			else if (array[mid].compareTo(name) > 0)
			{
				high = mid - 1;	
			}
			else 
			{
				return mid;
			}
		}
		return -1;
	}
	@Override
	public String toString() 
	{
		String str = "";
		for(int i = 0; i < array.length; i++)
		{
			str += array[i].getLastName() + ", " + array[i].getFirstName() +  "\n";
		}
		return str;
	}
}