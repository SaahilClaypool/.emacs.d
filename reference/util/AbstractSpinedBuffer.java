_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    public abstract void clear();

    /**
     * Remove all data from the buffer
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    protected int chunkSize(int n) {

    /**
     * How big should the nth chunk be?
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    public long count() {

    /**
     * How many elements are currently in the buffer?
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    public boolean isEmpty() {

    /**
     * Is the buffer currently empty?
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    protected AbstractSpinedBuffer(int initialCapacity) {

    /**
     * Construct with a specified initial capacity.
     *
     * @param initialCapacity The minimum expected number of elements
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    protected AbstractSpinedBuffer() {

    /**
     * Construct with an initial capacity of 16.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    protected long[] priorElementCount;

    /**
     * Count of elements in all prior chunks.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    protected int spineIndex;

    /**
     * Index of the *current* chunk in the spine array, if the spine array is
     * non-null.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    protected int elementIndex;

    /**
     * Index of the *next* element to write; may point into, or just outside of,
     * the current chunk.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    protected final int initialChunkPower;

    /**
     * log2 of the size of the first chunk.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    public static final int MIN_SPINE_SIZE = 8;

    /**
     * Minimum array size for array-of-chunks.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    public static final int MAX_CHUNK_POWER = 30;

    /**
     * Max power-of-two for chunks.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    public static final int MIN_CHUNK_SIZE = 1 << MIN_CHUNK_POWER;

    /**
     * Minimum size for the first chunk.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
    public static final int MIN_CHUNK_POWER = 4;

    /**
     * Minimum power-of-two for the first chunk.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//stream/AbstractSpinedBuffer.java
abstract class AbstractSpinedBuffer {

/**
 * Base class for a data structure for gathering elements into a buffer and then
 * iterating them. Maintains an array of increasingly sized arrays, so there is
 * no copying cost associated with growing the data structure.
 * @since 1.8
 */
