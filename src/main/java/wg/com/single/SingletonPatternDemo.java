package wg.com.single;

import java.util.Currency;

public class SingletonPatternDemo implements Runnable{

	public static void main(String[] args) throws InterruptedException {

/*		Singleton1 s1 = Singleton1.getSingleton1();
		Singleton1 s2 = Singleton1.getSingleton1();
		System.out.println(s1 == s2);*/
		SingletonPatternDemo singletonPatternDemo = new SingletonPatternDemo();
		Thread thread1 = new Thread( singletonPatternDemo);
		//thread1.setDaemon(true);
		thread1.start();
		thread1.join();
		Thread thread2 = new Thread(singletonPatternDemo);
		thread2.start();
		thread2.join();
		System.out.println(Thread.currentThread().getName());

	}

	@Override
	public void run() {
		Singleton2 singleton2 = Singleton2.getSingleton2();
		System.out.println(Thread.currentThread().getName());
	}
}
