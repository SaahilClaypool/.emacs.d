_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public String toString() {

    /**
     * Returns a string representation of this cursor.
     * @return    a string representation of this cursor.
     * @since     1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public String getName() {

    /**
     * Returns the name of this cursor.
     * @return    a localized description of this cursor.
     * @since     1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public int getType() {

    /**
     * Returns the type for this cursor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    protected Cursor(String name) {

    /**
     * Creates a new custom cursor object with the specified name.<p>
     * Note:  this constructor should only be used by AWT implementations
     * as part of their support for custom cursors.  Applications should
     * use Toolkit.createCustomCursor().
     * @param name the user-visible name of the cursor.
     * @see java.awt.Toolkit#createCustomCursor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    @ConstructorProperties({"type"})

    /**
     * Creates a new cursor object with the specified type.
     * @param type the type of cursor
     * @throws IllegalArgumentException if the specified cursor type
     * is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    static public Cursor getDefaultCursor() {

    /**
     * Return the system default cursor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    static public Cursor getSystemCustomCursor(final String name)

    /**
     * Returns a system-specific custom cursor object matching the
     * specified name.  Cursor names are, for example: "Invalid.16x16"
     *
     * @param name a string describing the desired system-specific custom cursor
     * @return the system specific custom cursor named
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless</code> returns true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    static public Cursor getPredefinedCursor(int type) {

    /**
     * Returns a cursor object with the specified predefined type.
     *
     * @param type the type of predefined cursor
     * @return the specified predefined cursor
     * @throws IllegalArgumentException if the specified cursor type is
     *         invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    protected String name;

    /**
     * The user-visible name of the cursor.
     *
     * @serial
     * @see #getName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    private transient long pData;

    /**
     * Hook into native data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     CUSTOM_CURSOR                   = -1;

    /**
     * The type associated with all custom cursors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    int type = DEFAULT_CURSOR;

    /**
     * The chosen cursor type initially set to
     * the <code>DEFAULT_CURSOR</code>.
     *
     * @serial
     * @see #getType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    private final static Cursor[] predefinedPrivate = new Cursor[14];

    /**
     * This field is a private replacement for 'predefined' array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    @Deprecated

    /**
      * @deprecated As of JDK version 1.7, the {@link #getPredefinedCursor(int)}
      * method should be used instead.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     MOVE_CURSOR                     = 13;

    /**
     * The move cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     HAND_CURSOR                     = 12;

    /**
     * The hand cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     E_RESIZE_CURSOR                 = 11;

    /**
     * The east-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     W_RESIZE_CURSOR                 = 10;

    /**
     * The west-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     S_RESIZE_CURSOR                 = 9;

    /**
     * The south-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     N_RESIZE_CURSOR                 = 8;

    /**
     * The north-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     NE_RESIZE_CURSOR                = 7;

    /**
     * The north-east-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     NW_RESIZE_CURSOR                = 6;

    /**
     * The north-west-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     SE_RESIZE_CURSOR                = 5;

    /**
     * The south-east-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     SW_RESIZE_CURSOR                = 4;

    /**
     * The south-west-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     WAIT_CURSOR                     = 3;

    /**
     * The wait cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     TEXT_CURSOR                     = 2;

    /**
     * The text cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     CROSSHAIR_CURSOR                = 1;

    /**
     * The crosshair cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     DEFAULT_CURSOR                  = 0;

    /**
     * The default cursor type (gets set if no cursor is defined).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
public class Cursor implements java.io.Serializable {

/**
 * A class to encapsulate the bitmap representation of the mouse cursor.
 *
 * @see Component#setCursor
 * @author      Amy Fowler
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public String toString() {

    /**
     * Returns a string representation of this cursor.
     * @return    a string representation of this cursor.
     * @since     1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public String getName() {

    /**
     * Returns the name of this cursor.
     * @return    a localized description of this cursor.
     * @since     1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public int getType() {

    /**
     * Returns the type for this cursor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    protected Cursor(String name) {

    /**
     * Creates a new custom cursor object with the specified name.<p>
     * Note:  this constructor should only be used by AWT implementations
     * as part of their support for custom cursors.  Applications should
     * use Toolkit.createCustomCursor().
     * @param name the user-visible name of the cursor.
     * @see java.awt.Toolkit#createCustomCursor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    @ConstructorProperties({"type"})

    /**
     * Creates a new cursor object with the specified type.
     * @param type the type of cursor
     * @throws IllegalArgumentException if the specified cursor type
     * is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    static public Cursor getDefaultCursor() {

    /**
     * Return the system default cursor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    static public Cursor getSystemCustomCursor(final String name)

    /**
     * Returns a system-specific custom cursor object matching the
     * specified name.  Cursor names are, for example: "Invalid.16x16"
     *
     * @param name a string describing the desired system-specific custom cursor
     * @return the system specific custom cursor named
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless</code> returns true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    static public Cursor getPredefinedCursor(int type) {

    /**
     * Returns a cursor object with the specified predefined type.
     *
     * @param type the type of predefined cursor
     * @return the specified predefined cursor
     * @throws IllegalArgumentException if the specified cursor type is
     *         invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    protected String name;

    /**
     * The user-visible name of the cursor.
     *
     * @serial
     * @see #getName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    private transient long pData;

    /**
     * Hook into native data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     CUSTOM_CURSOR                   = -1;

    /**
     * The type associated with all custom cursors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    int type = DEFAULT_CURSOR;

    /**
     * The chosen cursor type initially set to
     * the <code>DEFAULT_CURSOR</code>.
     *
     * @serial
     * @see #getType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    private final static Cursor[] predefinedPrivate = new Cursor[14];

    /**
     * This field is a private replacement for 'predefined' array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    @Deprecated

    /**
      * @deprecated As of JDK version 1.7, the {@link #getPredefinedCursor(int)}
      * method should be used instead.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     MOVE_CURSOR                     = 13;

    /**
     * The move cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     HAND_CURSOR                     = 12;

    /**
     * The hand cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     E_RESIZE_CURSOR                 = 11;

    /**
     * The east-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     W_RESIZE_CURSOR                 = 10;

    /**
     * The west-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     S_RESIZE_CURSOR                 = 9;

    /**
     * The south-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     N_RESIZE_CURSOR                 = 8;

    /**
     * The north-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     NE_RESIZE_CURSOR                = 7;

    /**
     * The north-east-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     NW_RESIZE_CURSOR                = 6;

    /**
     * The north-west-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     SE_RESIZE_CURSOR                = 5;

    /**
     * The south-east-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     SW_RESIZE_CURSOR                = 4;

    /**
     * The south-west-resize cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     WAIT_CURSOR                     = 3;

    /**
     * The wait cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     TEXT_CURSOR                     = 2;

    /**
     * The text cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     CROSSHAIR_CURSOR                = 1;

    /**
     * The crosshair cursor type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
    public static final int     DEFAULT_CURSOR                  = 0;

    /**
     * The default cursor type (gets set if no cursor is defined).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Cursor.java
public class Cursor implements java.io.Serializable {

/**
 * A class to encapsulate the bitmap representation of the mouse cursor.
 *
 * @see Component#setCursor
 * @author      Amy Fowler
 */
