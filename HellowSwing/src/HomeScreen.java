import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame {
    public JPanel mainPanel;
    private JLabel Name;
    private JTextField nameText;
    private JButton sendButton;
    private JLabel nameLabel;

    public HomeScreen() {
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "Hello " + nameText.getText());
                nameLabel.setText(nameText.getText());
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
