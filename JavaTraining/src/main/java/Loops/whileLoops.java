public static void main(String[] args) {
  //while loop
    int i = 0;
    while (i<5) {
        System.out.println(i);
        i++;
    }
    int countdown = 3;
    while (countdown > 0) {
        System.out.println(countdown);
        countdown--;
    }
    System.out.println("Happy New Year!!");
    int b = 0;
    while (b < 3) {
        System.out.println("Last statement " + b);
        b++;
    }
//this will never be printed because the condition is false at the beginning of the loop
    int a = 10;
    while (a < 5) {
        System.out.println("This will never be printed");
        a++;
    }
    }
