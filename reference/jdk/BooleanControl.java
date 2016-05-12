_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
        protected Type(String name) {

        /**
         * Constructs a new boolean control type.
         * @param name  the name of the new boolean control type
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
        public static final Type APPLY_REVERB           = new Type("Apply Reverb");

        /**
         * Represents a control for whether reverberation is applied
         * to a line.  Note that the status of this control not affect
         * the reverberation settings for a line, but does affect whether
         * these settings are used.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
        public static final Type MUTE                           = new Type("Mute");

        /**
         * Represents a control for the mute status of a line.
         * Note that mute status does not affect gain.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    public static class Type extends Control.Type {

    /**
     * An instance of the <code>BooleanControl.Type</code> class identifies one kind of
     * boolean control.  Static instances are provided for the
     * common types.
     *
     * @author Kara Kytle
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    public String toString() {

    /**
     * Provides a string representation of the control
     * @return a string description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    public String getStateLabel(boolean state) {

    /**
     * Obtains the label for the specified state.
     * @param state the state whose label will be returned
     * @return the label for the specified state, such as "true" or "on"
     * for <code>true</code>, or "false" or "off" for <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    public boolean getValue() {

    /**
     * Obtains this control's current value.
     * @return current value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    public void setValue(boolean value) {

    /**
     * Sets the current value for the control.  The default
     * implementation simply sets the value as indicated.
     * Some controls require that their line be open before they can be affected
     * by setting a value.
     * @param value desired new value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    protected BooleanControl(Type type, boolean initialValue) {

    /**
     * Constructs a new boolean control object with the given parameters.
     * The labels for the <code>true</code> and <code>false</code> states
     * default to "true" and "false."
     *
     * @param type the type of control represented by this float control object
     * @param initialValue the initial control value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    protected BooleanControl(Type type, boolean initialValue, String trueStateLabel, String falseStateLabel) {

    /**
     * Constructs a new boolean control object with the given parameters.
     *
     * @param type the type of control represented this float control object
     * @param initialValue the initial control value
     * @param trueStateLabel the label for the state represented by <code>true</code>,
     * such as "true" or "on."
     * @param falseStateLabel the label for the state represented by <code>false</code>,
     * such as "false" or "off."
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    private boolean value;

    /**
     * The current value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    private final String falseStateLabel;

    /**
     * The <code>false</code> state label, such as "false" or "off."
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
    private final String trueStateLabel;

    /**
     * The <code>true</code> state label, such as "true" or "on."
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/BooleanControl.java
public abstract class BooleanControl extends Control {

/**
 * A <code>BooleanControl</code> provides the ability to switch between
 * two possible settings that affect a line's audio.  The settings are boolean
 * values (<code>true</code> and <code>false</code>).  A graphical user interface
 * might represent the control by a two-state button, an on/off switch, two
 * mutually exclusive buttons, or a checkbox (among other possibilities).
 * For example, depressing a button might activate a
 * <code>{@link BooleanControl.Type#MUTE MUTE}</code> control to silence
 * the line's audio.
 * <p>
 * As with other <code>{@link Control}</code> subclasses, a method is
 * provided that returns string labels for the values, suitable for
 * display in the user interface.
 *
 * @author Kara Kytle
 * @since 1.3
 */
