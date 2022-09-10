/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author orion
 */
public class simple 
{
    public static void main(String[] args)
    {
       double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Price of Bill"));
       double tip = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Tip Percentage"));
       double total =(double) ((tip/100)*price)+price;
       double totaltip =(double) ((tip/100)*price);
       
       //System.out.println(price);
       //System.out.println(tip);
       System.out.println(total);
       System.out.println("$"+totaltip);
       JOptionPane.showMessageDialog(null,"Your Total is: " + price + "\nYour tip is: " + tip + "\nYour total after tip is: " + total );
    }
    
}
