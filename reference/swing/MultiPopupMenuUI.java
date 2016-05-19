_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public Accessible getAccessibleChild(JComponent a, int b) {

    /**
     * Invokes the <code>getAccessibleChild</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public int getAccessibleChildrenCount(JComponent a) {

    /**
     * Invokes the <code>getAccessibleChildrenCount</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public Dimension getMaximumSize(JComponent a) {

    /**
     * Invokes the <code>getMaximumSize</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public Dimension getMinimumSize(JComponent a) {

    /**
     * Invokes the <code>getMinimumSize</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public Dimension getPreferredSize(JComponent a) {

    /**
     * Invokes the <code>getPreferredSize</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public void paint(Graphics a, JComponent b) {

    /**
     * Invokes the <code>paint</code> method on each UI handled by this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public void uninstallUI(JComponent a) {

    /**
     * Invokes the <code>uninstallUI</code> method on each UI handled by this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public void installUI(JComponent a) {

    /**
     * Invokes the <code>installUI</code> method on each UI handled by this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public static ComponentUI createUI(JComponent a) {

    /**
     * Returns a multiplexing UI instance if any of the auxiliary
     * <code>LookAndFeel</code>s supports this UI.  Otherwise, just returns the
     * UI object obtained from the default <code>LookAndFeel</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public void update(Graphics a, JComponent b) {

    /**
     * Invokes the <code>update</code> method on each UI handled by this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    /**

////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
// ComponentUI methods

////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    public Popup getPopup(JPopupMenu a, int b, int c) {

    /**
     * Invokes the <code>getPopup</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    /**

////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
// PopupMenuUI methods

////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    /**

////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
// Common UI methods

////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
    protected Vector uis = new Vector();

    /**
     * The vector containing the real UIs.  This is populated
     * in the call to <code>createUI</code>, and can be obtained by calling
     * the <code>getUIs</code> method.  The first element is guaranteed to be the real UI
     * obtained from the default look and feel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/multi/MultiPopupMenuUI.java
public class MultiPopupMenuUI extends PopupMenuUI {

/**
 * A multiplexing UI used to combine <code>PopupMenuUI</code>s.
 *
 * <p>This file was automatically generated by AutoMulti.
 *
 * @author  Otto Multey
 */
