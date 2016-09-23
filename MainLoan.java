class Customer
{
	String name;
	int ph_no;
	Customer(String n,int phn)
	{
		name=n;
		ph_no=phn;
	}
}
class Depositor extends Customer
{
	int acc_no;
	double bal;
	Depositor(String n,int phn n,int an,double b)
	{
		super(n,phn);
		acc_no=an;
		bal=b;
	}
	void display()
	{
	System.out.println("name="+name);
	System.out.println("phone number="+ph_no);
	System.out.println("account no.="+acc_no);
	System.out.println("balance="+bal);
	}
}
class Borrower extends Customer
{
	int loan_no;
	double loan_amt;
	Borrower(String n,int phn,int ln,int la)
	{
		super(n,phn);
		loan_no=ln;
		loan_amt=la;
	}
	void show()
	{
		System.out.println("loan number"+loan_no);
		System.out.println("loan amount="+loan_amt);
	}
}
class MainLoan
{
	public static void main(String args[])
	{
		Depositor d=new Depositor("Shrijeet",345,134,5000.34);
		Borrower b=new Borrower("vipul",344,2545,10000);
		d.display();
		b.show();
	}
}


