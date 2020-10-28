package pl.com.bottega.docdoc.identifiers;

public interface IdFactory<T> {
	T generate();
}
