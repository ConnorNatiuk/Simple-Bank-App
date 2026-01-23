import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import resources.Colors;
import resources.FontLoader;

public class App {
    public static void main(String[] args) throws Exception {

        Font titleFont = FontLoader.titleFont(24f);
        JFrame frame = new JFrame();
        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        JPanel layoutPanel = new JPanel(new BorderLayout());
        JPanel titlePanel = new JPanel();

        titlePanel.setBackground(Colors.SOLID_LIGHT_BLUE);
        layoutPanel.add(titlePanel, BorderLayout.NORTH);
        

        JLabel bankTitleText = new JLabel("NATIUK BANK");
        bankTitleText.setFont(titleFont);
        titlePanel.add(bankTitleText);

        frame.add(layoutPanel);
        layoutPanel.setBackground(Colors.SOLID_CELESTE);

        frame.setVisible(true);
    }
}
