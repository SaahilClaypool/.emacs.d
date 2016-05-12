_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    public void update(Graphics g, JComponent c) {

    /**
     * If necessary paints the background of the component, then invokes
     * <code>paint</code>.
     *
     * @param g Graphics to paint to
     * @param c JComponent painting on
     * @throws NullPointerException if <code>g</code> or <code>c</code> is
     *         null
     * @see javax.swing.plaf.ComponentUI#update
     * @see javax.swing.plaf.ComponentUI#paint
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    protected PropertyChangeListener createRolloverListener() {

    /**
     * Creates a property change listener that will be added to the JToolBar.
     * If this method returns null then it will not be added to the
     * toolbar.
     *
     * @return an instance of a <code>PropertyChangeListener</code> or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    protected ContainerListener createContainerListener() {

    /**
     * Creates a container listener that will be added to the JToolBar.
     * If this method returns null then it will not be added to the
     * toolbar.
     *
     * @return an instance of a <code>ContainerListener</code> or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    private Border createNonRolloverToggleBorder() {

    /**
     * Creates a non rollover border for Toggle buttons in the toolbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    static boolean doesMenuBarBorderToolBar(JMenuBar c) {

    /**
     * Returns true if the passed in JMenuBar is above a horizontal
     * JToolBar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    synchronized static Object findRegisteredComponentOfType(JComponent from,
                                                             Class target) {

    /**
     * Finds a previously registered component of class <code>target</code>
     * that shares the JRootPane ancestor of <code>from</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    synchronized static void unregister(JComponent c) {

    /**
     * Unregisters the specified component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    synchronized static void register(JComponent c) {

    /**
     * Registers the specified component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    private JMenuBar lastMenuBar;

    /**
     * Last menubar the toolbar touched.  This is only useful for ocean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    protected PropertyChangeListener rolloverListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead.
     *
     * @see #createRolloverListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    protected ContainerListener contListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead.
     *
     * @see #createContainerListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
    private static List<WeakReference<JComponent>> components = new ArrayList<WeakReference<JComponent>>();

    /**
     * An array of WeakReferences that point to JComponents. This will contain
     * instances of JToolBars and JMenuBars and is used to find
     * JToolBars/JMenuBars that border each other.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalToolBarUI.java
public class MetalToolBarUI extends BasicToolBarUI

/**
 * A Metal Look and Feel implementation of ToolBarUI.  This implementation
 * is a "combined" view/controller.
 * <p>
 *
 * @author Jeff Shapiro
 */
