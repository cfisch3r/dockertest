package de.colenet.dockertest;

public interface DockerClient {

	public ContainerInformation inspect(String containerId);

	public String execute(String containerId, String... commands);

}
