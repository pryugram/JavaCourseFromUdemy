package lecture;

public class Main2 {
	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");	//specify the type
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);
	
		System.out.println(adelaideCrows.numPlayers());

		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
		brokenTeam.addPlayer(beckham);
	}
}


// for restricting the types that can be used as type arguments : bounded type parameters
// an argument passed for a type parameter can either be a class or an interface.
// interfaces can also specify type parameters : you can create instances of a class that implements an interface
// and then you can ensure that the interface methods you implement act on a specific type of object or objects.
// -> List was an interface that takes a generic type parameter, and the usage is the same as it is for a class.
// single bound : restrict to be created for objects that will inherit from the class or a subclass only.
// multiple bounds : likewise normal ineritance implemets rules : can only extend from a single class, but multiple interfaces.
// if you specify multiple bounds, the class must be listed first.
