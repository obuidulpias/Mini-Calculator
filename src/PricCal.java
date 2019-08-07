import java.util.Scanner;

public class PricCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner input = new Scanner (System.in);
		
		String num = "10*2";
		
		String[] numbers = num.split("*"); //ami jodi - and / dei taile hoy...but + and * er kaj hoy na.
    	
    	String a,b;
    	a=numbers[0];
   	 	b=numbers[1];
    	
    	if(numbers.length==2)
    	{
        	double firstNumber = Double.parseDouble(a);
        	double secondNumber = Double.parseDouble(b);
       	 
        	System.out.println(""+firstNumber+" * "+secondNumber+" = "+ (firstNumber*secondNumber) );
    	}  

	}

}
