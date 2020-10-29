package pl.com.bottega.docdoc.preparation.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.YearMonth;

import static org.junit.jupiter.api.Assertions.*;

class QDocNumberTest {

	@Test
	void should_generate_number() {

		QDocNumber number = new QDocNumber(1, YearMonth.of(1, 2), true, true, "ISO");

		Assertions.assertThat(number.toString()).isEqualTo("DEMO/1/ISO/2/1/AUDIT");

	}
}