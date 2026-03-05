public class Allatok {
    public static void main(String[] args) throws Exception {
        
        Allat animal = new Allat( "állat", "szín", 0 );
        System.out.println( animal.name );
        System.out.println( animal.color );
        System.out.println( animal.weight );
        animal.speaking();
        animal.moving();
        System.out.println();

        Vereb vili = new Vereb( "Vili", "Barna", 1 );
        System.out.println( vili.name );
        System.out.println( vili.color );
        System.out.println( vili.weight );
        vili.speaking();
        vili.moving();
        System.out.println();

        Kutya bodri = new Kutya( "Bodri", "Fehér", 200 );
        System.out.println( bodri.name );
        System.out.println( bodri.color );
        System.out.println( bodri.weight );
        bodri.speaking();
        bodri.moving();
    }
}
