package D_array;

public class Array_02 {
	public static void main(String[] args) {
		/*
		1. 정렬
			-어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터들을 가지런히 나열하는 작업
			- 버블 정렬, 삽입정력, 선택정렬

		2.버블정렬(bubble sort)
			-인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
			-회전이 진행됨에 따라 가장 큰값이 두로 보내어진다.
		
		 */
		
		//1. 5,2,3,1,4 숫자 5개를 저장할수 있는 변수를 선언 및 생성하세요
		int[] roll = {5,2,3,1,4};
		//2. 1회전만 진행하세요
//		5	2	3	1	4
//		2	5	3	1	4
//		2	3	5	1	4
//		2	3	1	5	4
//		2	3	1	4	5
//		if (roll[0]>roll[1]){
//			int min = roll[0];
//			roll[0] = roll[1];
//			roll[1] = min;
//		} 
//		if (roll[1]>roll[2]){
//			int min = roll[1];
//			roll[1] = roll[2];
//			roll[2] = min;
//		} 
//		if (roll[2]>roll[3]){
//			int min = roll[2];
//			roll[2] = roll[3];
//			roll[3] = min;
//		} 
//		if (roll[3]>roll[4]){
//			int min = roll[3];
//			roll[4] = roll[3];
//			roll[4] = min;
//		} 
//		if (roll[4]>roll[5]){
//			int min = roll[4];
//			roll[4] = roll[5];
//			roll[5] = min;
//		} 
//		
//		System.out.println(1+"회");
//		for(int i=0;i<roll.length-1;i++){
//			if(roll[i]>roll[i+1]){
//				int min =roll[i];
//				roll[i] = roll[i+1];
//				roll[i+1] = min;
//			} 
//			System.out.print(roll[0]+",");
//				for(int j=1; j<roll.length;j++){
//					System.out.print(roll[j]+",");
//				}
//				System.out.println();
//		}
//		//2회전
//		System.out.println(2+"회");
//		for(int i=0;i<roll.length-1;i++){
//			if(roll[i]>roll[i+1]){
//				int min =roll[i];
//				roll[i] = roll[i+1];
//				roll[i+1] = min;
//			} 
//			System.out.print(roll[0]+",");
//				for(int j=1; j<roll.length;j++){
//					System.out.print(roll[j]+",");
//				}
//				System.out.println();
//		}
//		System.out.println(3+"회");
//		for(int i=0;i<roll.length-1;i++){
//			if(roll[i]>roll[i+1]){
//				int min =roll[i];
//				roll[i] = roll[i+1];
//				roll[i+1] = min;
//			} 
//			System.out.print(roll[0]+",");
//				for(int j=1; j<roll.length;j++){
//					System.out.print(roll[j]+",");
//				}
//				System.out.println();
//		}
//		
//		
//		System.out.println(4+"회");
//		for(int i=0;i<roll.length-1;i++){
//			if(roll[i]>roll[i+1]){
//				int min =roll[i];
//				roll[i] = roll[i+1];
//				roll[i+1] = min;
//			} 
//			System.out.print(roll[0]+",");
//				for(int j=1; j<roll.length;j++){
//					System.out.print(roll[j]+",");
//				}
//				System.out.println();
//		}
		
		
		
//		for (int k=0;k<roll.length-1;k++){
//			System.out.println((k+1)+"회:");
//			for(int i=0;i<roll.length-1-k;i++){
//				if(roll[i]>roll[i+1]){
//					int min =roll[i];
//					roll[i] = roll[i+1];
//					roll[i+1] = min;
//				} 
//				for(int j=0; j<roll.length;j++){
//				System.out.print(roll[j]);
//				System.out.print("    ");
//				}
//				System.out.println();
//			}
//			
//		}
//		
		/*
		 3. 선택정렬 (Select sort)
		 	- 정렬의 대상에서 최솟값을 찾아서 맨앖으 내용과 교체하는 방식이다,
		 	- 회전이 진행됨에 따라 가장 작은 값이 앞에 확정된다.
		 */
		
		int min=roll[0];
		int minIndex = 0;
		for(int i=1;i<roll.length;i++){
			if(min>roll[i]){
				min = roll[i];
				minIndex=i;
			}
		}
		
		int temp = roll[0];
		roll[0] = roll[minIndex];
		roll[minIndex] = temp;
		
		for(int i=0;i<roll.length;i++){
		System.out.print(roll[i]+"/");
		}
		
		int min1=roll[1];
		
		for(int i=2;i<roll.length;i++){
			if(min>roll[i]){
				min=roll[i];
			}
		}
	
	
	}
}