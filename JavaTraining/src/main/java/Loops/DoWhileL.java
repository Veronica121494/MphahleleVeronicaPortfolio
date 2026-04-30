public static void main(String[] args) {

    //do while loop
    int i = 0;
    do {
        System.out.println(i);
        i++;
    }
    while (i < 5);

    int n = 10;
    do {
        System.out.println("n is " + n);
        n++;
    }
    while (n < 5);

    int dice = 1;
    while (dice <= 6) {
        if (dice < 6) {
            System.out.println("No Yatzy.");

        } else {
            System.out.println("Yatzy!");
        }
        dice = dice + 1;
    }

    int w  = 1;
    while (w<=5){
        System.out.println("The value of w is " + w);
        w++;
    }
}
