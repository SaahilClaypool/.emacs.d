_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Hashtree2Node.java
    public static void appendHashToNode(Hashtable hash, String name,
            Node container, Document factory)

    /**
     * Convert a Hashtable into a Node tree.
     *
     * <p>The hash may have either Hashtables as values (in which
     * case we recurse) or other values, in which case we print them
     * as &lt;item> elements, with a 'key' attribute with the value
     * of the key, and the element contents as the value.</p>
     *
     * <p>If args are null we simply return without doing anything.
     * If we encounter an error, we will attempt to add an 'ERROR'
     * Element with exception info; if that doesn't work we simply
     * return without doing anything else byt printStackTrace().</p>
     *
     * @param hash to get info from (may have sub-hashtables)
     * @param name to use as parent element for appended node
     * futurework could have namespace and prefix as well
     * @param container Node to append our report to
     * @param factory Document providing createElement, etc. services
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Hashtree2Node.java
public abstract class Hashtree2Node

/**
 * Simple static utility to convert Hashtable to a Node.
 *
 * Please maintain JDK 1.1.x compatibility; no Collections!
 *
 * @see com.sun.org.apache.xalan.internal.xslt.EnvironmentCheck
 * @see com.sun.org.apache.xalan.internal.lib.Extensions
 * @author shane_curcuru@us.ibm.com
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Hashtree2Node.java
    public static void appendHashToNode(Hashtable hash, String name,
            Node container, Document factory)

    /**
     * Convert a Hashtable into a Node tree.
     *
     * <p>The hash may have either Hashtables as values (in which
     * case we recurse) or other values, in which case we print them
     * as &lt;item> elements, with a 'key' attribute with the value
     * of the key, and the element contents as the value.</p>
     *
     * <p>If args are null we simply return without doing anything.
     * If we encounter an error, we will attempt to add an 'ERROR'
     * Element with exception info; if that doesn't work we simply
     * return without doing anything else byt printStackTrace().</p>
     *
     * @param hash to get info from (may have sub-hashtables)
     * @param name to use as parent element for appended node
     * futurework could have namespace and prefix as well
     * @param container Node to append our report to
     * @param factory Document providing createElement, etc. services
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Hashtree2Node.java
public abstract class Hashtree2Node

/**
 * Simple static utility to convert Hashtable to a Node.
 *
 * Please maintain JDK 1.1.x compatibility; no Collections!
 *
 * @see com.sun.org.apache.xalan.internal.xslt.EnvironmentCheck
 * @see com.sun.org.apache.xalan.internal.lib.Extensions
 * @author shane_curcuru@us.ibm.com
 * @xsl.usage general
 */
