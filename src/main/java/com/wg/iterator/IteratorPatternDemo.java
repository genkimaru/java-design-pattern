package com.wg.iterator;

/***
 * 迭代器设计模式用于数据容器，也就是集合类，通过迭代器去访问底层的数据结构。
 * @author Administrator
 *
 */

public class IteratorPatternDemo {
	
	   public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}