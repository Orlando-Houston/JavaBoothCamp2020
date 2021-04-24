package firstDay;

public class CirclePerimeter {
    public static void main(String[]args){
        // type//variable name
        double piNumber=3.14;//value
        double radius=5.68;
        //void  void
        double circlePerimeter=2*piNumber*radius;
        //Class     //method      //void
        System.out.println(circlePerimeter);


//Calculating Rectangle Perimeter
        int widthRectangle=11;
        int higthRectangle=17;
        //void
        int rectanglePerimeter=2*(widthRectangle+higthRectangle);
        //Class    //method
        System.out.println(rectanglePerimeter);//void

        //Calculating Triangle
        int edge1=3;
        int edge2=5;
        int edge3=7;
        int perimeterTriangle=edge1+edge2+edge3;
        // System.out.println();
        System.out.println("Perimeter Triangle"+perimeterTriangle);

        //Convert Celcius to Fahrenheit
        int celcius=32;   // also we can make double
        int celsiusToFahrenheit=celcius*9/5+32;
        System.out.println("Fahrenheit:"+celsiusToFahrenheit);


    }
}
