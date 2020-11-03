import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*; 
import java.util.Scanner; 

@SuppressWarnings("serial")
public class login_form extends JFrame implements ActionListener{

    private Container c; 
    private JLabel title;

    private JLabel name;
    private JLabel res; 
    private JTextField tname; 
    private JTextField tpass;
    private JButton sub;
    private JButton back;

    // Scanner scn = new Scanner(System.in); 
    // DataOutputStream dos;
    // DataInputStream dis;
    // Socket s;
    // InetAddress ip;
    
    // public login_form(){
    //     try{
    //         ip = InetAddress.getByName("localhost"); 
    //         // establish the connection with server port 5056 
    //         s = new Socket(ip, 5056); 
    //         // obtaining input and out streams 
    //         dis = new DataInputStream(s.getInputStream()); 
    //         dos = new DataOutputStream(s.getOutputStream());

    //     }catch(Exception e){e.printStackTrace();} 

    // }
    

    public void form(){
        setTitle("User Login"); 
        setBounds(300, 90, 550, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Login Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(500, 100); 
        title.setLocation(200, 30); 
        c.add(title);

        name = new JLabel("Username"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(150, 20); 
        name.setLocation(100, 200); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(200, 20); 
        tname.setLocation(250, 200); 
        c.add(tname); 

        name = new JLabel("Password"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(150, 20); 
        name.setLocation(100, 240); 
        c.add(name); 
  
        tpass = new JTextField(); 
        tpass.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tpass.setSize(200, 20); 
        tpass.setLocation(250, 240); 
        c.add(tpass);

        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(150, 60); 
        sub.setLocation(280, 350); 
        sub.addActionListener(this); 
        c.add(sub);

        back = new JButton("Back"); 
        back.setFont(new Font("Arial", Font.PLAIN, 15)); 
        back.setSize(150, 60); 
        back.setLocation(125, 350); 
        back.addActionListener(this); 
        c.add(back);

        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(125, 400); 
        c.add(res);

        setVisible(true);
    }

<<<<<<< HEAD
    public void actionPerformed(ActionEvent eve){
        try{
            

            String username;
            String password;
            login_reg_choose_form login_signup = new login_reg_choose_form(); 
            home_page home = new home_page();
            
            if (eve.getSource() == sub){
                
                // String status="";
                //String status = acch.old_user_login(username,password);
                
                username = tname.getText();
                password = tpass.getText();
                
                // dos.writeUTF("old_user_login");
                // dos.writeUTF(username);
                // dos.writeUTF(password);
                // status = dis.readUTF();
                // System.out.println(status);
                
                // if(status.equals("err:password") || status.equals("err:username") || status.equals("")){
                //     res.setText(status);
                // }
                // else{
                    //dos.writeUTF("terminate");
                    
                    home.form();    // if login success
                    // scn.close(); 
                    // dis.close(); 
                    // dos.close(); 
                    // s.close();
                    JComponent comp = (JComponent) eve.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp);
                    win.dispose();
                // }
                
                
            }
            else if (eve.getSource() == back) {
                login_signup.form();
                JComponent comp = (JComponent) eve.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
            }
        }catch(Exception e){e.printStackTrace();} 
    
=======
    public void actionPerformed(ActionEvent e){

        String username;
        String password;
        login_reg_choose_form login_signup = new login_reg_choose_form(); 
        home_page home = new home_page();
        
        if (e.getSource() == sub){
            System.out.print("hm");
            username = tname.getText();
            password = tpass.getText();

            home.form();    // if login success
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        }
        else if (e.getSource() == back) {
            login_signup.form();
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        }
>>>>>>> old-project-state
    }

}
