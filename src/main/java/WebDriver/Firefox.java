package WebDriver;

public class Firefox implements WebDriver {

	@Override
	public void findelement() {
		System.out.println("get element");
		
	}

	@Override
	public void findelements() {
		// TODO Auto-generated method stub
		System.out.println("get elements");
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("get URL");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("CLICK");
	}

	@Override
	public void sendkeys(String value) {
		// TODO Auto-generated method stub
		System.out.println("get value");
	}

	@Override
	public void gettext() {
		// TODO Auto-generated method stub
		System.out.println("get text");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("close");
		
	}

}
