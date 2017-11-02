package JavaGeneral;

public class Earlier_print_than_mainMethod {
	
	/**
	 * 在Java中，main() 方法是程序的入口方法，在程序运行时，最先加载的就是main() 方法。
	 * 但！不意味着main() 方法就是程序运行时第一个执行的模块。
	 * ：在Java中静态块在累被加载时就会被调用，如下
	 * 由于静态块 不管顺序如何，都会在main() 方法执行之前执行，因此不管静态块 放在何处都会比main() 方法先执行。
	 * 
	 */
	static{
		System.out.println("First print");
	}
	public static void main(String[] args) {
		System.out.println("Second print");
	}
	static{
		System.out.println("First print 2");
	}
}
