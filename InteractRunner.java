import java.io.IOException;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class InteractRunner{
	
public static void main(String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Calculator calc = new Calculator();
	DecimalFormat form = new DecimalFormat("#.#################");
	form.setDecimalSeparatorAlwaysShown(false);
      String continueWork="";
	String useLastResult="";
	int count = 0;
	double result;
	double first;
	double second;
	// Продолжать работу, пока не будет получен ответ "no"
	while(!continueWork.equals("no")){
		//если производилось хоть одно вычисление,
		// предложить использовать результат последнего
		if (count > 0){
			System.out.println("Do you want to use the last result? yes/no");
		      useLastResult = reader.readLine();
		}
		//Запрос предыдущего результата и
		//использование в качестве первого аргумента
            if(useLastResult.equals("yes")){
			result = calc.getResult();
			first = result;
			System.out.println("1st arg = : " + form.format(result));
			calc.cleanResult();
		}
		else{
		calc.cleanResult();
		System.out.println("Enter first arg:");
		first = Double.parseDouble(reader.readLine());
		}
	System.out.println("Enter second arg:");
	second = Double.parseDouble(reader.readLine());
	calc.applyChoice(first, second);
	System.out.println(form.format(calc.getResult()));
	System.out.println(calc.getResult());
	System.out.println("Do you wanna continue? yes/no");
	continueWork = reader.readLine();
	count++;
	}
}
}
