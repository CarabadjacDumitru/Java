import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {


    private JPanel textPanel;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    private JTextField textfield5;
    private JTextField textfield6;
    private JButton btn;

    public MainFrame() {
        super("Hellloowwww");

        Dimension dim = getPreferredSize();
        dim.width=250;
        setPreferredSize(dim);

        textfield1 = new JTextField("First Name");
        textfield2 = new JTextField("Last Name");
        textfield3 = new JTextField("Third");
        textfield4 = new JTextField("Fourth");
        textfield5 = new JTextField("Fifth");
        textfield6 = new JTextField("Sixth");
        textPanel = new JPanel();
        btn = new JButton("Click");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx=0;
        gc.gridy=0;
        gc.weightx=1;
        gc.weighty=1;
        gc.fill = GridBagConstraints.NONE;
        add(textfield1,gc);



        gc.gridx=0;
        gc.gridy=1;
        gc.weightx = 200;
        add(textfield2,gc);

        gc.gridx=0;
        gc.gridy=1;
        gc.weighty = 200;
        add(textfield3,gc);

        gc.gridx=0;
        gc.gridy=2;
        gc.weightx = 200;
        add(textfield4,gc);

        gc.gridx=0;
        gc.gridy=3;
        gc.weighty = 200;
        add(textfield5,gc);

        gc.gridx=0;
        gc.gridy=4;
        gc.weightx = 200;
        add(textfield6,gc);

        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}