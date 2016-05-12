_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public void setPSVI(ElementPSVI elem) {

    /**
     * Copy PSVI properties from another psvi item.
     *
     * @param attr  the source of attribute PSVI items
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSModel getSchemaInformation() {

    /**
     * [schema information]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_information">XML Schema Part 1: Structures [schema information]</a>
     * @return The schema information property if it's the validation root,
     *         null otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSElementDeclaration getElementDeclaration() {

    /**
     * An item isomorphic to the element declaration used to validate
     * this element.
     *
     * @return  an element declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSTypeDefinition getTypeDefinition() {

    /**
     * An item isomorphic to the type definition used to validate this element.
     *
     * @return  a type declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSNotationDeclaration getNotation() {

    /**
     * [notation]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-notation>XML Schema Part 1: Structures [notation]</a>
     * @return The notation declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public boolean getNil() {

    /**
     * [nil]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-nil>XML Schema Part 1: Structures [nil]</a>
     * @return true if clause 3.2 of Element Locally Valid (Element) (3.3.4) above is satisfied, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public StringList getErrorCodes() {

    /**
     * A list of error codes generated from validation attempts.
     * Need to find all the possible subclause reports that need reporting
     *
     * @return Array of error codes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public short getValidationAttempted() {

    /**
     * Determines the extent to which the document has been validated
     *
     * @return return the [validation attempted] property. The possible values are
     *         NO_VALIDATION, PARTIAL_VALIDATION and FULL_VALIDATION
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public boolean getIsSchemaSpecified() {

    /**
     * [schema specified]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a>
     * @return false value was specified in schema, true value comes from the infoset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public String getSchemaDefault() {

    /**
     * [schema default]
     *
     * @return The canonical lexical representation of the declaration's {value constraint} value.
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_default>XML Schema Part 1: Structures [schema default]</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSModel fSchemaInformation = null;

    /** the schema information property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected String fValidationContext = null;

    /** validation context: could be QName or XPath expression*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected StringList fErrorCodes = null;

    /** error codes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected short fValidity = ElementPSVI.VALIDITY_NOTKNOWN;

    /** validity: valid, invalid, unknown */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected short fValidationAttempted = ElementPSVI.VALIDATION_NONE;

    /** validation attempted: none, partial, full */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSSimpleTypeDefinition fMemberType = null;

    /** member type definition against which element was validated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSNotationDeclaration fNotation = null;

    /** http://www.w3.org/TR/xmlschema-1/#e-notation*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected ShortList fItemValueTypes = null;

    /** actual value types if the value is a list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected short fActualValueType = XSConstants.UNAVAILABLE_DT;

    /** schema actual value type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected Object fActualValue = null;

    /** schema actual value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected String fNormalizedValue = null;

    /** schema normalized value property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected boolean fSpecified = true;

    /** false if the element value was provided by the schema; true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected boolean fNil = false;

    /** true if clause 3.2 of Element Locally Valid (Element) (3.3.4)
      * is satisfied, otherwise false
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSTypeDefinition fTypeDecl = null;

    /** type of element, could be xsi:type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSElementDeclaration fDeclaration = null;

    /** element declaration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public PSVIElementNSImpl(CoreDocumentImpl ownerDocument, String namespaceURI,
                             String qualifiedName) {

    /**
     * Construct an element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public PSVIElementNSImpl(CoreDocumentImpl ownerDocument, String namespaceURI,
                             String qualifiedName, String localName) {

    /**
     * Construct an element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    static final long serialVersionUID = 6815489624636016068L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
public class PSVIElementNSImpl extends ElementNSImpl implements ElementPSVI {

/**
 * Element namespace implementation; stores PSVI element items.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: PSVIElementNSImpl.java,v 1.6 2010/08/20 18:51:54 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public void setPSVI(ElementPSVI elem) {

    /**
     * Copy PSVI properties from another psvi item.
     *
     * @param attr  the source of attribute PSVI items
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSModel getSchemaInformation() {

    /**
     * [schema information]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_information">XML Schema Part 1: Structures [schema information]</a>
     * @return The schema information property if it's the validation root,
     *         null otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSElementDeclaration getElementDeclaration() {

    /**
     * An item isomorphic to the element declaration used to validate
     * this element.
     *
     * @return  an element declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSTypeDefinition getTypeDefinition() {

    /**
     * An item isomorphic to the type definition used to validate this element.
     *
     * @return  a type declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public XSNotationDeclaration getNotation() {

    /**
     * [notation]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-notation>XML Schema Part 1: Structures [notation]</a>
     * @return The notation declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public boolean getNil() {

    /**
     * [nil]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-nil>XML Schema Part 1: Structures [nil]</a>
     * @return true if clause 3.2 of Element Locally Valid (Element) (3.3.4) above is satisfied, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public StringList getErrorCodes() {

    /**
     * A list of error codes generated from validation attempts.
     * Need to find all the possible subclause reports that need reporting
     *
     * @return Array of error codes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public short getValidationAttempted() {

    /**
     * Determines the extent to which the document has been validated
     *
     * @return return the [validation attempted] property. The possible values are
     *         NO_VALIDATION, PARTIAL_VALIDATION and FULL_VALIDATION
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public boolean getIsSchemaSpecified() {

    /**
     * [schema specified]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a>
     * @return false value was specified in schema, true value comes from the infoset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public String getSchemaDefault() {

    /**
     * [schema default]
     *
     * @return The canonical lexical representation of the declaration's {value constraint} value.
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_default>XML Schema Part 1: Structures [schema default]</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSModel fSchemaInformation = null;

    /** the schema information property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected String fValidationContext = null;

    /** validation context: could be QName or XPath expression*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected StringList fErrorCodes = null;

    /** error codes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected short fValidity = ElementPSVI.VALIDITY_NOTKNOWN;

    /** validity: valid, invalid, unknown */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected short fValidationAttempted = ElementPSVI.VALIDATION_NONE;

    /** validation attempted: none, partial, full */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSSimpleTypeDefinition fMemberType = null;

    /** member type definition against which element was validated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSNotationDeclaration fNotation = null;

    /** http://www.w3.org/TR/xmlschema-1/#e-notation*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected ShortList fItemValueTypes = null;

    /** actual value types if the value is a list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected short fActualValueType = XSConstants.UNAVAILABLE_DT;

    /** schema actual value type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected Object fActualValue = null;

    /** schema actual value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected String fNormalizedValue = null;

    /** schema normalized value property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected boolean fSpecified = true;

    /** false if the element value was provided by the schema; true otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected boolean fNil = false;

    /** true if clause 3.2 of Element Locally Valid (Element) (3.3.4)
      * is satisfied, otherwise false
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSTypeDefinition fTypeDecl = null;

    /** type of element, could be xsi:type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    protected XSElementDeclaration fDeclaration = null;

    /** element declaration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public PSVIElementNSImpl(CoreDocumentImpl ownerDocument, String namespaceURI,
                             String qualifiedName) {

    /**
     * Construct an element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    public PSVIElementNSImpl(CoreDocumentImpl ownerDocument, String namespaceURI,
                             String qualifiedName, String localName) {

    /**
     * Construct an element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
    static final long serialVersionUID = 6815489624636016068L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/PSVIElementNSImpl.java
public class PSVIElementNSImpl extends ElementNSImpl implements ElementPSVI {

/**
 * Element namespace implementation; stores PSVI element items.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: PSVIElementNSImpl.java,v 1.6 2010/08/20 18:51:54 joehw Exp $
 */
