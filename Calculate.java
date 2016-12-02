public class Calculate{
      
 public static void main(String[] arg){
     
	int first = Integer.parseInt(arg[0]);
	int second = Integer.parseInt(arg[2]);
        Operations oper = new Operations();
      
	if (arg[1].equals("+")){
          System.out.println(oper.sum(first, second));
 	  
        }
	
	else if (arg[1].equals("-")){
          System.out.println(oper.difference(first, second));
          
        }
        
	else if (arg[1].equals("/")){
           System.out.println(oper.division(first, second));
	}
	
	else if (arg[1].equals("*")){
	   System.out.println(oper.multiplication(first, second));
	}

	else if (arg[1].equals("^")){
		if(second >= 0){
			System.out.printf("%.0f \n",oper.power(first, second));
		}
		else{ 
	        System.out.println(oper.power(first, second));
		}
	        }
	
        
	else {
        System.out.println("Недопустимая операция");
	}
     }
}
 class Operations{

public int sum(int a, int b){
   return a+b;
}

public  int difference(int a, int b){
   return a - b;
}

public double division(int a, int b){
   return (double) a / b ;
}

public int multiplication(int a, int b){
   return a * b;
}

public double power(int a, int b){
     double result = 0;
     if ( b == 0 ){
        result = 1;
     }   

     if ( b == 1 ){
	result = a;
     }

     if ( b > 1 ){
	result = a;
	for ( int i = 0; i < b-1; i++){
		result = result * a;     
	}
     }
	
     if ( b < 0){
        result = a;
	for ( int i = b; i < -1; i++){
		result = result * a;
	}
	result = 1.0 / result ;
}
return result ;
}

}