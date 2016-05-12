_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public int getIndex(String qName)

  /**
   * Look up the index of an attribute by raw XML 1.0 name.
   *
   * @param qName The qualified (prefixed) name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public int getIndex(String uri, String localPart)

  /**
   * Look up the index of an attribute by Namespace name.
   *
   * @param uri The Namespace URI, or the empty string if
   *        the name has no Namespace URI.
   * @param localPart The attribute's local name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getValue(String uri, String localName)

  /**
   * Look up an attribute's value by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute value as a string, or null if the
   *         attribute is not in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getValue(String name)

  /**
   * Look up an attribute's value by name.
   *
   *
   * @param name The attribute node's name
   *
   * @return The attribute node's value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getType(String uri, String localName)

  /**
   * Look up an attribute's type by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute type as a string, or null if the
   *         attribute is not in the list or if Namespace
   *         processing is not being performed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getType(String name)

  /**
   * Get the attribute's node type by name
   *
   *
   * @param name Attribute name
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getValue(int i)

  /**
   * Get the attribute's node value by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getType(int i)

  /**
   * Get the attribute's node type by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getQName(int i)

  /**
   * Look up an attribute's qualified name by index.
   *
   *
   * @param i The attribute index (zero-based).
   *
   * @return The attribute's qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getLocalName(int index)

  /**
   * Look up an attribute's local name by index.
   *
   * @param index The attribute index (zero-based).
   * @return The local name, or the empty string if Namespace
   *         processing is not being performed, or null
   *         if the index is out of range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getURI(int index)

  /**
   * Look up an attribute's Namespace URI by index.
   *
   * @param index The attribute index (zero-based).
   * @return The Namespace URI, or the empty string if none
   *         is available, or null if the index is out of
   *         range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public int getLength()

  /**
   * Get the number of attribute nodes in the list
   *
   *
   * @return number of attribute nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public AttList(NamedNodeMap attrs, DOM2Helper dh)

  /**
   * Constructor AttList
   *
   *
   * @param attrs List of attributes this will contain
   * @param dh DOMHelper
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
//  public AttList(NamedNodeMap attrs)

//  /**
//   * Constructor AttList
//   *
//   *
//   * @param attrs List of attributes this will contain
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  DOM2Helper m_dh;

  /** Local reference to DOMHelper          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  int m_lastIndex;

  /** Index of last attribute node          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  NamedNodeMap m_attrs;

  /** List of attribute nodes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
public final class AttList implements Attributes

/**
 * Wraps a DOM attribute list in a SAX Attributes.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 * A minor changes from that package are:
 * DOMHelper reference changed to DOM2Helper, class is not "public"
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public int getIndex(String qName)

  /**
   * Look up the index of an attribute by raw XML 1.0 name.
   *
   * @param qName The qualified (prefixed) name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public int getIndex(String uri, String localPart)

  /**
   * Look up the index of an attribute by Namespace name.
   *
   * @param uri The Namespace URI, or the empty string if
   *        the name has no Namespace URI.
   * @param localPart The attribute's local name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getValue(String uri, String localName)

  /**
   * Look up an attribute's value by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute value as a string, or null if the
   *         attribute is not in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getValue(String name)

  /**
   * Look up an attribute's value by name.
   *
   *
   * @param name The attribute node's name
   *
   * @return The attribute node's value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getType(String uri, String localName)

  /**
   * Look up an attribute's type by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute type as a string, or null if the
   *         attribute is not in the list or if Namespace
   *         processing is not being performed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getType(String name)

  /**
   * Get the attribute's node type by name
   *
   *
   * @param name Attribute name
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getValue(int i)

  /**
   * Get the attribute's node value by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getType(int i)

  /**
   * Get the attribute's node type by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getQName(int i)

  /**
   * Look up an attribute's qualified name by index.
   *
   *
   * @param i The attribute index (zero-based).
   *
   * @return The attribute's qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getLocalName(int index)

  /**
   * Look up an attribute's local name by index.
   *
   * @param index The attribute index (zero-based).
   * @return The local name, or the empty string if Namespace
   *         processing is not being performed, or null
   *         if the index is out of range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getURI(int index)

  /**
   * Look up an attribute's Namespace URI by index.
   *
   * @param index The attribute index (zero-based).
   * @return The Namespace URI, or the empty string if none
   *         is available, or null if the index is out of
   *         range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public int getLength()

  /**
   * Get the number of attribute nodes in the list
   *
   *
   * @return number of attribute nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public AttList(NamedNodeMap attrs, DOMHelper dh)

  /**
   * Constructor AttList
   *
   *
   * @param attrs List of attributes this will contain
   * @param dh DOMHelper
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
//  public AttList(NamedNodeMap attrs)

//  /**
//   * Constructor AttList
//   *
//   *
//   * @param attrs List of attributes this will contain
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  DOMHelper m_dh;

  /** Local reference to DOMHelper          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  int m_lastIndex;

  /** Index of last attribute node          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  NamedNodeMap m_attrs;

  /** List of attribute nodes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
public class AttList implements Attributes

/**
 * Wraps a DOM attribute list in a SAX Attributes.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public int getIndex(String qName)

  /**
   * Look up the index of an attribute by raw XML 1.0 name.
   *
   * @param qName The qualified (prefixed) name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public int getIndex(String uri, String localPart)

  /**
   * Look up the index of an attribute by Namespace name.
   *
   * @param uri The Namespace URI, or the empty string if
   *        the name has no Namespace URI.
   * @param localPart The attribute's local name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getValue(String uri, String localName)

  /**
   * Look up an attribute's value by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute value as a string, or null if the
   *         attribute is not in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getValue(String name)

  /**
   * Look up an attribute's value by name.
   *
   *
   * @param name The attribute node's name
   *
   * @return The attribute node's value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getType(String uri, String localName)

  /**
   * Look up an attribute's type by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute type as a string, or null if the
   *         attribute is not in the list or if Namespace
   *         processing is not being performed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getType(String name)

  /**
   * Get the attribute's node type by name
   *
   *
   * @param name Attribute name
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getValue(int i)

  /**
   * Get the attribute's node value by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getType(int i)

  /**
   * Get the attribute's node type by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getQName(int i)

  /**
   * Look up an attribute's qualified name by index.
   *
   *
   * @param i The attribute index (zero-based).
   *
   * @return The attribute's qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getLocalName(int index)

  /**
   * Look up an attribute's local name by index.
   *
   * @param index The attribute index (zero-based).
   * @return The local name, or the empty string if Namespace
   *         processing is not being performed, or null
   *         if the index is out of range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public String getURI(int index)

  /**
   * Look up an attribute's Namespace URI by index.
   *
   * @param index The attribute index (zero-based).
   * @return The Namespace URI, or the empty string if none
   *         is available, or null if the index is out of
   *         range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public int getLength()

  /**
   * Get the number of attribute nodes in the list
   *
   *
   * @return number of attribute nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  public AttList(NamedNodeMap attrs, DOM2Helper dh)

  /**
   * Constructor AttList
   *
   *
   * @param attrs List of attributes this will contain
   * @param dh DOMHelper
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
//  public AttList(NamedNodeMap attrs)

//  /**
//   * Constructor AttList
//   *
//   *
//   * @param attrs List of attributes this will contain
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  DOM2Helper m_dh;

  /** Local reference to DOMHelper          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  int m_lastIndex;

  /** Index of last attribute node          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
  NamedNodeMap m_attrs;

  /** List of attribute nodes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/AttList.java
public final class AttList implements Attributes

/**
 * Wraps a DOM attribute list in a SAX Attributes.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 * A minor changes from that package are:
 * DOMHelper reference changed to DOM2Helper, class is not "public"
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public int getIndex(String qName)

  /**
   * Look up the index of an attribute by raw XML 1.0 name.
   *
   * @param qName The qualified (prefixed) name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public int getIndex(String uri, String localPart)

  /**
   * Look up the index of an attribute by Namespace name.
   *
   * @param uri The Namespace URI, or the empty string if
   *        the name has no Namespace URI.
   * @param localPart The attribute's local name.
   * @return The index of the attribute, or -1 if it does not
   *         appear in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getValue(String uri, String localName)

  /**
   * Look up an attribute's value by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute value as a string, or null if the
   *         attribute is not in the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getValue(String name)

  /**
   * Look up an attribute's value by name.
   *
   *
   * @param name The attribute node's name
   *
   * @return The attribute node's value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getType(String uri, String localName)

  /**
   * Look up an attribute's type by Namespace name.
   *
   * @param uri The Namespace URI, or the empty String if the
   *        name has no Namespace URI.
   * @param localName The local name of the attribute.
   * @return The attribute type as a string, or null if the
   *         attribute is not in the list or if Namespace
   *         processing is not being performed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getType(String name)

  /**
   * Get the attribute's node type by name
   *
   *
   * @param name Attribute name
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getValue(int i)

  /**
   * Get the attribute's node value by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getType(int i)

  /**
   * Get the attribute's node type by index
   *
   *
   * @param i The attribute index (zero-based)
   *
   * @return the attribute's node type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getQName(int i)

  /**
   * Look up an attribute's qualified name by index.
   *
   *
   * @param i The attribute index (zero-based).
   *
   * @return The attribute's qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getLocalName(int index)

  /**
   * Look up an attribute's local name by index.
   *
   * @param index The attribute index (zero-based).
   * @return The local name, or the empty string if Namespace
   *         processing is not being performed, or null
   *         if the index is out of range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public String getURI(int index)

  /**
   * Look up an attribute's Namespace URI by index.
   *
   * @param index The attribute index (zero-based).
   * @return The Namespace URI, or the empty string if none
   *         is available, or null if the index is out of
   *         range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public int getLength()

  /**
   * Get the number of attribute nodes in the list
   *
   *
   * @return number of attribute nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  public AttList(NamedNodeMap attrs, DOMHelper dh)

  /**
   * Constructor AttList
   *
   *
   * @param attrs List of attributes this will contain
   * @param dh DOMHelper
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
//  public AttList(NamedNodeMap attrs)

//  /**
//   * Constructor AttList
//   *
//   *
//   * @param attrs List of attributes this will contain
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  DOMHelper m_dh;

  /** Local reference to DOMHelper          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  int m_lastIndex;

  /** Index of last attribute node          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
  NamedNodeMap m_attrs;

  /** List of attribute nodes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/AttList.java
public class AttList implements Attributes

/**
 * Wraps a DOM attribute list in a SAX Attributes.
 * @xsl.usage internal
 */
