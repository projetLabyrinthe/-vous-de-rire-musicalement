package lab;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


@SuppressWarnings( "serial" )
public class ActionSample extends JFrame {
    
   
    /* Construction de l'interface graphique */
    public ActionSample() {
        super( "Labyrinthe" );
        this.setSize(600,400);
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        
        // Construction et injection de la barre de menu
        this.setJMenuBar( this.createMenuBar() );

        // Construction et injection de la barre d'outils
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.add( this.createToolBar(), BorderLayout.NORTH );
    
    }
    
    
    /* Methode de construction de la barre de menu */
    private JMenuBar createMenuBar() {

        // La barre de menu � proprement parler
        JMenuBar menuBar = new JMenuBar();

        // D�finition du menu d�roulant "File" et de son contenu
        JMenu mnuFile = new JMenu( "File" );
        mnuFile.setMnemonic( 'F' );

        /*JMenuItem mnuNewFile =*/ mnuFile.add( actNew );
        mnuFile.addSeparator();
        mnuFile.add( actOpen );
        mnuFile.add( actSave );
        mnuFile.add( actSaveAs );
        mnuFile.addSeparator();
        mnuFile.add( actExit );
        
        menuBar.add(mnuFile);
        
        // D�finition du menu d�roulant "Edit" et de son contenu
        JMenu mnuEdit = new JMenu( "Edit" );
        mnuEdit.setMnemonic( 'E' );
        
        mnuEdit.add( actUndo );
        mnuEdit.add( actRedo );
        mnuEdit.addSeparator();
        mnuEdit.add( actCopy );
        mnuEdit.add( actCut );
        mnuEdit.add( actPaste );

        menuBar.add(mnuEdit);

        // D�finition du menu d�roulant "Help" et de son contenu
        JMenu mnuHelp = new JMenu( "Help" );
        mnuHelp.setMnemonic( 'H' );
        
        menuBar.add( mnuHelp );
        
        return menuBar;
    }

    /* Methode de construction de la barre d'outils */
  private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();

        toolBar.add( actNew ).setHideActionText( true );
        toolBar.addSeparator();
        toolBar.add( actOpen ).setHideActionText( true );
        toolBar.add( actSave ).setHideActionText( true );
        toolBar.add( actSaveAs ).setHideActionText( true );
        toolBar.addSeparator();
        toolBar.add( actExit ).setHideActionText( true );
           
        return toolBar;
    }

    /* Methode de construction du menu contextuel */
    private JPopupMenu createPopupMenu() {
        JPopupMenu popupMenu = new JPopupMenu();
        
        popupMenu.add( actUndo );
        popupMenu.add( actRedo );
        popupMenu.addSeparator();
        popupMenu.add( actCopy );
        popupMenu.add( actCut );
        popupMenu.add( actPaste );

        return popupMenu;
    }

    /* Nos diverses actions */
    private AbstractAction actNew = new AbstractAction() {  
        {
            putValue( Action.NAME, "New File..." );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/new.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_N );
            putValue( Action.SHORT_DESCRIPTION, "New file (CTRL+N)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "New" );
        }
    };

    private AbstractAction actOpen = new AbstractAction() {  
        {
            putValue( Action.NAME, "Open File..." );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/open.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_O );
            putValue( Action.SHORT_DESCRIPTION, "Open file (CTRL+O)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Open" );
        }
    };

    private AbstractAction actSave = new AbstractAction() {  
        {
            putValue( Action.NAME, "Save File" );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/save.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_S );
            putValue( Action.SHORT_DESCRIPTION, "Save file (CTRL+S)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Save" );
        }
    };
   
    private AbstractAction actSaveAs = new AbstractAction() {  
        {
            putValue( Action.NAME, "Save As..." );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/save_as.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_A );
            putValue( Action.SHORT_DESCRIPTION, "Save file" );
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Save as" );
        }
    };
   
    private AbstractAction actExit = new AbstractAction() {  
        {
            putValue( Action.NAME, "Exit" );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/exit.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_X );
            putValue( Action.SHORT_DESCRIPTION, "Exit (ALT+F4)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Exit" );
        }
    };

    private AbstractAction actUndo = new AbstractAction() {  
        {
            putValue( Action.NAME, "Undo" );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/undo.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_U );
            putValue( Action.SHORT_DESCRIPTION, "Undo (CTRL+Z)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Undo" );
        }
    };

    private AbstractAction actRedo = new AbstractAction() {  
        {
            putValue( Action.NAME, "Redo" );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/redo.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_R );
            putValue( Action.SHORT_DESCRIPTION, "Redo (CTRL+U)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Redo" );
        }
    };

    private AbstractAction actCopy = new AbstractAction() {  
        {
            putValue( Action.NAME, "Copy" );//associer des valeurs aux actions 
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/copy.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_C );
            putValue( Action.SHORT_DESCRIPTION, "Copy (CTRL+C)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Copy" );
        }
    };

    private AbstractAction actCut = new AbstractAction() {  
        {
            putValue( Action.NAME, "Cut" );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/cut.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_T );
            putValue( Action.SHORT_DESCRIPTION, "Cut (CTRL+X)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Cut" );
        }
    };

    private AbstractAction actPaste = new AbstractAction() {  
        {
            putValue( Action.NAME, "Paste" );
            putValue( Action.SMALL_ICON, new ImageIcon( "icons/paste.png" ) );
            putValue( Action.MNEMONIC_KEY, KeyEvent.VK_P );
            putValue( Action.SHORT_DESCRIPTION, "Paste (CTRL+V)" );
            putValue( Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK ) ); 
        }
        
        @Override public void actionPerformed( ActionEvent e ) {
            System.out.println( "Paste" );
        }
    };

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        ActionSample frame = new ActionSample();
        frame.setVisible(true);
    }
}