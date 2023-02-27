package assignment.calculater;
class Div extends Calculator
{
	Div(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		ans = num1 / num2;
	}
}