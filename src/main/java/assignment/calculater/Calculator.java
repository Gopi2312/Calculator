package assignment.calculater;
abstract class Calculator 
{
	double num1;
	double num2;
	double ans;
	Calculator(double x , double y)
	{
		this.num1 = x;
		this.num2 = y;
	}
	public abstract void calculate();
}
