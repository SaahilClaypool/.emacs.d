_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        //public static final Type INACTIVE     = new Type("INACTIVE");

        /**
         * A type of event that is sent when a line ceases active input or output
         * of audio data.
         * @see #START
         * @see DataLine#stop
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        //public static final Type ACTIVE       = new Type("ACTIVE");

        /**
         * A type of event that is sent when a line begins to engage in active
         * input or output of audio data.  Examples of when this happens are
         * when a source line begins or resumes writing data to its mixer, and
         * when a target line begins or resumes reading data from its mixer.
         * @see #STOP
         * @see SourceDataLine#write
         * @see TargetDataLine#read
         * @see DataLine#start
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        /*

        /**
         * A type of event that is sent when a line ceases to engage in active
         * input or output of audio data because the end of media has been reached.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        public static final Type STOP   = new Type("Stop");

        /**
         * A type of event that is sent when a line ceases active input or output
         * of audio data in response to a {@link DataLine#stop stop} request,
         * or because the end of media has been reached.
         * @see #START
         * @see DataLine#stop
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        public static final Type START  = new Type("Start");

        /**
         * A type of event that is sent when a line begins to engage in active
         * input or output of audio data in response to a
         * {@link DataLine#start start} request.
         * @see #STOP
         * @see DataLine#start
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        public static final Type CLOSE  = new Type("Close");

        /**
         * A type of event that is sent when a line closes, freeing the system
         * resources it had obtained when it was opened.
         * @see #OPEN
         * @see Line#close
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        public static final Type OPEN   = new Type("Open");

        /**
         * A type of event that is sent when a line opens, reserving system
         * resources for itself.
         * @see #CLOSE
         * @see Line#open
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        public String toString() {

        /**
         * Returns the type name as the string representation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        public final int hashCode() {

        /**
         * Finalizes the hashcode method.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        public final boolean equals(Object obj) {

        /**
         * Indicates whether the specified object is equal to this event type,
         * returning <code>true</code> if the objects are identical.
         * @param obj the reference object with which to compare
         * @return <code>true</code> if this event type is the same as
         * <code>obj</code>; <code>false</code> otherwise
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        protected Type(String name) {

        /**
         * Constructs a new event type.
         * @param name name of the type
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
        // $$kk: 03.25.99: why can't this be final??

        /**
         * Type name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    public static class Type {

    /**
     * The LineEvent.Type inner class identifies what kind of event occurred on a line.
     * Static instances are provided for the common types (OPEN, CLOSE, START, and STOP).
     *
     * @see LineEvent#getType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    public String toString() {

    /**
     * Obtains a string representation of the event.  The contents of the string may vary
     * between implementations of Java Sound.
     * @return a string describing the event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    /*

    /**
     * Obtains the position in the line's audio data when the event occurred, expressed in sample frames.
     * For example, if a source line had already played back 14 sample frames at the time it was
     * paused, the pause event would report the line's position as 14.  The next frame to be processed
     * would be frame number 14 using zero-based numbering, or 15 using one-based numbering.
     * <p>
     * Note that this field is relevant only to certain events generated by
     * data lines, such as <code>START</code> and <code>STOP</code>.  For
     * events generated by lines that do not count sample frames, and for any
     * other events for which this value is not known, the position value
     * should be {@link AudioSystem#NOT_SPECIFIED}.
     *
     * @return the line's position as a sample frame number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    public final Type getType() {

    /**
     * Obtains the event's type.
     * @return this event's type ({@link Type#OPEN}, {@link Type#CLOSE},
     * {@link Type#START}, or {@link Type#STOP})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    public final Line getLine() {

    /**
     * Obtains the audio line that is the source of this event.
     * @return the line responsible for this event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    public LineEvent(Line line, Type type, long position) {

    /**
     * Constructs a new event of the specified type, originating from the specified line.
     * @param line the source of this event
     * @param type the event type (<code>OPEN</code>, <code>CLOSE</code>, <code>START</code>, or <code>STOP</code>)
     * @param position the number of sample frames that the line had already processed when the event occurred,
     * or {@link AudioSystem#NOT_SPECIFIED}
     *
     * @throws IllegalArgumentException if <code>line</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    private final long position;

    /**
     * The media position when the event occurred, expressed in sample frames.
     * Note that this field is only relevant to certain events generated by
     * data lines, such as <code>START</code> and <code>STOP</code>.  For
     * events generated by lines that do not count sample frames, and for any
     * other events for which this value is not known, the position value
     * should be {@link AudioSystem#NOT_SPECIFIED}.
     * @serial
     * @see #getFramePosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
    private final Type type;

    /**
     * The kind of line event (<code>OPEN</code>, <code>CLOSE</code>,
     * <code>START</code>, or <code>STOP</code>).
     * @see #getType
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/LineEvent.java
public class LineEvent extends java.util.EventObject {

/**
 * The <code>LineEvent</code> class encapsulates information that a line
 * sends its listeners whenever the line opens, closes, starts, or stops.
 * Each of these four state changes is represented by a corresponding
 * type of event.  A listener receives the event as a parameter to its
 * {@link LineListener#update update} method.  By querying the event,
 * the listener can learn the type of event, the line responsible for
 * the event, and how much data the line had processed when the event occurred.
 *
 * <p>Although this class implements Serializable, attempts to
 * serialize a <code>LineEvent</code> object will fail.
 *
 * @author Kara Kytle
 *
 * @see Line
 * @see LineListener#update
 * @since 1.3
 *
 * @serial exclude
 */
