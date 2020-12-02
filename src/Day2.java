import java.util.ArrayList;

public class Day2 {
    public static void main ( String[] args ) {
        mainus();
    }
    public static void mainus() {
        int i = 0;
        ArrayList <String> input = InputReader.main ();
        for (String e : input) {
            String Password= e.substring ( e.indexOf ( ':' )  ); 
        String needs = e.substring ( 0,e.indexOf ( ':' )  );
        char[] passwordChar= Password.toCharArray ();
            String biggest = needs.substring ( needs.indexOf ( '-' )+1,needs.length ()-2 );
            String smallest = needs.substring ( 0,needs.indexOf ( '-' ) );
      // int occurences =countChar ( Password,needs.charAt ( needs.length ()-1 ) );
            if(passwordChar[Integer.parseInt ( biggest )+1]==needs.charAt ( needs.length ()-1 ) &&!(passwordChar[Integer.parseInt ( smallest )+1]==needs.charAt ( needs.length ()-1 ) )) {
                i++;
            }
            else if(!(passwordChar[Integer.parseInt ( biggest )+1]==needs.charAt ( needs.length ()-1 ) )&&(passwordChar[Integer.parseInt ( smallest )+1]==needs.charAt ( needs.length ()-1 ) )) {
                i++;
            }
                System.out.println ( i );
        }
        }
    
    public static int countChar(String str, char c)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }
        System.out.println (count);
        return count;
    }
        }