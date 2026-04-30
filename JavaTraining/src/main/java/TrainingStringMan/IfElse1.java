public static void main(String[] args) {
    boolean isRaining = true;
    boolean youAreHungry=false;

    //if statement
    if (youAreHungry){
        System.out.println("Eat something!");
    }

    //if else
    if (isRaining) {
        System.out.println("Bring an umbrella!");
    }
    else {
        System.out.println("Enjoy the sunshine!");
    }
     //else if
    int x = 20;
    int y = 18;
    if (x > y) {
        System.out.println("x is greater than y");
    }
    else if (x < y) {
        System.out.println("x is less than y");
    }
    else if (x==y) {
        System.out.println("x is equal to y");
    } else if (x<y) {
        System.out.println("x is less than y");

    }
    else{
        System.out.println("x is not equal to y");
    }
}