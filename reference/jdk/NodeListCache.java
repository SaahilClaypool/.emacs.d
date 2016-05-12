_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    NodeListCache next;

    /** Pointer to the next object on the list,
        only meaningful when actully stored in the free list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    ParentNode fOwner;

    /** Owner of this cache */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    ChildNode fChild;

    /** Last requested node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    int fChildIndex = -1;

    /** Last requested node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    int fLength = -1;

    /** Cached node list length. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    private static final long serialVersionUID = -7927529254918631002L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
class NodeListCache implements Serializable {

/**
 * This class is used, via a pool managed on CoreDocumentImpl, in ParentNode to
 * improve performance of the NodeList accessors, getLength() and item(i).
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 *
 * @version $Id: NodeListCache.java,v 1.6 2010/07/20 20:25:25 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    NodeListCache next;

    /** Pointer to the next object on the list,
        only meaningful when actully stored in the free list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    ParentNode fOwner;

    /** Owner of this cache */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    ChildNode fChild;

    /** Last requested node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    int fChildIndex = -1;

    /** Last requested node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    int fLength = -1;

    /** Cached node list length. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
    private static final long serialVersionUID = -7927529254918631002L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeListCache.java
class NodeListCache implements Serializable {

/**
 * This class is used, via a pool managed on CoreDocumentImpl, in ParentNode to
 * improve performance of the NodeList accessors, getLength() and item(i).
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 *
 * @version $Id: NodeListCache.java,v 1.6 2010/07/20 20:25:25 joehw Exp $
 */
