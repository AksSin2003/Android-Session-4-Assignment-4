import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExForMath mathobj = new ExForMath();
		
		Scanner userinput=new Scanner(System.in);
		
		System.out.println("Welcome to Java Calculator");
		System.out.println("==========================");
		System.out.println("Enter first number:");
		
		int num1=userinput.nextInt();
		
		System.out.println("Enter second number:");
		
		int num2=userinput.nextInt();
		
		System.out.println("Enter the operation that you want to use(+,-,x,/):");
		
		String operation = userinput.next();
		
		if (operation.equals("+"))
		{
			System.out.println("The answer is " +mathobj.add(num1, num2));
		}	
		
		if (operation.equals("-"))
		{
			System.out.println("The answer is " +mathobj.subtract(num1, num2));
		}
		
		if (operation.equals("x"))
		{
			System.out.println("The answer is " +mathobj.multiply(num1, num2));
		}
		
		if (operation.equals("/"))
		{
			System.out.println("The answer is " +mathobj.divide(num1, num2));
		}

	}

}
