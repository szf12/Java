import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFrame extends JFrame {

    FirstFrame() {

        super( "Első ablak" );
        initComponents();
    }

    private void initComponents() {

        this.setSize( 400, 300 );
        this.setDefaultCloseOperation( this.EXIT_ON_CLOSE );
        this.setLayout( null );

        JButton exitBtn = new JButton();
        exitBtn.setText( "Kilépés" );
        exitBtn.setBounds( 300, 220, 80, 30);
        this.add( exitBtn );

        exitBtn.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed( ActionEvent event ) {

                if( event.getSource() == exitBtn ) {

                    System.exit( 0 );
                }
            }
        });
    }

     
}
