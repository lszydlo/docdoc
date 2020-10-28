package pl.com.bottega.docdoc.lib;

public interface ConcreteCommand<ID> extends UserCommand {

	ID getAggregateId();

	Long getVersion();
}
