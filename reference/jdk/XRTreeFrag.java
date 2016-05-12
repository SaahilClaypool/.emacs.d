_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public NodeList convertToNodeset()

  /**
   * Cast result object to a nodelist. (special function).
   *
   * @return The document fragment as a nodelist
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public DTMIterator asNodeIterator()

  /**
   * Cast result object to a DTMIterator.
   * dml - modified to return an RTFIterator for
   * benefit of EXSLT object-type function in
   * {@link com.sun.org.apache.xalan.internal.lib.ExsltCommon}.
   * @return The document fragment as a DTMIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public int rtf()

  /**
   * Cast result object to a result tree fragment.
   *
   * @return The document fragment this wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The document fragment node data or the empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XMLString xstr()

  /**
   * Cast result object to an XMLString.
   *
   * @return The document fragment node data or the empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public boolean bool()

  /**
   * Cast result object to a boolean.  This always returns true for a RTreeFrag
   * because it is treated like a node-set with a single root node.
   *
   * @return true
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public double num()

  /**
   * Cast result object to a number.
   *
   * @return The result tree fragment as a number or NaN
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public String getTypeString()

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string "#RTREEFRAG"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public int getType()

  /**
   * Tell what kind of class this is.
   *
   * @return type CLASS_RTREEFRAG
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public void detach(){

  /**
   * Detaches the <code>DTMIterator</code> from the set which it iterated
   * over, releasing any computational resources and placing the iterator
   * in the INVALID state. After <code>detach</code> has been invoked,
   * calls to <code>nextNode</code> or <code>previousNode</code> will
   * raise a runtime exception.
   *
   * In general, detach should only be called once on the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public void allowDetachToRelease(boolean allowRelease)

  /**
   * Specify if it's OK for detach to release the iterator for reuse.
   *
   * @param allowRelease true if it is OK for detach to release this iterator
   * for pooling.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XRTreeFrag(Expression expr)

  /**
   * Create an XRTreeFrag Object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public Object object()

  /**
   * Return a java object that's closest to the representation
   * that should be handed to an extension.
   *
   * @return The object that this class wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XRTreeFrag(int root, XPathContext xctxt)

  /**
   * Create an XRTreeFrag Object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XRTreeFrag(int root, XPathContext xctxt, ExpressionNode parent)

  /**
   * Create an XRTreeFrag Object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
public class XRTreeFrag extends XObject implements Cloneable

/**
 * This class represents an XPath result tree fragment object, and is capable of
 * converting the RTF to other types, such as a string.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public NodeList convertToNodeset()

  /**
   * Cast result object to a nodelist. (special function).
   *
   * @return The document fragment as a nodelist
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public DTMIterator asNodeIterator()

  /**
   * Cast result object to a DTMIterator.
   * dml - modified to return an RTFIterator for
   * benefit of EXSLT object-type function in
   * {@link com.sun.org.apache.xalan.internal.lib.ExsltCommon}.
   * @return The document fragment as a DTMIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public int rtf()

  /**
   * Cast result object to a result tree fragment.
   *
   * @return The document fragment this wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The document fragment node data or the empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XMLString xstr()

  /**
   * Cast result object to an XMLString.
   *
   * @return The document fragment node data or the empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public boolean bool()

  /**
   * Cast result object to a boolean.  This always returns true for a RTreeFrag
   * because it is treated like a node-set with a single root node.
   *
   * @return true
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public double num()

  /**
   * Cast result object to a number.
   *
   * @return The result tree fragment as a number or NaN
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public String getTypeString()

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string "#RTREEFRAG"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public int getType()

  /**
   * Tell what kind of class this is.
   *
   * @return type CLASS_RTREEFRAG
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public void detach(){

  /**
   * Detaches the <code>DTMIterator</code> from the set which it iterated
   * over, releasing any computational resources and placing the iterator
   * in the INVALID state. After <code>detach</code> has been invoked,
   * calls to <code>nextNode</code> or <code>previousNode</code> will
   * raise a runtime exception.
   *
   * In general, detach should only be called once on the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public void allowDetachToRelease(boolean allowRelease)

  /**
   * Specify if it's OK for detach to release the iterator for reuse.
   *
   * @param allowRelease true if it is OK for detach to release this iterator
   * for pooling.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XRTreeFrag(Expression expr)

  /**
   * Create an XRTreeFrag Object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public Object object()

  /**
   * Return a java object that's closest to the representation
   * that should be handed to an extension.
   *
   * @return The object that this class wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XRTreeFrag(int root, XPathContext xctxt)

  /**
   * Create an XRTreeFrag Object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
  public XRTreeFrag(int root, XPathContext xctxt, ExpressionNode parent)

  /**
   * Create an XRTreeFrag Object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XRTreeFrag.java
public class XRTreeFrag extends XObject implements Cloneable

/**
 * This class represents an XPath result tree fragment object, and is capable of
 * converting the RTF to other types, such as a string.
 * @xsl.usage general
 */
