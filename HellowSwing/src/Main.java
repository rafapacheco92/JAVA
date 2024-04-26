import javax.swing.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HomeScreen s = new HomeScreen();
        s.setContentPane(s.mainPanel);
        s.setTitle("First Swing");
        s.setSize(400, 300);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}