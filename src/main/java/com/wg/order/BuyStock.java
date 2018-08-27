package com.wg.order;
/***
 * 具体的命令会与执行者想耦合。
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
