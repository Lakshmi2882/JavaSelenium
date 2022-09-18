package WebDriver;

public class ChromeDriver implements WebDriver{

	public ChromeDriver()
	{
		System.out.println("chrome constructor");
	}
	@Override
	public void findelement() {
		System.out.println("find element");
		
	}

	@Override
	public void findelements() {
		System.out.println("find elements");
		
	}

	@Override
	public void get(String url) {
		System.out.println("get url");
		
	}

	@Override
	public void click() {
		System.out.println("click");
		
	}

	@Override
	public void sendkeys(String value) {
		System.out.println("sss");
		
	}

	@Override
	public void gettext() {
		System.out.println("chrome Browser");
		
	}

	@Override
	public void close() {
		System.out.println("close ");
		
	}

}
