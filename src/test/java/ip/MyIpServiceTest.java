package ip;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MyIpServiceTest {
	
	private HttpDataService httpMock;

	/*
	@Test
	public void test() {
		//fail("Not yet implemented");
	}*/
	
	@Test
	public void testGetMyIp(){
		
		
		httpMock = Mockito.mock(HttpDataService.class);
		Mockito.when(httpMock.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\"}");
		MyIpService myIp = new MyIpService(httpMock);
		
		String ip = "92.154.66.22";
		
		assertEquals(myIp.getMyIp(),ip);
		
	}

}
