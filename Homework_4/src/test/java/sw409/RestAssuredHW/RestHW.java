package sw409.RestAssuredHW;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestHW {
	@Test
	void GetEmployees()
	{
		RestAssured.baseURI="http://employeebackend-env.eba-siipyaky.us-east-2.elasticbeanstalk.com";
		RequestSpecification httprequest = RestAssured.given();
		Response httpresponse = httprequest.request(Method.GET,"/api/v1/employees");
		String res = httpresponse.getBody().asString();
		System.out.println("Response is " + res);
		int statusCode = httpresponse.statusCode();
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	void AddEmployee()
	{
		RestAssured.baseURI="http://employeebackend-env.eba-siipyaky.us-east-2.elasticbeanstalk.com";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject requestparameters = new JSONObject();
		requestparameters.put("name", "Joe Smith");
		requestparameters.put("title", "Director");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(requestparameters.toJSONString());
		Response httpresponse = httprequest.request(Method.POST,"/api/v1/employees");
		int statuscode = httpresponse.statusCode();
		String res = httpresponse.getBody().asString();
		System.out.println("Response is " + res);
		Assert.assertEquals(statuscode, 200);			
	}
	
	@Test
	void UpdateEmployee()
	{
		RestAssured.baseURI="http://employeebackend-env.eba-siipyaky.us-east-2.elasticbeanstalk.com";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject requestparameters = new JSONObject();
		requestparameters.put("name", "New Smith");
		requestparameters.put("id", "25");
		requestparameters.put("title", "New Director");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(requestparameters.toJSONString());
		Response httpresponse = httprequest.request(Method.PUT,"/api/v1/employees/25");
		Response httpreturn = httprequest.request(Method.GET,"/api/v1/employees");
		int statuscode = httpresponse.statusCode();
		String res = httpreturn.getBody().asString();
		System.out.println("Response is " + res);
		Assert.assertEquals(statuscode, 200);
	}
	
	@Test
	void DeleteEmployee()
	{
		RestAssured.baseURI="http://employeebackend-env.eba-siipyaky.us-east-2.elasticbeanstalk.com";
		RequestSpecification httprequest = RestAssured.given();
		Response httpresponse = httprequest.request(Method.DELETE,"/api/v1/employees/25");
		Response httpreturn = httprequest.request(Method.GET,"/api/v1/employees");
		String res = httpreturn.getBody().asString();;
		System.out.println("Response is " + res);
		int statusCode = httpresponse.statusCode();
		Assert.assertEquals(statusCode, 200);
		
		
		
	}

}
