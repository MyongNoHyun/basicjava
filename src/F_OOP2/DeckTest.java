package F_OOP2;

import java.util.Arrays;
import java.util.Scanner;

public class DeckTest {
	public static void main(String[] args) {
//		Card c = new Card();
//		Card c2 = new Card(2,5);
//		System.out.println(c.toString());	//SPADE, A
//		System.out.println(c2);	//DIAMOND, 5 
		//Deck객체를 만들어주세요
		Deck de = new Deck();
		// 4,5,6,7번에서 만들어진 매서드를 호출해주세요
		System.out.println(Arrays.toString(de.c));
		System.out.println(de.pick(10));
		System.out.println(de.pick());
		de.shuffle();
		System.out.println(Arrays.toString(de.c));
		de.shuffle(55);
		System.out.println(Arrays.toString(de.c));
		
		//JVM을 그리세요
		
		
	}
}

class Card{
	static final int KIND_MAX = 4; //카드 무늬수
	static final int NUM_MAX = 13; //무늬별 카드수 //구구단
	
	static final int SPADE=1;
	static final int DIAMOND=2;
	static final int HEART=3;
	static final int CLOVER=4;

	int kind;
	int number;
	
	//1. 매개변수가 두개인 생성자를 만들어주세요
	Card(int kind, int number){
		this.kind=kind;
		this.number=number;
	}
	//2. 기본생성자를 만들어주세요
	//	단 매개변수가 두개인 생성자를 이용하여 1,1로 만들어주세요
	Card(){
		this(SPADE,1);
	}
	
	@Override
	public String toString(){
		String kind="";
		String number="";
		
		switch (this.kind){
		case 1:
			kind ="SPADE";
			break;
		case 2:
			kind ="DIAMOND";
			break;
		case 3:
			kind ="HEART";
			break;
		default:
			kind ="CLOVER";
			break;
		}
		
		switch(this.number){
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number = this.number+"";
			break;
		}
		return kind +","+number;
	}
	
	
}

class Deck{
	//1. 카드의 수량을 저장할수 잇는 변수 CARD_NUM 선언및 초기화해주세요
	//	단. 초기화시 Card클래스의 상수를 이용해주세요 
	final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX;
	//2. 카드 52장을 저장하수 있는 변수 c를 선언 및 생성해 주세요
	//	단. CARD_NUM을 이용해주세요
	Card[] c= new Card[CARD_NUM];
	//3. 기본생성자를 만들어주세요
	//	c의 각방을 카드로 채워주세요
	Deck(){
		int n=0;
		for (int i =1 ;i<Card.KIND_MAX+1;i++){
			for (int j =1 ;j<Card.NUM_MAX+1;j++){
				c[n]= new Card(i,j);
				n++;
			}
		}
	}
	//4. 입력받은 방번호의 카드를 반환하는 매서드를 만드세요 pick //1차원 배열
	Card pick(int a){
		return c[a];
	}
	//5. 랜덤한 방의 카드 한장을 반환하는 매서드를 만들어주세요 pick
	//	단. 4번에서 만든 pick매서드를 이용하세요
	Card pick(){
		return this.c[(int)(Math.random()*CARD_NUM)];
	}
	
	//6. 카드를 섞어주세요	shuffle
	//	단. 연습문제 5-8의 형태로 섞어주세요
	void shuffle(){
		for (int i = 0; i < CARD_NUM; i++) {
			int j = (int)(Math.random() * CARD_NUM);
			Card tmp;
			tmp= this.c[i];
			this.c[i]=this.c[j];
			this.c[j]= tmp;
		}
	}
	//7. 카드를 섞어주세요 shuffle
	//	단. 랜덤방 두개를 교환하는 방식으로 사용자로부터 입력받은 수만큼 
	void shuffle(int num){
		for(int k=0;k<num;k++){
		int i = (int)(Math.random() * CARD_NUM);
		int j = (int)(Math.random() * CARD_NUM);
		Card tmp;
		tmp = this.c[i];
		this.c[i]=this.c[j];
		this.c[j]=tmp;
		}
	}
	
	
	
	
	
	
	
	
}






