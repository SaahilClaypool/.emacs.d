_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private void readObject(ObjectInputStream s)

    /**
     * Sets new modifiers by the old ones. The key modifiers
     * override overlaping mouse modifiers.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private void setOldModifiers() {

    /**
     * Sets old modifiers by the new ones.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private void setNewModifiers() {

    /**
     * Sets new modifiers by the old ones. The key modifiers
     * override overlaping mouse modifiers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static int getExtendedKeyCodeForChar(int c) {

    /**
     * Returns an extended key code for a unicode character.
     *
     * @return for a unicode character with a corresponding {@code VK_} constant -- this
     *   {@code VK_} constant; for a character appearing on the primary
     *   level of a known keyboard layout -- a unique integer.
     *   If a character does not appear on the primary level of a known keyboard,
     *   {@code VK_UNDEFINED} is returned.
     *
     * @since 1.7
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public  int getExtendedKeyCode() {

    /**
     * Returns an extended key code for the event.
     * The extended key code is a unique id assigned to  a key on the keyboard
     * just like {@code keyCode}. However, unlike {@code keyCode}, this value depends on the
     * current keyboard layout. For instance, pressing the left topmost letter key
     * in a common English layout produces the same value as {@code keyCode}, {@code VK_Q}.
     * Pressing the same key in a regular Russian layout gives another code, unique for the
     * letter "Cyrillic I short".
     *
     * @since 1.7
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event logging and for debugging.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public boolean isActionKey() {

    /**
     * Returns whether the key in this event is an "action" key.
     * Typically an action key does not fire a unicode character and is
     * not a modifier key.
     *
     * @return <code>true</code> if the key is an "action" key,
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static String getKeyModifiersText(int modifiers) {

    /**
     * Returns a <code>String</code> describing the modifier key(s),
     * such as "Shift", or "Ctrl+Shift".  These strings can be
     * localized by changing the <code>awt.properties</code> file.
     * <p>
     * Note that <code>InputEvent.ALT_MASK</code> and
     * <code>InputEvent.BUTTON2_MASK</code> have the same value,
     * so the string "Alt" is returned for both modifiers.  Likewise,
     * <code>InputEvent.META_MASK</code> and
     * <code>InputEvent.BUTTON3_MASK</code> have the same value,
     * so the string "Meta" is returned for both modifiers.
     *
     * @return string a text description of the combination of modifier
     *                keys that were held down during the event
     * @see InputEvent#getModifiersExText(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static String getKeyText(int keyCode) {

    /**
     * Returns a String describing the keyCode, such as "HOME", "F1" or "A".
     * These strings can be localized by changing the awt.properties file.
     *
     * @return a string containing a text description for a physical key,
     *         identified by its keyCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public int getKeyLocation() {

    /**
     * Returns the location of the key that originated this key event.
     *
     * Some keys occur more than once on a keyboard, e.g. the left and
     * right shift keys.  Additionally, some keys occur on the numeric
     * keypad.  This provides a way of distinguishing such keys.
     *
     * @return the location of the key that was pressed or released.
     *         Always returns <code>KEY_LOCATION_UNKNOWN</code> for
     *         <code>KEY_TYPED</code> events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    @Deprecated

    /**
     * Set the modifiers to indicate additional keys that were held down
     * (e.g. shift, ctrl, alt, meta) defined as part of InputEvent.
     * <p>
     * NOTE:  use of this method is not recommended, because many AWT
     * implementations do not recognize modifier changes.  This is
     * especially true for <code>KEY_TYPED</code> events where the shift
     * modifier is changed.
     *
     * @param modifiers an integer combination of the modifier constants.
     * @see InputEvent
     * @deprecated as of JDK1.1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public void setKeyChar(char keyChar) {

    /**
     * Set the keyChar value to indicate a logical character.
     *
     * @param keyChar a char corresponding to to the combination of keystrokes
     *                that make up this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public char getKeyChar() {

    /**
     * Returns the character associated with the key in this event.
     * For example, the <code>KEY_TYPED</code> event for shift + "a"
     * returns the value for "A".
     * <p>
     * <code>KEY_PRESSED</code> and <code>KEY_RELEASED</code> events
     * are not intended for reporting of character input.  Therefore,
     * the values returned by this method are guaranteed to be
     * meaningful only for <code>KEY_TYPED</code> events.
     *
     * @return the Unicode character defined for this key event.
     *         If no valid Unicode character exists for this key event,
     *         <code>CHAR_UNDEFINED</code> is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public void setKeyCode(int keyCode) {

    /**
     * Set the keyCode value to indicate a physical key.
     *
     * @param keyCode an integer corresponding to an actual key on the keyboard.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public int getKeyCode() {

    /**
     * Returns the integer keyCode associated with the key in this event.
     *
     * @return the integer code for an actual key on the keyboard.
     *         (For <code>KEY_TYPED</code> events, the keyCode is
     *         <code>VK_UNDEFINED</code>.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    @Deprecated

    /**
     * @deprecated as of JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public KeyEvent(Component source, int id, long when, int modifiers,
                    int keyCode, char keyChar) {

    /**
     * Constructs a <code>KeyEvent</code> object.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source    The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                  For information on allowable values, see
     *                  the class description for {@link KeyEvent}
     * @param when      A long integer that specifies the time the event
     *                  occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers The modifier keys down during event (shift, ctrl,
     *                  alt, meta).
     *                     Passing negative value
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed.
     *                  Use either an extended _DOWN_MASK or old _MASK modifiers,
     *                  however do not mix models in the one event.
     *                  The extended modifiers are preferred for using
     * @param keyCode   The integer code for an actual key, or VK_UNDEFINED
     *                  (for a key-typed event)
     * @param keyChar   The Unicode character generated by this event, or
     *                  CHAR_UNDEFINED (for key-pressed and key-released
     *                  events which do not map to a valid Unicode character)
     * @throws IllegalArgumentException  if <code>id</code> is
     *     <code>KEY_TYPED</code> and <code>keyChar</code> is
     *     <code>CHAR_UNDEFINED</code>; or if <code>id</code> is
     *     <code>KEY_TYPED</code> and <code>keyCode</code> is not
     *     <code>VK_UNDEFINED</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getKeyCode()
     * @see #getKeyChar()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public KeyEvent(Component source, int id, long when, int modifiers,
                    int keyCode, char keyChar, int keyLocation) {

    /**
     * Constructs a <code>KeyEvent</code> object.
     * <p>This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source    The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                  For information on allowable values, see
     *                  the class description for {@link KeyEvent}
     * @param when      A long integer that specifies the time the event
     *                  occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers The modifier keys down during event (shift, ctrl,
     *                  alt, meta).
     *                     Passing negative value
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed.
     *                  Use either an extended _DOWN_MASK or old _MASK modifiers,
     *                  however do not mix models in the one event.
     *                  The extended modifiers are preferred for using
     * @param keyCode   The integer code for an actual key, or VK_UNDEFINED
     *                  (for a key-typed event)
     * @param keyChar   The Unicode character generated by this event, or
     *                  CHAR_UNDEFINED (for key-pressed and key-released
     *                  events which do not map to a valid Unicode character)
     * @param keyLocation  Identifies the key location.  The only legal
     *        values are <code>KEY_LOCATION_UNKNOWN</code>,
     *        <code>KEY_LOCATION_STANDARD</code>, <code>KEY_LOCATION_LEFT</code>,
     *        <code>KEY_LOCATION_RIGHT</code>, and <code>KEY_LOCATION_NUMPAD</code>.
     * @throws IllegalArgumentException
     *     if <code>id</code> is <code>KEY_TYPED</code> and
     *       <code>keyChar</code> is <code>CHAR_UNDEFINED</code>;
     *     or if <code>id</code> is <code>KEY_TYPED</code> and
     *       <code>keyCode</code> is not <code>VK_UNDEFINED</code>;
     *     or if <code>id</code> is <code>KEY_TYPED</code> and
     *       <code>keyLocation</code> is not <code>KEY_LOCATION_UNKNOWN</code>;
     *     or if <code>keyLocation</code> is not one of the legal
     *       values enumerated above.
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getKeyCode()
     * @see #getKeyChar()
     * @see #getKeyLocation()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private Component originalSource;

    /**
     * The original event source.
     *
     * Event source can be changed during processing, but in some cases
     * we need to be able to obtain original source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    int keyLocation;

    /**
     * The location of the key on the keyboard.
     *
     * Some keys occur more than once on a keyboard, e.g. the left and
     * right shift keys.  Additionally, some keys occur on the numeric
     * keypad.  This variable is used to distinguish such keys.
     *
     * The only legal values are <code>KEY_LOCATION_UNKNOWN</code>,
     * <code>KEY_LOCATION_STANDARD</code>, <code>KEY_LOCATION_LEFT</code>,
     * <code>KEY_LOCATION_RIGHT</code>, and <code>KEY_LOCATION_NUMPAD</code>.
     *
     * @serial
     * @see #getKeyLocation()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    char keyChar;

    /**
     * <code>keyChar</code> is a valid unicode character
     * that is fired by a key or a key combination on
     * a keyboard.
     *
     * @serial
     * @see #getKeyChar()
     * @see #setKeyChar(char)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    int  keyCode;

    /**
     * The unique value assigned to each of the keys on the
     * keyboard.  There is a common set of key codes that
     * can be fired by most keyboards.
     * The symbolic name for a key code should be used rather
     * than the code value itself.
     *
     * @serial
     * @see #getKeyCode()
     * @see #setKeyCode(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_NUMPAD   = 4;

    /**
     * A constant indicating that the key event originated on the
     * numeric keypad or with a virtual key corresponding to the
     * numeric keypad.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_RIGHT    = 3;

    /**
     * A constant indicating that the key pressed or released is in
     * the right key location (there is more than one possible location
     * for this key).  Example: the right shift key.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_LEFT     = 2;

    /**
     * A constant indicating that the key pressed or released is in
     * the left key location (there is more than one possible location
     * for this key).  Example: the left shift key.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_STANDARD = 1;

    /**
     * A constant indicating that the key pressed or released
     * is not distinguished as the left or right version of a key,
     * and did not originate on the numeric keypad (or did not
     * originate with a virtual key corresponding to the numeric
     * keypad).
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_UNKNOWN  = 0;

    /**
     * A constant indicating that the keyLocation is indeterminate
     * or not relevant.
     * <code>KEY_TYPED</code> events do not have a keyLocation; this value
     * is used instead.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final char CHAR_UNDEFINED   = 0xFFFF;

    /**
     * KEY_PRESSED and KEY_RELEASED events which do not map to a
     * valid Unicode character use this for the keyChar value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_UNDEFINED      = 0x0;

    /**
     * This value is used to indicate that the keyCode is unknown.
     * KEY_TYPED events do not have a keyCode value; this value
     * is used instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_BEGIN                    = 0xFF58;

    /**
     * Constant for the Begin key.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_ALT_GRAPH                = 0xFF7E;

    /**
     * Constant for the AltGraph function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_COMPOSE                  = 0xFF20;

    /**
     * Constant for the Compose function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PROPS                    = 0xFFCA;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_AGAIN                    = 0xFFC9;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PASTE                    = 0xFFCF;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CUT                      = 0xFFD1;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: kanji. Japanese Solaris keyboard: nihongo */

    /**
     * Constant for the input method on/off key.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard with special Windows driver - eisuu + Control; Japanese Solaris keyboard: kana */

    /**
     * Constant for the locking Kana function key.
     * This key locks the keyboard into a Kana layout.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Macintosh keyboard */

    /**
     * Constant for the Japanese-Roman function key.
     * This key switches to a Japanese input method and selects its Roman-Direct input mode.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Macintosh keyboard */

    /**
     * Constant for the Japanese-Hiragana function key.
     * This key switches to a Japanese input method and selects its Hiragana input mode.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Macintosh keyboard - VK_JAPANESE_HIRAGANA + SHIFT */

    /**
     * Constant for the Japanese-Katakana function key.
     * This key switches to a Japanese input method and selects its Katakana input mode.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard - VK_ALPHANUMERIC + ALT: kanji bangou */

    /**
     * Constant for the Code Input function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard - VK_CONVERT + SHIFT: maekouho */

    /**
     * Constant for the Previous Candidate function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard - VK_CONVERT + ALT: zenkouho */

    /**
     * Constant for the All Candidates function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: roumaji */

    /**
     * Constant for the Roman Characters function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: hankaku */

    /**
     * Constant for the Half-Width Characters function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: zenkaku */

    /**
     * Constant for the Full-Width Characters function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: hiragana */

    /**
     * Constant for the Hiragana function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: katakana */

    /**
     * Constant for the Katakana function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: eisuu */

    /**
     * Constant for the Alphanumeric function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Solaris keyboard: kakutei */

    /** Constant for the Accept or Commit function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: muhenkan */

    /** Constant for the Don't Convert function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard, Japanese Solaris keyboard: henkan */

    /** Constant for the Convert function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CONTEXT_MENU             = 0x020D;

    /**
     * Constant for the Microsoft Windows Context Menu key.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_WINDOWS                  = 0x020C;

    /**
     * Constant for the Microsoft Windows "Windows" key.
     * It is used for both the left and right version of the key.
     * @see #getKeyLocation()
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_UNDERSCORE               = 0x020B;

    /**
     * Constant for the "_" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_RIGHT_PARENTHESIS        = 0x020A;

    /**
     * Constant for the ")" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PLUS                     = 0x0209;

    /**
     * Constant for the "+" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_NUMBER_SIGN              = 0x0208;

    /**
     * Constant for the "#" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_LEFT_PARENTHESIS         = 0x0207;

    /**
     * Constant for the "(" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_INVERTED_EXCLAMATION_MARK = 0x0206;

    /**
     * Constant for the inverted exclamation mark key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_EXCLAMATION_MARK         = 0x0205;

    /**
     * Constant for the "!" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_EURO_SIGN                = 0x0204;

    /**
     * Constant for the Euro currency sign key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DOLLAR                   = 0x0203;

    /**
     * Constant for the "$" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CIRCUMFLEX               = 0x0202;

    /**
     * Constant for the "^" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_COLON                    = 0x0201;

    /**
     * Constant for the ":" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_AT                       = 0x0200;

    /**
     * Constant for the "@" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_BRACERIGHT               = 0xa2;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_GREATER                  = 0xa0;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_QUOTEDBL                 = 0x98;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_AMPERSAND                = 0x96;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_VOICED_SOUND        = 0x8e;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_OGONEK              = 0x8c;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_CARON               = 0x8a;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_ABOVERING           = 0x88;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_ABOVEDOT            = 0x86;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_MACRON              = 0x84;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_CIRCUMFLEX          = 0x82;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_GRAVE               = 0x80;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_RIGHT       = 0xE3;

    /**
     * Constant for the numeric keypad <b>right</b> arrow key.
     * @see #VK_RIGHT
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_LEFT        = 0xE2;

    /**
     * Constant for the numeric keypad <b>left</b> arrow key.
     * @see #VK_LEFT
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_DOWN        = 0xE1;

    /**
     * Constant for the numeric keypad <b>down</b> arrow key.
     * @see #VK_DOWN
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_UP          = 0xE0;

    /**
     * Constant for the numeric keypad <b>up</b> arrow key.
     * @see #VK_UP
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F24            = 0xF00B;

    /**
     * Constant for the F24 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F23            = 0xF00A;

    /**
     * Constant for the F23 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F22            = 0xF009;

    /**
     * Constant for the F22 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F21            = 0xF008;

    /**
     * Constant for the F21 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F20            = 0xF007;

    /**
     * Constant for the F20 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F19            = 0xF006;

    /**
     * Constant for the F19 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F18            = 0xF005;

    /**
     * Constant for the F18 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F17            = 0xF004;

    /**
     * Constant for the F17 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F16            = 0xF003;

    /**
     * Constant for the F16 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F15            = 0xF002;

    /**
     * Constant for the F15 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F14            = 0xF001;

    /**
     * Constant for the F14 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* F13 - F24 are used on IBM 3270 keyboard; use random range for constants. */

    /**
     * Constant for the F13 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F12            = 0x7B;

    /** Constant for the F12 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F11            = 0x7A;

    /** Constant for the F11 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F10            = 0x79;

    /** Constant for the F10 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F9             = 0x78;

    /** Constant for the F9 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F8             = 0x77;

    /** Constant for the F8 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F7             = 0x76;

    /** Constant for the F7 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F6             = 0x75;

    /** Constant for the F6 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F5             = 0x74;

    /** Constant for the F5 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F4             = 0x73;

    /** Constant for the F4 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F3             = 0x72;

    /** Constant for the F3 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F2             = 0x71;

    /** Constant for the F2 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F1             = 0x70;

    /** Constant for the F1 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SEPARATOR      = VK_SEPARATER;

    /**
     * Constant for the Numpad Separator key.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SEPARATER      = 0x6C;

    /**
     * This constant is obsolete, and is included only for backwards
     * compatibility.
     * @see #VK_SEPARATOR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CLOSE_BRACKET  = 0x5D;

    /**
     * Constant for the close bracket key, "]"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_BACK_SLASH     = 0x5C;

    /**
     * Constant for the back slash key, "\"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_OPEN_BRACKET   = 0x5B;

    /**
     * Constant for the open bracket key, "["
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_A              = 0x41;

    /** VK_A thru VK_Z are the same as ASCII 'A' thru 'Z' (0x41 - 0x5A) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_EQUALS         = 0x3D;

    /**
     * Constant for the equals key, "="
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SEMICOLON      = 0x3B;

    /**
     * Constant for the semicolon key, ";"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_0              = 0x30;

    /** VK_0 thru VK_9 are the same as ASCII '0' thru '9' (0x30 - 0x39) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SLASH          = 0x2F;

    /**
     * Constant for the forward slash key, "/"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PERIOD         = 0x2E;

    /**
     * Constant for the period key, "."
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_MINUS          = 0x2D;

    /**
     * Constant for the minus key, "-"
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_COMMA          = 0x2C;

    /**
     * Constant for the comma key, ","
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DOWN           = 0x28;

    /**
     * Constant for the non-numpad <b>down</b> arrow key.
     * @see #VK_KP_DOWN
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_RIGHT          = 0x27;

    /**
     * Constant for the non-numpad <b>right</b> arrow key.
     * @see #VK_KP_RIGHT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_UP             = 0x26;

    /**
     * Constant for the non-numpad <b>up</b> arrow key.
     * @see #VK_KP_UP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_LEFT           = 0x25;

    /**
     * Constant for the non-numpad <b>left</b> arrow key.
     * @see #VK_KP_LEFT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_RELEASED = 2 + KEY_FIRST; //Event.KEY_RELEASE

    /**
     * The "key released" event. This event is generated when a key
     * is let up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_PRESSED = 1 + KEY_FIRST; //Event.KEY_PRESS

    /**
     * The "key pressed" event. This event is generated when a key
     * is pushed down.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_TYPED = KEY_FIRST;

    /**
     * The "key typed" event.  This event is generated when a character is
     * entered.  In the simplest case, it is produced by a single key press.
     * Often, however, characters are produced by series of key presses, and
     * the mapping from key pressed events to key typed events may be
     * many-to-one or many-to-many.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LAST  = 402;

    /**
     * The last number in the range of ids used for key events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_FIRST = 400;

    /**
     * The first number in the range of ids used for key events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private boolean isProxyActive = false;

    /**
     * Stores the state of native event dispatching system
     * - true, if when the event was created event proxying
     *         mechanism was active
     * - false, if it was inactive
     * Used in Component.dispatchEventImpl to correctly dispatch
     * events when proxy is active
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
public class KeyEvent extends InputEvent {

/**
 * An event which indicates that a keystroke occurred in a component.
 * <p>
 * This low-level event is generated by a component object (such as a text
 * field) when a key is pressed, released, or typed.
 * The event is passed to every <code>KeyListener</code>
 * or <code>KeyAdapter</code> object which registered to receive such
 * events using the component's <code>addKeyListener</code> method.
 * (<code>KeyAdapter</code> objects implement the
 * <code>KeyListener</code> interface.)  Each such listener object
 * gets this <code>KeyEvent</code> when the event occurs.
 * <p>
 * <em>"Key typed" events</em> are higher-level and generally do not depend on
 * the platform or keyboard layout.  They are generated when a Unicode character
 * is entered, and are the preferred way to find out about character input.
 * In the simplest case, a key typed event is produced by a single key press
 * (e.g., 'a').  Often, however, characters are produced by series of key
 * presses (e.g., 'shift' + 'a'), and the mapping from key pressed events to
 * key typed events may be many-to-one or many-to-many.  Key releases are not
 * usually necessary to generate a key typed event, but there are some cases
 * where the key typed event is not generated until a key is released (e.g.,
 * entering ASCII sequences via the Alt-Numpad method in Windows).
 * No key typed events are generated for keys that don't generate Unicode
 * characters (e.g., action keys, modifier keys, etc.).
 * <p>
 * The getKeyChar method always returns a valid Unicode character or
 * CHAR_UNDEFINED.  Character input is reported by KEY_TYPED events:
 * KEY_PRESSED and KEY_RELEASED events are not necessarily associated
 * with character input.  Therefore, the result of the getKeyChar method
 * is guaranteed to be meaningful only for KEY_TYPED events.
 * <p>
 * For key pressed and key released events, the getKeyCode method returns
 * the event's keyCode.  For key typed events, the getKeyCode method
 * always returns {@code VK_UNDEFINED}. The {@code getExtendedKeyCode} method
 * may also be used with many international keyboard layouts.
 *
 * <p>
 * <em>"Key pressed" and "key released" events</em> are lower-level and depend
 * on the platform and keyboard layout. They are generated whenever a key is
 * pressed or released, and are the only way to find out about keys that don't
 * generate character input (e.g., action keys, modifier keys, etc.). The key
 * being pressed or released is indicated by the {@code getKeyCode} and {@code getExtendedKeyCode}
 * methods, which return a virtual key code.
 *
 * <p>
 * <em>Virtual key codes</em> are used to report which keyboard key has
 * been pressed, rather than a character generated by the combination
 * of one or more keystrokes (such as "A", which comes from shift and "a").
 *
 * <p>
 * For example, pressing the Shift key will cause a KEY_PRESSED event
 * with a VK_SHIFT keyCode, while pressing the 'a' key will result in
 * a VK_A keyCode.  After the 'a' key is released, a KEY_RELEASED event
 * will be fired with VK_A. Separately, a KEY_TYPED event with a keyChar
 * value of 'A' is generated.
 *
 * <p>
 * Pressing and releasing a key on the keyboard results in the generating
 * the following key events (in order):
 * <PRE>
 *    {@code KEY_PRESSED}
 *    {@code KEY_TYPED} (is only generated if a valid Unicode character could be generated.)
 *    {@code KEY_RELEASED}
 * </PRE>
 *
 * But in some cases (e.g. auto-repeat or input method is activated) the order
 * could be different (and platform dependent).
 *
 * <p>
 * Notes:
 * <ul>
 * <li>Key combinations which do not result in Unicode characters, such as action
 * keys like F1 and the HELP key, do not generate KEY_TYPED events.
 * <li>Not all keyboards or systems are capable of generating all
 * virtual key codes.  No attempt is made in Java to generate these keys
 * artificially.
 * <li>Virtual key codes do not identify a physical key: they depend on the
 * platform and keyboard layout. For example, the key that generates VK_Q
 * when using a U.S. keyboard layout will generate VK_A when using a French
 * keyboard layout.
 * <li>The key that generates {@code VK_Q} when using a U.S. keyboard layout also
 * generates a unique code for Russian or Hebrew layout. There is no a
 * {@code VK_} constant for these and many other codes in various layouts. These codes
 * may be obtained by using {@code getExtendedKeyCode} and are used whenever
 * a {@code VK_} constant is used.
 * <li>Not all characters have a keycode associated with them.  For example,
 * there is no keycode for the question mark because there is no keyboard
 * for which it appears on the primary layer.
 * <li>In order to support the platform-independent handling of action keys,
 * the Java platform uses a few additional virtual key constants for functions
 * that would otherwise have to be recognized by interpreting virtual key codes
 * and modifiers. For example, for Japanese Windows keyboards, VK_ALL_CANDIDATES
 * is returned instead of VK_CONVERT with the ALT modifier.
 * <li>As specified in <a href="../doc-files/FocusSpec.html">Focus Specification</a>
 * key events are dispatched to the focus owner by default.
 * </ul>
 *
 * <p>
 * WARNING: Aside from those keys that are defined by the Java language
 * (VK_ENTER, VK_BACK_SPACE, and VK_TAB), do not rely on the values of the VK_
 * constants.  Sun reserves the right to change these values as needed
 * to accommodate a wider range of keyboards in the future.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code KeyEvent} instance is not
 * in the range from {@code KEY_FIRST} to {@code KEY_LAST}.
 *
 * @author Carl Quinn
 * @author Amy Fowler
 * @author Norbert Lindenberg
 *
 * @see KeyAdapter
 * @see KeyListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/keylistener.html">Tutorial: Writing a Key Listener</a>
 *
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private void readObject(ObjectInputStream s)

    /**
     * Sets new modifiers by the old ones. The key modifiers
     * override overlaping mouse modifiers.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private void setOldModifiers() {

    /**
     * Sets old modifiers by the new ones.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private void setNewModifiers() {

    /**
     * Sets new modifiers by the old ones. The key modifiers
     * override overlaping mouse modifiers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static int getExtendedKeyCodeForChar(int c) {

    /**
     * Returns an extended key code for a unicode character.
     *
     * @return for a unicode character with a corresponding {@code VK_} constant -- this
     *   {@code VK_} constant; for a character appearing on the primary
     *   level of a known keyboard layout -- a unique integer.
     *   If a character does not appear on the primary level of a known keyboard,
     *   {@code VK_UNDEFINED} is returned.
     *
     * @since 1.7
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public  int getExtendedKeyCode() {

    /**
     * Returns an extended key code for the event.
     * The extended key code is a unique id assigned to  a key on the keyboard
     * just like {@code keyCode}. However, unlike {@code keyCode}, this value depends on the
     * current keyboard layout. For instance, pressing the left topmost letter key
     * in a common English layout produces the same value as {@code keyCode}, {@code VK_Q}.
     * Pressing the same key in a regular Russian layout gives another code, unique for the
     * letter "Cyrillic I short".
     *
     * @since 1.7
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event logging and for debugging.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public boolean isActionKey() {

    /**
     * Returns whether the key in this event is an "action" key.
     * Typically an action key does not fire a unicode character and is
     * not a modifier key.
     *
     * @return <code>true</code> if the key is an "action" key,
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static String getKeyModifiersText(int modifiers) {

    /**
     * Returns a <code>String</code> describing the modifier key(s),
     * such as "Shift", or "Ctrl+Shift".  These strings can be
     * localized by changing the <code>awt.properties</code> file.
     * <p>
     * Note that <code>InputEvent.ALT_MASK</code> and
     * <code>InputEvent.BUTTON2_MASK</code> have the same value,
     * so the string "Alt" is returned for both modifiers.  Likewise,
     * <code>InputEvent.META_MASK</code> and
     * <code>InputEvent.BUTTON3_MASK</code> have the same value,
     * so the string "Meta" is returned for both modifiers.
     *
     * @return string a text description of the combination of modifier
     *                keys that were held down during the event
     * @see InputEvent#getModifiersExText(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static String getKeyText(int keyCode) {

    /**
     * Returns a String describing the keyCode, such as "HOME", "F1" or "A".
     * These strings can be localized by changing the awt.properties file.
     *
     * @return a string containing a text description for a physical key,
     *         identified by its keyCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public int getKeyLocation() {

    /**
     * Returns the location of the key that originated this key event.
     *
     * Some keys occur more than once on a keyboard, e.g. the left and
     * right shift keys.  Additionally, some keys occur on the numeric
     * keypad.  This provides a way of distinguishing such keys.
     *
     * @return the location of the key that was pressed or released.
     *         Always returns <code>KEY_LOCATION_UNKNOWN</code> for
     *         <code>KEY_TYPED</code> events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    @Deprecated

    /**
     * Set the modifiers to indicate additional keys that were held down
     * (e.g. shift, ctrl, alt, meta) defined as part of InputEvent.
     * <p>
     * NOTE:  use of this method is not recommended, because many AWT
     * implementations do not recognize modifier changes.  This is
     * especially true for <code>KEY_TYPED</code> events where the shift
     * modifier is changed.
     *
     * @param modifiers an integer combination of the modifier constants.
     * @see InputEvent
     * @deprecated as of JDK1.1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public void setKeyChar(char keyChar) {

    /**
     * Set the keyChar value to indicate a logical character.
     *
     * @param keyChar a char corresponding to to the combination of keystrokes
     *                that make up this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public char getKeyChar() {

    /**
     * Returns the character associated with the key in this event.
     * For example, the <code>KEY_TYPED</code> event for shift + "a"
     * returns the value for "A".
     * <p>
     * <code>KEY_PRESSED</code> and <code>KEY_RELEASED</code> events
     * are not intended for reporting of character input.  Therefore,
     * the values returned by this method are guaranteed to be
     * meaningful only for <code>KEY_TYPED</code> events.
     *
     * @return the Unicode character defined for this key event.
     *         If no valid Unicode character exists for this key event,
     *         <code>CHAR_UNDEFINED</code> is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public void setKeyCode(int keyCode) {

    /**
     * Set the keyCode value to indicate a physical key.
     *
     * @param keyCode an integer corresponding to an actual key on the keyboard.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public int getKeyCode() {

    /**
     * Returns the integer keyCode associated with the key in this event.
     *
     * @return the integer code for an actual key on the keyboard.
     *         (For <code>KEY_TYPED</code> events, the keyCode is
     *         <code>VK_UNDEFINED</code>.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    @Deprecated

    /**
     * @deprecated as of JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public KeyEvent(Component source, int id, long when, int modifiers,
                    int keyCode, char keyChar) {

    /**
     * Constructs a <code>KeyEvent</code> object.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source    The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                  For information on allowable values, see
     *                  the class description for {@link KeyEvent}
     * @param when      A long integer that specifies the time the event
     *                  occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers The modifier keys down during event (shift, ctrl,
     *                  alt, meta).
     *                     Passing negative value
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed.
     *                  Use either an extended _DOWN_MASK or old _MASK modifiers,
     *                  however do not mix models in the one event.
     *                  The extended modifiers are preferred for using
     * @param keyCode   The integer code for an actual key, or VK_UNDEFINED
     *                  (for a key-typed event)
     * @param keyChar   The Unicode character generated by this event, or
     *                  CHAR_UNDEFINED (for key-pressed and key-released
     *                  events which do not map to a valid Unicode character)
     * @throws IllegalArgumentException  if <code>id</code> is
     *     <code>KEY_TYPED</code> and <code>keyChar</code> is
     *     <code>CHAR_UNDEFINED</code>; or if <code>id</code> is
     *     <code>KEY_TYPED</code> and <code>keyCode</code> is not
     *     <code>VK_UNDEFINED</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getKeyCode()
     * @see #getKeyChar()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public KeyEvent(Component source, int id, long when, int modifiers,
                    int keyCode, char keyChar, int keyLocation) {

    /**
     * Constructs a <code>KeyEvent</code> object.
     * <p>This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source    The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                  For information on allowable values, see
     *                  the class description for {@link KeyEvent}
     * @param when      A long integer that specifies the time the event
     *                  occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers The modifier keys down during event (shift, ctrl,
     *                  alt, meta).
     *                     Passing negative value
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed.
     *                  Use either an extended _DOWN_MASK or old _MASK modifiers,
     *                  however do not mix models in the one event.
     *                  The extended modifiers are preferred for using
     * @param keyCode   The integer code for an actual key, or VK_UNDEFINED
     *                  (for a key-typed event)
     * @param keyChar   The Unicode character generated by this event, or
     *                  CHAR_UNDEFINED (for key-pressed and key-released
     *                  events which do not map to a valid Unicode character)
     * @param keyLocation  Identifies the key location.  The only legal
     *        values are <code>KEY_LOCATION_UNKNOWN</code>,
     *        <code>KEY_LOCATION_STANDARD</code>, <code>KEY_LOCATION_LEFT</code>,
     *        <code>KEY_LOCATION_RIGHT</code>, and <code>KEY_LOCATION_NUMPAD</code>.
     * @throws IllegalArgumentException
     *     if <code>id</code> is <code>KEY_TYPED</code> and
     *       <code>keyChar</code> is <code>CHAR_UNDEFINED</code>;
     *     or if <code>id</code> is <code>KEY_TYPED</code> and
     *       <code>keyCode</code> is not <code>VK_UNDEFINED</code>;
     *     or if <code>id</code> is <code>KEY_TYPED</code> and
     *       <code>keyLocation</code> is not <code>KEY_LOCATION_UNKNOWN</code>;
     *     or if <code>keyLocation</code> is not one of the legal
     *       values enumerated above.
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getKeyCode()
     * @see #getKeyChar()
     * @see #getKeyLocation()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private Component originalSource;

    /**
     * The original event source.
     *
     * Event source can be changed during processing, but in some cases
     * we need to be able to obtain original source.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    int keyLocation;

    /**
     * The location of the key on the keyboard.
     *
     * Some keys occur more than once on a keyboard, e.g. the left and
     * right shift keys.  Additionally, some keys occur on the numeric
     * keypad.  This variable is used to distinguish such keys.
     *
     * The only legal values are <code>KEY_LOCATION_UNKNOWN</code>,
     * <code>KEY_LOCATION_STANDARD</code>, <code>KEY_LOCATION_LEFT</code>,
     * <code>KEY_LOCATION_RIGHT</code>, and <code>KEY_LOCATION_NUMPAD</code>.
     *
     * @serial
     * @see #getKeyLocation()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    char keyChar;

    /**
     * <code>keyChar</code> is a valid unicode character
     * that is fired by a key or a key combination on
     * a keyboard.
     *
     * @serial
     * @see #getKeyChar()
     * @see #setKeyChar(char)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    int  keyCode;

    /**
     * The unique value assigned to each of the keys on the
     * keyboard.  There is a common set of key codes that
     * can be fired by most keyboards.
     * The symbolic name for a key code should be used rather
     * than the code value itself.
     *
     * @serial
     * @see #getKeyCode()
     * @see #setKeyCode(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_NUMPAD   = 4;

    /**
     * A constant indicating that the key event originated on the
     * numeric keypad or with a virtual key corresponding to the
     * numeric keypad.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_RIGHT    = 3;

    /**
     * A constant indicating that the key pressed or released is in
     * the right key location (there is more than one possible location
     * for this key).  Example: the right shift key.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_LEFT     = 2;

    /**
     * A constant indicating that the key pressed or released is in
     * the left key location (there is more than one possible location
     * for this key).  Example: the left shift key.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_STANDARD = 1;

    /**
     * A constant indicating that the key pressed or released
     * is not distinguished as the left or right version of a key,
     * and did not originate on the numeric keypad (or did not
     * originate with a virtual key corresponding to the numeric
     * keypad).
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LOCATION_UNKNOWN  = 0;

    /**
     * A constant indicating that the keyLocation is indeterminate
     * or not relevant.
     * <code>KEY_TYPED</code> events do not have a keyLocation; this value
     * is used instead.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final char CHAR_UNDEFINED   = 0xFFFF;

    /**
     * KEY_PRESSED and KEY_RELEASED events which do not map to a
     * valid Unicode character use this for the keyChar value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_UNDEFINED      = 0x0;

    /**
     * This value is used to indicate that the keyCode is unknown.
     * KEY_TYPED events do not have a keyCode value; this value
     * is used instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_BEGIN                    = 0xFF58;

    /**
     * Constant for the Begin key.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_ALT_GRAPH                = 0xFF7E;

    /**
     * Constant for the AltGraph function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_COMPOSE                  = 0xFF20;

    /**
     * Constant for the Compose function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PROPS                    = 0xFFCA;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_AGAIN                    = 0xFFC9;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PASTE                    = 0xFFCF;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CUT                      = 0xFFD1;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: kanji. Japanese Solaris keyboard: nihongo */

    /**
     * Constant for the input method on/off key.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard with special Windows driver - eisuu + Control; Japanese Solaris keyboard: kana */

    /**
     * Constant for the locking Kana function key.
     * This key locks the keyboard into a Kana layout.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Macintosh keyboard */

    /**
     * Constant for the Japanese-Roman function key.
     * This key switches to a Japanese input method and selects its Roman-Direct input mode.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Macintosh keyboard */

    /**
     * Constant for the Japanese-Hiragana function key.
     * This key switches to a Japanese input method and selects its Hiragana input mode.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Macintosh keyboard - VK_JAPANESE_HIRAGANA + SHIFT */

    /**
     * Constant for the Japanese-Katakana function key.
     * This key switches to a Japanese input method and selects its Katakana input mode.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard - VK_ALPHANUMERIC + ALT: kanji bangou */

    /**
     * Constant for the Code Input function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard - VK_CONVERT + SHIFT: maekouho */

    /**
     * Constant for the Previous Candidate function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard - VK_CONVERT + ALT: zenkouho */

    /**
     * Constant for the All Candidates function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: roumaji */

    /**
     * Constant for the Roman Characters function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: hankaku */

    /**
     * Constant for the Half-Width Characters function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: zenkaku */

    /**
     * Constant for the Full-Width Characters function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: hiragana */

    /**
     * Constant for the Hiragana function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: katakana */

    /**
     * Constant for the Katakana function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: eisuu */

    /**
     * Constant for the Alphanumeric function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese Solaris keyboard: kakutei */

    /** Constant for the Accept or Commit function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard: muhenkan */

    /** Constant for the Don't Convert function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* Japanese PC 106 keyboard, Japanese Solaris keyboard: henkan */

    /** Constant for the Convert function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CONTEXT_MENU             = 0x020D;

    /**
     * Constant for the Microsoft Windows Context Menu key.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_WINDOWS                  = 0x020C;

    /**
     * Constant for the Microsoft Windows "Windows" key.
     * It is used for both the left and right version of the key.
     * @see #getKeyLocation()
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_UNDERSCORE               = 0x020B;

    /**
     * Constant for the "_" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_RIGHT_PARENTHESIS        = 0x020A;

    /**
     * Constant for the ")" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PLUS                     = 0x0209;

    /**
     * Constant for the "+" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_NUMBER_SIGN              = 0x0208;

    /**
     * Constant for the "#" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_LEFT_PARENTHESIS         = 0x0207;

    /**
     * Constant for the "(" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_INVERTED_EXCLAMATION_MARK = 0x0206;

    /**
     * Constant for the inverted exclamation mark key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_EXCLAMATION_MARK         = 0x0205;

    /**
     * Constant for the "!" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_EURO_SIGN                = 0x0204;

    /**
     * Constant for the Euro currency sign key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DOLLAR                   = 0x0203;

    /**
     * Constant for the "$" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CIRCUMFLEX               = 0x0202;

    /**
     * Constant for the "^" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_COLON                    = 0x0201;

    /**
     * Constant for the ":" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_AT                       = 0x0200;

    /**
     * Constant for the "@" key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_BRACERIGHT               = 0xa2;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_GREATER                  = 0xa0;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_QUOTEDBL                 = 0x98;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_AMPERSAND                = 0x96;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_VOICED_SOUND        = 0x8e;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_OGONEK              = 0x8c;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_CARON               = 0x8a;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_ABOVERING           = 0x88;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_ABOVEDOT            = 0x86;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_MACRON              = 0x84;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_CIRCUMFLEX          = 0x82;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DEAD_GRAVE               = 0x80;

    /** @since 1.2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_RIGHT       = 0xE3;

    /**
     * Constant for the numeric keypad <b>right</b> arrow key.
     * @see #VK_RIGHT
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_LEFT        = 0xE2;

    /**
     * Constant for the numeric keypad <b>left</b> arrow key.
     * @see #VK_LEFT
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_DOWN        = 0xE1;

    /**
     * Constant for the numeric keypad <b>down</b> arrow key.
     * @see #VK_DOWN
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_KP_UP          = 0xE0;

    /**
     * Constant for the numeric keypad <b>up</b> arrow key.
     * @see #VK_UP
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F24            = 0xF00B;

    /**
     * Constant for the F24 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F23            = 0xF00A;

    /**
     * Constant for the F23 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F22            = 0xF009;

    /**
     * Constant for the F22 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F21            = 0xF008;

    /**
     * Constant for the F21 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F20            = 0xF007;

    /**
     * Constant for the F20 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F19            = 0xF006;

    /**
     * Constant for the F19 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F18            = 0xF005;

    /**
     * Constant for the F18 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F17            = 0xF004;

    /**
     * Constant for the F17 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F16            = 0xF003;

    /**
     * Constant for the F16 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F15            = 0xF002;

    /**
     * Constant for the F15 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F14            = 0xF001;

    /**
     * Constant for the F14 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    /* F13 - F24 are used on IBM 3270 keyboard; use random range for constants. */

    /**
     * Constant for the F13 function key.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F12            = 0x7B;

    /** Constant for the F12 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F11            = 0x7A;

    /** Constant for the F11 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F10            = 0x79;

    /** Constant for the F10 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F9             = 0x78;

    /** Constant for the F9 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F8             = 0x77;

    /** Constant for the F8 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F7             = 0x76;

    /** Constant for the F7 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F6             = 0x75;

    /** Constant for the F6 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F5             = 0x74;

    /** Constant for the F5 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F4             = 0x73;

    /** Constant for the F4 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F3             = 0x72;

    /** Constant for the F3 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F2             = 0x71;

    /** Constant for the F2 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_F1             = 0x70;

    /** Constant for the F1 function key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SEPARATOR      = VK_SEPARATER;

    /**
     * Constant for the Numpad Separator key.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SEPARATER      = 0x6C;

    /**
     * This constant is obsolete, and is included only for backwards
     * compatibility.
     * @see #VK_SEPARATOR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_CLOSE_BRACKET  = 0x5D;

    /**
     * Constant for the close bracket key, "]"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_BACK_SLASH     = 0x5C;

    /**
     * Constant for the back slash key, "\"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_OPEN_BRACKET   = 0x5B;

    /**
     * Constant for the open bracket key, "["
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_A              = 0x41;

    /** VK_A thru VK_Z are the same as ASCII 'A' thru 'Z' (0x41 - 0x5A) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_EQUALS         = 0x3D;

    /**
     * Constant for the equals key, "="
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SEMICOLON      = 0x3B;

    /**
     * Constant for the semicolon key, ";"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_0              = 0x30;

    /** VK_0 thru VK_9 are the same as ASCII '0' thru '9' (0x30 - 0x39) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_SLASH          = 0x2F;

    /**
     * Constant for the forward slash key, "/"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_PERIOD         = 0x2E;

    /**
     * Constant for the period key, "."
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_MINUS          = 0x2D;

    /**
     * Constant for the minus key, "-"
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_COMMA          = 0x2C;

    /**
     * Constant for the comma key, ","
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_DOWN           = 0x28;

    /**
     * Constant for the non-numpad <b>down</b> arrow key.
     * @see #VK_KP_DOWN
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_RIGHT          = 0x27;

    /**
     * Constant for the non-numpad <b>right</b> arrow key.
     * @see #VK_KP_RIGHT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_UP             = 0x26;

    /**
     * Constant for the non-numpad <b>up</b> arrow key.
     * @see #VK_KP_UP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int VK_LEFT           = 0x25;

    /**
     * Constant for the non-numpad <b>left</b> arrow key.
     * @see #VK_KP_LEFT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_RELEASED = 2 + KEY_FIRST; //Event.KEY_RELEASE

    /**
     * The "key released" event. This event is generated when a key
     * is let up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_PRESSED = 1 + KEY_FIRST; //Event.KEY_PRESS

    /**
     * The "key pressed" event. This event is generated when a key
     * is pushed down.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_TYPED = KEY_FIRST;

    /**
     * The "key typed" event.  This event is generated when a character is
     * entered.  In the simplest case, it is produced by a single key press.
     * Often, however, characters are produced by series of key presses, and
     * the mapping from key pressed events to key typed events may be
     * many-to-one or many-to-many.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_LAST  = 402;

    /**
     * The last number in the range of ids used for key events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    public static final int KEY_FIRST = 400;

    /**
     * The first number in the range of ids used for key events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
    private boolean isProxyActive = false;

    /**
     * Stores the state of native event dispatching system
     * - true, if when the event was created event proxying
     *         mechanism was active
     * - false, if it was inactive
     * Used in Component.dispatchEventImpl to correctly dispatch
     * events when proxy is active
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/KeyEvent.java
public class KeyEvent extends InputEvent {

/**
 * An event which indicates that a keystroke occurred in a component.
 * <p>
 * This low-level event is generated by a component object (such as a text
 * field) when a key is pressed, released, or typed.
 * The event is passed to every <code>KeyListener</code>
 * or <code>KeyAdapter</code> object which registered to receive such
 * events using the component's <code>addKeyListener</code> method.
 * (<code>KeyAdapter</code> objects implement the
 * <code>KeyListener</code> interface.)  Each such listener object
 * gets this <code>KeyEvent</code> when the event occurs.
 * <p>
 * <em>"Key typed" events</em> are higher-level and generally do not depend on
 * the platform or keyboard layout.  They are generated when a Unicode character
 * is entered, and are the preferred way to find out about character input.
 * In the simplest case, a key typed event is produced by a single key press
 * (e.g., 'a').  Often, however, characters are produced by series of key
 * presses (e.g., 'shift' + 'a'), and the mapping from key pressed events to
 * key typed events may be many-to-one or many-to-many.  Key releases are not
 * usually necessary to generate a key typed event, but there are some cases
 * where the key typed event is not generated until a key is released (e.g.,
 * entering ASCII sequences via the Alt-Numpad method in Windows).
 * No key typed events are generated for keys that don't generate Unicode
 * characters (e.g., action keys, modifier keys, etc.).
 * <p>
 * The getKeyChar method always returns a valid Unicode character or
 * CHAR_UNDEFINED.  Character input is reported by KEY_TYPED events:
 * KEY_PRESSED and KEY_RELEASED events are not necessarily associated
 * with character input.  Therefore, the result of the getKeyChar method
 * is guaranteed to be meaningful only for KEY_TYPED events.
 * <p>
 * For key pressed and key released events, the getKeyCode method returns
 * the event's keyCode.  For key typed events, the getKeyCode method
 * always returns {@code VK_UNDEFINED}. The {@code getExtendedKeyCode} method
 * may also be used with many international keyboard layouts.
 *
 * <p>
 * <em>"Key pressed" and "key released" events</em> are lower-level and depend
 * on the platform and keyboard layout. They are generated whenever a key is
 * pressed or released, and are the only way to find out about keys that don't
 * generate character input (e.g., action keys, modifier keys, etc.). The key
 * being pressed or released is indicated by the {@code getKeyCode} and {@code getExtendedKeyCode}
 * methods, which return a virtual key code.
 *
 * <p>
 * <em>Virtual key codes</em> are used to report which keyboard key has
 * been pressed, rather than a character generated by the combination
 * of one or more keystrokes (such as "A", which comes from shift and "a").
 *
 * <p>
 * For example, pressing the Shift key will cause a KEY_PRESSED event
 * with a VK_SHIFT keyCode, while pressing the 'a' key will result in
 * a VK_A keyCode.  After the 'a' key is released, a KEY_RELEASED event
 * will be fired with VK_A. Separately, a KEY_TYPED event with a keyChar
 * value of 'A' is generated.
 *
 * <p>
 * Pressing and releasing a key on the keyboard results in the generating
 * the following key events (in order):
 * <PRE>
 *    {@code KEY_PRESSED}
 *    {@code KEY_TYPED} (is only generated if a valid Unicode character could be generated.)
 *    {@code KEY_RELEASED}
 * </PRE>
 *
 * But in some cases (e.g. auto-repeat or input method is activated) the order
 * could be different (and platform dependent).
 *
 * <p>
 * Notes:
 * <ul>
 * <li>Key combinations which do not result in Unicode characters, such as action
 * keys like F1 and the HELP key, do not generate KEY_TYPED events.
 * <li>Not all keyboards or systems are capable of generating all
 * virtual key codes.  No attempt is made in Java to generate these keys
 * artificially.
 * <li>Virtual key codes do not identify a physical key: they depend on the
 * platform and keyboard layout. For example, the key that generates VK_Q
 * when using a U.S. keyboard layout will generate VK_A when using a French
 * keyboard layout.
 * <li>The key that generates {@code VK_Q} when using a U.S. keyboard layout also
 * generates a unique code for Russian or Hebrew layout. There is no a
 * {@code VK_} constant for these and many other codes in various layouts. These codes
 * may be obtained by using {@code getExtendedKeyCode} and are used whenever
 * a {@code VK_} constant is used.
 * <li>Not all characters have a keycode associated with them.  For example,
 * there is no keycode for the question mark because there is no keyboard
 * for which it appears on the primary layer.
 * <li>In order to support the platform-independent handling of action keys,
 * the Java platform uses a few additional virtual key constants for functions
 * that would otherwise have to be recognized by interpreting virtual key codes
 * and modifiers. For example, for Japanese Windows keyboards, VK_ALL_CANDIDATES
 * is returned instead of VK_CONVERT with the ALT modifier.
 * <li>As specified in <a href="../doc-files/FocusSpec.html">Focus Specification</a>
 * key events are dispatched to the focus owner by default.
 * </ul>
 *
 * <p>
 * WARNING: Aside from those keys that are defined by the Java language
 * (VK_ENTER, VK_BACK_SPACE, and VK_TAB), do not rely on the values of the VK_
 * constants.  Sun reserves the right to change these values as needed
 * to accommodate a wider range of keyboards in the future.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code KeyEvent} instance is not
 * in the range from {@code KEY_FIRST} to {@code KEY_LAST}.
 *
 * @author Carl Quinn
 * @author Amy Fowler
 * @author Norbert Lindenberg
 *
 * @see KeyAdapter
 * @see KeyListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/keylistener.html">Tutorial: Writing a Key Listener</a>
 *
 * @since 1.1
 */
