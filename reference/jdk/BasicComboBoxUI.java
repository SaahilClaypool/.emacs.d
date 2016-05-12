_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void uninstallKeyboardActions() {

    /**
     * Removes the focus InputMap and ActionMap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void installKeyboardActions() {

    /**
     * Adds keyboard actions to the JComboBox.  Actions on enter and esc are already
     * supplied.  Add more actions as you need them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected Dimension getSizeForComponent(Component comp) {

    /**
     * Returns the size a component would have if used as a cell renderer.
     *
     * @param comp a {@code Component} to check
     * @return size of the component
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected Dimension getDisplaySize() {

    /**
     * Returns the calculated size of the display area. The display area is the
     * portion of the combo box in which the selected item is displayed. This
     * method will use the prototype display value if it has been set.
     * <p>
     * For combo boxes with a non trivial number of items, it is recommended to
     * use a prototype display value to significantly speed up the display
     * size calculation.
     *
     * @return the size of the display area calculated from the combo box items
     * @see javax.swing.JComboBox#setPrototypeDisplayValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected Dimension getDefaultSize() {

    /**
     * Return the default size of an empty display area of the combo box using
     * the current renderer and font.
     *
     * @return the size of an empty display area
     * @see #getDisplaySize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    void repaintCurrentValue() {

    /**
     * Repaint the currently selected item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public void paintCurrentValueBackground(Graphics g,Rectangle bounds,boolean hasFocus) {

    /**
     * Paints the background of the currently selected item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public void paintCurrentValue(Graphics g,Rectangle bounds,boolean hasFocus) {

    /**
     * Paints the currently selected item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected Insets getInsets() {

    /**
     * Gets the insets from the JComboBox.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected Rectangle rectangleForCurrentValue() {

    /**
     * Returns the area that is reserved for drawing the currently selected item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void toggleOpenClose() {

    /**
     * Hides the popup if it is showing and shows the popup if it is hidden.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void selectPreviousPossibleValue() {

    /**
     * Selects the previous item in the list.  It won't change the selection if the
     * currently selected item is already the first item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void selectNextPossibleValue() {

    /**
     * Selects the next item in the list.  It won't change the selection if the
     * currently selected item is already the last item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected boolean isNavigationKey( int keyCode ) {

    /**
     * Returns whether or not the supplied keyCode maps to a key that is used for
     * navigation.  This is used for optimizing key input by only passing non-
     * navigation keys to the type-ahead mechanism.  Subclasses should override this
     * if they change the navigation keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    @Override

    /**
     * The minimum size is the size of the display area plus insets plus the button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public boolean isFocusTraversable( JComboBox c ) {

    /**
     * Determines if the JComboBox is focus traversable.  If the JComboBox is editable
     * this returns false, otherwise it returns true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public void setPopupVisible( JComboBox c, boolean v ) {

    /**
     * Hides the popup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public boolean isPopupVisible( JComboBox c ) {

    /**
     * Tells if the popup is visible or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected JButton createArrowButton() {

    /**
     * Creates a button which will be used as the control to show or hide
     * the popup portion of the combo box.
     *
     * @return a button which represents the popup control
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public void unconfigureArrowButton() {

    /**
     * This public method is implementation specific and should be private. Do
     * not call or override.
     *
     * @see #createArrowButton
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public void configureArrowButton() {

    /**
     * This public method is implementation specific and should be private. Do
     * not call or override.
     *
     * @see #createArrowButton
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void unconfigureEditor() {

    /**
     * This protected method is implementation specific and should be private.
     * Do not call or override.
     *
     * @see #addEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void configureEditor() {

    /**
     * This protected method is implementation specific and should be private.
     * do not call or override.
     *
     * @see #addEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public void removeEditor() {

    /**
     * This public method is implementation specific and should be private.
     * do not call or override.
     *
     * @see #addEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public void addEditor() {

    /**
     * This public method is implementation specific and should be private.
     * do not call or override. To implement a specific editor create a
     * custom <code>ComboBoxEditor</code>
     *
     * @see #createEditor
     * @see javax.swing.JComboBox#setEditor
     * @see javax.swing.ComboBoxEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void uninstallComponents() {

    /**
     * The aggregate components which comprise the combo box are
     * unregistered and uninitialized. This method is called as part of the
     * UI uninstallation process.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void installComponents() {

    /**
     * Creates and initializes the components which make up the
     * aggregate combo box. This method is called as part of the UI
     * installation process.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public class ComboBoxLayoutManager implements LayoutManager {

    /**
     * This layout manager handles the 'standard' layout of combo boxes.  It puts
     * the arrow button to the right and the editor to the left.  If there is no
     * editor it still keeps the arrow button to the right.
     *
     * This public inner class should be treated as protected.
     * Instantiate it only within subclasses of
     * <code>BasicComboBoxUI</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public class PropertyChangeHandler implements PropertyChangeListener {

    /**
     * This listener watches for bound properties that have changed in the
     * combo box.
     * <p>
     * Subclasses which wish to listen to combo box property changes should
     * call the superclass methods to ensure that the combo box ui correctly
     * handles property changes.
     * <p>
     * This public inner class should be treated as protected.
     * Instantiate it only within subclasses of
     * <code>BasicComboBoxUI</code>.
     *
     * @see #createPropertyChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public class ItemHandler implements ItemListener {

    /**
     * This listener watches for changes to the selection in the
     * combo box.
     * <p>
     * This public inner class should be treated as protected.
     * Instantiate it only within subclasses of
     * <code>BasicComboBoxUI</code>.
     *
     * @see #createItemListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public class ListDataHandler implements ListDataListener {

    /**
     * This listener watches for changes in the
     * <code>ComboBoxModel</code>.
     * <p>
     * This public inner class should be treated as protected.
     * Instantiate it only within subclasses of
     * <code>BasicComboBoxUI</code>.
     *
     * @see #createListDataListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public class FocusHandler implements FocusListener {

    /**
     * This listener hides the popup when the focus is lost.  It also repaints
     * when focus is gained or lost.
     *
     * This public inner class should be treated as protected.
     * Instantiate it only within subclasses of
     * <code>BasicComboBoxUI</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    public class KeyHandler extends KeyAdapter {

    /**
     * This listener checks to see if the key event isn't a navigation key.  If
     * it finds a key event that wasn't a navigation key it dispatches it to
     * JComboBox.selectWithKeyChar() so that it can do type-ahead.
     *
     * This public inner class should be treated as protected.
     * Instantiate it only within subclasses of
     * <code>BasicComboBoxUI</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    private Handler getHandler() {

    /**
     * Returns the shared listener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected ComboBoxEditor createEditor() {

    /**
     * Creates the default editor that will be used in editable combo boxes.
     * A default editor will be used only if an editor has not been
     * explicitly set with <code>setEditor</code>.
     *
     * @return a <code>ComboBoxEditor</code> used for the combo box
     * @see javax.swing.JComboBox#setEditor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected ListCellRenderer createRenderer() {

    /**
     * Creates the default renderer that will be used in a non-editiable combo
     * box. A default renderer will used only if a renderer has not been
     * explicitly set with <code>setRenderer</code>.
     *
     * @return a <code>ListCellRender</code> used for the combo box
     * @see javax.swing.JComboBox#setRenderer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected LayoutManager createLayoutManager() {

    /**
     * Creates a layout manager for managing the components which make up the
     * combo box.
     *
     * @return an instance of a layout manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected PropertyChangeListener createPropertyChangeListener() {

    /**
     * Creates a <code>PropertyChangeListener</code> which will be added to
     * the combo box. If this method returns null then it will not
     * be added to the combo box.
     *
     * @return an instance of a <code>PropertyChangeListener</code> or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected ItemListener createItemListener() {

    /**
     * Creates an <code>ItemListener</code> which will be added to the
     * combo box. If this method returns null then it will not
     * be added to the combo box.
     * <p>
     * Subclasses may override this method to return instances of their own
     * ItemEvent handlers.
     *
     * @return an instance of an <code>ItemListener</code> or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected ListDataListener createListDataListener() {

    /**
     * Creates a list data listener which will be added to the
     * <code>ComboBoxModel</code>. If this method returns null then
     * it will not be added to the combo box model.
     *
     * @return an instance of a <code>ListDataListener</code> or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected FocusListener createFocusListener() {

    /**
     * Creates a <code>FocusListener</code> which will be added to the combo box.
     * If this method returns null then it will not be added to the combo box.
     *
     * @return an instance of a <code>FocusListener</code> or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected KeyListener createKeyListener() {

    /**
     * Creates a <code>KeyListener</code> which will be added to the
     * combo box. If this method returns null then it will not be added
     * to the combo box.
     *
     * @return an instance <code>KeyListener</code> or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected ComboPopup createPopup() {

    /**
     * Creates the popup portion of the combo box.
     *
     * @return an instance of <code>ComboPopup</code>
     * @see ComboPopup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void uninstallListeners() {

    /**
     * Removes the installed listeners from the combo box and its model.
     * The number and types of listeners removed and in this method should be
     * the same that was added in <code>installListeners</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void uninstallDefaults() {

    /**
     * Uninstalls the default colors, default font, default renderer,
     * and default editor from the combo box.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void installListeners() {

    /**
     * Creates and installs listeners for the combo box and its model.
     * This method is called when the UI is installed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected void installDefaults() {

    /**
     * Installs the default colors, default font, default renderer, and default
     * editor into the JComboBox.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    static void loadActionMap(LazyActionMap map) {

    /**
     * Populates ComboBox's actions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected Insets padding;

    /**
     * If specified, these insets act as padding around the cell renderer when
     * laying out and painting the "selected" item in the combo box. These
     * insets add to those specified by the cell renderer.
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected boolean squareButton = true;

    /**
     * Indicates whether or not the combo box button should be square.
     * If square, then the width and height are equal, and are both set to
     * the height of the combo minus appropriate insets.
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    private boolean sameBaseline;

    /**
     * Whether or not all cells have the same baseline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    JComboBox.KeySelectionManager keySelectionManager;

    /**
     * The default key selection manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    private long lastTime = 0L;

    /**
     * This is tricky, this variables is needed for DefaultKeySelectionManager
     * to take into account time factor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    private long timeFactor = 1000L;

    /**
     * The time factor to treate the series of typed alphanumeric key
     * as prefix for first letter navigation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    private Handler handler;

    /**
     * Implements all the Listeners needed by this class, all existing
     * listeners redirect to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected ListDataListener listDataListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Override the listener construction method instead.
     *
     * @see #createListDataListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected ItemListener itemListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Override the listener construction method instead.
     *
     * @see #createItemListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected PropertyChangeListener propertyChangeListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Override the listener construction method instead.
     *
     * @see #createPropertyChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected KeyListener keyListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Override the listener construction method instead.
     *
     * @see #createKeyListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
    protected boolean   hasFocus = false;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicComboBoxUI.java
public class BasicComboBoxUI extends ComboBoxUI {

/**
 * Basic UI implementation for JComboBox.
 * <p>
 * The combo box is a compound component which means that it is an aggregate of
 * many simpler components. This class creates and manages the listeners
 * on the combo box and the combo box model. These listeners update the user
 * interface in response to changes in the properties and state of the combo box.
 * <p>
 * All event handling is handled by listener classes created with the
 * <code>createxxxListener()</code> methods and internal classes.
 * You can change the behavior of this class by overriding the
 * <code>createxxxListener()</code> methods and supplying your own
 * event listeners or subclassing from the ones supplied in this class.
 * <p>
 * For adding specific actions,
 * overide <code>installKeyboardActions</code> to add actions in response to
 * KeyStroke bindings. See the article <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html">How to Use Key Bindings</a>
 *
 * @author Arnaud Weber
 * @author Tom Santos
 * @author Mark Davidson
 */
