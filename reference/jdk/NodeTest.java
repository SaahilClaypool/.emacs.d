_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/NodeTest.java
public interface NodeTest {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * Node tests by themselves do not need to fix up variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XObject execute(XPathContext xctxt)

  /**
   * Test the current node to see if it matches the given node test.
   *
   * @param xctxt XPath runtime context.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XObject execute(XPathContext xctxt, int context,
                         DTM dtm, int expType)

  /**
   * Tell what the test score is for the given node.
   *
   *
   * @param xctxt XPath runtime context.
   * @param context The node being tested.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XObject execute(XPathContext xctxt, int context)

  /**
   * Tell what the test score is for the given node.
   *
   *
   * @param xctxt XPath runtime context.
   * @param context The node being tested.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  private static final boolean subPartMatchNS(String p, String t)

  /**
   * This is temporary to patch over Xerces issue with representing DOM
   * namespaces as "".
   *
   * @param p part string from the node, which may represent the null namespace
   *        as null or as "".
   * @param t target string, which may be {@link #WILD}.
   *
   * @return true if the strings match according to the rules of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  private static final boolean subPartMatch(String p, String t)

  /**
   * Two names are equal if they and either both are null or
   * the name t is wild and the name p is non-null, or the two
   * strings are equal.
   *
   * @param p part string from the node.
   * @param t target string, which may be {@link #WILD}.
   *
   * @return true if the strings match according to the rules of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static void debugWhatToShow(int whatToShow)

  /**
   * Do a diagnostics dump of a whatToShow bit set.
   *
   *
   * @param whatToShow Bit set defined mainly by
   *        {@link com.sun.org.apache.xml.internal.dtm.DTMFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static int getNodeTypeTest(int whatToShow)

  /**
   * Tell what node type to test, if not DTMFilter.SHOW_ALL.
   *
   * @param whatToShow Bit set defined mainly by
   *        {@link com.sun.org.apache.xml.internal.dtm.DTMFilter}.
   * @return the node type for the whatToShow.  Since whatToShow can specify
   *         multiple types, it will return the first bit tested that is on,
   *         so the caller of this function should take care that this is
   *         the function they really want to call.  If none of the known bits
   *         are set, this function will return zero.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public double getDefaultScore()

  /**
   * Get the score that this test will return if a test succeeds.
   *
   *
   * @return the score that this test will return if a test succeeds.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  protected void calcScore()

  /**
   * Static calc of match score.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setStaticScore(XNumber score)

  /**
   * Set the static score for this node test.
   * @param score Should be one of the SCORE_XXX constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XNumber getStaticScore()

  /**
   * Get the static score for this node test.
   * @return Should be one of the SCORE_XXX constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  private boolean m_isTotallyWild;

  /**
   * True if this test has a null namespace and a local name of {@link #WILD}.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void initNodeTest(int whatToShow, String namespace, String name)

  /**
   * Initialize this node test by setting the whatToShow property and the
   * namespace and local name, and
   * calculating the score that this test will return if a test succeeds.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param namespace The namespace to be tested.
   * @param name The local name to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void initNodeTest(int whatToShow)

  /**
   * Initialize this node test by setting the whatToShow property, and
   * calculating the score that this test will return if a test succeeds.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public NodeTest(){}

  /**
   * Null argument constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public NodeTest(int whatToShow)

  /**
   * Construct an NodeTest that doesn't test for node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public NodeTest(int whatToShow, String namespace, String name)

  /**
   * Construct an NodeTest that tests for namespaces and node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param namespace The namespace to be tested.
   * @param name The local name to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_NONE =

  /**
   * The match score if no match is made.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_OTHER =

  /**
   * The match score if the pattern consists of something
   * other than just a NodeTest or just a qname.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_QNAME =

  /**
   * The match score if the pattern has the form
   * of a QName optionally preceded by an @ character.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_NSWILD =

  /**
   * The match score if the pattern pattern has the form NCName:*.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_NODETEST =

  /**
   * The match score if the pattern consists of just a NodeTest.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  XNumber m_score;

  /**
   * Statically calculated score for this test.  One of
   *  {@link #SCORE_NODETEST},
   *  {@link #SCORE_NONE},
   *  {@link #SCORE_NSWILD},
   *  {@link #SCORE_QNAME}, or
   *  {@link #SCORE_OTHER}.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setLocalName(String name)

  /**
   * Set the local name to be tested.
   *
   * @param name the local name to be tested, or {@link #WILD}, or an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public String getLocalName()

  /**
   * Return the local name to be tested.
   *
   * @return the local name to be tested, or {@link #WILD}, or an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  protected String m_name;

  /**
   * The local name to be tested for.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setNamespace(String ns)

  /**
   * Set the namespace to be tested.
   *
   * @param ns The namespace to be tested for, or {@link #WILD}, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public String getNamespace()

  /**
   * Return the namespace to be tested.
   *
   * @return The namespace to be tested for, or {@link #WILD}, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  String m_namespace;

  /**
   * The namespace to be tested for, which may be null.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setWhatToShow(int what)

  /**
   * This attribute determines which node types are accepted.
   * These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter}
   * interface.
   *
   * @param what bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public int getWhatToShow()

  /**
   * This attribute determines which node types are accepted.
   * These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter}
   * interface.
   *
   * @return bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final int SHOW_BYFUNCTION = 0x00010000;

  /**
   * Special bitmap for match patterns starting with a function.
   * Make sure this does not conflict with {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  protected int m_whatToShow;

  /**
   * This attribute determines which node types are accepted.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final String SUPPORTS_PRE_STRIPPING =

  /**
   * The URL to pass to the Node#supports method, to see if the
   * DOM has already been stripped of whitespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final String WILD = "*";

  /**
   * The namespace or local name for node tests with a wildcard.
   *  @see <a href="http://www.w3.org/TR/xpath#NT-NameTest">the XPath NameTest production.</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
public class NodeTest extends Expression

/**
 * This is the basic node test class for both match patterns and location path
 * steps.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/NodeTest.java
public interface NodeTest {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * Node tests by themselves do not need to fix up variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XObject execute(XPathContext xctxt)

  /**
   * Test the current node to see if it matches the given node test.
   *
   * @param xctxt XPath runtime context.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XObject execute(XPathContext xctxt, int context,
                         DTM dtm, int expType)

  /**
   * Tell what the test score is for the given node.
   *
   *
   * @param xctxt XPath runtime context.
   * @param context The node being tested.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XObject execute(XPathContext xctxt, int context)

  /**
   * Tell what the test score is for the given node.
   *
   *
   * @param xctxt XPath runtime context.
   * @param context The node being tested.
   *
   * @return {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NODETEST},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NONE},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_NSWILD},
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_QNAME}, or
   *         {@link com.sun.org.apache.xpath.internal.patterns.NodeTest#SCORE_OTHER}.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  private static final boolean subPartMatchNS(String p, String t)

  /**
   * This is temporary to patch over Xerces issue with representing DOM
   * namespaces as "".
   *
   * @param p part string from the node, which may represent the null namespace
   *        as null or as "".
   * @param t target string, which may be {@link #WILD}.
   *
   * @return true if the strings match according to the rules of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  private static final boolean subPartMatch(String p, String t)

  /**
   * Two names are equal if they and either both are null or
   * the name t is wild and the name p is non-null, or the two
   * strings are equal.
   *
   * @param p part string from the node.
   * @param t target string, which may be {@link #WILD}.
   *
   * @return true if the strings match according to the rules of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static void debugWhatToShow(int whatToShow)

  /**
   * Do a diagnostics dump of a whatToShow bit set.
   *
   *
   * @param whatToShow Bit set defined mainly by
   *        {@link com.sun.org.apache.xml.internal.dtm.DTMFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static int getNodeTypeTest(int whatToShow)

  /**
   * Tell what node type to test, if not DTMFilter.SHOW_ALL.
   *
   * @param whatToShow Bit set defined mainly by
   *        {@link com.sun.org.apache.xml.internal.dtm.DTMFilter}.
   * @return the node type for the whatToShow.  Since whatToShow can specify
   *         multiple types, it will return the first bit tested that is on,
   *         so the caller of this function should take care that this is
   *         the function they really want to call.  If none of the known bits
   *         are set, this function will return zero.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public double getDefaultScore()

  /**
   * Get the score that this test will return if a test succeeds.
   *
   *
   * @return the score that this test will return if a test succeeds.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  protected void calcScore()

  /**
   * Static calc of match score.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setStaticScore(XNumber score)

  /**
   * Set the static score for this node test.
   * @param score Should be one of the SCORE_XXX constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public XNumber getStaticScore()

  /**
   * Get the static score for this node test.
   * @return Should be one of the SCORE_XXX constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  private boolean m_isTotallyWild;

  /**
   * True if this test has a null namespace and a local name of {@link #WILD}.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void initNodeTest(int whatToShow, String namespace, String name)

  /**
   * Initialize this node test by setting the whatToShow property and the
   * namespace and local name, and
   * calculating the score that this test will return if a test succeeds.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param namespace The namespace to be tested.
   * @param name The local name to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void initNodeTest(int whatToShow)

  /**
   * Initialize this node test by setting the whatToShow property, and
   * calculating the score that this test will return if a test succeeds.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public NodeTest(){}

  /**
   * Null argument constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public NodeTest(int whatToShow)

  /**
   * Construct an NodeTest that doesn't test for node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public NodeTest(int whatToShow, String namespace, String name)

  /**
   * Construct an NodeTest that tests for namespaces and node names.
   *
   *
   * @param whatToShow Bit set defined mainly by {@link org.w3c.dom.traversal.NodeFilter}.
   * @param namespace The namespace to be tested.
   * @param name The local name to be tested.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_NONE =

  /**
   * The match score if no match is made.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_OTHER =

  /**
   * The match score if the pattern consists of something
   * other than just a NodeTest or just a qname.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_QNAME =

  /**
   * The match score if the pattern has the form
   * of a QName optionally preceded by an @ character.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_NSWILD =

  /**
   * The match score if the pattern pattern has the form NCName:*.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final XNumber SCORE_NODETEST =

  /**
   * The match score if the pattern consists of just a NodeTest.
   *  @see <a href="http://www.w3.org/TR/xslt#conflict">XSLT Specification - 5.5 Conflict Resolution for Template Rules</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  XNumber m_score;

  /**
   * Statically calculated score for this test.  One of
   *  {@link #SCORE_NODETEST},
   *  {@link #SCORE_NONE},
   *  {@link #SCORE_NSWILD},
   *  {@link #SCORE_QNAME}, or
   *  {@link #SCORE_OTHER}.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setLocalName(String name)

  /**
   * Set the local name to be tested.
   *
   * @param name the local name to be tested, or {@link #WILD}, or an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public String getLocalName()

  /**
   * Return the local name to be tested.
   *
   * @return the local name to be tested, or {@link #WILD}, or an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  protected String m_name;

  /**
   * The local name to be tested for.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setNamespace(String ns)

  /**
   * Set the namespace to be tested.
   *
   * @param ns The namespace to be tested for, or {@link #WILD}, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public String getNamespace()

  /**
   * Return the namespace to be tested.
   *
   * @return The namespace to be tested for, or {@link #WILD}, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  String m_namespace;

  /**
   * The namespace to be tested for, which may be null.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public void setWhatToShow(int what)

  /**
   * This attribute determines which node types are accepted.
   * These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter}
   * interface.
   *
   * @param what bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public int getWhatToShow()

  /**
   * This attribute determines which node types are accepted.
   * These constants are defined in the {@link org.w3c.dom.traversal.NodeFilter}
   * interface.
   *
   * @return bitset mainly defined in {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final int SHOW_BYFUNCTION = 0x00010000;

  /**
   * Special bitmap for match patterns starting with a function.
   * Make sure this does not conflict with {@link org.w3c.dom.traversal.NodeFilter}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  protected int m_whatToShow;

  /**
   * This attribute determines which node types are accepted.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final String SUPPORTS_PRE_STRIPPING =

  /**
   * The URL to pass to the Node#supports method, to see if the
   * DOM has already been stripped of whitespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
  public static final String WILD = "*";

  /**
   * The namespace or local name for node tests with a wildcard.
   *  @see <a href="http://www.w3.org/TR/xpath#NT-NameTest">the XPath NameTest production.</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/patterns/NodeTest.java
public class NodeTest extends Expression

/**
 * This is the basic node test class for both match patterns and location path
 * steps.
 * @xsl.usage advanced
 */
