package de.colenet.dockertest.model;

public class VolumeRW {

	private Volume volume;

	private AccessMode accessMode = AccessMode.rw;

	public Volume getVolume() {
		return volume;
	}

	public void setVolume(Volume volume) {
		this.volume = volume;
	}

	public AccessMode getAccessMode() {
		return accessMode;
	}

	public void setAccessMode(AccessMode accessMode) {
		this.accessMode = accessMode;
	}

}
