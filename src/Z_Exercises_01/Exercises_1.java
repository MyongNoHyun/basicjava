package Z_Exercises_01;

import java.util.Arrays;


class MyPoint {
	int x;
	int y;
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//(1) 인스턴스메서드 getDistance를 작성하시오.
	double getDistance(int x, int y) {

		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y, 2));
	}
}


class Exercises_1 {
	public static void main(String[] args){

			MyPoint p = new MyPoint(1,1);
			// p와 (2,2)의 거리를 구한다.
			System.out.println(p.getDistance(2,2));
		
	}
}