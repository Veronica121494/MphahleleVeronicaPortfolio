public static void main(String[] args) {

    //getting the highest value between two numbers
    System.out.println ("The highest number is " + (Math.max(5,10)));
    //getting the smallest value between two numbers
    System.out.println ("The highest number is " + (Math.min(5, 10)));
    System.out.println ("The square root is " + (Math.sqrt(169)));
    System.out.println(Math.abs(-4.7));
    System.out.println(Math.pow(2, 8));  // 256.
    System.out.println(Math.round(4.6));  // 5
    System.out.println(Math.ceil(4.1));   // 5.0
    System.out.println(Math.floor(4.9));  // 4.0
    System.out.println(Math.random());
  //  System.out.println(Math.avrg(4.6));  // 0 to 10
    int randomNum = (int)(Math.random() * 10);  // 0 to 100
    System.out.println("Random number between 0 and 10: " + randomNum);
    int a = 5;
    int b = 10;

    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a + ", b = " + b);
}