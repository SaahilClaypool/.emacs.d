_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
class MultiUIDefaults extends UIDefaults {

/**
 * We want the Multiplexing LookAndFeel to be quiet and fallback
 * gracefully if it cannot find a UI.  This class overrides the
 * getUIError method of UIDefaults, which is the method that
 * emits error messages when it cannot find a UI class in the
 * LAF.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
    public static ComponentUI createUIs(ComponentUI mui,
                                        Vector      uis,
                                        JComponent  target) {

    /**
     * Creates the <code>ComponentUI</code> objects
     * required to present
     * the <code>target</code> component,
     * placing the objects in the <code>uis</code> vector and
     * returning the
     * <code>ComponentUI</code> object
     * that best represents the component's UI.
     * This method finds the <code>ComponentUI</code> objects
     * by invoking
     * <code>getDefaults().getUI(target)</code> on each
     * default and auxiliary look and feel currently in use.
     * The first UI object this method adds
     * to the <code>uis</code> vector
     * is for the default look and feel.
     * <p>
     * This method is invoked by the <code>createUI</code> method
     * of <code>MultiXxxxUI</code> classes.
     *
     * @param mui the <code>ComponentUI</code> object
     *            that represents the complete UI
     *            for the <code>target</code> component;
     *            this should be an instance
     *            of one of the <code>MultiXxxxUI</code> classes
     * @param uis a <code>Vector</code>;
     *            generally this is the <code>uis</code> field
     *            of the <code>mui</code> argument
     * @param target a component whose UI is represented by <code>mui</code>
     *
     * @return <code>mui</code> if the component has any auxiliary UI objects;
     *         otherwise, returns the UI object for the default look and feel
     *         or <code>null</code> if the default UI object couldn't be found
     *
     * @see javax.swing.UIManager#getAuxiliaryLookAndFeels
     * @see javax.swing.UIDefaults#getUI
     * @see MultiButtonUI#uis
     * @see MultiButtonUI#createUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
// Utility methods for the UI's

///////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
    public boolean isSupportedLookAndFeel() {

    /**
     * Returns <code>true</code>;
     * every platform permits this look and feel.
     *
     * @return <code>true</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
    public boolean isNativeLookAndFeel() {

    /**
     * Returns <code>false</code>;
     * this look and feel is not native to any platform.
     *
     * @return <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
    public String getDescription() {

    /**
     * Returns a one-line description of this look and feel.
     *
     * @return a descriptive string such as "Allows multiple UI instances per component instance"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
    public String getID() {

    /**
     * Returns a string, suitable for use by applications/services,
     * that identifies this look and feel.
     *
     * @return "Multiplex"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
    public String getName() {

    /**
     * Returns a string, suitable for use in menus,
     * that identifies this look and feel.
     *
     * @return a string such as "Multiplexing Look and Feel"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
// LookAndFeel methods

//////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/multi/MultiLookAndFeel.java
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
