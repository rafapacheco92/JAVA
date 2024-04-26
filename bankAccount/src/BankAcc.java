import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAcc extends JFrame {

    Account a = new Account("Espanta", 23, 1047965.9f);

    private JLabel balanceTitle;
    private JLabel JBalance;
    private JTextField depositInput;
    private JButton sendButton;
    private JTextField withInput;
    private JButton recieveButton;
    public JPanel mainPanel;

    public BankAcc() {
        JBalance.setText(Float.toString(a.getBalance()));

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float value = Float.parseFloat(depositInput.getText());
                a.deposit(value);
                JBalance.setText(Float.toString(a.getBalance()));
            }
        });
        recieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float value = Float.parseFloat(withInput.getText());
                a.withdraw(value);
                JBalance.setText(Float.toString(a.getBalance()));
            }
        });
    }
}
