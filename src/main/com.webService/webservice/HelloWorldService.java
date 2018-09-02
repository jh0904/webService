package webservice;

/**
 * com.webservice
 *
 * @author jh
 * @date 2018/9/2 10:35
 * description:
 */
public class HelloWorldService implements HelloWorld {
	@Override
	public String sayhello(String name, int age) {
		return "Hello"+name+" ("+age+"years old!)";
	}
}
