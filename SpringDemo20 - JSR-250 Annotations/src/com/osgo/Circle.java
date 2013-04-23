package com.osgo;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Circle implements Shape
{
	private Point centre;
	
	public void draw()
	{
		System.out.println("Drawing Circle.");
		System.out.println("Circle with centre point at:" +"(" + centre.getX() + ", " + centre.getY() + ")" );
		
	} // end method draw

	public Point getCentre()
	{
		return centre;
	} // end method getCentre

	@Resource(name="pointC")
	// @Resource annotation can do a standard dependency injection byName
	public void setCentre(Point centre)
	{
		this.centre = centre;
	} // end method setCentre

	@PostConstruct
	// method executed when bean is initialised
	public void initialiseCircle()
	{
		System.out.println("Initialisation of Circle");
	} // end method initialiseCircle
	
	@PreDestroy
	// method executed when the bean is about to be destroyed
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle");
	} // end method destroyCircle
	
} // end Class Circle
