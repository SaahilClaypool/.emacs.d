_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    class RemoveUndo extends AbstractUndoableEdit {

    /**
     * UndoableEdit created for removes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    class InsertUndo extends AbstractUndoableEdit {

    /**
     * UnoableEdit created for inserts.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
        protected PosRec rec;

        /** Position to reset offset. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
        protected int undoLocation;

        /** Location to reset to when resetLocatino is invoked. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
        protected void resetLocation() {

        /**
         * Resets the location of the Position to the offset when the
         * receiver was instantiated.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    final class UndoPosRef {

    /**
     * Used to hold a reference to a Position that is being reset as the
     * result of removing from the content.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    final class StickyPosition implements Position {

    /**
     * This really wants to be a weak reference but
     * in 1.1 we don't have a 100% pure solution for
     * this... so this class trys to hack a solution
     * to causing the marks to be collected.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    final class PosRec {

    /**
     * holds the data for a mark... separately from
     * the real mark so that the real mark can be
     * collected if there are no more references to
     * it.... the update table holds only a reference
     * to this grungy thing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    protected void updateUndoPositions(Vector positions) {

    /**
     * Resets the location for all the UndoPosRef instances
     * in <code>positions</code>.
     * <p>
     * This is meant for internal usage, and is generally not of interest
     * to subclasses.
     *
     * @param positions the positions of the instances
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    protected Vector getPositionsInRange(Vector v, int offset,
                                                      int length) {

    /**
     * Returns a Vector containing instances of UndoPosRef for the
     * Positions in the range
     * <code>offset</code> to <code>offset</code> + <code>length</code>.
     * If <code>v</code> is not null the matching Positions are placed in
     * there. The vector with the resulting Positions are returned.
     * <p>
     * This is meant for internal usage, and is generally not of interest
     * to subclasses.
     *
     * @param v the Vector to use, with a new one created on null
     * @param offset the starting offset &gt;= 0
     * @param length the length &gt;= 0
     * @return the set of instances
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    void replace(int offset, int length,
                 char[] replArray, int replOffset, int replLength) {

    /**
     * Replaces some of the characters in the array
     * @param offset  offset into the array to start the replace
     * @param length  number of characters to remove
     * @param replArray replacement array
     * @param replOffset offset into the replacement array
     * @param replLength number of character to use from the
     *   replacement array.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public Position createPosition(int offset) throws BadLocationException {

    /**
     * Creates a position within the content that will
     * track change as the content is mutated.
     *
     * @param offset the offset to create a position for &gt;= 0
     * @return the position
     * @exception BadLocationException if the specified position is invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public void getChars(int where, int len, Segment chars) throws BadLocationException {

    /**
     * Retrieves a portion of the content.  where + len must be &lt;= length()
     *
     * @param where the starting position &gt;= 0
     * @param len the number of characters to retrieve &gt;= 0
     * @param chars the Segment object to return the characters in
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#getChars
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public String getString(int where, int len) throws BadLocationException {

    /**
     * Retrieves a portion of the content.  where + len must be &lt;= length().
     *
     * @param where the starting position &gt;= 0
     * @param len the length to retrieve &gt;= 0
     * @return a string representing the content; may be empty
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#getString
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public UndoableEdit remove(int where, int nitems) throws BadLocationException {

    /**
     * Removes part of the content.  where + nitems must be &lt; length().
     *
     * @param where the starting position &gt;= 0
     * @param nitems the number of characters to remove &gt;= 0
     * @return an UndoableEdit object for undoing
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public UndoableEdit insertString(int where, String str) throws BadLocationException {

    /**
     * Inserts a string into the content.
     *
     * @param where the starting position &gt;= 0 &amp;&amp; &lt; length()
     * @param str the non-null string to insert
     * @return an UndoableEdit object for undoing
     * @exception BadLocationException if the specified position is invalid
     * @see AbstractDocument.Content#insertString
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public int length() {

    /**
     * Returns the length of the content.
     *
     * @return the length &gt;= 1
     * @see AbstractDocument.Content#length
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public StringContent(int initialLength) {

    /**
     * Creates a new StringContent object, with the initial
     * size specified.  If the length is &lt; 1, a size of 1 is used.
     *
     * @param initialLength the initial size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
    public StringContent() {

    /**
     * Creates a new StringContent object.  Initial size defaults to 10.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StringContent.java
public final class StringContent implements AbstractDocument.Content, Serializable {

/**
 * An implementation of the AbstractDocument.Content interface that is
 * a brute force implementation that is useful for relatively small
 * documents and/or debugging.  It manages the character content
 * as a simple character array.  It is also quite inefficient.
 * <p>
 * It is generally recommended that the gap buffer or piece table
 * implementations be used instead.  This buffer does not scale up
 * to large sizes.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author  Timothy Prinzing
 */
