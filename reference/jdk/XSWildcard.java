_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public XSAnnotation getAnnotation();

    /**
     * An annotation if it exists, otherwise <code>null</code>. If not null
     * then the first [annotation] from the sequence of annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public short getProcessContents();

    /**
     * [process contents]: one of skip, lax or strict. Valid constants values
     * are: <code>PC_LAX</code>, <code>PC_SKIP</code> and
     * <code>PC_STRICT</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public StringList getNsConstraintList();

    /**
     * Namespace constraint: For <code>constraintType</code>
     * <code>NSCONSTRAINT_LIST</code>, the list contains allowed namespaces.
     * For <code>constraintType</code> <code>NSCONSTRAINT_NOT</code>, the
     * list contains disallowed namespaces. For <code>constraintType</code>
     * <code>NSCONSTRAINT_ANY</code>, the <code>StringList</code> is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public short getConstraintType();

    /**
     * Namespace constraint: A constraint type: any, not, list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short PC_LAX                    = 3;

    /**
     * If the item, or any items among its [children] is an element
     * information item, has a uniquely determined declaration available, it
     * must be valid with respect to that definition, that is, validate
     * where you can and do not worry when you cannot.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short PC_STRICT                 = 1;

    /**
     * There must be a top-level declaration for the item available, or the
     * item must have an xsi:type, and the item must be valid as appropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short NSCONSTRAINT_LIST         = 3;

    /**
     * Namespace Constraint: namespaces in the list are allowed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short NSCONSTRAINT_ANY          = 1;

    /**
     * Namespace Constraint: any namespace is allowed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
public interface XSWildcard extends XSTerm {

/**
 * This interface represents the Wildcard schema component.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public XSAnnotation getAnnotation();

    /**
     * An annotation if it exists, otherwise <code>null</code>. If not null
     * then the first [annotation] from the sequence of annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public short getProcessContents();

    /**
     * [process contents]: one of skip, lax or strict. Valid constants values
     * are: <code>PC_LAX</code>, <code>PC_SKIP</code> and
     * <code>PC_STRICT</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public StringList getNsConstraintList();

    /**
     * Namespace constraint: For <code>constraintType</code>
     * <code>NSCONSTRAINT_LIST</code>, the list contains allowed namespaces.
     * For <code>constraintType</code> <code>NSCONSTRAINT_NOT</code>, the
     * list contains disallowed namespaces. For <code>constraintType</code>
     * <code>NSCONSTRAINT_ANY</code>, the <code>StringList</code> is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public short getConstraintType();

    /**
     * Namespace constraint: A constraint type: any, not, list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short PC_LAX                    = 3;

    /**
     * If the item, or any items among its [children] is an element
     * information item, has a uniquely determined declaration available, it
     * must be valid with respect to that definition, that is, validate
     * where you can and do not worry when you cannot.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short PC_STRICT                 = 1;

    /**
     * There must be a top-level declaration for the item available, or the
     * item must have an xsi:type, and the item must be valid as appropriate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short NSCONSTRAINT_LIST         = 3;

    /**
     * Namespace Constraint: namespaces in the list are allowed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
    public static final short NSCONSTRAINT_ANY          = 1;

    /**
     * Namespace Constraint: any namespace is allowed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSWildcard.java
public interface XSWildcard extends XSTerm {

/**
 * This interface represents the Wildcard schema component.
 */
