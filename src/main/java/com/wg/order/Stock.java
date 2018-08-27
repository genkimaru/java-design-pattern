package com.wg.order;
/***
 * 实际命令的执行者
 * @author Administrator
 *
 */
public class Stock {

	private String name = "ABC";
	private int quantity = 10;

	public void buy(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	   }

	public void sell(){
	      System.out.println("Stock [ Name: "+name+",  Quantity: " + quantity +" ] sold");
	   }
}