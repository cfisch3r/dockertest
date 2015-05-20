package de.colenet.dockertest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DockerSpecificationDslTest {

	@Mock
	private DockerClient dockerClient;

	private static final String CONTAINER_ID = "123";

	private ContainerInformation information;

	private DockerSpecificationDsl sut;

	@Before
	public void setUp() {
		sut = new DockerSpecificationDsl(dockerClient, CONTAINER_ID);
		information = new ContainerInformation();
		when(dockerClient.inspect(CONTAINER_ID)).thenReturn(information);
	}

	@Test
	public void getContainer_returnsNotNull() {
		assertThat(sut.getContainer()).isNotNull();
	}

	@Test
	public void getContainer_callsInspectFromDockerClient() {
		sut.getContainer();
		assertThat(sut.getContainer()).isEqualTo(information);
	}
}
