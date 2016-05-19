_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
class MultiUIDefaults extends UIDefaults {

/**
 * We want the Multiplexing LookAndFeel to be quiet and fallback
 * gracefully if it cannot find a UI.  This class overrides the
 * getUIError method of UIDefaults, which is the method that
 * emits error messages when it cannot find a UI class in the
 * LAF.
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    protected static ComponentUI[] uisToArray(Vector uis) {

    /**
     * Creates an array,
     * populates it with UI objects from the passed-in vector,
     * and returns the array.
     * If <code>uis</code> is null,
     * this method returns an array with zero elements.
     * If <code>uis</code> is an empty vector,
     * this method returns <code>null</code>.
     * A run-time error occurs if any objects in the <code>uis</code> vector
     * are not of type <code>ComponentUI</code>.
     *
     * @param uis a vector containing <code>ComponentUI</code> objects
     * @return an array equivalent to the passed-in vector
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    /**

///////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
// Utility methods for the UI's

///////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    public UIDefaults getDefaults() {

    /**
     * Creates, initializes, and returns
     * the look and feel specific defaults.
     * For this look and feel,
     * the defaults consist solely of
     * mappings of UI class IDs
     * (such as "ButtonUI")
     * to <code>ComponentUI</code> class names
     * (such as "javax.swing.plaf.multi.MultiButtonUI").
     *
     * @return an initialized <code>UIDefaults</code> object
     * @see javax.swing.JComponent#getUIClassID
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    public boolean isSupportedLookAndFeel() {

    /**
     * Returns <code>true</code>;
     * every platform permits this look and feel.
     *
     * @return <code>true</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    public boolean isNativeLookAndFeel() {

    /**
     * Returns <code>false</code>;
     * this look and feel is not native to any platform.
     *
     * @return <code>false</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    public String getDescription() {

    /**
     * Returns a one-line description of this look and feel.
     *
     * @return a descriptive string such as "Allows multiple UI instances per component instance"
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    public String getID() {

    /**
     * Returns a string, suitable for use by applications/services,
     * that identifies this look and feel.
     *
     * @return "Multiplex"
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
    /**

//////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
// LookAndFeel methods

//////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiLookAndFeel.java
public class MultiLookAndFeel extends LookAndFeel {

/**
 * <p>A multiplexing look and feel that allows more than one UI
 * to be associated with a component at the same time.
 * The primary look and feel is called
 * the <em>default</em> look and feel,
 * and the other look and feels are called <em>auxiliary</em>.
 * <p>
 *
 * For further information, see
 * <a href="doc-files/multi_tsc.html" target="_top">Using the
 * Multiplexing Look and Feel.</a>
 *
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @see UIManager#addAuxiliaryLookAndFeel
 * @see javax.swing.plaf.multi
 *
 * @author Willie Walker
 */
