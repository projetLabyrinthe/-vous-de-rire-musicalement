package lab;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class ToolBarSample extends JFrame {
    
    private static final long serialVersionUID = 500331469341413571L;
    
    
    /* Construction de l'interface graphique */
    public ToolBarSample() {
        super( "Labyrinthe" );
        this.setSize(600,400);
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        
        // Construction et injection de la barre d'outils
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.add( this.createToolBar(), BorderLayout.NORTH );
    }
    

    /* M�thode de construction de la barre d'outils */
    private JToolBar createToolBar() {

        // La barre d'outils � proprement parler
        JToolBar toolBar = new JToolBar();

        JButton btnNew = new JButton( new ImageIcon( "icons/restart.png") );
        btnNew.setToolTipText( "New File (CTRL+N)" );
        btnNew.addActionListener( this::btnNewListener );
        toolBar.add( btnNew );

        JButton btnSave = new JButton( new ImageIcon( "icons/ma.png" ) );
        btnSave.setToolTipText( "Save (CTRL+S)" );
        toolBar.add( btnSave );

        JButton btnSaveAs = new JButton( new ImageIcon( "icons/play.png" ) );
        btnSaveAs.setToolTipText( "Save As..." );
        toolBar.add( btnSaveAs );

        toolBar.addSeparator();

        JButton btnCopy = new JButton( new ImageIcon( "icons/.png") );
        btnCopy.setToolTipText( "Copy (CTRL+C)" );
       
        toolBar.add( btnCopy );

        JButton btnCut = new JButton( new ImageIcon( "icons/con.png") );
       
        btnCut.setToolTipText( "Cut (CTRL+X)" );
        toolBar.add( btnCut );

        JButton btnPaste = new JButton( new ImageIcon( "icons/help.png") );
        btnPaste.setToolTipText( "Help (CTRL+V)" );
        toolBar.add( btnPaste );

        toolBar.addSeparator();

        JButton btnExit = new JButton( new ImageIcon( "icons/exit.png") );
        btnExit.setToolTipText( "Exit (ALT+F4)" );
        toolBar.add( btnExit );

        toolBar.addSeparator();

        // Autres types de composants graphiques
        toolBar.add( new JButton( new ImageIcon( "icons/aFile.png" ) ) );
   //     toolBar.add( new JCheckBox( "Check me" ) );
   //     toolBar.add( new JTextField( "Edit me" ) );

        return toolBar;
    }

    private void btnNewListener( ActionEvent event ) {
        JOptionPane.showMessageDialog( this, "Button clicked !" );
    }
   
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        ToolBarSample frame = new ToolBarSample();
        frame.setVisible( true );
    }
}