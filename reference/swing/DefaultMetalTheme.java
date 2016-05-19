_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    private static class WindowsFontDelegate extends FontDelegate {

    /**
     * The WindowsFontDelegate uses DesktopProperties to obtain fonts.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
        protected Font getPrivilegedFont(final int key) {

        /**
         * This is the same as invoking
         * <code>Font.getFont(key)</code>, with the exception
         * that it is wrapped inside a <code>doPrivileged</code> call.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    private static class FontDelegate {

    /**
     * FontDelegates add an extra level of indirection to obtaining fonts.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    boolean isSystemTheme() {

    /**
     * Returns true if this is a theme provided by the core platform.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public FontUIResource getSubTextFont() {

    /**
     * Returns the sub-text font. This returns Dialog, 10pt, plain.
     *
     * @return the sub-text font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public FontUIResource getWindowTitleFont() {

    /**
     * Returns the window title font. This returns Dialog, 12pt, bold.
     *
     * @return the window title font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public FontUIResource getMenuTextFont() {

    /**
     * Returns the menu text font. This returns Dialog, 12pt. If
     * plain fonts have been enabled as described in <a href="#fontStyle">
     * font style</a>, the font style is plain. Otherwise the font style is
     * bold.
     *
     * @return the menu text font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public FontUIResource getUserTextFont() {

    /**
     * Returns the user text font. This returns Dialog, 12pt, plain.
     *
     * @return the user text font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public FontUIResource getSystemTextFont() {

    /**
     * Returns the system text font. This returns Dialog, 12pt, plain.
     *
     * @return the system text font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public FontUIResource getControlTextFont() {

    /**
     * Returns the control text font. This returns Dialog, 12pt. If
     * plain fonts have been enabled as described in <a href="#fontStyle">
     * font style</a>, the font style is plain. Otherwise the font style is
     * bold.
     *
     * @return the control text font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    protected ColorUIResource getSecondary3() { return secondary3; }

    /**
     * Returns the secondary 3 color. This returns a color with rgb values
     * 204, 204, and 204, respectively.
     *
     * @return the secondary 3 color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    protected ColorUIResource getSecondary2() { return secondary2; }

    /**
     * Returns the secondary 2 color. This returns a color with rgb values
     * 153, 153, and 153, respectively.
     *
     * @return the secondary 2 color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    protected ColorUIResource getSecondary1() { return secondary1; }

    /**
     * Returns the secondary 1 color. This returns a color with rgb values
     * 102, 102, and 102, respectively.
     *
     * @return the secondary 1 color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    protected ColorUIResource getPrimary3() { return primary3; }

    /**
     * Returns the primary 3 color. This returns a color with rgb values
     * 204, 204, 255, respectively.
     *
     * @return the primary 3 color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    protected ColorUIResource getPrimary2() { return primary2; }

    /**
     * Returns the primary 2 color. This returns a color with rgb values
     * of 153, 153, 204, respectively.
     *
     * @return the primary 2 color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    protected ColorUIResource getPrimary1() { return primary1; }

    /**
     * Returns the primary 1 color. This returns a color with rgb values
     * of 102, 102, and 153, respectively.
     *
     * @return the primary 1 color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public DefaultMetalTheme() {

    /**
     * Creates and returns an instance of {@code DefaultMetalTheme}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    public String getName() { return "Steel"; }

    /**
     * Returns the name of this theme. This returns {@code "Steel"}.
     *
     * @return the name of this theme.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    static String getDefaultPropertyName(int key) {

    /**
     * Returns the default used to look up the specified font.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    static int getDefaultFontStyle(int key) {

    /**
     * Returns the ideal font style for the font identified by key.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    static int getDefaultFontSize(int key) {

    /**
     * Returns the ideal font size for the font identified by key.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    static String getDefaultFontName(int key) {

    /**
     * Returns the ideal font name for the font identified by key.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    private static final String[] defaultNames = {

    /**
     * System property names used to look up fonts.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    private static final int[] fontSizes = {

    /**
     * Sizes for the fonts.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    private static final int[] fontStyles = {

    /**
     * Styles for the fonts.  This is ignored if the defaults property
     * <code>swing.boldMetal</code> is false, or PLAIN_FONTS is true.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    private static final String[] fontNames = {

    /**
     * Names of the fonts to use.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
    private static final boolean PLAIN_FONTS;

    /**
     * Whether or not fonts should be plain.  This is only used if
     * the defaults property 'swing.boldMetal' == "false".
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/metal/DefaultMetalTheme.java
public class DefaultMetalTheme extends MetalTheme {

/**
 * A concrete implementation of {@code MetalTheme} providing
 * the original look of the Java Look and Feel, code-named "Steel". Refer
 * to {@link MetalLookAndFeel#setCurrentTheme} for details on changing
 * the default theme.
 * <p>
 * All colors returned by {@code DefaultMetalTheme} are completely
 * opaque.
 *
 * <h3><a name="fontStyle"></a>Font Style</h3>
 *
 * {@code DefaultMetalTheme} uses bold fonts for many controls.  To make all
 * controls (with the exception of the internal frame title bars and
 * client decorated frame title bars) use plain fonts you can do either of
 * the following:
 * <ul>
 * <li>Set the system property <code>swing.boldMetal</code> to
 *     <code>false</code>.  For example,
 *     <code>java&nbsp;-Dswing.boldMetal=false&nbsp;MyApp</code>.
 * <li>Set the defaults property <code>swing.boldMetal</code> to
 *     <code>Boolean.FALSE</code>.  For example:
 *     <code>UIManager.put("swing.boldMetal",&nbsp;Boolean.FALSE);</code>
 * </ul>
 * The defaults property <code>swing.boldMetal</code>, if set,
 * takes precedence over the system property of the same name. After
 * setting this defaults property you need to re-install
 * <code>MetalLookAndFeel</code>, as well as update the UI
 * of any previously created widgets. Otherwise the results are undefined.
 * The following illustrates how to do this:
 * <pre>
 *   // turn off bold fonts
 *   UIManager.put("swing.boldMetal", Boolean.FALSE);
 *
 *   // re-install the Metal Look and Feel
 *   UIManager.setLookAndFeel(new MetalLookAndFeel());
 *
 *   // Update the ComponentUIs for all Components. This
 *   // needs to be invoked for all windows.
 *   SwingUtilities.updateComponentTreeUI(rootComponent);
 * </pre>
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
 * @see MetalLookAndFeel
 * @see MetalLookAndFeel#setCurrentTheme
 *
 * @author Steve Wilson
 */
