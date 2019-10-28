package ip;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyIpService ip = new MyIpService(new HttpDataService());
		
		System.out.println(ip.getMyIp());

	}

}
