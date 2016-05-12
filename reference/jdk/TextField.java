_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state set of this object.
         *
         * @return an instance of AccessibleStateSet describing the states
         * of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected class AccessibleAWTTextField extends AccessibleAWTTextComponent

    /**
     * This class implements accessibility support for the
     * <code>TextField</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to text field user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this TextField.
     * For text fields, the AccessibleContext takes the form of an
     * AccessibleAWTTextField.
     * A new AccessibleAWTTextField instance is created if necessary.
     *
     * @return an AccessibleAWTTextField that serves as the
     *         AccessibleContext of this TextField
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private void readObject(ObjectInputStream s)

    /**
     * Read the ObjectInputStream and if it isn't null,
     * add a listener to receive action events fired by the
     * TextField.  Unrecognized keys or values will be
     * ignored.
     *
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @see #removeActionListener(ActionListener)
     * @see #addActionListener(ActionListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable ActionListener(s) as optional data.
     * The non-serializable ActionListener(s) are detected and
     * no attempt is made to serialize them.
     *
     * @serialData Null terminated sequence of zero or more pairs.
     *             A pair consists of a String and Object.
     *             The String indicates the type of object and
     *             is one of the following :
     *             ActionListenerK indicating and ActionListener object.
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#actionListenerK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private int textFieldSerializedDataVersion = 1;

    /**
     * The textField Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>TextField</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return      the parameter string of this text field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected void processActionEvent(ActionEvent e) {

    /**
     * Processes action events occurring on this text field by
     * dispatching them to any registered
     * <code>ActionListener</code> objects.
     * <p>
     * This method is not called unless action events are
     * enabled for this component. Action events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ActionListener</code> object is registered
     * via <code>addActionListener</code>.
     * <li>Action events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the action event
     * @see         java.awt.event.ActionListener
     * @see         java.awt.TextField#addActionListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this text field. If the event
     * is an instance of <code>ActionEvent</code>,
     * it invokes the <code>processActionEvent</code>
     * method. Otherwise, it invokes <code>processEvent</code>
     * on the superclass.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param      e the event
     * @see        java.awt.event.ActionEvent
     * @see        java.awt.TextField#processActionEvent
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>TextField</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>TextField</code> <code>t</code>
     * for its action listeners with the following code:
     *
     * <pre>ActionListener[] als = (ActionListener[])(t.getListeners(ActionListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this textfield,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getActionListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public synchronized ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this textfield.
     *
     * @return all of this textfield's <code>ActionListener</code>s
     *         or an empty array if no action
     *         listeners are currently registered
     *
     * @see #addActionListener
     * @see #removeActionListener
     * @see java.awt.event.ActionListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public synchronized void removeActionListener(ActionListener l) {

    /**
     * Removes the specified action listener so that it no longer
     * receives action events from this text field.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l the action listener.
     * @see             #addActionListener
     * @see             #getActionListeners
     * @see             java.awt.event.ActionListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public synchronized void addActionListener(ActionListener l) {

    /**
     * Adds the specified action listener to receive
     * action events from this text field.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param      l the action listener.
     * @see        #removeActionListener
     * @see        #getActionListeners
     * @see        java.awt.event.ActionListener
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getMinimumSize() {

    /**
     * Gets the minimum dimensions for this text field.
     * @return     the minimum dimensions for
     *                  displaying this text field.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getMinimumSize(int columns) {

    /**
     * Gets the minimum dimensions for a text field with
     * the specified number of columns.
     * @param    columns   the number of columns in
     *                          this text field.
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getPreferredSize() {

    /**
     * Gets the preferred size of this text field.
     * @return     the preferred dimensions for
     *                         displaying this text field.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getPreferredSize(int columns) {

    /**
     * Gets the preferred size of this text field
     * with the specified number of columns.
     * @param     columns the number of columns
     *                 in this text field.
     * @return    the preferred dimensions for
     *                 displaying this text field.
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void setColumns(int columns) {

    /**
     * Sets the number of columns in this text field. A column is an
     * approximate average character width that is platform-dependent.
     * @param      columns   the number of columns.
     * @see        java.awt.TextField#getColumns
     * @exception  IllegalArgumentException   if the value
     *                 supplied for <code>columns</code>
     *                 is less than <code>0</code>.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public int getColumns() {

    /**
     * Gets the number of columns in this text field. A column is an
     * approximate average character width that is platform-dependent.
     * @return     the number of columns.
     * @see        java.awt.TextField#setColumns
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public boolean echoCharIsSet() {

    /**
     * Indicates whether or not this text field has a
     * character set for echoing.
     * <p>
     * An echo character is useful for text fields where
     * user input should not be echoed to the screen, as in
     * the case of a text field for entering a password.
     * @return     <code>true</code> if this text field has
     *                 a character set for echoing;
     *                 <code>false</code> otherwise.
     * @see        java.awt.TextField#setEchoChar
     * @see        java.awt.TextField#getEchoChar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void setText(String t) {

    /**
     * Sets the text that is presented by this
     * text component to be the specified text.
     * @param       t   the new text.
     * @see         java.awt.TextComponent#getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEchoChar(char)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void setEchoChar(char c) {

    /**
     * Sets the echo character for this text field.
     * <p>
     * An echo character is useful for text fields where
     * user input should not be echoed to the screen, as in
     * the case of a text field for entering a password.
     * Setting <code>echoChar</code> = <code>0</code> allows
     * user input to be echoed to the screen again.
     * <p>
     * A Java platform implementation may support only a limited,
     * non-empty set of echo characters. Attempts to set an
     * unsupported echo character will cause the default echo
     * character to be used instead. Subsequent calls to getEchoChar()
     * will return the echo character originally requested. This might
     * or might not be identical to the echo character actually
     * used by the TextField implementation.
     * @param       c   the echo character for this text field.
     * @see         java.awt.TextField#echoCharIsSet
     * @see         java.awt.TextField#getEchoChar
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public char getEchoChar() {

    /**
     * Gets the character that is to be used for echoing.
     * <p>
     * An echo character is useful for text fields where
     * user input should not be echoed to the screen, as in
     * the case of a text field for entering a password.
     * If <code>echoChar</code> = <code>0</code>, user
     * input is echoed to the screen unchanged.
     * <p>
     * A Java platform implementation may support only a limited,
     * non-empty set of echo characters. This function returns the
     * echo character originally requested via setEchoChar(). The echo
     * character actually used by the TextField implementation might be
     * different.
     * @return      the echo character for this text field.
     * @see         java.awt.TextField#echoCharIsSet
     * @see         java.awt.TextField#setEchoChar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void addNotify() {

    /**
     * Creates the TextField's peer.  The peer allows us to modify the
     * appearance of the TextField without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField(String text, int columns) throws HeadlessException {

    /**
     * Constructs a new text field initialized with the specified text
     * to be displayed, and wide enough to hold the specified
     * number of columns. A column is an approximate average character
     * width that is platform-dependent.
     * @param      text       the text to be displayed. If
     *             <code>text</code> is <code>null</code>, the empty
     *             string <code>""</code> will be displayed.
     * @param      columns     the number of columns.  If
     *             <code>columns</code> is less than <code>0</code>,
     *             <code>columns</code> is set to <code>0</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField(int columns) throws HeadlessException {

    /**
     * Constructs a new empty text field with the specified number
     * of columns.  A column is an approximate average character
     * width that is platform-dependent.
     * @param      columns     the number of columns.  If
     *             <code>columns</code> is less than <code>0</code>,
     *             <code>columns</code> is set to <code>0</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField(String text) throws HeadlessException {

    /**
     * Constructs a new text field initialized with the specified text.
     * @param      text       the text to be displayed. If
     *             <code>text</code> is <code>null</code>, the empty
     *             string <code>""</code> will be displayed.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField() throws HeadlessException {

    /**
     * Constructs a new text field.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method ids
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    char echoChar;

    /**
     * The echo character, which is used when
     * the user wishes to disguise the characters
     * typed into the text field.
     * The disguises are removed if echoChar = <code>0</code>.
     *
     * @serial
     * @see #getEchoChar()
     * @see #setEchoChar(char)
     * @see #echoCharIsSet()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    int columns;

    /**
     * The number of columns in the text field.
     * A column is an approximate average character
     * width that is platform-dependent.
     * Guaranteed to be non-negative.
     *
     * @serial
     * @see #setColumns(int)
     * @see #getColumns()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
public class TextField extends TextComponent {

/**
 * A <code>TextField</code> object is a text component
 * that allows for the editing of a single line of text.
 * <p>
 * For example, the following image depicts a frame with four
 * text fields of varying widths. Two of these text fields
 * display the predefined text <code>"Hello"</code>.
 * <p>
 * <img src="doc-files/TextField-1.gif" alt="The preceding text describes this image."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * Here is the code that produces these four text fields:
 *
 * <hr><blockquote><pre>
 * TextField tf1, tf2, tf3, tf4;
 * // a blank text field
 * tf1 = new TextField();
 * // blank field of 20 columns
 * tf2 = new TextField("", 20);
 * // predefined text displayed
 * tf3 = new TextField("Hello!");
 * // predefined text in 30 columns
 * tf4 = new TextField("Hello", 30);
 * </pre></blockquote><hr>
 * <p>
 * Every time the user types a key in the text field, one or
 * more key events are sent to the text field.  A <code>KeyEvent</code>
 * may be one of three types: keyPressed, keyReleased, or keyTyped.
 * The properties of a key event indicate which of these types
 * it is, as well as additional information about the event,
 * such as what modifiers are applied to the key event and the
 * time at which the event occurred.
 * <p>
 * The key event is passed to every <code>KeyListener</code>
 * or <code>KeyAdapter</code> object which registered to receive such
 * events using the component's <code>addKeyListener</code> method.
 * (<code>KeyAdapter</code> objects implement the
 * <code>KeyListener</code> interface.)
 * <p>
 * It is also possible to fire an <code>ActionEvent</code>.
 * If action events are enabled for the text field, they may
 * be fired by pressing the <code>Return</code> key.
 * <p>
 * The <code>TextField</code> class's <code>processEvent</code>
 * method examines the action event and passes it along to
 * <code>processActionEvent</code>. The latter method redirects the
 * event to any <code>ActionListener</code> objects that have
 * registered to receive action events generated by this
 * text field.
 *
 * @author      Sami Shaio
 * @see         java.awt.event.KeyEvent
 * @see         java.awt.event.KeyAdapter
 * @see         java.awt.event.KeyListener
 * @see         java.awt.event.ActionEvent
 * @see         java.awt.Component#addKeyListener
 * @see         java.awt.TextField#processEvent
 * @see         java.awt.TextField#processActionEvent
 * @see         java.awt.TextField#addActionListener
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state set of this object.
         *
         * @return an instance of AccessibleStateSet describing the states
         * of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected class AccessibleAWTTextField extends AccessibleAWTTextComponent

    /**
     * This class implements accessibility support for the
     * <code>TextField</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to text field user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this TextField.
     * For text fields, the AccessibleContext takes the form of an
     * AccessibleAWTTextField.
     * A new AccessibleAWTTextField instance is created if necessary.
     *
     * @return an AccessibleAWTTextField that serves as the
     *         AccessibleContext of this TextField
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private void readObject(ObjectInputStream s)

    /**
     * Read the ObjectInputStream and if it isn't null,
     * add a listener to receive action events fired by the
     * TextField.  Unrecognized keys or values will be
     * ignored.
     *
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @see #removeActionListener(ActionListener)
     * @see #addActionListener(ActionListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable ActionListener(s) as optional data.
     * The non-serializable ActionListener(s) are detected and
     * no attempt is made to serialize them.
     *
     * @serialData Null terminated sequence of zero or more pairs.
     *             A pair consists of a String and Object.
     *             The String indicates the type of object and
     *             is one of the following :
     *             ActionListenerK indicating and ActionListener object.
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#actionListenerK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private int textFieldSerializedDataVersion = 1;

    /**
     * The textField Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>TextField</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return      the parameter string of this text field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected void processActionEvent(ActionEvent e) {

    /**
     * Processes action events occurring on this text field by
     * dispatching them to any registered
     * <code>ActionListener</code> objects.
     * <p>
     * This method is not called unless action events are
     * enabled for this component. Action events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ActionListener</code> object is registered
     * via <code>addActionListener</code>.
     * <li>Action events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the action event
     * @see         java.awt.event.ActionListener
     * @see         java.awt.TextField#addActionListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this text field. If the event
     * is an instance of <code>ActionEvent</code>,
     * it invokes the <code>processActionEvent</code>
     * method. Otherwise, it invokes <code>processEvent</code>
     * on the superclass.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param      e the event
     * @see        java.awt.event.ActionEvent
     * @see        java.awt.TextField#processActionEvent
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>TextField</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>TextField</code> <code>t</code>
     * for its action listeners with the following code:
     *
     * <pre>ActionListener[] als = (ActionListener[])(t.getListeners(ActionListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this textfield,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getActionListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public synchronized ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this textfield.
     *
     * @return all of this textfield's <code>ActionListener</code>s
     *         or an empty array if no action
     *         listeners are currently registered
     *
     * @see #addActionListener
     * @see #removeActionListener
     * @see java.awt.event.ActionListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public synchronized void removeActionListener(ActionListener l) {

    /**
     * Removes the specified action listener so that it no longer
     * receives action events from this text field.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l the action listener.
     * @see             #addActionListener
     * @see             #getActionListeners
     * @see             java.awt.event.ActionListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public synchronized void addActionListener(ActionListener l) {

    /**
     * Adds the specified action listener to receive
     * action events from this text field.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param      l the action listener.
     * @see        #removeActionListener
     * @see        #getActionListeners
     * @see        java.awt.event.ActionListener
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getMinimumSize() {

    /**
     * Gets the minimum dimensions for this text field.
     * @return     the minimum dimensions for
     *                  displaying this text field.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getMinimumSize(int columns) {

    /**
     * Gets the minimum dimensions for a text field with
     * the specified number of columns.
     * @param    columns   the number of columns in
     *                          this text field.
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getPreferredSize() {

    /**
     * Gets the preferred size of this text field.
     * @return     the preferred dimensions for
     *                         displaying this text field.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public Dimension getPreferredSize(int columns) {

    /**
     * Gets the preferred size of this text field
     * with the specified number of columns.
     * @param     columns the number of columns
     *                 in this text field.
     * @return    the preferred dimensions for
     *                 displaying this text field.
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void setColumns(int columns) {

    /**
     * Sets the number of columns in this text field. A column is an
     * approximate average character width that is platform-dependent.
     * @param      columns   the number of columns.
     * @see        java.awt.TextField#getColumns
     * @exception  IllegalArgumentException   if the value
     *                 supplied for <code>columns</code>
     *                 is less than <code>0</code>.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public int getColumns() {

    /**
     * Gets the number of columns in this text field. A column is an
     * approximate average character width that is platform-dependent.
     * @return     the number of columns.
     * @see        java.awt.TextField#setColumns
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public boolean echoCharIsSet() {

    /**
     * Indicates whether or not this text field has a
     * character set for echoing.
     * <p>
     * An echo character is useful for text fields where
     * user input should not be echoed to the screen, as in
     * the case of a text field for entering a password.
     * @return     <code>true</code> if this text field has
     *                 a character set for echoing;
     *                 <code>false</code> otherwise.
     * @see        java.awt.TextField#setEchoChar
     * @see        java.awt.TextField#getEchoChar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void setText(String t) {

    /**
     * Sets the text that is presented by this
     * text component to be the specified text.
     * @param       t   the new text.
     * @see         java.awt.TextComponent#getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEchoChar(char)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void setEchoChar(char c) {

    /**
     * Sets the echo character for this text field.
     * <p>
     * An echo character is useful for text fields where
     * user input should not be echoed to the screen, as in
     * the case of a text field for entering a password.
     * Setting <code>echoChar</code> = <code>0</code> allows
     * user input to be echoed to the screen again.
     * <p>
     * A Java platform implementation may support only a limited,
     * non-empty set of echo characters. Attempts to set an
     * unsupported echo character will cause the default echo
     * character to be used instead. Subsequent calls to getEchoChar()
     * will return the echo character originally requested. This might
     * or might not be identical to the echo character actually
     * used by the TextField implementation.
     * @param       c   the echo character for this text field.
     * @see         java.awt.TextField#echoCharIsSet
     * @see         java.awt.TextField#getEchoChar
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public char getEchoChar() {

    /**
     * Gets the character that is to be used for echoing.
     * <p>
     * An echo character is useful for text fields where
     * user input should not be echoed to the screen, as in
     * the case of a text field for entering a password.
     * If <code>echoChar</code> = <code>0</code>, user
     * input is echoed to the screen unchanged.
     * <p>
     * A Java platform implementation may support only a limited,
     * non-empty set of echo characters. This function returns the
     * echo character originally requested via setEchoChar(). The echo
     * character actually used by the TextField implementation might be
     * different.
     * @return      the echo character for this text field.
     * @see         java.awt.TextField#echoCharIsSet
     * @see         java.awt.TextField#setEchoChar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public void addNotify() {

    /**
     * Creates the TextField's peer.  The peer allows us to modify the
     * appearance of the TextField without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField(String text, int columns) throws HeadlessException {

    /**
     * Constructs a new text field initialized with the specified text
     * to be displayed, and wide enough to hold the specified
     * number of columns. A column is an approximate average character
     * width that is platform-dependent.
     * @param      text       the text to be displayed. If
     *             <code>text</code> is <code>null</code>, the empty
     *             string <code>""</code> will be displayed.
     * @param      columns     the number of columns.  If
     *             <code>columns</code> is less than <code>0</code>,
     *             <code>columns</code> is set to <code>0</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField(int columns) throws HeadlessException {

    /**
     * Constructs a new empty text field with the specified number
     * of columns.  A column is an approximate average character
     * width that is platform-dependent.
     * @param      columns     the number of columns.  If
     *             <code>columns</code> is less than <code>0</code>,
     *             <code>columns</code> is set to <code>0</code>.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField(String text) throws HeadlessException {

    /**
     * Constructs a new text field initialized with the specified text.
     * @param      text       the text to be displayed. If
     *             <code>text</code> is <code>null</code>, the empty
     *             string <code>""</code> will be displayed.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    public TextField() throws HeadlessException {

    /**
     * Constructs a new text field.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method ids
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    char echoChar;

    /**
     * The echo character, which is used when
     * the user wishes to disguise the characters
     * typed into the text field.
     * The disguises are removed if echoChar = <code>0</code>.
     *
     * @serial
     * @see #getEchoChar()
     * @see #setEchoChar(char)
     * @see #echoCharIsSet()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
    int columns;

    /**
     * The number of columns in the text field.
     * A column is an approximate average character
     * width that is platform-dependent.
     * Guaranteed to be non-negative.
     *
     * @serial
     * @see #setColumns(int)
     * @see #getColumns()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextField.java
public class TextField extends TextComponent {

/**
 * A <code>TextField</code> object is a text component
 * that allows for the editing of a single line of text.
 * <p>
 * For example, the following image depicts a frame with four
 * text fields of varying widths. Two of these text fields
 * display the predefined text <code>"Hello"</code>.
 * <p>
 * <img src="doc-files/TextField-1.gif" alt="The preceding text describes this image."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * Here is the code that produces these four text fields:
 *
 * <hr><blockquote><pre>
 * TextField tf1, tf2, tf3, tf4;
 * // a blank text field
 * tf1 = new TextField();
 * // blank field of 20 columns
 * tf2 = new TextField("", 20);
 * // predefined text displayed
 * tf3 = new TextField("Hello!");
 * // predefined text in 30 columns
 * tf4 = new TextField("Hello", 30);
 * </pre></blockquote><hr>
 * <p>
 * Every time the user types a key in the text field, one or
 * more key events are sent to the text field.  A <code>KeyEvent</code>
 * may be one of three types: keyPressed, keyReleased, or keyTyped.
 * The properties of a key event indicate which of these types
 * it is, as well as additional information about the event,
 * such as what modifiers are applied to the key event and the
 * time at which the event occurred.
 * <p>
 * The key event is passed to every <code>KeyListener</code>
 * or <code>KeyAdapter</code> object which registered to receive such
 * events using the component's <code>addKeyListener</code> method.
 * (<code>KeyAdapter</code> objects implement the
 * <code>KeyListener</code> interface.)
 * <p>
 * It is also possible to fire an <code>ActionEvent</code>.
 * If action events are enabled for the text field, they may
 * be fired by pressing the <code>Return</code> key.
 * <p>
 * The <code>TextField</code> class's <code>processEvent</code>
 * method examines the action event and passes it along to
 * <code>processActionEvent</code>. The latter method redirects the
 * event to any <code>ActionListener</code> objects that have
 * registered to receive action events generated by this
 * text field.
 *
 * @author      Sami Shaio
 * @see         java.awt.event.KeyEvent
 * @see         java.awt.event.KeyAdapter
 * @see         java.awt.event.KeyListener
 * @see         java.awt.event.ActionEvent
 * @see         java.awt.Component#addKeyListener
 * @see         java.awt.TextField#processEvent
 * @see         java.awt.TextField#processActionEvent
 * @see         java.awt.TextField#addActionListener
 * @since       JDK1.0
 */
