package Abstractclass;

public class AmazonTest {

	public static void main(String[] args) {
		Loginpage LP=new Loginpage();
		LP.title();
		LP.Body();
		LP.doLogin("sbharadwaj06@", "bharadwaj");
		HomePage HP=new HomePage();
		HP.Body();
		HP.logo();
		HP.title();
		page p=new Loginpage();
		p.logo();
		p.title();

	}

}
