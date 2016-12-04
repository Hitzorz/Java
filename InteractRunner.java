import java.io.IOException;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class InteractRunner{
	static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static final DecimalFormat form = new DecimalFormat("#.#################");
	private String continueWork="";
	private String useLastResult="";
	private double useResult;
	private double first;
	private double second;
      static final Calculator calc = new Calculator();
	static final InteractRunner inter = new InteractRunner();
public static void main(String[] args) throws IOException{
	
	form.setDecimalSeparatorAlwaysShown(false);
      int count = 0;
	while(!inter.continueWork.equals("no")){
		inter.getArgs(count, calc.getResult());
		calc.applyChoice(inter.first, inter.second);
		System.out.println(form.format(calc.getResult()));
		System.out.println("Do you wanna continue? yes/no");
		inter.continueWork = reader.readLine();
		count++;	
	}
	reader.close();
}

public void getArgs(int count, double result)throws IOException{
	//если производилось хоть одно вычисление,
	// предложить использовать результат последнего
	if (count > 0){
		System.out.println("Do you want to use the last result? yes/no");
		this.useLastResult = reader.readLine();
	}
	//Если "YES" -  запрос предыдущего результата и
	//его использование  в качестве первого аргумента
      if(this.useLastResult.equals("yes")){
		this.first = result;
		System.out.println("1st arg = : " + form.format(this.first));	
	} else{
		System.out.println("Enter first arg:");
		this.first = Double.parseDouble(reader.readLine());
	    }	
	System.out.println("Enter second arg:");
	this.second = Double.parseDouble(reader.readLine());
	
}

}