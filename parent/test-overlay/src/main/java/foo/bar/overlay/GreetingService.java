package foo.bar.overlay;

public class GreetingService {

	public static GreetingService INSTANCE = new GreetingService();
	
	private GreetingService(){
	}
	
	public String hello(){
		return hello("Fred");
	}
	
	public String hello(String name){
		return "Salut "+name+"!";
	}
}
