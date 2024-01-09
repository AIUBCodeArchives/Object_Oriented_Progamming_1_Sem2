import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame{

    private JPanel c;
    private JLabel imgLabel;
    private JLabel headLabel;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel regiInfo;
    
    private ImageIcon image;
    private Font headFont;
    private Font detFont;
    private Font detFont1;
    private JTextField username;
    private JPasswordField password;
    private JButton login;
    private JButton reset;
    private JButton register;
    String blueColor1 = "#b7e1f6";
    String blueColor2 = "#5271ff";

    Login()
    {
        initcomponents();
    }

    public void initcomponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(580, 150, 380, 530);
        this.setResizable(false);
        this.setTitle("AIUB GYMNASIUM");

        c = new JPanel();
        c.setLayout(null);
        c.setBackground(Color.decode(blueColor1));

        headFont = new Font("Open Sans", Font.BOLD, 30);
        detFont = new Font("Open Sans", Font.ITALIC, 20);
        detFont1 = new Font("Open Sans", Font.ITALIC, 15);
        

        image = new ImageIcon(getClass().getResource("aiub.png"));
        imgLabel = new JLabel(image);
        imgLabel.setBounds(130,15,image.getIconWidth(),image.getIconHeight());  
        c.add(imgLabel);  

        headLabel = new JLabel("AIUB GYMNASIUM");
        headLabel.setBounds(50, 110,300, 60);
        headLabel.setFont(headFont);
        headLabel.setForeground(Color.decode(blueColor2));
       // headLabel.setStroke(new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        c.add(headLabel);

        userLabel = new JLabel("Username : ");
        userLabel.setBounds(40, 140, 180,100);
        userLabel.setFont(detFont);
        c.add(userLabel);

        username = new JTextField();
        username.setBounds(40,210,290,30);
        username.setFont(detFont);
        username.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        c.add(username);
        
        passLabel = new JLabel("Password : ");
        passLabel.setBounds(40, 230, 180,100);
        passLabel.setFont(detFont);
        c.add(passLabel);

        password = new JPasswordField();
        password.setBounds(40,300,290,30);
        password.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        password.setFont(detFont);
        c.add(password);

        login = new JButton("Log in");
        login.setBounds(40,350,130, 50);
        login.setBackground(Color.decode(blueColor2));
        login.setForeground(Color.WHITE);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setFont(detFont);
        c.add(login);

        reset = new JButton("Reset");
        reset.setBounds(200,350,130, 50);
        reset.setBackground(Color.decode(blueColor2));
        reset.setForeground(Color.WHITE);
        reset.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reset.setFont(detFont);
        c.add(reset);

        regiInfo = new JLabel("Don't have an account? Create one! ");
        regiInfo.setBounds(50,400, 220,30);
        c.add(regiInfo);

        register = new JButton("Register");
        register.setBounds(243, 400,100,30);
        register.setContentAreaFilled(false);
        register.setBorderPainted(false);
        register.setFont(detFont1);
        register.setCursor(new Cursor(Cursor.HAND_CURSOR));
        register.setBackground(Color.decode(blueColor1));
        c.add(register);
        


        this.add(c);
        
    }
    
}
