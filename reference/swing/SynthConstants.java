_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
    public static final int DEFAULT = 1 << 10;

    /**
     * Indicates the region is the default. This is typically used for buttons
     * to indicate this button is somehow special.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
    public static final int SELECTED = 1 << 9;

    /**
     * Indicates the region is selected.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
    public static final int FOCUSED = 1 << 8;

    /**
     * Indicates the region has focus.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
    public static final int DISABLED = 1 << 3;

    /**
     * Primary state indicating the region is not enabled.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
    public static final int PRESSED = 1 << 2;

    /**
     * Primary state indicating the region is in a pressed state. Pressed
     * does not necessarily mean the user has pressed the mouse button.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
    public static final int MOUSE_OVER = 1 << 1;

    /**
     * Primary state indicating the mouse is over the region.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
    public static final int ENABLED = 1 << 0;

    /**
     * Primary state indicating the component is enabled.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthConstants.java
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
