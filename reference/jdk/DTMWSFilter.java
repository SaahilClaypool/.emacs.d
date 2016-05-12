_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public short getShouldStripSpace(int elementHandle, DTM dtm);

  /**
   * Test whether whitespace-only text nodes are visible in the logical
   * view of <code>DTM</code>. Normally, this function
   * will be called by the implementation of <code>DTM</code>;
   * it is not normally called directly from
   * user code.
   *
   * @param elementHandle int Handle of the element.
   * @return one of NOTSTRIP, STRIP, or INHERIT.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public static final short INHERIT = 3;

  /**
   * Inherit whitespace stripping behavior of the parent node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public static final short STRIP = 2;

  /**
   * Strip whitespace child nodes of this element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public static final short NOTSTRIP = 1;

  /**
   * Do not strip whitespace child nodes of this element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
public interface DTMWSFilter

/**
 * This interface is meant to be implemented by a client of the DTM, and allows
 * stripping of whitespace nodes.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public short getShouldStripSpace(int elementHandle, DTM dtm);

  /**
   * Test whether whitespace-only text nodes are visible in the logical
   * view of <code>DTM</code>. Normally, this function
   * will be called by the implementation of <code>DTM</code>;
   * it is not normally called directly from
   * user code.
   *
   * @param elementHandle int Handle of the element.
   * @return one of NOTSTRIP, STRIP, or INHERIT.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public static final short INHERIT = 3;

  /**
   * Inherit whitespace stripping behavior of the parent node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public static final short STRIP = 2;

  /**
   * Strip whitespace child nodes of this element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
  public static final short NOTSTRIP = 1;

  /**
   * Do not strip whitespace child nodes of this element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMWSFilter.java
public interface DTMWSFilter

/**
 * This interface is meant to be implemented by a client of the DTM, and allows
 * stripping of whitespace nodes.
 */
