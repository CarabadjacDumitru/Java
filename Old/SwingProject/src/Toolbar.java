import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private TextPanel textPanel;
    private StringListener stringListener;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

            if (clicked == helloButton) {
            if(stringListener!=null){
                stringListener.textEmitted("Hello-StringListener");
            }
        } else  if (clicked == goodbyeButton) {
                if(stringListener!=null){
                    stringListener.textEmitted("Goodbye-StringListener");
                }
        }
    }
}