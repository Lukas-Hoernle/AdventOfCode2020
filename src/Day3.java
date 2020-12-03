import java.util.ArrayList;

public class Day3 {
    private ArrayList <String> input;
    public void getResult(    ){
        double result=0;//70*220*63*76*29
        int rightTurn=1;
        int currentCollumn=1;
        int currentRow=1;
        for (String inputString : input) {
         if(currentRow%2==1) {
             char[] inputArray = inputString.toCharArray ();
             if ( inputArray[ currentCollumn - 1 ] == '#' ) {
                 result++;
             }
             System.out.println ( inputString + "---" + (currentCollumn) + "---" + result );
             currentCollumn = currentCollumn + rightTurn;
             if ( currentCollumn > 31 ) {
                 currentCollumn = currentCollumn - 31;
             }
         }else{
           System.out.println ("nichts");
         }
         currentRow++;
        }
        System.out.println ("result: "+(result));
    }

    public Day3 ( ArrayList <String> input ) {
        this.input = input;
    }
}
