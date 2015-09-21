/*
 * This class demonstrates the ability to write a msg to the console. 
 *  Honesty clause I jacked alot of this code from the Independent copy class,  turns out it is portable.
 * Hopefully thats what Jim intended us to notice here, and is an example of why to write code like this
 * and not a -5 event. 
 * 
 * 
 */
package dip.lab3;

/**
 *
 * @author andre_000
 */
public class ConsoleMsgWriter implements MsgWriter {

    @Override
    public final void writeln(String line) {
        System.out.println("Incoming Message:");
        System.out.println(line);
    }
}
