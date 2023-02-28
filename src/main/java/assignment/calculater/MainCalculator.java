package assignment.calculater;
import java.util.*;
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
    	while(true)
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
        			result = obj.ans;
        			break;	
        		}
        		case '-':
        		{
        			obj = new Sub(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case '*':
        		{
        			obj = new Mul(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case '/':
        		{
        			obj = new Div(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 'e':
        		{
        			System.exit(0);
                    break;
        		}
        		default:
        		{
        			logger.info("Invalid Option");
        			break;
        		}
        	}
        	String res = String.valueOf(result);
        	logger.info(res);
    	}
    }
}
