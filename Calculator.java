import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Calculator {
      
	private  double result ;
	
	public void add(double a, double b){
		 this.result = a + b;	
	}
	
	public void multi( double a,  double b){
		this.result = a * b;
	}
	
	public void diff(double a, double b){
		this.result = a - b ;	
	}

	public void division(double a, double b){
		this.result = a / b;	
	}
	
	public void power(double a, double b){ 
		this.result = Math.pow(a, b);
	}
	
	public double getResult(){
		return this.result;
	}
	
	public void cleanResult(){
		this.result = 0;
	}
	/** Do operation that user choosed
	*@param a - the first argument			 
	*@param b - second argument
	*@param reader - BufferedReader from InteractRunner class 	*/
	public void applyChoice(double a, double b, BufferedReader reader) throws IOException{
		
		switch(getChoice(reader)){
			case ("+"):
				add(a, b);
				break;
			case ("-"):
				diff(a, b);
				break;
			case ("*"):
				multi(a, b);
				break;
			case ("/"):
				division(a, b);
				break;
			case ("^"):
				power(a,b);
				break;
			default: System.out.println("No such action");
				   applyChoice(a, b, reader);
		}
	}
	/** Get operation to do from user
	*@param reader BufferedReader from main*/							
	public String getChoice(BufferedReader reader) throws IOException {
		System.out.println("Choose action : +,-,*,/,^ ");
			return reader.readLine(); 
	}
}
