package wg.com.single;
/***
 * ¶öºº·¨
 * @author Administrator
 *
 */
public class Singleton2 {
	private static Singleton2 s ;
	private Singleton2(){
		super();
	}

	
	public  static Singleton2 getSingleton2(){
		if(s == null){
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s = new Singleton2();
			
		}
		return s;
	}

}
