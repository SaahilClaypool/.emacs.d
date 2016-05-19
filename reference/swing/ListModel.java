_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ListModel.java
  void removeListDataListener(ListDataListener l);

  /**
   * Removes a listener from the list that's notified each time a
   * change to the data model occurs.
   * @param l the <code>ListDataListener</code> to be removed
   */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ListModel.java
  void addListDataListener(ListDataListener l);

  /**
   * Adds a listener to the list that's notified each time a change
   * to the data model occurs.
   * @param l the <code>ListDataListener</code> to be added
   */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ListModel.java
  E getElementAt(int index);

  /**
   * Returns the value at the specified index.
   * @param index the requested index
   * @return the value at <code>index</code>
   */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ListModel.java
  int getSize();

  /**
   * Returns the length of the list.
   * @return the length of the list
   */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ListModel.java
public interface ListModel<E>

/**
 * This interface defines the methods components like JList use
 * to get the value of each cell in a list and the length of the list.
 * Logically the model is a vector, indices vary from 0 to
 * ListDataModel.getSize() - 1.  Any change to the contents or
 * length of the data model must be reported to all of the
 * ListDataListeners.
 *
 * @param <E> the type of the elements of this model
 *
 * @author Hans Muller
 * @see JList
 */
