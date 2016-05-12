_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public static final int ANCESTORNOXMLNS = 2;

  /** Constant indicating ancestors don't have an XMLNS attribute           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public static final int ANCESTORHASXMLNS = 1;

  /** Constant indicating an ancestor has an XMLNS attribute           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public static final int ANCESTORXMLNSUNPROCESSED = 0;

  /** Constant for ancestors XMLNS atributes not processed          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public int m_ancestorHasXMLNSAttrs;

  /** Flag indicating whether one of this node's ancestor has an XMLNS attribute          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public boolean m_hasProcessedNS;

  /** Flag indicating whether namespaces have been processed for this node */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public boolean m_hasXMLNSAttrs;

  /** Flag indicating whether this node has an XMLNS attribute          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public String m_namespace;

  /** The namespace URI          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public NSInfo(String namespace, boolean hasXMLNSAttrs)

  /**
   * Constructor NSInfo
   *
   *
   * @param namespace The namespace URI
   * @param hasXMLNSAttrs Flag indicating whether this node
   * has XMLNS attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public NSInfo(boolean hasProcessedNS, boolean hasXMLNSAttrs,
                int ancestorHasXMLNSAttrs)

  /**
   * Constructor NSInfo
   *
   *
   * @param hasProcessedNS Flag indicating whether namespaces
   * have been processed for this node
   * @param hasXMLNSAttrs Flag indicating whether this node
   * has XMLNS attributes.
   * @param ancestorHasXMLNSAttrs Flag indicating whether one of this node's
   * ancestor has XMLNS attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public NSInfo(boolean hasProcessedNS, boolean hasXMLNSAttrs)

  /**
   * Constructor NSInfo
   *
   *
   * @param hasProcessedNS Flag indicating whether namespaces
   * have been processed for this node
   * @param hasXMLNSAttrs Flag indicating whether this node
   * has XMLNS attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
public class NSInfo

/**
 * This class holds information about the namespace info
 * of a node.  It is used to optimize namespace lookup in
 * a generic DOM.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public static final int ANCESTORNOXMLNS = 2;

  /** Constant indicating ancestors don't have an XMLNS attribute           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public static final int ANCESTORHASXMLNS = 1;

  /** Constant indicating an ancestor has an XMLNS attribute           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public static final int ANCESTORXMLNSUNPROCESSED = 0;

  /** Constant for ancestors XMLNS atributes not processed          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public int m_ancestorHasXMLNSAttrs;

  /** Flag indicating whether one of this node's ancestor has an XMLNS attribute          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public boolean m_hasProcessedNS;

  /** Flag indicating whether namespaces have been processed for this node */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public boolean m_hasXMLNSAttrs;

  /** Flag indicating whether this node has an XMLNS attribute          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public String m_namespace;

  /** The namespace URI          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public NSInfo(String namespace, boolean hasXMLNSAttrs)

  /**
   * Constructor NSInfo
   *
   *
   * @param namespace The namespace URI
   * @param hasXMLNSAttrs Flag indicating whether this node
   * has XMLNS attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public NSInfo(boolean hasProcessedNS, boolean hasXMLNSAttrs,
                int ancestorHasXMLNSAttrs)

  /**
   * Constructor NSInfo
   *
   *
   * @param hasProcessedNS Flag indicating whether namespaces
   * have been processed for this node
   * @param hasXMLNSAttrs Flag indicating whether this node
   * has XMLNS attributes.
   * @param ancestorHasXMLNSAttrs Flag indicating whether one of this node's
   * ancestor has XMLNS attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
  public NSInfo(boolean hasProcessedNS, boolean hasXMLNSAttrs)

  /**
   * Constructor NSInfo
   *
   *
   * @param hasProcessedNS Flag indicating whether namespaces
   * have been processed for this node
   * @param hasXMLNSAttrs Flag indicating whether this node
   * has XMLNS attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NSInfo.java
public class NSInfo

/**
 * This class holds information about the namespace info
 * of a node.  It is used to optimize namespace lookup in
 * a generic DOM.
 * @xsl.usage internal
 */
