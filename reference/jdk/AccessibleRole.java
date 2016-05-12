_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    protected AccessibleRole(String key) {

    /**
     * Creates a new AccessibleRole using the given locale independent key.
     * This should not be a public method.  Instead, it is used to create
     * the constants in this file to make it a strongly typed enumeration.
     * Subclasses of this class should enforce similar policy.
     * <p>
     * The key String should be a locale independent key for the role.
     * It is not intended to be used as the actual String to display
     * to the user.  To get the localized string, use toDisplayString.
     *
     * @param key the locale independent name of the role.
     * @see AccessibleBundle#toDisplayString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    static public final AccessibleRole PROGRESS_MONITOR =

    /**
     * A role indicating the object monitors the progress
     * of some operation.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    static public final AccessibleRole EDITBAR =

    /**
     * A role indicating the object acts as a formula for
     * calculating a value.  An example is a formula in
     * a spreadsheet cell.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole RULER =

    /**
     * A ruler is an object used to measure distance
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole PARAGRAPH =

    /**
     * A text paragraph
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole FOOTER =

    /**
     * A text footer
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole HEADER =

    /**
     * A text header
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole GROUP_BOX

    /**
     * A GROUP_BOX is a simple container that contains a border
     * around it and contains components inside it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole FONT_CHOOSER

    /**
     * A FONT_CHOOSER is a component that lets the user pick various
     * attributes for fonts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole SPIN_BOX

    /**
     * A SPIN_BOX is a simple spinner component and its main use
     * is for simple numbers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole DATE_EDITOR

    /**
     * A DATE_EDITOR is a component that allows users to edit
     * java.util.Date and java.util.Time objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole STATUS_BAR

    /**
     * A STATUS_BAR is an simple component that can contain
     * multiple labels of status information to the user.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole UNKNOWN

    /**
     * The object contains some Accessible information, but its role is
     * not known.
     * @see #AWT_COMPONENT
     * @see #SWING_COMPONENT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole SWING_COMPONENT

    /**
     * A Swing component, but nothing else is known about it.
     * @see #AWT_COMPONENT
     * @see #UNKNOWN
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole AWT_COMPONENT

    /**
     * An AWT component, but nothing else is known about it.
     * @see #SWING_COMPONENT
     * @see #UNKNOWN
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole TOOL_TIP

    /**
     * An object that provides information about another object.  The
     * accessibleDescription property of the tool tip is often displayed
     * to the user in a small "help bubble" when the user causes the
     * mouse to hover over the object associated with the tool tip.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole TOOL_BAR

    /**
     * A bar or palette usually composed of push buttons or toggle buttons.
     * It is often used to provide the most frequently used functions for an
     * application.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole TREE

    /**
     * An object used to present hierarchical information to the user.
     * The individual nodes in the tree can be collapsed and expanded
     * to provide selective disclosure of the tree's contents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole TEXT

    /**
     * An object that presents text to the user.  The text is usually
     * editable by the user as opposed to a label.
     * @see #LABEL
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole TABLE

    /**
     * An object used to present information in terms of rows and columns.
     * An example might include a spreadsheet application.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole SPLIT_PANE

    /**
     * A specialized panel that presents two other panels at the same time.
     * Between the two panels is a divider the user can manipulate to make
     * one panel larger and the other panel smaller.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole SLIDER

    /**
     * An object that allows the user to select from a bounded range.  For
     * example, a slider might be used to select a number between 0 and 100.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole VIEWPORT

    /**
     * An object usually used in a scroll pane.  It represents the portion
     * of the entire data that the user can see.  As the user manipulates
     * the scroll bars, the contents of the viewport can change.
     * @see #SCROLL_PANE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole SCROLL_BAR

    /**
     * An object usually used to allow a user to incrementally view a
     * large amount of data.  Usually used only by a scroll pane.
     * @see #SCROLL_PANE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole SCROLL_PANE

    /**
     * An object that allows a user to incrementally view a large amount
     * of information.  Its children can include scroll bars and a viewport.
     * @see #SCROLL_BAR
     * @see #VIEWPORT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole ROW_HEADER

    /**
     * The header for a row of data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole RADIO_BUTTON

    /**
     * A specialized check box that will cause other radio buttons in the
     * same group to become unchecked when this one is checked.
     * @see #PUSH_BUTTON
     * @see #TOGGLE_BUTTON
     * @see #CHECK_BOX
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole CHECK_BOX

    /**
     * A choice that can be checked or unchecked and provides a
     * separate indicator for the current state.
     * @see #PUSH_BUTTON
     * @see #TOGGLE_BUTTON
     * @see #RADIO_BUTTON
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole TOGGLE_BUTTON

    /**
     * A specialized push button that can be checked or unchecked, but
     * does not provide a separate indicator for the current state.
     * @see #PUSH_BUTTON
     * @see #CHECK_BOX
     * @see #RADIO_BUTTON
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole PUSH_BUTTON

    /**
     * An object the user can manipulate to tell the application to do
     * something.
     * @see #CHECK_BOX
     * @see #TOGGLE_BUTTON
     * @see #RADIO_BUTTON
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole PASSWORD_TEXT

    /**
     * A text object used for passwords, or other places where the
     * text contents is not shown visibly to the user
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole PROGRESS_BAR

    /**
     * An object used to indicate how much of a task has been completed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole PANEL

    /**
     * A generic container that is often used to group objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole PAGE_TAB

    /**
     * An object that is a child of a page tab list.  Its sole child is
     * the panel that is to be presented to the user when the user
     * selects the page tab from the list of tabs in the page tab list.
     * @see #PAGE_TAB_LIST
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole PAGE_TAB_LIST

    /**
     * An object that presents a series of panels (or page tabs), one at a
     * time, through some mechanism provided by the object.  The most common
     * mechanism is a list of tabs at the top of the panel.  The children of
     * a page tab list are all page tabs.
     * @see #PAGE_TAB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole SEPARATOR

    /**
     * An object usually contained in a menu to provide a visual
     * and logical separation of the contents in a menu.  For example,
     * the "File" menu of an application might contain menu items for
     * "Open," "Close," and "Exit," and will place a separator between
     * "Close" and "Exit" menu items.
     * @see #MENU
     * @see #MENU_ITEM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole MENU_ITEM

    /**
     * An object usually contained in a menu that presents an action
     * the user can choose.  For example, the "Cut" menu item in an
     * "Edit" menu would be an action the user can select to cut the
     * selected area of text in a document.
     * @see #MENU_BAR
     * @see #SEPARATOR
     * @see #POPUP_MENU
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole MENU

    /**
     * An object usually found inside a menu bar that contains a list
     * of actions the user can choose from.  A menu can have any object
     * as its children, but most often they are menu items, other menus,
     * or rudimentary objects such as radio buttons, check boxes, or
     * separators.  For example, an application may have an "Edit" menu
     * that contains menu items for "Cut" and "Paste."
     * @see #MENU_BAR
     * @see #MENU_ITEM
     * @see #SEPARATOR
     * @see #RADIO_BUTTON
     * @see #CHECK_BOX
     * @see #POPUP_MENU
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole POPUP_MENU

    /**
     * A temporary window that is usually used to offer the user a
     * list of choices, and then hides when the user selects one of
     * those choices.
     * @see #MENU
     * @see #MENU_ITEM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole MENU_BAR

    /**
     * An object usually drawn at the top of the primary dialog box of
     * an application that contains a list of menus the user can choose
     * from.  For example, a menu bar might contain menus for "File,"
     * "Edit," and "Help."
     * @see #MENU
     * @see #POPUP_MENU
     * @see #LAYERED_PANE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole LIST_ITEM

    /**
     * An object that presents an element in a list.  A list is usually
     * contained within a scroll pane.
     * @see #SCROLL_PANE
     * @see #LIST
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole LIST

    /**
     * An object that presents a list of objects to the user and allows the
     * user to select one or more of them.  A list is usually contained
     * within a scroll pane.
     * @see #SCROLL_PANE
     * @see #LIST_ITEM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole LAYERED_PANE

    /**
     * A specialized pane that allows its children to be drawn in layers,
     * providing a form of stacking order.  This is usually the pane that
     * holds the menu bar as well as the pane that contains most of the
     * visual components in a window.
     * @see #GLASS_PANE
     * @see #ROOT_PANE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole GLASS_PANE

    /**
     * A pane that is guaranteed to be painted on top
     * of all panes beneath it.
     * @see #ROOT_PANE
     * @see #CANVAS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole ROOT_PANE

    /**
     * A specialized pane that has a glass pane and a layered pane as its
     * children.
     * @see #GLASS_PANE
     * @see #LAYERED_PANE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole LABEL

    /**
     * An object used to present an icon or short string in an interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole ICON

    /**
     * A small fixed size picture, typically used to decorate components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole HYPERLINK

    /**
     * A hypertext anchor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole FILLER

    /**
     * An object that fills up space in a user interface.  It is often
     * used in interfaces to tweak the spacing between components,
     * but serves no other purpose.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole FILE_CHOOSER

    /**
     * A specialized dialog that displays the files in the directory
     * and lets the user select a file, browse a different directory,
     * or specify a filename.  May use the directory pane to show the
     * contents of a directory.
     * @see #DIRECTORY_PANE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole DIRECTORY_PANE

    /**
     * A pane that allows the user to navigate through
     * and select the contents of a directory.  May be used
     * by a file chooser.
     * @see #FILE_CHOOSER
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole COLOR_CHOOSER

    /**
     * A specialized pane that lets the user choose a color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole DIALOG

    /**
     * A top level window with title bar and a border.  A dialog is similar
     * to a frame, but it has fewer properties and is often used as a
     * secondary window for an application.
     * @see #FRAME
     * @see #WINDOW
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole FRAME

    /**
     * A top level window with a title bar, border, menu bar, etc.  It is
     * often used as the primary window for an application.
     * @see #DIALOG
     * @see #CANVAS
     * @see #WINDOW
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole WINDOW

    /**
     * A top level window with no title or border.
     * @see #FRAME
     * @see #DIALOG
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole OPTION_PANE

    /**
     * A specialized pane whose primary use is inside a DIALOG
     * @see #DIALOG
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole DESKTOP_PANE

    /**
     * A pane that supports internal frames and
     * iconified versions of those internal frames.
     * @see #DESKTOP_ICON
     * @see #INTERNAL_FRAME
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole INTERNAL_FRAME

    /**
     * A frame-like object that is clipped by a desktop pane.  The
     * desktop pane, internal frame, and desktop icon objects are
     * often used to create multiple document interfaces within an
     * application.
     * @see #DESKTOP_ICON
     * @see #DESKTOP_PANE
     * @see #FRAME
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole HTML_CONTAINER

    /**
     * An object containing a collection of <code>Accessibles</code> that
     * together represents <code>HTML</code> content.  The child
     * <code>Accessibles</code> would include objects implementing
     * <code>AccessibleText</code>, <code>AccessibleHypertext</code>,
     * <code>AccessibleIcon</code>, and other interfaces.
     * @see #HYPERLINK
     * @see AccessibleText
     * @see AccessibleHypertext
     * @see AccessibleHyperlink
     * @see AccessibleIcon
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole DESKTOP_ICON

    /**
     * An iconified internal frame in a DESKTOP_PANE.
     * @see #DESKTOP_PANE
     * @see #INTERNAL_FRAME
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole COMBO_BOX

    /**
     * A list of choices the user can select from.  Also optionally
     * allows the user to enter a choice of their own.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole CANVAS

    /**
     * Object that can be drawn into and is used to trap
     * events.
     * @see #FRAME
     * @see #GLASS_PANE
     * @see #LAYERED_PANE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole COLUMN_HEADER

    /**
     * The header for a column of data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
    public static final AccessibleRole ALERT

    /**
     * Object is used to alert the user about something.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRole.java
public class AccessibleRole extends AccessibleBundle {

/**
 * <P>Class AccessibleRole determines the role of a component.  The role of a
 * component describes its generic function. (E.G.,
* "push button," "table," or "list.")
 * <p>The toDisplayString method allows you to obtain the localized string
 * for a locale independent key from a predefined ResourceBundle for the
 * keys defined in this class.
 * <p>The constants in this class present a strongly typed enumeration
 * of common object roles.  A public constructor for this class has been
 * purposely omitted and applications should use one of the constants
 * from this class.  If the constants in this class are not sufficient
 * to describe the role of an object, a subclass should be generated
 * from this class and it should provide constants in a similar manner.
 *
 * @author      Willie Walker
 * @author      Peter Korn
 * @author      Lynn Monsanto
 */
