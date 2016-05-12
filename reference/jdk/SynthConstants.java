_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthConstants.java
    public static final int DEFAULT = 1 << 10;

    /**
     * Indicates the region is the default. This is typically used for buttons
     * to indicate this button is somehow special.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthConstants.java
    public static final int FOCUSED = 1 << 8;

    /**
     * Indicates the region has focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthConstants.java
    public static final int DISABLED = 1 << 3;

    /**
     * Primary state indicating the region is not enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthConstants.java
    public static final int MOUSE_OVER = 1 << 1;

    /**
     * Primary state indicating the mouse is over the region.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthConstants.java
public interface SynthConstants {

/**
 * Constants used by Synth. Not all Components support all states. A
 * Component will at least be in one of the primary states. That is, the
 * return value from <code>SynthContext.getComponentState()</code> will at
 * least be one of <code>ENABLED</code>, <code>MOUSE_OVER</code>,
 * <code>PRESSED</code> or <code>DISABLED</code>, and may also contain
 * <code>FOCUSED</code>, <code>SELECTED</code> or <code>DEFAULT</code>.
 *
 * @since 1.5
 */
