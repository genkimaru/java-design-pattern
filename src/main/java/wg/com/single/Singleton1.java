package wg.com.single;


/***
 * ±¥ºº·¨
 * @author Administrator
 *
 */
public class Singleton1 {

	private static Singleton1 s = new  Singleton1();
	Singleton1() {
		super();
	}
	
	public static Singleton1 getSingleton1(){
		return s;
	}
	
	
	
	
}
