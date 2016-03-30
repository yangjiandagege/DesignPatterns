package com.intel.yj.designpatterns.composite;

import com.intel.yj.designpatterns.Result;
/*组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。*/
public class CompositeApp {
/*我们有一个类 Employee，该类被当作组合模型类。CompositePatternDemo，我们的演示类使用 Employee 类来添加部门层次结构，并打印所有员工。*/
	public static void test() {
	      Employee CEO = new Employee("John","CEO", 30000);
	      
	      Employee headSales = new Employee("Robert","Head Sales", 20000);
	 
	      Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
	 
	      Employee clerk1 = new Employee("Laura","Marketing", 10000);
	      Employee clerk2 = new Employee("Bob","Marketing", 10000);
	 
	      Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
	 
	      CEO.add(headSales);
	      CEO.add(headMarketing);
	 
	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);
	 
	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);
	 
	      //打印该组织的所有员工
	      Result.append(CEO.toString());
	      for (Employee headEmployee : CEO.getSubordinates()) {
	    	  Result.append(headEmployee.toString());
	         for (Employee employee : headEmployee.getSubordinates()) {
	        	 Result.append(employee.toString());
	         }
	      }
	}

}
