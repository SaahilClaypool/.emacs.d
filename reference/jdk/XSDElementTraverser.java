_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    XSElementDecl traverseNamedElement(Element elmDecl,
            Object[] attrValues,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            boolean isGlobal,
            XSObject parent) {

    /**
     * Traverse a globally declared element.
     *
     * @param  elmDecl
     * @param  attrValues
     * @param  schemaDoc
     * @param  grammar
     * @param  isGlobal
     * @return the element declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    XSElementDecl traverseGlobal(Element elmDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse a globally declared element.
     *
     * @param  elmDecl
     * @param  schemaDoc
     * @param  grammar
     * @return the element declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    protected void traverseLocal(XSParticleDecl particle,
            Element elmDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent,
            String[] localNSDecls) {

    /**
     * Traverse a locally declared element (or an element reference).
     *
     * This is the real traversal method. It's called after we've done with
     * all the global declarations.
     *
     * @param  index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    XSParticleDecl traverseLocal(Element elmDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     * Traverse a locally declared element (or an element reference).
     *
     * To handle the recursive cases efficiently, we delay the traversal
     * and return an empty particle node. We'll fill in this particle node
     * later after we've done with all the global declarations.
     * This method causes a number of data structures in the schema handler to be filled in.
     *
     * @param  elmDecl
     * @param  schemaDoc
     * @param  grammar
     * @return the particle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
class XSDElementTraverser extends XSDAbstractTraverser {

/**
 * The element declaration schema component traverser.
 * <element
 *   abstract = boolean : false
 *   block = (#all | List of (extension | restriction | substitution))
 *   default = string
 *   final = (#all | List of (extension | restriction))
 *   fixed = string
 *   form = (qualified | unqualified)
 *   id = ID
 *   maxOccurs = (nonNegativeInteger | unbounded)  : 1
 *   minOccurs = nonNegativeInteger : 1
 *   name = NCName
 *   nillable = boolean : false
 *   ref = QName
 *   substitutionGroup = QName
 *   type = QName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, ((simpleType | complexType)?, (unique | key | keyref)*))
 * </element>
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSDElementTraverser.java,v 1.9 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    XSElementDecl traverseNamedElement(Element elmDecl,
            Object[] attrValues,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            boolean isGlobal,
            XSObject parent) {

    /**
     * Traverse a globally declared element.
     *
     * @param  elmDecl
     * @param  attrValues
     * @param  schemaDoc
     * @param  grammar
     * @param  isGlobal
     * @return the element declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    XSElementDecl traverseGlobal(Element elmDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse a globally declared element.
     *
     * @param  elmDecl
     * @param  schemaDoc
     * @param  grammar
     * @return the element declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    protected void traverseLocal(XSParticleDecl particle,
            Element elmDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent,
            String[] localNSDecls) {

    /**
     * Traverse a locally declared element (or an element reference).
     *
     * This is the real traversal method. It's called after we've done with
     * all the global declarations.
     *
     * @param  index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
    XSParticleDecl traverseLocal(Element elmDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     * Traverse a locally declared element (or an element reference).
     *
     * To handle the recursive cases efficiently, we delay the traversal
     * and return an empty particle node. We'll fill in this particle node
     * later after we've done with all the global declarations.
     * This method causes a number of data structures in the schema handler to be filled in.
     *
     * @param  elmDecl
     * @param  schemaDoc
     * @param  grammar
     * @return the particle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDElementTraverser.java
class XSDElementTraverser extends XSDAbstractTraverser {

/**
 * The element declaration schema component traverser.
 * <element
 *   abstract = boolean : false
 *   block = (#all | List of (extension | restriction | substitution))
 *   default = string
 *   final = (#all | List of (extension | restriction))
 *   fixed = string
 *   form = (qualified | unqualified)
 *   id = ID
 *   maxOccurs = (nonNegativeInteger | unbounded)  : 1
 *   minOccurs = nonNegativeInteger : 1
 *   name = NCName
 *   nillable = boolean : false
 *   ref = QName
 *   substitutionGroup = QName
 *   type = QName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, ((simpleType | complexType)?, (unique | key | keyref)*))
 * </element>
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSDElementTraverser.java,v 1.9 2010-11-01 04:40:02 joehw Exp $
 */
