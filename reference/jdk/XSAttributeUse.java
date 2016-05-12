_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public ShortList getItemValueTypes()

    /**
     * In the case the actual constraint value represents a list, i.e. the
     * <code>actualValueType</code> is <code>LIST_DT</code>, the returned
     * array consists of one type kind which represents the itemType. If the
     * actual constraint value represents a list type definition whose item
     * type is a union type definition, i.e. <code>LISTOFUNION_DT</code>,
     * for each actual constraint value in the list the array contains the
     * corresponding memberType kind. For examples, see
     * <code>ItemPSVI.itemValueTypes</code>.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public short getActualVCType()

    /**
     * The actual constraint value built-in datatype, e.g.
     * <code>STRING_DT, SHORT_DT</code>. If the type definition of this
     * value is a list type definition, this method returns
     * <code>LIST_DT</code>. If the type definition of this value is a list
     * type definition whose item type is a union type definition, this
     * method returns <code>LISTOFUNION_DT</code>. To query the actual
     * constraint value of the list or list of union type definitions use
     * <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code>
     *  is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>
     * .
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public Object getActualVC()

    /**
     * Value Constraint: Binding specific actual constraint value or
     * <code>null</code> if the value is in error or there is no value
     * constraint.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public String getConstraintValue();

    /**
     * Value Constraint: The constraint value, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public short getConstraintType();

    /**
     * Value Constraint: one of default, fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public XSAttributeDeclaration getAttrDeclaration();

    /**
     * [attribute declaration]: provides the attribute declaration itself,
     * which will in turn determine the simple type definition used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
public interface XSAttributeUse extends XSObject {

/**
 * This interface represents the Attribute Use schema component.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public ShortList getItemValueTypes()

    /**
     * In the case the actual constraint value represents a list, i.e. the
     * <code>actualValueType</code> is <code>LIST_DT</code>, the returned
     * array consists of one type kind which represents the itemType. If the
     * actual constraint value represents a list type definition whose item
     * type is a union type definition, i.e. <code>LISTOFUNION_DT</code>,
     * for each actual constraint value in the list the array contains the
     * corresponding memberType kind. For examples, see
     * <code>ItemPSVI.itemValueTypes</code>.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public short getActualVCType()

    /**
     * The actual constraint value built-in datatype, e.g.
     * <code>STRING_DT, SHORT_DT</code>. If the type definition of this
     * value is a list type definition, this method returns
     * <code>LIST_DT</code>. If the type definition of this value is a list
     * type definition whose item type is a union type definition, this
     * method returns <code>LISTOFUNION_DT</code>. To query the actual
     * constraint value of the list or list of union type definitions use
     * <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code>
     *  is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>
     * .
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public Object getActualVC()

    /**
     * Value Constraint: Binding specific actual constraint value or
     * <code>null</code> if the value is in error or there is no value
     * constraint.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public String getConstraintValue();

    /**
     * Value Constraint: The constraint value, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public short getConstraintType();

    /**
     * Value Constraint: one of default, fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
    public XSAttributeDeclaration getAttrDeclaration();

    /**
     * [attribute declaration]: provides the attribute declaration itself,
     * which will in turn determine the simple type definition used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSAttributeUse.java
public interface XSAttributeUse extends XSObject {

/**
 * This interface represents the Attribute Use schema component.
 */
