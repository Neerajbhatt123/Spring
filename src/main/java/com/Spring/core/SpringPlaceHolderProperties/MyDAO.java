package com.Spring.core.SpringPlaceHolderProperties;

public class MyDAO {
	private String dbServer;
	
	private String dbPort;
	
	public MyDAO(String dbServer, String dbPort) {
		super();
		this.dbServer = dbServer;
		this.dbPort = dbPort;
	}
	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + "]";
	}
	
	

}
