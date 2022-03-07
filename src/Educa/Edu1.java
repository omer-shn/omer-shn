package Educa;

import javax.swing.JOptionPane;

public class Edu1 {
    public static void main(String[] args) {

        String name= JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"your age "+age+" years old");

       double height = Integer.parseInt(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null,"your height "+height+" cm tall");

    }

}
