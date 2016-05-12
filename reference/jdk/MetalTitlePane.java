_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private class WindowHandler extends WindowAdapter {

    /**
     * WindowListener installed on the Window, updates the state as necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void updateSystemIcon() {

    /**
     * Update the image used for the system icon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private class PropertyChangeHandler implements PropertyChangeListener {

    /**
     * PropertyChangeListener installed on the Window. Updates the necessary
     * state as the state of the Window changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private class SystemMenuBar extends JMenuBar {

    /**
     * Class responsible for drawing the system menu. Looks up the
     * image to draw from the Frame associated with the
     * <code>JRootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private class MaximizeAction extends AbstractAction {

    /**
     * Actions used to <code>restore</code> the <code>Frame</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private class RestoreAction extends AbstractAction {

    /**
     * Actions used to <code>restore</code> the <code>Frame</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private class IconifyAction extends AbstractAction {

    /**
     * Actions used to <code>iconfiy</code> the <code>Frame</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private class CloseAction extends AbstractAction {

    /**
     * Actions used to <code>close</code> the <code>Window</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    public void paintComponent(Graphics g)  {

    /**
     * Renders the TitlePane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private String getTitle() {

    /**
     * Returns the String to display as the title.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Window getWindow() {

    /**
     * Returns the <code>Window</code> the <code>JRootPane</code> is
     * contained in. This will return null if there is no parent ancestor
     * of the <code>JRootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Frame getFrame() {

    /**
     * Returns the Frame rendering in. This will return null if the
     * <code>JRootPane</code> is not contained in a <code>Frame</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void updateToggleButton(Action action, Icon icon) {

    /**
     * Updates the toggle button to contain the Icon <code>icon</code>, and
     * Action <code>action</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void setState(int state, boolean updateRegardless) {

    /**
     * Sets the state of the window. If <code>updateRegardless</code> is
     * true and the state has not changed, this will update anyway.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void setState(int state) {

    /**
     * Sets the state of the Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void setActive(boolean isActive) {

    /**
     * Updates state dependant upon the Window's active state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private LayoutManager createLayout() {

    /**
     * Returns the <code>LayoutManager</code> that should be installed on
     * the <code>MetalTitlePane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void createButtons() {

    /**
     * Creates the Buttons that will be placed on the TitlePane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private JButton createTitleButton() {

    /**
     * Returns a <code>JButton</code> appropriate for placement on the
     * TitlePane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void addMenuItems(JMenu menu) {

    /**
     * Adds the necessary <code>JMenuItem</code>s to the passed in menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private JMenu createMenu() {

    /**
     * Returns the <code>JMenu</code> displaying the appropriate menu items
     * for manipulating the Frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void createActions() {

    /**
     * Create the <code>Action</code>s that get associated with the
     * buttons and menu items.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void restore() {

    /**
     * Restores the Frame size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void maximize() {

    /**
     * Maximizes the Frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void iconify() {

    /**
     * Iconifies the Frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void close() {

    /**
     * Closes the Window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    protected JMenuBar createMenuBar() {

    /**
     * Returns the <code>JMenuBar</code> displaying the appropriate
     * system menu items.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void uninstallDefaults() {

    /**
     * Uninstalls any previously installed UI values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void installDefaults() {

    /**
     * Installs the fonts and necessary properties on the MetalTitlePane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void determineColors() {

    /**
     * Determines the Colors to draw with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void installSubcomponents() {

    /**
     * Adds any sub-Components contained in the <code>MetalTitlePane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private int getWindowDecorationStyle() {

    /**
     * Returns the decoration style of the <code>JRootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    public JRootPane getRootPane() {

    /**
     * Returns the <code>JRootPane</code> this was created for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private PropertyChangeListener createWindowPropertyChangeListener() {

    /**
     * Returns the <code>PropertyChangeListener</code> to install on
     * the <code>Window</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private WindowListener createWindowListener() {

    /**
     * Returns the <code>WindowListener</code> to add to the
     * <code>Window</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void uninstallListeners() {

    /**
     * Uninstalls the necessary listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void installListeners() {

    /**
     * Installs the necessary listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private void uninstall() {

    /**
     * Uninstalls the necessary state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private MetalRootPaneUI rootPaneUI;

    /**
     * MetalRootPaneUI that created us.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private int state;

    /**
     * Buffered Frame.state property. As state isn't bound, this is kept
     * to determine when to avoid updating widgets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private int buttonsWidth;

    /**
     * Room remaining in title for bumps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private JRootPane rootPane;

    /**
     * JRootPane rendering for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Window window;

    /**
     * Window we're currently in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private WindowListener windowListener;

    /**
     * Listens for changes in the state of the Window listener to update
     * the state of the widgets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Image systemIcon;

    /**
     * Image used for the system menu icon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Icon minimizeIcon;

    /**
     * Icon used for toggleButton when window is maximized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Icon maximizeIcon;

    /**
     * Icon used for toggleButton when window is normal size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private JButton closeButton;

    /**
     * Button used to maximize or restore the Frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private JButton iconifyButton;

    /**
     * Button used to maximize or restore the Frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private JButton toggleButton;

    /**
     * Button used to maximize or restore the Frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Action maximizeAction;

    /**
     * Action to restore the Frame size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Action restoreAction;

    /**
     * Action to restore the Frame size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private Action iconifyAction;

    /**
     * Action used to iconify the Frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private JMenuBar menuBar;

    /**
     * JMenuBar, typically renders the system menu items.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
    private PropertyChangeListener propertyChangeListener;

    /**
     * PropertyChangeListener added to the JRootPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalTitlePane.java
class MetalTitlePane extends JComponent {

/**
 * Class that manages a JLF awt.Window-descendant class's title bar.
 * <p>
 * This class assumes it will be created with a particular window
 * decoration style, and that if the style changes, a new one will
 * be created.
 *
 * @author Terry Kellerman
 * @since 1.4
 */
