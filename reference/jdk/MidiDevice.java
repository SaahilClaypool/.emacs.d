_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        public final String toString() {

        /**
         * Provides a string representation of the device information.

         * @return a description of the info object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        public final String getVersion() {

        /**
         * Obtains the version of the device.
         * @return textual version information for the device.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        public final String getDescription() {

        /**
         * Obtains the description of the device.
         * @return a description of the device
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        public final String getVendor() {

        /**
         * Obtains the name of the company who supplies the device.
         * @return device the vendor's name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        public final String getName() {

        /**
         * Obtains the name of the device.
         *
         * @return a string containing the device's name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        public final int hashCode() {

        /**
         * Finalizes the hashcode method.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        public final boolean equals(Object obj) {

        /**
         * Reports whether two objects are equal.
         * Returns <code>true</code> if the objects are identical.
         * @param obj the reference object with which to compare this
         * object
         * @return <code>true</code> if this object is the same as the
         * <code>obj</code> argument; <code>false</code> otherwise
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        protected Info(String name, String vendor, String description, String version) {

        /**
         * Constructs a device info object.
         *
         * @param name the name of the device
         * @param vendor the name of the company who provides the device
         * @param description a description of the device
         * @param version version information for the device
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        private String version;

        /**
         * Device version.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        private String description;

        /**
         * A description of the device.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        private String vendor;

        /**
         * The name of the company who provides the device.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
        private String name;

        /**
         * The device's name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public static class Info {

    /**
     * A <code>MidiDevice.Info</code> object contains assorted
     * data about a <code>{@link MidiDevice}</code>, including its
     * name, the company who created it, and descriptive text.
     *
     * @see MidiDevice#getDeviceInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    List<Transmitter> getTransmitters();

    /**
     * Returns all currently active, non-closed transmitters
     * connected with this MidiDevice.
     * A transmitter can be removed
     * from the device by closing it.
     *
     * <p>Usually the returned transmitters implement
     * the {@code MidiDeviceTransmitter} interface.
     *
     * @return an unmodifiable list of the open transmitters
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public Transmitter getTransmitter() throws MidiUnavailableException;

    /**
     * Obtains a MIDI OUT connection from which the MIDI device will transmit
     * MIDI data  The returned transmitter must be closed when the application
     * has finished using it.
     *
     * <p>Usually the returned transmitter implements
     * the {@code MidiDeviceTransmitter} interface.
     *
     * <p>Obtaining a <code>Transmitter</code> with this method does not
     * open the device. To be able to use the device, it has to be
     * opened explicitly by calling {@link #open}. Also, closing the
     * <code>Transmitter</code> does not close the device. It has to be
     * closed explicitly by calling {@link #close}.
     *
     * @return a MIDI OUT transmitter for the device.
     * @throws MidiUnavailableException thrown if a transmitter is not available
     * due to resource restrictions
     * @see Transmitter#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    List<Receiver> getReceivers();

    /**
     * Returns all currently active, non-closed receivers
     * connected with this MidiDevice.
     * A receiver can be removed
     * from the device by closing it.
     *
     * <p>Usually the returned receivers implement
     * the {@code MidiDeviceReceiver} interface.
     *
     * @return an unmodifiable list of the open receivers
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public Receiver getReceiver() throws MidiUnavailableException;

    /**
     * Obtains a MIDI IN receiver through which the MIDI device may receive
     * MIDI data.  The returned receiver must be closed when the application
     * has finished using it.
     *
     * <p>Usually the returned receiver implements
     * the {@code MidiDeviceReceiver} interface.
     *
     * <p>Obtaining a <code>Receiver</code> with this method does not
     * open the device. To be able to use the device, it has to be
     * opened explicitly by calling {@link #open}. Also, closing the
     * <code>Receiver</code> does not close the device. It has to be
     * closed explicitly by calling {@link #close}.
     *
     * @return a receiver for the device.
     * @throws MidiUnavailableException thrown if a receiver is not available
     * due to resource restrictions
     * @see Receiver#close()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public int getMaxTransmitters();

    /**
     * Obtains the maximum number of MIDI OUT connections available on this
     * MIDI device for transmitting MIDI data.
     * @return maximum number of MIDI OUT connections,
     * or -1 if an unlimited number of connections is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public int getMaxReceivers();

    /**
     * Obtains the maximum number of MIDI IN connections available on this
     * MIDI device for receiving MIDI data.
     * @return maximum number of MIDI IN connections,
     * or -1 if an unlimited number of connections is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public long getMicrosecondPosition();

    /**
     * Obtains the current time-stamp of the device, in microseconds.
     * If a device supports time-stamps, it should start counting at
     * 0 when the device is opened and continue incrementing its
     * time-stamp in microseconds until the device is closed.
     * If it does not support time-stamps, it should always return
     * -1.
     * @return the current time-stamp of the device in microseconds,
     * or -1 if time-stamping is not supported by the device.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public boolean isOpen();

    /**
     * Reports whether the device is open.
     *
     * @return <code>true</code> if the device is open, otherwise
     * <code>false</code>
     * @see #open
     * @see #close
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public void close();

    /**
     * Closes the device, indicating that the device should now release
     * any system resources it is using.
     *
     * <p>All <code>Receiver</code> and <code>Transmitter</code> instances
     * open from this device are closed. This includes instances retrieved
     * via <code>MidiSystem</code>.
     *
     * @see #open
     * @see #isOpen
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public void open() throws MidiUnavailableException;

    /**
     * Opens the device, indicating that it should now acquire any
     * system resources it requires and become operational.
     *
     * <p>An application opening a device explicitly with this call
     * has to close the device by calling {@link #close}. This is
     * necessary to release system resources and allow applications to
     * exit cleanly.
     *
     * <p>
     * Note that some devices, once closed, cannot be reopened.  Attempts
     * to reopen such a device will always result in a MidiUnavailableException.
     *
     * @throws MidiUnavailableException thrown if the device cannot be
     * opened due to resource restrictions.
     * @throws SecurityException thrown if the device cannot be
     * opened due to security restrictions.
     *
     * @see #close
     * @see #isOpen
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
    public Info getDeviceInfo();

    /**
     * Obtains information about the device, including its Java class and
     * <code>Strings</code> containing its name, vendor, and description.
     *
     * @return device info
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/MidiDevice.java
public interface MidiDevice extends AutoCloseable {

 /**
 * <code>MidiDevice</code> is the base interface for all MIDI devices.
 * Common devices include synthesizers, sequencers, MIDI input ports, and MIDI
 * output ports.
 *
 * <p>A <code>MidiDevice</code> can be a transmitter or a receiver of
 * MIDI events, or both. Therefore, it can provide {@link Transmitter}
 * or {@link Receiver} instances (or both). Typically, MIDI IN ports
 * provide transmitters, MIDI OUT ports and synthesizers provide
 * receivers. A Sequencer typically provides transmitters for playback
 * and receivers for recording.
 *
 * <p>A <code>MidiDevice</code> can be opened and closed explicitly as
 * well as implicitly. Explicit opening is accomplished by calling
 * {@link #open}, explicit closing is done by calling {@link
 * #close} on the <code>MidiDevice</code> instance.
 * If an application opens a <code>MidiDevice</code>
 * explicitly, it has to close it explicitly to free system resources
 * and enable the application to exit cleanly. Implicit opening is
 * done by calling {@link javax.sound.midi.MidiSystem#getReceiver
 * MidiSystem.getReceiver} and {@link
 * javax.sound.midi.MidiSystem#getTransmitter
 * MidiSystem.getTransmitter}. The <code>MidiDevice</code> used by
 * <code>MidiSystem.getReceiver</code> and
 * <code>MidiSystem.getTransmitter</code> is implementation-dependant
 * unless the properties <code>javax.sound.midi.Receiver</code>
 * and <code>javax.sound.midi.Transmitter</code> are used (see the
 * description of properties to select default providers in
 * {@link javax.sound.midi.MidiSystem}). A <code>MidiDevice</code>
 * that was opened implicitly, is closed implicitly by closing the
 * <code>Receiver</code> or <code>Transmitter</code> that resulted in
 * opening it. If more than one implicitly opening
 * <code>Receiver</code> or <code>Transmitter</code> were obtained by
 * the application, the device is closed after the last
 * <code>Receiver</code> or <code>Transmitter</code> has been
 * closed. On the other hand, calling <code>getReceiver</code> or
 * <code>getTransmitter</code> on the device instance directly does
 * not open the device implicitly. Closing these
 * <code>Transmitter</code>s and <code>Receiver</code>s does not close
 * the device implicitly. To use a device with <code>Receiver</code>s
 * or <code>Transmitter</code>s obtained this way, the device has to
 * be opened and closed explicitly.
 *
 * <p>If implicit and explicit opening and closing are mixed on the
 * same <code>MidiDevice</code> instance, the following rules apply:
 *
 * <ul>
 * <li>After an explicit open (either before or after implicit
 * opens), the device will not be closed by implicit closing. The only
 * way to close an explicitly opened device is an explicit close.</li>
 *
 * <li>An explicit close always closes the device, even if it also has
 * been opened implicitly. A subsequent implicit close has no further
 * effect.</li>
 * </ul>
 *
 * To detect if a MidiDevice represents a hardware MIDI port, the
 * following programming technique can be used:
 *
 * <pre>{@code
 * MidiDevice device = ...;
 * if ( ! (device instanceof Sequencer) && ! (device instanceof Synthesizer)) {
 *   // we're now sure that device represents a MIDI port
 *   // ...
 * }
 * }</pre>
 *
 * <p>
 * A <code>MidiDevice</code> includes a <code>{@link MidiDevice.Info}</code> object
 * to provide manufacturer information and so on.
 *
 * @see Synthesizer
 * @see Sequencer
 * @see Receiver
 * @see Transmitter
 *
 * @author Kara Kytle
 * @author Florian Bomers
 */
