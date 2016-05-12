_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public String toString() {

    /**
     * Creates a localized String representing all the states in the set
     * using the default locale.
     *
     * @return comma separated localized String
     * @see AccessibleBundle#toDisplayString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public AccessibleState[] toArray() {

    /**
     * Returns the current state set as an array of AccessibleState
     * @return AccessibleState array containing the current state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public boolean contains(AccessibleState state) {

    /**
     * Checks if the current state is in the state set.
     * @param state the state
     * @return true if the state is in the state set; otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public void clear() {

    /**
     * Removes all the states from the current state set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public boolean remove(AccessibleState state) {

    /**
     * Removes a state from the current state set.  If the state is not
     * in the set, the state set will be unchanged and the return value
     * will be false.  If the state is in the state set, it will be removed
     * from the set and the return value will be true.
     *
     * @param state the state to remove from the state set
     * @return true if the state is in the state set; false if the state set
     * will be unchanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public void addAll(AccessibleState[] states) {

    /**
     * Adds all of the states to the existing state set.  Duplicate entries
     * are ignored.
     * @param states  AccessibleState array describing the state set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public boolean add(AccessibleState state) {

    /**
     * Adds a new state to the current state set if it is not already
     * present.  If the state is already in the state set, the state
     * set is unchanged and the return value is false.  Otherwise,
     * the state is added to the state set and the return value is
     * true.
     * @param state the state to add to the state set
     * @return true if state is added to the state set; false if the state set
     * is unchanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public AccessibleStateSet(AccessibleState[] states) {

    /**
     * Creates a new state with the initial set of states contained in
     * the array of states passed in.  Duplicate entries are ignored.
     *
     * @param states an array of AccessibleState describing the state set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    public AccessibleStateSet() {

    /**
     * Creates a new empty state set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
    protected Vector<AccessibleState> states = null;

    /**
     * Each entry in the Vector represents an AccessibleState.
     * @see #add
     * @see #addAll
     * @see #remove
     * @see #contains
     * @see #toArray
     * @see #clear
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStateSet.java
public class AccessibleStateSet {

/**
 * Class AccessibleStateSet determines a component's state set.  The state set
 * of a component is a set of AccessibleState objects and descriptions. E.G., The
 * current overall state of the object, such as whether it is enabled,
 * has focus, etc.
 *
 * @see AccessibleState
 *
 * @author      Willie Walker
 */
