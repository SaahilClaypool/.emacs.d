_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public void setFeature(String featureId, boolean state)

    /** Implementation of the DTM interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    /** The code in some of the following interfaces are copied from SAXAdapter. **/

    /** Implementation of the SerializationHandler interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public final int getNodeHandle(final int nodeId)

    /**
     * Return the node handle from a node identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public final int getNodeIdent(final int nodehandle)

    /**
     * Return the node identity from a node handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public void characters(final int node, SerializationHandler handler)

    /**
     * Dispatch the character content of a node to an output handler.
     *
     * The escape setting should be taken care of when outputting to
     * a handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    // The whitespace filter

    /** The following fields are only used for the nested SAXImpl **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
public class AdaptiveResultTreeImpl extends SimpleResultTreeImpl

/**
 * AdaptiveResultTreeImpl is a adaptive DOM model for result tree fragments (RTF). It is
 * used in the case where the RTF is likely to be pure text yet it can still be a DOM tree.
 * It is designed for RTFs which have &lt;xsl:call-template&gt; or &lt;xsl:apply-templates&gt; in
 * the contents. Example:
 * <pre>
 *    &lt;xsl:variable name = "x"&gt;
 *      &lt;xsl:call-template name = "test"&gt;
 *         &lt;xsl:with-param name="a" select="."/&gt;
 *      &lt;/xsl:call-template&gt;
 *    &lt;/xsl:variable>
 * </pre>
 * <p>In this example the result produced by <xsl:call-template> is likely to be a single
 * Text node. But it can also be a DOM tree. This kind of RTF cannot be modelled by
 * SimpleResultTreeImpl.
 * <p>
 * AdaptiveResultTreeImpl can be considered as a smart switcher between SimpleResultTreeImpl
 * and SAXImpl. It treats the RTF as simple Text and uses the SimpleResultTreeImpl model
 * at the beginning. However, if it receives a call which indicates that this is a DOM tree
 * (e.g. startElement), it will automatically transform itself into a wrapper around a
 * SAXImpl. In this way we can have a light-weight model when the result only contains
 * simple text, while at the same time it still works when the RTF is a DOM tree.
 * <p>
 * All methods in this class are overridden to delegate the action to the wrapped SAXImpl object
 * if it is non-null, or delegate the action to the SimpleResultTreeImpl if there is no
 * wrapped SAXImpl.
 * <p>
 * %REVISIT% Can we combine this class with SimpleResultTreeImpl? I think it is possible, but
 * it will make SimpleResultTreeImpl more expensive. I will use two separate classes at
 * this time.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public void setFeature(String featureId, boolean state)

    /** Implementation of the DTM interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    /** The code in some of the following interfaces are copied from SAXAdapter. **/

    /** Implementation of the SerializationHandler interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public final int getNodeHandle(final int nodeId)

    /**
     * Return the node handle from a node identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public final int getNodeIdent(final int nodehandle)

    /**
     * Return the node identity from a node handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    public void characters(final int node, SerializationHandler handler)

    /**
     * Dispatch the character content of a node to an output handler.
     *
     * The escape setting should be taken care of when outputting to
     * a handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
    // The whitespace filter

    /** The following fields are only used for the nested SAXImpl **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/AdaptiveResultTreeImpl.java
public class AdaptiveResultTreeImpl extends SimpleResultTreeImpl

/**
 * AdaptiveResultTreeImpl is a adaptive DOM model for result tree fragments (RTF). It is
 * used in the case where the RTF is likely to be pure text yet it can still be a DOM tree.
 * It is designed for RTFs which have &lt;xsl:call-template&gt; or &lt;xsl:apply-templates&gt; in
 * the contents. Example:
 * <pre>
 *    &lt;xsl:variable name = "x"&gt;
 *      &lt;xsl:call-template name = "test"&gt;
 *         &lt;xsl:with-param name="a" select="."/&gt;
 *      &lt;/xsl:call-template&gt;
 *    &lt;/xsl:variable>
 * </pre>
 * <p>In this example the result produced by <xsl:call-template> is likely to be a single
 * Text node. But it can also be a DOM tree. This kind of RTF cannot be modelled by
 * SimpleResultTreeImpl.
 * <p>
 * AdaptiveResultTreeImpl can be considered as a smart switcher between SimpleResultTreeImpl
 * and SAXImpl. It treats the RTF as simple Text and uses the SimpleResultTreeImpl model
 * at the beginning. However, if it receives a call which indicates that this is a DOM tree
 * (e.g. startElement), it will automatically transform itself into a wrapper around a
 * SAXImpl. In this way we can have a light-weight model when the result only contains
 * simple text, while at the same time it still works when the RTF is a DOM tree.
 * <p>
 * All methods in this class are overridden to delegate the action to the wrapped SAXImpl object
 * if it is non-null, or delegate the action to the SimpleResultTreeImpl if there is no
 * wrapped SAXImpl.
 * <p>
 * %REVISIT% Can we combine this class with SimpleResultTreeImpl? I think it is possible, but
 * it will make SimpleResultTreeImpl more expensive. I will use two separate classes at
 * this time.
 */
