_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public short getWhitespace() throws DatatypeException;

    /**
     * Return the whitespace corresponding to this datatype.
     *
     * @return valid values are WS_PRESERVE, WS_REPLACE, WS_COLLAPSE.
     * @exception DatatypeException
     *                   union datatypes don't have whitespace facet associated with them
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public boolean isIDType();

    /**
     * Check whether this type is or is derived from ID.
     * REVISIT: this method makes ID special, which is not a good design.
     *          but since ID is not a primitive, there doesn't seem to be a
     *          clean way of doing it except to define special method like this.
     *
     * @return  whether this simple type is or is derived from ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    //public short compare(Object value1, Object value2);

    /**
     * Check the order of the two actual values. (May not be supported by all
     * simple types.
     * REVISIT: Andy believes that a compare() method is necessary.
     *          I don't see the necessity for schema (the only place where we
     *          need to compare two values is to check min/maxIn/Exclusive
     *          facets, but we only need a private method for this case.)
     *          But Andy thinks XPATH potentially needs this compare() method.
     *
     * @param value1  the first value
     * @prarm value2  the second value
     * @return        > 0 if value1 > value2
     *                = 0 if value1 == value2
     *                < = if value1 < value2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public boolean isEqual(Object value1, Object value2);

    /**
     * Check whether two actual values are equal.
     *
     * @param value1  the first value
     * @param value2  the second value
     * @return        true if the two value are equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public void applyFacets(XSFacets facets, short presentFacet, short fixedFacet, ValidationContext context)

    /**
     * If this type is created from restriction, then some facets can be applied
     * to the simple type. <code>XSFacets</code> is used to pass the value of
     * different facets.
     *
     * @param facets        the value of all the facets
     * @param presentFacet  bit combination value of the costraining facet
     *                      constants which are present.
     * @param fixedFacet    bit combination value of the costraining facet
     *                      constants which are fixed.
     * @param context       the validation context
     * @exception InvalidDatatypeFacetException  exception for invalid facet values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public void validate(ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * Validate an actual value against this simple type.
     *
     * @param context       the validation context
     * @param validatedInfo used to provide the actual value and member types
     * @exception InvalidDatatypeValueException  exception for invalid values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public Object validate(Object content, ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * validate a given string value, represented by content.toString().
     * note that if content is a StringBuffer, for performance reasons,
     * it's possible that the content of the string buffer is modified.
     *
     * @param content       the string value that needs to be validated
     * @param context       the validation context
     * @param validatedInfo used to store validation result
     *
     * @return              the actual value (QName, Boolean) of the string value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public Object validate(String content, ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * validate a given string against this simple type.
     *
     * @param content       the string value that needs to be validated
     * @param context       the validation context
     * @param validatedInfo used to store validation result
     *
     * @return              the actual value (QName, Boolean) of the string value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public short getPrimitiveKind();

    /**
     * return an ID representing the built-in primitive base type.
     * REVISIT: This method is (currently) for internal use only.
     *          the constants returned from this method are not finalized yet.
     *          the names and values might change in the further.
     *
     * @return   an ID representing the built-in primitive base type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_NOTATION      = 20;

    /** "NOTATION" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_QNAME         = 18;

    /** "QName" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_BASE64BINARY  = 16;

    /** "base64Binary" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_GMONTH        = 14;

    /** "gMonth" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_GMONTHDAY     = 12;

    /** "gMonthDay" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_GYEARMONTH    = 10;

    /** "gYearMonth" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_TIME          = 8;

    /** "time" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_DURATION      = 6;

    /** "duration" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_FLOAT         = 4;

    /** "float" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_BOOLEAN       = 2;

    /** "boolean" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    /** "string" type */

    /**
     * Constant defined for the primitive built-in simple tpyes.
     * see <a href='http://www.w3.org/TR/xmlschema-2/#built-in-primitive-datatypes'>
     * XML Schema Part 2: Datatypes </a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short WS_REPLACE  = 1;

    /** replace the white spaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    /** preserve the white spaces */

    /**
     * constants defined for the values of 'whitespace' facet.
     * see <a href='http://www.w3.org/TR/xmlschema-2/#dt-whiteSpace'> XML Schema
     * Part 2: Datatypes </a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
public interface XSSimpleType extends XSSimpleTypeDefinition {

/**
 * This interface <code>XSSimpleType</code> represents the simple type
 * definition of schema component and defines methods to query the information
 * contained.
 * Any simple type (atomic, list or union) will implement this interface.
 * It inherits from <code>XSTypeDecl</code>.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public short getWhitespace() throws DatatypeException;

    /**
     * Return the whitespace corresponding to this datatype.
     *
     * @return valid values are WS_PRESERVE, WS_REPLACE, WS_COLLAPSE.
     * @exception DatatypeException
     *                   union datatypes don't have whitespace facet associated with them
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public boolean isIDType();

    /**
     * Check whether this type is or is derived from ID.
     * REVISIT: this method makes ID special, which is not a good design.
     *          but since ID is not a primitive, there doesn't seem to be a
     *          clean way of doing it except to define special method like this.
     *
     * @return  whether this simple type is or is derived from ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    //public short compare(Object value1, Object value2);

    /**
     * Check the order of the two actual values. (May not be supported by all
     * simple types.
     * REVISIT: Andy believes that a compare() method is necessary.
     *          I don't see the necessity for schema (the only place where we
     *          need to compare two values is to check min/maxIn/Exclusive
     *          facets, but we only need a private method for this case.)
     *          But Andy thinks XPATH potentially needs this compare() method.
     *
     * @param value1  the first value
     * @prarm value2  the second value
     * @return        > 0 if value1 > value2
     *                = 0 if value1 == value2
     *                < = if value1 < value2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public boolean isEqual(Object value1, Object value2);

    /**
     * Check whether two actual values are equal.
     *
     * @param value1  the first value
     * @param value2  the second value
     * @return        true if the two value are equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public void applyFacets(XSFacets facets, short presentFacet, short fixedFacet, ValidationContext context)

    /**
     * If this type is created from restriction, then some facets can be applied
     * to the simple type. <code>XSFacets</code> is used to pass the value of
     * different facets.
     *
     * @param facets        the value of all the facets
     * @param presentFacet  bit combination value of the costraining facet
     *                      constants which are present.
     * @param fixedFacet    bit combination value of the costraining facet
     *                      constants which are fixed.
     * @param context       the validation context
     * @exception InvalidDatatypeFacetException  exception for invalid facet values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public void validate(ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * Validate an actual value against this simple type.
     *
     * @param context       the validation context
     * @param validatedInfo used to provide the actual value and member types
     * @exception InvalidDatatypeValueException  exception for invalid values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public Object validate(Object content, ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * validate a given string value, represented by content.toString().
     * note that if content is a StringBuffer, for performance reasons,
     * it's possible that the content of the string buffer is modified.
     *
     * @param content       the string value that needs to be validated
     * @param context       the validation context
     * @param validatedInfo used to store validation result
     *
     * @return              the actual value (QName, Boolean) of the string value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public Object validate(String content, ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * validate a given string against this simple type.
     *
     * @param content       the string value that needs to be validated
     * @param context       the validation context
     * @param validatedInfo used to store validation result
     *
     * @return              the actual value (QName, Boolean) of the string value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public short getPrimitiveKind();

    /**
     * return an ID representing the built-in primitive base type.
     * REVISIT: This method is (currently) for internal use only.
     *          the constants returned from this method are not finalized yet.
     *          the names and values might change in the further.
     *
     * @return   an ID representing the built-in primitive base type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_NOTATION      = 20;

    /** "NOTATION" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_QNAME         = 18;

    /** "QName" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_BASE64BINARY  = 16;

    /** "base64Binary" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_GMONTH        = 14;

    /** "gMonth" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_GMONTHDAY     = 12;

    /** "gMonthDay" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_GYEARMONTH    = 10;

    /** "gYearMonth" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_TIME          = 8;

    /** "time" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_DURATION      = 6;

    /** "duration" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_FLOAT         = 4;

    /** "float" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short PRIMITIVE_BOOLEAN       = 2;

    /** "boolean" type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    /** "string" type */

    /**
     * Constant defined for the primitive built-in simple tpyes.
     * see <a href='http://www.w3.org/TR/xmlschema-2/#built-in-primitive-datatypes'>
     * XML Schema Part 2: Datatypes </a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    public static final short WS_REPLACE  = 1;

    /** replace the white spaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
    /** preserve the white spaces */

    /**
     * constants defined for the values of 'whitespace' facet.
     * see <a href='http://www.w3.org/TR/xmlschema-2/#dt-whiteSpace'> XML Schema
     * Part 2: Datatypes </a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/XSSimpleType.java
public interface XSSimpleType extends XSSimpleTypeDefinition {

/**
 * This interface <code>XSSimpleType</code> represents the simple type
 * definition of schema component and defines methods to query the information
 * contained.
 * Any simple type (atomic, list or union) will implement this interface.
 * It inherits from <code>XSTypeDecl</code>.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 */
