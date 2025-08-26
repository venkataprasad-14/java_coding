package javaPractice;

public class TestMethodOverLoading {
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	float add(float a,int b) {
		float c=a+b;
		return c;
	}
	public static void main(String[] args) {
		TestMethodOverLoading obj =new TestMethodOverLoading();
		System.out.println(obj.add(5,6));
		System.out.println(obj.add(1.0f, 10));
	}

}
