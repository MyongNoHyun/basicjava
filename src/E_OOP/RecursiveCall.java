package E_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
		
		long result1 = 1;
		int num = 26; 
		for(int i=num;i>0;i--){
			result1 *=(long) i;
		}
		System.out.println(result1);
		
		
		
		long result = factorial(4);
		System.out.println(result);
		
	}
	
	static long factorial(int num){
		long result = 0L;
		if (num == 1){
			result =1;
		} else {
			result = num*factorial(num-1);
		}
		return result;
	}
	
	
}
