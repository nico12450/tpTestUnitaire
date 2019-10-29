package ip;

import java.util.Map;

import javax.management.RuntimeErrorException;

import com.google.gson.Gson;

public class MyIpService {
	private HttpDataService httpDataService;

	public MyIpService(HttpDataService httpDataService) {
		this.httpDataService = httpDataService;
	}

	public String getMyIp() {
		Gson gson = new Gson();
		String jsonIp = "";
		try {
			jsonIp = httpDataService.getJsonIp();
		}catch(RuntimeException e) {
			jsonIp = "{\"ip\":\"no ip found for this adress\"}";
			//throw e;
		}
		//System.out.println(jsonIp);
		Map<String, String> map = gson.<Map<String, String>>fromJson(jsonIp, Map.class);
		return map.get("ip").split(",")[0];
	}
}
