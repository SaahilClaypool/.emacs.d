_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public void readExternal(ObjectInput in)

    /**
     * Read the whole tree from a file (serialized)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final void resize(int newSize) {

    /**
     * Resizes the bit array - try to avoid using this method!!!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final BitArray merge(BitArray other) {

    /**
     * Merge two bit arrays. This currently only works for nodes from
     * a single DOM (because there is only one _mask per array).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final void setBit(int bit) {

    /**
     * Sets a given bit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final int[] data() {

    /**
     * Returns the integer array in which the bit array is contained
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    private int _pos = Integer.MAX_VALUE;

    /**
     * This method returns the Nth bit that is set in the bit array. The
     * current position is cached in the following 4 variables and will
     * help speed up a sequence of next() call in an index iterator. This
     * method is a mess, but it is fast and it works, so don't fuck with it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final int getNextBit(int startBit) {

    /**
     * Returns the next set bit from a given position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final boolean getBit(int bit) {

    /**
     * Returns true if the given bit is set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final int size() {

    /**
     * Returns the size of this bit array (in bits).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public int getMask() {

    /**
     * See setMask()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public void setMask(int mask) {

    /**
     * Set the mask for this bit array. The upper 8 bits of this mask
     * indicate the DOM in which the nodes in this array belong.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public BitArray() {

    /**
     * Constructor. Defines the initial size of the bit array (in bits).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
public class BitArray implements Externalizable {

/**
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public void readExternal(ObjectInput in)

    /**
     * Read the whole tree from a file (serialized)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final void resize(int newSize) {

    /**
     * Resizes the bit array - try to avoid using this method!!!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final BitArray merge(BitArray other) {

    /**
     * Merge two bit arrays. This currently only works for nodes from
     * a single DOM (because there is only one _mask per array).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final void setBit(int bit) {

    /**
     * Sets a given bit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final int[] data() {

    /**
     * Returns the integer array in which the bit array is contained
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    private int _pos = Integer.MAX_VALUE;

    /**
     * This method returns the Nth bit that is set in the bit array. The
     * current position is cached in the following 4 variables and will
     * help speed up a sequence of next() call in an index iterator. This
     * method is a mess, but it is fast and it works, so don't fuck with it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final int getNextBit(int startBit) {

    /**
     * Returns the next set bit from a given position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final boolean getBit(int bit) {

    /**
     * Returns true if the given bit is set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public final int size() {

    /**
     * Returns the size of this bit array (in bits).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public int getMask() {

    /**
     * See setMask()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public void setMask(int mask) {

    /**
     * Set the mask for this bit array. The upper 8 bits of this mask
     * indicate the DOM in which the nodes in this array belong.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
    public BitArray() {

    /**
     * Constructor. Defines the initial size of the bit array (in bits).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/BitArray.java
public class BitArray implements Externalizable {

/**
 * @author Morten Jorgensen
 */
