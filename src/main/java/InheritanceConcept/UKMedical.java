package InheritanceConcept;

public interface UKMedical {
 public void General();
 public void ENT();
 public void Ortho();
 public void AandE();
 public static void Billing()
	{
		System.out.println("Uk billing");
	}
 
 default void Entrance()
	{
		System.out.println("UK people can Enter");
	}
}
