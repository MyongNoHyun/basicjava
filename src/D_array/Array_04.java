package D_array;

public class Array_04 {
	public static void main(String[] args) {
		//1. 6명의 7과목을 저장할수 있는 변수 score를 선언 및 생성해주세요
		String[] name = {"이종선","이승환","박찬근","정필지","정창훈","김선구"};
		String[] sub = {"국어","영어","수학","사회","과학","oracle","java"};
		int[][] score=new int[name.length][sub.length];
		//2. score의 각방을 0~100점 사이의 랜덤한 정수값을 저장해주세요
		for (int i=0; i<score.length;i++){//사람에게 램덤점수넣기
			for (int j=0; j<score[i].length; j++){
				score[i][j]= (int)(Math.random()*101);
			}
		}
		
		int[] sum = new int[name.length];//사람별 합계
		for(int i=0;i<name.length;i++){
			for(int j=0;j<sub.length;j++){
				sum[i] += score[i][j];
			}
		}
		
		float[] ave = new float[name.length]; //사람별평균
		for(int i=0;i<name.length;i++){
			ave[i] = (int) ((float) sum[i] / sub.length * 100 + 0.5)/100f;
		}
		
		int[] sum1 = new int[sub.length];//과목별 합계
		for(int i=0;i<sub.length;i++){
			for(int j=0;j<name.length;j++){
				sum1[i] += score[j][i];
			}
		}
		
		float[] ave1 = new float[sub.length];//과목별 평균
		for(int i=0;i<sub.length;i++){
			ave1[i] = (int) ((float) sum1[i]/ name.length * 100 +0.5)/100f;
		}
		
		int[] rank = new int[name.length];//석차구하기
		for(int i=0;i<name.length;i++){
			rank[i]++;
			for(int j=0;j<name.length;j++){
				if(sum[i]<sum[j]){
					rank[i]++;
				}
			}
		}

		//3. 출력하시오
		for(int i=0;i<sub.length;i++){
			System.out.print("\t"+sub[i]);
		}
		System.out.print("\t합계");
		System.out.print("\t평균");
		System.out.print("\t석차");
		System.out.println();
	
		
		for (int i=0; i<score.length;i++){
			System.out.print(name[i]+"\t:");
			for (int j=0; j<score[i].length; j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i]);
			System.out.print("\t"+ave[i]);
			System.out.print("\t"+rank[i]);
			System.out.println();
		}
		System.out.print("과목합\t:");
		for(int i=0;i<sub.length;i++){
			System.out.print(sum1[i]+"\t");
		}
		System.out.println();
		System.out.print("과목평균\t:");
		for(int i=0;i<sub.length;i++){
			System.out.print(ave1[i]+"\t");
		}
		
		System.out.println();
		System.out.println("==================================================================================================");
		
		
		
		for(int i=0;i<name.length;i++){
			for(int j=0;j<name.length-1-i;j++){
				int tmp=0;
				if(sum[j]<sum[j+1]){
					tmp=sum[j];
					sum[j]=sum[j+1];
					sum[j+1]=tmp;
				
			
				}
			}
		}
		
		
		
		
		
		for(int i=0;i<sub.length;i++){//윗줄
			System.out.print("\t"+sub[i]);
		}
		System.out.print("\t합계");
		System.out.print("\t평균");
		System.out.print("\t석차");
		System.out.println();
	
		
		for (int i=0; i<score.length;i++){//이름:점수
			System.out.print(name[i]+"\t:");
			for (int j=0; j<score[i].length; j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i]);
			System.out.print("\t"+ave[i]);
			System.out.print("\t"+rank[i]);
			System.out.println();
		}
		
		
		System.out.print("과목합\t:");//이름밑
		for(int i=0;i<sub.length;i++){
			System.out.print(sum1[i]+"\t");
		}
		System.out.println();
		System.out.print("과목평균\t:");
		for(int i=0;i<sub.length;i++){
			System.out.print(ave1[i]+"\t");
		}
		
		
		
	}
}
