package pl.com.bottega.docdoc.identifiers;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class WorkerId implements Serializable {

	private final UUID id;

	public WorkerId(UUID id) {
		this.id = id;
	}

	public UUID getValue() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WorkerId workerId = (WorkerId) o;
		return Objects.equals(id, workerId.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return id.toString();
	}

	public static WorkerId random() {
		return new WorkerId(UUID.randomUUID());
	}
}
