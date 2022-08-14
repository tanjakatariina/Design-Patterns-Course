package tehtävä02;

// Abstract Factory
public interface ITuoteTehdas {
	public abstract ILippis createLippis();
	public abstract IPaita createPaita();
	public abstract IFarkut createFarkut();
	public abstract IKengät createKengät();
}