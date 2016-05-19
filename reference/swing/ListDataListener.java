_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/ListDataListener.java
    void contentsChanged(ListDataEvent e);

    /**
     * Sent when the contents of the list has changed in a way
     * that's too complex to characterize with the previous
     * methods. For example, this is sent when an item has been
     * replaced. Index0 and index1 bracket the change.
     *
     * @param e  a <code>ListDataEvent</code> encapsulating the
     *    event information
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/ListDataListener.java
    void intervalRemoved(ListDataEvent e);

    /**
     * Sent after the indices in the index0,index1 interval
     * have been removed from the data model.  The interval
     * includes both index0 and index1.
     *
     * @param e  a <code>ListDataEvent</code> encapsulating the
     *    event information
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/ListDataListener.java
    void intervalAdded(ListDataEvent e);

    /**
     * Sent after the indices in the index0,index1
     * interval have been inserted in the data model.
     * The new interval includes both index0 and index1.
     *
     * @param e  a <code>ListDataEvent</code> encapsulating the
     *    event information
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/ListDataListener.java
public interface ListDataListener extends EventListener {

/**
 * ListDataListener
 *
 * @author Hans Muller
 */
