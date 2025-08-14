package Ch01;

import java.util.Scanner;

class Member{
	String name;
	String id;
	String password;
	
	Member(String name, String id){
		this.name=name;
		this.id=id;
	}
	
}

class MemberService{
	boolean login(String id, String password) {
		if("hong".equals(id)&&"1234".equals(password))
			return true;
		else
			return false;
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService=new MemberService();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ID, PASSWORD를 입력하세요. ");
		boolean result=memberService.login(sc.next(),sc.next());
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("아이디(id) 또는 비밀번호(password)가 틀렸습니다.");
		}
	}

}
