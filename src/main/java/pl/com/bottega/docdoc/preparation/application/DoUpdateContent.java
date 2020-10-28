package pl.com.bottega.docdoc.preparation.application;


import pl.com.bottega.docdoc.identifiers.QDocId;
import pl.com.bottega.docdoc.lib.UserCommand;

public class DoUpdateContent implements UserCommand {

    private String content;
    private QDocId id;

    public QDocId getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
