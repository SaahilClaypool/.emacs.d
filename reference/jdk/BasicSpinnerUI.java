_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
        private void focusSpinnerIfNecessary() {

        /**
         * Requests focus on a child of the spinner if the spinner doesn't
         * have focus.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
        private int getCalendarField(JSpinner spinner) {

        /**
         * Returns the calendarField under the start of the selection, or
         * -1 if there is no valid calendar field under the selection (or
         * the spinner isn't editing dates.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
        private boolean select(JFormattedTextField ftf,
                               AttributedCharacterIterator iterator,
                               DateFormat.Field field) {

        /**
         * Selects the passed in field, returning true if it is found,
         * false otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
        private void select(JSpinner spinner) {

        /**
         * If the spinner's editor is a DateEditor, this selects the field
         * associated with the value that is being incremented.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private static class ArrowButtonHandler extends AbstractAction

    /**
     * A handler for spinner arrow button mouse and action events.  When
     * a left mouse pressed event occurs we look up the (enabled) spinner
     * that's the source of the event and start the autorepeat timer.  The
     * timer fires action events until any button is released at which
     * point the timer is stopped and the reference to the spinner cleared.
     * The timer doesn't start until after a 300ms delay, so often the
     * source of the initial (and final) action event is just the button
     * logic for mouse released - which means that we're relying on the fact
     * that our mouse listener runs after the buttons mouse listener.
     * <p>
     * Note that one instance of this handler is shared by all slider previous
     * arrow buttons and likewise for all of the next buttons,
     * so it doesn't have any state that persists beyond the limits
     * of a single button pressed/released gesture.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    public Component.BaselineResizeBehavior getBaselineResizeBehavior(
            JComponent c) {

    /**
     * Returns an enum indicating how the baseline of the component
     * changes as the size changes.
     *
     * @throws NullPointerException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    public int getBaseline(JComponent c, int width, int height) {

    /**
     * Returns the baseline.
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private InputMap getInputMap(int condition) {

    /**
     * Returns the InputMap to install for <code>condition</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void installKeyboardActions() {

    /**
     * Installs the keyboard Actions onto the JSpinner.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private void updateEnabledState(Container c, boolean enabled) {

    /**
     * Recursively updates the enabled state of the child
     * <code>Component</code>s of <code>c</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private void updateEnabledState() {

    /**
     * Updates the enabled state of the children Components based on the
     * enabled state of the <code>JSpinner</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private void installEditorBorderListener(JComponent editor) {

    /**
     * Remove the border around the inner editor component for LaFs
     * that install an outside border around the spinner,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private void maybeRemoveEditorBorder(JComponent editor) {

    /**
     * Remove the border around the inner editor component for LaFs
     * that install an outside border around the spinner,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void replaceEditor(JComponent oldEditor, JComponent newEditor) {

    /**
     * Called by the <code>PropertyChangeListener</code> when the
     * <code>JSpinner</code> editor property changes.  It's the responsibility
     * of this method to remove the old editor and add the new one.  By
     * default this operation is just:
     * <pre>
     * spinner.remove(oldEditor);
     * spinner.add(newEditor, "Editor");
     * </pre>
     * The implementation of <code>replaceEditor</code> should be coordinated
     * with the <code>createEditor</code> method.
     *
     * @see #createEditor
     * @see #createPropertyChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected JComponent createEditor() {

    /**
     * This method is called by installUI to get the editor component
     * of the <code>JSpinner</code>.  By default it just returns
     * <code>JSpinner.getEditor()</code>.  Subclasses can override
     * <code>createEditor</code> to return a component that contains
     * the spinner's editor or null, if they're going to handle adding
     * the editor to the <code>JSpinner</code> in an
     * <code>installUI</code> override.
     * <p>
     * Typically this method would be overridden to wrap the editor
     * with a container with a custom border, since one can't assume
     * that the editors border can be set directly.
     * <p>
     * The <code>replaceEditor</code> method is called when the spinners
     * editor is changed with <code>JSpinner.setEditor</code>.  If you've
     * overriden this method, then you'll probably want to override
     * <code>replaceEditor</code> as well.
     *
     * @return the JSpinners editor JComponent, spinner.getEditor() by default
     * @see #installUI
     * @see #replaceEditor
     * @see JSpinner#getEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected Component createNextButton() {

    /**
     * Creates an increment button, i.e. component that replaces the spinner
     * value with the object returned by <code>spinner.getNextValue</code>.
     * By default the <code>nextButton</code> is a {@code JButton}. If the
     * increment button is not needed this method should return {@code null}.
     *
     * @return a component that will replace the spinner's value with the
     *     next value in the sequence, or {@code null}
     * @see #installUI
     * @see #createPreviousButton
     * @see #installNextButtonListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected Component createPreviousButton() {

    /**
     * Creates a decrement button, i.e. component that replaces the spinner
     * value with the object returned by <code>spinner.getPreviousValue</code>.
     * By default the <code>previousButton</code> is a {@code JButton}. If the
     * decrement button is not needed this method should return {@code null}.
     *
     * @return a component that will replace the spinner's value with the
     *     previous value in the sequence, or {@code null}
     * @see #installUI
     * @see #createNextButton
     * @see #installPreviousButtonListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected PropertyChangeListener createPropertyChangeListener() {

    /**
     * Creates a <code>PropertyChangeListener</code> that can be
     * added to the JSpinner itself.  Typically, this listener
     * will call replaceEditor when the "editor" property changes,
     * since it's the <code>SpinnerUI's</code> responsibility to
     * add the editor to the JSpinner (and remove the old one).
     * This method is called by <code>installListeners</code>.
     *
     * @return A PropertyChangeListener for the JSpinner itself
     * @see #installListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected LayoutManager createLayout() {

    /**
     * Creates a <code>LayoutManager</code> that manages the <code>editor</code>,
     * <code>nextButton</code>, and <code>previousButton</code>
     * children of the JSpinner.  These three children must be
     * added with a constraint that identifies their role:
     * "Editor", "Next", and "Previous". The default layout manager
     * can handle the absence of any of these children.
     *
     * @return a LayoutManager for the editor, next button, and previous button.
     * @see #createNextButton
     * @see #createPreviousButton
     * @see #createEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void installPreviousButtonListeners(Component c) {

    /**
     * Installs the necessary listeners on the previous button, <code>c</code>,
     * to update the <code>JSpinner</code> in response to a user gesture.
     *
     * @param c Component to install the listeners on.
     * @throws NullPointerException if <code>c</code> is null.
     * @see #createPreviousButton
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void installNextButtonListeners(Component c) {

    /**
     * Installs the necessary listeners on the next button, <code>c</code>,
     * to update the <code>JSpinner</code> in response to a user gesture.
     *
     * @param c Component to install the listeners on
     * @throws NullPointerException if <code>c</code> is null.
     * @see #createNextButton
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void uninstallDefaults() {

    /**
     * Sets the <code>JSpinner's</code> layout manager to null.  This
     * method is called by <code>uninstallUI</code>.
     *
     * @see #installDefaults
     * @see #uninstallUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void installDefaults() {

    /**
     * Initialize the <code>JSpinner</code> <code>border</code>,
     * <code>foreground</code>, and <code>background</code>, properties
     * based on the corresponding "Spinner.*" properties from defaults table.
     * The <code>JSpinners</code> layout is set to the value returned by
     * <code>createLayout</code>.  This method is called by <code>installUI</code>.
     *
     * @see #uninstallDefaults
     * @see #installUI
     * @see #createLayout
     * @see LookAndFeel#installBorder
     * @see LookAndFeel#installColors
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void uninstallListeners() {

    /**
     * Removes the <code>PropertyChangeListener</code> added
     * by installListeners.
     * <p>
     * This method is called by <code>uninstallUI</code>.
     *
     * @see #installListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected void installListeners() {

    /**
     * Initializes <code>PropertyChangeListener</code> with
     * a shared object that delegates interesting PropertyChangeEvents
     * to protected methods.
     * <p>
     * This method is called by <code>installUI</code>.
     *
     * @see #replaceEditor
     * @see #uninstallListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    public void uninstallUI(JComponent c) {

    /**
     * Calls <code>uninstallDefaults</code>, <code>uninstallListeners</code>,
     * and then removes all of the spinners children.
     *
     * @param c the JSpinner (not used)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    public void installUI(JComponent c) {

    /**
     * Calls <code>installDefaults</code>, <code>installListeners</code>,
     * and then adds the components returned by <code>createNextButton</code>,
     * <code>createPreviousButton</code>, and <code>createEditor</code>.
     *
     * @param c the JSpinner
     * @see #installDefaults
     * @see #installListeners
     * @see #createNextButton
     * @see #createPreviousButton
     * @see #createEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Returns a new instance of BasicSpinnerUI.  SpinnerListUI
     * delegates are allocated one per JSpinner.
     *
     * @param c the JSpinner (not used)
     * @see ComponentUI#createUI
     * @return a new BasicSpinnerUI object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private static final Dimension zeroSize = new Dimension(0, 0);

    /**
     * Used by the default LayoutManager class - SpinnerLayout for
     * missing (null) editor/nextButton/previousButton children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    private static final ArrowButtonHandler nextButtonHandler = new ArrowButtonHandler("increment", true);

    /**
     * The mouse/action listeners that are added to the spinner's
     * arrow buttons.  These listeners are shared by all
     * spinner arrow buttons.
     *
     * @see #createNextButton
     * @see #createPreviousButton
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
    protected JSpinner spinner;

    /**
     * The spinner that we're a UI delegate for.  Initialized by
     * the <code>installUI</code> method, and reset to null
     * by <code>uninstallUI</code>.
     *
     * @see #installUI
     * @see #uninstallUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSpinnerUI.java
public class BasicSpinnerUI extends SpinnerUI

/**
 * The default Spinner UI delegate.
 *
 * @author Hans Muller
 * @since 1.4
 */
