_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    @Override

    /**
     * Returns the name of the Region.
     *
     * @return name of the Region.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    String getLowerCaseName() {

    /**
     * Returns the name, in lowercase.
     *
     * @return lower case representation of the name of the Region
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public String getName() {

    /**
     * Returns the name of the region.
     *
     * @return name of the Region.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public boolean isSubregion() {

    /**
     * Returns true if the Region is a subregion of a Component, otherwise
     * false. For example, <code>Region.BUTTON</code> corresponds do a
     * <code>Component</code> so that <code>Region.BUTTON.isSubregion()</code>
     * returns false.
     *
     * @return true if the Region is a subregion of a Component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    protected Region(String name, String ui, boolean subregion) {

    /**
     * Creates a Region with the specified name. This should only be
     * used if you are creating your own <code>JComponent</code> subclass
     * with a custom <code>ComponentUI</code> class.
     *
     * @param name Name of the region
     * @param ui String that will be returned from
     *           <code>component.getUIClassID</code>. This will be null
     *           if this is a subregion.
     * @param subregion Whether or not this is a subregion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region VIEWPORT = new Region("Viewport", false);

    /**
     * Viewport region. To bind a style to this <code>Region</code> use
     * the name <code>Viewport</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TREE_CELL = new Region("TreeCell", true);

    /**
     * Region of the Tree for one cell. To bind a style to this
     * <code>Region</code> use the name <code>TreeCell</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TREE = new Region("Tree", false);

    /**
     * Tree region. To bind a style to this <code>Region</code> use the name
     * <code>Tree</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TOOL_BAR_SEPARATOR = new Region("ToolBarSeparator", false);

    /**
     * ToolBar separator region. To bind a style to this <code>Region</code> use
     * the name <code>ToolBarSeparator</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TOOL_TIP = new Region("ToolTip", false);

    /**
     * ToolTip region. To bind a style to this <code>Region</code> use
     * the name <code>ToolTip</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TOOL_BAR_DRAG_WINDOW = new Region("ToolBarDragWindow", false);

    /**
     * Region for the Window containing the ToolBar. To bind a style to this
     * <code>Region</code> use the name <code>ToolBarDragWindow</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TOOL_BAR_CONTENT = new Region("ToolBarContent", true);

    /**
     * Region of the ToolBar containing the content. To bind a style to this
     * <code>Region</code> use the name <code>ToolBarContent</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TOOL_BAR = new Region("ToolBar", false);

    /**
     * ToolBar region. To bind a style to this <code>Region</code> use
     * the name <code>ToolBar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TOGGLE_BUTTON = new Region("ToggleButton", false);

    /**
     * ToggleButton region. To bind a style to this <code>Region</code> use
     * the name <code>ToggleButton</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TEXT_PANE = new Region("TextPane", false);

    /**
     * TextPane region. To bind a style to this <code>Region</code> use
     * the name <code>TextPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TEXT_FIELD = new Region("TextField", false);

    /**
     * TextField region. To bind a style to this <code>Region</code> use
     * the name <code>TextField</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TEXT_AREA = new Region("TextArea", false);

    /**
     * TextArea region. To bind a style to this <code>Region</code> use
     * the name <code>TextArea</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TABLE_HEADER = new Region("TableHeader", false);

    /**
     * TableHeader region. To bind a style to this <code>Region</code> use
     * the name <code>TableHeader</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TABLE = new Region("Table", false);

    /**
     * Table region. To bind a style to this <code>Region</code> use
     * the name <code>Table</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TABBED_PANE_CONTENT = new Region("TabbedPaneContent", true);

    /**
     * Region of a TabbedPane containing the content. To bind a style to this
     * <code>Region</code> use the name <code>TabbedPaneContent</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TABBED_PANE_TAB_AREA = new Region("TabbedPaneTabArea", true);

    /**
     * Region of a TabbedPane containing the tabs. To bind a style to this
     * <code>Region</code> use the name <code>TabbedPaneTabArea</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TABBED_PANE_TAB = new Region("TabbedPaneTab", true);

    /**
     * Region of a TabbedPane for one tab. To bind a style to this
     * <code>Region</code> use the name <code>TabbedPaneTab</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region TABBED_PANE = new Region("TabbedPane", false);

    /**
     * TabbedPane region. To bind a style to this <code>Region</code> use
     * the name <code>TabbedPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SPLIT_PANE_DIVIDER = new Region("SplitPaneDivider", true);

    /**
     * Divider of the SplitPane. To bind a style to this <code>Region</code>
     * use the name <code>SplitPaneDivider</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SPLIT_PANE = new Region("SplitPane", false);

    /**
     * SplitPane region. To bind a style to this <code>Region</code> use the name
     * <code>SplitPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SPINNER = new Region("Spinner", false);

    /**
     * Spinner region. To bind a style to this <code>Region</code> use the name
     * <code>Spinner</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SLIDER_THUMB = new Region("SliderThumb", true);

    /**
     * Thumb of the Slider. The thumb of the Slider identifies the current
     * value. To bind a style to this <code>Region</code> use the name
     * <code>SliderThumb</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SLIDER_TRACK = new Region("SliderTrack", true);

    /**
     * Track of the Slider. To bind a style to this <code>Region</code> use
     * the name <code>SliderTrack</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SLIDER = new Region("Slider", false);

    /**
     * Slider region. To bind a style to this <code>Region</code> use
     * the name <code>Slider</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SEPARATOR = new Region("Separator", false);

    /**
     * Separator region. To bind a style to this <code>Region</code> use
     * the name <code>Separator</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SCROLL_PANE = new Region("ScrollPane", false);

    /**
     * ScrollPane region. To bind a style to this <code>Region</code> use
     * the name <code>ScrollPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SCROLL_BAR_THUMB = new Region("ScrollBarThumb", true);

    /**
     * Thumb of the ScrollBar. The thumb is the region of the ScrollBar
     * that gives a graphical depiction of what percentage of the View is
     * currently visible. To bind a style to this <code>Region</code> use
     * the name <code>ScrollBarThumb</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SCROLL_BAR_TRACK = new Region("ScrollBarTrack", true);

    /**
     * Track of the ScrollBar. To bind a style to this <code>Region</code> use
     * the name <code>ScrollBarTrack</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region SCROLL_BAR = new Region("ScrollBar", false);

    /**
     * ScrollBar region. To bind a style to this <code>Region</code> use
     * the name <code>ScrollBar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region ROOT_PANE = new Region("RootPane", false);

    /**
     * RootPane region. To bind a style to this <code>Region</code> use
     * the name <code>RootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region RADIO_BUTTON_MENU_ITEM = new Region("RadioButtonMenuItem", false);

    /**
     * RegionButtonMenuItem region. To bind a style to this <code>Region</code>
     * use the name <code>RadioButtonMenuItem</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region RADIO_BUTTON = new Region("RadioButton", false);

    /**
     * RadioButton region. To bind a style to this <code>Region</code>
     * use the name <code>RadioButton</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region PROGRESS_BAR = new Region("ProgressBar", false);

    /**
     * ProgressBar region. To bind a style to this <code>Region</code>
     * use the name <code>ProgressBar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region POPUP_MENU_SEPARATOR = new Region("PopupMenuSeparator", false);

    /**
     * PopupMenuSeparator region. To bind a style to this <code>Region</code>
     * use the name <code>PopupMenuSeparator</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region POPUP_MENU = new Region("PopupMenu", false);

    /**
     * PopupMenu region. To bind a style to this <code>Region</code> use
     * the name <code>PopupMenu</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region PASSWORD_FIELD = new Region("PasswordField", false);

    /**
     * PasswordField region. To bind a style to this <code>Region</code> use
     * the name <code>PasswordField</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region PANEL = new Region("Panel", false);

    /**
     * Panel region. To bind a style to this <code>Region</code> use the name
     * <code>Panel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region OPTION_PANE = new Region("OptionPane", false);

    /**
     * OptionPane region. To bind a style to this <code>Region</code> use
     * the name <code>OptionPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region MENU_ITEM_ACCELERATOR = new Region("MenuItemAccelerator", true);

    /**
     * Accelerator region of a MenuItem. To bind a style to this
     * <code>Region</code> use the name <code>MenuItemAccelerator</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region MENU_ITEM = new Region("MenuItem", false);

    /**
     * MenuItem region. To bind a style to this <code>Region</code> use the name
     * <code>MenuItem</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region MENU_BAR = new Region("MenuBar", false);

    /**
     * MenuBar region. To bind a style to this <code>Region</code> use the name
     * <code>MenuBar</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region MENU = new Region("Menu", false);

    /**
     * Menu region. To bind a style to this <code>Region</code> use the name
     * <code>Menu</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region LIST = new Region("List", false);

    /**
     * List region. To bind a style to this <code>Region</code> use the name
     * <code>List</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region LABEL = new Region("Label", false);

    /**
     * Label region. To bind a style to this <code>Region</code> use the name
     * <code>Label</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region INTERNAL_FRAME_TITLE_PANE = new Region("InternalFrameTitlePane", false);

    /**
     * TitlePane of an InternalFrame. The TitlePane typically
     * shows a menu, title, widgets to manipulate the internal frame.
     * To bind a style to this <code>Region</code> use the name
     * <code>InternalFrameTitlePane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region INTERNAL_FRAME = new Region("InternalFrame", false);

    /**
     * InternalFrame region. To bind a style to this <code>Region</code> use
     * the name <code>InternalFrame</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region FORMATTED_TEXT_FIELD = new Region("FormattedTextField", false);

    /**
     * FormattedTextField region. To bind a style to this <code>Region</code> use
     * the name <code>FormattedTextField</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region FILE_CHOOSER = new Region("FileChooser", false);

    /**
     * FileChooser region. To bind a style to this <code>Region</code> use
     * the name <code>FileChooser</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region EDITOR_PANE = new Region("EditorPane", false);

    /**
     * EditorPane region. To bind a style to this <code>Region</code> use
     * the name <code>EditorPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region DESKTOP_ICON = new Region("DesktopIcon", false);

    /**
     * DesktopIcon region. To bind a style to this <code>Region</code> use
     * the name <code>DesktopIcon</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region DESKTOP_PANE = new Region("DesktopPane", false);

    /**
     * DesktopPane region. To bind a style to this <code>Region</code> use
     * the name <code>DesktopPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region COMBO_BOX = new Region("ComboBox", false);

    /**
     * ComboBox region. To bind a style to this <code>Region</code> use
     * the name <code>ComboBox</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region COLOR_CHOOSER = new Region("ColorChooser", false);

    /**
     * ColorChooser region. To bind a style to this <code>Region</code> use
     * the name <code>ColorChooser</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region CHECK_BOX_MENU_ITEM = new Region("CheckBoxMenuItem", false);

    /**
     * CheckBoxMenuItem region. To bind a style to this <code>Region</code> use
     * the name <code>CheckBoxMenuItem</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region CHECK_BOX = new Region("CheckBox", false);

    /**
     * CheckBox region. To bind a style to this <code>Region</code> use the name
     * <code>CheckBox</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region BUTTON = new Region("Button", false);

    /**
     * Button region. To bind a style to this <code>Region</code> use the name
     * <code>Button</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
    public static final Region ARROW_BUTTON = new Region("ArrowButton", false);

    /**
     * ArrowButton's are special types of buttons that also render a
     * directional indicator, typically an arrow. ArrowButtons are used by
     * composite components, for example ScrollBar's contain ArrowButtons.
     * To bind a style to this <code>Region</code> use the name
     * <code>ArrowButton</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/Region.java
public class Region {

/**
 * A distinct rendering area of a Swing component.  A component may
 * support one or more regions.  Specific component regions are defined
 * by the typesafe enumeration in this class.
 * <p>
 * Regions are typically used as a way to identify the <code>Component</code>s
 * and areas a particular style is to apply to. Synth's file format allows you
 * to bind styles based on the name of a <code>Region</code>.
 * The name is derived from the field name of the constant:
 * <ol>
 *  <li>Map all characters to lowercase.
 *  <li>Map the first character to uppercase.
 *  <li>Map the first character after underscores to uppercase.
 *  <li>Remove all underscores.
 * </ol>
 * For example, to identify the <code>SPLIT_PANE</code>
 * <code>Region</code> you would use <code>SplitPane</code>.
 * The following shows a custom <code>SynthStyleFactory</code>
 * that returns a specific style for split panes:
 * <pre>
 *    public SynthStyle getStyle(JComponent c, Region id) {
 *        if (id == Region.SPLIT_PANE) {
 *            return splitPaneStyle;
 *        }
 *        ...
 *    }
 * </pre>
 * The following <a href="doc-files/synthFileFormat.html">xml</a>
 * accomplishes the same thing:
 * <pre>
 * &lt;style id="splitPaneStyle"&gt;
 *   ...
 * &lt;/style&gt;
 * &lt;bind style="splitPaneStyle" type="region" key="SplitPane"/&gt;
 * </pre>
 *
 * @since 1.5
 * @author Scott Violet
 */
