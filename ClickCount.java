import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// GitHub : Muhia1
public class ClickCount implements ActionListener {

    private int count = 0;
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private JLabel label;

    public ClickCount(){
  
        button = new JButton("Click Here");
            button.addActionListener(this);

        label = new JLabel("Number of Clicks: 0");

        frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setSize(250, 380);
            frame.setTitle("Action Listener on the number of Clicks.");

        panel = new JPanel();
            frame.add(panel);
            panel.add(button);
            panel.add(label);
            panel.setLayout(new GridLayout(0,1));
            panel.setBorder(BorderFactory.createEmptyBorder(30, 25, 30, 35));

    }

    public static void main(String[] args) {
        new ClickCount();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: " + count);
    }
}
// GitHub : Muhia1
