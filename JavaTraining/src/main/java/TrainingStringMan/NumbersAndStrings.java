
    public static void main(String[] args) {
//+ adds numbers and can concatenate. Numbers are added, strings are concatenated.
      //int x =10;int y=20; int z = 30;
int x, y, z;
x=10;
y=20;
z=30;
int sum = x + y + z;
        System.out.println("The sum of x, y and z is " + sum);

String a, b, c;
a="10";
b="20";
c="30";
String sum2 = a + b + c;
System.out.println("The sum of a, b and c is " + sum2); //102030
String sum3 = a.concat(b).concat(c);
        System.out.println( sum3); //102030


    }


