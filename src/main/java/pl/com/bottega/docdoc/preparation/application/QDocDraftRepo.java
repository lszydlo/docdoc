package pl.com.bottega.docdoc.preparation.application;

import pl.com.bottega.docdoc.identifiers.QDocId;

public interface QDocDraftRepo {
	void save(PreparationService.QDocDraft draft);

	PreparationService.QDocDraft load(QDocId id);
}
