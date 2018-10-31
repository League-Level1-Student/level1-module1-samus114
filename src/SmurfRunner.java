public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy"," white","boy");
	Smurf papa = new Smurf("Papa","Red","boy");
	Smurf smurfette = new Smurf("Smurfette","white","girl");
	handy.eat();
	System.out.println(handy.getName());
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	System.out.println(smurfette.getName());
System.out.println(smurfette.getHatColor());
System.out.println(smurfette.isGirlOrBoy());
}
}
