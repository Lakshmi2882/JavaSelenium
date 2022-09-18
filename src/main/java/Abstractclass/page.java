package Abstractclass;
//abstract class object cannot be created
public abstract class page {
	public page()
	{
		System.out.println("Page default constructor");
	}
	public page(int count)
	{
		System.out.println("page has modules"+ count);
	}
public abstract void title();
public void Body()
{
	System.out.println("Selenium ");
}
public final void logo()
{
	System.out.println("Naveen automation");
}
}
