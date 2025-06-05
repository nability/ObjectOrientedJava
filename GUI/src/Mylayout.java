import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mylayout extends JFrame{
    JButton b1,b2,b3,b4,b5;

    public Mylayout(){
        super("Border Layout");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        b1 = new JButton("NORTH");
        b2 = new JButton("SOUTH");
        b3 = new JButton("EAST");
        b4 = new JButton("WEST");
        b5 = new JButton("CENTER");

        panel.add(b1,BorderLayout.NORTH);
        panel.add(b2,BorderLayout.SOUTH);
        panel.add(b3,BorderLayout.EAST);
        panel.add(b4,BorderLayout.WEST);
        panel.add(b5,BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Mylayout();
    }
}
