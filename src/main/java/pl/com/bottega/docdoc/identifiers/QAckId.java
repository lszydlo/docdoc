package pl.com.bottega.docdoc.identifiers;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class QAckId implements Serializable {

	private final UUID id;

	public QAckId(UUID id) {
		this.id = id;
	}

	public UUID getValue() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		QAckId ackId = (QAckId) o;
		return Objects.equals(id, ackId.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return id.toString();
	}

	public static QAckId random() {
		return new QAckId(UUID.randomUUID());
	}
}
