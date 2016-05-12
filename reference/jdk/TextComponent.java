_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getBeforeIndex(int part, int index) {

        /**
         * Returns the String before a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         *   or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence, null for an invalid index
         *  or part
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getAfterIndex(int part, int index) {

        /**
         * Returns the String after a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         * or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence, null for an invalid
         *  index or part
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        private int findWordLimit(int index, BreakIterator words, boolean direction,
                                         String s) {

        /**
         * Needed to unify forward and backward searching.
         * The method assumes that s is the text assigned to words.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getAtIndex(int part, int index) {

        /**
         * Returns the String at a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         * or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence,
         *   null for an invalid index or part
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getSelectedText() {

        /**
         * Returns the portion of the text that is selected.
         *
         * @return the text, null if no selection
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getSelectionEnd() {

        /**
         * Returns the end offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         * Return 0 if the text is empty, or the caret position
         * if no selection.
         *
         * @return the index into the text of the end of the selection &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getSelectionStart() {

        /**
         * Returns the start offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         * Return 0 if the text is empty, or the caret position
         * if no selection.
         *
         * @return the index into the text of the start of the selection &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AttributeSet getCharacterAttribute(int i) {

        /**
         * Returns the AttributeSet for a given character (at a given index).
         *
         * @param i the zero-based index into the text
         * @return the AttributeSet of the character
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getCaretPosition() {

        /**
         * Returns the zero-based offset of the caret.
         *
         * Note: The character to the right of the caret will have the
         * same index value as the offset (the caret is between
         * two characters).
         *
         * @return the zero-based offset of the caret.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getCharCount() {

        /**
         * Returns the number of characters (valid indicies)
         *
         * @return the number of characters &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public Rectangle getCharacterBounds(int i) {

        /**
         * Determines the bounding box of the character at the given
         * index into the string.  The bounds are returned in local
         * coordinates.  If the index is invalid a null rectangle
         * is returned.
         *
         * @param i the index into the String &gt;= 0
         * @return the screen coordinates of the character's bounding box
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        /**

        /**
         * Many of these methods are just convenience methods; they
         * just call the equivalent on the parent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleText getAccessibleText() {

        /**
         * Get the AccessibleText associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleText interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object (AccessibleRole.TEXT)
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state set of the TextComponent.
         * The AccessibleStateSet of an object is composed of a set of
         * unique AccessibleStates.  A change in the AccessibleStateSet
         * of an object will cause a PropertyChangeEvent to be fired
         * for the AccessibleContext.ACCESSIBLE_STATE_PROPERTY property.
         *
         * @return an instance of AccessibleStateSet containing the
         * current state set of the object
         * @see AccessibleStateSet
         * @see AccessibleState
         * @see #addPropertyChangeListener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public void textValueChanged(TextEvent textEvent)  {

        /**
         * TextListener notification of a text value change.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleAWTTextComponent() {

        /**
         * Constructs an AccessibleAWTTextComponent.  Adds a listener to track
         * caret change.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected class AccessibleAWTTextComponent extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>TextComponent</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to text component user-interface
     * elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this TextComponent.
     * For text components, the AccessibleContext takes the form of an
     * AccessibleAWTTextComponent.
     * A new AccessibleAWTTextComponent instance is created if necessary.
     *
     * @return an AccessibleAWTTextComponent that serves as the
     *         AccessibleContext of this TextComponent
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private void readObject(ObjectInputStream s)

    /**
     * Read the ObjectInputStream, and if it isn't null,
     * add a listener to receive text events fired by the
     * TextComponent.  Unrecognized keys or values will be
     * ignored.
     *
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @see #removeTextListener
     * @see #addTextListener
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable TextListener(s) as optional data.
     * The non-serializable TextListener(s) are detected and
     * no attempt is made to serialize them.
     *
     * @serialData Null terminated sequence of zero or more pairs.
     *             A pair consists of a String and Object.
     *             The String indicates the type of object and
     *             is one of the following :
     *             textListenerK indicating and TextListener object.
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#textListenerK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private int textComponentSerializedDataVersion = 1;

    /**
     * The textComponent SerializedDataVersion.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private boolean canAccessClipboard() {

    /**
     * Assigns a valid value to the canAccessClipboard instance variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>TextComponent</code>. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return      the parameter string of this text component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected void processTextEvent(TextEvent e) {

    /**
     * Processes text events occurring on this text component by
     * dispatching them to any registered <code>TextListener</code> objects.
     * <p>
     * NOTE: This method will not be called unless text events
     * are enabled for this component. This happens when one of the
     * following occurs:
     * <ul>
     * <li>A <code>TextListener</code> object is registered
     * via <code>addTextListener</code>
     * <li>Text events are enabled via <code>enableEvents</code>
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the text event
     * @see Component#enableEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this text component. If the event is a
     * <code>TextEvent</code>, it invokes the <code>processTextEvent</code>
     * method else it invokes its superclass's <code>processEvent</code>.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>TextComponent</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>TextComponent</code> <code>t</code>
     * for its text listeners with the following code:
     *
     * <pre>TextListener[] tls = (TextListener[])(t.getListeners(TextListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this text component,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getTextListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized TextListener[] getTextListeners() {

    /**
     * Returns an array of all the text listeners
     * registered on this text component.
     *
     * @return all of this text component's <code>TextListener</code>s
     *         or an empty array if no text
     *         listeners are currently registered
     *
     *
     * @see #addTextListener
     * @see #removeTextListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void removeTextListener(TextListener l) {

    /**
     * Removes the specified text event listener so that it no longer
     * receives text events from this text component
     * If <code>l</code> is <code>null</code>, no exception is
     * thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l     the text listener
     * @see             #addTextListener
     * @see             #getTextListeners
     * @see             java.awt.event.TextListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void addTextListener(TextListener l) {

    /**
     * Adds the specified text event listener to receive text events
     * from this text component.
     * If <code>l</code> is <code>null</code>, no exception is
     * thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param l the text event listener
     * @see             #removeTextListener
     * @see             #getTextListeners
     * @see             java.awt.event.TextListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized int getCaretPosition() {

    /**
     * Returns the position of the text insertion caret.
     * The caret position is constrained to be between 0
     * and the last character of the text, inclusive.
     * If the text or caret have not been set, the default
     * caret position is 0.
     *
     * @return       the position of the text insertion caret
     * @see #setCaretPosition(int)
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setCaretPosition(int position) {

    /**
     * Sets the position of the text insertion caret.
     * The caret position is constrained to be between 0
     * and the last character of the text, inclusive.
     * If the passed-in value is greater than this range,
     * the value is set to the last character (or 0 if
     * the <code>TextComponent</code> contains no text)
     * and no error is returned.  If the passed-in value is
     * less than 0, an <code>IllegalArgumentException</code>
     * is thrown.
     *
     * @param        position the position of the text insertion caret
     * @exception    IllegalArgumentException if <code>position</code>
     *               is less than zero
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void selectAll() {

    /**
     * Selects all the text in this text component.
     * @see        java.awt.TextComponent#select
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void select(int selectionStart, int selectionEnd) {

    /**
     * Selects the text between the specified start and end positions.
     * <p>
     * This method sets the start and end positions of the
     * selected text, enforcing the restriction that the start position
     * must be greater than or equal to zero.  The end position must be
     * greater than or equal to the start position, and less than or
     * equal to the length of the text component's text.  The
     * character positions are indexed starting with zero.
     * The length of the selection is
     * <code>endPosition</code> - <code>startPosition</code>, so the
     * character at <code>endPosition</code> is not selected.
     * If the start and end positions of the selected text are equal,
     * all text is deselected.
     * <p>
     * If the caller supplies values that are inconsistent or out of
     * bounds, the method enforces these constraints silently, and
     * without failure. Specifically, if the start position or end
     * position is greater than the length of the text, it is reset to
     * equal the text length. If the start position is less than zero,
     * it is reset to zero, and if the end position is less than the
     * start position, it is reset to the start position.
     *
     * @param        selectionStart the zero-based index of the first
                       character (<code>char</code> value) to be selected
     * @param        selectionEnd the zero-based end position of the
                       text to be selected; the character (<code>char</code> value) at
                       <code>selectionEnd</code> is not selected
     * @see          java.awt.TextComponent#setSelectionStart
     * @see          java.awt.TextComponent#setSelectionEnd
     * @see          java.awt.TextComponent#selectAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setSelectionEnd(int selectionEnd) {

    /**
     * Sets the selection end for this text component to
     * the specified position. The new end point is constrained
     * to be at or after the current selection start. It also
     * cannot be set beyond the end of the component's text.
     * If the caller supplies a value for <code>selectionEnd</code>
     * that is out of bounds, the method enforces these constraints
     * silently, and without failure.
     * @param       selectionEnd   the end position of the
     *                        selected text
     * @see         java.awt.TextComponent#getSelectionEnd
     * @see         java.awt.TextComponent#setSelectionStart
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized int getSelectionEnd() {

    /**
     * Gets the end position of the selected text in
     * this text component.
     * @return      the end position of the selected text
     * @see         java.awt.TextComponent#setSelectionEnd
     * @see         java.awt.TextComponent#getSelectionStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setSelectionStart(int selectionStart) {

    /**
     * Sets the selection start for this text component to
     * the specified position. The new start point is constrained
     * to be at or before the current selection end. It also
     * cannot be set to less than zero, the beginning of the
     * component's text.
     * If the caller supplies a value for <code>selectionStart</code>
     * that is out of bounds, the method enforces these constraints
     * silently, and without failure.
     * @param       selectionStart   the start position of the
     *                        selected text
     * @see         java.awt.TextComponent#getSelectionStart
     * @see         java.awt.TextComponent#setSelectionEnd
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized int getSelectionStart() {

    /**
     * Gets the start position of the selected text in
     * this text component.
     * @return      the start position of the selected text
     * @see         java.awt.TextComponent#setSelectionStart
     * @see         java.awt.TextComponent#getSelectionEnd
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void setBackground(Color c) {

    /**
     * Sets the background color of this text component.
     *
     * @param c The color to become this text component's color.
     *        If this parameter is null then this text component
     *        will inherit the background color of its parent.
     * @see #getBackground()
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public Color getBackground() {

    /**
     * Gets the background color of this text component.
     *
     * By default, non-editable text components have a background color
     * of SystemColor.control.  This default can be overridden by
     * calling setBackground.
     *
     * @return This text component's background color.
     *         If this text component does not have a background color,
     *         the background color of its parent is returned.
     * @see #setBackground(Color)
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setEditable(boolean b) {

    /**
     * Sets the flag that determines whether or not this
     * text component is editable.
     * <p>
     * If the flag is set to <code>true</code>, this text component
     * becomes user editable. If the flag is set to <code>false</code>,
     * the user cannot change the text of this text component.
     * By default, non-editable text components have a background color
     * of SystemColor.control.  This default can be overridden by
     * calling setBackground.
     *
     * @param     b   a flag indicating whether this text component
     *                      is user editable.
     * @see       java.awt.TextComponent#isEditable
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public boolean isEditable() {

    /**
     * Indicates whether or not this text component is editable.
     * @return     <code>true</code> if this text component is
     *                  editable; <code>false</code> otherwise.
     * @see        java.awt.TextComponent#setEditable
     * @since      JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized String getSelectedText() {

    /**
     * Returns the selected text from the text that is
     * presented by this text component.
     * @return      the selected text of this text component
     * @see         java.awt.TextComponent#select
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized String getText() {

    /**
     * Returns the text that is presented by this text component.
     * By default, this is an empty string.
     *
     * @return the value of this <code>TextComponent</code>
     * @see     java.awt.TextComponent#setText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setText(String t) {

    /**
     * Sets the text that is presented by this
     * text component to be the specified text.
     * @param       t   the new text;
     *                  if this parameter is <code>null</code> then
     *                  the text is set to the empty string ""
     * @see         java.awt.TextComponent#getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void removeNotify() {

    /**
     * Removes the <code>TextComponent</code>'s peer.
     * The peer allows us to modify the appearance of the
     * <code>TextComponent</code> without changing its
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void addNotify() {

    /**
     * Makes this Component displayable by connecting it to a
     * native screen resource.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see       java.awt.TextComponent#removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void enableInputMethods(boolean enable) {

    /**
     * Enables or disables input method support for this text component. If input
     * method support is enabled and the text component also processes key events,
     * incoming events are offered to the current input method and will only be
     * processed by the component or dispatched to its listeners if the input method
     * does not consume them. Whether and how input method support for this text
     * component is enabled or disabled by default is implementation dependent.
     *
     * @param enable true to enable, false to disable
     * @see #processKeyEvent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    TextComponent(String text) throws HeadlessException {

    /**
     * Constructs a new text component initialized with the
     * specified text. Sets the value of the cursor to
     * <code>Cursor.TEXT_CURSOR</code>.
     * @param      text       the text to be displayed; if
     *             <code>text</code> is <code>null</code>, the empty
     *             string <code>""</code> will be displayed
     * @exception  HeadlessException if
     *             <code>GraphicsEnvironment.isHeadless</code>
     *             returns true
     * @see        java.awt.GraphicsEnvironment#isHeadless
     * @see        java.awt.Cursor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    int selectionEnd;

    /**
     * The selection refers to the selected text, and the
     * <code>selectionEnd</code>
     * is the end position of the selected text.
     *
     * @serial
     * @see #getSelectionEnd()
     * @see #setSelectionEnd(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    int selectionStart;

    /**
     * The selection refers to the selected text, and the
     * <code>selectionStart</code> is the start position
     * of the selected text.
     *
     * @serial
     * @see #getSelectionStart()
     * @see #setSelectionStart(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    boolean editable = true;

    /**
     * A boolean indicating whether or not this
     * <code>TextComponent</code> is editable.
     * It will be <code>true</code> if the text component
     * is editable and <code>false</code> if not.
     *
     * @serial
     * @see #isEditable()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    String text;

    /**
     * The value of the text.
     * A <code>null</code> value is the same as "".
     *
     * @serial
     * @see #setText(String)
     * @see #getText()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
public class TextComponent extends Component implements Accessible {

/**
 * The <code>TextComponent</code> class is the superclass of
 * any component that allows the editing of some text.
 * <p>
 * A text component embodies a string of text.  The
 * <code>TextComponent</code> class defines a set of methods
 * that determine whether or not this text is editable. If the
 * component is editable, it defines another set of methods
 * that supports a text insertion caret.
 * <p>
 * In addition, the class defines methods that are used
 * to maintain a current <em>selection</em> from the text.
 * The text selection, a substring of the component's text,
 * is the target of editing operations. It is also referred
 * to as the <em>selected text</em>.
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getBeforeIndex(int part, int index) {

        /**
         * Returns the String before a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         *   or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence, null for an invalid index
         *  or part
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getAfterIndex(int part, int index) {

        /**
         * Returns the String after a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         * or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence, null for an invalid
         *  index or part
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        private int findWordLimit(int index, BreakIterator words, boolean direction,
                                         String s) {

        /**
         * Needed to unify forward and backward searching.
         * The method assumes that s is the text assigned to words.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getAtIndex(int part, int index) {

        /**
         * Returns the String at a given index.
         *
         * @param part the AccessibleText.CHARACTER, AccessibleText.WORD,
         * or AccessibleText.SENTENCE to retrieve
         * @param index an index within the text &gt;= 0
         * @return the letter, word, or sentence,
         *   null for an invalid index or part
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public String getSelectedText() {

        /**
         * Returns the portion of the text that is selected.
         *
         * @return the text, null if no selection
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getSelectionEnd() {

        /**
         * Returns the end offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         * Return 0 if the text is empty, or the caret position
         * if no selection.
         *
         * @return the index into the text of the end of the selection &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getSelectionStart() {

        /**
         * Returns the start offset within the selected text.
         * If there is no selection, but there is
         * a caret, the start and end offsets will be the same.
         * Return 0 if the text is empty, or the caret position
         * if no selection.
         *
         * @return the index into the text of the start of the selection &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AttributeSet getCharacterAttribute(int i) {

        /**
         * Returns the AttributeSet for a given character (at a given index).
         *
         * @param i the zero-based index into the text
         * @return the AttributeSet of the character
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getCaretPosition() {

        /**
         * Returns the zero-based offset of the caret.
         *
         * Note: The character to the right of the caret will have the
         * same index value as the offset (the caret is between
         * two characters).
         *
         * @return the zero-based offset of the caret.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public int getCharCount() {

        /**
         * Returns the number of characters (valid indicies)
         *
         * @return the number of characters &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public Rectangle getCharacterBounds(int i) {

        /**
         * Determines the bounding box of the character at the given
         * index into the string.  The bounds are returned in local
         * coordinates.  If the index is invalid a null rectangle
         * is returned.
         *
         * @param i the index into the String &gt;= 0
         * @return the screen coordinates of the character's bounding box
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        /**

        /**
         * Many of these methods are just convenience methods; they
         * just call the equivalent on the parent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleText getAccessibleText() {

        /**
         * Get the AccessibleText associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleText interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object (AccessibleRole.TEXT)
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state set of the TextComponent.
         * The AccessibleStateSet of an object is composed of a set of
         * unique AccessibleStates.  A change in the AccessibleStateSet
         * of an object will cause a PropertyChangeEvent to be fired
         * for the AccessibleContext.ACCESSIBLE_STATE_PROPERTY property.
         *
         * @return an instance of AccessibleStateSet containing the
         * current state set of the object
         * @see AccessibleStateSet
         * @see AccessibleState
         * @see #addPropertyChangeListener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public void textValueChanged(TextEvent textEvent)  {

        /**
         * TextListener notification of a text value change.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
        public AccessibleAWTTextComponent() {

        /**
         * Constructs an AccessibleAWTTextComponent.  Adds a listener to track
         * caret change.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected class AccessibleAWTTextComponent extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>TextComponent</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to text component user-interface
     * elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this TextComponent.
     * For text components, the AccessibleContext takes the form of an
     * AccessibleAWTTextComponent.
     * A new AccessibleAWTTextComponent instance is created if necessary.
     *
     * @return an AccessibleAWTTextComponent that serves as the
     *         AccessibleContext of this TextComponent
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private void readObject(ObjectInputStream s)

    /**
     * Read the ObjectInputStream, and if it isn't null,
     * add a listener to receive text events fired by the
     * TextComponent.  Unrecognized keys or values will be
     * ignored.
     *
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @see #removeTextListener
     * @see #addTextListener
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable TextListener(s) as optional data.
     * The non-serializable TextListener(s) are detected and
     * no attempt is made to serialize them.
     *
     * @serialData Null terminated sequence of zero or more pairs.
     *             A pair consists of a String and Object.
     *             The String indicates the type of object and
     *             is one of the following :
     *             textListenerK indicating and TextListener object.
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#textListenerK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private int textComponentSerializedDataVersion = 1;

    /**
     * The textComponent SerializedDataVersion.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    private boolean canAccessClipboard() {

    /**
     * Assigns a valid value to the canAccessClipboard instance variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>TextComponent</code>. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return      the parameter string of this text component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected void processTextEvent(TextEvent e) {

    /**
     * Processes text events occurring on this text component by
     * dispatching them to any registered <code>TextListener</code> objects.
     * <p>
     * NOTE: This method will not be called unless text events
     * are enabled for this component. This happens when one of the
     * following occurs:
     * <ul>
     * <li>A <code>TextListener</code> object is registered
     * via <code>addTextListener</code>
     * <li>Text events are enabled via <code>enableEvents</code>
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the text event
     * @see Component#enableEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this text component. If the event is a
     * <code>TextEvent</code>, it invokes the <code>processTextEvent</code>
     * method else it invokes its superclass's <code>processEvent</code>.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>TextComponent</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>TextComponent</code> <code>t</code>
     * for its text listeners with the following code:
     *
     * <pre>TextListener[] tls = (TextListener[])(t.getListeners(TextListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this text component,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getTextListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized TextListener[] getTextListeners() {

    /**
     * Returns an array of all the text listeners
     * registered on this text component.
     *
     * @return all of this text component's <code>TextListener</code>s
     *         or an empty array if no text
     *         listeners are currently registered
     *
     *
     * @see #addTextListener
     * @see #removeTextListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void removeTextListener(TextListener l) {

    /**
     * Removes the specified text event listener so that it no longer
     * receives text events from this text component
     * If <code>l</code> is <code>null</code>, no exception is
     * thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l     the text listener
     * @see             #addTextListener
     * @see             #getTextListeners
     * @see             java.awt.event.TextListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void addTextListener(TextListener l) {

    /**
     * Adds the specified text event listener to receive text events
     * from this text component.
     * If <code>l</code> is <code>null</code>, no exception is
     * thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param l the text event listener
     * @see             #removeTextListener
     * @see             #getTextListeners
     * @see             java.awt.event.TextListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized int getCaretPosition() {

    /**
     * Returns the position of the text insertion caret.
     * The caret position is constrained to be between 0
     * and the last character of the text, inclusive.
     * If the text or caret have not been set, the default
     * caret position is 0.
     *
     * @return       the position of the text insertion caret
     * @see #setCaretPosition(int)
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setCaretPosition(int position) {

    /**
     * Sets the position of the text insertion caret.
     * The caret position is constrained to be between 0
     * and the last character of the text, inclusive.
     * If the passed-in value is greater than this range,
     * the value is set to the last character (or 0 if
     * the <code>TextComponent</code> contains no text)
     * and no error is returned.  If the passed-in value is
     * less than 0, an <code>IllegalArgumentException</code>
     * is thrown.
     *
     * @param        position the position of the text insertion caret
     * @exception    IllegalArgumentException if <code>position</code>
     *               is less than zero
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void selectAll() {

    /**
     * Selects all the text in this text component.
     * @see        java.awt.TextComponent#select
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void select(int selectionStart, int selectionEnd) {

    /**
     * Selects the text between the specified start and end positions.
     * <p>
     * This method sets the start and end positions of the
     * selected text, enforcing the restriction that the start position
     * must be greater than or equal to zero.  The end position must be
     * greater than or equal to the start position, and less than or
     * equal to the length of the text component's text.  The
     * character positions are indexed starting with zero.
     * The length of the selection is
     * <code>endPosition</code> - <code>startPosition</code>, so the
     * character at <code>endPosition</code> is not selected.
     * If the start and end positions of the selected text are equal,
     * all text is deselected.
     * <p>
     * If the caller supplies values that are inconsistent or out of
     * bounds, the method enforces these constraints silently, and
     * without failure. Specifically, if the start position or end
     * position is greater than the length of the text, it is reset to
     * equal the text length. If the start position is less than zero,
     * it is reset to zero, and if the end position is less than the
     * start position, it is reset to the start position.
     *
     * @param        selectionStart the zero-based index of the first
                       character (<code>char</code> value) to be selected
     * @param        selectionEnd the zero-based end position of the
                       text to be selected; the character (<code>char</code> value) at
                       <code>selectionEnd</code> is not selected
     * @see          java.awt.TextComponent#setSelectionStart
     * @see          java.awt.TextComponent#setSelectionEnd
     * @see          java.awt.TextComponent#selectAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setSelectionEnd(int selectionEnd) {

    /**
     * Sets the selection end for this text component to
     * the specified position. The new end point is constrained
     * to be at or after the current selection start. It also
     * cannot be set beyond the end of the component's text.
     * If the caller supplies a value for <code>selectionEnd</code>
     * that is out of bounds, the method enforces these constraints
     * silently, and without failure.
     * @param       selectionEnd   the end position of the
     *                        selected text
     * @see         java.awt.TextComponent#getSelectionEnd
     * @see         java.awt.TextComponent#setSelectionStart
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized int getSelectionEnd() {

    /**
     * Gets the end position of the selected text in
     * this text component.
     * @return      the end position of the selected text
     * @see         java.awt.TextComponent#setSelectionEnd
     * @see         java.awt.TextComponent#getSelectionStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setSelectionStart(int selectionStart) {

    /**
     * Sets the selection start for this text component to
     * the specified position. The new start point is constrained
     * to be at or before the current selection end. It also
     * cannot be set to less than zero, the beginning of the
     * component's text.
     * If the caller supplies a value for <code>selectionStart</code>
     * that is out of bounds, the method enforces these constraints
     * silently, and without failure.
     * @param       selectionStart   the start position of the
     *                        selected text
     * @see         java.awt.TextComponent#getSelectionStart
     * @see         java.awt.TextComponent#setSelectionEnd
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized int getSelectionStart() {

    /**
     * Gets the start position of the selected text in
     * this text component.
     * @return      the start position of the selected text
     * @see         java.awt.TextComponent#setSelectionStart
     * @see         java.awt.TextComponent#getSelectionEnd
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void setBackground(Color c) {

    /**
     * Sets the background color of this text component.
     *
     * @param c The color to become this text component's color.
     *        If this parameter is null then this text component
     *        will inherit the background color of its parent.
     * @see #getBackground()
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public Color getBackground() {

    /**
     * Gets the background color of this text component.
     *
     * By default, non-editable text components have a background color
     * of SystemColor.control.  This default can be overridden by
     * calling setBackground.
     *
     * @return This text component's background color.
     *         If this text component does not have a background color,
     *         the background color of its parent is returned.
     * @see #setBackground(Color)
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setEditable(boolean b) {

    /**
     * Sets the flag that determines whether or not this
     * text component is editable.
     * <p>
     * If the flag is set to <code>true</code>, this text component
     * becomes user editable. If the flag is set to <code>false</code>,
     * the user cannot change the text of this text component.
     * By default, non-editable text components have a background color
     * of SystemColor.control.  This default can be overridden by
     * calling setBackground.
     *
     * @param     b   a flag indicating whether this text component
     *                      is user editable.
     * @see       java.awt.TextComponent#isEditable
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public boolean isEditable() {

    /**
     * Indicates whether or not this text component is editable.
     * @return     <code>true</code> if this text component is
     *                  editable; <code>false</code> otherwise.
     * @see        java.awt.TextComponent#setEditable
     * @since      JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized String getSelectedText() {

    /**
     * Returns the selected text from the text that is
     * presented by this text component.
     * @return      the selected text of this text component
     * @see         java.awt.TextComponent#select
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized String getText() {

    /**
     * Returns the text that is presented by this text component.
     * By default, this is an empty string.
     *
     * @return the value of this <code>TextComponent</code>
     * @see     java.awt.TextComponent#setText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public synchronized void setText(String t) {

    /**
     * Sets the text that is presented by this
     * text component to be the specified text.
     * @param       t   the new text;
     *                  if this parameter is <code>null</code> then
     *                  the text is set to the empty string ""
     * @see         java.awt.TextComponent#getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void removeNotify() {

    /**
     * Removes the <code>TextComponent</code>'s peer.
     * The peer allows us to modify the appearance of the
     * <code>TextComponent</code> without changing its
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void addNotify() {

    /**
     * Makes this Component displayable by connecting it to a
     * native screen resource.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see       java.awt.TextComponent#removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    public void enableInputMethods(boolean enable) {

    /**
     * Enables or disables input method support for this text component. If input
     * method support is enabled and the text component also processes key events,
     * incoming events are offered to the current input method and will only be
     * processed by the component or dispatched to its listeners if the input method
     * does not consume them. Whether and how input method support for this text
     * component is enabled or disabled by default is implementation dependent.
     *
     * @param enable true to enable, false to disable
     * @see #processKeyEvent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    TextComponent(String text) throws HeadlessException {

    /**
     * Constructs a new text component initialized with the
     * specified text. Sets the value of the cursor to
     * <code>Cursor.TEXT_CURSOR</code>.
     * @param      text       the text to be displayed; if
     *             <code>text</code> is <code>null</code>, the empty
     *             string <code>""</code> will be displayed
     * @exception  HeadlessException if
     *             <code>GraphicsEnvironment.isHeadless</code>
     *             returns true
     * @see        java.awt.GraphicsEnvironment#isHeadless
     * @see        java.awt.Cursor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    int selectionEnd;

    /**
     * The selection refers to the selected text, and the
     * <code>selectionEnd</code>
     * is the end position of the selected text.
     *
     * @serial
     * @see #getSelectionEnd()
     * @see #setSelectionEnd(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    int selectionStart;

    /**
     * The selection refers to the selected text, and the
     * <code>selectionStart</code> is the start position
     * of the selected text.
     *
     * @serial
     * @see #getSelectionStart()
     * @see #setSelectionStart(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    boolean editable = true;

    /**
     * A boolean indicating whether or not this
     * <code>TextComponent</code> is editable.
     * It will be <code>true</code> if the text component
     * is editable and <code>false</code> if not.
     *
     * @serial
     * @see #isEditable()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
    String text;

    /**
     * The value of the text.
     * A <code>null</code> value is the same as "".
     *
     * @serial
     * @see #setText(String)
     * @see #getText()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/TextComponent.java
public class TextComponent extends Component implements Accessible {

/**
 * The <code>TextComponent</code> class is the superclass of
 * any component that allows the editing of some text.
 * <p>
 * A text component embodies a string of text.  The
 * <code>TextComponent</code> class defines a set of methods
 * that determine whether or not this text is editable. If the
 * component is editable, it defines another set of methods
 * that supports a text insertion caret.
 * <p>
 * In addition, the class defines methods that are used
 * to maintain a current <em>selection</em> from the text.
 * The text selection, a substring of the component's text,
 * is the target of editing operations. It is also referred
 * to as the <em>selected text</em>.
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
