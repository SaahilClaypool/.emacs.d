_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    protected String paramString() {

    /**
     * Returns the parameter string representing the state of this
     * MenuShortcut. This string is useful for debugging.
     * @return    the parameter string of this MenuShortcut.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public String toString() {

    /**
     * Returns an internationalized description of the MenuShortcut.
     * @return a string representation of this MenuShortcut.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public int hashCode() {

    /**
     * Returns the hashcode for this MenuShortcut.
     * @return the hashcode for this MenuShortcut.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public boolean equals(Object obj) {

    /**
     * Returns whether this MenuShortcut is the same as another:
     * equality is defined to mean that both MenuShortcuts use the same key
     * and both either use or don't use the SHIFT key.
     * @param obj the Object to compare with this.
     * @return <code>true</code> if this MenuShortcut is the same as another,
     * <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public boolean equals(MenuShortcut s) {

    /**
     * Returns whether this MenuShortcut is the same as another:
     * equality is defined to mean that both MenuShortcuts use the same key
     * and both either use or don't use the SHIFT key.
     * @param s the MenuShortcut to compare with this.
     * @return <code>true</code> if this MenuShortcut is the same as another,
     * <code>false</code> otherwise.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public boolean usesShiftModifier() {

    /**
     * Returns whether this MenuShortcut must be invoked using the SHIFT key.
     * @return <code>true</code> if this MenuShortcut must be invoked using the
     * SHIFT key, <code>false</code> otherwise.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public int getKey() {

    /**
     * Returns the raw keycode of this MenuShortcut.
     * @return the raw keycode of this MenuShortcut.
     * @see java.awt.event.KeyEvent
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public MenuShortcut(int key, boolean useShiftModifier) {

    /**
     * Constructs a new MenuShortcut for the specified virtual keycode.
     * @param key the raw keycode for this MenuShortcut, as would be returned
     * in the keyCode field of a {@link java.awt.event.KeyEvent KeyEvent} if
     * this key were pressed.
     * @param useShiftModifier indicates whether this MenuShortcut is invoked
     * with the SHIFT key down.
     * @see java.awt.event.KeyEvent
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public MenuShortcut(int key) {

    /**
     * Constructs a new MenuShortcut for the specified virtual keycode.
     * @param key the raw keycode for this MenuShortcut, as would be returned
     * in the keyCode field of a {@link java.awt.event.KeyEvent KeyEvent} if
     * this key were pressed.
     * @see java.awt.event.KeyEvent
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    boolean usesShift;

    /**
     * Indicates whether the shft key was pressed.
     * If true, the shift key was pressed.
     * If false, the shift key was not pressed
     *
     * @serial
     * @see #usesShiftModifier()
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    int key;

    /**
     * The virtual keycode for the menu shortcut.
     * This is the keycode with which the menu shortcut will be created.
     * Note that it is a virtual keycode, not a character,
     * e.g. KeyEvent.VK_A, not 'a'.
     * Note: in 1.1.x you must use setActionCommand() on a menu item
     * in order for its shortcut to work, otherwise it will fire a null
     * action command.
     *
     * @serial
     * @see #getKey()
     * @see #usesShiftModifier()
     * @see java.awt.event.KeyEvent
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
public class MenuShortcut implements java.io.Serializable

/**
 * The <code>MenuShortcut</code>class represents a keyboard accelerator
 * for a MenuItem.
 * <p>
 * Menu shortcuts are created using virtual keycodes, not characters.
 * For example, a menu shortcut for Ctrl-a (assuming that Control is
 * the accelerator key) would be created with code like the following:
 * <p>
 * <code>MenuShortcut ms = new MenuShortcut(KeyEvent.VK_A, false);</code>
 * <p> or alternatively
 * <p>
 * <code>MenuShortcut ms = new MenuShortcut(KeyEvent.getExtendedKeyCodeForChar('A'), false);</code>
 * <p>
 * Menu shortcuts may also be constructed for a wider set of keycodes
 * using the <code>java.awt.event.KeyEvent.getExtendedKeyCodeForChar</code> call.
 * For example, a menu shortcut for "Ctrl+cyrillic ef" is created by
 * <p>
 * <code>MenuShortcut ms = new MenuShortcut(KeyEvent.getExtendedKeyCodeForChar('\u0444'), false);</code>
 * <p>
 * Note that shortcuts created with a keycode or an extended keycode defined as a constant in <code>KeyEvent</code>
 * work regardless of the current keyboard layout. However, a shortcut made of
 * an extended keycode not listed in <code>KeyEvent</code>
 * only work if the current keyboard layout produces a corresponding letter.
 * <p>
 * The accelerator key is platform-dependent and may be obtained
 * via {@link Toolkit#getMenuShortcutKeyMask}.
 *
 * @author Thomas Ball
 * @since JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    protected String paramString() {

    /**
     * Returns the parameter string representing the state of this
     * MenuShortcut. This string is useful for debugging.
     * @return    the parameter string of this MenuShortcut.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public String toString() {

    /**
     * Returns an internationalized description of the MenuShortcut.
     * @return a string representation of this MenuShortcut.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public int hashCode() {

    /**
     * Returns the hashcode for this MenuShortcut.
     * @return the hashcode for this MenuShortcut.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public boolean equals(Object obj) {

    /**
     * Returns whether this MenuShortcut is the same as another:
     * equality is defined to mean that both MenuShortcuts use the same key
     * and both either use or don't use the SHIFT key.
     * @param obj the Object to compare with this.
     * @return <code>true</code> if this MenuShortcut is the same as another,
     * <code>false</code> otherwise.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public boolean equals(MenuShortcut s) {

    /**
     * Returns whether this MenuShortcut is the same as another:
     * equality is defined to mean that both MenuShortcuts use the same key
     * and both either use or don't use the SHIFT key.
     * @param s the MenuShortcut to compare with this.
     * @return <code>true</code> if this MenuShortcut is the same as another,
     * <code>false</code> otherwise.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public boolean usesShiftModifier() {

    /**
     * Returns whether this MenuShortcut must be invoked using the SHIFT key.
     * @return <code>true</code> if this MenuShortcut must be invoked using the
     * SHIFT key, <code>false</code> otherwise.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public int getKey() {

    /**
     * Returns the raw keycode of this MenuShortcut.
     * @return the raw keycode of this MenuShortcut.
     * @see java.awt.event.KeyEvent
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public MenuShortcut(int key, boolean useShiftModifier) {

    /**
     * Constructs a new MenuShortcut for the specified virtual keycode.
     * @param key the raw keycode for this MenuShortcut, as would be returned
     * in the keyCode field of a {@link java.awt.event.KeyEvent KeyEvent} if
     * this key were pressed.
     * @param useShiftModifier indicates whether this MenuShortcut is invoked
     * with the SHIFT key down.
     * @see java.awt.event.KeyEvent
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    public MenuShortcut(int key) {

    /**
     * Constructs a new MenuShortcut for the specified virtual keycode.
     * @param key the raw keycode for this MenuShortcut, as would be returned
     * in the keyCode field of a {@link java.awt.event.KeyEvent KeyEvent} if
     * this key were pressed.
     * @see java.awt.event.KeyEvent
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    boolean usesShift;

    /**
     * Indicates whether the shft key was pressed.
     * If true, the shift key was pressed.
     * If false, the shift key was not pressed
     *
     * @serial
     * @see #usesShiftModifier()
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
    int key;

    /**
     * The virtual keycode for the menu shortcut.
     * This is the keycode with which the menu shortcut will be created.
     * Note that it is a virtual keycode, not a character,
     * e.g. KeyEvent.VK_A, not 'a'.
     * Note: in 1.1.x you must use setActionCommand() on a menu item
     * in order for its shortcut to work, otherwise it will fire a null
     * action command.
     *
     * @serial
     * @see #getKey()
     * @see #usesShiftModifier()
     * @see java.awt.event.KeyEvent
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuShortcut.java
public class MenuShortcut implements java.io.Serializable

/**
 * The <code>MenuShortcut</code>class represents a keyboard accelerator
 * for a MenuItem.
 * <p>
 * Menu shortcuts are created using virtual keycodes, not characters.
 * For example, a menu shortcut for Ctrl-a (assuming that Control is
 * the accelerator key) would be created with code like the following:
 * <p>
 * <code>MenuShortcut ms = new MenuShortcut(KeyEvent.VK_A, false);</code>
 * <p> or alternatively
 * <p>
 * <code>MenuShortcut ms = new MenuShortcut(KeyEvent.getExtendedKeyCodeForChar('A'), false);</code>
 * <p>
 * Menu shortcuts may also be constructed for a wider set of keycodes
 * using the <code>java.awt.event.KeyEvent.getExtendedKeyCodeForChar</code> call.
 * For example, a menu shortcut for "Ctrl+cyrillic ef" is created by
 * <p>
 * <code>MenuShortcut ms = new MenuShortcut(KeyEvent.getExtendedKeyCodeForChar('\u0444'), false);</code>
 * <p>
 * Note that shortcuts created with a keycode or an extended keycode defined as a constant in <code>KeyEvent</code>
 * work regardless of the current keyboard layout. However, a shortcut made of
 * an extended keycode not listed in <code>KeyEvent</code>
 * only work if the current keyboard layout produces a corresponding letter.
 * <p>
 * The accelerator key is platform-dependent and may be obtained
 * via {@link Toolkit#getMenuShortcutKeyMask}.
 *
 * @author Thomas Ball
 * @since JDK1.1
 */
