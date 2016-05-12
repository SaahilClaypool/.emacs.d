_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public NameSpace(String prefix, String uri)

  /**
   * Construct a namespace for placement on the
   * result tree namespace stack.
   *
   * @param prefix Prefix of this element
   * @param uri URI of  this element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public String m_uri;  // if null, then Element namespace is empty.

  /** Namespace URI of this NameSpace element.
   *  @serial           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public String m_prefix;

  /** Prefix of this NameSpace element.
   *  @serial          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public NameSpace m_next = null;

  /** Next NameSpace element on the stack.
   *  @serial             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
public class NameSpace implements Serializable

/**
 * A representation of a namespace.  One of these will
 * be pushed on the namespace stack for each
 * element.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public NameSpace(String prefix, String uri)

  /**
   * Construct a namespace for placement on the
   * result tree namespace stack.
   *
   * @param prefix Prefix of this element
   * @param uri URI of  this element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public String m_uri;  // if null, then Element namespace is empty.

  /** Namespace URI of this NameSpace element.
   *  @serial           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public String m_prefix;

  /** Prefix of this NameSpace element.
   *  @serial          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
  public NameSpace m_next = null;

  /** Next NameSpace element on the stack.
   *  @serial             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NameSpace.java
public class NameSpace implements Serializable

/**
 * A representation of a namespace.  One of these will
 * be pushed on the namespace stack for each
 * element.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Namespace.java
  public boolean isDefaultNamespaceDeclaration();

  /**
   * returns true if this attribute declares the default namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Namespace.java
  public String getNamespaceURI();

  /**
   * Gets the uri bound to the prefix of this namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Namespace.java
  public String getPrefix();

  /**
   * Gets the prefix, returns "" if this is a default
   * namespace declaration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Namespace.java
public interface Namespace extends Attribute {

/**
 * An interface that contains information about a namespace.
 * Namespaces are accessed from a StartElement.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @see StartElement
 * @since 1.6
 */
