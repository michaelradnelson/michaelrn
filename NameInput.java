/**
 *
 * Michael Nelson
 * Project #2
 *
*/

// imports
import javax.swing.*;
import java.awt.*;

/**
   NameInput class allows the user to enter their name
*/
public class NameInput extends JPanel
{
   // create field for name input
   private JTextField nameField = new JTextField(20);
   private String finalName;

   /**
      CONSTRUCTOR
   */
   public NameInput()
   {
	   
	  // create label to prompt user for name input
	  add(new JLabel("Enter your name: "));
	  add(nameField);
	  
	  // set layout
      setLayout(new GridLayout(2, 1));
      
   } // end of constructor

   /**
    * getName method
    * @return nameUser
    */
   public String getName()
   {
      String finalName = nameField.getText();

      return finalName;
   } 
   
} // end of class
