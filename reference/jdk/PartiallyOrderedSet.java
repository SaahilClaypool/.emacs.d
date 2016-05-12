_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
    public boolean hasOrdering(Object preferred, Object other) {

    /**
     * Returns <code>true</code> if an ordering exists between two
     * nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
    public boolean unsetOrdering(Object first, Object second) {

    /**
     * Removes any ordering between two nodes.
     *
     * @return true if a prior prefence existed between the nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
    public boolean setOrdering(Object first, Object second) {

    /**
     * Sets an ordering between two nodes.  When an iterator is
     * requested, the first node will appear earlier in the
     * sequence than the second node.  If a prior ordering existed
     * between the nodes in the opposite order, it is removed.
     *
     * @return <code>true</code> if no prior ordering existed
     * between the nodes, <code>false</code>otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
    public boolean remove(Object o) {

    /**
     * Removes an <code>Object</code> from this
     * <code>PartiallyOrderedSet</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
    public boolean add(Object o) {

    /**
     * Adds an <code>Object</code> to this
     * <code>PartiallyOrderedSet</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
    public Iterator iterator() {

    /**
     * Returns an iterator over the elements contained in this
     * collection, with an ordering that respects the orderings set
     * by the <code>setOrdering</code> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
    public PartiallyOrderedSet() {}

    /**
     * Constructs a <code>PartiallyOrderedSet</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/PartiallyOrderedSet.java
class PartiallyOrderedSet extends AbstractSet {

/**
 * A set of <code>Object</code>s with pairwise orderings between them.
 * The <code>iterator</code> method provides the elements in
 * topologically sorted order.  Elements participating in a cycle
 * are not returned.
 *
 * Unlike the <code>SortedSet</code> and <code>SortedMap</code>
 * interfaces, which require their elements to implement the
 * <code>Comparable</code> interface, this class receives ordering
 * information via its <code>setOrdering</code> and
 * <code>unsetPreference</code> methods.  This difference is due to
 * the fact that the relevant ordering between elements is unlikely to
 * be inherent in the elements themselves; rather, it is set
 * dynamically accoring to application policy.  For example, in a
 * service provider registry situation, an application might allow the
 * user to set a preference order for service provider objects
 * supplied by a trusted vendor over those supplied by another.
 *
 */
