package pl.com.bottega.docdoc.preparation;

import lombok.Value;
import pl.com.bottega.docdoc.lib.UserCommand;

@Value
public class DoCreateQDoc implements UserCommand {
	String title;
	QDocType type;
}
