_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public void setResolveParent(Keymap parent);

    /**
     * Sets the parent keymap, which will be used to
     * resolve key-bindings.
     * The behavior is unspecified if a {@code Keymap} has itself
     * as one of its resolve parents.
     *
     * @param parent the parent keymap
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public Keymap getResolveParent();

    /**
     * Fetches the parent keymap used to resolve key-bindings.
     *
     * @return the keymap
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public void removeBindings();

    /**
     * Removes all bindings from the keymap.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public void removeKeyStrokeBinding(KeyStroke keys);

    /**
     * Removes a binding from the keymap.
     *
     * @param keys the key sequence
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public void addActionForKeyStroke(KeyStroke key, Action a);

    /**
     * Adds a binding to the keymap.
     *
     * @param key the key sequence
     * @param a the action
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public boolean isLocallyDefined(KeyStroke key);

    /**
     * Determines if the given key sequence is locally defined.
     *
     * @param key the key sequence
     * @return true if the key sequence is locally defined else false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public KeyStroke[] getKeyStrokesForAction(Action a);

    /**
     * Fetches the keystrokes that will result in
     * the given action.
     *
     * @param a the action
     * @return the list of keystrokes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public Action[] getBoundActions();

    /**
     * Fetches all of the actions defined in this keymap.
     *
     * @return the list of actions
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public KeyStroke[] getBoundKeyStrokes();

    /**
     * Fetches all of the keystrokes in this map that
     * are bound to some action.
     *
     * @return the list of keystrokes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public Action getAction(KeyStroke key);

    /**
     * Fetches the action appropriate for the given symbolic
     * event sequence.  This is used by JTextController to
     * determine how to interpret key sequences.  If the
     * binding is not resolved locally, an attempt is made
     * to resolve through the parent keymap, if one is set.
     *
     * @param key the key sequence
     * @return  the action associated with the key
     *  sequence if one is defined, otherwise <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public void setDefaultAction(Action a);

    /**
     * Set the default action to fire if a key is typed.
     *
     * @param a the action
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public Action getDefaultAction();

    /**
     * Fetches the default action to fire if a
     * key is typed (i.e. a KEY_TYPED KeyEvent is received)
     * and there is no binding for it.  Typically this
     * would be some action that inserts text so that
     * the keymap doesn't require an action for each
     * possible key.
     *
     * @return the default action
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
    public String getName();

    /**
     * Fetches the name of the set of key-bindings.
     *
     * @return the name
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/Keymap.java
public interface Keymap {

/**
 * A collection of bindings of KeyStrokes to actions.  The
 * bindings are basically name-value pairs that potentially
 * resolve in a hierarchy.
 *
 * @author  Timothy Prinzing
 */
