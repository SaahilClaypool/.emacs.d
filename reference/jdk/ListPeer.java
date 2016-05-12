_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    Dimension getMinimumSize(int rows);

    /**
     * Returns the minimum size for a list with the specified number of rows.
     *
     * @param rows the number of rows
     *
     * @return the minimum size of the list
     *
     * @see List#getMinimumSize(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    Dimension getPreferredSize(int rows);

    /**
     * Returns the preferred size for a list with the specified number of rows.
     *
     * @param rows the number of rows
     *
     * @return the preferred size of the list
     *
     * @see List#getPreferredSize(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void setMultipleMode(boolean m);

    /**
     * Toggles multiple selection mode on or off.
     *
     * @param m {@code true} for multiple selection mode,
     *        {@code false} for single selection mode
     *
     * @see List#setMultipleMode(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void makeVisible(int index);

    /**
     * Makes sure that the item at the specified {@code index} is visible,
     * by scrolling the list or similar.
     *
     * @param index the index of the item to make visible
     *
     * @see List#makeVisible(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void deselect(int index);

    /**
     * De-selects the item at the specified {@code index}.
     *
     * @param index the index of the item to de-select
     *
     * @see List#deselect(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void select(int index);

    /**
     * Selects the item at the specified {@code index}.
     *
     * @param index the index of the item to select
     *
     * @see List#select(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void removeAll();

    /**
     * Removes all items from the list.
     *
     * @see List#removeAll()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void delItems(int start, int end);

    /**
     * Deletes items from the list. All items from start to end should are
     * deleted, including the item at the start and end indices.
     *
     * @param start the first item to be deleted
     * @param end the last item to be deleted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void add(String item, int index);

    /**
     * Adds an item to the list at the specified index.
     *
     * @param item the item to add to the list
     * @param index the index where to add the item into the list
     *
     * @see List#add(String, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    int[] getSelectedIndexes();

    /**
     * Returns the indices of the list items that are currently selected.
     * The returned array is not required to be a copy, the callers of this
     * method already make sure it is not modified.
     *
     * @return the indices of the list items that are currently selected
     *
     * @see List#getSelectedIndexes()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
public interface ListPeer extends ComponentPeer {

/**
 * The peer interface for {@link List}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    Dimension getMinimumSize(int rows);

    /**
     * Returns the minimum size for a list with the specified number of rows.
     *
     * @param rows the number of rows
     *
     * @return the minimum size of the list
     *
     * @see List#getMinimumSize(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    Dimension getPreferredSize(int rows);

    /**
     * Returns the preferred size for a list with the specified number of rows.
     *
     * @param rows the number of rows
     *
     * @return the preferred size of the list
     *
     * @see List#getPreferredSize(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void setMultipleMode(boolean m);

    /**
     * Toggles multiple selection mode on or off.
     *
     * @param m {@code true} for multiple selection mode,
     *        {@code false} for single selection mode
     *
     * @see List#setMultipleMode(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void makeVisible(int index);

    /**
     * Makes sure that the item at the specified {@code index} is visible,
     * by scrolling the list or similar.
     *
     * @param index the index of the item to make visible
     *
     * @see List#makeVisible(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void deselect(int index);

    /**
     * De-selects the item at the specified {@code index}.
     *
     * @param index the index of the item to de-select
     *
     * @see List#deselect(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void select(int index);

    /**
     * Selects the item at the specified {@code index}.
     *
     * @param index the index of the item to select
     *
     * @see List#select(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void removeAll();

    /**
     * Removes all items from the list.
     *
     * @see List#removeAll()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void delItems(int start, int end);

    /**
     * Deletes items from the list. All items from start to end should are
     * deleted, including the item at the start and end indices.
     *
     * @param start the first item to be deleted
     * @param end the last item to be deleted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    void add(String item, int index);

    /**
     * Adds an item to the list at the specified index.
     *
     * @param item the item to add to the list
     * @param index the index where to add the item into the list
     *
     * @see List#add(String, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
    int[] getSelectedIndexes();

    /**
     * Returns the indices of the list items that are currently selected.
     * The returned array is not required to be a copy, the callers of this
     * method already make sure it is not modified.
     *
     * @return the indices of the list items that are currently selected
     *
     * @see List#getSelectedIndexes()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/ListPeer.java
public interface ListPeer extends ComponentPeer {

/**
 * The peer interface for {@link List}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
