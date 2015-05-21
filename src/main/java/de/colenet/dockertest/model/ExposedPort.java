package de.colenet.dockertest.model;


public class ExposedPort {

	private InternetProtocol protocol;
	private int port;

	public InternetProtocol getProtocol() {
		return protocol;
	}

	public void setProtocol(InternetProtocol protocol) {
		this.protocol = protocol;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
