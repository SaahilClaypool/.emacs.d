_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void translateContents(ClassGenerator classGen,
                                  MethodGenerator methodGen) {

    /**
     * Override this method to make sure that xsl:attributes are not
     * copied to output if this xsl:element is to be ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * At runtime the compilation of xsl:element results in code that: (i)
     * evaluates the avt for the name, (ii) checks for a prefix in the name
     * (iii) generates a new prefix and create a new qname when necessary
     * (iv) calls startElement() on the handler (v) looks up a uri in the XML
     * when the prefix is not known at compile time (vi) calls namespace()
     * on the handler (vii) evaluates the contents (viii) calls endElement().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void translateLiteral(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This method is called when the name of the element is known at compile time.
     * In this case, there is no need to inspect the element name at runtime to
     * determine if a prefix exists, needs to be generated, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Run type check on element name & contents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public boolean declaresDefaultNS() {

    /**
     * This method is now deprecated. The new implemation of this class
     * never declares the default NS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void display(int indent) {

    /**
     * Displays the contents of the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
final class XslElement extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void translateContents(ClassGenerator classGen,
                                  MethodGenerator methodGen) {

    /**
     * Override this method to make sure that xsl:attributes are not
     * copied to output if this xsl:element is to be ignored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * At runtime the compilation of xsl:element results in code that: (i)
     * evaluates the avt for the name, (ii) checks for a prefix in the name
     * (iii) generates a new prefix and create a new qname when necessary
     * (iv) calls startElement() on the handler (v) looks up a uri in the XML
     * when the prefix is not known at compile time (vi) calls namespace()
     * on the handler (vii) evaluates the contents (viii) calls endElement().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void translateLiteral(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This method is called when the name of the element is known at compile time.
     * In this case, there is no need to inspect the element name at runtime to
     * determine if a prefix exists, needs to be generated, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Run type check on element name & contents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public boolean declaresDefaultNS() {

    /**
     * This method is now deprecated. The new implemation of this class
     * never declares the default NS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
    public void display(int indent) {

    /**
     * Displays the contents of the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XslElement.java
final class XslElement extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
