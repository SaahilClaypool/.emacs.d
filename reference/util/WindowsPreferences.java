_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected void syncSpi() throws BackingStoreException {

   /**
    * Empty, never used implementation  of AbstractPreferences.flushSpi().
    */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected void flushSpi() throws BackingStoreException {

   /**
    * Empty, never used implementation  of AbstractPreferences.flushSpi().
    */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static String byteArrayToString(byte[] array) {

    /**
     * Converts a null-terminated byte array to java string
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static byte[] stringToByteArray(String str) {

    /**
     * Returns this java string as a null-terminated byte array
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private int rootNativeHandle() {

    /**
     * Returns native handle for the top Windows node for this node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static byte[] toWindowsValueString(String javaName) {

    /**
     * Converts value string to it Windows representation.
     * as a byte-encoded string.
     * Encoding algorithm adds "/" character to capital letters, i.e.
     * "A" is encoded as "/A". Character '\' is encoded as '//',
     * '/' is encoded as  '\'.
     * Then encoding scheme similar to jdk's native2ascii converter is used
     * to convert java string to a byte array of ASCII characters.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
     private static String toJavaValueString(byte[] windowsNameArray) {

    /**
     * Converts value string from its Windows representation
     * to java string.  See
     * {@link #toWindowsValueString(String) toWindowsValueString()} for the
     * description of the encoding algorithm.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static byte[] toWindowsAlt64Name(String javaName) {

    /**
     * Converts value's or node's name to its Windows representation
     * as a byte-encoded string, using altBase64 encoding. See
     * {@link #toWindowsName(String) toWindowsName()} for a detailed
     * description of encoding conventions.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static byte[] toWindowsName(String javaName) {

    /**
     * Converts value's or node's name to its Windows representation
     * as a byte-encoded string.
     * Two encodings, simple and altBase64 are used.
     * <p>
     * <i>Simple</i> encoding is used, if java string does not contain
     * any characters less, than 0x0020, or greater, than 0x007f.
     * Simple encoding adds "/" character to capital letters, i.e.
     * "A" is encoded as "/A". Character '\' is encoded as '//',
     * '/' is encoded as '\'.
     * The constructed string is converted to byte array by truncating the
     * highest byte and adding the terminating <tt>null</tt> character.
     * <p>
     * <i>altBase64</i>  encoding is used, if java string does contain at least
     * one character less, than 0x0020, or greater, than 0x007f.
     * This encoding is marked by setting first two bytes of the
     * Windows string to '/!'. The java name is then encoded using
     * byteArrayToAltBase64() method from
     * Base64 class.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static String toJavaAlt64Name(String windowsName) {

    /**
     * Converts value's or node's name from its Windows representation to java
     * string, using altBase64 encoding. See
     * {@link #toWindowsName(String) toWindowsName()} for a detailed
     * description of encoding conventions.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static String toJavaName(byte[] windowsNameArray) {

    /**
     * Converts value's or node's name from its byte array representation to
     * java string. Two encodings, simple and altBase64 are used. See
     * {@link #toWindowsName(String) toWindowsName()} for a detailed
     * description of encoding conventions.
     * @param windowsNameArray Null-terminated byte array.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    public void removeNodeSpi() throws BackingStoreException {

    /**
     * Implements <tt>AbstractPreferences</tt> <tt>removeNodeSpi()</tt> method.
     * Deletes underlying Windows registry node.
     * Throws a BackingStoreException and logs a warning, if Windows registry
     * is not available.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected AbstractPreferences childSpi(String name) {

    /**
     * Implements <tt>AbstractPreferences</tt> <tt>childSpi()</tt> method.
     * Constructs a child node with a
     * given name and creates its underlying Windows registry node,
     * if it does not exist.
     * Logs a warning message, if Windows Registry is unavailable.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    public void sync() throws BackingStoreException{

    /**
     * Implements <tt>Preferences</tt> <tt>sync()</tt> method.
     * Flushes Windows registry changes to disk. Equivalent to flush().
     * @see flush()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    public void flush() throws BackingStoreException{

    /**
     * Implements <tt>Preferences</tt> <tt>flush()</tt> method.
     * Flushes Windows registry changes to disk.
     * Throws a BackingStoreException and logs a warning message if Windows
     * registry is not available.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected String[] childrenNamesSpi() throws BackingStoreException {

    /**
     * Implements <tt>AbstractPreferences</tt> <tt>childrenNamesSpi()</tt> method.
     * Calls Windows registry to retrive children of this node.
     * Throws a BackingStoreException and logs a warning message,
     * if Windows registry is not available.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected String[] keysSpi() throws BackingStoreException{

    /**
     * Implements <tt>AbstractPreferences</tt> <tt>keysSpi()</tt> method.
     * Gets value names from the underlying Windows registry node.
     * Throws a BackingStoreException and logs a warning, if
     * Windows registry is unavailable.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected void removeSpi(String key) {

    /**
     * Implements <tt>AbstractPreferences</tt> <tt>removeSpi()</tt> method.
     * Deletes a string name-value pair from the underlying Windows registry
     * node, if this value still exists.
     * Logs a warning, if Windows registry is unavailable or key has already
     * been deleted.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected String getSpi(String javaName) {

    /**
     * Implements <tt>AbstractPreferences</tt> <tt>getSpi()</tt> method.
     * Gets a string value from the underlying Windows registry node.
     * Logs a warning, if Windows registry is unavailable.
     * @see #putSpi(String, String)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    protected void putSpi(String javaName, String value) {

     /**
     * Implements <tt>AbstractPreferences</tt> <tt>putSpi()</tt> method.
     * Puts name-value pair into the underlying Windows registry node.
     * Logs a warning, if Windows registry is unavailable.
     * @see #getSpi(String)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private void closeKey(int nativeHandle) {

     /**
     * Closes Windows registry key.
     * Logs a warning if Windows registry is unavailable.
     * @param key's Windows registry handle.
     * @see #openKey(int)
     * @see #openKey(byte[],int)
     * @see #openKey(int, byte[],int)
    */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private int openKey(int nativeHandle, byte[] windowsRelativePath,
                        int mask1, int mask2) {

     /**
     * Opens Windows registry key at a given relative path
     * with respect to a given Windows registry key.
     * @param windowsAbsolutePath Windows relative path of the
     *        key as a byte-encoded string.
     * @param nativeHandle handle to the base Windows key.
     * @param mask1 Preferred Windows security mask.
     * @param mask2 Alternate Windows security mask.
     * @return Windows registry key's handle.
     * @see #openKey(int)
     * @see #openKey(byte[],int)
     * @see #closeKey(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private int openKey(byte[] windowsAbsolutePath, int mask1, int mask2) {

     /**
     * Opens Windows registry key at a given absolute path using a given
     * security mask.
     * @param windowsAbsolutePath Windows absolute path of the
     *        key as a byte-encoded string.
     * @param mask1 Preferred Windows security mask.
     * @param mask2 Alternate Windows security mask.
     * @return Windows registry key's handle.
     * @see #openKey(int)
     * @see #openKey(int, byte[],int)
     * @see #closeKey(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private int openKey(int mask1, int mask2) {

    /**
     * Opens current node's underlying Windows registry key using a
     * given security mask.
     * @param mask1 Preferred Windows security mask.
     * @param mask2 Alternate Windows security mask.
     * @return Windows registry key's handle.
     * @see #openKey(byte[], int)
     * @see #openKey(int, byte[], int)
     * @see #closeKey(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private int openKey(int securityMask) {

    /**
     * Opens current node's underlying Windows registry key using a
     * given security mask.
     * @param securityMask Windows security mask.
     * @return Windows registry key's handle.
     * @see #openKey(byte[], int)
     * @see #openKey(int, byte[], int)
     * @see #closeKey(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private byte[] windowsAbsolutePath() {

    /**
     * Returns Windows absolute path of the current node as a byte array.
     * Java "/" separator is transformed into Windows "\".
     * @see Preferences#absolutePath()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private  WindowsPreferences(int rootNativeHandle, byte[] rootDirectory) {

    /**
     * Constructs a root node creating the underlying
     * Windows registry node and all of its parents, if they have not yet been
     * created.
     * Logs a warning message, if Windows Registry is unavailable.
     * @param rootNativeHandle Native handle to one of Windows top level keys.
     * @param rootDirectory Path to root directory, as a byte-encoded string.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private WindowsPreferences(WindowsPreferences parent, String name) {

    /**
     * Constructs a <tt>WindowsPreferences</tt> node, creating underlying
     * Windows registry node and all its Windows parents, if they are not yet
     * created.
     * Logs a warning message, if Windows Registry is unavailable.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static byte[] WindowsRegEnumValue1(int hKey, int valueIndex,
                                               int maxValueNameLength) {

    /**
     * Retries RegEnumValueEx() MAX_ATTEMPTS times before giving up.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native byte[] WindowsRegEnumValue(int hKey, int valueIndex,
                                                     int maxValueNameLength);

    /**
     * Java wrapper for Windows registry API RegEnumValue()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static byte[] WindowsRegEnumKeyEx1(int hKey, int subKeyIndex,
                                               int maxKeyLength) {

    /**
     * Retries RegEnumKeyEx() MAX_ATTEMPTS times before giving up.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native byte[] WindowsRegEnumKeyEx(int hKey, int subKeyIndex,
                                                     int maxKeyLength);

    /**
     * Java wrapper for Windows registry API RegEnumKeyEx()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static int[] WindowsRegQueryInfoKey1(int hKey) {

    /**
     * Retries RegQueryInfoKey() MAX_ATTEMPTS times before giving up.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int[] WindowsRegQueryInfoKey(int hKey);

    /**
     * Java wrapper for Windows registry API RegQueryInfoKey()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int WindowsRegDeleteValue(int hKey, byte[] valueName);

    /**
     * Java wrapper for Windows registry API RegDeleteValue()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static int WindowsRegSetValueEx1(int hKey, byte[] valueName,
                                             byte[] value) {

    /**
     * Retries RegSetValueEx() MAX_ATTEMPTS times before giving up.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int WindowsRegSetValueEx(int hKey, byte[] valueName,
                                                   byte[] value);

    /**
     * Java wrapper for Windows registry API RegSetValueEx()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native byte[] WindowsRegQueryValueEx(int hKey,
                                                        byte[] valueName);

    /**
     * Java wrapper for Windows registry API RegQueryValueEx()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static int WindowsRegFlushKey1(int hKey) {

    /**
     * Retries RegFlushKey() MAX_ATTEMPTS times before giving up.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int WindowsRegFlushKey(int hKey);

    /**
     * Java wrapper for Windows registry API RegFlushKey()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int WindowsRegDeleteKey(int hKey, byte[] subKey);

    /**
     * Java wrapper for Windows registry API RegDeleteKey()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static int[] WindowsRegCreateKeyEx1(int hKey, byte[] subKey) {

    /**
     * Retries RegCreateKeyEx() MAX_ATTEMPTS times before giving up.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int[] WindowsRegCreateKeyEx(int hKey, byte[] subKey);

    /**
     * Java wrapper for Windows registry API RegCreateKeyEx()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int WindowsRegCloseKey(int hKey);

     /**
     * Java wrapper for Windows registry API RegCloseKey()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static int[] WindowsRegOpenKey1(int hKey, byte[] subKey,
                                            int securityMask) {

    /**
     * Retries RegOpenKey() MAX_ATTEMPTS times before giving up.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static native int[] WindowsRegOpenKey(int hKey, byte[] subKey,
                                                  int securityMask);

    /**
     * Java wrapper for Windows registry API RegOpenKey()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private boolean isBackingStoreAvailable = true;

    /**
     * BackingStore availability flag.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static int MAX_ATTEMPTS = 5;

    /**
     * Maximum number of registry access attempts.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static int INIT_SLEEP_TIME = 50;

    /**
     * Initial time between registry access attempts, in ms. The time is doubled
     * after each failing attempt (except the first).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    static final Preferences systemRoot =

    /**
     * System root node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    static final Preferences userRoot =

    /**
     * User root node.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static final int MAX_WINDOWS_PATH_LENGTH = 256;

    /**
     * Maximum byte-encoded path length for Windows native functions,
     * ending <tt>null</tt> character not included.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static final int SYSTEM_ROOT_NATIVE_HANDLE = HKEY_LOCAL_MACHINE;

    /**
     * Mount point for <tt>Preferences</tt>'  system root.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static final int USER_ROOT_NATIVE_HANDLE = HKEY_CURRENT_USER;

    /**
     * Mount point for <tt>Preferences</tt>'  user root.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static final int HKEY_CURRENT_USER = 0x80000001;

    /**
     * Windows handles to <tt>HKEY_CURRENT_USER</tt> and
     * <tt>HKEY_LOCAL_MACHINE</tt> hives.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static final byte[] WINDOWS_ROOT_PATH =

    /**
     * Windows registry path to <tt>Preferences</tt>'s root nodes.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
    private static PlatformLogger logger;

    /**
     * Logger for error messages
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/WindowsPreferences.java
class WindowsPreferences extends AbstractPreferences{

/**
 * Windows registry based implementation of  <tt>Preferences</tt>.
 * <tt>Preferences</tt>' <tt>systemRoot</tt> and <tt>userRoot</tt> are stored in
 * <tt>HKEY_LOCAL_MACHINE\SOFTWARE\JavaSoft\Prefs</tt> and
 * <tt>HKEY_CURRENT_USER\Software\JavaSoft\Prefs</tt> correspondingly.
 *
 * @author  Konstantin Kladko
 * @see Preferences
 * @see PreferencesFactory
 * @since 1.4
 */
