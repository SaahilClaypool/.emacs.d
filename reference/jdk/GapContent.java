_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected String string;

        /** The string that was removed. This is valid when redo is valid. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected int offset;

        /** Where the string was removed from. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    class RemoveUndo extends AbstractUndoableEdit {

    /**
     * UndoableEdit created for removes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected String string;

        /** The string that was inserted. This will only be valid after an
         * undo. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected int offset;

        /** Where string was inserted. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    class InsertUndo extends AbstractUndoableEdit {

    /**
     * UnoableEdit created for inserts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected int undoLocation;

        /** Previous Offset of rec. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected void resetLocation(int endOffset, int g1) {

        /**
         * Resets the location of the Position to the offset when the
         * receiver was instantiated.
         *
         * @param endOffset end location of inserted string.
         * @param g1 resulting end of gap.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    final class UndoPosRef {

    /**
     * Used to hold a reference to a Mark that is being reset as the
     * result of removing from the content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    protected void updateUndoPositions(Vector positions, int offset,
                                       int length) {

    /**
     * Resets the location for all the UndoPosRef instances
     * in <code>positions</code>.
     * <p>
     * This is meant for internal usage, and is generally not of interest
     * to subclasses.
     *
     * @param positions the UndoPosRef instances to reset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    protected Vector getPositionsInRange(Vector v, int offset, int length) {

    /**
     * Returns a Vector containing instances of UndoPosRef for the
     * Positions in the range
     * <code>offset</code> to <code>offset</code> + <code>length</code>.
     * If <code>v</code> is not null the matching Positions are placed in
     * there. The vector with the resulting Positions are returned.
     *
     * @param v the Vector to use, with a new one created on null
     * @param offset the starting offset &gt;= 0
     * @param length the length &gt;= 0
     * @return the set of instances
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected void replaceRange(int start, int end, Object[] marks) {

        /**
         * Replaces the elements in the specified range with the passed
         * in objects. This will NOT adjust the gap. The passed in indices
         * do not account for the gap, they are the same as would be used
         * int <code>elementAt</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        public MarkData elementAt(int index) {

        /**
         * Fetches the mark at the given index
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        public void addElement(MarkData m) {

        /**
         * Add a mark to the end
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        public void insertElementAt(MarkData m, int index) {

        /**
         * Inserts a mark into the vector
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        public int size() {

        /**
         * Returns the number of marks currently held
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected int getArrayLength() {

        /**
         * Get the length of the allocated array
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        protected Object allocateArray(int len) {

        /**
         * Allocate an array to store items of the type
         * appropriate (which is determined by the subclass).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    final void removeUnusedMarks() {

    /**
     * Remove all unused marks out of the sorted collection
     * of marks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    final int findSortIndex(MarkData o) {

    /**
     * Finds the index of where to insert a new mark.
     *
     * @param o the mark to insert
     * @return the index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    final int findMarkAdjustIndex(int searchIndex) {

    /**
     * Finds the index to start mark adjustments given
     * some search index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    final int compare(MarkData o1, MarkData o2) {

    /**
     * Compares two marks.
     *
     * @param o1 the first object
     * @param o2 the second object
     * @return < 0 if o1 < o2, 0 if the same, > 0 if o1 > o2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    protected void resetMarksAtZero() {

    /**
     * Resets all the marks that have an offset of 0 to have an index of
     * zero as well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    protected void shiftGap(int newGapStart) {

    /**
     * Move the start of the gap to a new location,
     * without changing the size of the gap.  This
     * moves the data in the array and updates the
     * marks accordingly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    int getNewArraySize(int reqSize) {

    /**
     * Overridden to make growth policy less agressive for large
     * text amount.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    protected void shiftEnd(int newSize) {

    /**
     * Make the gap bigger, moving any necessary data and updating
     * the appropriate marks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    private transient int unusedMarks = 0;

    /**
     * The number of unused mark entries
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    private transient MarkData search;

    /**
     * Record used for searching for the place to
     * start updating mark indexs when the gap
     * boundaries are moved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
        public final int getOffset() {

        /**
         * Fetch the location in the contiguous sequence
         * being modeled.  The index in the gap array
         * is held by the mark, so it is adjusted according
         * to it's relationship to the gap.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    final class MarkData extends WeakReference<StickyPosition> {

    /**
     * Holds the data for a mark... separately from
     * the real mark so that the real mark (Position
     * that the caller of createPosition holds) can be
     * collected if there are no more references to
     * it.  The update table holds only a reference
     * to this data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public Position createPosition(int offset) throws BadLocationException {

    /**
     * Creates a position within the content that will
     * track change as the content is mutated.
     *
     * @param offset the offset to track &gt;= 0
     * @return the position
     * @exception BadLocationException if the specified position is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public void getChars(int where, int len, Segment chars) throws BadLocationException {

    /**
     * Retrieves a portion of the content.  If the desired content spans
     * the gap, we copy the content.  If the desired content does not
     * span the gap, the actual store is returned to avoid the copy since
     * it is contiguous.
     *
     * @param where the starting position &gt;= 0, where + len &lt;= length()
     * @param len the number of characters to retrieve &gt;= 0
     * @param chars the Segment object to return the characters in
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#getChars
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public String getString(int where, int len) throws BadLocationException {

    /**
     * Retrieves a portion of the content.
     *
     * @param where the starting position &gt;= 0
     * @param len the length to retrieve &gt;= 0
     * @return a string representing the content
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#getString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public UndoableEdit remove(int where, int nitems) throws BadLocationException {

    /**
     * Removes part of the content.
     *
     * @param where the starting position &gt;= 0, where + nitems &lt; length()
     * @param nitems the number of characters to remove &gt;= 0
     * @return an UndoableEdit object for undoing
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public UndoableEdit insertString(int where, String str) throws BadLocationException {

    /**
     * Inserts a string into the content.
     *
     * @param where the starting position &gt;= 0, &lt; length()
     * @param str the non-null string to insert
     * @return an UndoableEdit object for undoing
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#insertString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public int length() {

    /**
     * Returns the length of the content.
     *
     * @return the length &gt;= 1
     * @see AbstractDocument.Content#length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    protected int getArrayLength() {

    /**
     * Get the length of the allocated array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    protected Object allocateArray(int len) {

    /**
     * Allocate an array to store items of the type
     * appropriate (which is determined by the subclass).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public GapContent(int initialLength) {

    /**
     * Creates a new GapContent object, with the initial
     * size specified.  The initial size will not be allowed
     * to go below 2, to give room for the implied break and
     * the gap.
     *
     * @param initialLength the initial size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
    public GapContent() {

    /**
     * Creates a new GapContent object.  Initial size defaults to 10.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GapContent.java
public class GapContent extends GapVector implements AbstractDocument.Content, Serializable {

/**
 * An implementation of the AbstractDocument.Content interface
 * implemented using a gapped buffer similar to that used by emacs.
 * The underlying storage is a array of unicode characters with
 * a gap somewhere.  The gap is moved to the location of changes
 * to take advantage of common behavior where most changes are
 * in the same location.  Changes that occur at a gap boundary are
 * generally cheap and moving the gap is generally cheaper than
 * moving the array contents directly to accommodate the change.
 * <p>
 * The positions tracking change are also generally cheap to
 * maintain.  The Position implementations (marks) store the array
 * index and can easily calculate the sequential position from
 * the current gap location.  Changes only require update to the
 * the marks between the old and new gap boundaries when the gap
 * is moved, so generally updating the marks is pretty cheap.
 * The marks are stored sorted so they can be located quickly
 * with a binary search.  This increases the cost of adding a
 * mark, and decreases the cost of keeping the mark updated.
 *
 * @author  Timothy Prinzing
 */
