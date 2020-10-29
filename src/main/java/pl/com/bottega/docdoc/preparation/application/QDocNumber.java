package pl.com.bottega.docdoc.preparation.application;

import java.time.YearMonth;

class QDocNumber {
	private final String num;

	public QDocNumber(Integer seq, YearMonth yearMonth, boolean isAuditor, boolean isDemo, String systemType) {
		String num = systemType + "/" + seq + "/" + yearMonth.getMonthValue() + "/" + yearMonth.getYear();

		if (isAuditor) {
			num = num + "/AUDIT";
		}

		if (isDemo) {
			num = "DEMO/" + num;
		}

		this.num = num;
	}
}
