package com.osgo;

public class Triangle implements Shape
{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA()
	{
		return pointA;
	} // end method getPointA

	public void setPointA(Point pointA)
	{
		this.pointA = pointA;
	} // end method setPointA

	public Point getPointB()
	{
		return pointB;
	} // end method getPointB

	public void setPointB(Point pointB)
	{
		this.pointB = pointB;
	} // end method setPointB

	public Point getPointC()
	{
		return pointC;
	} // end method getPointC

	public void setPointC(Point pointC)
	{
		this.pointC = pointC;
	} // end method setPointC
	
	public void draw()
	{		
		System.out.println("Drawing Triangle.");
		System.out.println("Point A = (" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + "," + getPointC().getY() + ")");
		
	} // end method draw()
	
} // end Class Triangle
