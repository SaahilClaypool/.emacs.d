_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private boolean canProduceAttributeNodes(SyntaxTreeNode node, boolean ignoreXslAttribute) {

    /**
     * Return true if the instructions under the given SyntaxTreeNode can produce attribute nodes
     * to an element. Only return false when we are sure that no attribute node is produced.
     * Return true if we are not sure. If the flag ignoreXslAttribute is true, the direct
     * <xsl:attribute> children of the current node are not included in the check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private boolean checkAttributesUnique() {

    /**
     * Check whether all attributes are unique.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public boolean allAttributesUnique() {

    /**
     * Return true if all attributes of this LRE have unique names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public ElemDesc getElemDesc() {

    /**
     * Return the ElemDesc object for an HTML element.
     * Return null if the output method is not HTML or this is not a
     * valid HTML element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private boolean isHTMLOutput() {

    /**
     * Return true if the output method is html.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Compiles code that emits the literal element to the output handler,
     * first the start tag, then namespace declaration, then attributes,
     * then the element contents, and then the element end tag. Since the
     * value of an attribute may depend on a variable, variables must be
     * compiled first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void parseContents(Parser parser) {

    /**
     * Determines the final QName for the element and its attributes.
     * Registers all namespaces that are used by the element/attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public Set<Map.Entry<String, String>> getNamespaceScope(SyntaxTreeNode node) {

    /**
     * This method starts at a given node, traverses all namespace mappings,
     * and assembles a list of all prefixes that (for the given node) maps
     * to _ANY_ namespace URI. Used by literal result elements to determine
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-check the contents of this element. The element itself does not
     * need any type checking as it leaves nothign on the JVM's stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void setFirstAttribute(SyntaxTreeNode attribute) {

    /**
     * Set the first attribute of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void addAttribute(SyntaxTreeNode attribute) {

    /**
     * Add an attribute to this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private String translateQName(QName qname, SymbolTable stable) {

    /**
     * Translates the prefix of a QName according to the rules set in
     * the attributes of xsl:stylesheet. Also registers a QName to assure
     * that the output element contains the necessary namespace declarations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void registerNamespace(String prefix, String uri,
                                  SymbolTable stable, boolean declared) {

    /**
     * Method used to keep track of what namespaces that are references by
     * this literal element and its attributes. The output must contain a
     * definition for each namespace, so we stuff them in a map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private String accessedNamespace(String prefix) {

    /**
     * Returns the namespace URI for which a prefix is pointing to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void display(int indent) {

    /**
     * Displays the contents of this literal element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public QName getName() {

    /**
     * Returns the QName for this literal element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
final class LiteralElement extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private boolean canProduceAttributeNodes(SyntaxTreeNode node, boolean ignoreXslAttribute) {

    /**
     * Return true if the instructions under the given SyntaxTreeNode can produce attribute nodes
     * to an element. Only return false when we are sure that no attribute node is produced.
     * Return true if we are not sure. If the flag ignoreXslAttribute is true, the direct
     * <xsl:attribute> children of the current node are not included in the check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private boolean checkAttributesUnique() {

    /**
     * Check whether all attributes are unique.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public boolean allAttributesUnique() {

    /**
     * Return true if all attributes of this LRE have unique names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public ElemDesc getElemDesc() {

    /**
     * Return the ElemDesc object for an HTML element.
     * Return null if the output method is not HTML or this is not a
     * valid HTML element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private boolean isHTMLOutput() {

    /**
     * Return true if the output method is html.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Compiles code that emits the literal element to the output handler,
     * first the start tag, then namespace declaration, then attributes,
     * then the element contents, and then the element end tag. Since the
     * value of an attribute may depend on a variable, variables must be
     * compiled first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void parseContents(Parser parser) {

    /**
     * Determines the final QName for the element and its attributes.
     * Registers all namespaces that are used by the element/attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public Set<Map.Entry<String, String>> getNamespaceScope(SyntaxTreeNode node) {

    /**
     * This method starts at a given node, traverses all namespace mappings,
     * and assembles a list of all prefixes that (for the given node) maps
     * to _ANY_ namespace URI. Used by literal result elements to determine
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-check the contents of this element. The element itself does not
     * need any type checking as it leaves nothign on the JVM's stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void setFirstAttribute(SyntaxTreeNode attribute) {

    /**
     * Set the first attribute of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void addAttribute(SyntaxTreeNode attribute) {

    /**
     * Add an attribute to this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private String translateQName(QName qname, SymbolTable stable) {

    /**
     * Translates the prefix of a QName according to the rules set in
     * the attributes of xsl:stylesheet. Also registers a QName to assure
     * that the output element contains the necessary namespace declarations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void registerNamespace(String prefix, String uri,
                                  SymbolTable stable, boolean declared) {

    /**
     * Method used to keep track of what namespaces that are references by
     * this literal element and its attributes. The output must contain a
     * definition for each namespace, so we stuff them in a map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    private String accessedNamespace(String prefix) {

    /**
     * Returns the namespace URI for which a prefix is pointing to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public void display(int indent) {

    /**
     * Displays the contents of this literal element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
    public QName getName() {

    /**
     * Returns the QName for this literal element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LiteralElement.java
final class LiteralElement extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
