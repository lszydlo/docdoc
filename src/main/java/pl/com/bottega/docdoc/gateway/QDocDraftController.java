package pl.com.bottega.docdoc.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.com.bottega.docdoc.identifiers.QDocId;
import pl.com.bottega.docdoc.preparation.application.DoCreateQDoc;
import pl.com.bottega.docdoc.preparation.application.DoUpdateContent;
import pl.com.bottega.docdoc.preparation.application.PreparationService;

import java.util.UUID;

@RestController("/drafts")
public class QDocDraftController {

	private final PreparationService preparationService;

	public QDocDraftController(PreparationService preparationService) {
		this.preparationService = preparationService;
	}


	@PostMapping
	ResponseEntity<Void> create(@RequestBody DoCreateQDoc command) {
		preparationService.handle(command);
		return ResponseEntity.ok().build();
	}
	@PutMapping("/{draftId}")
	ResponseEntity<Void> update(@RequestBody DoUpdateContent command, @PathVariable QDocId draftId) {
		if(!draftId.equals(command.getId())) {
			return ResponseEntity.badRequest().build();
		}
		preparationService.handle(command);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{draftId}/recipients")
	ResponseEntity<Void> addRecipient(@PathVariable UUID draftId) {

		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{draftId}/recipients/{recipientId}")
	ResponseEntity<Void> removeRecipient(@PathVariable UUID draftId, @PathVariable String recipientId) {
		return ResponseEntity.ok().build();
	}
}
