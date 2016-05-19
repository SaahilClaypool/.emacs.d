_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    private boolean isInternalFrameSystemMenu() {

    /**
     * This is to see if the menu item in question is part of the
     * system menu on an internal frame.
     * The Strings that are being checked can be found in
     * MetalInternalFrameTitlePaneUI.java,
     * WindowsInternalFrameTitlePaneUI.java, and
     * MotifInternalFrameTitlePaneUI.java.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected void doClick(MenuSelectionManager msm) {

    /**
     * Call this method when a menu item is to be activated.
     * This method handles some of the details of menu item activation
     * such as clearing the selected path and messaging the
     * JMenuItem's doClick() method.
     *
     * @param msm  A MenuSelectionManager. The visual feedback and
     *             internal bookkeeping tasks are delegated to
     *             this MenuSelectionManager. If <code>null</code> is
     *             passed as this argument, the
     *             <code>MenuSelectionManager.defaultManager</code> is
     *             used.
     * @see MenuSelectionManager
     * @see JMenuItem#doClick(int)
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected void paintText(Graphics g, JMenuItem menuItem, Rectangle textRect, String text) {

    /**
     * Renders the text of the current menu item.
     * <p>
     * @param g graphics context
     * @param menuItem menu item to render
     * @param textRect bounding rectangle for rendering the text
     * @param text string to render
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected void paintBackground(Graphics g, JMenuItem menuItem, Color bgColor) {

    /**
     * Draws the background of the menu item.
     *
     * @param g the paint graphics
     * @param menuItem menu item to be painted
     * @param bgColor selection background color
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    public void update(Graphics g, JComponent c) {

    /**
     * We draw the background in paintMenuItem()
     * so override update (which fills the background of opaque
     * components by default) to just call paint().
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected PropertyChangeListener

    /**
     * Creates a <code>PropertyChangeListener</code> which will be added to
     * the menu item.
     * If this method returns null then it will not be added to the menu item.
     *
     * @return an instance of a <code>PropertyChangeListener</code> or null
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected void uninstallComponents(JMenuItem menuItem){

    /**
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected void installComponents(JMenuItem menuItem){

    /**
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected PropertyChangeListener propertyChangeListener;

    /**
     * <code>PropertyChangeListener</code> returned from
     * <code>createPropertyChangeListener</code>. You should not
     * need to access this field, rather if you want to customize the
     * <code>PropertyChangeListener</code> override
     * <code>createPropertyChangeListener</code>.
     *
     * @since 1.6
     * @see #createPropertyChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
    protected String acceleratorDelimiter;

    /**
     * Accelerator delimiter string, such as {@code '+'} in {@code 'Ctrl+C'}.
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicMenuItemUI.java
public class BasicMenuItemUI extends MenuItemUI

/**
 * BasicMenuItem implementation
 *
 * @author Georges Saab
 * @author David Karlton
 * @author Arnaud Weber
 * @author Fredrik Lagerblad
 */
