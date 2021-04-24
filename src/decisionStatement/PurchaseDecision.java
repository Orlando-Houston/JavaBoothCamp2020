package decisionStatement;
/*Purchase Decision
Color of the item : Red := 20 , Blue = 10
Price : Tag price
Discount : Percentage
Point of the item = Tag price * Percentage color
If point >= 100 do not buy
If point between 50 99 buy later
Below 50 buy it now
*/

public class PurchaseDecision {
    public static void main(String[] args) {
        String color="red";
        float price=12.99f;
        int percentage=45;
        double score=0;
        if (color.equals("red")){
            score=price*percentage-20;
        }
        else if (color.equals("blue")){
            score=price*percentage-10;
        }
        if (score>=100){
            System.out.println("Don't buy");
        }
        else if (score>=50&&score<100){
            System.out.println("Buy it later");
        }
        else{
            System.out.println("Buy it right now");
        }
}}
