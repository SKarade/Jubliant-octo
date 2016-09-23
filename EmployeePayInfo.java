
class Employee //Super Class
{
	String name;
	int id;
	Employee(String n,int i)
	{
		name=n;
	 	id=i;
	}
}
class Income extends Employee	//Sub Class
{
	int sal;
	double tax;
	Income(String n, int i,int s, double t)
	{
		super(n,i); //variable of super class
		sal = s;
		tax = t;
	}
	void display()
	{
		System.out.println("Name = "+name+"\nId no. = "+id+"\nSalary = "+sal+"\n Income Tax  = " +tax);
		System.out.println("\n");
	}
}
class EmployeePayInfo
{
	public static void main(String args[])
	{
		Income i1 = new Income("Vipul",15,300000,1.25); // Error
		i1.display();
		Income i2 = new Income("Ramesh Bhai",05,50000000,4.35);
	        i2.display();
	}
}
