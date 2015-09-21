/*
 * This class demonstrates the ability to write a msg to a Joptionpane. 
*  Honesty clause I jacked alot of this code from the Independent copy class,  turns out it is portable.
* Hopefully thats what Jim intended us to notice here, and is an example of why to write code like this
* and not a -5 event. 
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author andre_000
 */
public class GuiJOptionMsgWriter implements MsgWriter {
    
    @Override
    public final void writeln( String line ) {
            JOptionPane.showMessageDialog(null, "Incoming Message: " + line);
	}
}
