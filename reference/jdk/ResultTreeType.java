_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public String getClassName() {

    /**
     * Returns the class name of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates a result tree to a Java type denoted by <code>clazz</code>.
     * Expects a result tree on the stack and pushes an object
     * of the appropriate type after coercion. Result trees are translated
     * to W3C Node or W3C NodeList and the translation is done
     * via node-set type.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param clazz An reference to the Class to translate to
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates a result tree into a non-synthesized boolean.
     * It does not push a 0 or a 1 but instead returns branchhandle list
     * to be appended to the false list.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of BooleanType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ObjectType type) {

    /**
     * Subsume result tree into ObjectType.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeSetType type) {

    /**
     * Expects a result tree on the stack and pushes a node-set (iterator).
     * Note that the produced iterator is an iterator for the DOM that
     * contains the result tree, and not the DOM that is currently in use.
     * This conversion here will therefore not directly work with elements
     * such as <xsl:apply-templates> and <xsl:for-each> without the DOM
     * parameter/variable being updates as well.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of NodeSetType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a result tree on the stack and pushes a boxed result tree.
     * Result trees are already boxed so the translation is just a NOP.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of ReferenceType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects an result tree on the stack and pushes a real.
     * Translates a result tree into a real by first converting it to string.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of RealType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects an result tree on the stack and pushes a string.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of StringType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Expects an result tree on the stack and pushes a boolean.
     * Translates a result tree to a boolean by first converting it to string.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of BooleanType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a result tree to object of internal type <code>type</code>.
     * The translation to int is undefined since result trees
     * are always converted to reals in arithmetic expressions.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of the type to translate the result tree to
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
public final class ResultTreeType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public String getClassName() {

    /**
     * Returns the class name of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates a result tree to a Java type denoted by <code>clazz</code>.
     * Expects a result tree on the stack and pushes an object
     * of the appropriate type after coercion. Result trees are translated
     * to W3C Node or W3C NodeList and the translation is done
     * via node-set type.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param clazz An reference to the Class to translate to
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates a result tree into a non-synthesized boolean.
     * It does not push a 0 or a 1 but instead returns branchhandle list
     * to be appended to the false list.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of BooleanType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ObjectType type) {

    /**
     * Subsume result tree into ObjectType.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeSetType type) {

    /**
     * Expects a result tree on the stack and pushes a node-set (iterator).
     * Note that the produced iterator is an iterator for the DOM that
     * contains the result tree, and not the DOM that is currently in use.
     * This conversion here will therefore not directly work with elements
     * such as <xsl:apply-templates> and <xsl:for-each> without the DOM
     * parameter/variable being updates as well.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of NodeSetType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a result tree on the stack and pushes a boxed result tree.
     * Result trees are already boxed so the translation is just a NOP.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of ReferenceType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects an result tree on the stack and pushes a real.
     * Translates a result tree into a real by first converting it to string.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of RealType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects an result tree on the stack and pushes a string.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of StringType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Expects an result tree on the stack and pushes a boolean.
     * Translates a result tree to a boolean by first converting it to string.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of BooleanType (any)
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a result tree to object of internal type <code>type</code>.
     * The translation to int is undefined since result trees
     * are always converted to reals in arithmetic expressions.
     *
     * @param classGen A BCEL class generator
     * @param methodGen A BCEL method generator
     * @param type An instance of the type to translate the result tree to
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ResultTreeType.java
public final class ResultTreeType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
