package com.magic.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * com.magic.client
 *
 * @author jh
 * @date 2018/9/4 9:15
 * description:实现POST格式的客户端
 */
public class MainPostClient {
	public static void main(String[] args) throws IOException {
		//1. 创建 HttpClient 的实例
		CloseableHttpClient httpClient = HttpClientBuilder.create ().build ();
		//2. 创建某种连接方法的实例
		HttpPost httpPost = new HttpPost ("http://localhost:9999/CustomerService/crm/customer");
		/*传递参数*/
		List<BasicNameValuePair> list = new ArrayList<> ();
		list.add (new BasicNameValuePair ("id","888"));
		list.add (new BasicNameValuePair ("name","张三"));
		list.add (new BasicNameValuePair ("age","22"));
		HttpEntity entity=new UrlEncodedFormEntity (list,"UTF-8");

		httpPost.setEntity (entity);
		//3. 调用第一步中创建好的实例的execute方法来执行第二步中创建好的链接类实例
		HttpResponse httpResponse = httpClient.execute (httpPost);
		//4. 读response获取HttpEntity
		if (httpResponse.getStatusLine ().getStatusCode () == HttpStatus.SC_OK) {
			HttpEntity httpEntity = httpResponse.getEntity ();
			//5. 对得到后的内容进行处理
			String result = EntityUtils.toString (httpEntity,"UTF-8");
			System.out.println (result);
			EntityUtils.consume (httpEntity);
		} else {
			System.out.println (httpResponse.getStatusLine ());
		}
		//6. 释放连接。无论执行方法是否成功，都必须释放连接
		httpClient.close ();
	}
}
