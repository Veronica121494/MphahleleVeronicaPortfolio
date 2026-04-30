public static void main(String[] args) {
    int day = 4;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 8:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");

    }
    int cofeeChoice=2;
    switch (cofeeChoice){
        case 1:
            System.out.println("Espresso");
            break;
        case 2:
            System.out.println("Latte");
            break;
        case 3:
            System.out.println("Cappuccino");
            break;
        default:
            System.out.println("Invalid choice");
    }
// Outputs "Thursday" (day 4)
}