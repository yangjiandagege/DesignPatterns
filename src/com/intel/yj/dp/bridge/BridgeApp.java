package com.intel.yj.dp.bridge;
/*桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
  *这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。*/
public class BridgeApp {
/*我们有一个作为桥接实现的 DrawAPI 接口和实现了 DrawAPI 接口的实体类 RedCircle、GreenCircle。Shape 是一个抽象类，将使用 DrawAPI 的对象。
 * BridgePatternDemo，我们的演示类使用 Shape 类来画出不同颜色的圆。*/
	public static void test() {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
	 
	      redCircle.draw();
	      greenCircle.draw();
	}

}
