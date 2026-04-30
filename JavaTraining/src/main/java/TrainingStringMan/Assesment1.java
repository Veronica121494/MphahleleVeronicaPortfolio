public static void main(String[] args) {
    String aluName = "Aluwani Kenny Nthangeni";
    System.out.println("My full names are " + aluName);
    System.out.println("My full names has " + aluName.length() + " characters long");

    //calculate the sum

    int num1 = 15524;
    int num2 = 87555;
    int sum = num1 + num2;
    System.out.println("The sum of num1 " + num1 + " and " + num2 + " is equal to " + sum);

    //upper case

    String name = "veronica mphahlele";
    String surname = "     NTHANGENI";
    System.out.println(name.toUpperCase());

    //lower case
    System.out.println(surname.toLowerCase());


//Finding the position of a character in a string
    System.out.println(surname.indexOf("E"));

    //Finding the position of a character in a string
    System.out.println(surname.charAt(13));

//Comparing strings

    String a = "Veronica";
    String b = "Veronica";
    String c = "Mphahlele";
    String d = "Matabane";

    System.out.println(a.equals(b));//True
    System.out.println(c.equals(d));//Flase

//Removing whitespace
    String txt = "   Hello World   ";
    System.out.println("Before: [" + txt + "]");
    System.out.println("After:  [" + txt.trim() + "]");

//String concatenation
    String firstName = "Aluwani";
    String lastName = "Nthangeni";
String fullName = firstName + " " + lastName;
    System.out.println("My full name is " + firstName + " " + lastName);
    System.out.println("My full name is " + fullName);

    //concat() method
    //String fullName2 = firstName.concat(" ").concat(lastName);
    String fullName2 = firstName.concat(lastName);

    System.out.println("My full name is " + fullName2);
    //chaining concat() method
    String fullName3  = firstName.concat(" ").concat(lastName).concat(" is my").concat(" BOYFRIEND!.");
    System.out.println(fullName3);

}