import java.io.IOException;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/** Run the Calculator.
* It's works while (!continueWork"NO") 
*/
  
public class InteractRunner{
public static void main(String[] args) throws IOException{
	final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	final DecimalFormat form = new DecimalFormat("#.#################");
	final Calculator calc = new Calculator();
 	final CalculatorArgs calcArgs = new CalculatorArgs();
	String continueWork="";
	
	System.out.println("WELCOME!");
	System.out.println();
	form.setDecimalSeparatorAlwaysShown(false);
      int count = 0;
	while(!continueWork.equals("NO")){
		calcArgs.getArgs(count, calc.getResult(), reader, form);
		calc.applyChoice(calcArgs.first, calcArgs.second, reader);
		System.out.println(form.format(calc.getResult()));
		System.out.println("Do you wanna continue? yes/no");
		continueWork = reader.readLine().toUpperCase();
		count++;	
	}
	reader.close();
}


}