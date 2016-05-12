_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    /**

    /** Implementation of the DTM interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    /**

    /** Implementation of the SerializationHandler interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public int getNodeHandle(final int nodeId)

    /**
     * Return the node handle from a node identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public int getNodeIdent(final int nodehandle)

    /**
     * Return the node identity from a node handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public void characters(final int node, SerializationHandler handler)

    /**
     * Dispatch the character content of a node to an output handler.
     *
     * The escape setting should be taken care of when outputting to
     * a handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public final class SingletonIterator extends DTMAxisIteratorBase

    /**
     * The SingletonIterator is used for the self axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public final class SimpleIterator extends DTMAxisIteratorBase

    /**
     * The SimpleIterator is designed to support the nodeset() extension function. It has
     * a traversal direction parameter. The DOWN direction is used for child and descendant
     * axes, while the UP direction is used for parent and ancestor axes.
     *
     * This iterator only handles two nodes (RTF_ROOT and RTF_TEXT). If the type is set,
     * it will also match the node type with the given type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
public class SimpleResultTreeImpl extends EmptySerializer implements DOM, DTM

/**
 * This class represents a light-weight DOM model for simple result tree fragment(RTF).
 * A simple RTF is an RTF that has only one Text node. The Text node can be produced by a
 * combination of Text, xsl:value-of and xsl:number instructions. It can also be produced
 * by a control structure (xsl:if or xsl:choose) whose body is pure Text.
 * <p>
 * A SimpleResultTreeImpl has only two nodes, i.e. the ROOT node and its Text child. All DOM
 * interfaces are overridden with this in mind. For example, the getStringValue() interface
 * returns the value of the Text node. This class receives the character data from the
 * characters() interface.
 * <p>
 * This class implements DOM and SerializationHandler. It also implements the DTM interface
 * for support in MultiDOM. The nested iterators (SimpleIterator and SingletonIterator) are
 * used to support the nodeset() extension function.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    /**

    /** Implementation of the DTM interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    /**

    /** Implementation of the SerializationHandler interfaces **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public int getNodeHandle(final int nodeId)

    /**
     * Return the node handle from a node identity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public int getNodeIdent(final int nodehandle)

    /**
     * Return the node identity from a node handle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public void characters(final int node, SerializationHandler handler)

    /**
     * Dispatch the character content of a node to an output handler.
     *
     * The escape setting should be taken care of when outputting to
     * a handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public final class SingletonIterator extends DTMAxisIteratorBase

    /**
     * The SingletonIterator is used for the self axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
    public final class SimpleIterator extends DTMAxisIteratorBase

    /**
     * The SimpleIterator is designed to support the nodeset() extension function. It has
     * a traversal direction parameter. The DOWN direction is used for child and descendant
     * axes, while the UP direction is used for parent and ancestor axes.
     *
     * This iterator only handles two nodes (RTF_ROOT and RTF_TEXT). If the type is set,
     * it will also match the node type with the given type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SimpleResultTreeImpl.java
public class SimpleResultTreeImpl extends EmptySerializer implements DOM, DTM

/**
 * This class represents a light-weight DOM model for simple result tree fragment(RTF).
 * A simple RTF is an RTF that has only one Text node. The Text node can be produced by a
 * combination of Text, xsl:value-of and xsl:number instructions. It can also be produced
 * by a control structure (xsl:if or xsl:choose) whose body is pure Text.
 * <p>
 * A SimpleResultTreeImpl has only two nodes, i.e. the ROOT node and its Text child. All DOM
 * interfaces are overridden with this in mind. For example, the getStringValue() interface
 * returns the value of the Text node. This class receives the character data from the
 * characters() interface.
 * <p>
 * This class implements DOM and SerializationHandler. It also implements the DTM interface
 * for support in MultiDOM. The nested iterators (SimpleIterator and SingletonIterator) are
 * used to support the nodeset() extension function.
 */
