import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Calculator {
      // Результат вычисления 
	private  double result ;
	// Cложение
	public void add(double a, double b){
		 this.result = a + b;	
	}
	// Умножение
	public void multi( double a,  double b){
		this.result = a * b;
	}
	// Вычитание
	public void diff(double a, double b){
		this.result = a - b ;	
	}
	// Деление
	public void division(double a, double b){
		this.result = a / b;	
	}
	//Возведение в степень
	public void power(double a, double b){ 
		this.result = Math.pow(a, b);
	}
	// Получить результат
	public double getResult(){
		return this.result;
	}
	// Очистить результат
	public void cleanResult(){
		this.result = 0;
	}
	// Выполнение выбранного действия
	public void applyChoice(double a, double b) throws IOException{
		
		switch(getChoice()){
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
				   applyChoice(a, b);
		}
	}
	// Выбор действия пользователем
	public String getChoice() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose action : +,-,*,/,^ ");
			return reader.readLine(); 
	}
}
