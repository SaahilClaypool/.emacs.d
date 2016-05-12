_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public String toString() {

    /**
     * Creates a localized String representing all the relations in the set
     * using the default locale.
     *
     * @return comma separated localized String
     * @see AccessibleBundle#toDisplayString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public AccessibleRelation[] toArray() {

    /**
     * Returns the current relation set as an array of AccessibleRelation
     * @return AccessibleRelation array contacting the current relation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public AccessibleRelation get(String key) {

    /**
     * Returns the relation that matches the specified key.
     * @param key the AccessibleRelation key
     * @return the relation, if one exists, that matches the specified key.
     * Otherwise, null is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public boolean contains(String key) {

    /**
     * Returns whether the relation set contains a relation
     * that matches the specified key.
     * @param key the AccessibleRelation key
     * @return true if the relation is in the relation set; otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public int size() {

    /**
     * Returns the number of relations in the relation set.
     * @return the number of relations in the relation set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public void clear() {

    /**
     * Removes all the relations from the current relation set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public boolean remove(AccessibleRelation relation) {

    /**
     * Removes a relation from the current relation set.  If the relation
     * is not in the set, the relation set will be unchanged and the
     * return value will be false.  If the relation is in the relation
     * set, it will be removed from the set and the return value will be
     * true.
     *
     * @param relation the relation to remove from the relation set
     * @return true if the relation is in the relation set; false if the
     * relation set is unchanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public void addAll(AccessibleRelation[] relations) {

    /**
     * Adds all of the relations to the existing relation set.  Duplicate
     * entries are ignored.
     *
     * @param relations  AccessibleRelation array describing the relation set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public boolean add(AccessibleRelation relation) {

    /**
     * Adds a new relation to the current relation set.  If the relation
     * is already in the relation set, the target(s) of the specified
     * relation is merged with the target(s) of the existing relation.
     * Otherwise,  the new relation is added to the relation set.
     *
     * @param relation the relation to add to the relation set
     * @return true if relation is added to the relation set; false if the
     * relation set is unchanged
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public AccessibleRelationSet(AccessibleRelation[] relations) {

    /**
     * Creates a new relation with the initial set of relations contained in
     * the array of relations passed in.  Duplicate entries are ignored.
     *
     * @param relations an array of AccessibleRelation describing the
     * relation set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    public AccessibleRelationSet() {

    /**
     * Creates a new empty relation set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
    protected Vector<AccessibleRelation> relations = null;

    /**
     * Each entry in the Vector represents an AccessibleRelation.
     * @see #add
     * @see #addAll
     * @see #remove
     * @see #contains
     * @see #get
     * @see #size
     * @see #toArray
     * @see #clear
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleRelationSet.java
public class AccessibleRelationSet {

/**
 * Class AccessibleRelationSet determines a component's relation set.  The
 * relation set of a component is a set of AccessibleRelation objects that
 * describe the component's relationships with other components.
 *
 * @see AccessibleRelation
 *
 * @author      Lynn Monsanto
 * @since 1.3
 */
