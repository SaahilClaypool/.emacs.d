_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public String getAnnotationString();

    /**
     * A text representation of the annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public boolean writeAnnotation(Object target,
                                   short targetType);

    /**
     *  Write contents of the annotation to the specified object. If the
     * specified <code>target</code> is a DOM object, in-scope namespace
     * declarations for <code>annotation</code> element are added as
     * attribute nodes of the serialized <code>annotation</code>, otherwise
     * the corresponding events for all in-scope namespace declarations are
     * sent via the specified document handler.
     * @param target  A target pointer to the annotation target object, i.e.
     *   <code>org.w3c.dom.Document</code>, <code>org.w3c.dom.Element</code>
     *   , <code>org.xml.sax.ContentHandler</code>.
     * @param targetType  A target type.
     * @return  True if the <code>target</code> is a recognized type and
     *   supported by this implementation, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public static final short W3C_DOM_DOCUMENT          = 3;

    /**
     * The object type is <code>org.w3c.dom.Document</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public static final short W3C_DOM_ELEMENT           = 1;

    /**
     * The object type is <code>org.w3c.dom.Element</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
public interface XSAnnotation extends XSObject {

/**
 * This interface represents the Annotation schema component.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public String getAnnotationString();

    /**
     * A text representation of the annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public boolean writeAnnotation(Object target,
                                   short targetType);

    /**
     *  Write contents of the annotation to the specified object. If the
     * specified <code>target</code> is a DOM object, in-scope namespace
     * declarations for <code>annotation</code> element are added as
     * attribute nodes of the serialized <code>annotation</code>, otherwise
     * the corresponding events for all in-scope namespace declarations are
     * sent via the specified document handler.
     * @param target  A target pointer to the annotation target object, i.e.
     *   <code>org.w3c.dom.Document</code>, <code>org.w3c.dom.Element</code>
     *   , <code>org.xml.sax.ContentHandler</code>.
     * @param targetType  A target type.
     * @return  True if the <code>target</code> is a recognized type and
     *   supported by this implementation, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public static final short W3C_DOM_DOCUMENT          = 3;

    /**
     * The object type is <code>org.w3c.dom.Document</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
    public static final short W3C_DOM_ELEMENT           = 1;

    /**
     * The object type is <code>org.w3c.dom.Element</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAnnotation.java
public interface XSAnnotation extends XSObject {

/**
 * This interface represents the Annotation schema component.
 */
