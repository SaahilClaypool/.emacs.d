_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public Object clone() throws CloneNotSupportedException {

    /**
     * This method makes a clone of this object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public String generateNextPrefix()

    /**
     * Generate a new namespace prefix ( ns0, ns1 ...) not used before
     * @return String a new namespace prefix ( ns0, ns1, ns2 ...)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    void popNamespaces(int elemDepth, ContentHandler saxHandler)

    /**
     * Pop, or undeclare all namespace definitions that are currently
     * declared at the given element depth, or deepter.
     * @param elemDepth the element depth for which mappings declared at this
     * depth or deeper will no longer be valid
     * @param saxHandler The ContentHandler to notify of any endPrefixMapping()
     * calls.  This parameter can be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    boolean pushNamespace(String prefix, String uri, int elemDepth)

    /**
     * Declare a mapping of a prefix to namespace URI at the given element depth.
     * @param prefix a String with the prefix for a qualified name
     * @param uri a String with the uri to which the prefix is to map
     * @param elemDepth the depth of current declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    boolean popNamespace(String prefix)

    /**
     * Undeclare the namespace that is currently pointed to by a given prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public String lookupPrefix(String uri)

    /**
     * Given a namespace uri, and the namespaces mappings for the
     * current element, return the current prefix for that uri.
     *
     * @param uri the namespace URI to be search for
     * @return an existing prefix that maps to the given URI, null if no prefix
     * maps to the given namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public String lookupNamespace(String prefix)

    /**
     * Use a namespace prefix to lookup a namespace URI.
     *
     * @param prefix String the prefix of the namespace
     * @return the URI corresponding to the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private void initNamespaces()

    /**
     * This method initializes the namespace object with appropriate stacks
     * and predefines a few prefix/uri pairs which always exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public NamespaceMappings()

    /**
     * Default constructor
     * @see java.lang.Object#Object()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private Stack m_nodeStack = new Stack();

    /**
     * The top of this stack contains the MapRecord
     * of the last declared a namespace.
     * Used to know how many prefix mappings to pop when leaving
     * the current element depth.
     * For every prefix mapping the current element depth is
     * pushed on this stack.
     * That way all prefixes pushed at the current depth can be
     * removed at the same time.
     * Used to ensure prefix/uri map scopes are closed correctly
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private HashMap m_namespaces = new HashMap();

    /**
     * Each entry (prefix) in this hashmap points to a Stack of URIs
     * This maps a prefix (String) to a Stack of prefix mappings.
     * All mappings in that retrieved stack have the same prefix,
     * though possibly different URI's or depths. Such a stack must have
     * mappings at deeper depths push later on such a stack.  Mappings pushed
     * earlier on the stack will have smaller values for MappingRecord.m_declarationDepth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private int count;

    /**
     * This member is continually incremented when new prefixes need to be
     * generated. ("ns0"  "ns1" ...)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
public class NamespaceMappings

/**
 * This class keeps track of the currently defined namespaces. Conceptually the
 * prefix/uri/depth triplets are pushed on a stack pushed on a stack. The depth
 * indicates the nesting depth of the element for which the mapping was made.
 *
 * <p>For example:
 * <pre>
 * <chapter xmlns:p1="def">
 *   <paragraph xmlns:p2="ghi">
 *      <sentance xmlns:p3="jkl">
 *      </sentance>
 *    </paragraph>
 *    <paragraph xlmns:p4="mno">
 *    </paragraph>
 * </chapter>
 * </pre>
 *
 * When the <chapter> element is encounted the prefix "p1" associated with uri
 * "def" is pushed on the stack with depth 1.
 * When the first <paragraph> is encountered "p2" and "ghi" are pushed with
 * depth 2.
 * When the <sentance> is encountered "p3" and "jkl" are pushed with depth 3.
 * When </sentance> occurs the popNamespaces(3) will pop "p3"/"jkl" off the
 * stack.  Of course popNamespaces(2) would pop anything with depth 2 or
 * greater.
 *
 * So prefix/uri pairs are pushed and poped off the stack as elements are
 * processed.  At any given moment of processing the currently visible prefixes
 * are on the stack and a prefix can be found given a uri, or a uri can be found
 * given a prefix.
 *
 * This class is public only because it is used by Xalan. It is not a public API
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public Object clone() throws CloneNotSupportedException {

    /**
     * This method makes a clone of this object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public String generateNextPrefix()

    /**
     * Generate a new namespace prefix ( ns0, ns1 ...) not used before
     * @return String a new namespace prefix ( ns0, ns1, ns2 ...)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    void popNamespaces(int elemDepth, ContentHandler saxHandler)

    /**
     * Pop, or undeclare all namespace definitions that are currently
     * declared at the given element depth, or deepter.
     * @param elemDepth the element depth for which mappings declared at this
     * depth or deeper will no longer be valid
     * @param saxHandler The ContentHandler to notify of any endPrefixMapping()
     * calls.  This parameter can be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    boolean pushNamespace(String prefix, String uri, int elemDepth)

    /**
     * Declare a mapping of a prefix to namespace URI at the given element depth.
     * @param prefix a String with the prefix for a qualified name
     * @param uri a String with the uri to which the prefix is to map
     * @param elemDepth the depth of current declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    boolean popNamespace(String prefix)

    /**
     * Undeclare the namespace that is currently pointed to by a given prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public String lookupPrefix(String uri)

    /**
     * Given a namespace uri, and the namespaces mappings for the
     * current element, return the current prefix for that uri.
     *
     * @param uri the namespace URI to be search for
     * @return an existing prefix that maps to the given URI, null if no prefix
     * maps to the given namespace URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public String lookupNamespace(String prefix)

    /**
     * Use a namespace prefix to lookup a namespace URI.
     *
     * @param prefix String the prefix of the namespace
     * @return the URI corresponding to the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private void initNamespaces()

    /**
     * This method initializes the namespace object with appropriate stacks
     * and predefines a few prefix/uri pairs which always exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    public NamespaceMappings()

    /**
     * Default constructor
     * @see java.lang.Object#Object()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private Stack m_nodeStack = new Stack();

    /**
     * The top of this stack contains the MapRecord
     * of the last declared a namespace.
     * Used to know how many prefix mappings to pop when leaving
     * the current element depth.
     * For every prefix mapping the current element depth is
     * pushed on this stack.
     * That way all prefixes pushed at the current depth can be
     * removed at the same time.
     * Used to ensure prefix/uri map scopes are closed correctly
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private HashMap m_namespaces = new HashMap();

    /**
     * Each entry (prefix) in this hashmap points to a Stack of URIs
     * This maps a prefix (String) to a Stack of prefix mappings.
     * All mappings in that retrieved stack have the same prefix,
     * though possibly different URI's or depths. Such a stack must have
     * mappings at deeper depths push later on such a stack.  Mappings pushed
     * earlier on the stack will have smaller values for MappingRecord.m_declarationDepth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
    private int count;

    /**
     * This member is continually incremented when new prefixes need to be
     * generated. ("ns0"  "ns1" ...)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/NamespaceMappings.java
public class NamespaceMappings

/**
 * This class keeps track of the currently defined namespaces. Conceptually the
 * prefix/uri/depth triplets are pushed on a stack pushed on a stack. The depth
 * indicates the nesting depth of the element for which the mapping was made.
 *
 * <p>For example:
 * <pre>
 * <chapter xmlns:p1="def">
 *   <paragraph xmlns:p2="ghi">
 *      <sentance xmlns:p3="jkl">
 *      </sentance>
 *    </paragraph>
 *    <paragraph xlmns:p4="mno">
 *    </paragraph>
 * </chapter>
 * </pre>
 *
 * When the <chapter> element is encounted the prefix "p1" associated with uri
 * "def" is pushed on the stack with depth 1.
 * When the first <paragraph> is encountered "p2" and "ghi" are pushed with
 * depth 2.
 * When the <sentance> is encountered "p3" and "jkl" are pushed with depth 3.
 * When </sentance> occurs the popNamespaces(3) will pop "p3"/"jkl" off the
 * stack.  Of course popNamespaces(2) would pop anything with depth 2 or
 * greater.
 *
 * So prefix/uri pairs are pushed and poped off the stack as elements are
 * processed.  At any given moment of processing the currently visible prefixes
 * are on the stack and a prefix can be found given a uri, or a uri can be found
 * given a prefix.
 *
 * This class is public only because it is used by Xalan. It is not a public API
 *
 * @xsl.usage internal
 */
