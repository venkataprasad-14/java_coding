package javaPractice;

public class SingleInheritence2 extends SingleInheritence {
	void hi(){
		System.out.println("Hello Hi");
	}
public static void main(String[] args) {
	SingleInheritence  obj2= new SingleInheritence2();
	 obj2.hi();
	 obj2.bye();
	}

}
