import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReader {
    public ArrayList <String> InputList ( ) {
        
            ArrayList <String> input = new ArrayList <> ();
        try {
            File inputFile = new File ( "C:\\Users\\Lukas.Hoernle\\IdeaProjects\\aoc2020\\src\\inputBase" );
            Scanner scanner = new Scanner ( inputFile );
            for( String inputLine= scanner.nextLine (); !inputLine.isEmpty ();input.add ( inputLine )){
                System.out.println ( "inputLine: " + inputLine );
                try {
                    inputLine = scanner.nextLine ();
                }catch ( NoSuchElementException e ){
                    break;
                }
            }
        } catch ( Exception e ) {
            System.out.println ( "EXCEPTION: " + e );
        }
        return input;
    }

    public static ArrayList <String> main (  ) {
        ArrayList <String> input = new ArrayList <> ();
        try {
            File inputFile = new File ( "C:\\Users\\Lukas.Hoernle\\IdeaProjects\\aoc2020\\src\\InputBase" );
            Scanner scanner = new Scanner ( inputFile );
            for( String inputLine= scanner.nextLine (); !inputLine.isEmpty ();input.add ( inputLine )){
                System.out.println ( "inputLine: " + inputLine );
                try {
                    inputLine = scanner.nextLine ();
                }catch ( NoSuchElementException e ){
                    break;
                }
            }
        } catch ( Exception e ) {
            System.out.println ( "EXCEPTION: " + e );
        }
        return input;
    }

    public InputReader ( ) {
    }
}
