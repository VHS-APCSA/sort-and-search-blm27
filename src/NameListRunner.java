
public class NameListRunner
{
	public static void main(String[] args)
	{
		NameList test = new NameList();
		test.bubbleSort();
		System.out.print(test + "\n");
		System.out.println(test.binarySearch(new Name("oprah", "winfrey"))); // returns 18 as it's sorted to the index of 18
		System.out.println(test.binarySearch(new Name("jane", "doe"))); // returns 4 as it's sorted to the index of 4
		System.out.println(test.binarySearch(new Name("john", "doe"))); // returns 5 as it's sorted to the index of 5
		System.out.println(test.binarySearch(new Name("thomas", "eddison"))); //returns -1 b/c it's not in the array
		System.out.println(test.binarySearch(new Name("charles", "darwin"))); //returns -1 b/c it's not in the array
	}
}
