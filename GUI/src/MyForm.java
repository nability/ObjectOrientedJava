import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyForm implements ActionListener{

    JTextField txtNama;
    JTextArea txtAlamat;
    JButton btnSubmit, btnCancel;
    public MyForm(){

        JFrame frame = new JFrame("Data Mahasiswa");
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JLabel L1 = new JLabel("Nama");
        JLabel L2 = new JLabel("Alamat");
        txtNama = new JTextField(10);
        txtAlamat = new JTextArea(3, 10);
        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");
        btnSubmit.addActionListener(this);
        btnCancel.addActionListener(this);
        
        JPanel panel = new JPanel (new GridLayout(3,2));
        panel.setBackground(Color.pink);
        panel.add(L1);
        panel.add(txtNama);
        panel.add(L2);
        panel.add(txtAlamat);
        panel.add(btnSubmit);
        panel.add(btnCancel);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSubmit){
            String nama = txtNama.getText();
            String alamat = txtAlamat.getText();

            String data = "Nama :" + nama;
            data += "\nAlamat :" +alamat;
            JOptionPane.showMessageDialog(null, data);
        }
        else if(e.getSource()==btnCancel){
            txtNama.setText(null);
            txtAlamat.setText(null);
        }
    }
}
