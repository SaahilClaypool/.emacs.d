_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MutableComboBoxModel.java
    public void removeElementAt( int index );

    /**
     * Removes an item at a specific index. The implementation of this method
     * should notify all registered <code>ListDataListener</code>s that the
     * item has been removed.
     *
     * @param index  location of the item to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MutableComboBoxModel.java
    public void insertElementAt( E item, int index );

    /**
     * Adds an item at a specific index.  The implementation of this method
     * should notify all registered <code>ListDataListener</code>s that the
     * item has been added.
     *
     * @param item  the item to be added
     * @param index  location to add the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MutableComboBoxModel.java
    public void removeElement( Object obj );

    /**
     * Removes an item from the model. The implementation of this method should
     * should notify all registered <code>ListDataListener</code>s that the
     * item has been removed.
     *
     * @param obj the <code>Object</code> to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MutableComboBoxModel.java
    public void addElement( E item );

    /**
     * Adds an item at the end of the model. The implementation of this method
     * should notify all registered <code>ListDataListener</code>s that the
     * item has been added.
     *
     * @param item the item to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MutableComboBoxModel.java
public interface MutableComboBoxModel<E> extends ComboBoxModel<E> {

/**
 * A mutable version of <code>ComboBoxModel</code>.
 *
 * @param <E> the type of the elements of this model
 *
 * @author Tom Santos
 */
