_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/Transmitter.java
    public void close();

    /**
     * Indicates that the application has finished using the transmitter, and
     * that limited resources it requires may be released or made available.
     *
     * <p>If the creation of this <code>Transmitter</code> resulted in
     * implicitly opening the underlying device, the device is
     * implicitly closed by this method. This is true unless the device is
     * kept open by other <code>Receiver</code> or <code>Transmitter</code>
     * instances that opened the device implicitly, and unless the device
     * has been opened explicitly. If the device this
     * <code>Transmitter</code> is retrieved from is closed explicitly
     * by calling {@link MidiDevice#close MidiDevice.close}, the
     * <code>Transmitter</code> is closed, too.  For a detailed
     * description of open/close behaviour see the class description
     * of {@link javax.sound.midi.MidiDevice MidiDevice}.
     *
     * @see javax.sound.midi.MidiSystem#getTransmitter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/Transmitter.java
    public Receiver getReceiver();

    /**
     * Obtains the current receiver to which this transmitter will deliver MIDI messages.
     * @return the current receiver.  If no receiver is currently set,
     * returns <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/Transmitter.java
    public void setReceiver(Receiver receiver);

    /**
     * Sets the receiver to which this transmitter will deliver MIDI messages.
     * If a receiver is currently set, it is replaced with this one.
     * @param receiver the desired receiver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/Transmitter.java
public interface Transmitter extends AutoCloseable {

/**
 * A <code>Transmitter</code> sends <code>{@link MidiEvent}</code> objects to one or more
 * <code>{@link Receiver Receivers}</code>. Common MIDI transmitters include sequencers
 * and MIDI input ports.
 *
 * @see Receiver
 *
 * @author Kara Kytle
 */
