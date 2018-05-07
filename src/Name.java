
public class Name implements Comparable
{
	private String firstName;
	private String lastName;
	public Name()
	{
		this.firstName = "";
		this.lastName = "";
	}
	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	@Override
	public int compareTo(Object obj)
	{
		int val = 0;
		Name name = (Name)obj;

		if(lastName.compareTo(name.getLastName()) == 0)
		{
			val = firstName.compareTo(name.getFirstName());
		}
		else
		{
			val = lastName.compareTo(name.getLastName());
		}
		return val;
	}

}



