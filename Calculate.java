import java.text.DecimalFormat;
public class Calculate{
      
 public static void main(String[] arg){
     
	double first = Double.parseDouble(arg[0]);
	double second = Double.parseDouble(arg[2]);
        Calculate calc = new Calculate();
	DecimalFormat format = new DecimalFormat();


      
	if (arg[1].equals("+")){
          System.out.printf("%.0f \n",calc.sum(first, second));
 	  
        }
	
	else if (arg[1].equals("-")){
          System.out.printf("%.0f \n",calc.difference(first, second));
          
        }
        
	else if (arg[1].equals("/")){
           System.out.printf("%.0f \n",calc.division(first, second));
	}
	
	else if (arg[1].equals("*")){
	   System.out.printf(format.format(calc.multiplication(first, second)));
	}

	else if (arg[1].equals("^")){
	        System.out.printf("%.0f \n",calc.power(first, second));
	}
	                
	else {
        System.out.println("Недопустимая операция");
	}
     }

public double sum(double a, double b){
   return a+b;
}

public  double difference(double a, double b){
   return a - b;
}

public double division(double a, double b){
   return  a / b ;
}

public double multiplication(double a, double b){
   return a * b;
}

public double power(double a, double b){
     return Math.pow(a, b);
}



}