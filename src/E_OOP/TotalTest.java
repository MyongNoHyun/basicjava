package E_OOP;

public class TotalTest {
	//TotalTest라는 클래스가 실행되므로 Method Area(이하 M.S)에 클래스의 친구들인 클래스 변수와 클래스 메서드가 호출된다.
	// 클래스변수와 클래스메서드는 static으로 구분되며 클래스 변수늘 없고 클래스 매서드는 main()이 로딩된다
	public static void main(String[] args) {
		//call stack(c.s)에 main()가 쌓인다

		TvMaker.color = "Blue"; 
		//TvMaker.라는 클래스를 불러와 M.A에 로딩되고 TvMarker의 클래스변수와 클래스 메서드를 로딩한다
		//TvMaker의 클래스변수는 color, inch가 있고 클래스 매서드는 없다
		//color는 기본값인 null을 가지고 있다 
		//TvMaker 멤버변수 color에 Blue를 초기화한다 
		TvMaker tm = new TvMaker();
		//TvMaker는 클래스를 불러오기위해 매서드 에리어에 가버보면 이미 로딩이 되어있다
		//main메서드의 지역변수인 tm을 M.S의 main()안에 적는다
		// new는 인스턴스화한다는 의미 이고 tm의 주소를 heap에 생성 인스턴스 친구들인 인스턴스 변수와 인스턴스 메서드를 로딩한다
		// 인스턴스 변수는 name age 가있고 초기값을 설정해준다. 인스턴스 매서드는 TvMarker(),TvMarker(srting,int)가있다
		// heap에있는 tm의 주소를 tm에 넣어준다
		tm.age = 30; //tm의 주소를 호출하고 인스턴스변수인 age에 30을 초기화해준다
		// 3. 메서드 호출
		// 3.1 TvControll는 클래스가 M.S에 있는지 확인, 없으므로 TvControll를 M.S애 로딩하는데 친구들인 클래스 변수와 클래스메서드를 같이 써준다
		// 클래스 변수 channel 클래스 메서드volumeDown()
		// channel의 기본값은 15이므로 15가 출력된다
		System.out.println(TvControll.channel);
		TvControll.volumeDown();
		//이미위에서 M.S에 로딩되어있기 때문에 volumeDown()을 c.s에 쌓고 if문을 실행 현재 channel의 값은 15이므로 ++을해 16으로 초기화된다 
		System.out.println(TvControll.channel);
		//16으로 초기화 됬기 때문에 16이 출력된다
		// 3.2-1+
		TvControll tc; //
		tc = new TvControll(); //
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		//
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1. TvMaker의 멤버변수
	// 1.1 클래스변수 
	static String color;
	static int inch;
	// 1.2 인스턴스변수
	String name = "";
	int age;

	// 2.기본생성자
	// 2.1 TvMarker은 오버로딩이다 조건은 클래스명과 매서드명이 같고 매개변수의 개수 또는 타입이 달라야한다 리턴 타입은 관계없다		-1
	TvMaker() {
		this("man", 25);
	}

	// 2.2매개변수가 있는 생성자
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;	//상수
	final int MIN_VOLUME = 0;	//상수
	static final int MAX_CHANNEL = 50;	//상수
	static final int MIN_CHANNEL = 1;	//상수

	static int channel = 15;
	int volume = 99;

	// 4. return문 매서드내에서 저장된값을 돌려준다
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.	-1
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}