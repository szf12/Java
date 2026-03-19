import java.util.Scanner;

public class GettingData {

    private Scanner scan;

    public GettingData() {

        scan = new Scanner( System.in );
    }

    public char getSpell( String text ) {

        System.out.print( text );
        String inText = scan.next();
        char spell = inText.charAt(0 );
        
        return spell;
    }

    public String getString( String text ) {

        System.out.print( text );

        return scan.next();
    }

    public int getInt( String text ) {

        System.out.print( text );
        String numberStr = scan.next();
        int number = 0;

        if( numberStr.matches( "[0-9]+" )) {

            number = Integer.parseInt( numberStr );

        }else {

            System.out.println( "Adatbeviteli hiba." );
        }

        return number;
    }

    public double getDouble( String text ) {

        System.out.print( text );
        String numberStr = scan.next();
        double number = 0;

        if( numberStr.matches( "[0.-9.]+" )) {

            number = Double.parseDouble( numberStr );

        }else {

            System.out.println( "Adatbeviteli hiba." );
        }

        return number;
    }
        
}
