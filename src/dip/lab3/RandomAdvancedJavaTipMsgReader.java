/*
 * Basic class returns a random msg from a string array.
 */
package dip.lab3;

import java.util.Random;

/**
 *
 * @author andre_000
 */
public class RandomAdvancedJavaTipMsgReader implements MsgReader {

    private final String[] randomTip = {
        "Be on time.", "Do all of the work.", "Review what's due in next class before leaving class and create a plan to get it done.",};

    @Override
    public final String readln() {
        Random rand = new Random();
        int RandomNumber = rand.nextInt(randomTip.length - 1 + 1) + 0;
        String randomMsg = randomTip[RandomNumber];
        return "Advanced Java Tip: " + randomMsg;
    }

}
