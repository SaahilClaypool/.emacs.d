_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/StartElement.java
  public String getNamespaceURI(String prefix);

  /**
   * Gets the value that the prefix is bound to in the
   * context of this element.  Returns null if
   * the prefix is not bound in this context
   * @param prefix the prefix to lookup
   * @return the uri bound to the prefix or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/StartElement.java
  public NamespaceContext getNamespaceContext();

  /**
   * Gets a read-only namespace context. If no context is
   * available this method will return an empty namespace context.
   * The NamespaceContext contains information about all namespaces
   * in scope for this StartElement.
   *
   * @return the current namespace context
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/StartElement.java
  public Attribute getAttributeByName(QName name);

  /**
   * Returns the attribute referred to by this name
   * @param name the qname of the desired name
   * @return the attribute corresponding to the name value or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/StartElement.java
  public Iterator getNamespaces();

  /**
   * Returns an Iterator of namespaces declared on this element.
   * This Iterator does not contain previously declared namespaces
   * unless they appear on the current START_ELEMENT.
   * Therefore this list may contain redeclared namespaces and duplicate namespace
   * declarations. Use the getNamespaceContext() method to get the
   * current context of namespace declarations.
   *
   * <p>The iterator must contain only implementations of the
   * javax.xml.stream.Namespace interface.
   *
   * <p>A Namespace isA Attribute.  One
   * can iterate over a list of namespaces as a list of attributes.
   * However this method returns only the list of namespaces
   * declared on this START_ELEMENT and does not
   * include the attributes declared on this START_ELEMENT.
   *
   * Returns an empty iterator if there are no namespaces.
   *
   * @return a readonly Iterator over Namespace interfaces, or an
   * empty iterator
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/StartElement.java
  public Iterator getAttributes();

  /**
   * Returns an Iterator of non-namespace declared attributes declared on
   * this START_ELEMENT,
   * returns an empty iterator if there are no attributes.  The
   * iterator must contain only implementations of the javax.xml.stream.Attribute
   * interface.   Attributes are fundamentally unordered and may not be reported
   * in any order.
   *
   * @return a readonly Iterator over Attribute interfaces, or an
   * empty iterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/StartElement.java
  public QName getName();

  /**
   * Get the name of this event
   * @return the qualified name of this event
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/StartElement.java
public interface StartElement extends XMLEvent {

/**
 * The StartElement interface provides access to information about
 * start elements.  A StartElement is reported for each Start Tag
 * in the document.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
