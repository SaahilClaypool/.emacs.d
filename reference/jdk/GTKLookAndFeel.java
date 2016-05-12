_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private static class GnomeLayoutStyle extends DefaultLayoutStyle {

    /**
     * Gnome layout style.  From:
     * http://developer.gnome.org/projects/gup/hig/2.0/design-window.html#window-layout-spacing
     * You'll notice this doesn't do the radiobutton/checkbox border
     * adjustments that windows/metal do.  This is because gtk doesn't
     * provide margins/insets for checkbox/radiobuttons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    public LayoutStyle getLayoutStyle() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    public boolean shouldUpdateStyleOnAncestorChanged() {

    /**
     * Returns whether or not the UIs should update their
     * <code>SynthStyles</code> from the <code>SynthStyleFactory</code>
     * when the ancestor of the Component changes.
     *
     * @return whether or not the UIs should update their
     * <code>SynthStyles</code> from the <code>SynthStyleFactory</code>
     * when the ancestor changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static String getGtkThemeName() {

    /**
     * Returns the cached gtkThemeName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates the GTK look and feel class for the passed in Component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static int synthStateToGTKState(Region region, int state) {

    /**
     * Maps from a Synth state to the corresponding GTK state.
     * The GTK states are named differently than Synth's states, the
     * following gives the mapping:
     * <table><tr><td>Synth<td>GTK
     * <tr><td>SynthConstants.PRESSED<td>ACTIVE
     * <tr><td>SynthConstants.SELECTED<td>SELECTED
     * <tr><td>SynthConstants.MOUSE_OVER<td>PRELIGHT
     * <tr><td>SynthConstants.DISABLED<td>INSENSITIVE
     * <tr><td>SynthConstants.ENABLED<td>NORMAL
     * </table>
     * Additionally some widgets are special cased.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static StateType synthStateToGTKStateType(int state) {

    /**
     * Maps from Synth state to native GTK state using typesafe enumeration
     * StateType.  This is only used by GTKEngine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static PositionType SwingOrientationConstantToGTK(int side) {

    /**
     * Maps a swing constant to a GTK constant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static boolean is2_2() {

    /**
     * Returns true if running on system containing at least 2.2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private static String gtkThemeName = "Default";

    /**
     * Cached theme name. Used by GTKGraphicsUtils
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private GTKStyleFactory styleFactory;

    /**
     * StyleFactory needs to be created only the first time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private boolean pclInstalled;

    /**
     * If true, PropertyChangeListeners have been installed for the
     * Toolkit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private boolean inInitialize;

    /**
     * If true, GTKLookAndFeel is inside the <code>initialize</code>
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private Font fallbackFont;

    /**
     * Font to use in places where there is no widget.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private static boolean isSunCJK;

    /**
     * Solaris, or Linux with Sun JDS in a CJK Locale.
     * Used to determine if Sun's high quality CJK fonts are present.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static Object aaTextInfo;

    /**
     * Whether or not text is drawn antialiased.  This keys off the
     * desktop property 'gnome.Xft/Antialias' and 'gnome.Xft/RGBA'
     * We should assume ON - or some variation of ON as no GTK desktop
     * ships with it OFF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
public class GTKLookAndFeel extends SynthLookAndFeel {

/**
 * @author Scott Violet
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private static class GnomeLayoutStyle extends DefaultLayoutStyle {

    /**
     * Gnome layout style.  From:
     * http://developer.gnome.org/projects/gup/hig/2.0/design-window.html#window-layout-spacing
     * You'll notice this doesn't do the radiobutton/checkbox border
     * adjustments that windows/metal do.  This is because gtk doesn't
     * provide margins/insets for checkbox/radiobuttons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    public LayoutStyle getLayoutStyle() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    public boolean shouldUpdateStyleOnAncestorChanged() {

    /**
     * Returns whether or not the UIs should update their
     * <code>SynthStyles</code> from the <code>SynthStyleFactory</code>
     * when the ancestor of the Component changes.
     *
     * @return whether or not the UIs should update their
     * <code>SynthStyles</code> from the <code>SynthStyleFactory</code>
     * when the ancestor changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static String getGtkThemeName() {

    /**
     * Returns the cached gtkThemeName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates the GTK look and feel class for the passed in Component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static int synthStateToGTKState(Region region, int state) {

    /**
     * Maps from a Synth state to the corresponding GTK state.
     * The GTK states are named differently than Synth's states, the
     * following gives the mapping:
     * <table><tr><td>Synth<td>GTK
     * <tr><td>SynthConstants.PRESSED<td>ACTIVE
     * <tr><td>SynthConstants.SELECTED<td>SELECTED
     * <tr><td>SynthConstants.MOUSE_OVER<td>PRELIGHT
     * <tr><td>SynthConstants.DISABLED<td>INSENSITIVE
     * <tr><td>SynthConstants.ENABLED<td>NORMAL
     * </table>
     * Additionally some widgets are special cased.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static StateType synthStateToGTKStateType(int state) {

    /**
     * Maps from Synth state to native GTK state using typesafe enumeration
     * StateType.  This is only used by GTKEngine.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static PositionType SwingOrientationConstantToGTK(int side) {

    /**
     * Maps a swing constant to a GTK constant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static boolean is2_2() {

    /**
     * Returns true if running on system containing at least 2.2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private static String gtkThemeName = "Default";

    /**
     * Cached theme name. Used by GTKGraphicsUtils
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private GTKStyleFactory styleFactory;

    /**
     * StyleFactory needs to be created only the first time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private boolean pclInstalled;

    /**
     * If true, PropertyChangeListeners have been installed for the
     * Toolkit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private boolean inInitialize;

    /**
     * If true, GTKLookAndFeel is inside the <code>initialize</code>
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private Font fallbackFont;

    /**
     * Font to use in places where there is no widget.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    private static boolean isSunCJK;

    /**
     * Solaris, or Linux with Sun JDS in a CJK Locale.
     * Used to determine if Sun's high quality CJK fonts are present.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
    static Object aaTextInfo;

    /**
     * Whether or not text is drawn antialiased.  This keys off the
     * desktop property 'gnome.Xft/Antialias' and 'gnome.Xft/RGBA'
     * We should assume ON - or some variation of ON as no GTK desktop
     * ships with it OFF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKLookAndFeel.java
public class GTKLookAndFeel extends SynthLookAndFeel {

/**
 * @author Scott Violet
 */
