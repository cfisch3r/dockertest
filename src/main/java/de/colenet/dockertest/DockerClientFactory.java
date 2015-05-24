package de.colenet.dockertest;

/**
 * Factory for Dockerclient.
 *
 */
public interface DockerClientFactory {

	/**
	 * creates new Docker client.
	 * 
	 * @param url
	 *            URL of Docker Engine.
	 * @param certPath
	 *            Docker Client certificate path.
	 * 
	 * @return Docker client
	 */
	public DockerClient create(String url, String certPath);
}
