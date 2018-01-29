package a04_Builder;

/**
 * 建造者模式
 */
public class Test {

	public static void main(String[] args) {  
		CarTeamBuilder carTeamBuilder = new CarTeamBuilder();
		CarTeam carTeam = carTeamBuilder.buildCarTeam();
		carTeam.run();
    }
}
