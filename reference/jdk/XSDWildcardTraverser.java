_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSWildcardDecl traverseWildcardDecl(Element elmNode,
            Object[] attrValues,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     *
     * @param  elmNode
     * @param  attrValues
     * @param  schemaDoc
     * @param  grammar
     * @return the wildcard node index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSWildcardDecl traverseAnyAttribute(Element elmNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse &lt;anyAttribute&gt;
     *
     * @param  elmNode
     * @param  schemaDoc
     * @param  grammar
     * @return the wildcard node index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSParticleDecl traverseAny(Element elmNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse &lt;any&gt;
     *
     * @param  elmNode
     * @param  schemaDoc
     * @param  grammar
     * @return the wildcard node index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSDWildcardTraverser (XSDHandler handler,
            XSAttributeChecker gAttrCheck) {

    /**
     * constructor
     *
     * @param  handler
     * @param  errorReporter
     * @param  gAttrCheck
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
class XSDWildcardTraverser extends XSDAbstractTraverser {

/**
 * The wildcard schema component traverser.
 *
 * &lt;any
 *   id = ID
 *   maxOccurs = (nonNegativeInteger | unbounded)  : 1
 *   minOccurs = nonNegativeInteger : 1
 *   namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) )  : ##any
 *   processContents = (lax | skip | strict) : strict
 *   {any attributes with non-schema namespace . . .}&gt;
 *   Content: (annotation?)
 * &lt;/any&gt;
 *
 * &lt;anyAttribute
 *   id = ID
 *   namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) )  : ##any
 *   processContents = (lax | skip | strict) : strict
 *   {any attributes with non-schema namespace . . .}&gt;
 *   Content: (annotation?)
 * &lt;/anyAttribute&gt;
 *
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSDWildcardTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSWildcardDecl traverseWildcardDecl(Element elmNode,
            Object[] attrValues,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     *
     * @param  elmNode
     * @param  attrValues
     * @param  schemaDoc
     * @param  grammar
     * @return the wildcard node index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSWildcardDecl traverseAnyAttribute(Element elmNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse &lt;anyAttribute&gt;
     *
     * @param  elmNode
     * @param  schemaDoc
     * @param  grammar
     * @return the wildcard node index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSParticleDecl traverseAny(Element elmNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse &lt;any&gt;
     *
     * @param  elmNode
     * @param  schemaDoc
     * @param  grammar
     * @return the wildcard node index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
    XSDWildcardTraverser (XSDHandler handler,
            XSAttributeChecker gAttrCheck) {

    /**
     * constructor
     *
     * @param  handler
     * @param  errorReporter
     * @param  gAttrCheck
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDWildcardTraverser.java
class XSDWildcardTraverser extends XSDAbstractTraverser {

/**
 * The wildcard schema component traverser.
 *
 * &lt;any
 *   id = ID
 *   maxOccurs = (nonNegativeInteger | unbounded)  : 1
 *   minOccurs = nonNegativeInteger : 1
 *   namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) )  : ##any
 *   processContents = (lax | skip | strict) : strict
 *   {any attributes with non-schema namespace . . .}&gt;
 *   Content: (annotation?)
 * &lt;/any&gt;
 *
 * &lt;anyAttribute
 *   id = ID
 *   namespace = ((##any | ##other) | List of (anyURI | (##targetNamespace | ##local)) )  : ##any
 *   processContents = (lax | skip | strict) : strict
 *   {any attributes with non-schema namespace . . .}&gt;
 *   Content: (annotation?)
 * &lt;/anyAttribute&gt;
 *
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSDWildcardTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
