_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/ForwardPositionIterator.java
public final class ForwardPositionIterator extends DTMAxisIteratorBase {

/**
 * This iterator is a wrapper that always returns the position of
 * a node in document order. It is needed for the case where
 * a call to position() occurs in the context of an XSLT element
 * such as xsl:for-each, xsl:apply-templates, etc.
 *
 * The getPosition() methods in DTMAxisIterators defined
 * in DTMDefaultBaseIterators always return the position
 * in document order, which is backwards for XPath in the
 * case of the ancestor, ancestor-or-self, previous and
 * previous-sibling.
 *
 * XSLTC implements position() with the
 * BasisLibrary.positionF() method, and uses the
 * DTMAxisIterator.isReverse() method to determine
 * whether the result of getPosition() should be
 * interpreted as being equal to position().
 * But when the expression appears in apply-templates of
 * for-each, the position() function operates in document
 * order.
 *
 * The only effect of the ForwardPositionIterator is to force
 * the result of isReverse() to false, so that
 * BasisLibrary.positionF() calculates position() in a way
 * that's consistent with the context in which the
 * iterator is being used."
 *
 * (Apparently the correction of isReverse() occurs
 * implicitly, by inheritance. This class also appears
 * to maintain its own position counter, which seems
 * redundant.)
 *
 * @deprecated This class exists only for backwards compatibility with old
 *             translets.  New code should not reference it.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/ForwardPositionIterator.java
public final class ForwardPositionIterator extends DTMAxisIteratorBase {

/**
 * This iterator is a wrapper that always returns the position of
 * a node in document order. It is needed for the case where
 * a call to position() occurs in the context of an XSLT element
 * such as xsl:for-each, xsl:apply-templates, etc.
 *
 * The getPosition() methods in DTMAxisIterators defined
 * in DTMDefaultBaseIterators always return the position
 * in document order, which is backwards for XPath in the
 * case of the ancestor, ancestor-or-self, previous and
 * previous-sibling.
 *
 * XSLTC implements position() with the
 * BasisLibrary.positionF() method, and uses the
 * DTMAxisIterator.isReverse() method to determine
 * whether the result of getPosition() should be
 * interpreted as being equal to position().
 * But when the expression appears in apply-templates of
 * for-each, the position() function operates in document
 * order.
 *
 * The only effect of the ForwardPositionIterator is to force
 * the result of isReverse() to false, so that
 * BasisLibrary.positionF() calculates position() in a way
 * that's consistent with the context in which the
 * iterator is being used."
 *
 * (Apparently the correction of isReverse() occurs
 * implicitly, by inheritance. This class also appears
 * to maintain its own position counter, which seems
 * redundant.)
 *
 * @deprecated This class exists only for backwards compatibility with old
 *             translets.  New code should not reference it.
 */
