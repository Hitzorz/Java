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
}
