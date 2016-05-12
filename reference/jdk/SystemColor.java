_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private Object writeReplace() throws ObjectStreamException

    /**
     * Returns a specialized version of the {@code SystemColor}
     * object for writing to the serialized stream.
     * @serialData
     * The value field of a serialized {@code SystemColor} object
     * contains the array index of the system color instead of the
     * rgb data for the system color.
     * This index is used by the {@link #readResolve} method to
     * resolve the deserialized objects back to the original
     * static constant versions to ensure unique instances of
     * each {@code SystemColor} object.
     * @return a proxy {@code SystemColor} object with its value
     *         replaced by the corresponding system color index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private Object readResolve() {

    /**
     * The design of the {@code SystemColor} class assumes that
     * the {@code SystemColor} object instances stored in the
     * static final fields above are the only instances that can
     * be used by developers.
     * This method helps maintain those limits on instantiation
     * by using the index stored in the value field of the
     * serialized form of the object to replace the serialized
     * object with the equivalent static object constant field
     * of {@code SystemColor}.
     * See the {@link #writeReplace} method for more information
     * on the serialized form of these objects.
     * @return one of the {@code SystemColor} static object
     *         fields that refers to the same system color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public String toString() {

    /**
     * Returns a string representation of this <code>Color</code>'s values.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations.
     * The returned string may be empty but may not be <code>null</code>.
     *
     * @return  a string representation of this <code>Color</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private SystemColor(byte index) {

    /**
     * Creates a symbolic color that represents an indexed entry into system
     * color cache. Used by above static system colors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private static void updateSystemColors() {

    /**
     * Called from {@code <init>} and toolkit to update the above systemColors cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor infoText = new SystemColor((byte)INFO_TEXT);

    /**
     * The color rendered for the text of tooltips or spot help.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor info = new SystemColor((byte)INFO);

    /**
     * The color rendered for the background of tooltips or spot help.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor scrollbar = new SystemColor((byte)SCROLLBAR);

    /**
     * The color rendered for the background of scrollbars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlDkShadow = new SystemColor((byte)CONTROL_DK_SHADOW);

    /**
     * The color rendered for dark shadow areas on 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlShadow = new SystemColor((byte)CONTROL_SHADOW);

    /**
     * The color rendered for shadow areas of 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlLtHighlight = new SystemColor((byte)CONTROL_LT_HIGHLIGHT);

    /**
     * The color rendered for highlight areas of 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlHighlight = new SystemColor((byte)CONTROL_HIGHLIGHT);

    /**
     * The color rendered for light areas of 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlText = new SystemColor((byte)CONTROL_TEXT);

    /**
     * The color rendered for the text of control panels and control objects,
     * such as pushbuttons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor control = new SystemColor((byte)CONTROL);

    /**
     * The color rendered for the background of control panels and control objects,
     * such as pushbuttons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textInactiveText = new SystemColor((byte)TEXT_INACTIVE_TEXT);

    /**
     * The color rendered for the text of inactive items, such as in menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textHighlightText = new SystemColor((byte)TEXT_HIGHLIGHT_TEXT);

    /**
     * The color rendered for the text of selected items, such as in menus, comboboxes,
     * and text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textHighlight = new SystemColor((byte)TEXT_HIGHLIGHT);

    /**
     * The color rendered for the background of selected items, such as in menus,
     * comboboxes, and text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textText = new SystemColor((byte)TEXT_TEXT);

    /**
     * The color rendered for the text of text control objects, such as textfields
     * and comboboxes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor text = new SystemColor((byte)TEXT);

    /**
     * The color rendered for the background of text control objects, such as
     * textfields and comboboxes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor menuText = new SystemColor((byte)MENU_TEXT);

    /**
     * The color rendered for the text of menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor menu = new SystemColor((byte)MENU);

    /**
     * The color rendered for the background of menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor windowText = new SystemColor((byte)WINDOW_TEXT);

    /**
     * The color rendered for text of interior regions inside windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor windowBorder = new SystemColor((byte)WINDOW_BORDER);

    /**
     * The color rendered for the border around interior regions inside windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor window = new SystemColor((byte)WINDOW);

    /**
     * The color rendered for the background of interior regions inside windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor inactiveCaptionBorder = new SystemColor((byte)INACTIVE_CAPTION_BORDER);

    /**
     * The color rendered for the border around inactive windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor inactiveCaptionText = new SystemColor((byte)INACTIVE_CAPTION_TEXT);

    /**
     * The color rendered for the window-title text of inactive windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor inactiveCaption = new SystemColor((byte)INACTIVE_CAPTION);

    /**
     * The color rendered for the window-title background of inactive windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor activeCaptionBorder = new SystemColor((byte)ACTIVE_CAPTION_BORDER);

    /**
     * The color rendered for the border around the currently active window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor activeCaptionText = new SystemColor((byte)ACTIVE_CAPTION_TEXT);

    /**
     * The color rendered for the window-title text of the currently active window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor activeCaption = new SystemColor((byte)ACTIVE_CAPTION);

    /**
     * The color rendered for the window-title background of the currently active window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor desktop = new SystemColor((byte)DESKTOP);

   /**
     * The color rendered for the background of the desktop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    /*

    /******************************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int NUM_COLORS = 26;

    /**
     * The number of system colors in the array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INFO_TEXT = 25;

    /**
     * The array index for the
     * {@link #infoText} system color.
     * @see SystemColor#infoText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INFO = 24;

    /**
     * The array index for the
     * {@link #info} system color.
     * @see SystemColor#info
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int SCROLLBAR = 23;

    /**
     * The array index for the
     * {@link #scrollbar} system color.
     * @see SystemColor#scrollbar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_DK_SHADOW = 22;

    /**
     * The array index for the
     * {@link #controlDkShadow} system color.
     * @see SystemColor#controlDkShadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_SHADOW = 21;

    /**
     * The array index for the
     * {@link #controlShadow} system color.
     * @see SystemColor#controlShadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_LT_HIGHLIGHT = 20;

    /**
     * The array index for the
     * {@link #controlLtHighlight} system color.
     * @see SystemColor#controlLtHighlight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_HIGHLIGHT = 19;

    /**
     * The array index for the
     * {@link #controlHighlight} system color.
     * @see SystemColor#controlHighlight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_TEXT = 18;

    /**
     * The array index for the
     * {@link #controlText} system color.
     * @see SystemColor#controlText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL = 17;

    /**
     * The array index for the
     * {@link #control} system color.
     * @see SystemColor#control
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_INACTIVE_TEXT = 16;

    /**
     * The array index for the
     * {@link #textInactiveText} system color.
     * @see SystemColor#textInactiveText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_HIGHLIGHT_TEXT = 15;

    /**
     * The array index for the
     * {@link #textHighlightText} system color.
     * @see SystemColor#textHighlightText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_HIGHLIGHT = 14;

    /**
     * The array index for the
     * {@link #textHighlight} system color.
     * @see SystemColor#textHighlight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_TEXT = 13;

    /**
     * The array index for the
     * {@link #textText} system color.
     * @see SystemColor#textText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT = 12;

    /**
     * The array index for the
     * {@link #text} system color.
     * @see SystemColor#text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int MENU_TEXT = 11;

    /**
     * The array index for the
     * {@link #menuText} system color.
     * @see SystemColor#menuText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int MENU = 10;

    /**
     * The array index for the
     * {@link #menu} system color.
     * @see SystemColor#menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int WINDOW_TEXT = 9;

    /**
     * The array index for the
     * {@link #windowText} system color.
     * @see SystemColor#windowText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int WINDOW_BORDER = 8;

    /**
     * The array index for the
     * {@link #windowBorder} system color.
     * @see SystemColor#windowBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int WINDOW = 7;

    /**
     * The array index for the
     * {@link #window} system color.
     * @see SystemColor#window
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INACTIVE_CAPTION_BORDER = 6;

    /**
     * The array index for the
     * {@link #inactiveCaptionBorder} system color.
     * @see SystemColor#inactiveCaptionBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INACTIVE_CAPTION_TEXT = 5;

    /**
     * The array index for the
     * {@link #inactiveCaptionText} system color.
     * @see SystemColor#inactiveCaptionText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INACTIVE_CAPTION = 4;

    /**
     * The array index for the
     * {@link #inactiveCaption} system color.
     * @see SystemColor#inactiveCaption
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int ACTIVE_CAPTION_BORDER = 3;

    /**
     * The array index for the
     * {@link #activeCaptionBorder} system color.
     * @see SystemColor#activeCaptionBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int ACTIVE_CAPTION_TEXT = 2;

    /**
     * The array index for the
     * {@link #activeCaptionText} system color.
     * @see SystemColor#activeCaptionText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int ACTIVE_CAPTION = 1;

    /**
     * The array index for the
     * {@link #activeCaption} system color.
     * @see SystemColor#activeCaption
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int DESKTOP = 0;

   /**
     * The array index for the
     * {@link #desktop} system color.
     * @see SystemColor#desktop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
public final class SystemColor extends Color implements java.io.Serializable {

/**
 * A class to encapsulate symbolic colors representing the color of
 * native GUI objects on a system.  For systems which support the dynamic
 * update of the system colors (when the user changes the colors)
 * the actual RGB values of these symbolic colors will also change
 * dynamically.  In order to compare the "current" RGB value of a
 * <code>SystemColor</code> object with a non-symbolic Color object,
 * <code>getRGB</code> should be used rather than <code>equals</code>.
 * <p>
 * Note that the way in which these system colors are applied to GUI objects
 * may vary slightly from platform to platform since GUI objects may be
 * rendered differently on each platform.
 * <p>
 * System color values may also be available through the <code>getDesktopProperty</code>
 * method on <code>java.awt.Toolkit</code>.
 *
 * @see Toolkit#getDesktopProperty
 *
 * @author      Carl Quinn
 * @author      Amy Fowler
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private Object writeReplace() throws ObjectStreamException

    /**
     * Returns a specialized version of the {@code SystemColor}
     * object for writing to the serialized stream.
     * @serialData
     * The value field of a serialized {@code SystemColor} object
     * contains the array index of the system color instead of the
     * rgb data for the system color.
     * This index is used by the {@link #readResolve} method to
     * resolve the deserialized objects back to the original
     * static constant versions to ensure unique instances of
     * each {@code SystemColor} object.
     * @return a proxy {@code SystemColor} object with its value
     *         replaced by the corresponding system color index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private Object readResolve() {

    /**
     * The design of the {@code SystemColor} class assumes that
     * the {@code SystemColor} object instances stored in the
     * static final fields above are the only instances that can
     * be used by developers.
     * This method helps maintain those limits on instantiation
     * by using the index stored in the value field of the
     * serialized form of the object to replace the serialized
     * object with the equivalent static object constant field
     * of {@code SystemColor}.
     * See the {@link #writeReplace} method for more information
     * on the serialized form of these objects.
     * @return one of the {@code SystemColor} static object
     *         fields that refers to the same system color.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public String toString() {

    /**
     * Returns a string representation of this <code>Color</code>'s values.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations.
     * The returned string may be empty but may not be <code>null</code>.
     *
     * @return  a string representation of this <code>Color</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private SystemColor(byte index) {

    /**
     * Creates a symbolic color that represents an indexed entry into system
     * color cache. Used by above static system colors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    private static void updateSystemColors() {

    /**
     * Called from {@code <init>} and toolkit to update the above systemColors cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor infoText = new SystemColor((byte)INFO_TEXT);

    /**
     * The color rendered for the text of tooltips or spot help.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor info = new SystemColor((byte)INFO);

    /**
     * The color rendered for the background of tooltips or spot help.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor scrollbar = new SystemColor((byte)SCROLLBAR);

    /**
     * The color rendered for the background of scrollbars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlDkShadow = new SystemColor((byte)CONTROL_DK_SHADOW);

    /**
     * The color rendered for dark shadow areas on 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlShadow = new SystemColor((byte)CONTROL_SHADOW);

    /**
     * The color rendered for shadow areas of 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlLtHighlight = new SystemColor((byte)CONTROL_LT_HIGHLIGHT);

    /**
     * The color rendered for highlight areas of 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlHighlight = new SystemColor((byte)CONTROL_HIGHLIGHT);

    /**
     * The color rendered for light areas of 3D control objects, such as pushbuttons.
     * This color is typically derived from the <code>control</code> background color
     * to provide a 3D effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor controlText = new SystemColor((byte)CONTROL_TEXT);

    /**
     * The color rendered for the text of control panels and control objects,
     * such as pushbuttons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor control = new SystemColor((byte)CONTROL);

    /**
     * The color rendered for the background of control panels and control objects,
     * such as pushbuttons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textInactiveText = new SystemColor((byte)TEXT_INACTIVE_TEXT);

    /**
     * The color rendered for the text of inactive items, such as in menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textHighlightText = new SystemColor((byte)TEXT_HIGHLIGHT_TEXT);

    /**
     * The color rendered for the text of selected items, such as in menus, comboboxes,
     * and text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textHighlight = new SystemColor((byte)TEXT_HIGHLIGHT);

    /**
     * The color rendered for the background of selected items, such as in menus,
     * comboboxes, and text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor textText = new SystemColor((byte)TEXT_TEXT);

    /**
     * The color rendered for the text of text control objects, such as textfields
     * and comboboxes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor text = new SystemColor((byte)TEXT);

    /**
     * The color rendered for the background of text control objects, such as
     * textfields and comboboxes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor menuText = new SystemColor((byte)MENU_TEXT);

    /**
     * The color rendered for the text of menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor menu = new SystemColor((byte)MENU);

    /**
     * The color rendered for the background of menus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor windowText = new SystemColor((byte)WINDOW_TEXT);

    /**
     * The color rendered for text of interior regions inside windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor windowBorder = new SystemColor((byte)WINDOW_BORDER);

    /**
     * The color rendered for the border around interior regions inside windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor window = new SystemColor((byte)WINDOW);

    /**
     * The color rendered for the background of interior regions inside windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor inactiveCaptionBorder = new SystemColor((byte)INACTIVE_CAPTION_BORDER);

    /**
     * The color rendered for the border around inactive windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor inactiveCaptionText = new SystemColor((byte)INACTIVE_CAPTION_TEXT);

    /**
     * The color rendered for the window-title text of inactive windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor inactiveCaption = new SystemColor((byte)INACTIVE_CAPTION);

    /**
     * The color rendered for the window-title background of inactive windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor activeCaptionBorder = new SystemColor((byte)ACTIVE_CAPTION_BORDER);

    /**
     * The color rendered for the border around the currently active window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor activeCaptionText = new SystemColor((byte)ACTIVE_CAPTION_TEXT);

    /**
     * The color rendered for the window-title text of the currently active window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor activeCaption = new SystemColor((byte)ACTIVE_CAPTION);

    /**
     * The color rendered for the window-title background of the currently active window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    public final static SystemColor desktop = new SystemColor((byte)DESKTOP);

   /**
     * The color rendered for the background of the desktop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    /*

    /******************************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int NUM_COLORS = 26;

    /**
     * The number of system colors in the array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INFO_TEXT = 25;

    /**
     * The array index for the
     * {@link #infoText} system color.
     * @see SystemColor#infoText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INFO = 24;

    /**
     * The array index for the
     * {@link #info} system color.
     * @see SystemColor#info
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int SCROLLBAR = 23;

    /**
     * The array index for the
     * {@link #scrollbar} system color.
     * @see SystemColor#scrollbar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_DK_SHADOW = 22;

    /**
     * The array index for the
     * {@link #controlDkShadow} system color.
     * @see SystemColor#controlDkShadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_SHADOW = 21;

    /**
     * The array index for the
     * {@link #controlShadow} system color.
     * @see SystemColor#controlShadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_LT_HIGHLIGHT = 20;

    /**
     * The array index for the
     * {@link #controlLtHighlight} system color.
     * @see SystemColor#controlLtHighlight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_HIGHLIGHT = 19;

    /**
     * The array index for the
     * {@link #controlHighlight} system color.
     * @see SystemColor#controlHighlight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL_TEXT = 18;

    /**
     * The array index for the
     * {@link #controlText} system color.
     * @see SystemColor#controlText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int CONTROL = 17;

    /**
     * The array index for the
     * {@link #control} system color.
     * @see SystemColor#control
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_INACTIVE_TEXT = 16;

    /**
     * The array index for the
     * {@link #textInactiveText} system color.
     * @see SystemColor#textInactiveText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_HIGHLIGHT_TEXT = 15;

    /**
     * The array index for the
     * {@link #textHighlightText} system color.
     * @see SystemColor#textHighlightText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_HIGHLIGHT = 14;

    /**
     * The array index for the
     * {@link #textHighlight} system color.
     * @see SystemColor#textHighlight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT_TEXT = 13;

    /**
     * The array index for the
     * {@link #textText} system color.
     * @see SystemColor#textText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int TEXT = 12;

    /**
     * The array index for the
     * {@link #text} system color.
     * @see SystemColor#text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int MENU_TEXT = 11;

    /**
     * The array index for the
     * {@link #menuText} system color.
     * @see SystemColor#menuText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int MENU = 10;

    /**
     * The array index for the
     * {@link #menu} system color.
     * @see SystemColor#menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int WINDOW_TEXT = 9;

    /**
     * The array index for the
     * {@link #windowText} system color.
     * @see SystemColor#windowText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int WINDOW_BORDER = 8;

    /**
     * The array index for the
     * {@link #windowBorder} system color.
     * @see SystemColor#windowBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int WINDOW = 7;

    /**
     * The array index for the
     * {@link #window} system color.
     * @see SystemColor#window
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INACTIVE_CAPTION_BORDER = 6;

    /**
     * The array index for the
     * {@link #inactiveCaptionBorder} system color.
     * @see SystemColor#inactiveCaptionBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INACTIVE_CAPTION_TEXT = 5;

    /**
     * The array index for the
     * {@link #inactiveCaptionText} system color.
     * @see SystemColor#inactiveCaptionText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int INACTIVE_CAPTION = 4;

    /**
     * The array index for the
     * {@link #inactiveCaption} system color.
     * @see SystemColor#inactiveCaption
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int ACTIVE_CAPTION_BORDER = 3;

    /**
     * The array index for the
     * {@link #activeCaptionBorder} system color.
     * @see SystemColor#activeCaptionBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int ACTIVE_CAPTION_TEXT = 2;

    /**
     * The array index for the
     * {@link #activeCaptionText} system color.
     * @see SystemColor#activeCaptionText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int ACTIVE_CAPTION = 1;

    /**
     * The array index for the
     * {@link #activeCaption} system color.
     * @see SystemColor#activeCaption
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
    @Native public final static int DESKTOP = 0;

   /**
     * The array index for the
     * {@link #desktop} system color.
     * @see SystemColor#desktop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SystemColor.java
public final class SystemColor extends Color implements java.io.Serializable {

/**
 * A class to encapsulate symbolic colors representing the color of
 * native GUI objects on a system.  For systems which support the dynamic
 * update of the system colors (when the user changes the colors)
 * the actual RGB values of these symbolic colors will also change
 * dynamically.  In order to compare the "current" RGB value of a
 * <code>SystemColor</code> object with a non-symbolic Color object,
 * <code>getRGB</code> should be used rather than <code>equals</code>.
 * <p>
 * Note that the way in which these system colors are applied to GUI objects
 * may vary slightly from platform to platform since GUI objects may be
 * rendered differently on each platform.
 * <p>
 * System color values may also be available through the <code>getDesktopProperty</code>
 * method on <code>java.awt.Toolkit</code>.
 *
 * @see Toolkit#getDesktopProperty
 *
 * @author      Carl Quinn
 * @author      Amy Fowler
 */
