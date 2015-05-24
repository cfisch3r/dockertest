package de.colenet.dockertest;

import java.util.List;
import java.util.Map;

import de.colenet.dockertest.model.ContainerConfig;
import de.colenet.dockertest.model.Ports;
import de.colenet.dockertest.model.VolumeBind;
import de.colenet.dockertest.model.VolumesRW;

public class ContainerInformation {
	private String[] args;

	private ContainerConfig config;

	private String created;

	private String driver;

	private String execDriver;

	// private HostConfig hostConfig;

	private String hostnamePath;

	private String hostsPath;

	private String id;

	private String imageId;

	private String mountLabel;

	private String name;

	private NetworkSettings networkSettings;

	private String path;

	private String processLabel;

	private String resolvConfPath;

	private List<String> execIds;

	private ContainerState state;

	private VolumeBind[] volumes;

	private VolumesRW volumesRW;

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	public ContainerConfig getConfig() {
		return config;
	}

	public void setConfig(ContainerConfig config) {
		this.config = config;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getExecDriver() {
		return execDriver;
	}

	public void setExecDriver(String execDriver) {
		this.execDriver = execDriver;
	}

	public String getHostnamePath() {
		return hostnamePath;
	}

	public void setHostnamePath(String hostnamePath) {
		this.hostnamePath = hostnamePath;
	}

	public String getHostsPath() {
		return hostsPath;
	}

	public void setHostsPath(String hostsPath) {
		this.hostsPath = hostsPath;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getMountLabel() {
		return mountLabel;
	}

	public void setMountLabel(String mountLabel) {
		this.mountLabel = mountLabel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NetworkSettings getNetworkSettings() {
		return networkSettings;
	}

	public void setNetworkSettings(NetworkSettings networkSettings) {
		this.networkSettings = networkSettings;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getProcessLabel() {
		return processLabel;
	}

	public void setProcessLabel(String processLabel) {
		this.processLabel = processLabel;
	}

	public String getResolvConfPath() {
		return resolvConfPath;
	}

	public void setResolvConfPath(String resolvConfPath) {
		this.resolvConfPath = resolvConfPath;
	}

	public List<String> getExecIds() {
		return execIds;
	}

	public void setExecIds(List<String> execIds) {
		this.execIds = execIds;
	}

	public ContainerState getState() {
		return state;
	}

	public void setState(ContainerState state) {
		this.state = state;
	}

	public VolumeBind[] getVolumes() {
		return volumes;
	}

	public void setVolumes(VolumeBind[] volumes) {
		this.volumes = volumes;
	}

	public VolumesRW getVolumesRW() {
		return volumesRW;
	}

	public void setVolumesRW(VolumesRW volumesRW) {
		this.volumesRW = volumesRW;
	}

	public static class NetworkSettings {

		private String ipAddress;
		private int ipPrefixLen;
		private String gateway;
		private String bridge;
		private Map<String, Map<String, String>> portMapping;
		private Ports ports;

		public String getIpAddress() {
			return ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public int getIpPrefixLen() {
			return ipPrefixLen;
		}

		public void setIpPrefixLen(int ipPrefixLen) {
			this.ipPrefixLen = ipPrefixLen;
		}

		public String getGateway() {
			return gateway;
		}

		public void setGateway(String gateway) {
			this.gateway = gateway;
		}

		public String getBridge() {
			return bridge;
		}

		public void setBridge(String bridge) {
			this.bridge = bridge;
		}

		public Map<String, Map<String, String>> getPortMapping() {
			return portMapping;
		}

		public void setPortMapping(Map<String, Map<String, String>> portMapping) {
			this.portMapping = portMapping;
		}

		public Ports getPorts() {
			return ports;
		}

		public void setPorts(Ports ports) {
			this.ports = ports;
		}

	}

	public static class ContainerState {

		private boolean running;
		private boolean paused;
		private int pid;
		private int exitCode;
		private String startedAt;
		private String finishedAt;

		public boolean isRunning() {
			return running;
		}

		public void setRunning(boolean running) {
			this.running = running;
		}

		public boolean isPaused() {
			return paused;
		}

		public void setPaused(boolean paused) {
			this.paused = paused;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public int getExitCode() {
			return exitCode;
		}

		public void setExitCode(int exitCode) {
			this.exitCode = exitCode;
		}

		public String getStartedAt() {
			return startedAt;
		}

		public void setStartedAt(String startedAt) {
			this.startedAt = startedAt;
		}

		public String getFinishedAt() {
			return finishedAt;
		}

		public void setFinishedAt(String finishedAt) {
			this.finishedAt = finishedAt;
		}

	}

}
