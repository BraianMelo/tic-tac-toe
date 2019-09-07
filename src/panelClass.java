
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

import javax.swing.JPanel;



public class panelClass extends JPanel {
    
    public int nl;
    
    public panelClass(int x){
      nl = x;  
    }
    
    public int simbolo ;
    private boolean clicado = false;
    turno turno = new turno();
    
    public JPanel p(){
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        p.setLayout(new BorderLayout());
        p.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent arg0) {}

            @Override
            public void mousePressed(MouseEvent arg0) {}

            @Override
            public void mouseReleased(MouseEvent arg0) {
                Menu m = new Menu();
                if(clicado == false){
                    JLabel lbl = new lbl().getLabel();
                    p.add(lbl, BorderLayout.CENTER);
                    turno.addT();
                    clicado = true;
                    
                    if(lbl.getText().equals("X")){
                        Menu.quadrados.get(nl).setSimbolo(1);
                    }else{
                        Menu.quadrados.get(nl).setSimbolo(2);
                    }

                    p.repaint();
                    p.revalidate();
                    new regras();
                }
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {}

            @Override
            public void mouseExited(MouseEvent arg0) {}
            
        });
        return p;
    }

    public int getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(int simbolo) {
        this.simbolo = simbolo;
    }
    
    public void changeBackground(){
        setBackground(Color.red);
    }


    

}




