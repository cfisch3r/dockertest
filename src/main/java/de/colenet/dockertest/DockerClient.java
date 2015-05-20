package de.colenet.dockertest;

public interface DockerClient {

	public ContainerInformation inspect(String containerId);

}
