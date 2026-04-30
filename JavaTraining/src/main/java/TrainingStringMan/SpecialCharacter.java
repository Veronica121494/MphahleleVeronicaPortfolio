
public static void main(String[] args) {
//escape characters "\"
//String txt = "I am loved by "Aluwani\" and I am sure"; //throws an error because of the double quotes inside the string

String txt ="I am loved by \"Aluwani\" and I am \"100% sure of it\" all day long";
System.out.println(txt);
String txt1 ="It\'s a beautiful day";
System.out.println(txt1);
String txt2 ="The question is N\\A";
System.out.println(txt2);

//new line
System.out.println("My name is Veronica \nI love Testing");
//tab
System.out.println("My name is Veronica \tI love Testing");
//backspace
System.out.println("My name is Veronica\bI love Testing");
//Carriage return
System.out.println("My name is Veronica\rI love Testing");
//Form Feed
System.out.println("My name is Veronica\fI love Testing");
}


