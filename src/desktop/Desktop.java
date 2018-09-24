/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desktop;
import java.awt.PopupMenu;
import javax.swing.*;
import static sun.security.jgss.GSSUtil.login;
/**
 *
 * @author Maxie
 */
public class Desktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a frame
        JFrame myframe=new JFrame("login page");
        JPanel mypanel=new JPanel();
        JLabel namelabel=new JLabel("Name: ");
        JTextField name=new JTextField();
        name.setColumns(20);
        JLabel passwordlabel=new JLabel("Password: ");
        JTextField password;
        password = new JTextField();
        password.setColumns(20);
        JButton submit=new JButton("LOGIN");
        mypanel.add(namelabel);
        mypanel.add(name);
        mypanel.add(passwordlabel);
        mypanel.add(password);
        mypanel.add(login);
        myframe.add(mypanel);
        myframe.setSize(800, 400);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        //creating a panel
        
        
        // TODO code application logic here
    }

}
