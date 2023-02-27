package assignment.calculater;
class Sub extends Calculator
{
	Sub(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		ans = num1 - num2;
	}
}