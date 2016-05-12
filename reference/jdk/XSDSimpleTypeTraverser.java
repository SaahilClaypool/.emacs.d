_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDSimpleTypeTraverser.java
    private XSSimpleType getSimpleType(String name, Element simpleTypeDecl, Object[] attrValues, XSDocumentInfo schemaDoc, SchemaGrammar grammar) {

    /**
     * @param name
     * @param simpleTypeDecl
     * @param attrValues
     * @param schemaDoc
     * @param grammar
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDSimpleTypeTraverser.java
class XSDSimpleTypeTraverser extends XSDAbstractTraverser {

/**
 * The simple type definition schema component traverser.
 *
 * <simpleType
 *   final = (#all | (list | union | restriction))
 *   id = ID
 *   name = NCName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (restriction | list | union))
 * </simpleType>
 *
 * <restriction
 *   base = QName
 *   id = ID
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType?, (minExclusive | minInclusive | maxExclusive | maxInclusive | totalDigits | fractionDigits | length | minLength | maxLength | enumeration | whiteSpace | pattern)*))
 * </restriction>
 *
 * <list
 *   id = ID
 *   itemType = QName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType?))
 * </list>
 *
 * <union
 *   id = ID
 *   memberTypes = List of QName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType*))
 * </union>
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems, Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSDSimpleTypeTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDSimpleTypeTraverser.java
    private XSSimpleType getSimpleType(String name, Element simpleTypeDecl, Object[] attrValues, XSDocumentInfo schemaDoc, SchemaGrammar grammar) {

    /**
     * @param name
     * @param simpleTypeDecl
     * @param attrValues
     * @param schemaDoc
     * @param grammar
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDSimpleTypeTraverser.java
class XSDSimpleTypeTraverser extends XSDAbstractTraverser {

/**
 * The simple type definition schema component traverser.
 *
 * <simpleType
 *   final = (#all | (list | union | restriction))
 *   id = ID
 *   name = NCName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (restriction | list | union))
 * </simpleType>
 *
 * <restriction
 *   base = QName
 *   id = ID
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType?, (minExclusive | minInclusive | maxExclusive | maxInclusive | totalDigits | fractionDigits | length | minLength | maxLength | enumeration | whiteSpace | pattern)*))
 * </restriction>
 *
 * <list
 *   id = ID
 *   itemType = QName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType?))
 * </list>
 *
 * <union
 *   id = ID
 *   memberTypes = List of QName
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType*))
 * </union>
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Neeraj Bajaj, Sun Microsystems, Inc.
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSDSimpleTypeTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
