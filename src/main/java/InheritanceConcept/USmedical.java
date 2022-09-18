package InheritanceConcept;

public interface USmedical {
	//can not have method body
	//method declaration
	//interface cannot have business logic
	//
	public void physioServices();
	public void cardioServices();
	public void OncolgyServices();
	public void AandE();
	default void Entrance()
	{
		System.out.println("US people can Enter");
	}
	public static void Billing()
	{
		System.out.println("US medical billing");
	}
}
