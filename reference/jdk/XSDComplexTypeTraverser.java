_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDComplexTypeTraverser.java
    XSComplexTypeDecl traverseGlobal (Element complexTypeNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse global complexType declarations
     *
     * @param Element
     * @param XSDocumentInfo
     * @param SchemaGrammar
     * @return XSComplexTypeDecXSComplexTypeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDComplexTypeTraverser.java
    XSComplexTypeDecl traverseLocal(Element complexTypeNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse local complexType declarations
     *
     * @param Element
     * @param XSDocumentInfo
     * @param SchemaGrammar
     * @return XSComplexTypeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDComplexTypeTraverser.java
class  XSDComplexTypeTraverser extends XSDAbstractParticleTraverser {

/**
 * A complex type definition schema component traverser.
 *
 * <complexType
 *   abstract = boolean : false
 *   block = (#all | List of (extension | restriction))
 *   final = (#all | List of (extension | restriction))
 *   id = ID
 *   mixed = boolean : false
 *   name = NCName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleContent | complexContent |
 *            ((group | all | choice | sequence)?,
 *            ((attribute | attributeGroup)*, anyAttribute?))))
 * </complexType>
 *
 * @xerces.internal
 *
 * @version $Id: XSDComplexTypeTraverser.java,v 1.8 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDComplexTypeTraverser.java
    XSComplexTypeDecl traverseGlobal (Element complexTypeNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse global complexType declarations
     *
     * @param Element
     * @param XSDocumentInfo
     * @param SchemaGrammar
     * @return XSComplexTypeDecXSComplexTypeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDComplexTypeTraverser.java
    XSComplexTypeDecl traverseLocal(Element complexTypeNode,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar) {

    /**
     * Traverse local complexType declarations
     *
     * @param Element
     * @param XSDocumentInfo
     * @param SchemaGrammar
     * @return XSComplexTypeDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDComplexTypeTraverser.java
class  XSDComplexTypeTraverser extends XSDAbstractParticleTraverser {

/**
 * A complex type definition schema component traverser.
 *
 * <complexType
 *   abstract = boolean : false
 *   block = (#all | List of (extension | restriction))
 *   final = (#all | List of (extension | restriction))
 *   id = ID
 *   mixed = boolean : false
 *   name = NCName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleContent | complexContent |
 *            ((group | all | choice | sequence)?,
 *            ((attribute | attributeGroup)*, anyAttribute?))))
 * </complexType>
 *
 * @xerces.internal
 *
 * @version $Id: XSDComplexTypeTraverser.java,v 1.8 2010-11-01 04:40:02 joehw Exp $
 */
