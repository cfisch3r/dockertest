package de.colenet.dockertest.model;

import java.util.HashMap;
import java.util.Map;

public class Ports {

	private Map<ExposedPort, Binding[]> ports = new HashMap<ExposedPort, Binding[]>();

	public static class Binding {

		private String hostIp;

		private Integer hostPort;

		public String getHostIp() {
			return hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public Integer getHostPort() {
			return hostPort;
		}

		public void setHostPort(Integer hostPort) {
			this.hostPort = hostPort;
		}

	}

	public Map<ExposedPort, Binding[]> getPorts() {
		return ports;
	}

	public void setPorts(Map<ExposedPort, Binding[]> ports) {
		this.ports = ports;
	}

}
