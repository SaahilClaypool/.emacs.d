_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    private Element getDeepestLeaf(Element parent) {

    /**
     * Returns the last child of <code>parent</code> that is a leaf. If the
     * last child is a not a leaf, this method is called with the last child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public Element previous() {

    /**
     * Fetches the previous Element. If however the current
     * element is the last element, or the current element
     * is null, then null is returned.
     *
     * @return previous <code>Element</code> if available
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public Element next() {

    /**
     * Fetches the next Element. The strategy
     * used to locate the next element is
     * a depth-first search.
     *
     * @return the next element or <code>null</code>
     *          at the end of the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public Element current() {

    /**
     * Fetches the current Element.
     *
     * @return element on top of the stack or
     *          <code>null</code> if the root element is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public int depth() {

    /**
     * Fetches the current depth of element tree.
     *
     * @return the depth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public Element first() {

    /**
     * Fetches the first element.
     *
     * @return an Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public synchronized Object clone() {

    /**
     * Clones the ElementIterator.
     *
     * @return a cloned ElementIterator Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public ElementIterator(Element root) {

    /**
     * Creates a new ElementIterator.
     *
     * @param root the root Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    public ElementIterator(Document document) {

    /**
     * Creates a new ElementIterator. The
     * root element is taken to get the
     * default root element of the document.
     *
     * @param document a Document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
            this.item = elem;

            /**
             * -1 index implies a self reference,
             * as opposed to an index into its
             * list of children.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
    private class StackItem implements Cloneable {

    /**
     * The StackItem class stores the element
     * as well as a child index.  If the
     * index is -1, then the element represented
     * on the stack is the element itself.
     * Otherwise, the index functions as as index
     * into the vector of children of the element.
     * In this case, the item on the stack
     * represents the "index"th child of the element
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/ElementIterator.java
public class ElementIterator implements Cloneable {

/**
 * <p>
 * ElementIterator, as the name suggests, iterates over the Element
 * tree.  The constructor can be invoked with either Document or an Element
 * as an argument.  If the constructor is invoked with a Document as an
 * argument then the root of the iteration is the return value of
 * document.getDefaultRootElement().
 *
 * The iteration happens in a depth-first manner.  In terms of how
 * boundary conditions are handled:
 * a) if next() is called before first() or current(), the
 *    root will be returned.
 * b) next() returns null to indicate the end of the list.
 * c) previous() returns null when the current element is the root
 *    or next() has returned null.
 *
 * The ElementIterator does no locking of the Element tree. This means
 * that it does not track any changes.  It is the responsibility of the
 * user of this class, to ensure that no changes happen during element
 * iteration.
 *
 * Simple usage example:
 *
 *    public void iterate() {
 *        ElementIterator it = new ElementIterator(root);
 *        Element elem;
 *        while (true) {
 *           if ((elem = next()) != null) {
 *               // process element
 *               System.out.println("elem: " + elem.getName());
 *           } else {
 *               break;
 *           }
 *        }
 *    }
 *
 * @author Sunita Mani
 *
 */
