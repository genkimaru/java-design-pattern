package com.design.pattern.order;

import java.util.ArrayList;
import java.util.List;
/***
 * ����ķ����ߡ�
 * @author Administrator
 *
 */
   public class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public void placeOrders(){
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}