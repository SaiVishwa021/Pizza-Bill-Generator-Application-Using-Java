public class BasePizza {
    private int price = 0;
    private boolean veg;
    private int vegPrice = 300;
    private int nonvegPrice = 400;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 50;
    private int takeAwayPrice = 20;
    private boolean isExtraCheeseOpted = false;
    private boolean isExtraToppingsOpted = false;
    private boolean isTakeAwayOpted = false;

    BasePizza(boolean veg){
        this.veg = veg;
        if(veg){
            this.price += vegPrice;
        }
        else {
            this.price += nonvegPrice;
        }
    }

    public void addExtraCheese(){
        price += extraCheesePrice;
        isExtraCheeseOpted = true;
//        System.out.println("Extra Cheese Added");
    }

    public void addExtraToppings(){
        price += extraToppingsPrice;
        isExtraToppingsOpted = true;
//        System.out.println("Extra Toppings Added");
    }

    public void takeAway(){
        price += takeAwayPrice;
        isTakeAwayOpted = true;
//        System.out.println("Takeaway opted");
    }

    public void getBill(){
        System.out.println((veg ? "Veg" : "Non-Veg") + " Pizza : " + (veg ? vegPrice : nonvegPrice));
        if(isExtraCheeseOpted){
            System.out.println("Extra Cheese : "+ extraCheesePrice);
        }
        if(isExtraToppingsOpted){
            System.out.println("Extra Toppings : "+ extraToppingsPrice);
        }
        if(isTakeAwayOpted){
            System.out.println("TakeAway : "+ takeAwayPrice);
        }
        System.out.println("Total bill amount : " + price);
    }
}
