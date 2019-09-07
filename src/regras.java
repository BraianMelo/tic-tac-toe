
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class regras {
     
    public regras(){
         Menu m = new Menu();
         
         boolean ganhou = false;
         
         ganhou = verificacao(ganhou,Menu.quadrados,0,1,2,3);
         ganhou = verificacao(ganhou,Menu.quadrados,0,3,6,1);
         ganhou = vertical(ganhou,Menu.quadrados);
         
         if(ganhou == true){
             if(turno.t % 2 == 0){
                JOptionPane.showMessageDialog(null,"O ganhou!");
             }else{
                JOptionPane.showMessageDialog(null,"X ganhou!"); 
             }
         }else{
             if(turno.t == 9){
                 JOptionPane.showMessageDialog(null,"Deu velha!");
             }
         }
         
    }
 
    
    public boolean verificacao(boolean g,List<panelClass> l,int a,int b,int c,int passo){
        for(int cont = 1; cont <= 3 ;++cont){
            if((l.get(a).simbolo == l.get(b).simbolo) && (l.get(a).simbolo == l.get(c).simbolo)){
                if(l.get(a).simbolo > 0){
                    g = true;
                    return g;
                }
            }
            a = a + passo;
            b = b + passo;
            c = c + passo;
        }
        return g;
    }
    
    public boolean vertical(boolean g,List<panelClass> l){
       if((l.get(0).simbolo == l.get(4).simbolo) && (l.get(0).simbolo == l.get(8).simbolo)){
            if(l.get(0).simbolo > 0){
                g = true;
                return g;
            }
        }else if((l.get(2).simbolo == l.get(4).simbolo) && (l.get(2).simbolo == l.get(6).simbolo)){
           if(l.get(2).simbolo > 0){
                g = true;
                return g;
            } 
        }else{
            return g;
        }
    return g;}
    
}
