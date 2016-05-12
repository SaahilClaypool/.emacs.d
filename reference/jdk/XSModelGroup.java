_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public XSAnnotation getAnnotation();

    /**
     * An annotation if it exists, otherwise <code>null</code>. If not null
     * then the first [annotation] from the sequence of annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public XSObjectList getParticles();

    /**
     *  A list of [particles] if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public short getCompositor();

    /**
     * [compositor]: one of all, choice or sequence. The valid constant values
     * are:
     * <code>COMPOSITOR_SEQUENCE, COMPOSITOR_CHOICE, COMPOSITOR_ALL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public static final short COMPOSITOR_ALL            = 3;

    /**
     * This content model represents a simplified version of the SGML
     * &amp;-Connector and is limited to the top-level of any content model.
     * No element in the all content model may appear more than once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public static final short COMPOSITOR_SEQUENCE       = 1;

    /**
     * This constant value signifies a sequence operator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
public interface XSModelGroup extends XSTerm {

/**
 * This interface represents the Model Group schema component.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public XSAnnotation getAnnotation();

    /**
     * An annotation if it exists, otherwise <code>null</code>. If not null
     * then the first [annotation] from the sequence of annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public XSObjectList getParticles();

    /**
     *  A list of [particles] if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public short getCompositor();

    /**
     * [compositor]: one of all, choice or sequence. The valid constant values
     * are:
     * <code>COMPOSITOR_SEQUENCE, COMPOSITOR_CHOICE, COMPOSITOR_ALL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public static final short COMPOSITOR_ALL            = 3;

    /**
     * This content model represents a simplified version of the SGML
     * &amp;-Connector and is limited to the top-level of any content model.
     * No element in the all content model may appear more than once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
    public static final short COMPOSITOR_SEQUENCE       = 1;

    /**
     * This constant value signifies a sequence operator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSModelGroup.java
public interface XSModelGroup extends XSTerm {

/**
 * This interface represents the Model Group schema component.
 */
