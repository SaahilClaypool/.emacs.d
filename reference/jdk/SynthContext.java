_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    SynthPainter getPainter() {

    /**
     * Convenience method to get the Painter from the current SynthStyle.
     * This will NEVER return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    void reset(JComponent component, Region region, SynthStyle style,
               int state) {

    /**
     * Resets the state of the Context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    public int getComponentState() {

    /**
     * Returns the state of the widget, which is a bitmask of the
     * values defined in <code>SynthConstants</code>. A region will at least
     * be in one of
     * <code>ENABLED</code>, <code>MOUSE_OVER</code>, <code>PRESSED</code>
     * or <code>DISABLED</code>.
     *
     * @see SynthConstants
     * @return State of Component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    public SynthStyle getStyle() {

    /**
     * Returns the style associated with this Region.
     *
     * @return SynthStyle associated with the region.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    boolean isSubregion() {

    /**
     * A convenience method for <code>getRegion().isSubregion()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    public Region getRegion() {

    /**
     * Returns the Region identifying this state.
     *
     * @return Region of the hosting component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    public JComponent getComponent() {

    /**
     * Returns the hosting component containing the region.
     *
     * @return Hosting Component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
    public SynthContext(JComponent component, Region region, SynthStyle style,
                        int state) {

    /**
     * Creates a SynthContext with the specified values. This is meant
     * for subclasses and custom UI implementors. You very rarely need to
     * construct a SynthContext, though some methods will take one.
     *
     * @param component JComponent
     * @param region Identifies the portion of the JComponent
     * @param style Style associated with the component
     * @param state State of the component as defined in SynthConstants.
     * @throws NullPointerException if component, region of style is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthContext.java
public class SynthContext {

/**
 * An immutable transient object containing contextual information about
 * a <code>Region</code>. A <code>SynthContext</code> should only be
 * considered valid for the duration
 * of the method it is passed to. In other words you should not cache
 * a <code>SynthContext</code> that is passed to you and expect it to
 * remain valid.
 *
 * @since 1.5
 * @author Scott Violet
 */
