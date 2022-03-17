package jdbc_demo;


public class Syslog {
	public static void main(String args[]) {
		SyslogServerEventHandlerIF eventHandler = new PrintStreamSyslogServerEventHandler(System.out);
		SyslogServerIF serverIF = SyslogServer.getInstance("udp");
		SyslogServerConfigIF config = serverIF.getConfig();
		config.setHost("192.168.1.114");
		config.setPort(10000);
		config.addEventHandler(eventHandler);
		serverIF.initialize("udp",config);
		serverIF.run();
	}
}
