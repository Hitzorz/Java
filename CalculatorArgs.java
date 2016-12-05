
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class CalculatorArgs{

      private static String useLastResult="";
	public static double first;
	public static double second;


/** Get arguments from user. 
*If count > 0 offer to use last result.
* @param count - How many computing have been.
* @param result - last result from Calculator class
* @param reader - BufferedReader fronm InteractRunner's main method
* @param form - DecimalFormat from InteracrRunner's main method*/
public void getArgs(int count, double result, BufferedReader reader, DecimalFormat form)throws IOException{
	
	
	if (count > 0){
		System.out.println("Do you want to use the last result? yes/no");
		this.useLastResult = reader.readLine().toUpperCase();
	}
      if(useLastResult.equals("YES")){
		this.first = result;
		System.out.println("The first argument =  " + form.format(this.first));	
	} else{
		System.out.println("Enter  the first argument:");
		this.first = Double.parseDouble(reader.readLine());
	    }	
	System.out.println("Enter second argument:");
	this.second = Double.parseDouble(reader.readLine());
	
}








}