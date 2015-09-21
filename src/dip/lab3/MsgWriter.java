/*
 * Abstraction MsgWriter class,  for use by the MsgService higher class.
 */
package dip.lab3;

/**
 *
 * @author andre_000
 */
public interface MsgWriter {
    public abstract void writeln( String line );
}
