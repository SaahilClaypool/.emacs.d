_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public boolean getIsSchemaSpecified();

    /**
     * <code>[schema specified]</code>: if true, the value was specified in
     * the schema. If false, the value comes from the infoset. For more
     * information refer to element specified and attribute specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public String getSchemaDefault();

    /**
     * <code>[schema default]</code>: the canonical lexical representation of
     * the declaration's {value constraint} value. For more information
     * refer to element schema default and attribute schema default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public XSSimpleTypeDefinition getMemberTypeDefinition();

    /**
     * <code>[member type definition]</code>: if and only if that type
     * definition is a simple type definition with {variety} union, or a
     * complex type definition whose {content type} is a simple type
     * definition with {variety} union, then an item isomorphic to that
     * member of the union's {member type definitions} which actually
     * validated the schema item's normalized value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public XSTypeDefinition getTypeDefinition();

    /**
     *  <code>[type definition]</code>: an item isomorphic to the type
     * definition used to validate the schema item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public ShortList getItemValueTypes()

    /**
     * In the case the actual value represents a list, i.e. the
     * <code>actualNormalizedValueType</code> is <code>LIST_DT</code>, the
     * returned array consists of one type kind which represents the itemType
     * . For example:
     * <pre> &lt;simpleType name="listtype"&gt; &lt;list
     * itemType="positiveInteger"/&gt; &lt;/simpleType&gt; &lt;element
     * name="list" type="listtype"/&gt; ... &lt;list&gt;1 2 3&lt;/list&gt; </pre>
     *
     * The <code>schemaNormalizedValue</code> value is "1 2 3", the
     * <code>actualNormalizedValueType</code> value is <code>LIST_DT</code>,
     * and the <code>itemValueTypes</code> is an array of size 1 with the
     * value <code>POSITIVEINTEGER_DT</code>.
     * <br> If the actual value represents a list type definition whose item
     * type is a union type definition, i.e. <code>LISTOFUNION_DT</code>,
     * for each actual value in the list the array contains the
     * corresponding memberType kind. For example:
     * <pre> &lt;simpleType
     * name='union_type' memberTypes="integer string"/&gt; &lt;simpleType
     * name='listOfUnion'&gt; &lt;list itemType='union_type'/&gt;
     * &lt;/simpleType&gt; &lt;element name="list" type="listOfUnion"/&gt;
     * ... &lt;list&gt;1 2 foo&lt;/list&gt; </pre>
     *  The
     * <code>schemaNormalizedValue</code> value is "1 2 foo", the
     * <code>actualNormalizedValueType</code> is <code>LISTOFUNION_DT</code>
     * , and the <code>itemValueTypes</code> is an array of size 3 with the
     * following values: <code>INTEGER_DT, INTEGER_DT, STRING_DT</code>.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public short getActualNormalizedValueType()

    /**
     * The actual value built-in datatype, e.g.
     * <code>STRING_DT, SHORT_DT</code>. If the type definition of this
     * value is a list type definition, this method returns
     * <code>LIST_DT</code>. If the type definition of this value is a list
     * type definition whose item type is a union type definition, this
     * method returns <code>LISTOFUNION_DT</code>. To query the actual value
     * of the list or list of union type definitions use
     * <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code>
     *  is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>
     * .
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public Object getActualNormalizedValue()

    /**
     * <code>[schema normalized value]</code>: Binding specific actual value
     * or <code>null</code> if the value is in error.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public String getSchemaNormalizedValue();

    /**
     * <code>[schema normalized value]</code>: the normalized value of this
     * item after validation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public StringList getErrorCodes();

    /**
     *  <code>[schema error code]</code>: a list of error codes generated from
     * the validation attempt or an empty <code>StringList</code> if no
     * errors occurred during the validation attempt.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public short getValidationAttempted();

    /**
     *  <code>[validation attempted]</code>: determines the extent to which
     * the schema item has been validated. The value will be one of the
     * constants: <code>VALIDATION_NONE</code>,
     * <code>VALIDATION_PARTIAL</code> or <code>VALIDATION_FULL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public short getValidity();

    /**
     *  <code>[validity]</code>: determines the validity of the schema item
     * with respect to the validation being attempted. The value will be one
     * of the constants: <code>VALIDITY_NOTKNOWN</code>,
     * <code>VALIDITY_INVALID</code> or <code>VALIDITY_VALID</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public static final short VALIDATION_FULL           = 2;

    /**
     *  Validation status indicating that full schema validation has been
     * performed on the item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public static final short VALIDATION_NONE           = 0;

    /**
     *  Validation status indicating that schema validation has been performed
     * and the item in question has specifically been skipped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public static final short VALIDITY_INVALID          = 1;

    /**
     *  Validity value indicating that validation has been strictly assessed
     * and the item in question is invalid according to the rules of schema
     * validation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
public interface ItemPSVI {

/**
 *  Represents an abstract PSVI item for an element or an attribute
 * information item.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public boolean getIsSchemaSpecified();

    /**
     * <code>[schema specified]</code>: if true, the value was specified in
     * the schema. If false, the value comes from the infoset. For more
     * information refer to element specified and attribute specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public String getSchemaDefault();

    /**
     * <code>[schema default]</code>: the canonical lexical representation of
     * the declaration's {value constraint} value. For more information
     * refer to element schema default and attribute schema default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public XSSimpleTypeDefinition getMemberTypeDefinition();

    /**
     * <code>[member type definition]</code>: if and only if that type
     * definition is a simple type definition with {variety} union, or a
     * complex type definition whose {content type} is a simple type
     * definition with {variety} union, then an item isomorphic to that
     * member of the union's {member type definitions} which actually
     * validated the schema item's normalized value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public XSTypeDefinition getTypeDefinition();

    /**
     *  <code>[type definition]</code>: an item isomorphic to the type
     * definition used to validate the schema item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public ShortList getItemValueTypes()

    /**
     * In the case the actual value represents a list, i.e. the
     * <code>actualNormalizedValueType</code> is <code>LIST_DT</code>, the
     * returned array consists of one type kind which represents the itemType
     * . For example:
     * <pre> &lt;simpleType name="listtype"&gt; &lt;list
     * itemType="positiveInteger"/&gt; &lt;/simpleType&gt; &lt;element
     * name="list" type="listtype"/&gt; ... &lt;list&gt;1 2 3&lt;/list&gt; </pre>
     *
     * The <code>schemaNormalizedValue</code> value is "1 2 3", the
     * <code>actualNormalizedValueType</code> value is <code>LIST_DT</code>,
     * and the <code>itemValueTypes</code> is an array of size 1 with the
     * value <code>POSITIVEINTEGER_DT</code>.
     * <br> If the actual value represents a list type definition whose item
     * type is a union type definition, i.e. <code>LISTOFUNION_DT</code>,
     * for each actual value in the list the array contains the
     * corresponding memberType kind. For example:
     * <pre> &lt;simpleType
     * name='union_type' memberTypes="integer string"/&gt; &lt;simpleType
     * name='listOfUnion'&gt; &lt;list itemType='union_type'/&gt;
     * &lt;/simpleType&gt; &lt;element name="list" type="listOfUnion"/&gt;
     * ... &lt;list&gt;1 2 foo&lt;/list&gt; </pre>
     *  The
     * <code>schemaNormalizedValue</code> value is "1 2 foo", the
     * <code>actualNormalizedValueType</code> is <code>LISTOFUNION_DT</code>
     * , and the <code>itemValueTypes</code> is an array of size 3 with the
     * following values: <code>INTEGER_DT, INTEGER_DT, STRING_DT</code>.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public short getActualNormalizedValueType()

    /**
     * The actual value built-in datatype, e.g.
     * <code>STRING_DT, SHORT_DT</code>. If the type definition of this
     * value is a list type definition, this method returns
     * <code>LIST_DT</code>. If the type definition of this value is a list
     * type definition whose item type is a union type definition, this
     * method returns <code>LISTOFUNION_DT</code>. To query the actual value
     * of the list or list of union type definitions use
     * <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code>
     *  is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>
     * .
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public Object getActualNormalizedValue()

    /**
     * <code>[schema normalized value]</code>: Binding specific actual value
     * or <code>null</code> if the value is in error.
     * @exception XSException
     *   NOT_SUPPORTED_ERR: Raised if the implementation does not support this
     *   method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public String getSchemaNormalizedValue();

    /**
     * <code>[schema normalized value]</code>: the normalized value of this
     * item after validation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public StringList getErrorCodes();

    /**
     *  <code>[schema error code]</code>: a list of error codes generated from
     * the validation attempt or an empty <code>StringList</code> if no
     * errors occurred during the validation attempt.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public short getValidationAttempted();

    /**
     *  <code>[validation attempted]</code>: determines the extent to which
     * the schema item has been validated. The value will be one of the
     * constants: <code>VALIDATION_NONE</code>,
     * <code>VALIDATION_PARTIAL</code> or <code>VALIDATION_FULL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public short getValidity();

    /**
     *  <code>[validity]</code>: determines the validity of the schema item
     * with respect to the validation being attempted. The value will be one
     * of the constants: <code>VALIDITY_NOTKNOWN</code>,
     * <code>VALIDITY_INVALID</code> or <code>VALIDITY_VALID</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public static final short VALIDATION_FULL           = 2;

    /**
     *  Validation status indicating that full schema validation has been
     * performed on the item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public static final short VALIDATION_NONE           = 0;

    /**
     *  Validation status indicating that schema validation has been performed
     * and the item in question has specifically been skipped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
    public static final short VALIDITY_INVALID          = 1;

    /**
     *  Validity value indicating that validation has been strictly assessed
     * and the item in question is invalid according to the rules of schema
     * validation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/ItemPSVI.java
public interface ItemPSVI {

/**
 *  Represents an abstract PSVI item for an element or an attribute
 * information item.
 */
