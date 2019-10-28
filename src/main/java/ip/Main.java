package ip;

public class Main {

    public static void main( String[] args )
    {
    	MyIpService myIp = new MyIpService(new HttpDataService());
    	System.out.println(myIp.getMyIp());
    }

}
