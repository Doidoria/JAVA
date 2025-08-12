package Ch05;

public class C07IncDesArith {
	public static void main(String[] args) {
		int a=5, b=6, c=10, d;
		boolean e;
		d=++a*b--; //6*6 -> d=36 -> b=5
		System.out.printf("a = %d, b = %d, d = %d\n", a, b, d); //6 5 36
		d=a++ + ++c - b--; //6+11-5 -> d=12
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d); //7 4 11 12 
		a=1;
		b=0;
		e=(a++>0)||((b*d/c)>0);
		System.out.printf("a = %d, b = %d, c = %d, d = %d ,e = %b\n", a, b, c, d , e);
	}
}	