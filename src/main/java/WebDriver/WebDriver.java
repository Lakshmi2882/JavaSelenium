package WebDriver;

public interface WebDriver extends Searchcontext {
	//we can override methods in interface
	public void get(String url);
	public void click();
	public void sendkeys(String value);
	public void gettext();
	public void close();

}
