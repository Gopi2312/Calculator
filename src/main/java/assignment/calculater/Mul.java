package assignment.calculater;
class Mul extends Calculator
{
	Mul(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		ans = num1 * num2;
	}
}