package ip;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyIpServiceTest {
	
	private HttpDataService httpMock;
	private MyIpService myIp;
	
	@Before
	public void before() {
		
		httpMock = Mockito.mock(HttpDataService.class);
		myIp = new MyIpService(httpMock);
		
	}
	
	@Test
	public void testGetMyIp(){
		
		Mockito.when(httpMock.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\"}");
		
		String ip = "92.154.66.22";
		
		assertEquals(myIp.getMyIp(),ip);
		
	}
	
	@Test
	public void testGetMyIpBadUrl() {
		
		Mockito.when(httpMock.getJsonIp()).thenThrow(new RuntimeException());
		assertEquals(myIp.getMyIp(),"no ip found for this adress");
		
	}

}
