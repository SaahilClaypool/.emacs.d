_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMWSFilter.java
    public short getShouldStripSpace(int node, DTM dtm) {

    /**
     * Test whether whitespace-only text nodes are visible in the logical
     * view of <code>DTM</code>. Normally, this function
     * will be called by the implementation of <code>DTM</code>;
     * it is not normally called directly from
     * user code.
     *
     * @param node int handle of the node.
     * @param dtm the DTM that owns this node
     * @return one of <code>NOTSTRIP</code>, <code>STRIP</code> or
     * <code>INHERIT</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMWSFilter.java
    public DOMWSFilter(AbstractTranslet translet) {

    /**
     * Construct an adapter connecting the <code>DTMWSFilter</code> interface
     * to the <code>StripFilter</code> interface.
     *
     * @param translet A translet that also implements the StripFilter
     * interface.
     *
     * @see com.sun.org.apache.xml.internal.dtm.DTMWSFilter
     * @see com.sun.org.apache.xalan.internal.xsltc.StripFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMWSFilter.java
public class DOMWSFilter implements DTMWSFilter {

/**
 * A wrapper class that adapts the
 * {@link com.sun.org.apache.xml.internal.dtm.DTMWSFilter DTMWSFilter} interface to the XSLTC
 * DOM {@link com.sun.org.apache.xalan.internal.xsltc.StripFilter StripFilter} interface.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMWSFilter.java
    public short getShouldStripSpace(int node, DTM dtm) {

    /**
     * Test whether whitespace-only text nodes are visible in the logical
     * view of <code>DTM</code>. Normally, this function
     * will be called by the implementation of <code>DTM</code>;
     * it is not normally called directly from
     * user code.
     *
     * @param node int handle of the node.
     * @param dtm the DTM that owns this node
     * @return one of <code>NOTSTRIP</code>, <code>STRIP</code> or
     * <code>INHERIT</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMWSFilter.java
    public DOMWSFilter(AbstractTranslet translet) {

    /**
     * Construct an adapter connecting the <code>DTMWSFilter</code> interface
     * to the <code>StripFilter</code> interface.
     *
     * @param translet A translet that also implements the StripFilter
     * interface.
     *
     * @see com.sun.org.apache.xml.internal.dtm.DTMWSFilter
     * @see com.sun.org.apache.xalan.internal.xsltc.StripFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/DOMWSFilter.java
public class DOMWSFilter implements DTMWSFilter {

/**
 * A wrapper class that adapts the
 * {@link com.sun.org.apache.xml.internal.dtm.DTMWSFilter DTMWSFilter} interface to the XSLTC
 * DOM {@link com.sun.org.apache.xalan.internal.xsltc.StripFilter StripFilter} interface.
 */
