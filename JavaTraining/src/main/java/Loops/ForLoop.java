public static void main(String[] args) {
//for Loop
    for (int i = 0; i < 5; i++) {
        System.out.println("The value of i is " +i);
    }

    int sum = 0;
    for (int I = 1; I <= 5; I++) {
        sum = sum + I;

        //sum=0+1 = 1
        //sum=0+2 = 2
        //sum=0+3 = 3
        //sum=0+4 = 4
        //sum=0+5 = 5
    }
    System.out.println("Sum is " + sum);

    for (int i = 5; i > 0; i--) {
        System.out.println(i);
    }
    //5 4 3 2 1
}
