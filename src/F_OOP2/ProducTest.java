package F_OOP2;

import java.util.Vector;

public class ProducTest {
	public static void main(String[] args) {
		Tv2 t2 = new Tv2("LGTV",700);
//		System.out.println(t2);
		NoteBook nb = new NoteBook("Mac",400);
		MicrowWave mw = new MicrowWave("LG렌지", 200);
		
		Buyer b = new Buyer("이상엽",10000);
		
		b.buy(t2);
		b.buy(nb);
		b.buy(mw);
		
		//호갱님의 잔여금은 xx이고 보너스 포인트는 xxx입니다
		System.out.println("처음산 물품"+b.item.get(2));
		
		System.out.println("호갱임의 남은돈:"+b.money);
		System.out.println("호갱임의 포인트:"+b.bonusPoint);
		b.refund1(nb);
		
		b.summary();
		
		
	}
}

class Product{
	String name;
	int price;
	int bonusPoint;
	
	Product(String name,int price){
		this.name = name;
		this.price = price;
		bonusPoint = price/10; 
	}
	
}

class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() {
		return name;
	}
	
}
class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
class MicrowWave extends Product{
	MicrowWave(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	
	
}

class Buyer{
	String name;
	int money;
	int bonusPoint;
//	Vector item = new Vector(); //아래와 같이 해주면 형변환 필요없음 167확인
	Vector<Product> item = new Vector<Product>();
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈없음꺼지시지요");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구매하셨습니다");
		item.add(p);
		System.out.println("호갱임의 남은돈:"+money);
		System.out.println("호갱임의 포인트:"+bonusPoint);
	}
	//1. 반품 refund
	//	 구매물품이 없으면 "구매하신 물품이 없습니다."
	//	 구매물품은 있으나 우리 매장에서 산게 아니다
	void refund(Product p){
		if(item.remove(p)){
			money +=p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다");
			item.remove(p);
			System.out.println("호갱임의 남은돈:"+money);
			System.out.println("호갱임의 포인트:"+bonusPoint);
			return;
		} else{
			System.out.println("구매한 물건없다 멍멍이수작부리지마라");
		}
			
	}
	void refund1 (Product p){
		if(item.isEmpty()){
			System.out.println("구매하신 물품이 없습니다");
			return;
		}
//		for (int i = 0; i < item.size(); i++) {
//			if (item.get(i)==p)
//				Product p2 = (Product) item.remove(i);
//				money +=p.price;
//				bonusPoint -= p.bonusPoint;
//				System.out.println(p2+"를 반품");
//				retrun;
//		}
		if(item.contains(p)){ //반품할려고 하는 객체를 포함하고 있으면 ture
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품");
			return;
		} else {
			System.out.println("that's nono");
		}
	}
	//2. 영수증 summary
	/*
		영	수	증
	 	
	구매물품 	LGTV 		700만원
	 		Mac			400만원
	 		LG전자레인지	200만원
	총 구매 금액 			1300만원
	
	고객님의 남은돈			8700만원
		   포인트			130만원
		 
	또 오십시요 호갱님아
	 
	 */
	void summary(){
		if(item.isEmpty()){
			System.out.println("산것도 없으면서 왠 영수증을 찾아??");
			return;
		}
		System.out.println("영\t"+"수\t"+"증");
		System.out.println();
		System.out.print("구매물품");
		int sum = 0;
		for (int i = 0; i < item.size(); i++) {
//			Product p =(Product) item.get(i);
//			System.out.println("\t"+p+"\t"+p.price);
			System.out.println("\t"+item.get(i).name+"\t"+((Product)item.get(i)).price+"만원");
			sum =((Product)item.get(i)).price;
		}
//		int sum =0;
//		for (int i = 0; i < item.size(); i++) {
//			Product p =(Product) item.get(i);
//			sum+=p.price;		
//		}
		System.out.println("총 구매 금액\t"+sum+"만원");
		System.out.println();
		System.out.println("고객님의 남은돈\t"+this.money+"만원");
		System.out.println("\t"+"\t"+this.bonusPoint+"포인트");
		System.out.println();
		System.out.println("또 오세요 호갱님");
		
	}
	
}
//3. 사람여러병을 관리할수 있는 클래스를 작성해주세요
// 사람은 이름으로 구분

//4. 물품을 관리할수 있는 클래스를 만드세요
