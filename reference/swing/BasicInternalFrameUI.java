_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
        public void componentResized(ComponentEvent e) {

        /** Invoked when a JInternalFrame's parent's size changes. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
      public void componentResized(ComponentEvent e) {

      /** Invoked when a JInternalFrame's parent's size changes. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected class ComponentHandler implements ComponentListener {

    }    /// End BorderListener Class
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    /**

    /////////////////////////////////////////////////////////////////////////
    /// Border Listener Class
    /////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void deactivateFrame(JInternalFrame f) {

    /** This method is called when the frame is no longer selected.
      * This action is delegated to the desktopManager.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void activateFrame(JInternalFrame f) {

    /** This method is called when the frame becomes selected.
      * This action is delegated to the desktopManager.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void deiconifyFrame(JInternalFrame f) {

    /**
     * This method is called when the user wants to deiconify the frame.
     * The <code>playRestoreUpSound</code> Action is fired.
     * This action is delegated to the desktopManager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void iconifyFrame(JInternalFrame f) {

    /**
     * This method is called when the user wants to iconify the frame.
     * The <code>playMinimizeSound</code> Action is fired.
     * This action is delegated to the desktopManager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void minimizeFrame(JInternalFrame f) {

    /**
     * This method is called when the user wants to minimize the frame.
     * The <code>playRestoreDownSound</code> Action is fired.
     * This action is delegated to the desktopManager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void maximizeFrame(JInternalFrame f) {

    /**
     * This method is called when the user wants to maximize the frame.
     * The <code>playMaximizeSound</code> Action is fired.
     * This action is delegated to the desktopManager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void closeFrame(JInternalFrame f) {

    /**
     * This method is called when the user wants to close the frame.
     * The <code>playCloseSound</code> Action is fired.
     * This action is delegated to the desktopManager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    /** Returns the proper DesktopManager. Calls getDesktopPane() to

/// DesktopManager methods
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
        public void propertyChange(PropertyChangeEvent evt) {

        /**
         * Detects changes in state from the JInternalFrame and handles
         * actions.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void replacePane(JComponent currentPane, JComponent newPane) {

    /**
      * Installs necessary mouse handlers on <code>newPane</code>
      * and adds it to the frame.
      * Reverse process for the <code>currentPane</code>.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void uninstallListeners() {

    /**
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    protected void installListeners() {

    /**
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    public static ComponentUI createUI(JComponent b)    {

/////////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
// ComponentUI Interface Implementation methods

/////////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicInternalFrameUI.java
public class BasicInternalFrameUI extends InternalFrameUI

/**
 * A basic L&amp;F implementation of JInternalFrame.
 *
 * @author David Kloba
 * @author Rich Schiavi
 */
