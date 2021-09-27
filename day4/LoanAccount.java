package day4;

public class LoanAccount extends Account{
	
	double amount;
	
	LoanAccount(int acc_no,String name,double amount)
	{
		super(acc_no,name);
		this.amount=amount;
	}

}
