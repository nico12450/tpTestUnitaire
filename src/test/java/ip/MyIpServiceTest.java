package ip;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyIpServiceTest {
	
	private HttpDataService httpMock;
	private MyIpService myIp;

	/*
	@Test
	public void test() {
		//fail("Not yet implemented");
	}*/
	
	@Before
	public void before() {
		
		httpMock = Mockito.mock(HttpDataService.class);
		Mockito.when(httpMock.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\"}");
		myIp = new MyIpService(httpMock);
		
	}
	
	@Test
	public void testGetMyIp(){
		
		String ip = "92.154.66.22";
		
		assertEquals(myIp.getMyIp(),ip);
		
	}

}
