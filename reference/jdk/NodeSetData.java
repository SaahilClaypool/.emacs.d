_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/NodeSetData.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns a read-only iterator over the nodes contained in this
     * <code>NodeSetData</code> in
     * <a href="http://www.w3.org/TR/1999/REC-xpath-19991116#dt-document-order">
     * document order</a>. Attempts to modify the returned iterator
     * via the <code>remove</code> method throw
     * <code>UnsupportedOperationException</code>.
     *
     * @return an <code>Iterator</code> over the nodes in this
     *    <code>NodeSetData</code> in document order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/NodeSetData.java
public interface NodeSetData extends Data {

/**
 * An abstract representation of a <code>Data</code> type containing a
 * node-set. The type (class) and ordering of the nodes contained in the set
 * are not defined by this class; instead that behavior should be
 * defined by <code>NodeSetData</code> subclasses.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 */
