package assignment.calculater;
class Add extends Calculator
{
	Add(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		ans = num1 + num2;
	}
}