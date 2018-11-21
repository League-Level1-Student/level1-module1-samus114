
public class T_PersonRunner {
public static void main(String[] args) {
	T_Person superMan = new T_Person("superman");
	T_Person spiderMan = new T_Person("spiderMan");
	T_Person hawkman = new T_Person("hawkman");
	superMan.setSuperpower("flying");
	System.out.println(superMan);
	spiderMan.setSuperpower("Spider-Sense");
	System.out.println(spiderMan);
	hawkman.setSuperpower("Nth Metal");
	System.out.println(hawkman);
}
}