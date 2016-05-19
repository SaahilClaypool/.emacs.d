_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
    CharsetEncoder setConverter(Object key, CharsetEncoder converter) {

    /**
     * Stores the given CharsetEncoder in the thread local cache,
     * and returns the same converter.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
    CharsetDecoder setConverter(Object key, CharsetDecoder converter) {

    /**
     * Stores the given CharsetDecoder in the thread local cache,
     * and returns the same converter.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
    CharsetEncoder getCharToByteConverter(Object key) {

    /**
     * Retrieve a CharsetEncoder from the Map using the given key.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
    CharsetDecoder getByteToCharConverter(Object key) {

    /**
     * Retrieve a CharsetDecoder from the Map using the given key.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
    private static final int CTB_CACHE_MAP = 1;

    /**
     * Index in the thread local converterCaches array for
     * the char to byte converter Map.  A key is the Java
     * name corresponding to the desired code set.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
    private static final int BTC_CACHE_MAP = 0;

    /**
     * Index in the thread local converterCaches array for
     * the byte to char converter Map.  A key is the Java
     * name corresponding to the desired code set.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
    private ThreadLocal converterCaches = new ThreadLocal() {

    /**
     * The ThreadLocal data is a 2 element Map array indexed
     * by BTC_CACHE_MAP and CTB_CACHE_MAP.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetCache.java
class CodeSetCache

/**
 * Thread local cache of sun.io code set converters for performance.
 *
 * The thread local class contains a single reference to a Map[]
 * containing two WeakHashMaps.  One for CharsetEncoders and
 * one for CharsetDecoders.  Constants are defined for indexing.
 *
 * This is used internally by CodeSetConversion.
 */
