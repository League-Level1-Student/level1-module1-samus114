
public class T_Person {
private String name;
private String superpower;
String getName(){
	return name;
}
String getSuperpower() {
	return superpower;
}
void setName(String name2) {
	this.name = name2;
}
void setSuperpower(String superpower2) {
	this.superpower = superpower2;
}
public String toString() {
String person = name + " has mad " + superpower + " skills";
return person;
}
T_Person (String name){
	this.name = name;
}
}
