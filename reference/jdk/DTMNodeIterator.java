_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public Node previousNode()

  /** @return the next previous in the set and advance the position of the
   * iterator in the set.
   *
   * @throws DOMException - INVALID_STATE_ERR Raised if this method is
   * called after the detach method was invoked.
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public Node nextNode() throws DOMException

  /** @return the next node in the set and advance the position of the
   * iterator in the set.
   *
   * @throws DOMException - INVALID_STATE_ERR Raised if this method is
   * called after the detach method was invoked.
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public int getWhatToShow()

  /** Return a mask describing which node types are presented via the
   * iterator.
   **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public Node getRoot()

  /** @return The root node of the NodeIterator, as specified
   * when it was created.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public NodeFilter getFilter()

  /** Return a handle to the filter used to screen nodes.
   *
   * This is ill-defined in Xalan's usage of Nodeiterator, where we have
   * built stateful XPath-based filtering directly into the traversal
   * object. We could return something which supports the NodeFilter interface
   * and allows querying whether a given node would be permitted if it appeared
   * as our next node, but in the current implementation that would be very
   * complex -- and just isn't all that useful.
   *
   * @throws DOMException -- NOT_SUPPORTED_ERROR because I can't think
   * of anything more useful to do in this case
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public boolean getExpandEntityReferences()

  /** The value of this flag determines whether the children
   * of entity reference nodes are visible to the iterator.
   *
   * @return false, always (the DTM model flattens entity references)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public void detach()

  /** Detaches the NodeIterator from the set which it iterated over,
   * releasing any computational resources and placing the iterator in
   * the INVALID state.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public DTMIterator getDTMIterator()

  /** Access the wrapped DTMIterator. I'm not sure whether anyone will
   * need this or not, but let's write it and think about it.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public DTMNodeIterator(DTMIterator dtmIterator)

  /** Public constructor: Wrap a DTMNodeIterator around an existing
   * and preconfigured DTMIterator
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
public class DTMNodeIterator implements org.w3c.dom.traversal.NodeIterator

/**
 * <code>DTMNodeIterator</code> gives us an implementation of the
 * DTMNodeIterator which returns DOM nodes.
 *
 * Please note that this is not necessarily equivlaent to a DOM
 * NodeIterator operating over the same document. In particular:
 * <ul>
 *
 * <li>If there are several Text nodes in logical succession (ie,
 * across CDATASection and EntityReference boundaries), we will return
 * only the first; the caller is responsible for stepping through
 * them.
 * (%REVIEW% Provide a convenience routine here to assist, pending
 * proposed DOM Level 3 getAdjacentText() operation?) </li>
 *
 * <li>Since the whole XPath/XSLT architecture assumes that the source
 * document is not altered while we're working with it, we do not
 * promise to implement the DOM NodeIterator's "maintain current
 * position" response to document mutation. </li>
 *
 * <li>Since our design for XPath NodeIterators builds a stateful
 * filter directly into the traversal object, getNodeFilter() is not
 * supported.</li>
 *
 * </ul>
 *
 * <p>State: In progress!!</p>
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public Node previousNode()

  /** @return the next previous in the set and advance the position of the
   * iterator in the set.
   *
   * @throws DOMException - INVALID_STATE_ERR Raised if this method is
   * called after the detach method was invoked.
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public Node nextNode() throws DOMException

  /** @return the next node in the set and advance the position of the
   * iterator in the set.
   *
   * @throws DOMException - INVALID_STATE_ERR Raised if this method is
   * called after the detach method was invoked.
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public int getWhatToShow()

  /** Return a mask describing which node types are presented via the
   * iterator.
   **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public Node getRoot()

  /** @return The root node of the NodeIterator, as specified
   * when it was created.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public NodeFilter getFilter()

  /** Return a handle to the filter used to screen nodes.
   *
   * This is ill-defined in Xalan's usage of Nodeiterator, where we have
   * built stateful XPath-based filtering directly into the traversal
   * object. We could return something which supports the NodeFilter interface
   * and allows querying whether a given node would be permitted if it appeared
   * as our next node, but in the current implementation that would be very
   * complex -- and just isn't all that useful.
   *
   * @throws DOMException -- NOT_SUPPORTED_ERROR because I can't think
   * of anything more useful to do in this case
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public boolean getExpandEntityReferences()

  /** The value of this flag determines whether the children
   * of entity reference nodes are visible to the iterator.
   *
   * @return false, always (the DTM model flattens entity references)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public void detach()

  /** Detaches the NodeIterator from the set which it iterated over,
   * releasing any computational resources and placing the iterator in
   * the INVALID state.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public DTMIterator getDTMIterator()

  /** Access the wrapped DTMIterator. I'm not sure whether anyone will
   * need this or not, but let's write it and think about it.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
  public DTMNodeIterator(DTMIterator dtmIterator)

  /** Public constructor: Wrap a DTMNodeIterator around an existing
   * and preconfigured DTMIterator
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeIterator.java
public class DTMNodeIterator implements org.w3c.dom.traversal.NodeIterator

/**
 * <code>DTMNodeIterator</code> gives us an implementation of the
 * DTMNodeIterator which returns DOM nodes.
 *
 * Please note that this is not necessarily equivlaent to a DOM
 * NodeIterator operating over the same document. In particular:
 * <ul>
 *
 * <li>If there are several Text nodes in logical succession (ie,
 * across CDATASection and EntityReference boundaries), we will return
 * only the first; the caller is responsible for stepping through
 * them.
 * (%REVIEW% Provide a convenience routine here to assist, pending
 * proposed DOM Level 3 getAdjacentText() operation?) </li>
 *
 * <li>Since the whole XPath/XSLT architecture assumes that the source
 * document is not altered while we're working with it, we do not
 * promise to implement the DOM NodeIterator's "maintain current
 * position" response to document mutation. </li>
 *
 * <li>Since our design for XPath NodeIterators builds a stateful
 * filter directly into the traversal object, getNodeFilter() is not
 * supported.</li>
 *
 * </ul>
 *
 * <p>State: In progress!!</p>
 * */
