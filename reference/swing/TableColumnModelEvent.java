_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TableColumnModelEvent.java
    public int getToIndex() { return toIndex; };

    /** Returns the toIndex.  Valid for add and moved events */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TableColumnModelEvent.java
    public int getFromIndex() { return fromIndex; };

    /** Returns the fromIndex.  Valid for removed or moved events */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TableColumnModelEvent.java
    public TableColumnModelEvent(TableColumnModel source, int from, int to) {

    /**
     * Constructs a {@code TableColumnModelEvent} object.
     *
     * @param source  the {@code TableColumnModel} that originated the event
     * @param from    an int specifying the index from where the column was
     *                moved or removed
     * @param to      an int specifying the index to where the column was
     *                moved or added
     * @see #getFromIndex
     * @see #getToIndex
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TableColumnModelEvent.java
    protected int       toIndex;

    /** The index of the column to where it was moved or added */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TableColumnModelEvent.java
    protected int       fromIndex;

    /** The index of the column from where it was moved or removed */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TableColumnModelEvent.java
public class TableColumnModelEvent extends java.util.EventObject

/**
 * <B>TableColumnModelEvent</B> is used to notify listeners that a table
 * column model has changed, such as a column was added, removed, or
 * moved.
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
 * @author Alan Chung
 * @see TableColumnModelListener
 */
