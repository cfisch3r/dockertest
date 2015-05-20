package de.colenet.dockertest;

public class DockerSpecificationDsl {

	private DockerClient dockerClient;
	private String containerId;

	public DockerSpecificationDsl(DockerClient dockerClient, String containerId) {
		this.dockerClient = dockerClient;
		this.containerId = containerId;
	}

	public ContainerInformation getContainer() {
		return dockerClient.inspect(containerId);
	}

}
