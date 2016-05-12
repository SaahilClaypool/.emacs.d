_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public void reset() {

    /**
     * Reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public XSAttributeDeclaration getAttributeDeclaration() {

    /**
     * An item isomorphic to the attribute declaration used to validate
     * this attribute.
     *
     * @return  an attribute declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public XSSimpleTypeDefinition getMemberTypeDefinition() {

    /**
     * If and only if that type definition is a simple type definition
     * with {variety} union, or a complex type definition whose {content type}
     * is a simple thype definition with {variety} union, then an item isomorphic
     * to that member of the union's {member type definitions} which actually
     * validated the element item's normalized value.
     *
     * @return  a simple type declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public XSTypeDefinition getTypeDefinition() {

    /**
     * An item isomorphic to the type definition used to validate this element.
     *
     * @return  a type declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public StringList getErrorCodes() {

    /**
     * A list of error codes generated from validation attempts.
     * Need to find all the possible subclause reports that need reporting
     *
     * @return list of error codes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public short getValidity() {

    /**
     * Determine the validity of the node with respect
     * to the validation being attempted
     *
     * @return return the [validity] property. Possible values are:
     *         UNKNOWN_VALIDITY, INVALID_VALIDITY, VALID_VALIDITY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public short getValidationAttempted() {

    /**
     * Determines the extent to which the document has been validated
     *
     * @return return the [validation attempted] property. The possible values are
     *         NO_VALIDATION, PARTIAL_VALIDATION and FULL_VALIDATION
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public boolean getIsSchemaSpecified() {

    /**
     * [schema specified]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a>
     * @return true - value was specified in schema, false - value comes from the infoset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public String getSchemaNormalizedValue() {

    /**
     * [schema normalized value]
     *
     *
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_normalized_value>XML Schema Part 1: Structures [schema normalized value]</a>
     * @return the normalized value of this item after validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public String getSchemaDefault() {

    /**
     * [schema default]
     *
     * @return The canonical lexical representation of the declaration's {value constraint} value.
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_default>XML Schema Part 1: Structures [schema default]</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected String fValidationContext = null;

    /** validation context: could be QName or XPath expression*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected String[] fErrorCodes = null;

    /** error codes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected short fValidity = AttributePSVI.VALIDITY_NOTKNOWN;

    /** validity: valid, invalid, unknown */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected short fValidationAttempted = AttributePSVI.VALIDATION_NONE;

    /** validation attempted: none, partial, full */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected XSSimpleTypeDefinition fMemberType = null;

    /** member type definition against which attribute was validated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected ShortList fItemValueTypes = null;

    /** actual value types if the value is a list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected short fActualValueType = XSConstants.UNAVAILABLE_DT;

    /** schema actual value type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected Object fActualValue = null;

    /** schema actual value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected String fNormalizedValue = null;

    /** schema normalized value property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected boolean fSpecified = false;

    /** If this attribute was explicitly given a
     * value in the original document, this is false; otherwise, it is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected XSTypeDefinition fTypeDecl = null;

    /** type of attribute, simpleType */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected XSAttributeDeclaration fDeclaration = null;

    /** attribute declaration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
public class AttributePSVImpl implements AttributePSVI {

/**
 * Attribute PSV infoset augmentations implementation.
 * The PSVI information for attributes will be available at the startElement call.
 *
 * @xerces.internal
 *
 * @author Elena Litani IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public void reset() {

    /**
     * Reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public XSAttributeDeclaration getAttributeDeclaration() {

    /**
     * An item isomorphic to the attribute declaration used to validate
     * this attribute.
     *
     * @return  an attribute declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public XSSimpleTypeDefinition getMemberTypeDefinition() {

    /**
     * If and only if that type definition is a simple type definition
     * with {variety} union, or a complex type definition whose {content type}
     * is a simple thype definition with {variety} union, then an item isomorphic
     * to that member of the union's {member type definitions} which actually
     * validated the element item's normalized value.
     *
     * @return  a simple type declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public XSTypeDefinition getTypeDefinition() {

    /**
     * An item isomorphic to the type definition used to validate this element.
     *
     * @return  a type declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public StringList getErrorCodes() {

    /**
     * A list of error codes generated from validation attempts.
     * Need to find all the possible subclause reports that need reporting
     *
     * @return list of error codes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public short getValidity() {

    /**
     * Determine the validity of the node with respect
     * to the validation being attempted
     *
     * @return return the [validity] property. Possible values are:
     *         UNKNOWN_VALIDITY, INVALID_VALIDITY, VALID_VALIDITY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public short getValidationAttempted() {

    /**
     * Determines the extent to which the document has been validated
     *
     * @return return the [validation attempted] property. The possible values are
     *         NO_VALIDATION, PARTIAL_VALIDATION and FULL_VALIDATION
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public boolean getIsSchemaSpecified() {

    /**
     * [schema specified]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a>
     * @return true - value was specified in schema, false - value comes from the infoset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public String getSchemaNormalizedValue() {

    /**
     * [schema normalized value]
     *
     *
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_normalized_value>XML Schema Part 1: Structures [schema normalized value]</a>
     * @return the normalized value of this item after validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    public String getSchemaDefault() {

    /**
     * [schema default]
     *
     * @return The canonical lexical representation of the declaration's {value constraint} value.
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_default>XML Schema Part 1: Structures [schema default]</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected String fValidationContext = null;

    /** validation context: could be QName or XPath expression*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected String[] fErrorCodes = null;

    /** error codes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected short fValidity = AttributePSVI.VALIDITY_NOTKNOWN;

    /** validity: valid, invalid, unknown */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected short fValidationAttempted = AttributePSVI.VALIDATION_NONE;

    /** validation attempted: none, partial, full */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected XSSimpleTypeDefinition fMemberType = null;

    /** member type definition against which attribute was validated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected ShortList fItemValueTypes = null;

    /** actual value types if the value is a list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected short fActualValueType = XSConstants.UNAVAILABLE_DT;

    /** schema actual value type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected Object fActualValue = null;

    /** schema actual value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected String fNormalizedValue = null;

    /** schema normalized value property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected boolean fSpecified = false;

    /** If this attribute was explicitly given a
     * value in the original document, this is false; otherwise, it is true */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected XSTypeDefinition fTypeDecl = null;

    /** type of attribute, simpleType */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
    protected XSAttributeDeclaration fDeclaration = null;

    /** attribute declaration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/AttributePSVImpl.java
public class AttributePSVImpl implements AttributePSVI {

/**
 * Attribute PSV infoset augmentations implementation.
 * The PSVI information for attributes will be available at the startElement call.
 *
 * @xerces.internal
 *
 * @author Elena Litani IBM
 */
