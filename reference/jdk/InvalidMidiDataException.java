_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/InvalidMidiDataException.java
    public InvalidMidiDataException(String message) {

    /**
     *  Constructs an <code>InvalidMidiDataException</code> with the
     * specified detail message.
     *
     * @param message the string to display as an error detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/InvalidMidiDataException.java
    public InvalidMidiDataException() {

    /**
     * Constructs an <code>InvalidMidiDataException</code> with
     * <code>null</code> for its error detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/InvalidMidiDataException.java
public class InvalidMidiDataException extends Exception {

/**
 * An <code>InvalidMidiDataException</code> indicates that inappropriate MIDI
 * data was encountered. This often means that the data is invalid in and of
 * itself, from the perspective of the MIDI specification.  An example would
 * be an undefined status byte.  However, the exception might simply
 * mean that the data was invalid in the context it was used, or that
 * the object to which the data was given was unable to parse or use it.
 * For example, a file reader might not be able to parse a Type 2 MIDI file, even
 * though that format is defined in the MIDI specification.
 *
 * @author Kara Kytle
 */
