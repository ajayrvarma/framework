package com.donateit.framework;

public final class MobileHashGenerator {
	public String generateMobileHash() {

		double randomNo = Math.random() * 100;
		return String.valueOf(randomNo);
	}
}
