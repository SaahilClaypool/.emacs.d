_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   *
   * NEEDSDOC @param fsb
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * XObjects should not normally need to fix up variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  protected void error(String msg, Object[] args)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg Error message to issue
   * @param args Arguments to use in the message
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  protected void error(String msg)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg Error message to issue
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean notEquals(XObject obj2)

  /**
   * Tell if two objects are functionally not equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is not equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean greaterThanOrEqual(XObject obj2)

  /**
   * Tell if one object is greater than or equal to the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is greater than or equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean greaterThan(XObject obj2)

  /**
   * Tell if one object is greater than the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is greater than the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean lessThanOrEqual(XObject obj2)

  /**
   * Tell if one object is less than or equal to the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is less than or equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean lessThan(XObject obj2)

  /**
   * Tell if one object is less than the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is less than the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public Object castToType(int t, XPathContext support)

  /**
   * Cast object to type t.
   *
   * @param t Type of object to cast this to
   * @param support XPath context to use for the conversion
   *
   * @return This object as the given type t
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public NodeSetDTM mutableNodeset()

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return The object as a NodeSetDTM.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public NodeList nodelist() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public NodeIterator nodeset() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject getFresh()

  /**
   * Get a fresh copy of the object.  For use with variables.
   *
   * @return This object, unless overridden by subclass.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public DTMIterator iter() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public Object object()

  /**
   * Return a java object that's closest to the representation
   * that should be handed to an extension.
   *
   * @return The object that this class wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public int rtf()

  /**
   * For functions to override.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public DocumentFragment rtree()

  /**
   * For functions to override.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public DocumentFragment rtree(XPathContext support)

  /**
   * Cast result object to a result tree fragment.
   *
   * @param support XPath context to use for the conversion
   *
   * @return the objec as a result tree fragment.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public int rtf(XPathContext support)

  /**
   * Cast result object to a result tree fragment.
   *
   * @param support XPath context to use for the conversion
   *
   * @return the objec as a result tree fragment.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public String toString()

  /**
   * Return the string representation of the object
   *
   *
   * @return the string representation of the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The object as a string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XMLString xstr()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean boolWithSideEffects() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a boolean, but allow side effects, such as the
   * incrementing of an iterator.
   *
   * @return True if there is a next node in the nodeset
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean bool() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a boolean. Always issues an error.
   *
   * @return false
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public double numWithSideEffects()  throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a number, but allow side effects, such as the
   * incrementing of an iterator.
   *
   * @return numeric value of the string conversion from the
   * next node in the NodeSetDTM, or NAN if no node was found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public double num() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a number. Always issues an error.
   *
   * @return 0.0
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public String getTypeString()

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string "#UNKNOWN" + object class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public int getType()

  /**
   * Tell what kind of class this is.
   *
   * @return CLASS_UNKNOWN
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_UNRESOLVEDVARIABLE = 600;

  /** Represents an unresolved variable type as an integer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_RTREEFRAG = 5;

  /** Constant for RESULT TREE FRAGMENT object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_NODESET = 4;

  /** Constant for NODESET object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_STRING = 3;

  /** Constant for STRING object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_NUMBER = 2;

  /** Constant for NUMBER object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_BOOLEAN = 1;

  /** Constant for BOOLEAN  object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_UNKNOWN = 0;

  /** Constant for UNKNOWN object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_NULL = -1;

  /** Constant for NULL object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  static public XObject create(Object val, XPathContext xctxt)

  /**
   * Create the right XObject based on the type of the object passed.
   * This function <emph>can</emph> make an XObject that exposes DOM Nodes, NodeLists, and
   * NodeIterators to the XSLT stylesheet as node-sets.
   *
   * @param val The java object which this object will wrap.
   * @param xctxt The XPath context.
   *
   * @return the right XObject based on the type of the object passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  static public XObject create(Object val)

  /**
   * Create the right XObject based on the type of the object passed.  This
   * function can not make an XObject that exposes DOM Nodes, NodeLists, and
   * NodeIterators to the XSLT stylesheet as node-sets.
   *
   * @param val The java object which this object will wrap.
   *
   * @return the right XObject based on the type of the object passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void dispatchCharactersEvents(org.xml.sax.ContentHandler ch)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value. Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void reset()

  /**
   * Reset for fresh reuse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void destruct()

  /**
   * Forces the object to release it's resources.  This is more harsh than
   * detach().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void detach(){}

  /**
   * Detaches the <code>DTMIterator</code> from the set which it iterated
   * over, releasing any computational resources and placing the iterator
   * in the INVALID state. After <code>detach</code> has been invoked,
   * calls to <code>nextNode</code> or <code>previousNode</code> will
   * raise a runtime exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void allowDetachToRelease(boolean allowRelease){}

  /**
   * Specify if it's OK for detach to release the iterator for reuse.
   * This function should be called with a value of false for objects that are
   * stored in variables.
   * Calling this with a value of false on a XNodeSet will cause the nodeset
   * to be cached.
   *
   * @param allowRelease true if it is OK for detach to release this iterator
   * for pooling.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject execute(XPathContext xctxt)

  /**
   * For support of literal objects in xpaths.
   *
   * @param xctxt The XPath execution context.
   *
   * @return This object.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject(Object obj)

  /**
   * Create an XObject.
   *
   * @param obj Can be any object, should be a specific type
   * for derived classes, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject(){}

  /**
   * Create an XObject.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  protected Object m_obj;  // This may be NULL!!!

  /**
   * The java object which this object wraps.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
public class XObject extends Expression implements Serializable, Cloneable

/**
 * This class represents an XPath object, and is capable of
 * converting the object to various types, such as a string.
 * This class acts as the base class to other XPath type objects,
 * such as XString, and provides polymorphic casting capabilities.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   *
   * NEEDSDOC @param fsb
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * XObjects should not normally need to fix up variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  protected void error(String msg, Object[] args)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg Error message to issue
   * @param args Arguments to use in the message
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  protected void error(String msg)

  /**
   * Tell the user of an error, and probably throw an
   * exception.
   *
   * @param msg Error message to issue
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean notEquals(XObject obj2)

  /**
   * Tell if two objects are functionally not equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is not equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean greaterThanOrEqual(XObject obj2)

  /**
   * Tell if one object is greater than or equal to the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is greater than or equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean greaterThan(XObject obj2)

  /**
   * Tell if one object is greater than the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is greater than the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean lessThanOrEqual(XObject obj2)

  /**
   * Tell if one object is less than or equal to the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is less than or equal to the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean lessThan(XObject obj2)

  /**
   * Tell if one object is less than the other.
   *
   * @param obj2 Object to compare this to
   *
   * @return True if this object is less than the given object
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public Object castToType(int t, XPathContext support)

  /**
   * Cast object to type t.
   *
   * @param t Type of object to cast this to
   * @param support XPath context to use for the conversion
   *
   * @return This object as the given type t
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public NodeSetDTM mutableNodeset()

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return The object as a NodeSetDTM.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public NodeList nodelist() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public NodeIterator nodeset() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject getFresh()

  /**
   * Get a fresh copy of the object.  For use with variables.
   *
   * @return This object, unless overridden by subclass.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public DTMIterator iter() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a nodelist. Always issues an error.
   *
   * @return null
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public Object object()

  /**
   * Return a java object that's closest to the representation
   * that should be handed to an extension.
   *
   * @return The object that this class wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public int rtf()

  /**
   * For functions to override.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public DocumentFragment rtree()

  /**
   * For functions to override.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public DocumentFragment rtree(XPathContext support)

  /**
   * Cast result object to a result tree fragment.
   *
   * @param support XPath context to use for the conversion
   *
   * @return the objec as a result tree fragment.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public int rtf(XPathContext support)

  /**
   * Cast result object to a result tree fragment.
   *
   * @param support XPath context to use for the conversion
   *
   * @return the objec as a result tree fragment.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public String toString()

  /**
   * Return the string representation of the object
   *
   *
   * @return the string representation of the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The object as a string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XMLString xstr()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean boolWithSideEffects() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a boolean, but allow side effects, such as the
   * incrementing of an iterator.
   *
   * @return True if there is a next node in the nodeset
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public boolean bool() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a boolean. Always issues an error.
   *
   * @return false
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public double numWithSideEffects()  throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a number, but allow side effects, such as the
   * incrementing of an iterator.
   *
   * @return numeric value of the string conversion from the
   * next node in the NodeSetDTM, or NAN if no node was found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public double num() throws javax.xml.transform.TransformerException

  /**
   * Cast result object to a number. Always issues an error.
   *
   * @return 0.0
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public String getTypeString()

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string "#UNKNOWN" + object class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public int getType()

  /**
   * Tell what kind of class this is.
   *
   * @return CLASS_UNKNOWN
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_UNRESOLVEDVARIABLE = 600;

  /** Represents an unresolved variable type as an integer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_RTREEFRAG = 5;

  /** Constant for RESULT TREE FRAGMENT object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_NODESET = 4;

  /** Constant for NODESET object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_STRING = 3;

  /** Constant for STRING object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_NUMBER = 2;

  /** Constant for NUMBER object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_BOOLEAN = 1;

  /** Constant for BOOLEAN  object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_UNKNOWN = 0;

  /** Constant for UNKNOWN object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public static final int CLASS_NULL = -1;

  /** Constant for NULL object type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  static public XObject create(Object val, XPathContext xctxt)

  /**
   * Create the right XObject based on the type of the object passed.
   * This function <emph>can</emph> make an XObject that exposes DOM Nodes, NodeLists, and
   * NodeIterators to the XSLT stylesheet as node-sets.
   *
   * @param val The java object which this object will wrap.
   * @param xctxt The XPath context.
   *
   * @return the right XObject based on the type of the object passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  static public XObject create(Object val)

  /**
   * Create the right XObject based on the type of the object passed.  This
   * function can not make an XObject that exposes DOM Nodes, NodeLists, and
   * NodeIterators to the XSLT stylesheet as node-sets.
   *
   * @param val The java object which this object will wrap.
   *
   * @return the right XObject based on the type of the object passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void dispatchCharactersEvents(org.xml.sax.ContentHandler ch)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value. Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void reset()

  /**
   * Reset for fresh reuse.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void destruct()

  /**
   * Forces the object to release it's resources.  This is more harsh than
   * detach().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void detach(){}

  /**
   * Detaches the <code>DTMIterator</code> from the set which it iterated
   * over, releasing any computational resources and placing the iterator
   * in the INVALID state. After <code>detach</code> has been invoked,
   * calls to <code>nextNode</code> or <code>previousNode</code> will
   * raise a runtime exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public void allowDetachToRelease(boolean allowRelease){}

  /**
   * Specify if it's OK for detach to release the iterator for reuse.
   * This function should be called with a value of false for objects that are
   * stored in variables.
   * Calling this with a value of false on a XNodeSet will cause the nodeset
   * to be cached.
   *
   * @param allowRelease true if it is OK for detach to release this iterator
   * for pooling.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject execute(XPathContext xctxt)

  /**
   * For support of literal objects in xpaths.
   *
   * @param xctxt The XPath execution context.
   *
   * @return This object.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject(Object obj)

  /**
   * Create an XObject.
   *
   * @param obj Can be any object, should be a specific type
   * for derived classes, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  public XObject(){}

  /**
   * Create an XObject.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
  protected Object m_obj;  // This may be NULL!!!

  /**
   * The java object which this object wraps.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XObject.java
public class XObject extends Expression implements Serializable, Cloneable

/**
 * This class represents an XPath object, and is capable of
 * converting the object to various types, such as a string.
 * This class acts as the base class to other XPath type objects,
 * such as XString, and provides polymorphic casting capabilities.
 * @xsl.usage general
 */
