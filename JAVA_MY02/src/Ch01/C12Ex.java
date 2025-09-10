package Ch01;

class Buyer2{
	private int Mymoney;
	private int appleCnt;
	
	public Buyer2(int mymoney, int appleCnt) {
		super();
		Mymoney = mymoney;
		this.appleCnt = appleCnt;
	}

	@Override
	public String toString() {
		return "Buyer2 [Mymoney=" + Mymoney + ", appleCnt=" + appleCnt + "]";
	}
	
	public void payment(Seller2 사과장수,int money) {
		this.Mymoney-=money;
		int cnt=사과장수.receive(money);
		this.appleCnt+=cnt;
	}
}

class Seller2{
	private int myMoney;
	private int appleCnt;
	private int price;
	
	public Seller2(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Seller2 [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	
	public int receive(int money) {
		this.myMoney+=money;
		int cnt=money/this.price;
		this.appleCnt-=cnt;
		return cnt;
	}
	
}

public class C12Ex {

	public static void main(String[] args) {
		Buyer2 홍길동=new Buyer2(10000,0);
		Buyer2 티모=new Buyer2(20000,0);
		
		Seller2 사과장수1=new Seller2(50000,100,1000);
		
		홍길동.payment(사과장수1, 3000);
		티모.payment(사과장수1, 8000);
		
		System.out.println(홍길동);System.out.println("-----");
		System.out.println(티모);System.out.println("-----");
		System.out.println(사과장수1);
		
	}

}
