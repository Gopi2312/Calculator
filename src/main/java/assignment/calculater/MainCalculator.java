package assignment.calculater;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainCalculator 
{
    public static void main( String[] args )
    {
    	double num1;
    	double num2;
    	double result;
    	Logger logger = Logger.getLogger("hi");
    	Scanner sc = new Scanner(System.in);
    	String msg = "Enter Number";
    	logger.info(msg);
    	num1 = sc.nextDouble();
    	Calculator obj;
    	result = num1;
    	do
    	{
        	logger.info(msg);
        	num2 = sc.nextDouble();
        	logger.info("Choose Operation:\n addition: +\n substraction: -\n multiple:*\n division:/\n exit:e");
        	char op = sc.next().charAt(0);
        	switch(op)
        	{
        		case '+':
        		{
        			obj = new Add(result,num2);
        			obj.calculate();
        			result = obj.getAns();
        			break;	
        		}
        		case '-':
        		{
        			obj = new Sub(result,num2);
        			obj.calculate();
        			result = obj.getAns();
        			break;	
        		}
        		case '*':
        		{
        			obj = new Mul(result,num2);
        			obj.calculate();
        			result = obj.getAns();
        			break;	
        		}
        		case '/':
        		{
        			obj = new Div(result,num2);
        			obj.calculate();
        			result = obj.getAns();
        			break;	
        		}
        		case 'e':
        		{
        			System.exit(0);
        		}
        		default:
        		{
        			logger.info("Invalid Option");
        			break;
        		}
        	}
        	System.out.println(result);
    	}while(true);
    }
}
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
	public double getAns() {
		return ans;
	}
	public void setAns(double ans) {
		this.ans = ans;
	}
	public abstract void calculate();
}
class Add extends Calculator
{
	Add(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		this.ans = this.num1 + this.num2;
		setAns(this.ans);
	}
}
class Sub extends Calculator
{
	Sub(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		this.ans = this.num1 - this.num2;
		setAns(this.ans);
	}
}
class Mul extends Calculator
{
	Mul(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		this.ans = this.num1 * this.num2;
		setAns(this.ans);
	}
}
class Div extends Calculator
{
	Logger logger = Logger.getLogger("hi");
	Div(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
			this.ans = this.num1 / this.num2;
			setAns(this.ans);
	}
}