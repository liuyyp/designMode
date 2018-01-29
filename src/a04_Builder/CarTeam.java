package a04_Builder;

public class CarTeam {
	private AudiCar audiCar;
	private BydCar bydCar;
	
	public void run(){
		audiCar.run();
		bydCar.run();
	}
	
	public AudiCar getAudiCar() {
		return audiCar;
	}
	public void setAudiCar(AudiCar audiCar) {
		this.audiCar = audiCar;
	}
	public BydCar getBydCar() {
		return bydCar;
	}
	public void setBydCar(BydCar bydCar) {
		this.bydCar = bydCar;
	}
	

}
