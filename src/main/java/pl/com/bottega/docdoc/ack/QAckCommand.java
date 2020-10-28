package pl.com.bottega.docdoc.ack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.com.bottega.docdoc.identifiers.QAckId;
import pl.com.bottega.docdoc.identifiers.QDocId;
import pl.com.bottega.docdoc.identifiers.WorkerId;
import pl.com.bottega.docdoc.lib.ConcreteCommand;
import pl.com.bottega.docdoc.lib.UserCommand;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public abstract class QAckCommand implements ConcreteCommand<QAckId> {

	private final QAckId aggregateId;
	private final Long version;

	QAckCommand(QAckId aggregateId) {
		this.aggregateId = aggregateId;
		this.version = null;
	}

	@Getter
	public static class DoCreateQAck extends QAckCommand {

		private final WorkerId workerId;
		private final QDocId docId;
		private final LocalDateTime dueDate;

		public DoCreateQAck(QAckId id, WorkerId workerId, QDocId docId, LocalDateTime dueDate) {
			super(id);
			this.workerId = workerId;
			this.docId = docId;
			this.dueDate = dueDate;
		}
	}

	@Getter
	public static class DoSignQAck extends QAckCommand {

		public DoSignQAck(QAckId id) {
			super(id);
		}

	}

	@Getter
	public static class DoSignQAckOnBehalf extends QAckCommand {

		private final String reason;

		public DoSignQAckOnBehalf(QAckId id, String reason) {
			super(id);
			this.reason = reason;
		}

	}

	@Getter
	@AllArgsConstructor
	public static class DoBulkCreateQAck implements UserCommand {

		private final List<DoCreateQAck> commands;

	}
}
