import java.util.Scanner;
public class Main {
    public static void PizzaType(){
        System.out.println("Choose any Pizza:");
        System.out.println("1. Normal Pizza");
        System.out.println("2. Deluxe Pizza");
    }
    public static int vegOrNonveg(){
        System.out.println("\n-------------------------------\n");
        System.out.println("Select your pizza type:");
        System.out.println("1. veg Pizza");
        System.out.println("2. Non-veg Pizza");
        return getoption();
    }

    public static int addons(){
        System.out.println("\n-------------------------------\n");
        System.out.println("Select add-ons:");
        System.out.println("1. Extra Cheese");
        System.out.println("2. Extra Toppings");
        System.out.println("3. Both extra Cheese and Toppings");
        System.out.println("4. None");
        return getoption();
    }

    public static int takeAway(){
        System.out.println("\n-------------------------------\n");
        System.out.println("Do you want a take-away");
        System.out.println("1. Yes");
        System.out.println("2. No");
        return getoption();
    }

    public static int getoption(){
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasePizza p = null;
        DeluxPizza dp = null;

        System.out.println("\n..Welcome to PIZZA-HUT..\n");
        PizzaType();
        if(getoption() == 1){
            if(vegOrNonveg() == 1) {
                p = new BasePizza(true);
            }
            else {
                p = new BasePizza(false);
            }
            int op = addons();
            if(op == 1){
                p.addExtraCheese();
            }
            else if(op == 2){
                p.addExtraToppings();
            }
            else if(op == 3){
                p.addExtraCheese();
                p.addExtraToppings();
            }
        }
        else{
            if(vegOrNonveg() == 1){
                p = new DeluxPizza(true);
            }
            else{
                p = new DeluxPizza(false);
            }
        }

        int op = takeAway();
        if(op == 1) {
            p.takeAway();
            System.out.println("\n-------------------------------\n");
            p.getBill();
        }
        else {
            System.out.println("\n-------------------------------\n");
            p.getBill();
        }

    }
}