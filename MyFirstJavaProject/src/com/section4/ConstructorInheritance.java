package com.section4;

/** 
 * * Base class constructor invocation using super.
 *    -- should be the first statement in the subclass constructor
 *     - If not selected by default super() is selected. 
 */

class Point2D {
	protected int x,y;
	public Point2D()  {}
	public Point2D(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.printf("(%d,%d) \n",x,y);
	}
}
class Point3D {
	private int z;
	public Point3D()  {
		super();
	}
	public Point3D(int x,int y,int z) {
		super(x,y);  //Should be the first statements		
		this.z=z;
		
	}
	//@override
	public void print() {
	//	System.out.printf("(%d,%d,%d) \n",x,y,z);
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		Point2D p1=new Point2D(10,20);
		p1.print();
		System.out.println();
		Point3D p2=new Point3D(10,20,30);
		p2.print();

	}

}
