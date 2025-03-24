package encapsulation;

public class Mobile {
	Sim s;
	public Sim createSim() {
		s=new Sim();
		return s;
	}

}
