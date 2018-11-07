
public class T_PersonRunner {
public static void main(String[] args) {
	T_Person superMan = new T_Person();
	T_Person spiderMan = new T_Person();
	T_Person p3 = new T_Person();
	superMan.setSuperpower("flying");
	System.out.println(superMan.getSuperpower());
	spiderMan.setSuperpower("");
	System.out.println(superMan.getSuperpower());
}
}