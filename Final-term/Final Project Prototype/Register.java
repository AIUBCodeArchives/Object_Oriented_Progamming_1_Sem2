import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Register extends JFrame{

    
    private JPanel rc;
    private JPanel lc;
    private JLabel imgLabel; 
    private JLabel headLabel;  
    private JLabel headLabel1;
    private JLabel headLabel2;
    private JLabel headLabel3;
    private JLabel userLabel;
    private JLabel emailLabel;
    private JLabel passLabel;
    private JLabel logiInfo;
    private JLabel termsLabel;
    
    private ImageIcon image;
    private Font headFont;
    private Font headFont1;
    private Font headFont2;
    private Font detFont;
    private Font detFont1;
    private JTextField username;
    private JTextField emailField;
    private JPasswordField password;
    private JButton signup;
    private JButton reset;
    private JButton login;
    private JCheckBox termsBox;
    String blueColor1 = "#b7e1f6";
    String blueColor2 = "#5271ff";

    
    Register()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(290, 150, 1000, 530);
        this.setResizable(false); 
        this.setTitle("Registration");
        initComponents();
        
    }

    public void initComponents()
    {
        leftComponent();
        rightComponents();
    }
    
    public void leftComponent()
    {
        
        

        lc = new JPanel();
        lc.setLayout(null);
        lc.setBounds(0,0,635,530);
        
        headFont1 = new Font("Open Sans", Font.BOLD, 30);
        headFont2 = new Font("Open Sans", Font.BOLD, 60);

        image = new ImageIcon(getClass().getResource("rsz_n7.jpg"));
        imgLabel = new JLabel(image);
        imgLabel.setBounds(0,0,635,530);  
        lc.add(imgLabel);
        
        headLabel1 = new JLabel("AMERICAN INTERNATIONAL UNIVERSITY");
        headLabel1.setBounds(20,120,650,50);
        headLabel1.setForeground(Color.white);
        headLabel1.setFont(headFont1);
        imgLabel.add(headLabel1);

        headLabel2 = new JLabel("-BANGLADESH");
        headLabel2.setBounds(10,155,650,70);
        headLabel2.setForeground(Color.WHITE);
        headLabel2.setFont(headFont1);
        imgLabel.add(headLabel2);

        headLabel3 = new JLabel("GYMNASIUM");
        headLabel3.setBounds(10,205,650,70);
        headLabel3.setForeground(Color.WHITE);
        headLabel3.setFont(headFont2);
        imgLabel.add(headLabel3);

        this.add(lc);
    }

    public void rightComponents()
    {
        rc = new JPanel();
        rc.setLayout(null);
        rc.setBounds(700,0,365,530);
        rc.setBackground(Color.decode(blueColor1));

        headFont = new Font("Open Sans", Font.BOLD, 30);
        detFont = new Font("Open Sans", Font.BOLD, 20);
        detFont1 = new Font("Open Sans", Font.BOLD, 15);
        

        headLabel = new JLabel("Registration");
        headLabel.setBounds(720, 30,300, 60);
        headLabel.setFont(headFont);
        headLabel.setForeground(Color.decode(blueColor2));
        //headLabel.setStroke(new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        rc.add(headLabel);

        
        userLabel = new JLabel("Username : ");
        userLabel.setBounds(655, 70, 180,100);
        userLabel.setFont(detFont);
        rc.add(userLabel);

        username = new JTextField();
        username.setBounds(655,140,305,30);
        username.setFont(detFont);
        rc.add(username);

        emailLabel = new JLabel("Email : ");
        emailLabel.setBounds(655,150, 180,100);
        emailLabel.setFont(detFont);
        rc.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(655, 230, 305,30);
        emailField.setFont(detFont);
        rc.add(emailField);

        passLabel = new JLabel("Password : ");
        passLabel.setBounds(655, 250, 180,100);
        passLabel.setFont(detFont);
        rc.add(passLabel);

        password = new JPasswordField();
        password.setBounds(655,330,305,30);
        password.setFont(detFont);
        rc.add(password);

        
        signup = new JButton("Sign up");
        signup.setBounds(655,380,130, 50);
        signup.setBackground(Color.decode(blueColor2));
        signup.setForeground(Color.WHITE);
        signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signup.setFont(detFont);
        rc.add(signup);

        reset = new JButton("Reset");
        reset.setBounds(830,380,130, 50);
        reset.setBackground(Color.decode(blueColor2));
        reset.setForeground(Color.WHITE);
        reset.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reset.setFont(detFont);
        rc.add(reset);

        termsBox = new JCheckBox();
        termsBox.setBounds(675, 430,20,30);
        termsBox.setBackground(Color.decode(blueColor1));
        rc.add(termsBox);

        termsLabel = new JLabel("Read and agreed to terms and conditions");
        termsLabel.setBounds(700, 430, 250, 30);
        rc.add(termsLabel);

        logiInfo = new JLabel("Already have an account? ");
        logiInfo.setBounds(700,450, 220,30);
        rc.add(logiInfo);

        login = new JButton("Log in");
        login.setBounds(825, 450,100,30);
        login.setContentAreaFilled(false);
        login.setBorderPainted(false);
        login.setFont(detFont1);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setBackground(Color.decode(blueColor1));
        rc.add(login);

        this.add(rc);

    }
    
}
