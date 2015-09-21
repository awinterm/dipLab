/*
 * This is my high level class, it uses abstraction to access lower level worker classes.
 */
package dip.lab3;

/**
 *
 * @author andre_000
 */
public class MsgService {

    private final MsgReader reader;
    private final MsgWriter writer;

    public MsgService(MsgReader reader, MsgWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public final void sendMsg() {
        String line = reader.readln();
        writer.writeln(line);
    }
}
