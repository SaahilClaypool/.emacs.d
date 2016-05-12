_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
        public Entry next;

        /** The next entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected static final class Entry {

    /**
     * This class is a key table entry. Each entry acts as a node
     * in a linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected void rebalance() {

    /**
     * Randomly selects a new hash function and reorganizes this SymbolHash
     * in order to more evenly distribute its entries across the table. This
     * method is called automatically when the number keys in one of the
     * SymbolHash's buckets exceeds MAX_HASH_COLLISIONS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected void rehash() {

    /**
     * Increases the capacity of and internally reorganizes this
     * SymbolHash, in order to accommodate and access its entries more
     * efficiently.  This method is called automatically when the
     * number of keys in the SymbolHash exceeds its number of buckets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int hash(Object key) {

    /**
     * Returns a hashcode value for the specified key.
     *
     * @param key The key to hash.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public void clear() {

    /**
     * Remove all key/value association. This tries to save a bit of GC'ing
     * by at least keeping the fBuckets array around.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public SymbolHash makeClone() {

    /**
     * Make a clone of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public Object[] getEntries() {

    /**
     * Return key/value pairs of all entries in the map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public int getValues(Object[] elements, int from) {

    /**
     * Add all values to the given array. The array must have enough entry.
     *
     * @param elements  the array to store the elements
     * @param from      where to start store element in the array
     * @return          number of elements copied to the array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public int getLength() {

    /**
     * Get the number of key/value pairs stored in this table.
     *
     * @return the number of key/value pairs stored in this table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public Object get(Object key) {

    /**
     * Get the value associated with the given key.
     *
     * @param key
     * @return the value associated with the given key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public void put(Object key, Object value) {

    /**
     * Adds the key/value mapping to the key table. If the key already exists,
     * the previous value associated with this key is overwritten by the new
     * value.
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public SymbolHash(int size) {

    /**
     * Constructs a key table with a given size.
     *
     * @param size  the size of the key table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public SymbolHash() {

    /** Constructs a key table with the default size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int[] fHashMultipliers;

    /**
     * Array of randomly selected hash function multipliers or <code>null</code>
     * if the default String.hashCode() function should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int fNum = 0;

    /** Number of elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected Entry[] fBuckets;

    /** Buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int fTableSize;

    /** Actual table size **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected static final int MAX_HASH_COLLISIONS = 40;

    /** Maximum hash collisions per bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected static final int TABLE_SIZE = 101;

    /** Default table size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
public class SymbolHash {

/**
 * This class is an unsynchronized hash table primary used for String
 * to Object mapping.
 * <p>
 * The hash code uses the same algorithm as SymbolTable class.
 *
 * @author Elena Litani
 * @version $Id: SymbolHash.java,v 1.7 2010-11-01 04:40:14 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
        public Entry next;

        /** The next entry. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected static final class Entry {

    /**
     * This class is a key table entry. Each entry acts as a node
     * in a linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected void rebalance() {

    /**
     * Randomly selects a new hash function and reorganizes this SymbolHash
     * in order to more evenly distribute its entries across the table. This
     * method is called automatically when the number keys in one of the
     * SymbolHash's buckets exceeds MAX_HASH_COLLISIONS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected void rehash() {

    /**
     * Increases the capacity of and internally reorganizes this
     * SymbolHash, in order to accommodate and access its entries more
     * efficiently.  This method is called automatically when the
     * number of keys in the SymbolHash exceeds its number of buckets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int hash(Object key) {

    /**
     * Returns a hashcode value for the specified key.
     *
     * @param key The key to hash.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public void clear() {

    /**
     * Remove all key/value association. This tries to save a bit of GC'ing
     * by at least keeping the fBuckets array around.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public SymbolHash makeClone() {

    /**
     * Make a clone of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public Object[] getEntries() {

    /**
     * Return key/value pairs of all entries in the map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public int getValues(Object[] elements, int from) {

    /**
     * Add all values to the given array. The array must have enough entry.
     *
     * @param elements  the array to store the elements
     * @param from      where to start store element in the array
     * @return          number of elements copied to the array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public int getLength() {

    /**
     * Get the number of key/value pairs stored in this table.
     *
     * @return the number of key/value pairs stored in this table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public Object get(Object key) {

    /**
     * Get the value associated with the given key.
     *
     * @param key
     * @return the value associated with the given key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public void put(Object key, Object value) {

    /**
     * Adds the key/value mapping to the key table. If the key already exists,
     * the previous value associated with this key is overwritten by the new
     * value.
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public SymbolHash(int size) {

    /**
     * Constructs a key table with a given size.
     *
     * @param size  the size of the key table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    public SymbolHash() {

    /** Constructs a key table with the default size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int[] fHashMultipliers;

    /**
     * Array of randomly selected hash function multipliers or <code>null</code>
     * if the default String.hashCode() function should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int fNum = 0;

    /** Number of elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected Entry[] fBuckets;

    /** Buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected int fTableSize;

    /** Actual table size **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected static final int MAX_HASH_COLLISIONS = 40;

    /** Maximum hash collisions per bucket. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
    protected static final int TABLE_SIZE = 101;

    /** Default table size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/SymbolHash.java
public class SymbolHash {

/**
 * This class is an unsynchronized hash table primary used for String
 * to Object mapping.
 * <p>
 * The hash code uses the same algorithm as SymbolTable class.
 *
 * @author Elena Litani
 * @version $Id: SymbolHash.java,v 1.7 2010-11-01 04:40:14 joehw Exp $
 */
