import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

@SuppressWarnings("serial")
public class home_page extends JFrame implements ActionListener{
    private JButton market;
    private JButton feedback;
    private JButton about;
    private Container c;
    private JLabel title;
    String username;

    public void form(String username){
        username = "null";
        this.username = username;

        setTitle("BIG BASKET"); 
        setBounds(100, 100, 1000, 850);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null);

        title = new JLabel("BIG BASKET"); 
        title.setFont(new Font("Arial", Font.PLAIN, 60)); 
        title.setSize(500, 100); 
        title.setLocation(300, 150); 
        c.add(title);

        market = new JButton("MARKET"); 
        market.setFont(new Font("Arial", Font.PLAIN, 15)); 
        market.setSize(300, 100); 
        market.setLocation(320, 350); 
        market.addActionListener(this); 
        c.add(market);

        feedback = new JButton("FEEDBACK"); 
        feedback.setFont(new Font("Arial", Font.PLAIN, 15)); 
        feedback.setSize(300, 100); 
        feedback.setLocation(320, 500); 
        feedback.addActionListener(this); 
        c.add(feedback);

        about = new JButton("ABOUT"); 
        about.setFont(new Font("Arial", Font.PLAIN, 15)); 
        about.setSize(300, 100); 
        about.setLocation(320, 650); 
        about.addActionListener(this); 
        c.add(about);

        setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        market_form mark = new market_form();
        about abt = new about();

        if (e.getSource() == feedback) {

            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        }
        if (e.getSource() == about){
            abt.form(username);
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        }
        if (e.getSource() == market){
            mark.form(username);

            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        }
        
    }
}