package pl.com.bottega.docdoc.preparation.application;

import javafx.scene.canvas.GraphicsContext;
import org.springframework.stereotype.Service;
import pl.com.bottega.docdoc.identifiers.QDocId;

import java.time.Clock;
import java.time.YearMonth;

@Service
public class PreparationService {




	QDocNumberFactory numberFactory;
	private QDocDraftRepo repo;

	public void handle(DoCreateQDoc command) {

		QDocDraft draft = new QDocDraft(numberFactory.create());
		repo.save(draft);
	}

	public void handle(DoUpdateContent command) {
		QDocDraft draft = repo.load(command.getId());

		draft.updateContent(command);

		repo.save(draft);
	}




	class QDocDraft {
		private final QDocNumber number;

		public QDocDraft(QDocNumber number) {
			this.number = number;
		}

		public void updateContent(DoUpdateContent command) {



		}
	}

}
