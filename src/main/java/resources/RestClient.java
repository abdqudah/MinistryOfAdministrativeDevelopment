package resources;

import java.io.IOException;

import javax.xml.crypto.dsig.XMLObject;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.jsoup.Connection.Request;

import okhttp3.internal.http2.Header;

public class RestClient {
	
	
	//GetMethod
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient= HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url); //HTTP get request
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget); // hit the get URL
		
		return closeableHttpResponse;
		
		/*int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		
		JSONObject resposeJson = new JSONObject(responseString);
		System.out.println(resposeJson);
		
		
		//org.apache.http.Header[] headerArray=closeableHttpResponse.getAllHeaders();*/
		
		
	
	}

}
