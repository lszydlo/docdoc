package pl.com.bottega.docdoc.preparation.application;

import java.time.Clock;

public class QDocNumberFactory {


	private final Clock clock;
	private final SystemConfigPort config;
	private final AuthPort userProvider;
	private final SeqProviderPort seqProviderPort;

	public QDocNumberFactory(Clock clock, SystemConfigPort config, AuthPort userProvider, SeqProviderPort seqProviderPort) {
		this.clock = clock;
		this.config = config;
		this.userProvider = userProvider;
		this.seqProviderPort = seqProviderPort;
	}


	public QDocNumber create() {
		return new QDocNumber(null,null,true,true,"");
	}
}
