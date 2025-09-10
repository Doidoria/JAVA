package Ch17;

//덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스 정의
interface Calculator{
	int Calculator(int num1, int num2);
}
interface Calculator2{
	int Calculator2(int... numbers);
}
public class C03Lamda {

	public static void main(String[] args) {
		
		//덧셈 add
		Calculator add=(a,b)->a+b;
		
		//뺄셈 sub
//		Calculator sub=(a,b)->a-b;
		Calculator sub=(a,b)->a<b?b-a:a-b;
		
		//곱셈 mul
//		Calculator mul=(a,b)->a*b;
		Calculator mul=(a,b)->{return a*b;};
		
		//나눗셈 div
//		Calculator div=(a,b)->a/b;
		Calculator div=(a,b)->{return a>b?a/b:b/a;};
		
		System.out.println(add.Calculator(10,20));
		System.out.println(sub.Calculator(30,10));
		System.out.println(mul.Calculator(10,20));
		System.out.println(div.Calculator(100,5));
		
		
		//
		Calculator2 add2=(int... nums)->{
			int sum=0;
			for(int n : nums)
				sum+=n;
			return sum;
		};
		
		System.out.println(add2.Calculator2(10,20,10,50,60,70,80,90,100));
	}
}
