_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemDouble(int bank, int i, double val) {

    /**
     * Sets the requested data array element in the specified bank to
     * the given <code>double</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemDouble(int)
     * @see #getElemDouble(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemDouble(int i, double val) {

    /**
     * Sets the requested data array element in the first (default)
     * bank to the given <code>double</code>.
     *
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemDouble(int)
     * @see #getElemDouble(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public double getElemDouble(int bank, int i) {

    /**
     * Returns the requested data array element from the specified
     * bank as a <code>double</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>double</code>.
     * @see #setElemDouble(int, double)
     * @see #setElemDouble(int, int, double)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public double getElemDouble(int i) {

    /**
     * Returns the requested data array element from the first
     * (default) bank as a <code>double</code>.
     *
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>double</code>.
     * @see #setElemDouble(int, double)
     * @see #setElemDouble(int, int, double)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemFloat(int bank, int i, float val) {

    /**
     * Sets the requested data array element in the specified bank to
     * the given <code>float</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemFloat(int)
     * @see #getElemFloat(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemFloat(int i, float val) {

    /**
     * Sets the requested data array element in the first (default)
     * bank to the given <code>float</code>.
     *
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemFloat(int)
     * @see #getElemFloat(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float getElemFloat(int bank, int i) {

    /**
     * Returns the requested data array element from the specified
     * bank as a <code>float</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>float</code>.
     * @see #setElemFloat(int, float)
     * @see #setElemFloat(int, int, float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float getElemFloat(int i) {

    /**
     * Returns the requested data array element from the first
     * (default) bank as a <code>float</code>.
     *
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>float</code>.
     * @see #setElemFloat(int, float)
     * @see #setElemFloat(int, int, float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElem(int bank, int i, int val) {

    /**
     * Sets the requested data array element in the specified bank to
     * the given <code>int</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElem(int)
     * @see #getElem(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElem(int i, int val) {

    /**
     * Sets the requested data array element in the first (default)
     * bank to the given <code>int</code>.
     *
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElem(int)
     * @see #getElem(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public int getElem(int bank, int i) {

    /**
     * Returns the requested data array element from the specified
     * bank as an <code>int</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     *
     * @return The data entry as an <code>int</code>.
     * @see #setElem(int, int)
     * @see #setElem(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public int getElem(int i) {

    /**
     * Returns the requested data array element from the first
     * (default) bank as an <code>int</code>.
     *
     * @param i The desired data array element.
     *
     * @return The data entry as an <code>int</code>.
     * @see #setElem(int, int)
     * @see #setElem(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float[][] getBankData() {

    /**
     * Returns the data array for all banks.
     * <p>
     * Note that calling this method may cause this {@code DataBuffer}
     * object to be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @return all data arrays for this data buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float[] getData(int bank) {

    /**
     * Returns the data array for the specified bank.
     * <p>
     * Note that calling this method may cause this {@code DataBuffer}
     * object to be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param bank the data array
     * @return the data array specified by <code>bank</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float[] getData() {

    /**
     * Returns the default (first) <code>float</code> data array.
     * <p>
     * Note that calling this method may cause this {@code DataBuffer}
     * object to be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @return the first float data array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[][], int size, int offsets[]) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data arrays, size, and per-bank offsets.
     * The number of banks is equal to <code>dataArray.length</code>.
     * Each array must be at least as large as <code>size</code> plus the
     * corresponding offset.  There must be an entry in the offsets
     * array for each data array.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of arrays of <code>float</code>s to be
     *                  used as the banks of this <code>DataBuffer</code>.
     * @param size The number of elements of each array to be used.
     * @param offsets An array of integer offsets, one for each bank.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[][], int size) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data arrays.  Only the first
     * <code>size</code> elements of each array are available for use
     * by this <code>DataBuffer</code>.  The number of banks will be
     * equal to <code>dataArray.length</code>.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of arrays of <code>float</code>s to be
     *                  used as the banks of this <code>DataBuffer</code>.
     * @param size The number of elements of each array to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[], int size, int offset) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data array.  Only the elements between
     * <code>offset</code> and <code>offset + size - 1</code> are
     * available for use by this <code>DataBuffer</code>.  The array
     * must be large enough to hold <code>offset + size</code>
     * elements.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of <code>float</code>s to be used as the
     *                  first and only bank of this <code>DataBuffer</code>.
     * @param size The number of elements of the array to be used.
     * @param offset The offset of the first element of the array
     *               that will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[], int size) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data array.  Only the first
     * <code>size</code> elements are available for use by this
     * <code>DataBuffer</code>.  The array must be large enough to
     * hold <code>size</code> elements.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of <code>float</code>s to be used as the
     *                  first and only bank of this <code>DataBuffer</code>.
     * @param size The number of elements of the array to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(int size, int numBanks) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with a specified number of banks, all of which are of a
     * specified size.
     *
     * @param size The number of elements in each bank of the
     * <code>DataBuffer</code>.
     * @param numBanks The number of banks in the
     *        <code>DataBuffer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(int size) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with a specified size.
     *
     * @param size The number of elements in the DataBuffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    float data[];

    /** A reference to the default data bank. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    float bankdata[][];

    /** The array of data banks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
public final class DataBufferFloat extends DataBuffer {

/**
 * This class extends <code>DataBuffer</code> and stores data internally
 * in <code>float</code> form.
 * <p>
 * <a name="optimizations">
 * Note that some implementations may function more efficiently
 * if they can maintain control over how the data for an image is
 * stored.
 * For example, optimizations such as caching an image in video
 * memory require that the implementation track all modifications
 * to that data.
 * Other implementations may operate better if they can store the
 * data in locations other than a Java array.
 * To maintain optimum compatibility with various optimizations
 * it is best to avoid constructors and methods which expose the
 * underlying storage as a Java array as noted below in the
 * documentation for those methods.
 * </a>
 *
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemDouble(int bank, int i, double val) {

    /**
     * Sets the requested data array element in the specified bank to
     * the given <code>double</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemDouble(int)
     * @see #getElemDouble(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemDouble(int i, double val) {

    /**
     * Sets the requested data array element in the first (default)
     * bank to the given <code>double</code>.
     *
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemDouble(int)
     * @see #getElemDouble(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public double getElemDouble(int bank, int i) {

    /**
     * Returns the requested data array element from the specified
     * bank as a <code>double</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>double</code>.
     * @see #setElemDouble(int, double)
     * @see #setElemDouble(int, int, double)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public double getElemDouble(int i) {

    /**
     * Returns the requested data array element from the first
     * (default) bank as a <code>double</code>.
     *
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>double</code>.
     * @see #setElemDouble(int, double)
     * @see #setElemDouble(int, int, double)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemFloat(int bank, int i, float val) {

    /**
     * Sets the requested data array element in the specified bank to
     * the given <code>float</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemFloat(int)
     * @see #getElemFloat(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElemFloat(int i, float val) {

    /**
     * Sets the requested data array element in the first (default)
     * bank to the given <code>float</code>.
     *
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElemFloat(int)
     * @see #getElemFloat(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float getElemFloat(int bank, int i) {

    /**
     * Returns the requested data array element from the specified
     * bank as a <code>float</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>float</code>.
     * @see #setElemFloat(int, float)
     * @see #setElemFloat(int, int, float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float getElemFloat(int i) {

    /**
     * Returns the requested data array element from the first
     * (default) bank as a <code>float</code>.
     *
     * @param i The desired data array element.
     *
     * @return The data entry as a <code>float</code>.
     * @see #setElemFloat(int, float)
     * @see #setElemFloat(int, int, float)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElem(int bank, int i, int val) {

    /**
     * Sets the requested data array element in the specified bank to
     * the given <code>int</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElem(int)
     * @see #getElem(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public void setElem(int i, int val) {

    /**
     * Sets the requested data array element in the first (default)
     * bank to the given <code>int</code>.
     *
     * @param i The desired data array element.
     * @param val The value to be set.
     * @see #getElem(int)
     * @see #getElem(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public int getElem(int bank, int i) {

    /**
     * Returns the requested data array element from the specified
     * bank as an <code>int</code>.
     *
     * @param bank The bank number.
     * @param i The desired data array element.
     *
     * @return The data entry as an <code>int</code>.
     * @see #setElem(int, int)
     * @see #setElem(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public int getElem(int i) {

    /**
     * Returns the requested data array element from the first
     * (default) bank as an <code>int</code>.
     *
     * @param i The desired data array element.
     *
     * @return The data entry as an <code>int</code>.
     * @see #setElem(int, int)
     * @see #setElem(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float[][] getBankData() {

    /**
     * Returns the data array for all banks.
     * <p>
     * Note that calling this method may cause this {@code DataBuffer}
     * object to be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @return all data arrays for this data buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float[] getData(int bank) {

    /**
     * Returns the data array for the specified bank.
     * <p>
     * Note that calling this method may cause this {@code DataBuffer}
     * object to be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param bank the data array
     * @return the data array specified by <code>bank</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public float[] getData() {

    /**
     * Returns the default (first) <code>float</code> data array.
     * <p>
     * Note that calling this method may cause this {@code DataBuffer}
     * object to be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @return the first float data array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[][], int size, int offsets[]) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data arrays, size, and per-bank offsets.
     * The number of banks is equal to <code>dataArray.length</code>.
     * Each array must be at least as large as <code>size</code> plus the
     * corresponding offset.  There must be an entry in the offsets
     * array for each data array.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of arrays of <code>float</code>s to be
     *                  used as the banks of this <code>DataBuffer</code>.
     * @param size The number of elements of each array to be used.
     * @param offsets An array of integer offsets, one for each bank.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[][], int size) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data arrays.  Only the first
     * <code>size</code> elements of each array are available for use
     * by this <code>DataBuffer</code>.  The number of banks will be
     * equal to <code>dataArray.length</code>.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of arrays of <code>float</code>s to be
     *                  used as the banks of this <code>DataBuffer</code>.
     * @param size The number of elements of each array to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[], int size, int offset) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data array.  Only the elements between
     * <code>offset</code> and <code>offset + size - 1</code> are
     * available for use by this <code>DataBuffer</code>.  The array
     * must be large enough to hold <code>offset + size</code>
     * elements.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of <code>float</code>s to be used as the
     *                  first and only bank of this <code>DataBuffer</code>.
     * @param size The number of elements of the array to be used.
     * @param offset The offset of the first element of the array
     *               that will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(float dataArray[], int size) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with the specified data array.  Only the first
     * <code>size</code> elements are available for use by this
     * <code>DataBuffer</code>.  The array must be large enough to
     * hold <code>size</code> elements.
     * <p>
     * Note that {@code DataBuffer} objects created by this constructor
     * may be incompatible with <a href="#optimizations">performance
     * optimizations</a> used by some implementations (such as caching
     * an associated image in video memory).
     *
     * @param dataArray An array of <code>float</code>s to be used as the
     *                  first and only bank of this <code>DataBuffer</code>.
     * @param size The number of elements of the array to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(int size, int numBanks) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with a specified number of banks, all of which are of a
     * specified size.
     *
     * @param size The number of elements in each bank of the
     * <code>DataBuffer</code>.
     * @param numBanks The number of banks in the
     *        <code>DataBuffer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    public DataBufferFloat(int size) {

    /**
     * Constructs a <code>float</code>-based <code>DataBuffer</code>
     * with a specified size.
     *
     * @param size The number of elements in the DataBuffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    float data[];

    /** A reference to the default data bank. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
    float bankdata[][];

    /** The array of data banks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/DataBufferFloat.java
public final class DataBufferFloat extends DataBuffer {

/**
 * This class extends <code>DataBuffer</code> and stores data internally
 * in <code>float</code> form.
 * <p>
 * <a name="optimizations">
 * Note that some implementations may function more efficiently
 * if they can maintain control over how the data for an image is
 * stored.
 * For example, optimizations such as caching an image in video
 * memory require that the implementation track all modifications
 * to that data.
 * Other implementations may operate better if they can store the
 * data in locations other than a Java array.
 * To maintain optimum compatibility with various optimizations
 * it is best to avoid constructors and methods which expose the
 * underlying storage as a Java array as noted below in the
 * documentation for those methods.
 * </a>
 *
 * @since 1.4
 */
