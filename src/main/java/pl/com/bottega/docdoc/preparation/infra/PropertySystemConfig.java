package pl.com.bottega.docdoc.preparation.infra;

import pl.com.bottega.docdoc.preparation.application.SystemConfigPort;

public class PropertySystemConfig implements SystemConfigPort {


	@Override
	public String systemType() {
		return System.getProperty("systemType");
	}

	@Override
	public boolean isDemo() {
		return false;
	}
}
