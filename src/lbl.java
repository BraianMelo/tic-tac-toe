
import java.awt.Font;
import javax.swing.JLabel;


public class lbl extends turno {
    
    public JLabel getLabel(){
        JLabel l = new JLabel();
        if(t % 2 == 0){
            l.setText("X");
        }else{
            l.setText("O");
        }
        l.setFont(new Font("Times New Roman", Font.PLAIN , 100));
        l.setHorizontalAlignment(JLabel.CENTER);
        return l;
    }
}
