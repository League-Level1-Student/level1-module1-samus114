
public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	SeaCreature patrick = new SeaCreature("Patrick");
	SeaCreature squidward = new SeaCreature("Squidward");
	System.out.println(spongebob.getName());
	System.out.println(patrick.getName());
	System.out.println(squidward.getName());
	spongebob.eat();
	patrick.eat();
	squidward.eat();
	spongebob.laugh();
	patrick.laugh();
	squidward.laugh();
}
}
