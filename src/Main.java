import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Lutfur Rahman Tanvir
//Department of CSE
//Daffodil Internation University
public class Main extends JFrame {
    private Container c;
    private JLabel nameLabel, ageLabel;
    private JTextField nameField, ageField;
    private JButton check, reset;

    Main(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        innerComponents();
        setTitle("Voting Eligibility Checker");
    }

    public void innerComponents(){
        c = this.getContentPane();
        c.setLayout(null);

        nameLabel = new JLabel();
        nameLabel.setText("Name");
        nameLabel.setBounds(50, 30, 80, 25);
        c.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(140, 30, 200, 25);
        c.add(nameField);

        ageLabel = new JLabel();
        ageLabel.setText("Age");
        ageLabel.setBounds(50, 70, 80, 25);
        c.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(140, 70, 200, 25);
        c.add(ageField);

        check = new JButton("Check");
        check.setBounds(80,130,80,25);
        c.add(check);

        reset = new JButton("Reset");
        reset.setBounds(220,130,80,25);
        c.add(reset);

        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                int uAge = Integer.parseInt(age);

                if(uAge>=18){
                    JOptionPane.showMessageDialog(null, name +" "+ "is eligible to vote!");
                } else {
                    JOptionPane.showMessageDialog(null, name +" "+ "is not eligible to vote!");
                }
            }
        });

        reset.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                nameField.setText(null);
                ageField.setText(null);
            }
        });
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
    }
}