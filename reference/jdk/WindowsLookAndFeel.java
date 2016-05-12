_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public Icon getDisabledIcon(JComponent component, Icon icon) {

    /**
     * {@inheritDoc}
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private void calculateBaseUnits() {

    /**
     * Calculates the dialog unit mapping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private int dluToPixels(int dlu, int direction) {

    /**
     * Converts the dialog unit argument to pixels along the specified
     * axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class XPValue implements UIDefaults.ActiveValue {

    /**
     * A value wrapper that actively retrieves values from xp or falls back
     * to the classic value if not running XP styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class WindowsFontSizeProperty extends DesktopProperty {

    /**
     * DesktopProperty for fonts that only gets sizes from the desktop,
     * font name and style are passed into the constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class WindowsFontProperty extends DesktopProperty {

    /**
     * DesktopProperty for fonts. If a font with the name 'MS Sans Serif'
     * is returned, it is mapped to 'Microsoft Sans Serif'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public int getIconHeight() {

        /**
         * Returns the icon's height.
         *
         * @return an int specifying the fixed height of the icon.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public int getIconWidth() {

        /**
         * Returns the icon's width.
         *
         * @return an int specifying the fixed width of the icon.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public void paintIcon(Component c, Graphics g, int x, int y) {

        /**
         * Draw the icon at the specified location.  Icon implementations
         * may use the Component argument to get properties useful for
         * painting, e.g. the foreground or background color.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class SkinIcon implements Icon, UIResource {

    /**
     * Icon backed-up by XP Skin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private class ActiveWindowsIcon implements UIDefaults.ActiveValue {

    /**
     * Gets an <code>Icon</code> from the native libraries if available.
     * A desktop property is used to trigger reloading the icon when needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class LazyWindowsIcon implements UIDefaults.LazyValue {

    /**
     * Gets an <code>Icon</code> from the native libraries if available,
     * otherwise gets it from an image resource file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public AudioAction(String name, String resource) {

        /**
         * We use the String as the name of the Action and as a pointer to
         * the underlying OSes audio resource.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class AudioAction extends AbstractAction {

    /**
     * Pass the name String to the super constructor. This is used
     * later to identify the Action and decide whether to play it or
     * not. Store the resource String. It is used to get the audio
     * resource. In this case, the resource is a <code>Runnable</code>
     * supplied by <code>Toolkit</code>. This <code>Runnable</code> is
     * effectively a pointer down into the Win32 OS that knows how to
     * play the right sound.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    protected Action createAudioAction(Object key) {

    /**
     * Returns an <code>Action</code>.
     * <P>
     * This Action contains the information and logic to render an
     * auditory cue. The <code>Object</code> that is passed to this
     * method contains the information needed to render the auditory
     * cue. Normally, this <code>Object</code> is a <code>String</code>
     * that points to a <code>Toolkit</code> <code>desktopProperty</code>.
     * This <code>desktopProperty</code> is resolved by AWT and the
     * Windows OS.
     * <P>
     * This <code>Action</code>'s <code>actionPerformed</code> method
     * is fired by the <code>playSound</code> method.
     *
     * @return      an Action which knows how to render the auditory
     *              cue for one particular system or user activity
     * @see #playSound(Action)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public LayoutStyle getLayoutStyle() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
     public void provideErrorFeedback(Component component) {

    /**
     * <p>
     * Invoked when the user attempts an invalid operation,
     * such as pasting into an uneditable <code>JTextField</code>
     * that has focus.
     * </p>
     * <p>
     * If the user has enabled visual error indication on
     * the desktop, this method will flash the caption bar
     * of the active window. The user can also set the
     * property awt.visualbell=true to achieve the same
     * results.
     * </p>
     *
     * @param component Component the error occurred in, may be
     *                  null indicating the error condition is
     *                  not directly associated with a
     *                  <code>Component</code>.
     *
     * @see javax.swing.LookAndFeel#provideErrorFeedback
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public static boolean isClassicWindows() {

    /**
     * Gets the state of the flag which indicates if the old Windows
     * look and feel should be rendered. This flag is used by the
     * component UI delegates as a hint to determine which style the component
     * should be rendered.
     *
     * @return true if Windows 95 and Windows NT 4 look and feel should
     *         be rendered
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public static boolean isMnemonicHidden() {

    /**
     * Gets the state of the hide mnemonic flag. This only has meaning
     * if this feature is supported by the underlying OS.
     *
     * @return true if mnemonics are hidden, otherwise, false
     * @see #setMnemonicHidden
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public static void setMnemonicHidden(boolean hide) {

    /**
     * Sets the state of the hide mnemonic flag. This flag is used by the
     * component UI delegates to determine if the mnemonic should be rendered.
     * This method is a non operation if the underlying operating system
     * does not support the mnemonic hiding feature.
     *
     * @param hide true if mnemonics should be hidden
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private Object getDesktopFontValue(String fontName, Object backup) {

    /**
     * If we support loading of fonts from the desktop this will return
     * a DesktopProperty representing the font. If the font can't be
     * represented in the current encoding this will return null and
     * turn off the use of system fonts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private void initResourceBundle(UIDefaults table) {

   /**
     * Initialize the defaults table with the name of the ResourceBundle
     * used for getting localized defaults.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    protected void initSystemColorDefaults(UIDefaults table)

    /**
     * Load the SystemColors into the defaults table.  The keys
     * for SystemColor defaults are the same as the names of
     * the public fields in SystemColor.  If the table is being
     * created on a native Windows platform we use the SystemColor
     * values, otherwise we create color objects whose values match
     * the defaults Windows95 colors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    protected void initClassDefaults(UIDefaults table)

    /**
     * Initialize the uiClassID to BasicComponentUI mapping.
     * The JComponent classes define their own uiClassID constants
     * (see AbstractComponent.getUIClassID).  This table must
     * map those constants to a BasicComponentUI class of the
     * appropriate type.
     *
     * @see BasicLookAndFeel#getDefaults
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private int baseUnitY;

    /**
     * Base dialog units along the vertical axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private int baseUnitX;

    /**
     * Base dialog units along the horizontal axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    static final Object HI_RES_DISABLED_ICON_CLIENT_KEY =

    /**
     * A client property that can be used with any JComponent that will end up
     * calling the LookAndFeel.getDisabledIcon method. This client property,
     * when set to Boolean.TRUE, will cause getDisabledIcon to use an
     * alternate algorithm for creating disabled icons to produce icons
     * that appear similar to the native Windows file chooser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
public class WindowsLookAndFeel extends BasicLookAndFeel

/**
 * Implements the Windows95/98/NT/2000 Look and Feel.
 * UI classes not implemented specifically for Windows will
 * default to those implemented in Basic.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 *
 * @author unattributed
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public Icon getDisabledIcon(JComponent component, Icon icon) {

    /**
     * {@inheritDoc}
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private void calculateBaseUnits() {

    /**
     * Calculates the dialog unit mapping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private int dluToPixels(int dlu, int direction) {

    /**
     * Converts the dialog unit argument to pixels along the specified
     * axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class XPValue implements UIDefaults.ActiveValue {

    /**
     * A value wrapper that actively retrieves values from xp or falls back
     * to the classic value if not running XP styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class WindowsFontSizeProperty extends DesktopProperty {

    /**
     * DesktopProperty for fonts that only gets sizes from the desktop,
     * font name and style are passed into the constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class WindowsFontProperty extends DesktopProperty {

    /**
     * DesktopProperty for fonts. If a font with the name 'MS Sans Serif'
     * is returned, it is mapped to 'Microsoft Sans Serif'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public int getIconHeight() {

        /**
         * Returns the icon's height.
         *
         * @return an int specifying the fixed height of the icon.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public int getIconWidth() {

        /**
         * Returns the icon's width.
         *
         * @return an int specifying the fixed width of the icon.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public void paintIcon(Component c, Graphics g, int x, int y) {

        /**
         * Draw the icon at the specified location.  Icon implementations
         * may use the Component argument to get properties useful for
         * painting, e.g. the foreground or background color.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class SkinIcon implements Icon, UIResource {

    /**
     * Icon backed-up by XP Skin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private class ActiveWindowsIcon implements UIDefaults.ActiveValue {

    /**
     * Gets an <code>Icon</code> from the native libraries if available.
     * A desktop property is used to trigger reloading the icon when needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class LazyWindowsIcon implements UIDefaults.LazyValue {

    /**
     * Gets an <code>Icon</code> from the native libraries if available,
     * otherwise gets it from an image resource file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
        public AudioAction(String name, String resource) {

        /**
         * We use the String as the name of the Action and as a pointer to
         * the underlying OSes audio resource.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private static class AudioAction extends AbstractAction {

    /**
     * Pass the name String to the super constructor. This is used
     * later to identify the Action and decide whether to play it or
     * not. Store the resource String. It is used to get the audio
     * resource. In this case, the resource is a <code>Runnable</code>
     * supplied by <code>Toolkit</code>. This <code>Runnable</code> is
     * effectively a pointer down into the Win32 OS that knows how to
     * play the right sound.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    protected Action createAudioAction(Object key) {

    /**
     * Returns an <code>Action</code>.
     * <P>
     * This Action contains the information and logic to render an
     * auditory cue. The <code>Object</code> that is passed to this
     * method contains the information needed to render the auditory
     * cue. Normally, this <code>Object</code> is a <code>String</code>
     * that points to a <code>Toolkit</code> <code>desktopProperty</code>.
     * This <code>desktopProperty</code> is resolved by AWT and the
     * Windows OS.
     * <P>
     * This <code>Action</code>'s <code>actionPerformed</code> method
     * is fired by the <code>playSound</code> method.
     *
     * @return      an Action which knows how to render the auditory
     *              cue for one particular system or user activity
     * @see #playSound(Action)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public LayoutStyle getLayoutStyle() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
     public void provideErrorFeedback(Component component) {

    /**
     * <p>
     * Invoked when the user attempts an invalid operation,
     * such as pasting into an uneditable <code>JTextField</code>
     * that has focus.
     * </p>
     * <p>
     * If the user has enabled visual error indication on
     * the desktop, this method will flash the caption bar
     * of the active window. The user can also set the
     * property awt.visualbell=true to achieve the same
     * results.
     * </p>
     *
     * @param component Component the error occurred in, may be
     *                  null indicating the error condition is
     *                  not directly associated with a
     *                  <code>Component</code>.
     *
     * @see javax.swing.LookAndFeel#provideErrorFeedback
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public static boolean isClassicWindows() {

    /**
     * Gets the state of the flag which indicates if the old Windows
     * look and feel should be rendered. This flag is used by the
     * component UI delegates as a hint to determine which style the component
     * should be rendered.
     *
     * @return true if Windows 95 and Windows NT 4 look and feel should
     *         be rendered
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public static boolean isMnemonicHidden() {

    /**
     * Gets the state of the hide mnemonic flag. This only has meaning
     * if this feature is supported by the underlying OS.
     *
     * @return true if mnemonics are hidden, otherwise, false
     * @see #setMnemonicHidden
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    public static void setMnemonicHidden(boolean hide) {

    /**
     * Sets the state of the hide mnemonic flag. This flag is used by the
     * component UI delegates to determine if the mnemonic should be rendered.
     * This method is a non operation if the underlying operating system
     * does not support the mnemonic hiding feature.
     *
     * @param hide true if mnemonics should be hidden
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private Object getDesktopFontValue(String fontName, Object backup) {

    /**
     * If we support loading of fonts from the desktop this will return
     * a DesktopProperty representing the font. If the font can't be
     * represented in the current encoding this will return null and
     * turn off the use of system fonts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private void initResourceBundle(UIDefaults table) {

   /**
     * Initialize the defaults table with the name of the ResourceBundle
     * used for getting localized defaults.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    protected void initSystemColorDefaults(UIDefaults table)

    /**
     * Load the SystemColors into the defaults table.  The keys
     * for SystemColor defaults are the same as the names of
     * the public fields in SystemColor.  If the table is being
     * created on a native Windows platform we use the SystemColor
     * values, otherwise we create color objects whose values match
     * the defaults Windows95 colors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    protected void initClassDefaults(UIDefaults table)

    /**
     * Initialize the uiClassID to BasicComponentUI mapping.
     * The JComponent classes define their own uiClassID constants
     * (see AbstractComponent.getUIClassID).  This table must
     * map those constants to a BasicComponentUI class of the
     * appropriate type.
     *
     * @see BasicLookAndFeel#getDefaults
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private int baseUnitY;

    /**
     * Base dialog units along the vertical axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    private int baseUnitX;

    /**
     * Base dialog units along the horizontal axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
    static final Object HI_RES_DISABLED_ICON_CLIENT_KEY =

    /**
     * A client property that can be used with any JComponent that will end up
     * calling the LookAndFeel.getDisabledIcon method. This client property,
     * when set to Boolean.TRUE, will cause getDisabledIcon to use an
     * alternate algorithm for creating disabled icons to produce icons
     * that appear similar to the native Windows file chooser
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/WindowsLookAndFeel.java
public class WindowsLookAndFeel extends BasicLookAndFeel

/**
 * Implements the Windows95/98/NT/2000 Look and Feel.
 * UI classes not implemented specifically for Windows will
 * default to those implemented in Basic.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases.  The current serialization support is appropriate
 * for short term storage or RMI between applications running the same
 * version of Swing.  A future release of Swing will provide support for
 * long term persistence.
 *
 * @author unattributed
 */
