public static void main(String[] args) {
//And operator
    int a = 200;
    int b = 33;
    int c = 500;

    if (a > b && c > a) {
        System.out.println("Both conditions are true");
    }
//or operator

    if (a > b || a > c) {
        System.out.println("At least one condition is true");
    }
    //NOT operator
    if (!(a > b)) {
        System.out.println("a is NOT greater than b");
    }
    boolean isLoggedIn = true;
    boolean isAdmin = false;
    int securityLevel = 3; // 1 = highest

    if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
        System.out.println("Access granted");
    } else {
        System.out.println("Access denied");
    }

    int doorCode = 1337;

    if (doorCode == 1337) {
        System.out.println("Correct code. The door is now open.");
    } else {
        System.out.println("Wrong code. The door remains closed.");
    }
    int myAge = 25;
    int votingAge = 18;

    if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
    } else {
        System.out.println("Not old enough to vote.");
    }
    int age = 20;
    boolean isCitizen = true;

    if (age >= 18) {
        System.out.println("Old enough to vote.");

        if (isCitizen) {
            System.out.println("And you are a citizen, so you can vote!");
        } else {
            System.out.println("But you must be a citizen to vote.");
        }
    } else {
        System.out.println("Not old enough to vote.");
    }
    int temperature = 30;

    if (temperature < 0) {
        System.out.println("It's freezing!");
    } else if (temperature < 20) {
        System.out.println("It's cool.");
    } else {
        System.out.println("It's warm.");
    }

}