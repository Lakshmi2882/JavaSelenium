package InheritanceConcept;

public class FortisHospital implements USmedical,UKMedical,IndiaMedical {
	//multiple inheritance is allowed in Java 

	@Override
	public void physioServices() {
		System.out.println("Physio services");
		
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		System.out.println("Cardio services");
	}

	@Override
	public void OncolgyServices() {
		// TODO Auto-generated method stub
		System.out.println("Oncolgy services");
	}

	@Override
	public void General() {
		System.out.println("General services");
		
	}

	@Override
	public void ENT() {
		System.out.println("ENT services");
		
	}

	@Override
	public void Ortho() {
		// TODO Auto-generated method stub
		System.out.println("Ortho services");
	}

	@Override
	public void cancer() {
		// TODO Auto-generated method stub
		System.out.println("Cancer services");
	}

	@Override
	public void Endocrynology() {
		// TODO Auto-generated method stub
		System.out.println("Endocrynology services");
	}
public void medicaltraining()
{
	
}
public void OutpatientServices()
{
	
}

@Override
public void AandE() {
	System.out.println("Aand E");
	
}

@Override
public void Entrance() {
	// TODO Auto-generated method stub
	UKMedical.super.Entrance();
}
}
