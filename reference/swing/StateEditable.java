_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/StateEditable.java
    public void restoreState(Hashtable<?,?> state);

    /**
     * Upon receiving this message the receiver should extract any relevant
     * state out of <EM>state</EM>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/StateEditable.java
    public void storeState(Hashtable<Object,Object> state);

    /**
     * Upon receiving this message the receiver should place any relevant
     * state into <EM>state</EM>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/StateEditable.java
    public static final String RCSID = "$Id: StateEditable.java,v 1.2 1997/09/08 19:39:08 marklin Exp $";

    /** Resource ID for this class. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/StateEditable.java
public interface StateEditable {

/**
 * StateEditable defines the interface for objects that can have
 * their state undone/redone by a StateEdit.
 *
 * @see StateEdit
 */
