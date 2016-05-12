_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSAttributeChecker.java
    public Object[] checkAttributes(Element element, boolean isGlobal,
                                    XSDocumentInfo schemaDoc, boolean enumAsQName) {

    /**
     * Check whether the specified element conforms to the attributes restriction
     * an array of attribute values is returned. the caller must call
     * <code>returnAttrArray</code> to return that array. This method also takes
     * an extra parameter: if the element is "enumeration", whether to make a
     * copy of the namespace context, so that the value can be resolved as a
     * QName later.
     *
     * @param element      which element to check
     * @param isGlobal     whether a child of &lt;schema&gt; or &lt;redefine&gt;
     * @param schemaDoc    the document where the element lives in
     * @param enumAsQName  whether to tread enumeration value as QName
     * @return             an array containing attribute values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSAttributeChecker.java
    public Object[] checkAttributes(Element element, boolean isGlobal,
                                    XSDocumentInfo schemaDoc) {

    /**
     * Check whether the specified element conforms to the attributes restriction
     * an array of attribute values is returned. the caller must call
     * <code>returnAttrArray</code> to return that array.
     *
     * @param element    which element to check
     * @param isGlobal   whether a child of &lt;schema&gt; or &lt;redefine&gt;
     * @param schemaDoc  the document where the element lives in
     * @return           an array containing attribute values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSAttributeChecker.java
public class XSAttributeChecker {

/**
 * Class <code>XSAttributeCheck</code> is used to check the validity of attributes
 * appearing in the schema document. It
 * - reports an error for invalid element (invalid namespace, invalid name)
 * - reports an error for invalid attribute (invalid namespace, invalid name)
 * - reports an error for invalid attribute value
 * - return compiled values for attriute values
 * - provide default value for missing optional attributes
 * - provide default value for incorrect attribute values
 *
 * But it's the caller's responsibility to check whether a required attribute
 * is present.
 *
 * Things need revisiting:
 * - Whether to return non-schema attributes/values
 * - Do we need to update NamespaceScope and ErrorReporter when reset()?
 * - Should have the datatype validators return compiled value
 * - use symbol table instead of many maps
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @version $Id: XSAttributeChecker.java,v 1.12 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSAttributeChecker.java
    public Object[] checkAttributes(Element element, boolean isGlobal,
                                    XSDocumentInfo schemaDoc, boolean enumAsQName) {

    /**
     * Check whether the specified element conforms to the attributes restriction
     * an array of attribute values is returned. the caller must call
     * <code>returnAttrArray</code> to return that array. This method also takes
     * an extra parameter: if the element is "enumeration", whether to make a
     * copy of the namespace context, so that the value can be resolved as a
     * QName later.
     *
     * @param element      which element to check
     * @param isGlobal     whether a child of &lt;schema&gt; or &lt;redefine&gt;
     * @param schemaDoc    the document where the element lives in
     * @param enumAsQName  whether to tread enumeration value as QName
     * @return             an array containing attribute values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSAttributeChecker.java
    public Object[] checkAttributes(Element element, boolean isGlobal,
                                    XSDocumentInfo schemaDoc) {

    /**
     * Check whether the specified element conforms to the attributes restriction
     * an array of attribute values is returned. the caller must call
     * <code>returnAttrArray</code> to return that array.
     *
     * @param element    which element to check
     * @param isGlobal   whether a child of &lt;schema&gt; or &lt;redefine&gt;
     * @param schemaDoc  the document where the element lives in
     * @return           an array containing attribute values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSAttributeChecker.java
public class XSAttributeChecker {

/**
 * Class <code>XSAttributeCheck</code> is used to check the validity of attributes
 * appearing in the schema document. It
 * - reports an error for invalid element (invalid namespace, invalid name)
 * - reports an error for invalid attribute (invalid namespace, invalid name)
 * - reports an error for invalid attribute value
 * - return compiled values for attriute values
 * - provide default value for missing optional attributes
 * - provide default value for incorrect attribute values
 *
 * But it's the caller's responsibility to check whether a required attribute
 * is present.
 *
 * Things need revisiting:
 * - Whether to return non-schema attributes/values
 * - Do we need to update NamespaceScope and ErrorReporter when reset()?
 * - Should have the datatype validators return compiled value
 * - use symbol table instead of many maps
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @version $Id: XSAttributeChecker.java,v 1.12 2010-11-01 04:40:02 joehw Exp $
 */
