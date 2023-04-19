
public class Calculate {

	int num1,num2,res=0;
	 Calculate(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public void addition()
	{
		res=0;
		res=num1+num2;
		System.out.println("sum is"+res);

	}
	public void subtraction()
	{
		int res=0;
		res=num1-num2;
		System.out.println("subtraction is"+res);

}
}

public class mycalculation extends Calculate{

	mycalculation(int num1,int num2)
	{
	super(num1,num2);

	}
public void mul()
{
	res=num1*num2;
	System.out.println("multiplication is"+res);
}
public static void main(String[] args) {
	mycalculation obj=new mycalculation(10,20);
	obj.mul();
	obj.addition();
	obj.subtraction();
}
}
