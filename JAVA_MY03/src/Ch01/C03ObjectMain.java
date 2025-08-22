package Ch01;

import java.util.Objects;

class C03Simple{
	int n;
	C03Simple(int n){
		this.n = n;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C03Simple) {		
			C03Simple down=(C03Simple)obj;	
			return this.n==down.n;			
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.n); // ex) 패스워드 암호화, 메시지 암호화 (해시값)
	}
	
}

public class C03ObjectMain {

	public static void main(String[] args) {
		C03Simple ob1=new C03Simple(10);
		System.out.println(ob1.toString());
		System.out.printf("%x \n",ob1.hashCode());
	}
}
