_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    private static class ButtonFactory {

    /**
     * This class is used to create the default buttons. This indirection is
     * used so that addButtonComponents can tell which Buttons were created
     * by us vs subclassers or from the JOptionPane itself.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    private static class Actions extends UIAction {

    /**
     * Registered in the ActionMap. Sets the value of the option pane
     * to <code>JOptionPane.CLOSED_OPTION</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
        void setKeyStrokes(KeyStroke[] strokes) {

        /**
         * Sets the KeyStrokes that will be additional processed for
         * ancestor bindings.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    private static class MultiplexingTextField extends JTextField {

    /**
     * A JTextField that allows you to specify an array of KeyStrokes that
     * that will have their bindings processed regardless of whether or
     * not they are registered on the JTextField. This is used as we really
     * want the ActionListener to be notified so that we can push the
     * change to the JOptionPane, but we also want additional bindings
     * (those of the JRootPane) to be processed as well.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public class ButtonActionListener implements ActionListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicOptionPaneUI}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    private void configureButton(JButton button) {

    /**
     * Configures any necessary colors/fonts for the specified button
     * used representing the button portion of the optionpane.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    private void configureMessageLabel(JLabel label) {

    /**
     * Configures any necessary colors/fonts for the specified label
     * used representing the message.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
        public void propertyChange(PropertyChangeEvent e) {

        /**
         * If the source of the PropertyChangeEvent <code>e</code> equals the
         * optionPane and is one of the ICON_PROPERTY, MESSAGE_PROPERTY,
         * OPTIONS_PROPERTY or INITIAL_VALUE_PROPERTY,
         * validateComponent is invoked.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public class PropertyChangeHandler implements PropertyChangeListener {

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicOptionPaneUI}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
        private boolean useOrientation;

        /**
         * Indicates whether or not centersChildren should be used vs
         * the orientation. This is done for backward compatibility
         * for subclassers.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
        protected boolean           centersChildren;

        /** If true, children are lumped together in parent. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public static class ButtonAreaLayout implements LayoutManager {

    /**
     * <code>ButtonAreaLayout</code> behaves in a similar manner to
     * <code>FlowLayout</code>. It lays out all components from left to
     * right. If <code>syncAllWidths</code> is true, the widths of each
     * component will be set to the largest preferred size width.
     *
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicOptionPaneUI}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public boolean containsCustomComponents(JOptionPane op) {

    /**
     * Returns true if in the last call to validateComponent the message
     * or buttons contained a subclass of Component.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public void selectInitialValue(JOptionPane op) {

    /**
     * If inputComponent is non-null, the focus is requested on that,
     * otherwise request focus on the default value
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected void resetInputValue() {

    /**
     * Sets the input value in the option pane the receiver is providing
     * the look and feel for based on the value in the inputComponent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected int getInitialValueIndex() {

    /**
     * Returns the initial index into the buttons to select. The index
     * is calculated from the initial value from the JOptionPane and
     * options of the JOptionPane or 0.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected boolean getSizeButtonsToSameWidth() {

    /**
     * Returns true, basic L&amp;F wants all the buttons to have the same
     * width.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected Object[] getButtons() {

    /**
     * Returns the buttons to display from the JOptionPane the receiver is
     * providing the look and feel for. If the JOptionPane has options
     * set, they will be provided, otherwise if the optionType is
     * YES_NO_OPTION, yesNoOptions is returned, if the type is
     * YES_NO_CANCEL_OPTION yesNoCancelOptions is returned, otherwise
     * defaultButtons are returned.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected void addButtonComponents(Container container, Object[] buttons,
                                 int initialIndex) {

    /**
     * Creates the appropriate object to represent each of the objects in
     * <code>buttons</code> and adds it to <code>container</code>. This
     * differs from addMessageComponents in that it will recurse on
     * <code>buttons</code> and that if button is not a Component
     * it will create an instance of JButton.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected Container createButtonArea() {

    /**
     * Creates and returns a Container containing the buttons. The buttons
     * are created by calling <code>getButtons</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected void burstStringInto(Container c, String d, int maxll) {

   /**
     * Recursively creates new JLabel instances to represent <code>d</code>.
     * Each JLabel instance is added to <code>c</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected int getMaxCharactersPerLineCount() {

    /**
     * Returns the maximum number of characters to place on a line.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected Icon getIconForType(int messageType) {

    /**
     * Returns the icon to use for the passed in type.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected Icon getIcon() {

    /**
     * Returns the icon from the JOptionPane the receiver is providing
     * the look and feel for, or the default icon as returned from
     * <code>getDefaultIcon</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected void addIcon(Container top) {

    /**
     * Creates and adds a JLabel representing the icon returned from
     * <code>getIcon</code> to <code>top</code>. This is messaged from
     * <code>createMessageArea</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected Object getMessage() {

    /**
     * Returns the message to display from the JOptionPane the receiver is
     * providing the look and feel for.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected void addMessageComponents(Container container,
                                     GridBagConstraints cons,
                                     Object msg, int maxll,
                                     boolean internallyCreated) {

    /**
     * Creates the appropriate object to represent <code>msg</code> and
     * places it into <code>container</code>. If <code>msg</code> is an
     * instance of Component, it is added directly, if it is an Icon,
     * a JLabel is created to represent it, otherwise a JLabel is
     * created for the string, if <code>d</code> is an Object[], this
     * method will be recursively invoked for the children.
     * <code>internallyCreated</code> is true if Objc is an instance
     * of Component and was created internally by this method (this is
     * used to correctly set hasCustomComponents only if !internallyCreated).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected Container createMessageArea() {

    /**
     * Messaged from installComponents to create a Container containing the
     * body of the message. The icon is the created by calling
     * <code>addIcon</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * If <code>c</code> is the <code>JOptionPane</code> the receiver
     * is contained in, the preferred
     * size that is returned is the maximum of the preferred size of
     * the <code>LayoutManager</code> for the <code>JOptionPane</code>, and
     * <code>getMinimumOptionPaneSize</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public Dimension getMinimumOptionPaneSize() {

    /**
     * Returns the minimum size the option pane should be. Primarily
     * provided for subclassers wishing to offer a different minimum size.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public void uninstallUI(JComponent c) {

    /**
      * Removes the receiver from the L&amp;F controller of the passed in split
      * pane.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public void installUI(JComponent c) {

    /**
      * Installs the receiver as the L&amp;F for the passed in
      * <code>JOptionPane</code>.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    public static ComponentUI createUI(JComponent x) {

    /**
      * Creates a new BasicOptionPaneUI instance.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected boolean             hasCustomComponents;

    /** This is set to true in validateComponent if a Component is contained
     * in either the message or the buttons. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected Component           initialFocusComponent;

    /** Component to receive focus when messaged with selectInitialValue. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected JComponent          inputComponent;

    /** JComponent provide for input if optionPane.getWantsInput() returns
     * true. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
    protected JOptionPane         optionPane;

    /**
     * <code>JOptionPane</code> that the receiver is providing the
     * look and feel for.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicOptionPaneUI.java
public class BasicOptionPaneUI extends OptionPaneUI {

/**
 * Provides the basic look and feel for a <code>JOptionPane</code>.
 * <code>BasicMessagePaneUI</code> provides a means to place an icon,
 * message and buttons into a <code>Container</code>.
 * Generally, the layout will look like:
 * <pre>
 *        ------------------
 *        | i | message    |
 *        | c | message    |
 *        | o | message    |
 *        | n | message    |
 *        ------------------
 *        |     buttons    |
 *        |________________|
 * </pre>
 * icon is an instance of <code>Icon</code> that is wrapped inside a
 * <code>JLabel</code>.  The message is an opaque object and is tested
 * for the following: if the message is a <code>Component</code> it is
 * added to the <code>Container</code>, if it is an <code>Icon</code>
 * it is wrapped inside a <code>JLabel</code> and added to the
 * <code>Container</code> otherwise it is wrapped inside a <code>JLabel</code>.
 * <p>
 * The above layout is used when the option pane's
 * <code>ComponentOrientation</code> property is horizontal, left-to-right.
 * The layout will be adjusted appropriately for other orientations.
 * <p>
 * The <code>Container</code>, message, icon, and buttons are all
 * determined from abstract methods.
 *
 * @author James Gosling
 * @author Scott Violet
 * @author Amy Fowler
 */
