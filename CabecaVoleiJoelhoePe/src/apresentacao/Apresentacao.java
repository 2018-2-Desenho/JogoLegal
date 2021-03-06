package apresentacao;

import javax.swing.JFrame;

public class Apresentacao extends JFrame {
    private MenuPrincipal menu;
    private MenuArena menuArena;
    private MenuJogador menuJogador;
    
    public Apresentacao(){
        menu = new MenuPrincipal(this);
        menuArena = new MenuArena(this);
        menuJogador = new MenuJogador(this);
        
        add(menu);

        setSize(800, 600);

        setTitle("Cabeça Vôlei Joelho e Pé!");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void showMenuArena(){
        remove(menu);
        
        add(menuArena);
        revalidate();            
        menuArena.requestFocusInWindow();        
        menuArena.repaint();
    }
    
    public void showMenuJogador(){
        remove(menuArena);
        
        add(menuJogador);
        revalidate();            
        menuJogador.requestFocusInWindow();        
        menuJogador.repaint();
    }
    
    public static void main(String[] args) {
        Apresentacao app = new Apresentacao();
        app.setVisible(true);
    }
}
