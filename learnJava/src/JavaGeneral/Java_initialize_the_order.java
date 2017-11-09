package JavaGeneral;

/**
 * Java中不同类型的代码块执行的顺序
 * 1. 父类静态变量
 * 2. 父类静态变量代码块
 * 3. 子类静态变量
 * 4. 子类静态变量代码块
 * 5. 父类非静态变量
 * 6. 父类非静态变量代码块
 * 7. 父类构造函数
 * 8. 子类非静态变量
 * 9. 子类非静态变量代码块
 * 10.子类构造函数 
 * 
 */

//class Base{
//	static{
//		System.out.println("Base static block");
//	}
//	{
//		System.out.println("Base block");
//	}
//	public Base(){
//		System.out.println("Base constructor");
//	}
//	static{
//		System.out.println("static Base static block");
//	}
//}
//
//
//public class Java_initialize_the_order extends Base{
//	
//	static{
//		System.out.println("Derived static block");
//	}
//	{
//		System.out.println("Derived block");
//	}
//	public Java_initialize_the_order(){
//		System.out.println("Derived constructor");
//	}
//	public static void main(String[] args){
//		new Java_initialize_the_order();
//	}	
//}


class B extends Object{
	static{
		System.out.println("Load B1");
	}
	public B(){
		System.out.println("Create B3");
	}
	static{
		System.out.println("Load B2");
	}
}
class A extends B{
	static{
		System.out.println("Load B4");
	}
	public A(){
		System.out.println("Creade A");
	}
	static{
		System.out.println("Creade A");
	}
}

public class Java_initialize_the_order{
	public static void main(String[] args){
		new A();
	}
}
