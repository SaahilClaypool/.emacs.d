_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAttributeTraverser.java
    XSAttributeDecl traverseNamedAttr(Element attrDecl,
            Object[] attrValues,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            boolean isGlobal,
            XSComplexTypeDecl enclosingCT) {

    /**
     * Traverse a globally declared attribute.
     *
     * @param  attrDecl
     * @param  attrValues
     * @param  schemaDoc
     * @param  grammar
     * @param  isGlobal
     * @return the attribute declaration index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAttributeTraverser.java
class XSDAttributeTraverser extends XSDAbstractTraverser {

/**
 * The attribute declaration schema component traverser.
 *
 * <attribute
 *   default = string
 *   fixed = string
 *   form = (qualified | unqualified)
 *   id = ID
 *   name = NCName
 *   ref = QName
 *   type = QName
 *   use = (optional | prohibited | required) : optional
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType?))
 * </attribute>
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @version $Id: XSDAttributeTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAttributeTraverser.java
    XSAttributeDecl traverseNamedAttr(Element attrDecl,
            Object[] attrValues,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            boolean isGlobal,
            XSComplexTypeDecl enclosingCT) {

    /**
     * Traverse a globally declared attribute.
     *
     * @param  attrDecl
     * @param  attrValues
     * @param  schemaDoc
     * @param  grammar
     * @param  isGlobal
     * @return the attribute declaration index
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAttributeTraverser.java
class XSDAttributeTraverser extends XSDAbstractTraverser {

/**
 * The attribute declaration schema component traverser.
 *
 * <attribute
 *   default = string
 *   fixed = string
 *   form = (qualified | unqualified)
 *   id = ID
 *   name = NCName
 *   ref = QName
 *   type = QName
 *   use = (optional | prohibited | required) : optional
 *   {any attributes with non-schema namespace . . .}>
 *   Content: (annotation?, (simpleType?))
 * </attribute>
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @version $Id: XSDAttributeTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
