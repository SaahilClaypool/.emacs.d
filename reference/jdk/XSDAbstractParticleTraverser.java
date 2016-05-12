_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    private XSParticleDecl traverseSeqChoice(Element decl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            boolean choice,
            XSObject parent) {

    /**
     * Common traversal for <choice> and <sequence>
     *
     * @param decl
     * @param schemaDoc
     * @param grammar
     * @param choice    If traversing <choice> this parameter is true.
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    XSParticleDecl traverseChoice(Element choiceDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     * Traverse the Choice declaration
     *
     * <choice
     *   id = ID
     *   maxOccurs = string
     *   minOccurs = nonNegativeInteger>
     *   Content: (annotation? , (element | group | choice | sequence | any)*)
     * </choice>
     *
     * @param choiceDecl
     * @param schemaDoc
     * @param grammar
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    XSParticleDecl traverseSequence(Element seqDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     * Traverse the Sequence declaration
     *
     * <sequence
     *   id = ID
     *   maxOccurs = string
     *   minOccurs = nonNegativeInteger>
     *   Content: (annotation? , (element | group | choice | sequence | any)*)
     * </sequence>
     *
     * @param seqDecl
     * @param schemaDoc
     * @param grammar
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    XSParticleDecl traverseAll(Element allDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     *
     * Traverse the "All" declaration
     *
     * &lt;all
     *   id = ID
     *   maxOccurs = 1 : 1
     *   minOccurs = (0 | 1) : 1&gt;
     *   Content: (annotation? , element*)
     * &lt;/all&gt;
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
abstract class XSDAbstractParticleTraverser extends XSDAbstractTraverser {

/**
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSDAbstractParticleTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    private XSParticleDecl traverseSeqChoice(Element decl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            boolean choice,
            XSObject parent) {

    /**
     * Common traversal for <choice> and <sequence>
     *
     * @param decl
     * @param schemaDoc
     * @param grammar
     * @param choice    If traversing <choice> this parameter is true.
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    XSParticleDecl traverseChoice(Element choiceDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     * Traverse the Choice declaration
     *
     * <choice
     *   id = ID
     *   maxOccurs = string
     *   minOccurs = nonNegativeInteger>
     *   Content: (annotation? , (element | group | choice | sequence | any)*)
     * </choice>
     *
     * @param choiceDecl
     * @param schemaDoc
     * @param grammar
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    XSParticleDecl traverseSequence(Element seqDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     * Traverse the Sequence declaration
     *
     * <sequence
     *   id = ID
     *   maxOccurs = string
     *   minOccurs = nonNegativeInteger>
     *   Content: (annotation? , (element | group | choice | sequence | any)*)
     * </sequence>
     *
     * @param seqDecl
     * @param schemaDoc
     * @param grammar
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
    XSParticleDecl traverseAll(Element allDecl,
            XSDocumentInfo schemaDoc,
            SchemaGrammar grammar,
            int allContextFlags,
            XSObject parent) {

    /**
     *
     * Traverse the "All" declaration
     *
     * &lt;all
     *   id = ID
     *   maxOccurs = 1 : 1
     *   minOccurs = (0 | 1) : 1&gt;
     *   Content: (annotation? , element*)
     * &lt;/all&gt;
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDAbstractParticleTraverser.java
abstract class XSDAbstractParticleTraverser extends XSDAbstractTraverser {

/**
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSDAbstractParticleTraverser.java,v 1.7 2010-11-01 04:40:02 joehw Exp $
 */
