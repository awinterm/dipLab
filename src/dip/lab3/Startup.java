/*
 * Just a test class for input and output.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author awinterm
 */
public class Startup {

    public static void main(String[] args) {

        MsgWriter msgWriter1 = new ConsoleMsgWriter();
        MsgWriter msgWriter2 = new GuiJOptionMsgWriter();

        MsgReader msgReader1 = new KeyboardMsgReader();
        MsgReader msgReader2 = new RandomAdvancedJavaTipMsgReader();

        MsgService msg1 = new MsgService(msgReader1, msgWriter2);
        MsgService msg2 = new MsgService(msgReader2, msgWriter1);

        msg1.sendMsg();

        //  testing the random num gen and the other two abstractions;     
        for (int i = 0; i < 10; i++) {
            msg2.sendMsg();
        }
    }
}
