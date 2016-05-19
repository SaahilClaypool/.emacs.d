_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected class AccessibleJOptionPane extends AccessibleJComponent {

    /**
     * This class implements accessibility support for the
     * <code>JOptionPane</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to option pane user-interface
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    /**

///////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
// Accessibility support

///////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    private static class ModalPrivilegedAction implements PrivilegedAction<Method> {

    /**
     * Retrieves a method from the provided class and makes it accessible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JOptionPane</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JOptionPane</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void selectInitialValue() {

    /**
     * Requests that the initial value be selected, which will set
     * focus to the initial value. This method
     * should be invoked after the window containing the option pane
     * is made visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public boolean getWantsInput() {

    /**
     * Returns the value of the <code>wantsInput</code> property.
     *
     * @return true if an input component will be provided
     * @see #setWantsInput
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setWantsInput(boolean newValue) {

    /**
     * Sets the <code>wantsInput</code> property.
     * If <code>newValue</code> is true, an input component
     * (such as a text field or combo box) whose parent is
     * <code>parentComponent</code> is provided to
     * allow the user to input a value. If <code>getSelectionValues</code>
     * returns a non-<code>null</code> array, the input value is one of the
     * objects in that array. Otherwise the input value is whatever
     * the user inputs.
     * <p>
     * This is a bound property.
     *
     * @see #setSelectionValues
     * @see #setInputValue
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: Flag which allows the user to input a value.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public int getMaxCharactersPerLineCount() {

    /**
     * Returns the maximum number of characters to place on a line in a
     * message. Default is to return <code>Integer.MAX_VALUE</code>.
     * The value can be
     * changed by overriding this method in a subclass.
     *
     * @return an integer giving the maximum number of characters on a line
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Object getInputValue() {

    /**
     * Returns the value the user has input, if <code>wantsInput</code>
     * is true.
     *
     * @return the <code>Object</code> the user specified,
     *          if it was one of the objects, or a
     *          <code>String</code> if it was a value typed into a
     *          field
     * @see #setSelectionValues
     * @see #setWantsInput
     * @see #setInputValue
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setInputValue(Object newValue) {

    /**
     * Sets the input value that was selected or input by the user.
     * Only used if <code>wantsInput</code> is true.  Note that this method
     * is invoked internally by the option pane (in response to user action)
     * and should generally not be called by client programs.  To set the
     * input value initially displayed as selected to the user, use
     * <code>setInitialSelectionValue</code>.
     *
     * @param newValue the <code>Object</code> used to set the
     *          value that the user specified (usually in a text field)
     * @see #setSelectionValues
     * @see #setInitialSelectionValue
     * @see #setWantsInput
     * @see #getInputValue
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The option pane's input value object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Object getInitialSelectionValue() {

    /**
     * Returns the input value that is displayed as initially selected to the user.
     *
     * @return the initially selected value
     * @see #setInitialSelectionValue
     * @see #setSelectionValues
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setInitialSelectionValue(Object newValue) {

    /**
     * Sets the input value that is initially displayed as selected to the user.
     * Only used if <code>wantsInput</code> is true.
     * @param newValue the initially selected value
     * @see #setSelectionValues
     * @see #getInitialSelectionValue
     * @beaninfo
     *       bound: true
     * description: The option pane's initial selection value object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Object[] getSelectionValues() {

    /**
     * Returns the input selection values.
     *
     * @return the array of <code>Objects</code> the user can select
     * @see #setSelectionValues
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setSelectionValues(Object[] newValues) {

    /**
     * Sets the input selection values for a pane that provides the user
     * with a list of items to choose from. (The UI provides a widget
     * for choosing one of the values.)  A <code>null</code> value
     * implies the user can input whatever they wish, usually by means
     * of a <code>JTextField</code>.
     * <p>
     * Sets <code>wantsInput</code> to true. Use
     * <code>setInitialSelectionValue</code> to specify the initially-chosen
     * value. After the pane as been enabled, <code>inputValue</code> is
     * set to the value the user has selected.
     * @param newValues an array of <code>Objects</code> the user to be
     *                  displayed
     *                  (usually in a list or combo-box) from which
     *                  the user can make a selection
     * @see #setWantsInput
     * @see #setInitialSelectionValue
     * @see #getSelectionValues
     * @beaninfo
     *       bound: true
     * description: The option pane's selection values.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public int getOptionType() {

    /**
     * Returns the type of options that are displayed.
     *
     * @return an integer specifying the user-selectable options
     *
     * @see #setOptionType
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setOptionType(int newType) {

    /**
     * Sets the options to display.
     * The option type is used by the Look and Feel to
     * determine what buttons to show (unless options are supplied).
     * @param newType an integer specifying the options the {@literal L&F} is to display:
     *                  <code>DEFAULT_OPTION</code>,
     *                  <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  or <code>OK_CANCEL_OPTION</code>
     * @exception RuntimeException if <code>newType</code> is not one of
     *          the legal values listed above
     *
     * @see #getOptionType
     * @see #setOptions
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The option pane's option type.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public int getMessageType() {

    /**
     * Returns the message type.
     *
     * @return an integer specifying the message type
     *
     * @see #setMessageType
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setMessageType(int newType) {

    /**
     * Sets the option pane's message type.
     * The message type is used by the Look and Feel to determine the
     * icon to display (if not supplied) as well as potentially how to
     * lay out the <code>parentComponent</code>.
     * @param newType an integer specifying the kind of message to display:
     *                <code>ERROR_MESSAGE</code>, <code>INFORMATION_MESSAGE</code>,
     *                <code>WARNING_MESSAGE</code>,
     *                <code>QUESTION_MESSAGE</code>, or <code>PLAIN_MESSAGE</code>
     * @exception RuntimeException if <code>newType</code> is not one of the
     *          legal values listed above

     * @see #getMessageType
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The option pane's message type.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Object getInitialValue() {

    /**
     * Returns the initial value.
     *
     * @return the <code>Object</code> that gets the initial keyboard focus
     *
     * @see #setInitialValue
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setInitialValue(Object newInitialValue) {

    /**
     * Sets the initial value that is to be enabled -- the
     * <code>Component</code>
     * that has the focus when the pane is initially displayed.
     *
     * @param newInitialValue the <code>Object</code> that gets the initial
     *                         keyboard focus
     *
     * @see #getInitialValue
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The option pane's initial value object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Object[] getOptions() {

    /**
     * Returns the choices the user can make.
     * @return the array of <code>Objects</code> that give the user's choices
     *
     * @see #setOptions
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setOptions(Object[] newOptions) {

    /**
     * Sets the options this pane displays. If an element in
     * <code>newOptions</code> is a <code>Component</code>
     * it is added directly to the pane,
     * otherwise a button is created for the element.
     *
     * @param newOptions an array of <code>Objects</code> that create the
     *          buttons the user can click on, or arbitrary
     *          <code>Components</code> to add to the pane
     *
     * @see #getOptions
     * @beaninfo
     *       bound: true
     * description: The option pane's options objects.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Object getValue() {

    /**
     * Returns the value the user has selected. <code>UNINITIALIZED_VALUE</code>
     * implies the user has not yet made a choice, <code>null</code> means the
     * user closed the window with out choosing anything. Otherwise
     * the returned value will be one of the options defined in this
     * object.
     *
     * @return the <code>Object</code> chosen by the user,
     *         <code>UNINITIALIZED_VALUE</code>
     *         if the user has not yet made a choice, or <code>null</code> if
     *         the user closed the window without making a choice
     *
     * @see #setValue
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setValue(Object newValue) {

    /**
     * Sets the value the user has chosen.
     * @param newValue  the chosen value
     *
     * @see #getValue
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The option pane's value object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Icon getIcon() {

    /**
     * Returns the icon this pane displays.
     * @return the <code>Icon</code> that is displayed
     *
     * @see #setIcon
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setIcon(Icon newIcon) {

    /**
     * Sets the icon to display. If non-<code>null</code>, the look and feel
     * does not provide an icon.
     * @param newIcon the <code>Icon</code> to display
     *
     * @see #getIcon
     * @beaninfo
     *   preferred: true
     *       bound: true
     * description: The option pane's type icon.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public Object getMessage() {

    /**
     * Returns the message-object this pane displays.
     * @see #setMessage
     *
     * @return the <code>Object</code> that is displayed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setMessage(Object newMessage) {

    /**
     * Sets the option pane's message-object.
     * @param newMessage the <code>Object</code> to display
     * @see #getMessage
     *
     * @beaninfo
     *   preferred: true
     *   bound: true
     * description: The optionpane's message object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public String getUIClassID() {

    /**
     * Returns the name of the UI class that implements the
     * {@literal L&F} for this component.
     *
     * @return the string "OptionPaneUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void updateUI() {

    /**
     * Notification from the <code>UIManager</code> that the {@literal L&F} has changed.
     * Replaces the current UI object with the latest version from the
     * <code>UIManager</code>.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public OptionPaneUI getUI() {

    /**
     * Returns the UI object which implements the {@literal L&F} for this component.
     *
     * @return the <code>OptionPaneUI</code> object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public void setUI(OptionPaneUI ui) {

    /**
     * Sets the UI object which implements the {@literal L&F} for this component.
     *
     * @param ui  the <code>OptionPaneUI</code> {@literal L&F} object
     * @see UIDefaults#getUI
     * @beaninfo
     *       bound: true
     *      hidden: true
     * description: The UI object that implements the optionpane's LookAndFeel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JOptionPane(Object message, int messageType, int optionType,
                       Icon icon, Object[] options, Object initialValue) {

    /**
     * Creates an instance of <code>JOptionPane</code> to display a message
     * with the specified message type, icon, and options, with the
     * initially-selected option specified.
     *
     * @param message the <code>Object</code> to display
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param optionType the options to display in the pane:
     *                  <code>DEFAULT_OPTION</code>,
     *                  <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  <code>OK_CANCEL_OPTION</code>
     * @param icon the Icon image to display
     * @param options  the choices the user can select
     * @param initialValue the choice that is initially selected; if
     *                  <code>null</code>, then nothing will be initially selected;
     *                  only meaningful if <code>options</code> is used
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JOptionPane(Object message, int messageType, int optionType,
                       Icon icon, Object[] options) {

    /**
     * Creates an instance of <code>JOptionPane</code> to display a message
     * with the specified message type, icon, and options.
     * None of the options is initially selected.
     * <p>
     * The options objects should contain either instances of
     * <code>Component</code>s, (which are added directly) or
     * <code>Strings</code> (which are wrapped in a <code>JButton</code>).
     * If you provide <code>Component</code>s, you must ensure that when the
     * <code>Component</code> is clicked it messages <code>setValue</code>
     * in the created <code>JOptionPane</code>.
     *
     * @param message the <code>Object</code> to display
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param optionType the options to display in the pane:
     *                  <code>DEFAULT_OPTION</code>,
     *                  <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  <code>OK_CANCEL_OPTION</code>
     * @param icon the <code>Icon</code> image to display
     * @param options  the choices the user can select
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JOptionPane(Object message, int messageType, int optionType,
                       Icon icon) {

    /**
     * Creates an instance of <code>JOptionPane</code> to display a message
     * with the specified message type, options, and icon.
     *
     * @param message the <code>Object</code> to display
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param optionType the options to display in the pane:
     *                  <code>DEFAULT_OPTION</code>, <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  <code>OK_CANCEL_OPTION</code>
     * @param icon the <code>Icon</code> image to display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JOptionPane(Object message, int messageType, int optionType) {

    /**
     * Creates an instance of <code>JOptionPane</code> to display a message
     * with the specified message type and options.
     *
     * @param message the <code>Object</code> to display
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param optionType the options to display in the pane:
     *                  <code>DEFAULT_OPTION</code>, <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  <code>OK_CANCEL_OPTION</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JOptionPane(Object message, int messageType) {

    /**
     * Creates an instance of <code>JOptionPane</code> to display a message
     * with the specified message type and the default options,
     *
     * @param message the <code>Object</code> to display
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JOptionPane(Object message) {

    /**
     * Creates a instance of <code>JOptionPane</code> to display a
     * message using the
     * plain-message message type and the default options delivered by
     * the UI.
     *
     * @param message the <code>Object</code> to display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JOptionPane() {

    /**
     * Creates a <code>JOptionPane</code> with a test message.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static Frame getRootFrame() throws HeadlessException {

    /**
     * Returns the <code>Frame</code> to use for the class methods in
     * which a frame is not provided.
     *
     * @return the default <code>Frame</code> to use
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see #setRootFrame
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static void setRootFrame(Frame newRootFrame) {

    /**
     * Sets the frame to use for class methods in which a frame is
     * not provided.
     * <p>
     * <strong>Note:</strong>
     * It is recommended that rather than using this method you supply a valid parent.
     *
     * @param newRootFrame the default <code>Frame</code> to use
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static JDesktopPane getDesktopPaneForComponent(Component parentComponent) {

    /**
     * Returns the specified component's desktop pane.
     *
     * @param parentComponent the <code>Component</code> to check for a
     *          desktop
     * @return the <code>JDesktopPane</code> that contains the component,
     *          or <code>null</code> if the component is <code>null</code>
     *          or does not have an ancestor that is a
     *          <code>JInternalFrame</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    static Window getWindowForComponent(Component parentComponent)

    /**
     * Returns the specified component's toplevel <code>Frame</code> or
     * <code>Dialog</code>.
     *
     * @param parentComponent the <code>Component</code> to check for a
     *          <code>Frame</code> or <code>Dialog</code>
     * @return the <code>Frame</code> or <code>Dialog</code> that
     *          contains the component, or the default
     *          frame if the component is <code>null</code>,
     *          or does not have a valid
     *          <code>Frame</code> or <code>Dialog</code> parent
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static Frame getFrameForComponent(Component parentComponent)

    /**
     * Returns the specified component's <code>Frame</code>.
     *
     * @param parentComponent the <code>Component</code> to check for a
     *          <code>Frame</code>
     * @return the <code>Frame</code> that contains the component,
     *          or <code>getRootFrame</code>
     *          if the component is <code>null</code>,
     *          or does not have a valid <code>Frame</code> parent
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see #getRootFrame
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JInternalFrame createInternalFrame(Component parentComponent,
                                 String title) {

    /**
     * Creates and returns an instance of <code>JInternalFrame</code>.
     * The internal frame is created with the specified title,
     * and wrapping the <code>JOptionPane</code>.
     * The returned <code>JInternalFrame</code> is
     * added to the <code>JDesktopPane</code> ancestor of
     * <code>parentComponent</code>, or components
     * parent if one its ancestors isn't a <code>JDesktopPane</code>,
     * or if <code>parentComponent</code>
     * doesn't have a parent then a <code>RuntimeException</code> is thrown.
     *
     * @param parentComponent  the parent <code>Component</code> for
     *          the internal frame
     * @param title    the <code>String</code> to display in the
     *          frame's title bar
     * @return a <code>JInternalFrame</code> containing a
     *          <code>JOptionPane</code>
     * @exception RuntimeException if <code>parentComponent</code> does
     *          not have a valid parent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static Object showInternalInputDialog(Component parentComponent,
            Object message, String title, int messageType, Icon icon,
            Object[] selectionValues, Object initialSelectionValue) {

    /**
     * Prompts the user for input in a blocking internal dialog where
     * the initial selection, possible selections, and all other
     * options can be specified. The user will able to choose from
     * <code>selectionValues</code>, where <code>null</code>
     * implies the user can input
     * whatever they wish, usually by means of a <code>JTextField</code>.
     * <code>initialSelectionValue</code> is the initial value to prompt
     * the user with. It is up to the UI to decide how best to represent
     * the <code>selectionValues</code>, but usually a
     * <code>JComboBox</code>, <code>JList</code>, or
     * <code>JTextField</code> will be used.
     *
     * @param parentComponent the parent <code>Component</code> for the dialog
     * @param message  the <code>Object</code> to display
     * @param title    the <code>String</code> to display in the dialog
     *          title bar
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>, <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>, or <code>PLAIN_MESSAGE</code>
     * @param icon     the <code>Icon</code> image to display
     * @param selectionValues an array of <code>Objects</code> that
     *                  gives the possible selections
     * @param initialSelectionValue the value used to initialize the input
     *                  field
     * @return user's input, or <code>null</code> meaning the user
     *          canceled the input
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static String showInternalInputDialog(Component parentComponent,
                             Object message, String title, int messageType) {

    /**
     * Shows an internal dialog requesting input from the user parented
     * to <code>parentComponent</code> with the dialog having the title
     * <code>title</code> and message type <code>messageType</code>.
     *
     * @param parentComponent the parent <code>Component</code> for the dialog
     * @param message  the <code>Object</code> to display
     * @param title    the <code>String</code> to display in the
     *          dialog title bar
     * @param messageType the type of message that is to be displayed:
     *                    ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE,
     *                    QUESTION_MESSAGE, or PLAIN_MESSAGE
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static String showInternalInputDialog(Component parentComponent,
                                                 Object message) {

    /**
     * Shows an internal question-message dialog requesting input from
     * the user parented to <code>parentComponent</code>. The dialog
     * is displayed in the <code>Component</code>'s frame,
     * and is usually positioned below the <code>Component</code>.
     *
     * @param parentComponent  the parent <code>Component</code>
     *          for the dialog
     * @param message  the <code>Object</code> to display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showInternalOptionDialog(Component parentComponent,
                                       Object message,
                                       String title, int optionType,
                                       int messageType, Icon icon,
                                       Object[] options, Object initialValue) {

    /**
     * Brings up an internal dialog panel with a specified icon, where
     * the initial choice is determined by the <code>initialValue</code>
     * parameter and the number of choices is determined by the
     * <code>optionType</code> parameter.
     * <p>
     * If <code>optionType</code> is <code>YES_NO_OPTION</code>, or
     * <code>YES_NO_CANCEL_OPTION</code>
     * and the <code>options</code> parameter is <code>null</code>,
     * then the options are supplied by the Look and Feel.
     * <p>
     * The <code>messageType</code> parameter is primarily used to supply
     * a default icon from the look and feel.
     *
     * @param parentComponent determines the <code>Frame</code>
     *          in which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the object to display in the dialog; a
     *          <code>Component</code> object is rendered as a
     *          <code>Component</code>; a <code>String</code>
     *          object is rendered as a string. Other objects are
     *          converted to a <code>String</code> using the
     *          <code>toString</code> method
     * @param title     the title string for the dialog
     * @param optionType an integer designating the options available
     *          on the dialog: <code>YES_NO_OPTION</code>,
     *          or <code>YES_NO_CANCEL_OPTION</code>
     * @param messageType an integer designating the kind of message this is;
     *          primarily used to determine the icon from the
     *          pluggable Look and Feel: <code>ERROR_MESSAGE</code>,
     *          <code>INFORMATION_MESSAGE</code>,
     *          <code>WARNING_MESSAGE</code>, <code>QUESTION_MESSAGE</code>,
     *          or <code>PLAIN_MESSAGE</code>
     * @param icon      the icon to display in the dialog
     * @param options   an array of objects indicating the possible choices
     *          the user can make; if the objects are components, they
     *          are rendered properly; non-<code>String</code>
     *          objects are rendered using their <code>toString</code>
     *          methods; if this parameter is <code>null</code>,
     *          the options are determined by the Look and Feel
     * @param initialValue the object that represents the default selection
     *          for the dialog; only meaningful if <code>options</code>
     *          is used; can be <code>null</code>
     * @return an integer indicating the option chosen by the user,
     *          or <code>CLOSED_OPTION</code> if the user closed the Dialog
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showInternalConfirmDialog(Component parentComponent,
                                        Object message,
                                        String title, int optionType,
                                        int messageType, Icon icon) {

    /**
     * Brings up an internal dialog panel with a specified icon, where
     * the number of choices is determined by the <code>optionType</code>
     * parameter.
     * The <code>messageType</code> parameter is primarily used to supply
     * a default icon from the look and feel.
     *
     * @param parentComponent determines the <code>Frame</code>
     *          in which the dialog is displayed; if <code>null</code>,
     *          or if the parentComponent has no Frame, a
     *          default <code>Frame</code> is used
     * @param message   the object to display in the dialog; a
     *          <code>Component</code> object is rendered as a
     *          <code>Component</code>; a <code>String</code>
     *          object is rendered as a string; other objects are
     *          converted to a <code>String</code> using the
     *          <code>toString</code> method
     * @param title     the title string for the dialog
     * @param optionType an integer designating the options available
     *          on the dialog:
     *          <code>YES_NO_OPTION</code>, or
     *          <code>YES_NO_CANCEL_OPTION</code>.
     * @param messageType an integer designating the kind of message this is,
     *          primarily used to determine the icon from the pluggable
     *          Look and Feel: <code>ERROR_MESSAGE</code>,
     *          <code>INFORMATION_MESSAGE</code>,
     *          <code>WARNING_MESSAGE</code>, <code>QUESTION_MESSAGE</code>,
     *          or <code>PLAIN_MESSAGE</code>
     * @param icon      the icon to display in the dialog
     * @return an integer indicating the option selected by the user
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showInternalConfirmDialog(Component parentComponent,
                                        Object message,
                                        String title, int optionType,
                                        int messageType) {

    /**
     * Brings up an internal dialog panel where the number of choices
     * is determined by the <code>optionType</code> parameter, where
     * the <code>messageType</code> parameter determines the icon to display.
     * The <code>messageType</code> parameter is primarily used to supply
     * a default icon from the Look and Feel.
     *
     * @param parentComponent determines the <code>Frame</code> in
     *          which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the object to display in the dialog; a
     *          <code>Component</code> object is rendered as a
     *          <code>Component</code>; a <code>String</code>
     *          object is rendered as a string; other objects are
     *          converted to a <code>String</code> using the
     *          <code>toString</code> method
     * @param title     the title string for the dialog
     * @param optionType an integer designating the options
     *          available on the dialog:
     *          <code>YES_NO_OPTION</code>, or <code>YES_NO_CANCEL_OPTION</code>
     * @param messageType an integer designating the kind of message this is,
     *          primarily used to determine the icon from the
     *          pluggable Look and Feel: <code>ERROR_MESSAGE</code>,
     *          <code>INFORMATION_MESSAGE</code>,
     *          <code>WARNING_MESSAGE</code>, <code>QUESTION_MESSAGE</code>,
     *          or <code>PLAIN_MESSAGE</code>
     * @return an integer indicating the option selected by the user
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showInternalConfirmDialog(Component parentComponent,
                                                Object message, String title,
                                                int optionType) {

    /**
     * Brings up a internal dialog panel where the number of choices
     * is determined by the <code>optionType</code> parameter.
     *
     * @param parentComponent determines the <code>Frame</code>
     *          in which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the object to display in the dialog; a
     *          <code>Component</code> object is rendered as a
     *          <code>Component</code>; a <code>String</code>
     *          object is rendered as a string; other objects
     *          are converted to a <code>String</code> using the
     *          <code>toString</code> method
     * @param title     the title string for the dialog
     * @param optionType an integer designating the options
     *          available on the dialog: <code>YES_NO_OPTION</code>,
     *          or <code>YES_NO_CANCEL_OPTION</code>
     * @return an integer indicating the option selected by the user
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showInternalConfirmDialog(Component parentComponent,
                                                Object message) {

    /**
     * Brings up an internal dialog panel with the options <i>Yes</i>, <i>No</i>
     * and <i>Cancel</i>; with the title, <b>Select an Option</b>.
     *
     * @param parentComponent determines the <code>Frame</code> in
     *          which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @return an integer indicating the option selected by the user
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static void showInternalMessageDialog(Component parentComponent,
                                         Object message,
                                         String title, int messageType,
                                         Icon icon){

    /**
     * Brings up an internal dialog panel displaying a message,
     * specifying all parameters.
     *
     * @param parentComponent determines the <code>Frame</code>
     *          in which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @param title     the title string for the dialog
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param icon      an icon to display in the dialog that helps the user
     *                  identify the kind of message that is being displayed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static void showInternalMessageDialog(Component parentComponent,
                                                 Object message, String title,
                                                 int messageType) {

    /**
     * Brings up an internal dialog panel that displays a message
     * using a default icon determined by the <code>messageType</code>
     * parameter.
     *
     * @param parentComponent determines the <code>Frame</code>
     *          in which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @param title     the title string for the dialog
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static void showInternalMessageDialog(Component parentComponent,
                                                 Object message) {

    /**
     * Brings up an internal confirmation dialog panel. The dialog
     * is a information-message dialog titled "Message".
     *
     * @param parentComponent determines the <code>Frame</code>
     *          in which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the object to display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JDialog createDialog(String title) throws HeadlessException {

    /**
     * Creates and returns a new parentless <code>JDialog</code>
     * with the specified title.
     * The returned <code>JDialog</code> will not be resizable by the
     * user, however programs can invoke <code>setResizable</code> on
     * the <code>JDialog</code> instance to change this property.
     * The returned <code>JDialog</code> will be set up such that
     * once it is closed, or the user clicks on one of the buttons,
     * the optionpane's value property will be set accordingly and
     * the dialog will be closed.  Each time the dialog is made visible,
     * it will reset the option pane's value property to
     * <code>JOptionPane.UNINITIALIZED_VALUE</code> to ensure the
     * user's subsequent action closes the dialog properly.
     *
     * @param title     the title string for the dialog
     * @return a new <code>JDialog</code> containing this instance
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public JDialog createDialog(Component parentComponent, String title)

    /**
     * Creates and returns a new <code>JDialog</code> wrapping
     * <code>this</code> centered on the <code>parentComponent</code>
     * in the <code>parentComponent</code>'s frame.
     * <code>title</code> is the title of the returned dialog.
     * The returned <code>JDialog</code> will not be resizable by the
     * user, however programs can invoke <code>setResizable</code> on
     * the <code>JDialog</code> instance to change this property.
     * The returned <code>JDialog</code> will be set up such that
     * once it is closed, or the user clicks on one of the buttons,
     * the optionpane's value property will be set accordingly and
     * the dialog will be closed.  Each time the dialog is made visible,
     * it will reset the option pane's value property to
     * <code>JOptionPane.UNINITIALIZED_VALUE</code> to ensure the
     * user's subsequent action closes the dialog properly.
     *
     * @param parentComponent determines the frame in which the dialog
     *          is displayed; if the <code>parentComponent</code> has
     *          no <code>Frame</code>, a default <code>Frame</code> is used
     * @param title     the title string for the dialog
     * @return a new <code>JDialog</code> containing this instance
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showOptionDialog(Component parentComponent,
        Object message, String title, int optionType, int messageType,
        Icon icon, Object[] options, Object initialValue)

    /**
     * Brings up a dialog with a specified icon, where the initial
     * choice is determined by the <code>initialValue</code> parameter and
     * the number of choices is determined by the <code>optionType</code>
     * parameter.
     * <p>
     * If <code>optionType</code> is <code>YES_NO_OPTION</code>,
     * or <code>YES_NO_CANCEL_OPTION</code>
     * and the <code>options</code> parameter is <code>null</code>,
     * then the options are
     * supplied by the look and feel.
     * <p>
     * The <code>messageType</code> parameter is primarily used to supply
     * a default icon from the look and feel.
     *
     * @param parentComponent determines the <code>Frame</code>
     *                  in which the dialog is displayed;  if
     *                  <code>null</code>, or if the
     *                  <code>parentComponent</code> has no
     *                  <code>Frame</code>, a
     *                  default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @param title     the title string for the dialog
     * @param optionType an integer designating the options available on the
     *                  dialog: <code>DEFAULT_OPTION</code>,
     *                  <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  or <code>OK_CANCEL_OPTION</code>
     * @param messageType an integer designating the kind of message this is,
     *                  primarily used to determine the icon from the
     *                  pluggable Look and Feel: <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param icon      the icon to display in the dialog
     * @param options   an array of objects indicating the possible choices
     *                  the user can make; if the objects are components, they
     *                  are rendered properly; non-<code>String</code>
     *                  objects are
     *                  rendered using their <code>toString</code> methods;
     *                  if this parameter is <code>null</code>,
     *                  the options are determined by the Look and Feel
     * @param initialValue the object that represents the default selection
     *                  for the dialog; only meaningful if <code>options</code>
     *                  is used; can be <code>null</code>
     * @return an integer indicating the option chosen by the user,
     *                  or <code>CLOSED_OPTION</code> if the user closed
     *                  the dialog
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType,
        int messageType, Icon icon) throws HeadlessException {

    /**
     * Brings up a dialog with a specified icon, where the number of
     * choices is determined by the <code>optionType</code> parameter.
     * The <code>messageType</code> parameter is primarily used to supply
     * a default icon from the look and feel.
     *
     * @param parentComponent determines the <code>Frame</code> in which the
     *                  dialog is displayed; if <code>null</code>,
     *                  or if the <code>parentComponent</code> has no
     *                  <code>Frame</code>, a
     *                  default <code>Frame</code> is used
     * @param message   the Object to display
     * @param title     the title string for the dialog
     * @param optionType an int designating the options available on the dialog:
     *                  <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  or <code>OK_CANCEL_OPTION</code>
     * @param messageType an int designating the kind of message this is,
     *                  primarily used to determine the icon from the pluggable
     *                  Look and Feel: <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param icon      the icon to display in the dialog
     * @return an int indicating the option selected by the user
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType, int messageType)

    /**
     * Brings up a dialog where the number of choices is determined
     * by the <code>optionType</code> parameter, where the
     * <code>messageType</code>
     * parameter determines the icon to display.
     * The <code>messageType</code> parameter is primarily used to supply
     * a default icon from the Look and Feel.
     *
     * @param parentComponent determines the <code>Frame</code> in
     *                  which the dialog is displayed; if <code>null</code>,
     *                  or if the <code>parentComponent</code> has no
     *                  <code>Frame</code>, a
     *                  default <code>Frame</code> is used.
     * @param message   the <code>Object</code> to display
     * @param title     the title string for the dialog
     * @param optionType an integer designating the options available
     *                   on the dialog: <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  or <code>OK_CANCEL_OPTION</code>
     * @param messageType an integer designating the kind of message this is;
     *                  primarily used to determine the icon from the pluggable
     *                  Look and Feel: <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @return an integer indicating the option selected by the user
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showConfirmDialog(Component parentComponent,
        Object message, String title, int optionType)

    /**
     * Brings up a dialog where the number of choices is determined
     * by the <code>optionType</code> parameter.
     *
     * @param parentComponent determines the <code>Frame</code> in which the
     *                  dialog is displayed; if <code>null</code>,
     *                  or if the <code>parentComponent</code> has no
     *                  <code>Frame</code>, a
     *                  default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @param title     the title string for the dialog
     * @param optionType an int designating the options available on the dialog:
     *                  <code>YES_NO_OPTION</code>,
     *                  <code>YES_NO_CANCEL_OPTION</code>,
     *                  or <code>OK_CANCEL_OPTION</code>
     * @return an int indicating the option selected by the user
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static int showConfirmDialog(Component parentComponent,
        Object message) throws HeadlessException {

    /**
     * Brings up a dialog with the options <i>Yes</i>,
     * <i>No</i> and <i>Cancel</i>; with the
     * title, <b>Select an Option</b>.
     *
     * @param parentComponent determines the <code>Frame</code> in which the
     *                  dialog is displayed; if <code>null</code>,
     *                  or if the <code>parentComponent</code> has no
     *                  <code>Frame</code>, a
     *                  default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @return an integer indicating the option selected by the user
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static void showMessageDialog(Component parentComponent,
        Object message, String title, int messageType, Icon icon)

    /**
     * Brings up a dialog displaying a message, specifying all parameters.
     *
     * @param parentComponent determines the <code>Frame</code> in which the
     *                  dialog is displayed; if <code>null</code>,
     *                  or if the <code>parentComponent</code> has no
     *                  <code>Frame</code>, a
     *                  default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @param title     the title string for the dialog
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param icon      an icon to display in the dialog that helps the user
     *                  identify the kind of message that is being displayed
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static void showMessageDialog(Component parentComponent,
        Object message, String title, int messageType)

    /**
     * Brings up a dialog that displays a message using a default
     * icon determined by the <code>messageType</code> parameter.
     *
     * @param parentComponent determines the <code>Frame</code>
     *          in which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @param title     the title string for the dialog
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static void showMessageDialog(Component parentComponent,
        Object message) throws HeadlessException {

    /**
     * Brings up an information-message dialog titled "Message".
     *
     * @param parentComponent determines the <code>Frame</code> in
     *          which the dialog is displayed; if <code>null</code>,
     *          or if the <code>parentComponent</code> has no
     *          <code>Frame</code>, a default <code>Frame</code> is used
     * @param message   the <code>Object</code> to display
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static Object showInputDialog(Component parentComponent,
        Object message, String title, int messageType, Icon icon,
        Object[] selectionValues, Object initialSelectionValue)

    /**
     * Prompts the user for input in a blocking dialog where the
     * initial selection, possible selections, and all other options can
     * be specified. The user will able to choose from
     * <code>selectionValues</code>, where <code>null</code> implies the
     * user can input
     * whatever they wish, usually by means of a <code>JTextField</code>.
     * <code>initialSelectionValue</code> is the initial value to prompt
     * the user with. It is up to the UI to decide how best to represent
     * the <code>selectionValues</code>, but usually a
     * <code>JComboBox</code>, <code>JList</code>, or
     * <code>JTextField</code> will be used.
     *
     * @param parentComponent  the parent <code>Component</code> for the
     *                  dialog
     * @param message  the <code>Object</code> to display
     * @param title    the <code>String</code> to display in the
     *                  dialog title bar
     * @param messageType the type of message to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @param icon     the <code>Icon</code> image to display
     * @param selectionValues an array of <code>Object</code>s that
     *                  gives the possible selections
     * @param initialSelectionValue the value used to initialize the input
     *                 field
     * @return user's input, or <code>null</code> meaning the user
     *                  canceled the input
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static String showInputDialog(Component parentComponent,
        Object message, String title, int messageType)

    /**
     * Shows a dialog requesting input from the user parented to
     * <code>parentComponent</code> with the dialog having the title
     * <code>title</code> and message type <code>messageType</code>.
     *
     * @param parentComponent  the parent <code>Component</code> for the
     *                  dialog
     * @param message  the <code>Object</code> to display
     * @param title    the <code>String</code> to display in the dialog
     *                  title bar
     * @param messageType the type of message that is to be displayed:
     *                  <code>ERROR_MESSAGE</code>,
     *                  <code>INFORMATION_MESSAGE</code>,
     *                  <code>WARNING_MESSAGE</code>,
     *                  <code>QUESTION_MESSAGE</code>,
     *                  or <code>PLAIN_MESSAGE</code>
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static String showInputDialog(Component parentComponent, Object message,
                                         Object initialSelectionValue) {

    /**
     * Shows a question-message dialog requesting input from the user and
     * parented to <code>parentComponent</code>. The input value will be
     * initialized to <code>initialSelectionValue</code>.
     * The dialog is displayed on top of the <code>Component</code>'s
     * frame, and is usually positioned below the <code>Component</code>.
     *
     * @param parentComponent  the parent <code>Component</code> for the
     *          dialog
     * @param message the <code>Object</code> to display
     * @param initialSelectionValue the value used to initialize the input
     *                 field
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static String showInputDialog(Component parentComponent,
        Object message) throws HeadlessException {

    /**
     * Shows a question-message dialog requesting input from the user
     * parented to <code>parentComponent</code>.
     * The dialog is displayed on top of the <code>Component</code>'s
     * frame, and is usually positioned below the <code>Component</code>.
     *
     * @param parentComponent  the parent <code>Component</code> for the
     *          dialog
     * @param message  the <code>Object</code> to display
     * @exception HeadlessException if
     *    <code>GraphicsEnvironment.isHeadless</code> returns
     *    <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static String showInputDialog(Object message, Object initialSelectionValue) {

    /**
     * Shows a question-message dialog requesting input from the user, with
     * the input value initialized to <code>initialSelectionValue</code>. The
     * dialog uses the default frame, which usually means it is centered on
     * the screen.
     *
     * @param message the <code>Object</code> to display
     * @param initialSelectionValue the value used to initialize the input
     *                 field
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static String showInputDialog(Object message)

    /**
     * Shows a question-message dialog requesting input from the user. The
     * dialog uses the default frame, which usually means it is centered on
     * the screen.
     *
     * @param message the <code>Object</code> to display
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected boolean                         wantsInput;

    /** If true, a UI widget will be provided to the user to get input. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected transient Object                initialSelectionValue;

    /** Initial value to select in <code>selectionValues</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected transient Object                inputValue;

    /** Value the user has input. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected transient Object[]              selectionValues;

    /** Array of values the user can choose from. Look and feel will
     * provide the UI component to choose this from. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    transient protected Object                value;

    /** Currently selected value, will be a valid option, or
     * <code>UNINITIALIZED_VALUE</code> or <code>null</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected int                   optionType;

    /**
     * Option type, one of <code>DEFAULT_OPTION</code>,
     * <code>YES_NO_OPTION</code>,
     * <code>YES_NO_CANCEL_OPTION</code> or
     * <code>OK_CANCEL_OPTION</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    protected int                   messageType;

    /** Message type. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    transient protected Object                initialValue;

    /** Value that should be initially selected in <code>options</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    transient protected Object[]              options;

    /** Options to display to the user. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    transient protected Object                message;

    /** Message to display. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    transient protected Icon                  icon;

    /** Icon used in pane. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      WANTS_INPUT_PROPERTY = "wantsInput";

    /** Bound property name for <code>wantsInput</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      INPUT_VALUE_PROPERTY = "inputValue";

    /** Bound property name for <code>inputValue</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      INITIAL_SELECTION_VALUE_PROPERTY = "initialSelectionValue";

    /** Bound property name for <code>initialSelectionValue</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      SELECTION_VALUES_PROPERTY = "selectionValues";

    /** Bound property name for <code>selectionValues</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      OPTION_TYPE_PROPERTY = "optionType";

    /** Bound property name for <code>optionType</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      MESSAGE_TYPE_PROPERTY = "messageType";

    /** Bound property name for <code>type</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      INITIAL_VALUE_PROPERTY = "initialValue";

    /** Bound property name for <code>initialValue</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      OPTIONS_PROPERTY = "options";

    /** Bound property name for <code>option</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      VALUE_PROPERTY = "value";

    /** Bound property name for <code>value</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      MESSAGE_PROPERTY = "message";

    /** Bound property name for <code>message</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final String      ICON_PROPERTY = "icon";

    /** Bound property name for <code>icon</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int   PLAIN_MESSAGE = -1;

    /** No icon is used. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int  QUESTION_MESSAGE = 3;

    /** Used for questions. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int  WARNING_MESSAGE = 2;

    /** Used for warning messages. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int  INFORMATION_MESSAGE = 1;

    /** Used for information messages. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int  ERROR_MESSAGE = 0;

    /** Used for error messages. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         CLOSED_OPTION = -1;

    /** Return value from class method if user closes window without selecting
     * anything, more than likely this should be treated as either a
     * <code>CANCEL_OPTION</code> or <code>NO_OPTION</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         OK_OPTION = 0;

    /** Return value form class method if OK is chosen. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         CANCEL_OPTION = 2;

    /** Return value from class method if CANCEL is chosen. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         NO_OPTION = 1;

    /** Return value from class method if NO is chosen. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         YES_OPTION = 0;

    /** Return value from class method if YES is chosen. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         OK_CANCEL_OPTION = 2;

    /** Type used for <code>showConfirmDialog</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         YES_NO_CANCEL_OPTION = 1;

    /** Type used for <code>showConfirmDialog</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         YES_NO_OPTION = 0;

    /** Type used for <code>showConfirmDialog</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final int         DEFAULT_OPTION = -1;

    /**
     * Type meaning Look and Feel should not supply any options -- only
     * use the options from the <code>JOptionPane</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    public static final Object      UNINITIALIZED_VALUE = "uninitializedValue";

    /**
     * Indicates that the user has not yet selected a value.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
    private static final String uiClassID = "OptionPaneUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JOptionPane.java
public class JOptionPane extends JComponent implements Accessible

/**
 * <code>JOptionPane</code> makes it easy to pop up a standard dialog box that
 * prompts users for a value or informs them of something.
 * For information about using <code>JOptionPane</code>, see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html">How to Make Dialogs</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * <p>
 *
 * While the <code>JOptionPane</code>
 * class may appear complex because of the large number of methods, almost
 * all uses of this class are one-line calls to one of the static
 * <code>showXxxDialog</code> methods shown below:
 * <blockquote>
 *
 *
 * <table border=1 summary="Common JOptionPane method names and their descriptions">
 * <tr>
 *    <th>Method Name</th>
 *    <th>Description</th>
 * </tr>
 * <tr>
 *    <td>showConfirmDialog</td>
 *    <td>Asks a confirming question, like yes/no/cancel.</td>
 * </tr>
 * <tr>
 *    <td>showInputDialog</td>
 *    <td>Prompt for some input.</td>
 * </tr>
 * <tr>
 *   <td>showMessageDialog</td>
 *   <td>Tell the user about something that has happened.</td>
 * </tr>
 * <tr>
 *   <td>showOptionDialog</td>
 *   <td>The Grand Unification of the above three.</td>
 * </tr>
 * </table>
 *
 * </blockquote>
 * Each of these methods also comes in a <code>showInternalXXX</code>
 * flavor, which uses an internal frame to hold the dialog box (see
 * {@link JInternalFrame}).
 * Multiple convenience methods have also been defined -- overloaded
 * versions of the basic methods that use different parameter lists.
 * <p>
 * All dialogs are modal. Each <code>showXxxDialog</code> method blocks
 * the caller until the user's interaction is complete.
 *
 * <table cellspacing=6 cellpadding=4 border=0 style="float:right" summary="layout">
 * <tr>
 *  <td style="background-color:#FFe0d0" rowspan=2>icon</td>
 *  <td style="background-color:#FFe0d0">message</td>
 * </tr>
 * <tr>
 *  <td style="background-color:#FFe0d0">input value</td>
 * </tr>
 * <tr>
 *   <td style="background-color:#FFe0d0" colspan=2>option buttons</td>
 * </tr>
 * </table>
 *
 * The basic appearance of one of these dialog boxes is generally
 * similar to the picture at the right, although the various
 * look-and-feels are
 * ultimately responsible for the final result.  In particular, the
 * look-and-feels will adjust the layout to accommodate the option pane's
 * <code>ComponentOrientation</code> property.
 * <br style="clear:all">
 * <p>
 * <b>Parameters:</b><br>
 * The parameters to these methods follow consistent patterns:
 * <blockquote>
 * <dl compact>
 * <dt>parentComponent<dd>
 * Defines the <code>Component</code> that is to be the parent of this
 * dialog box.
 * It is used in two ways: the <code>Frame</code> that contains
 * it is used as the <code>Frame</code>
 * parent for the dialog box, and its screen coordinates are used in
 * the placement of the dialog box. In general, the dialog box is placed
 * just below the component. This parameter may be <code>null</code>,
 * in which case a default <code>Frame</code> is used as the parent,
 * and the dialog will be
 * centered on the screen (depending on the {@literal L&F}).
 * <dt><a name=message>message</a><dd>
 * A descriptive message to be placed in the dialog box.
 * In the most common usage, message is just a <code>String</code> or
 * <code>String</code> constant.
 * However, the type of this parameter is actually <code>Object</code>. Its
 * interpretation depends on its type:
 * <dl compact>
 * <dt>Object[]<dd>An array of objects is interpreted as a series of
 *                 messages (one per object) arranged in a vertical stack.
 *                 The interpretation is recursive -- each object in the
 *                 array is interpreted according to its type.
 * <dt>Component<dd>The <code>Component</code> is displayed in the dialog.
 * <dt>Icon<dd>The <code>Icon</code> is wrapped in a <code>JLabel</code>
 *               and displayed in the dialog.
 * <dt>others<dd>The object is converted to a <code>String</code> by calling
 *               its <code>toString</code> method. The result is wrapped in a
 *               <code>JLabel</code> and displayed.
 * </dl>
 * <dt>messageType<dd>Defines the style of the message. The Look and Feel
 * manager may lay out the dialog differently depending on this value, and
 * will often provide a default icon. The possible values are:
 * <ul>
 * <li><code>ERROR_MESSAGE</code>
 * <li><code>INFORMATION_MESSAGE</code>
 * <li><code>WARNING_MESSAGE</code>
 * <li><code>QUESTION_MESSAGE</code>
 * <li><code>PLAIN_MESSAGE</code>
 * </ul>
 * <dt>optionType<dd>Defines the set of option buttons that appear at
 * the bottom of the dialog box:
 * <ul>
 * <li><code>DEFAULT_OPTION</code>
 * <li><code>YES_NO_OPTION</code>
 * <li><code>YES_NO_CANCEL_OPTION</code>
 * <li><code>OK_CANCEL_OPTION</code>
 * </ul>
 * You aren't limited to this set of option buttons.  You can provide any
 * buttons you want using the options parameter.
 * <dt>options<dd>A more detailed description of the set of option buttons
 * that will appear at the bottom of the dialog box.
 * The usual value for the options parameter is an array of
 * <code>String</code>s. But
 * the parameter type is an array of <code>Objects</code>.
 * A button is created for each object depending on its type:
 * <dl compact>
 * <dt>Component<dd>The component is added to the button row directly.
 * <dt>Icon<dd>A <code>JButton</code> is created with this as its label.
 * <dt>other<dd>The <code>Object</code> is converted to a string using its
 *              <code>toString</code> method and the result is used to
 *              label a <code>JButton</code>.
 * </dl>
 * <dt>icon<dd>A decorative icon to be placed in the dialog box. A default
 * value for this is determined by the <code>messageType</code> parameter.
 * <dt>title<dd>The title for the dialog box.
 * <dt>initialValue<dd>The default selection (input value).
 * </dl>
 * </blockquote>
 * <p>
 * When the selection is changed, <code>setValue</code> is invoked,
 * which generates a <code>PropertyChangeEvent</code>.
 * <p>
 * If a <code>JOptionPane</code> has configured to all input
 * <code>setWantsInput</code>
 * the bound property <code>JOptionPane.INPUT_VALUE_PROPERTY</code>
 *  can also be listened
 * to, to determine when the user has input or selected a value.
 * <p>
 * When one of the <code>showXxxDialog</code> methods returns an integer,
 * the possible values are:
 * <ul>
 * <li><code>YES_OPTION</code>
 * <li><code>NO_OPTION</code>
 * <li><code>CANCEL_OPTION</code>
 * <li><code>OK_OPTION</code>
 * <li><code>CLOSED_OPTION</code>
 * </ul>
 * <b>Examples:</b>
 * <dl>
 * <dt>Show an error dialog that displays the message, 'alert':
 * <dd><code>
 * JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
 * </code>
 * <dt>Show an internal information dialog with the message, 'information':
 * <dd><pre>
 * JOptionPane.showInternalMessageDialog(frame, "information",
 *             "information", JOptionPane.INFORMATION_MESSAGE);
 * </pre>
 * <dt>Show an information panel with the options yes/no and message 'choose one':
 * <dd><pre>JOptionPane.showConfirmDialog(null,
 *             "choose one", "choose one", JOptionPane.YES_NO_OPTION);
 * </pre>
 * <dt>Show an internal information dialog with the options yes/no/cancel and
 * message 'please choose one' and title information:
 * <dd><pre>JOptionPane.showInternalConfirmDialog(frame,
 *             "please choose one", "information",
 *             JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
 * </pre>
 * <dt>Show a warning dialog with the options OK, CANCEL, title 'Warning', and
 * message 'Click OK to continue':
 * <dd><pre>
 * Object[] options = { "OK", "CANCEL" };
 * JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
 *             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
 *             null, options, options[0]);
 * </pre>
 * <dt>Show a dialog asking the user to type in a String:
 * <dd><code>
 * String inputValue = JOptionPane.showInputDialog("Please input a value");
 * </code>
 * <dt>Show a dialog asking the user to select a String:
 * <dd><pre>
 * Object[] possibleValues = { "First", "Second", "Third" };<br>
 * Object selectedValue = JOptionPane.showInputDialog(null,
 *             "Choose one", "Input",
 *             JOptionPane.INFORMATION_MESSAGE, null,
 *             possibleValues, possibleValues[0]);
 * </pre><p>
 * </dl>
 * <b>Direct Use:</b><br>
 * To create and use an <code>JOptionPane</code> directly, the
 * standard pattern is roughly as follows:
 * <pre>
 *     JOptionPane pane = new JOptionPane(<i>arguments</i>);
 *     pane.set<i>.Xxxx(...); // Configure</i>
 *     JDialog dialog = pane.createDialog(<i>parentComponent, title</i>);
 *     dialog.show();
 *     Object selectedValue = pane.getValue();
 *     if(selectedValue == null)
 *       return CLOSED_OPTION;
 *     <i>//If there is <b>not</b> an array of option buttons:</i>
 *     if(options == null) {
 *       if(selectedValue instanceof Integer)
 *          return ((Integer)selectedValue).intValue();
 *       return CLOSED_OPTION;
 *     }
 *     <i>//If there is an array of option buttons:</i>
 *     for(int counter = 0, maxCounter = options.length;
 *        counter &lt; maxCounter; counter++) {
 *        if(options[counter].equals(selectedValue))
 *        return counter;
 *     }
 *     return CLOSED_OPTION;
 * </pre>
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
 *
 * @beaninfo
 *      attribute: isContainer true
 *    description: A component which implements standard dialog box controls.
 *
 * @author James Gosling
 * @author Scott Violet
 */
