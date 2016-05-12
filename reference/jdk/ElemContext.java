_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext push(
        final String uri,
        final String localName,
        final String qName)

    /**
     * Push an element context on the stack. This context keeps track of
     * information gathered about the element.
     * @param uri The URI for the namespace for the element name,
     * can be null if it is not yet known.
     * @param localName The local name of the element (no prefix),
     * can be null.
     * @param qName The qualified name (with prefix, if any)
     * of the element, this parameter is required.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext push()

    /**
     * This method pushes an element "stack frame"
     * but with no initialization of values in that frame.
     * This method is used for optimization purposes, like when pushing
     * a stack frame for an HTML "IMG" tag which has no children and
     * the stack frame will almost immediately be popped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext pop()

    /**
     * Pop the current "stack frame".
     * @return Returns the parent "stack frame" of the one popped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    private ElemContext(final ElemContext previous)

    /**
     * Constructor to create the "stack frame" for a given element depth.
     *
     * This implementation will re-use the context at each depth. If
     * a documents deepest element depth is N then there will be (N+1)
     * such objects created, no more than that.
     *
     * @param previous The "stack frame" corresponding to the new
     * elements parent element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    ElemContext()

    /**
     * Constructor to create the root of the element contexts.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    boolean m_startTagOpen = false;

    /**
     * Set to true when a start tag is started, or open, but not all the
     * attributes or namespace information is yet collected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext m_prev;

    /** The previous element "stack frame". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    private ElemContext m_next;

    /** The next element "stack frame". This value will only be
     * set once as deeper stack frames are not deleted when popped off,
     * but are rather re-used when a push is required.
     *
     * This makes for very fast pushing and popping of stack frames
     * because very few stack frame objects are ever created, they are
     * mostly re-used.  This re-use saves object creation but it also means
     * that connections between the frames via m_next and m_prev
     * never changes either. Just the contents of the frames change
     * as they are re-used. Only the reference to the current stack frame, which
     * is held by the serializer is changed via a quick pop() or push().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    boolean m_isRaw = false;

    /** True if the current element has output escaping disabled.
     * This is true for SCRIPT and STYLE elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    boolean m_isCdataSection;

    /** If the element is in the cdata-section-names list
     * then the value is true. If it is true the text children of the element
     * should be output in CDATA section blocks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    String m_elementURI = null;

    /**
     * The URI of the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    String m_elementName = null;

    /**
     * The fully qualified name of the element (with prefix, if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    String m_elementLocalName = null;

    /**
     * The local name of the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    ElemDesc m_elementDesc = null;

    /** HTML field, the element description of the HTML element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final int m_currentElemDepth;

    /**
     * The nesting depth of the element inside other elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
final class ElemContext

/**
 * This class is a stack frame that consists of
 * information about the element currently being processed
 * by a serializer. Consider this example:
 * <pre>
 *   <A>
 *     <B1>
 *     </B1>
 *     <B2>
 *     </B2>
 *   <A>
 * </pre>
 *
 * A stack frame will be pushed for "A" at depth 1,
 * then another one for "B1" at depth 2.
 * Then "B1" stackframe is popped.  When the stack frame for "B2" is
 * pushed, this implementation re-uses the old stack fram object used
 * by "B1" to be efficient at not creating too many of these object.
 *
 * This is by no means a public class, and neither are its fields or methods,
 * they are all helper fields for a serializer.
 *
 * The purpose of this class is to be more consistent with pushing information
 * when a new element is being serialized and more quickly restoring the old
 * information about the parent element with a simple pop() when the
 * child element is done.  Previously there was some redundant and error-prone
 * calculations going on to retore information.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext push(
        final String uri,
        final String localName,
        final String qName)

    /**
     * Push an element context on the stack. This context keeps track of
     * information gathered about the element.
     * @param uri The URI for the namespace for the element name,
     * can be null if it is not yet known.
     * @param localName The local name of the element (no prefix),
     * can be null.
     * @param qName The qualified name (with prefix, if any)
     * of the element, this parameter is required.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext push()

    /**
     * This method pushes an element "stack frame"
     * but with no initialization of values in that frame.
     * This method is used for optimization purposes, like when pushing
     * a stack frame for an HTML "IMG" tag which has no children and
     * the stack frame will almost immediately be popped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext pop()

    /**
     * Pop the current "stack frame".
     * @return Returns the parent "stack frame" of the one popped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    private ElemContext(final ElemContext previous)

    /**
     * Constructor to create the "stack frame" for a given element depth.
     *
     * This implementation will re-use the context at each depth. If
     * a documents deepest element depth is N then there will be (N+1)
     * such objects created, no more than that.
     *
     * @param previous The "stack frame" corresponding to the new
     * elements parent element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    ElemContext()

    /**
     * Constructor to create the root of the element contexts.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    boolean m_startTagOpen = false;

    /**
     * Set to true when a start tag is started, or open, but not all the
     * attributes or namespace information is yet collected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final ElemContext m_prev;

    /** The previous element "stack frame". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    private ElemContext m_next;

    /** The next element "stack frame". This value will only be
     * set once as deeper stack frames are not deleted when popped off,
     * but are rather re-used when a push is required.
     *
     * This makes for very fast pushing and popping of stack frames
     * because very few stack frame objects are ever created, they are
     * mostly re-used.  This re-use saves object creation but it also means
     * that connections between the frames via m_next and m_prev
     * never changes either. Just the contents of the frames change
     * as they are re-used. Only the reference to the current stack frame, which
     * is held by the serializer is changed via a quick pop() or push().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    boolean m_isRaw = false;

    /** True if the current element has output escaping disabled.
     * This is true for SCRIPT and STYLE elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    boolean m_isCdataSection;

    /** If the element is in the cdata-section-names list
     * then the value is true. If it is true the text children of the element
     * should be output in CDATA section blocks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    String m_elementURI = null;

    /**
     * The URI of the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    String m_elementName = null;

    /**
     * The fully qualified name of the element (with prefix, if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    String m_elementLocalName = null;

    /**
     * The local name of the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    ElemDesc m_elementDesc = null;

    /** HTML field, the element description of the HTML element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
    final int m_currentElemDepth;

    /**
     * The nesting depth of the element inside other elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemContext.java
final class ElemContext

/**
 * This class is a stack frame that consists of
 * information about the element currently being processed
 * by a serializer. Consider this example:
 * <pre>
 *   <A>
 *     <B1>
 *     </B1>
 *     <B2>
 *     </B2>
 *   <A>
 * </pre>
 *
 * A stack frame will be pushed for "A" at depth 1,
 * then another one for "B1" at depth 2.
 * Then "B1" stackframe is popped.  When the stack frame for "B2" is
 * pushed, this implementation re-uses the old stack fram object used
 * by "B1" to be efficient at not creating too many of these object.
 *
 * This is by no means a public class, and neither are its fields or methods,
 * they are all helper fields for a serializer.
 *
 * The purpose of this class is to be more consistent with pushing information
 * when a new element is being serialized and more quickly restoring the old
 * information about the parent element with a simple pop() when the
 * child element is done.  Previously there was some redundant and error-prone
 * calculations going on to retore information.
 *
 * @xsl.usage internal
 */
