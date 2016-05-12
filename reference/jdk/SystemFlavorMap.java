_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static DataFlavor decodeDataFlavor(String nat)

    /**
     * Decodes a <code>String</code> native for use as a
     * <code>DataFlavor</code>.
     *
     * @param nat the <code>String</code> to decode
     * @return the decoded <code>DataFlavor</code>, or <code>null</code> if
     *         nat is not an encoded <code>String</code> native
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static String decodeJavaMIMEType(String nat) {

    /**
     * Decodes a <code>String</code> native for use as a Java MIME type.
     *
     * @param nat the <code>String</code> to decode
     * @return the decoded Java MIME type, or <code>null</code> if nat is not
     *         an encoded <code>String</code> native
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static boolean isJavaMIMEType(String str) {

    /**
     * Returns whether the specified <code>String</code> is an encoded Java
     * MIME type.
     *
     * @param str the <code>String</code> to test
     * @return <code>true</code> if the <code>String</code> is encoded;
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static String encodeDataFlavor(DataFlavor flav) {

    /**
     * Encodes a <code>DataFlavor</code> for use as a <code>String</code>
     * native. The format of an encoded <code>DataFlavor</code> is
     * implementation-dependent. The only restrictions are:
     * <ul>
     * <li>The encoded representation is <code>null</code> if and only if the
     * specified <code>DataFlavor</code> is <code>null</code> or its MIME type
     * <code>String</code> is <code>null</code>.</li>
     * <li>The encoded representations for two non-<code>null</code>
     * <code>DataFlavor</code>s with non-<code>null</code> MIME type
     * <code>String</code>s are equal if and only if the MIME type
     * <code>String</code>s of these <code>DataFlavor</code>s are equal
     * according to <code>String.equals(Object)</code>.</li>
     * </ul>
     * <p>
     * The reference implementation of this method returns the MIME type
     * <code>String</code> of the specified <code>DataFlavor</code> prefixed
     * with <code>JAVA_DATAFLAVOR:</code>.
     *
     * @param flav the <code>DataFlavor</code> to encode
     * @return the encoded <code>String</code>, or <code>null</code> if
     *         flav is <code>null</code> or has a <code>null</code> MIME type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static String encodeJavaMIMEType(String mimeType) {

    /**
     * Encodes a MIME type for use as a <code>String</code> native. The format
     * of an encoded representation of a MIME type is implementation-dependent.
     * The only restrictions are:
     * <ul>
     * <li>The encoded representation is <code>null</code> if and only if the
     * MIME type <code>String</code> is <code>null</code>.</li>
     * <li>The encoded representations for two non-<code>null</code> MIME type
     * <code>String</code>s are equal if and only if these <code>String</code>s
     * are equal according to <code>String.equals(Object)</code>.</li>
     * </ul>
     * <p>
     * The reference implementation of this method returns the specified MIME
     * type <code>String</code> prefixed with <code>JAVA_DATAFLAVOR:</code>.
     *
     * @param mimeType the MIME type to encode
     * @return the encoded <code>String</code>, or <code>null</code> if
     *         mimeType is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void setFlavorsForNative(String nat,
                                                 DataFlavor[] flavors) {

    /**
     * Discards the current mappings for the specified <code>String</code>
     * native, and creates new mappings to the specified
     * <code>DataFlavor</code>s. Unlike <code>getFlavorsForNative</code>, the
     * mappings will only be established in one direction, and the natives need
     * not be encoded. To establish two-way mappings, call
     * <code>setNativesForFlavor</code> as well. The first
     * <code>DataFlavor</code> in the array will represent the highest priority
     * mapping. Subsequent <code>DataFlavor</code>s will represent mappings of
     * decreasing priority.
     * <p>
     * If the array contains several elements that reference equal
     * <code>DataFlavor</code>s, this method will establish new mappings
     * for the first of those elements and ignore the rest of them.
     * <p>
     * It is recommended that client code not reset mappings established by the
     * data transfer subsystem. This method should only be used for
     * application-level mappings.
     *
     * @param nat the <code>String</code> native key for the mappings
     * @param flavors the <code>DataFlavor</code> values for the mappings
     * @throws NullPointerException if nat or flavors is <code>null</code>
     *         or if flavors contains <code>null</code> elements
     *
     * @see #setNativesForFlavor
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void addFlavorForUnencodedNative(String nat,
                                                         DataFlavor flav) {

    /**
     * Adds a mapping from a single <code>String</code> native to a single
     * <code>DataFlavor</code>. Unlike <code>getFlavorsForNative</code>, the
     * mapping will only be established in one direction, and the native will
     * not be encoded. To establish a two-way mapping, call
     * <code>addUnencodedNativeForFlavor</code> as well. The new mapping will
     * be of lower priority than any existing mapping.
     * This method has no effect if a mapping from the specified
     * <code>String</code> native to the specified or equal
     * <code>DataFlavor</code> already exists.
     *
     * @param nat the <code>String</code> native key for the mapping
     * @param flav the <code>DataFlavor</code> value for the mapping
     * @throws NullPointerException if nat or flav is <code>null</code>
     *
     * @see #addUnencodedNativeForFlavor
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void setNativesForFlavor(DataFlavor flav,
                                                 String[] natives) {

    /**
     * Discards the current mappings for the specified <code>DataFlavor</code>
     * and all <code>DataFlavor</code>s equal to the specified
     * <code>DataFlavor</code>, and creates new mappings to the
     * specified <code>String</code> natives.
     * Unlike <code>getNativesForFlavor</code>, the mappings will only be
     * established in one direction, and the natives will not be encoded. To
     * establish two-way mappings, call <code>setFlavorsForNative</code>
     * as well. The first native in the array will represent the highest
     * priority mapping. Subsequent natives will represent mappings of
     * decreasing priority.
     * <p>
     * If the array contains several elements that reference equal
     * <code>String</code> natives, this method will establish new mappings
     * for the first of those elements and ignore the rest of them.
     * <p>
     * It is recommended that client code not reset mappings established by the
     * data transfer subsystem. This method should only be used for
     * application-level mappings.
     *
     * @param flav the <code>DataFlavor</code> key for the mappings
     * @param natives the <code>String</code> native values for the mappings
     * @throws NullPointerException if flav or natives is <code>null</code>
     *         or if natives contains <code>null</code> elements
     *
     * @see #setFlavorsForNative
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void addUnencodedNativeForFlavor(DataFlavor flav,
                                                         String nat) {

    /**
     * Adds a mapping from the specified <code>DataFlavor</code> (and all
     * <code>DataFlavor</code>s equal to the specified <code>DataFlavor</code>)
     * to the specified <code>String</code> native.
     * Unlike <code>getNativesForFlavor</code>, the mapping will only be
     * established in one direction, and the native will not be encoded. To
     * establish a two-way mapping, call
     * <code>addFlavorForUnencodedNative</code> as well. The new mapping will
     * be of lower priority than any existing mapping.
     * This method has no effect if a mapping from the specified or equal
     * <code>DataFlavor</code> to the specified <code>String</code> native
     * already exists.
     *
     * @param flav the <code>DataFlavor</code> key for the mapping
     * @param nat the <code>String</code> native value for the mapping
     * @throws NullPointerException if flav or nat is <code>null</code>
     *
     * @see #addFlavorForUnencodedNative
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>Map</code> of the specified <code>String</code> natives
     * to their most preferred <code>DataFlavor</code>. Each
     * <code>DataFlavor</code> value will be the same as the first
     * <code>DataFlavor</code> in the List returned by
     * <code>getFlavorsForNative</code> for the specified native.
     * <p>
     * If a specified native is previously unknown to the data transfer
     * subsystem, and that native has been properly encoded, then invoking this
     * method will establish a mapping in both directions between the specified
     * native and a <code>DataFlavor</code> whose MIME type is a decoded
     * version of the native.
     *
     * @param natives an array of <code>String</code>s which will be the
     *        key set of the returned <code>Map</code>. If <code>null</code> is
     *        specified, a mapping of all supported <code>String</code> natives
     *        to their most preferred <code>DataFlavor</code>s will be
     *        returned.
     * @return a <code>java.util.Map</code> of <code>String</code> natives to
     *         <code>DataFlavor</code>s
     *
     * @see #getFlavorsForNative
     * @see #encodeJavaMIMEType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>Map</code> of the specified <code>DataFlavor</code>s to
     * their most preferred <code>String</code> native. Each native value will
     * be the same as the first native in the List returned by
     * <code>getNativesForFlavor</code> for the specified flavor.
     * <p>
     * If a specified <code>DataFlavor</code> is previously unknown to the
     * data transfer subsystem, then invoking this method will establish a
     * mapping in both directions between the specified <code>DataFlavor</code>
     * and an encoded version of its MIME type as its native.
     *
     * @param flavors an array of <code>DataFlavor</code>s which will be the
     *        key set of the returned <code>Map</code>. If <code>null</code> is
     *        specified, a mapping of all <code>DataFlavor</code>s known to the
     *        data transfer subsystem to their most preferred
     *        <code>String</code> natives will be returned.
     * @return a <code>java.util.Map</code> of <code>DataFlavor</code>s to
     *         <code>String</code> natives
     *
     * @see #getNativesForFlavor
     * @see #encodeDataFlavor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>List</code> of <code>DataFlavor</code>s to which the
     * specified <code>String</code> native can be translated by the data
     * transfer subsystem. The <code>List</code> will be sorted from best
     * <code>DataFlavor</code> to worst. That is, the first
     * <code>DataFlavor</code> will best reflect data in the specified
     * native to a Java application.
     * <p>
     * If the specified native is previously unknown to the data transfer
     * subsystem, and that native has been properly encoded, then invoking this
     * method will establish a mapping in both directions between the specified
     * native and a <code>DataFlavor</code> whose MIME type is a decoded
     * version of the native.
     * <p>
     * If the specified native is not a properly encoded native and the
     * mappings for this native have not been altered with
     * <code>setFlavorsForNative</code>, then the contents of the
     * <code>List</code> is platform dependent, but <code>null</code>
     * cannot be returned.
     *
     * @param nat the native whose corresponding <code>DataFlavor</code>s
     *        should be returned. If <code>null</code> is specified, all
     *        <code>DataFlavor</code>s currently known to the data transfer
     *        subsystem are returned in a non-deterministic order.
     * @return a <code>java.util.List</code> of <code>DataFlavor</code>
     *         objects into which platform-specific data in the specified,
     *         platform-specific native can be translated
     *
     * @see #encodeJavaMIMEType
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>List</code> of <code>String</code> natives to which the
     * specified <code>DataFlavor</code> can be translated by the data transfer
     * subsystem. The <code>List</code> will be sorted from best native to
     * worst. That is, the first native will best reflect data in the specified
     * flavor to the underlying native platform.
     * <p>
     * If the specified <code>DataFlavor</code> is previously unknown to the
     * data transfer subsystem and the data transfer subsystem is unable to
     * translate this <code>DataFlavor</code> to any existing native, then
     * invoking this method will establish a
     * mapping in both directions between the specified <code>DataFlavor</code>
     * and an encoded version of its MIME type as its native.
     *
     * @param flav the <code>DataFlavor</code> whose corresponding natives
     *        should be returned. If <code>null</code> is specified, all
     *        natives currently known to the data transfer subsystem are
     *        returned in a non-deterministic order.
     * @return a <code>java.util.List</code> of <code>java.lang.String</code>
     *         objects which are platform-specific representations of platform-
     *         specific data formats
     *
     * @see #encodeDataFlavor
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private LinkedHashSet<String> flavorToNativeLookup(final DataFlavor flav,
                                                       final boolean synthesize) {

    /**
     * Semantically equivalent to 'flavorToNative.get(flav)'. This method
     * handles the case where 'flav' is not found in 'flavorToNative' depending
     * on the value of passes 'synthesize' parameter. If 'synthesize' is
     * SYNTHESIZE_IF_NOT_FOUND a native is synthesized, stored, and returned by
     * encoding the DataFlavor's MIME type. Otherwise an empty List is returned
     * and 'flavorToNative' remains unaffected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private LinkedHashSet<DataFlavor> nativeToFlavorLookup(String nat) {

    /**
     * Semantically equivalent to 'nativeToFlavor.get(nat)'. This method
     * handles the case where 'nat' is not found in 'nativeToFlavor'. In that
     * case, a new DataFlavor is synthesized, stored, and returned, if and
     * only if the specified native is encoded as a Java MIME type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private <H, L> void store(H hashed, L listed, Map<H, LinkedHashSet<L>> map) {

    /**
     * Stores the listed object under the specified hash key in map. Unlike a
     * standard map, the listed object will not replace any object already at
     * the appropriate Map location, but rather will be appended to a List
     * stored in that location.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private String loadConvert(String theString) {

    /**
     * Copied from java.util.Properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private boolean continueLine (String line) {

    /**
     * Copied from java.util.Properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private void parseAndStoreReader(BufferedReader in) throws IOException {

    /**
     * Copied code from java.util.Properties. Parsing the data ourselves is the
     * only way to handle duplicate keys and values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private void initSystemFlavorMap() {

    /**
     * Initializes a SystemFlavorMap by reading flavormap.properties and
     * AWT.DnD.flavorMapFileURL.
     * For thread-safety must be called under lock on this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static FlavorMap getDefaultFlavorMap() {

    /**
     * Returns the default FlavorMap for this thread's ClassLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private Set<Object> disabledMappingGenerationKeys = new HashSet<>();

    /**
     * Dynamic mapping generation used for text mappings should not be applied
     * to the DataFlavors and String natives for which the mappings have been
     * explicitly specified with setFlavorsForNative() or
     * setNativesForFlavor(). This keeps all such keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final SoftCache<String, DataFlavor> flavorsForNativeCache = new SoftCache<>();

    /**
     * Caches the result getFlavorsForNative(). Maps String natives to
     * SoftReferences which reference LinkedHashSet of DataFlavors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final SoftCache<DataFlavor, String> nativesForFlavorCache = new SoftCache<>();

    /**
     * Caches the result of getNativesForFlavor(). Maps DataFlavors to
     * SoftReferences which reference LinkedHashSet of String natives.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private synchronized Map<String, LinkedHashSet<String>> getTextTypeToNative() {

    /**
     * An accessor to textTypeToNative map.  Since we use lazy initialization we
     * must use this accessor instead of direct access to the field which may not
     * be initialized yet. This method will initialize the field if needed.
     *
     * @return textTypeToNative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private boolean isMapInitialized = false;

    /**
     * Shows if the object has been initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private Map<String, LinkedHashSet<String>> textTypeToNative = new HashMap<>();

    /**
     * Maps a text DataFlavor primary mime-type to the native. Used only to store
     * standard mappings registered in the flavormap.properties
     * Do not use this field directly, use getTextTypeToNative() instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private synchronized Map<DataFlavor, LinkedHashSet<String>> getFlavorToNative() {

    /**
     * Accessor to flavorToNative map.  Since we use lazy initialization we must
     * use this accessor instead of direct access to the field which may not be
     * initialized yet.  This method will initialize the field if needed.
     *
     * @return flavorToNative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final Map<DataFlavor, LinkedHashSet<String>> flavorToNative = new HashMap<>();

    /**
     * Maps DataFlavors (or base type Strings for text DataFlavors) to Lists of
     * native Strings.
     * Do not use the field directly, use getFlavorToNative() instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private Map<String, LinkedHashSet<DataFlavor>> getNativeToFlavor() {

    /**
     * Accessor to nativeToFlavor map.  Since we use lazy initialization we must
     * use this accessor instead of direct access to the field which may not be
     * initialized yet.  This method will initialize the field if needed.
     *
     * @return nativeToFlavor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final Map<String, LinkedHashSet<DataFlavor>> nativeToFlavor = new HashMap<>();

    /**
     * Maps native Strings to Lists of DataFlavors (or base type Strings for
     * text DataFlavors).
     * Do not use the field directly, use getNativeToFlavor() instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String HTML_TEXT_BASE_TYPE = "text/html";

    /**
     * A String representing text/html MIME type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String TEXT_PLAIN_BASE_TYPE = "text/plain";

    /**
     * A String representing text/plain MIME type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String[] ENCODED_TEXT_CLASSES = {

    /**
     * The list of valid, encoded text flavor representation classes, in order
     * from best to worst.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String[] UNICODE_TEXT_CLASSES = {

    /**
     * The list of valid, decoded text flavor representation classes, in order
     * from best to worst.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String keyValueSeparators = "=: \t\r\n\f";

    /**
     * Copied from java.util.Properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static String JavaMIME = "JAVA_DATAFLAVOR:";

    /**
     * Constant prefix used to tag Java types converted to native platform
     * type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
public final class SystemFlavorMap implements FlavorMap, FlavorTable {

/**
 * The SystemFlavorMap is a configurable map between "natives" (Strings), which
 * correspond to platform-specific data formats, and "flavors" (DataFlavors),
 * which correspond to platform-independent MIME types. This mapping is used
 * by the data transfer subsystem to transfer data between Java and native
 * applications, and between Java applications in separate VMs.
 * <p>
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static DataFlavor decodeDataFlavor(String nat)

    /**
     * Decodes a <code>String</code> native for use as a
     * <code>DataFlavor</code>.
     *
     * @param nat the <code>String</code> to decode
     * @return the decoded <code>DataFlavor</code>, or <code>null</code> if
     *         nat is not an encoded <code>String</code> native
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static String decodeJavaMIMEType(String nat) {

    /**
     * Decodes a <code>String</code> native for use as a Java MIME type.
     *
     * @param nat the <code>String</code> to decode
     * @return the decoded Java MIME type, or <code>null</code> if nat is not
     *         an encoded <code>String</code> native
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static boolean isJavaMIMEType(String str) {

    /**
     * Returns whether the specified <code>String</code> is an encoded Java
     * MIME type.
     *
     * @param str the <code>String</code> to test
     * @return <code>true</code> if the <code>String</code> is encoded;
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static String encodeDataFlavor(DataFlavor flav) {

    /**
     * Encodes a <code>DataFlavor</code> for use as a <code>String</code>
     * native. The format of an encoded <code>DataFlavor</code> is
     * implementation-dependent. The only restrictions are:
     * <ul>
     * <li>The encoded representation is <code>null</code> if and only if the
     * specified <code>DataFlavor</code> is <code>null</code> or its MIME type
     * <code>String</code> is <code>null</code>.</li>
     * <li>The encoded representations for two non-<code>null</code>
     * <code>DataFlavor</code>s with non-<code>null</code> MIME type
     * <code>String</code>s are equal if and only if the MIME type
     * <code>String</code>s of these <code>DataFlavor</code>s are equal
     * according to <code>String.equals(Object)</code>.</li>
     * </ul>
     * <p>
     * The reference implementation of this method returns the MIME type
     * <code>String</code> of the specified <code>DataFlavor</code> prefixed
     * with <code>JAVA_DATAFLAVOR:</code>.
     *
     * @param flav the <code>DataFlavor</code> to encode
     * @return the encoded <code>String</code>, or <code>null</code> if
     *         flav is <code>null</code> or has a <code>null</code> MIME type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static String encodeJavaMIMEType(String mimeType) {

    /**
     * Encodes a MIME type for use as a <code>String</code> native. The format
     * of an encoded representation of a MIME type is implementation-dependent.
     * The only restrictions are:
     * <ul>
     * <li>The encoded representation is <code>null</code> if and only if the
     * MIME type <code>String</code> is <code>null</code>.</li>
     * <li>The encoded representations for two non-<code>null</code> MIME type
     * <code>String</code>s are equal if and only if these <code>String</code>s
     * are equal according to <code>String.equals(Object)</code>.</li>
     * </ul>
     * <p>
     * The reference implementation of this method returns the specified MIME
     * type <code>String</code> prefixed with <code>JAVA_DATAFLAVOR:</code>.
     *
     * @param mimeType the MIME type to encode
     * @return the encoded <code>String</code>, or <code>null</code> if
     *         mimeType is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void setFlavorsForNative(String nat,
                                                 DataFlavor[] flavors) {

    /**
     * Discards the current mappings for the specified <code>String</code>
     * native, and creates new mappings to the specified
     * <code>DataFlavor</code>s. Unlike <code>getFlavorsForNative</code>, the
     * mappings will only be established in one direction, and the natives need
     * not be encoded. To establish two-way mappings, call
     * <code>setNativesForFlavor</code> as well. The first
     * <code>DataFlavor</code> in the array will represent the highest priority
     * mapping. Subsequent <code>DataFlavor</code>s will represent mappings of
     * decreasing priority.
     * <p>
     * If the array contains several elements that reference equal
     * <code>DataFlavor</code>s, this method will establish new mappings
     * for the first of those elements and ignore the rest of them.
     * <p>
     * It is recommended that client code not reset mappings established by the
     * data transfer subsystem. This method should only be used for
     * application-level mappings.
     *
     * @param nat the <code>String</code> native key for the mappings
     * @param flavors the <code>DataFlavor</code> values for the mappings
     * @throws NullPointerException if nat or flavors is <code>null</code>
     *         or if flavors contains <code>null</code> elements
     *
     * @see #setNativesForFlavor
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void addFlavorForUnencodedNative(String nat,
                                                         DataFlavor flav) {

    /**
     * Adds a mapping from a single <code>String</code> native to a single
     * <code>DataFlavor</code>. Unlike <code>getFlavorsForNative</code>, the
     * mapping will only be established in one direction, and the native will
     * not be encoded. To establish a two-way mapping, call
     * <code>addUnencodedNativeForFlavor</code> as well. The new mapping will
     * be of lower priority than any existing mapping.
     * This method has no effect if a mapping from the specified
     * <code>String</code> native to the specified or equal
     * <code>DataFlavor</code> already exists.
     *
     * @param nat the <code>String</code> native key for the mapping
     * @param flav the <code>DataFlavor</code> value for the mapping
     * @throws NullPointerException if nat or flav is <code>null</code>
     *
     * @see #addUnencodedNativeForFlavor
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void setNativesForFlavor(DataFlavor flav,
                                                 String[] natives) {

    /**
     * Discards the current mappings for the specified <code>DataFlavor</code>
     * and all <code>DataFlavor</code>s equal to the specified
     * <code>DataFlavor</code>, and creates new mappings to the
     * specified <code>String</code> natives.
     * Unlike <code>getNativesForFlavor</code>, the mappings will only be
     * established in one direction, and the natives will not be encoded. To
     * establish two-way mappings, call <code>setFlavorsForNative</code>
     * as well. The first native in the array will represent the highest
     * priority mapping. Subsequent natives will represent mappings of
     * decreasing priority.
     * <p>
     * If the array contains several elements that reference equal
     * <code>String</code> natives, this method will establish new mappings
     * for the first of those elements and ignore the rest of them.
     * <p>
     * It is recommended that client code not reset mappings established by the
     * data transfer subsystem. This method should only be used for
     * application-level mappings.
     *
     * @param flav the <code>DataFlavor</code> key for the mappings
     * @param natives the <code>String</code> native values for the mappings
     * @throws NullPointerException if flav or natives is <code>null</code>
     *         or if natives contains <code>null</code> elements
     *
     * @see #setFlavorsForNative
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public synchronized void addUnencodedNativeForFlavor(DataFlavor flav,
                                                         String nat) {

    /**
     * Adds a mapping from the specified <code>DataFlavor</code> (and all
     * <code>DataFlavor</code>s equal to the specified <code>DataFlavor</code>)
     * to the specified <code>String</code> native.
     * Unlike <code>getNativesForFlavor</code>, the mapping will only be
     * established in one direction, and the native will not be encoded. To
     * establish a two-way mapping, call
     * <code>addFlavorForUnencodedNative</code> as well. The new mapping will
     * be of lower priority than any existing mapping.
     * This method has no effect if a mapping from the specified or equal
     * <code>DataFlavor</code> to the specified <code>String</code> native
     * already exists.
     *
     * @param flav the <code>DataFlavor</code> key for the mapping
     * @param nat the <code>String</code> native value for the mapping
     * @throws NullPointerException if flav or nat is <code>null</code>
     *
     * @see #addFlavorForUnencodedNative
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>Map</code> of the specified <code>String</code> natives
     * to their most preferred <code>DataFlavor</code>. Each
     * <code>DataFlavor</code> value will be the same as the first
     * <code>DataFlavor</code> in the List returned by
     * <code>getFlavorsForNative</code> for the specified native.
     * <p>
     * If a specified native is previously unknown to the data transfer
     * subsystem, and that native has been properly encoded, then invoking this
     * method will establish a mapping in both directions between the specified
     * native and a <code>DataFlavor</code> whose MIME type is a decoded
     * version of the native.
     *
     * @param natives an array of <code>String</code>s which will be the
     *        key set of the returned <code>Map</code>. If <code>null</code> is
     *        specified, a mapping of all supported <code>String</code> natives
     *        to their most preferred <code>DataFlavor</code>s will be
     *        returned.
     * @return a <code>java.util.Map</code> of <code>String</code> natives to
     *         <code>DataFlavor</code>s
     *
     * @see #getFlavorsForNative
     * @see #encodeJavaMIMEType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>Map</code> of the specified <code>DataFlavor</code>s to
     * their most preferred <code>String</code> native. Each native value will
     * be the same as the first native in the List returned by
     * <code>getNativesForFlavor</code> for the specified flavor.
     * <p>
     * If a specified <code>DataFlavor</code> is previously unknown to the
     * data transfer subsystem, then invoking this method will establish a
     * mapping in both directions between the specified <code>DataFlavor</code>
     * and an encoded version of its MIME type as its native.
     *
     * @param flavors an array of <code>DataFlavor</code>s which will be the
     *        key set of the returned <code>Map</code>. If <code>null</code> is
     *        specified, a mapping of all <code>DataFlavor</code>s known to the
     *        data transfer subsystem to their most preferred
     *        <code>String</code> natives will be returned.
     * @return a <code>java.util.Map</code> of <code>DataFlavor</code>s to
     *         <code>String</code> natives
     *
     * @see #getNativesForFlavor
     * @see #encodeDataFlavor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>List</code> of <code>DataFlavor</code>s to which the
     * specified <code>String</code> native can be translated by the data
     * transfer subsystem. The <code>List</code> will be sorted from best
     * <code>DataFlavor</code> to worst. That is, the first
     * <code>DataFlavor</code> will best reflect data in the specified
     * native to a Java application.
     * <p>
     * If the specified native is previously unknown to the data transfer
     * subsystem, and that native has been properly encoded, then invoking this
     * method will establish a mapping in both directions between the specified
     * native and a <code>DataFlavor</code> whose MIME type is a decoded
     * version of the native.
     * <p>
     * If the specified native is not a properly encoded native and the
     * mappings for this native have not been altered with
     * <code>setFlavorsForNative</code>, then the contents of the
     * <code>List</code> is platform dependent, but <code>null</code>
     * cannot be returned.
     *
     * @param nat the native whose corresponding <code>DataFlavor</code>s
     *        should be returned. If <code>null</code> is specified, all
     *        <code>DataFlavor</code>s currently known to the data transfer
     *        subsystem are returned in a non-deterministic order.
     * @return a <code>java.util.List</code> of <code>DataFlavor</code>
     *         objects into which platform-specific data in the specified,
     *         platform-specific native can be translated
     *
     * @see #encodeJavaMIMEType
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    @Override

    /**
     * Returns a <code>List</code> of <code>String</code> natives to which the
     * specified <code>DataFlavor</code> can be translated by the data transfer
     * subsystem. The <code>List</code> will be sorted from best native to
     * worst. That is, the first native will best reflect data in the specified
     * flavor to the underlying native platform.
     * <p>
     * If the specified <code>DataFlavor</code> is previously unknown to the
     * data transfer subsystem and the data transfer subsystem is unable to
     * translate this <code>DataFlavor</code> to any existing native, then
     * invoking this method will establish a
     * mapping in both directions between the specified <code>DataFlavor</code>
     * and an encoded version of its MIME type as its native.
     *
     * @param flav the <code>DataFlavor</code> whose corresponding natives
     *        should be returned. If <code>null</code> is specified, all
     *        natives currently known to the data transfer subsystem are
     *        returned in a non-deterministic order.
     * @return a <code>java.util.List</code> of <code>java.lang.String</code>
     *         objects which are platform-specific representations of platform-
     *         specific data formats
     *
     * @see #encodeDataFlavor
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private LinkedHashSet<String> flavorToNativeLookup(final DataFlavor flav,
                                                       final boolean synthesize) {

    /**
     * Semantically equivalent to 'flavorToNative.get(flav)'. This method
     * handles the case where 'flav' is not found in 'flavorToNative' depending
     * on the value of passes 'synthesize' parameter. If 'synthesize' is
     * SYNTHESIZE_IF_NOT_FOUND a native is synthesized, stored, and returned by
     * encoding the DataFlavor's MIME type. Otherwise an empty List is returned
     * and 'flavorToNative' remains unaffected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private LinkedHashSet<DataFlavor> nativeToFlavorLookup(String nat) {

    /**
     * Semantically equivalent to 'nativeToFlavor.get(nat)'. This method
     * handles the case where 'nat' is not found in 'nativeToFlavor'. In that
     * case, a new DataFlavor is synthesized, stored, and returned, if and
     * only if the specified native is encoded as a Java MIME type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private <H, L> void store(H hashed, L listed, Map<H, LinkedHashSet<L>> map) {

    /**
     * Stores the listed object under the specified hash key in map. Unlike a
     * standard map, the listed object will not replace any object already at
     * the appropriate Map location, but rather will be appended to a List
     * stored in that location.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private String loadConvert(String theString) {

    /**
     * Copied from java.util.Properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private boolean continueLine (String line) {

    /**
     * Copied from java.util.Properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private void parseAndStoreReader(BufferedReader in) throws IOException {

    /**
     * Copied code from java.util.Properties. Parsing the data ourselves is the
     * only way to handle duplicate keys and values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private void initSystemFlavorMap() {

    /**
     * Initializes a SystemFlavorMap by reading flavormap.properties and
     * AWT.DnD.flavorMapFileURL.
     * For thread-safety must be called under lock on this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    public static FlavorMap getDefaultFlavorMap() {

    /**
     * Returns the default FlavorMap for this thread's ClassLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private Set<Object> disabledMappingGenerationKeys = new HashSet<>();

    /**
     * Dynamic mapping generation used for text mappings should not be applied
     * to the DataFlavors and String natives for which the mappings have been
     * explicitly specified with setFlavorsForNative() or
     * setNativesForFlavor(). This keeps all such keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final SoftCache<String, DataFlavor> flavorsForNativeCache = new SoftCache<>();

    /**
     * Caches the result getFlavorsForNative(). Maps String natives to
     * SoftReferences which reference LinkedHashSet of DataFlavors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final SoftCache<DataFlavor, String> nativesForFlavorCache = new SoftCache<>();

    /**
     * Caches the result of getNativesForFlavor(). Maps DataFlavors to
     * SoftReferences which reference LinkedHashSet of String natives.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private synchronized Map<String, LinkedHashSet<String>> getTextTypeToNative() {

    /**
     * An accessor to textTypeToNative map.  Since we use lazy initialization we
     * must use this accessor instead of direct access to the field which may not
     * be initialized yet. This method will initialize the field if needed.
     *
     * @return textTypeToNative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private boolean isMapInitialized = false;

    /**
     * Shows if the object has been initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private Map<String, LinkedHashSet<String>> textTypeToNative = new HashMap<>();

    /**
     * Maps a text DataFlavor primary mime-type to the native. Used only to store
     * standard mappings registered in the flavormap.properties
     * Do not use this field directly, use getTextTypeToNative() instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private synchronized Map<DataFlavor, LinkedHashSet<String>> getFlavorToNative() {

    /**
     * Accessor to flavorToNative map.  Since we use lazy initialization we must
     * use this accessor instead of direct access to the field which may not be
     * initialized yet.  This method will initialize the field if needed.
     *
     * @return flavorToNative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final Map<DataFlavor, LinkedHashSet<String>> flavorToNative = new HashMap<>();

    /**
     * Maps DataFlavors (or base type Strings for text DataFlavors) to Lists of
     * native Strings.
     * Do not use the field directly, use getFlavorToNative() instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private Map<String, LinkedHashSet<DataFlavor>> getNativeToFlavor() {

    /**
     * Accessor to nativeToFlavor map.  Since we use lazy initialization we must
     * use this accessor instead of direct access to the field which may not be
     * initialized yet.  This method will initialize the field if needed.
     *
     * @return nativeToFlavor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private final Map<String, LinkedHashSet<DataFlavor>> nativeToFlavor = new HashMap<>();

    /**
     * Maps native Strings to Lists of DataFlavors (or base type Strings for
     * text DataFlavors).
     * Do not use the field directly, use getNativeToFlavor() instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String HTML_TEXT_BASE_TYPE = "text/html";

    /**
     * A String representing text/html MIME type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String TEXT_PLAIN_BASE_TYPE = "text/plain";

    /**
     * A String representing text/plain MIME type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String[] ENCODED_TEXT_CLASSES = {

    /**
     * The list of valid, encoded text flavor representation classes, in order
     * from best to worst.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String[] UNICODE_TEXT_CLASSES = {

    /**
     * The list of valid, decoded text flavor representation classes, in order
     * from best to worst.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static final String keyValueSeparators = "=: \t\r\n\f";

    /**
     * Copied from java.util.Properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
    private static String JavaMIME = "JAVA_DATAFLAVOR:";

    /**
     * Constant prefix used to tag Java types converted to native platform
     * type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/SystemFlavorMap.java
public final class SystemFlavorMap implements FlavorMap, FlavorTable {

/**
 * The SystemFlavorMap is a configurable map between "natives" (Strings), which
 * correspond to platform-specific data formats, and "flavors" (DataFlavors),
 * which correspond to platform-independent MIME types. This mapping is used
 * by the data transfer subsystem to transfer data between Java and native
 * applications, and between Java applications in separate VMs.
 * <p>
 *
 * @since 1.2
 */
