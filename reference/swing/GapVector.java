_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected void shiftGapEndUp(int newGapEnd) {

    /**
     * Adjust the gap end upward.  This doesn't move
     * any data, but it does update any marks affected
     * by the boundary change. All marks from the old
     * gap end up to the new gap end are squeezed
     * to the end of the gap (their location has been
     * removed).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected void shiftGapStartDown(int newGapStart) {

    /**
     * Adjust the gap end downward.  This doesn't move
     * any data, but it does update any marks affected
     * by the boundary change.  All marks from the old
     * gap start down to the new gap start are squeezed
     * to the end of the gap (their location has been
     * removed).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected void shiftGap(int newGapStart) {

    /**
     * Move the start of the gap to a new location,
     * without changing the size of the gap.  This
     * moves the data in the array and updates the
     * marks accordingly.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    int getNewArraySize(int reqSize) {

    /**
     * Calculates a new size of the storage array depending on required
     * capacity.
     * @param reqSize the size which is necessary for new content
     * @return the new size of the storage array
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected void shiftEnd(int newSize) {

    /**
     * Make the gap bigger, moving any necessary data and updating
     * the appropriate marks
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    void resize(int nsize) {

    /**
     * resize the underlying storage array to the
     * given new size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    int open(int position, int nItems) {

    /**
     * Make space for the given number of items at the given
     * location.
     *
     * @return the location that the caller should fill in
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    void close(int position, int nItems) {

    /**
     * Delete nItems at position.  Squeezes any marks
     * within the deleted area to position.  This moves
     * the gap to the best place by minimizing it's
     * overall movement.  The gap must intersect the
     * target block.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected void replace(int position, int rmSize, Object addItems, int addSize) {

    /**
     * Replace the given logical position in the storage with
     * the given new items.  This will move the gap to the area
     * being changed if the gap is not currently located at the
     * change location.
     *
     * @param position the location to make the replacement.  This
     *  is not the location in the underlying storage array, but
     *  the location in the contiguous space being modeled.
     * @param rmSize the number of items to remove
     * @param addItems the new items to place in storage.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    private int g1;

    /**
     * end of gap in the array
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    private int g0;

    /**
     * start of gap in the array
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    private Object array;

    /**
     * The array of items.  The type is determined by the subclass.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected final int getGapEnd() {

    /**
     * Access to the end of the gap.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected final int getGapStart() {

    /**
     * Access to the start of the gap.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected final Object getArray() {

    /**
     * Access to the array.  The actual type
     * of the array is known only by the subclass.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected abstract int getArrayLength();

    /**
     * Get the length of the allocated array
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    protected abstract Object allocateArray(int len);

    /**
     * Allocate an array to store items of the type
     * appropriate (which is determined by the subclass).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    public GapVector(int initialLength) {

    /**
     * Creates a new GapVector object, with the initial
     * size specified.
     *
     * @param initialLength the initial size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
    public GapVector() {

    /**
     * Creates a new GapVector object.  Initial size defaults to 10.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/GapVector.java
abstract class GapVector implements Serializable {

/**
 * An implementation of a gapped buffer similar to that used by
 * emacs.  The underlying storage is a java array of some type,
 * which is known only by the subclass of this class.  The array
 * has a gap somewhere.  The gap is moved to the location of changes
 * to take advantage of common behavior where most changes occur
 * in the same location.  Changes that occur at a gap boundary are
 * generally cheap and moving the gap is generally cheaper than
 * moving the array contents directly to accommodate the change.
 *
 * @author  Timothy Prinzing
 * @see GapContent
 */
