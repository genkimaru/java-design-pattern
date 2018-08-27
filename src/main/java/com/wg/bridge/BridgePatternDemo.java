package com.wg.bridge;

/***
 * 桥接模式： 该模式的核心在于对于含有两个维度以上的实体类，如何
 * 
 * @author Administrator
 * 
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		RedColor red = new RedColor();
		BlueColor blue = new BlueColor();

		Shape circle = new CircleShape(red);
		Shape ellipse = new EllipseShape(blue);

		circle.show();
		ellipse.show();
	}

}
