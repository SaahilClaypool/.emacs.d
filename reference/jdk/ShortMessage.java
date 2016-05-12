_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    protected final int getDataLength(int status) throws InvalidMidiDataException {

    /**
     * Retrieves the number of data bytes associated with a particular
     * status byte value.
     * @param status status byte value, which must represent a short MIDI message
     * @return data length in bytes (0, 1, or 2)
     * @throws InvalidMidiDataException if the
     * <code>status</code> argument does not represent the status byte for any
     * short message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public Object clone() {

    /**
     * Creates a new object of the same class and with the same contents
     * as this object.
     * @return a clone of this instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public int getData2() {

    /**
     * Obtains the second data byte in the message.
     * @return the value of the <code>data2</code> field
     * @see #setMessage(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public int getData1() {

    /**
     * Obtains the first data byte in the message.
     * @return the value of the <code>data1</code> field
     * @see #setMessage(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public int getCommand() {

    /**
     * Obtains the MIDI command associated with this event.  This method
     * assumes that the event is a MIDI channel message; if not, the return
     * value will not be meaningful.
     * @return the MIDI command associated with this event
     * @see #setMessage(int, int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public int getChannel() {

    /**
     * Obtains the MIDI channel associated with this event.  This method
     * assumes that the event is a MIDI channel message; if not, the return
     * value will not be meaningful.
     * @return MIDI channel associated with the message.
     * @see #setMessage(int, int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public void setMessage(int command, int channel, int data1, int data2) throws InvalidMidiDataException {

    /**
     * Sets the short message parameters for a  channel message
     * which takes up to two data bytes.  If the message only
     * takes one data byte, the second data byte is ignored; if
     * the message does not take any data bytes, both data bytes
     * are ignored.
     *
     * @param command   the MIDI command represented by this message
     * @param channel   the channel associated with the message
     * @param data1             the first data byte
     * @param data2             the second data byte
     * @throws          InvalidMidiDataException if the
     * status byte or all data bytes belonging to the message, do
     * not specify a valid MIDI message
     *
     * @see #setMessage(int, int, int)
     * @see #setMessage(int)
     * @see #getCommand
     * @see #getChannel
     * @see #getData1
     * @see #getData2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public void setMessage(int status, int data1, int data2) throws InvalidMidiDataException {

    /**
     * Sets the  parameters for a MIDI message that takes one or two data
     * bytes.  If the message takes only one data byte, the second data
     * byte is ignored; if the message does not take any data bytes, both
     * data bytes are ignored.
     *
     * @param status    the MIDI status byte
     * @param data1             the first data byte
     * @param data2             the second data byte
     * @throws  InvalidMidiDataException if the
     * the status byte, or all data bytes belonging to the message, do
     * not specify a valid MIDI message.
     * @see #setMessage(int, int, int, int)
     * @see #setMessage(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public void setMessage(int status) throws InvalidMidiDataException {

    /**
     * Sets the parameters for a MIDI message that takes no data bytes.
     * @param status    the MIDI status byte
     * @throws  InvalidMidiDataException if <code>status</code> does not
     * specify a valid MIDI status byte for a message that requires no data bytes.
     * @see #setMessage(int, int, int)
     * @see #setMessage(int, int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    // $$fb this should throw an Exception in case of an illegal message!

    /**
     * Constructs a new <code>ShortMessage</code>.
     * @param data an array of bytes containing the complete message.
     * The message data may be changed using the <code>setMessage</code>
     * method.
     * @see #setMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public ShortMessage(int command, int channel, int data1, int data2)

    /**
     * Constructs a new {@code ShortMessage} which represents a channel
     * MIDI message that takes up to two data bytes. If the message only takes
     * one data byte, the second data byte is ignored. If the message does not
     * take any data bytes, both data bytes are ignored.
     * The contents of the message can be changed by using one of
     * the {@code setMessage} methods.
     *
     * @param command  the MIDI command represented by this message
     * @param channel  the channel associated with the message
     * @param data1    the first data byte
     * @param data2    the second data byte
     * @throws InvalidMidiDataException if the command value, channel value
     *     or all data bytes belonging to the message do not specify
     *     a valid MIDI message
     * @see #setMessage(int)
     * @see #setMessage(int, int, int)
     * @see #setMessage(int, int, int, int)
     * @see #getCommand()
     * @see #getChannel()
     * @see #getData1()
     * @see #getData2()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public ShortMessage(int status, int data1, int data2)

    /**
     * Constructs a new {@code ShortMessage} which represents a MIDI message
     * that takes up to two data bytes. If the message only takes one data byte,
     * the second data byte is ignored. If the message does not take
     * any data bytes, both data bytes are ignored.
     * The contents of the message can be changed by using one of
     * the {@code setMessage} methods.
     *
     * @param status   the MIDI status byte
     * @param data1    the first data byte
     * @param data2    the second data byte
     * @throws InvalidMidiDataException if the status byte or all data bytes
     *     belonging to the message do not specify a valid MIDI message
     * @see #setMessage(int)
     * @see #setMessage(int, int, int)
     * @see #setMessage(int, int, int, int)
     * @see #getStatus()
     * @see #getData1()
     * @see #getData2()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public ShortMessage(int status) throws InvalidMidiDataException {

    /**
     * Constructs a new {@code ShortMessage} which represents a MIDI
     * message that takes no data bytes.
     * The contents of the message can be changed by using one of
     * the {@code setMessage} methods.
     *
     * @param status the MIDI status byte
     * @throws InvalidMidiDataException if {@code status} does not specify
     *     a valid MIDI status byte for a message that requires no data bytes
     * @see #setMessage(int)
     * @see #setMessage(int, int, int)
     * @see #setMessage(int, int, int, int)
     * @see #getStatus()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public ShortMessage() {

    /**
     * Constructs a new <code>ShortMessage</code>.  The
     * contents of the new message are guaranteed to specify
     * a valid MIDI message.  Subsequently, you may set the
     * contents of the message using one of the <code>setMessage</code>
     * methods.
     * @see #setMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int PITCH_BEND                                  = 0xE0;  // 224

    /**
     * Command value for Pitch Bend message (0xE0, or 224)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int CHANNEL_PRESSURE                    = 0xD0;  // 208

    /**
     * Command value for Channel Pressure (Aftertouch) message (0xD0, or 208)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int PROGRAM_CHANGE                              = 0xC0;  // 192

    /**
     * Command value for Program Change message (0xC0, or 192)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int CONTROL_CHANGE                              = 0xB0;  // 176

    /**
     * Command value for Control Change message (0xB0, or 176)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int POLY_PRESSURE                               = 0xA0;  // 160

    /**
     * Command value for Polyphonic Key Pressure (Aftertouch) message (0xA0, or 160)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int NOTE_ON                                             = 0x90;  // 144

    /**
     * Command value for Note On message (0x90, or 144)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int NOTE_OFF                                    = 0x80;  // 128

    /**
     * Command value for Note Off message (0x80, or 128)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int SYSTEM_RESET                                = 0xFF; // 255

    /**
     * Status byte for System Reset message (0xFF, or 255).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int ACTIVE_SENSING                              = 0xFE; // 254

    /**
     * Status byte for Active Sensing message (0xFE, or 254).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int STOP                                                = 0xFC; //252

    /**
     * Status byte for Stop message (0xFC, or 252).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int CONTINUE                                    = 0xFB; // 251

    /**
     * Status byte for Continue message (0xFB, or 251).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int START                                               = 0xFA; // 250

    /**
     * Status byte for Start message (0xFA, or 250).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int TIMING_CLOCK                                = 0xF8; // 248

    /**
     * Status byte for Timing Clock message (0xF8, or 248).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int END_OF_EXCLUSIVE                    = 0xF7; // 247

    /**
     * Status byte for End of System Exclusive message (0xF7, or 247).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int TUNE_REQUEST                                = 0xF6; // 246

    /**
     * Status byte for Tune Request message (0xF6, or 246).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int SONG_SELECT                                 = 0xF3; // 243

    /**
     * Status byte for MIDI Song Select message (0xF3, or 243).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int SONG_POSITION_POINTER               = 0xF2; // 242

    /**
     * Status byte for Song Position Pointer message (0xF2, or 242).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
    public static final int MIDI_TIME_CODE                              = 0xF1; // 241

    /**
     * Status byte for MIDI Time Code Quarter Frame message (0xF1, or 241).
     * @see MidiMessage#getStatus
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/ShortMessage.java
public class ShortMessage extends MidiMessage {

/**
 * A <code>ShortMessage</code> contains a MIDI message that has at most
 * two data bytes following its status byte.  The types of MIDI message
 * that satisfy this criterion are channel voice, channel mode, system common,
 * and system real-time--in other words, everything except system exclusive
 * and meta-events.  The <code>ShortMessage</code> class provides methods
 * for getting and setting the contents of the MIDI message.
 * <p>
 * A number of <code>ShortMessage</code> methods have integer parameters by which
 * you specify a MIDI status or data byte.  If you know the numeric value, you
 * can express it directly.  For system common and system real-time messages,
 * you can often use the corresponding fields of <code>ShortMessage</code>, such as
 * {@link #SYSTEM_RESET SYSTEM_RESET}.  For channel messages,
 * the upper four bits of the status byte are specified by a command value and
 * the lower four bits are specified by a MIDI channel number. To
 * convert incoming MIDI data bytes that are in the form of Java's signed bytes,
 * you can use the <A HREF="MidiMessage.html#integersVsBytes">conversion code</A>
 * given in the <code>{@link MidiMessage}</code> class description.
 *
 * @see SysexMessage
 * @see MetaMessage
 *
 * @author David Rivas
 * @author Kara Kytle
 * @author Florian Bomers
 */
