package com.design.pattern.order;

/***
 * ����ģʽ�� �����ϵͳ�У���Ϊ����������Ϊʵ����ͨ����һ�ֽ���ϵĹ�ϵ����ĳЩ���ϣ�������Ҫ����Ϊ���м�¼������������������ȴ���ʱ��
 * �����޷������仯�Ľ���ϵ���ƾͲ�̫���ʡ�
 * 
 * @author Administrator
 * 
 */

public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}