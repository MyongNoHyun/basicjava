package Z_Exercises_01;

public class Homework {
	public static void main(String[] args) {
		
		int[] r= new int[6];
		for(int k=0;k<r.length;k++){
			System.out.println(k+1+"회차");
				for(int i=0; i<r.length;i++){
					r[i] = (int)(Math.random()*45+1);
					for(int j=0; j<i;j++){
						if(r[i]==r[j]){
							i--;
							break;
						}
					}
				}
				
				for(int i=0; i<r.length;i++){
					System.out.print(i+1);
					System.out.print("번째 숫자입니다:");
					System.out.print(r[i]);
					System.out.print("	");
				}
				System.out.println();
				System.out.println();
		}
	
	
	
	
	
	
	
	}
}
