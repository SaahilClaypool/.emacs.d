_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    protected class AccessibleJColorChooser extends AccessibleJComponent {

    /**
     * This class implements accessibility support for the
     * <code>JColorChooser</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to color chooser user-interface
     * elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JColorChooser.
     * For color choosers, the AccessibleContext takes the form of an
     * AccessibleJColorChooser.
     * A new AccessibleJColorChooser instance is created if necessary.
     *
     * @return an AccessibleJColorChooser that serves as the
     *         AccessibleContext of this JColorChooser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JColorChooser</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JColorChooser</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setSelectionModel(ColorSelectionModel newModel ) {

    /**
     * Sets the model containing the selected color.
     *
     * @param newModel   the new <code>ColorSelectionModel</code> object
     *
     * @beaninfo
     *       bound: true
     *      hidden: true
     * description: The model which contains the currently selected color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public ColorSelectionModel getSelectionModel() {

    /**
     * Returns the data model that handles color selections.
     *
     * @return a <code>ColorSelectionModel</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public AbstractColorChooserPanel[] getChooserPanels() {

    /**
     * Returns the specified color panels.
     *
     * @return an array of <code>AbstractColorChooserPanel</code> objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setChooserPanels( AbstractColorChooserPanel[] panels) {

    /**
     * Specifies the Color Panels used to choose a color value.
     *
     * @param panels  an array of <code>AbstractColorChooserPanel</code>
     *          objects
     *
     * @beaninfo
     *       bound: true
     *      hidden: true
     * description: An array of different chooser types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public AbstractColorChooserPanel removeChooserPanel( AbstractColorChooserPanel panel ) {

    /**
     * Removes the Color Panel specified.
     *
     * @param panel   a string that specifies the panel to be removed
     * @return the color panel
     * @exception IllegalArgumentException if panel is not in list of
     *                  known chooser panels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void addChooserPanel( AbstractColorChooserPanel panel ) {

    /**
     * Adds a color chooser panel to the color chooser.
     *
     * @param panel the <code>AbstractColorChooserPanel</code> to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public JComponent getPreviewPanel() {

    /**
     * Returns the preview panel that shows a chosen color.
     *
     * @return a <code>JComponent</code> object -- the preview panel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setPreviewPanel(JComponent preview) {

    /**
     * Sets the current preview panel.
     * This will fire a <code>PropertyChangeEvent</code> for the property
     * named "previewPanel".
     *
     * @param preview the <code>JComponent</code> which displays the current color
     * @see JComponent#addPropertyChangeListener
     *
     * @beaninfo
     *       bound: true
     *      hidden: true
     * description: The UI component which displays the current color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public boolean getDragEnabled() {

    /**
     * Gets the value of the <code>dragEnabled</code> property.
     *
     * @return  the value of the <code>dragEnabled</code> property
     * @see #setDragEnabled
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setDragEnabled(boolean b) {

    /**
     * Sets the <code>dragEnabled</code> property,
     * which must be <code>true</code> to enable
     * automatic drag handling (the first part of drag and drop)
     * on this component.
     * The <code>transferHandler</code> property needs to be set
     * to a non-<code>null</code> value for the drag to do
     * anything.  The default value of the <code>dragEnabled</code>
     * property
     * is <code>false</code>.
     *
     * <p>
     *
     * When automatic drag handling is enabled,
     * most look and feels begin a drag-and-drop operation
     * when the user presses the mouse button over the preview panel.
     * Some look and feels might not support automatic drag and drop;
     * they will ignore this property.  You can work around such
     * look and feels by modifying the component
     * to directly call the <code>exportAsDrag</code> method of a
     * <code>TransferHandler</code>.
     *
     * @param b the value to set the <code>dragEnabled</code> property to
     * @exception HeadlessException if
     *            <code>b</code> is <code>true</code> and
     *            <code>GraphicsEnvironment.isHeadless()</code>
     *            returns <code>true</code>
     *
     * @since 1.4
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #getDragEnabled
     * @see #setTransferHandler
     * @see TransferHandler
     *
     * @beaninfo
     *  description: Determines whether automatic drag handling is enabled.
     *        bound: false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setColor(int c) {

    /**
     * Sets the current color of the color chooser to the
     * specified color.
     *
     * @param c an integer value that sets the current color in the chooser
     *          where the low-order 8 bits specify the Blue value,
     *          the next 8 bits specify the Green value, and the 8 bits
     *          above that specify the Red value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setColor(int r, int g, int b) {

    /**
     * Sets the current color of the color chooser to the
     * specified RGB color.  Note that the values of red, green,
     * and blue should be between the numbers 0 and 255, inclusive.
     *
     * @param r   an int specifying the amount of Red
     * @param g   an int specifying the amount of Green
     * @param b   an int specifying the amount of Blue
     * @exception IllegalArgumentException if r,g,b values are out of range
     * @see java.awt.Color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setColor(Color color) {

    /**
     * Sets the current color of the color chooser to the specified color.
     * The <code>ColorSelectionModel</code> will fire a <code>ChangeEvent</code>
     * @param color the color to be set in the color chooser
     * @see JComponent#addPropertyChangeListener
     *
     * @beaninfo
     *       bound: false
     *      hidden: false
     * description: The current color the chooser is to display.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public Color getColor() {

    /**
     * Gets the current color value from the color chooser.
     * By default, this delegates to the model.
     *
     * @return the current color value of the color chooser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "ColorChooserUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void updateUI() {

    /**
     * Notification from the <code>UIManager</code> that the L&amp;F has changed.
     * Replaces the current UI object with the latest version from the
     * <code>UIManager</code>.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public void setUI(ColorChooserUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the <code>ColorChooserUI</code> L&amp;F object
     * @see UIDefaults#getUI
     *
     * @beaninfo
     *       bound: true
     *      hidden: true
     * description: The UI object that implements the color chooser's LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public ColorChooserUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return the <code>ColorChooserUI</code> object that renders
     *          this component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public JColorChooser(ColorSelectionModel model) {

    /**
     * Creates a color chooser pane with the specified
     * <code>ColorSelectionModel</code>.
     *
     * @param model the <code>ColorSelectionModel</code> to be used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public JColorChooser(Color initialColor) {

    /**
     * Creates a color chooser pane with the specified initial color.
     *
     * @param initialColor the initial color set in the chooser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public JColorChooser() {

    /**
     * Creates a color chooser pane with an initial color of white.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public static JDialog createDialog(Component c, String title, boolean modal,
        JColorChooser chooserPane, ActionListener okListener,
        ActionListener cancelListener) throws HeadlessException {

    /**
     * Creates and returns a new dialog containing the specified
     * <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset"
     * buttons. If the "OK" or "Cancel" buttons are pressed, the dialog is
     * automatically hidden (but not disposed).  If the "Reset"
     * button is pressed, the color-chooser's color will be reset to the
     * color which was set the last time <code>show</code> was invoked on the
     * dialog and the dialog will remain showing.
     *
     * @param c              the parent component for the dialog
     * @param title          the title for the dialog
     * @param modal          a boolean. When true, the remainder of the program
     *                       is inactive until the dialog is closed.
     * @param chooserPane    the color-chooser to be placed inside the dialog
     * @param okListener     the ActionListener invoked when "OK" is pressed
     * @param cancelListener the ActionListener invoked when "Cancel" is pressed
     * @return a new dialog containing the color-chooser pane
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public static Color showDialog(Component component,
        String title, Color initialColor) throws HeadlessException {

    /**
     * Shows a modal color-chooser dialog and blocks until the
     * dialog is hidden.  If the user presses the "OK" button, then
     * this method hides/disposes the dialog and returns the selected color.
     * If the user presses the "Cancel" button or closes the dialog without
     * pressing "OK", then this method hides/disposes the dialog and returns
     * <code>null</code>.
     *
     * @param component    the parent <code>Component</code> for the dialog
     * @param title        the String containing the dialog's title
     * @param initialColor the initial Color set when the color-chooser is shown
     * @return the selected color or <code>null</code> if the user opted out
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public static final String      CHOOSER_PANELS_PROPERTY = "chooserPanels";

    /**
     * The chooserPanel array property name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public static final String      PREVIEW_PANEL_PROPERTY = "previewPanel";

    /**
     * The preview panel property name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    public static final String      SELECTION_MODEL_PROPERTY = "selectionModel";

    /**
     * The selection model property name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
    private static final String uiClassID = "ColorChooserUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JColorChooser.java
public class JColorChooser extends JComponent implements Accessible {

/**
 * <code>JColorChooser</code> provides a pane of controls designed to allow
 * a user to manipulate and select a color.
 * For information about using color choosers, see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/colorchooser.html">How to Use Color Choosers</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * <p>
 *
 * This class provides three levels of API:
 * <ol>
 * <li>A static convenience method which shows a modal color-chooser
 * dialog and returns the color selected by the user.
 * <li>A static convenience method for creating a color-chooser dialog
 * where <code>ActionListeners</code> can be specified to be invoked when
 * the user presses one of the dialog buttons.
 * <li>The ability to create instances of <code>JColorChooser</code> panes
 * directly (within any container). <code>PropertyChange</code> listeners
 * can be added to detect when the current "color" property changes.
 * </ol>
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
 *
 * @beaninfo
 *      attribute: isContainer false
 *    description: A component that supports selecting a Color.
 *
 *
 * @author James Gosling
 * @author Amy Fowler
 * @author Steve Wilson
 */
