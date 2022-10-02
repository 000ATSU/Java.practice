
class SimpleClass {
	int x;
}

public class exchange {
	public static void main(String[] args) {
		SimpleClass a = new SimpleClass();
		SimpleClass b = new SimpleClass();

		a.x = 123;
		b.x = 456;

		b = a; //bの値として、aに格納されているアドレスが代入される

		System.out.println(b.x);
	}
}
