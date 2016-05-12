_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
     public void selectAllAccessibleSelection();

    /**
     * Causes every child of the object to be selected
     * if the object supports multiple selections.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
     public void clearAccessibleSelection();

    /**
     * Clears the selection in the object, so that no children in the
     * object are selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
     public void removeAccessibleSelection(int i);

    /**
     * Removes the specified child of the object from the object's
     * selection.  If the specified item isn't currently selected, this
     * method has no effect.
     *
     * @param i the zero-based index of the child
     * @see AccessibleContext#getAccessibleChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
     public void addAccessibleSelection(int i);

    /**
     * Adds the specified Accessible child of the object to the object's
     * selection.  If the object supports multiple selections,
     * the specified child is added to any existing selection, otherwise
     * it replaces any existing selection in the object.  If the
     * specified child is already selected, this method has no effect.
     *
     * @param i the zero-based index of the child
     * @see AccessibleContext#getAccessibleChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
     public boolean isAccessibleChildSelected(int i);

    /**
     * Determines if the current child of this object is selected.
     *
     * @return true if the current child of this object is selected; else false.
     * @param i the zero-based index of the child in this Accessible object.
     * @see AccessibleContext#getAccessibleChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
     public Accessible getAccessibleSelection(int i);

    /**
     * Returns an Accessible representing the specified selected child
     * of the object.  If there isn't a selection, or there are
     * fewer children selected than the integer passed in, the return
     * value will be null.
     * <p>Note that the index represents the i-th selected child, which
     * is different from the i-th child.
     *
     * @param i the zero-based index of selected children
     * @return the i-th selected child
     * @see #getAccessibleSelectionCount
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
     public int getAccessibleSelectionCount();

    /**
     * Returns the number of Accessible children currently selected.
     * If no children are selected, the return value will be 0.
     *
     * @return the number of items currently selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleSelection.java
public interface AccessibleSelection {

/**
 * This AccessibleSelection interface
 * provides the standard mechanism for an assistive technology to determine
 * what the current selected children are, as well as modify the selection set.
 * Any object that has children that can be selected should support
 * the AccessibleSelection interface.  Applications can determine if an object supports the
 * AccessibleSelection interface by first obtaining its AccessibleContext (see
 * {@link Accessible}) and then calling the
 * {@link AccessibleContext#getAccessibleSelection} method.
 * If the return value is not null, the object supports this interface.
 *
 * @see Accessible
 * @see Accessible#getAccessibleContext
 * @see AccessibleContext
 * @see AccessibleContext#getAccessibleSelection
 *
 * @author      Peter Korn
 * @author      Hans Muller
 * @author      Willie Walker
 */
