package com.design.pattern.bridge;

/***
 * �Ž�ģʽ�� ��ģʽ�ĺ������ڶ��ں�������ά�����ϵ�ʵ���࣬���
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
