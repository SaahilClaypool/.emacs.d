_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiEvent.java
    public long getTick() {

    /**
     * Obtains the time-stamp for the event, in MIDI ticks
     * @return the time-stamp for the event, in MIDI ticks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiEvent.java
    public void setTick(long tick) {

    /**
     * Sets the time-stamp for the event, in MIDI ticks
     * @param tick the new time-stamp, in MIDI ticks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiEvent.java
    public MidiMessage getMessage() {

    /**
     * Obtains the MIDI message contained in the event.
     * @return the MIDI message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiEvent.java
    public MidiEvent(MidiMessage message, long tick) {

    /**
     * Constructs a new <code>MidiEvent</code>.
     * @param message the MIDI message contained in the event
     * @param tick the time-stamp for the event, in MIDI ticks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiEvent.java
    private long tick;

    /**
     * The tick value for this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiEvent.java
    private final MidiMessage message;

    /**
     * The MIDI message for this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiEvent.java
public class MidiEvent {

/**
 * MIDI events contain a MIDI message and a corresponding time-stamp
 * expressed in ticks, and can represent the MIDI event information
 * stored in a MIDI file or a <code>{@link Sequence}</code> object.  The
 * duration of a tick is specified by the timing information contained
 * in the MIDI file or <code>Sequence</code> object.
 * <p>
 * In Java Sound, <code>MidiEvent</code> objects are typically contained in a
 * <code>{@link Track}</code>, and <code>Tracks</code> are likewise
 * contained in a <code>Sequence</code>.
 *
 *
 * @author David Rivas
 * @author Kara Kytle
 */
