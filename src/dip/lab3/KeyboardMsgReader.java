/*
 * Basic class, reads from keyboad and returns a string.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author andre_000
 */
public class KeyboardMsgReader implements MsgReader {

    @Override
    public String readln() {
        System.out.println("Please enter some text, then press return:");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
