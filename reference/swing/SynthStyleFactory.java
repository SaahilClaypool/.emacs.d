_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthStyleFactory.java
    public abstract SynthStyle getStyle(JComponent c, Region id);

    /**
     * Returns the style for the specified Component.
     *
     * @param c Component asking for
     * @param id Region identifier
     * @return SynthStyle for region.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthStyleFactory.java
    public SynthStyleFactory() {

    /**
     * Creates a <code>SynthStyleFactory</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthStyleFactory.java
public abstract class SynthStyleFactory {

/**
 * Factory used for obtaining <code>SynthStyle</code>s.  Each of the
 * Synth <code>ComponentUI</code>s will call into the current
 * <code>SynthStyleFactory</code> to obtain a <code>SynthStyle</code>
 * for each of the distinct regions they have.
 * <p>
 * The following example creates a custom <code>SynthStyleFactory</code>
 * that returns a different style based on the <code>Region</code>:
 * <pre>
 * class MyStyleFactory extends SynthStyleFactory {
 *     public SynthStyle getStyle(JComponent c, Region id) {
 *         if (id == Region.BUTTON) {
 *             return buttonStyle;
 *         }
 *         else if (id == Region.TREE) {
 *             return treeStyle;
 *         }
 *         return defaultStyle;
 *     }
 * }
 * SynthLookAndFeel laf = new SynthLookAndFeel();
 * UIManager.setLookAndFeel(laf);
 * SynthLookAndFeel.setStyleFactory(new MyStyleFactory());
 * </pre>
 *
 * @see SynthStyleFactory
 * @see SynthStyle
 *
 * @since 1.5
 * @author Scott Violet
 */
