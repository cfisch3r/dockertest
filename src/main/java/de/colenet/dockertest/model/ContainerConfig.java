package de.colenet.dockertest.model;

import java.util.Map;

public class ContainerConfig {

	private boolean attachStderr = false;

	private boolean attachStdin = false;

	private boolean attachStdout = false;

	private String[] cmd;

	private int cpuShares = 0;

	private String cpuset = "";

	private String domainName = "";

	private String[] entrypoint = new String[] {};

	private String[] env;

	private ExposedPorts exposedPorts;

	private String hostName = "";

	private String image;

	private String macAddress;

	private long memoryLimit = 0;

	private long memorySwap = 0;

	private boolean networkDisabled = false;

	private String[] onBuild;

	private boolean stdinOpen = false;

	private String[] portSpecs;

	private boolean stdInOnce = false;

	private boolean tty = false;

	private String user = "";

	private Map<String, ?> volumes;

	private String workingDir = "";

	public boolean isAttachStderr() {
		return attachStderr;
	}

	public void setAttachStderr(boolean attachStderr) {
		this.attachStderr = attachStderr;
	}

	public boolean isAttachStdin() {
		return attachStdin;
	}

	public void setAttachStdin(boolean attachStdin) {
		this.attachStdin = attachStdin;
	}

	public boolean isAttachStdout() {
		return attachStdout;
	}

	public void setAttachStdout(boolean attachStdout) {
		this.attachStdout = attachStdout;
	}

	public String[] getCmd() {
		return cmd;
	}

	public void setCmd(String[] cmd) {
		this.cmd = cmd;
	}

	public int getCpuShares() {
		return cpuShares;
	}

	public void setCpuShares(int cpuShares) {
		this.cpuShares = cpuShares;
	}

	public String getCpuset() {
		return cpuset;
	}

	public void setCpuset(String cpuset) {
		this.cpuset = cpuset;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String[] getEntrypoint() {
		return entrypoint;
	}

	public void setEntrypoint(String[] entrypoint) {
		this.entrypoint = entrypoint;
	}

	public String[] getEnv() {
		return env;
	}

	public void setEnv(String[] env) {
		this.env = env;
	}

	public ExposedPorts getExposedPorts() {
		return exposedPorts;
	}

	public void setExposedPorts(ExposedPorts exposedPorts) {
		this.exposedPorts = exposedPorts;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public long getMemoryLimit() {
		return memoryLimit;
	}

	public void setMemoryLimit(long memoryLimit) {
		this.memoryLimit = memoryLimit;
	}

	public long getMemorySwap() {
		return memorySwap;
	}

	public void setMemorySwap(long memorySwap) {
		this.memorySwap = memorySwap;
	}

	public boolean isNetworkDisabled() {
		return networkDisabled;
	}

	public void setNetworkDisabled(boolean networkDisabled) {
		this.networkDisabled = networkDisabled;
	}

	public String[] getOnBuild() {
		return onBuild;
	}

	public void setOnBuild(String[] onBuild) {
		this.onBuild = onBuild;
	}

	public boolean isStdinOpen() {
		return stdinOpen;
	}

	public void setStdinOpen(boolean stdinOpen) {
		this.stdinOpen = stdinOpen;
	}

	public String[] getPortSpecs() {
		return portSpecs;
	}

	public void setPortSpecs(String[] portSpecs) {
		this.portSpecs = portSpecs;
	}

	public boolean isStdInOnce() {
		return stdInOnce;
	}

	public void setStdInOnce(boolean stdInOnce) {
		this.stdInOnce = stdInOnce;
	}

	public boolean isTty() {
		return tty;
	}

	public void setTty(boolean tty) {
		this.tty = tty;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Map<String, ?> getVolumes() {
		return volumes;
	}

	public void setVolumes(Map<String, ?> volumes) {
		this.volumes = volumes;
	}

	public String getWorkingDir() {
		return workingDir;
	}

	public void setWorkingDir(String workingDir) {
		this.workingDir = workingDir;
	}

}
