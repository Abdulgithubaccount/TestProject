package classAndobject;

public class AccountHolder {
	String firstname;
	String lastname;
	int age;
	float accountbalance;
	boolean enligibilityforcreditcard;

	public void enligibilityforcreditcard()
	{
		if (age > 30 && accountbalance >= 25000)
			enligibilityforcreditcard=true;
	}
}
