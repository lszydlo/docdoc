package pl.com.bottega.docdoc.preparation.application;

import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.YearMonth;

@Service
public class PreparationService {


	Clock clock;
	SystemConfigPort config;
	AuthPort userProvider;
	SeqProviderPort seqProviderPort;

	public void handle(DoCreateQDoc command) {

		String number = generate(null,YearMonth.now(), true,config.isDemo(), config.systemType());
		QDocDraft draft = new QDocDraft(number);

	}

	public void handle(DoUpdateContent command) {

	}


	String generate(Integer seq, YearMonth yearMonth, boolean isAuditor, boolean isDemo, String systemType) {
		String num = systemType + "/" + seq + "/" + yearMonth.getMonthValue() + "/" + yearMonth.getYear();

		if (isAuditor) {
			num = num + "/AUDIT";
		}

		if (isDemo) {
			num = "DEMO/" + num;
		}

		return num;
	}

	private class QDocDraft {
		public QDocDraft(String number) {

		}
	}
}
