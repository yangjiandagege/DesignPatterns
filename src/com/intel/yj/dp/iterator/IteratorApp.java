package com.intel.yj.dp.iterator;

import com.intel.yj.dp.Result;
/*迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
迭代器模式属于行为型模式。*/
public class IteratorApp {
/*我们将创建一个叙述导航方法的 Iterator 接口和一个返回迭代器的 Container 接口。实现了 Container 接口的实体类将负责实现 Iterator 接口。
IteratorPatternDemo，我们的演示类使用实体类 NamesRepository 来打印 NamesRepository 中存储为集合的 Names。*/
	public static void test() {
	      NameRepository namesRepository = new NameRepository();
	      
	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         Result.append("Name : " + name);
	      }
	}
}
