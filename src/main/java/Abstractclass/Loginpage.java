package Abstractclass;

public class Loginpage extends page {
	public Loginpage()
	{
		System.out.println("Loginpage constructor will be called");
	}

	@Override
	public void title() {
		System.out.println("Naveenautomation selenium");
		
	}
	public void Body()
	{
		System.out.println("Login Body");
	}
	public void doLogin(String un, String pwd)
	{
		System.out.println(un+":"+ pwd);
	}

}
