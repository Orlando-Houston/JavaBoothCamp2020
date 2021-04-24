package firstDay;

public class HourGlassForLoop2 {
    public static void main(String[] args) {
        //upper part
        for(int i=1 ; i<8 ; i ++){
            //Spaces
            for(int j=1 ; j < i ; j++){
                System.out.print("-");
            }
            //Numbers
            for(int k=i ; k<8 ; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=6 ; i>=1 ; i--){
            //spaces
            for(int j=1 ; j<i ; j++){
                System.out.print("-");
            }
            //Numbers
            for(int k=i ; k<8 ; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
