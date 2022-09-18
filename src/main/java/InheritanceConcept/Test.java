package InheritanceConcept;

public class Test {

	public static void main(String[] args) {
		FortisHospital Fh=new FortisHospital();
		Fh.AandE();
		Fh.cancer();
		Fh.cardioServices();
		Fh.ENT();
		Fh.Entrance();
		UKMedical uk=new FortisHospital();
		uk.AandE();
		uk.ENT();
		uk.General();
		uk.Ortho();
		USmedical us=new FortisHospital();
		us.AandE();
		us.cardioServices();
		us.OncolgyServices();
		us.physioServices();
		IndiaMedical india=new FortisHospital();
		india.AandE();
		india.cancer();
		india.Endocrynology();
		UKMedical.Billing();
		USmedical.Billing();
		IndiaMedical.Billing();
		
	}

}
