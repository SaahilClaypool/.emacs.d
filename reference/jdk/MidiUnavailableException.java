_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiUnavailableException.java
    public MidiUnavailableException(String message) {

    /**
     *  Constructs a <code>MidiUnavailableException</code> with the
     * specified detail message.
     *
     * @param message the string to display as an error detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiUnavailableException.java
    public MidiUnavailableException() {

    /**
     * Constructs a <code>MidiUnavailableException</code> that has
     * <code>null</code> as its error detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiUnavailableException.java
public class MidiUnavailableException extends Exception {

/**
 * A <code>MidiUnavailableException</code> is thrown when a requested MIDI
 * component cannot be opened or created because it is unavailable.  This often
 * occurs when a device is in use by another application.  More generally, it
 * can occur when there is a finite number of a certain kind of resource that can
 * be used for some purpose, and all of them are already in use (perhaps all by
 * this application).  For an example of the latter case, see the
 * {@link Transmitter#setReceiver(Receiver) setReceiver} method of
 * <code>Transmitter</code>.
 *
 * @author Kara Kytle
 */
