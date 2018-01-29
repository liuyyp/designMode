package a04_Builder;

public class CarTeamBuilder {
	
	public CarTeam buildCarTeam(){
		CarTeam team = new CarTeam();
		team.setAudiCar(new AudiCar());
		team.setBydCar(new BydCar());
		return team;
	}

}
