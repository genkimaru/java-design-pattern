package com.wg.order;
/***
 * ������������ִ��������ϡ�
 * @author Administrator
 *
 */

public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}