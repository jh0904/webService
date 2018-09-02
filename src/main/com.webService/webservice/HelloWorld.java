package webservice;

import javax.jws.WebService;

/**
 * com.webservice
 *
 * @author jh
 * @date 2018/9/2 10:34
 * description:
 */
@WebService
public interface HelloWorld {
	public String sayhello(String name, int age);
}
