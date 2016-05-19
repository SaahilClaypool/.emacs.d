_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    protected class AccessibleJDesktopPane extends AccessibleJComponent {

    /**
     * This class implements accessibility support for the
     * <code>JDesktopPane</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to desktop pane user-interface
     * elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JDesktopPane</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JDesktopPane</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See readObject() and writeObject() in JComponent for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void setComponentZOrder(Component comp, int index) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void removeAll() {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void remove(int index) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    protected void addImpl(Component comp, Object constraints, int index) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public JInternalFrame selectFrame(boolean forward) {

    /**
     * Selects the next <code>JInternalFrame</code> in this desktop pane.
     *
     * @param forward a boolean indicating which direction to select in;
     *        <code>true</code> for forward, <code>false</code> for
     *        backward
     * @return the JInternalFrame that was selected or <code>null</code>
     *         if nothing was selected
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public JInternalFrame[] getAllFramesInLayer(int layer) {

    /**
     * Returns all <code>JInternalFrames</code> currently displayed in the
     * specified layer of the desktop. Returns iconified frames as well
     * expanded frames.
     *
     * @param layer  an int specifying the desktop layer
     * @return an array of <code>JInternalFrame</code> objects
     * @see JLayeredPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void setSelectedFrame(JInternalFrame f) {

    /** Sets the currently active <code>JInternalFrame</code>
     *  in this <code>JDesktopPane</code>. This method is used to bridge
     *  the package gap between JDesktopPane and the platform implementation
     *  code and should not be called directly. To visually select the frame
     *  the client must call JInternalFrame.setSelected(true) to activate
     *  the frame.
     *  @see JInternalFrame#setSelected(boolean)
     *
     * @param f the internal frame that's currently selected
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public JInternalFrame getSelectedFrame() {

    /** Returns the currently active <code>JInternalFrame</code>
      * in this <code>JDesktopPane</code>, or <code>null</code>
      * if no <code>JInternalFrame</code> is currently active.
      *
      * @return the currently active <code>JInternalFrame</code> or
      *   <code>null</code>
      * @since 1.3
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public JInternalFrame[] getAllFrames() {

    /**
     * Returns all <code>JInternalFrames</code> currently displayed in the
     * desktop. Returns iconified frames as well as expanded frames.
     *
     * @return an array of <code>JInternalFrame</code> objects
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "DesktopPaneUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void updateUI() {

    /**
     * Notification from the <code>UIManager</code> that the L&amp;F has changed.
     * Replaces the current UI object with the latest version from the
     * <code>UIManager</code>.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void setDesktopManager(DesktopManager d) {

    /**
     * Sets the <code>DesktopManger</code> that will handle
     * desktop-specific UI actions. This may be overridden by
     * {@code LookAndFeel}.
     *
     * @param d the <code>DesktopManager</code> to use
     *
     * @beaninfo
     *        bound: true
     *  description: Desktop manager to handle the internal frames in the
     *               desktop pane.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public DesktopManager getDesktopManager() {

    /**
     * Returns the <code>DesktopManger</code> that handles
     * desktop-specific UI actions.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
     public int getDragMode() {

    /**
     * Gets the current "dragging style" used by the desktop pane.
     * @return either <code>Live_DRAG_MODE</code> or
     *   <code>OUTLINE_DRAG_MODE</code>
     * @see #setDragMode
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void setDragMode(int dragMode) {

    /**
     * Sets the "dragging style" used by the desktop pane.
     * You may want to change to one mode or another for
     * performance or aesthetic reasons.
     *
     * @param dragMode the style of drag to use for items in the Desktop
     *
     * @see #LIVE_DRAG_MODE
     * @see #OUTLINE_DRAG_MODE
     *
     * @beaninfo
     *        bound: true
     *  description: Dragging style for internal frame children.
     *         enum: LIVE_DRAG_MODE JDesktopPane.LIVE_DRAG_MODE
     *               OUTLINE_DRAG_MODE JDesktopPane.OUTLINE_DRAG_MODE
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public void setUI(DesktopPaneUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the DesktopPaneUI L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public DesktopPaneUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return the <code>DesktopPaneUI</code> object that
     *   renders this component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public JDesktopPane() {

    /**
     * Creates a new <code>JDesktopPane</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public static final int OUTLINE_DRAG_MODE = 1;

    /**
      * Indicates that an outline only of the item being dragged
      * should appear inside the desktop pane.
      *
      * @see #LIVE_DRAG_MODE
      * @see #setDragMode
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    public static final int LIVE_DRAG_MODE = 0;

    /**
      * Indicates that the entire contents of the item being dragged
      * should appear inside the desktop pane.
      *
      * @see #OUTLINE_DRAG_MODE
      * @see #setDragMode
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
    private static final String uiClassID = "DesktopPaneUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JDesktopPane.java
public class JDesktopPane extends JLayeredPane implements Accessible

/**
 * A container used to create a multiple-document interface or a virtual desktop.
 * You create <code>JInternalFrame</code> objects and add them to the
 * <code>JDesktopPane</code>. <code>JDesktopPane</code> extends
 * <code>JLayeredPane</code> to manage the potentially overlapping internal
 * frames. It also maintains a reference to an instance of
 * <code>DesktopManager</code> that is set by the UI
 * class for the current look and feel (L&amp;F).  Note that <code>JDesktopPane</code>
 * does not support borders.
 * <p>
 * This class is normally used as the parent of <code>JInternalFrames</code>
 * to provide a pluggable <code>DesktopManager</code> object to the
 * <code>JInternalFrames</code>. The <code>installUI</code> of the
 * L&amp;F specific implementation is responsible for setting the
 * <code>desktopManager</code> variable appropriately.
 * When the parent of a <code>JInternalFrame</code> is a <code>JDesktopPane</code>,
 * it should delegate most of its behavior to the <code>desktopManager</code>
 * (closing, resizing, etc).
 * <p>
 * For further documentation and examples see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/internalframe.html">How to Use Internal Frames</a>,
 * a section in <em>The Java Tutorial</em>.
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
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
 * @see JInternalFrame
 * @see JInternalFrame.JDesktopIcon
 * @see DesktopManager
 *
 * @author David Kloba
 */
