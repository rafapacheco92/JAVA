import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            BankAcc b = new BankAcc();
            b.setContentPane(b.mainPanel);
            b.setTitle("Bank Account");
            b.setSize(500, 500);
            b.setVisible(true);
            b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
