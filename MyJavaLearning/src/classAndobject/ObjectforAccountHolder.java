package classAndobject;

public class ObjectforAccountHolder {
public static void main(String[] args) {
	AccountHolder abdul = new AccountHolder();
	AccountHolder nazma = new AccountHolder();
	AccountHolder hafsa = new AccountHolder();
	
	abdul.firstname="Abdul";
	abdul.lastname="Shaik";
	abdul.age=40;
	abdul.accountbalance=40000;
	abdul.enligibilityforcreditcard();
	System.out.println("Is Abdul Eligible for Credit Card:"  + abdul.enligibilityforcreditcard);
	
}
}
