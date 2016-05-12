_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public String getClassName() {

    /**
     * Returns the class name of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    private void getFirstNode(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Some type conversions require gettting the first node from the node-set.
     * This function is defined to avoid code repetition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates a node-set into the Java type denoted by <code>clazz</code>.
     * Expects a node-set on the stack and pushes an object of the appropriate
     * type after coercion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a node-set on the stack and pushes a boxed node-set.
     * Node sets are already boxed so the translation is just a NOP.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates a node-set into a non-synthesized boolean. It does not
     * push a 0 or a 1 but instead returns branchhandle list to be appended
     * to the false list.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ObjectType type) {

    /**
     * Subsume node-set into ObjectType.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeType type) {

    /**
     * Expects a node-set on the stack and pushes a node.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects a node-set on the stack and pushes a real.
     * First the node-set is converted to string, and from string to real.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Translates a node-set into a string. The string value of a node-set is
     * value of its first element.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Translates a node-set into a synthesized boolean.
     * The boolean value of a node-set is "true" if non-empty
     * and "false" otherwise. Notice that the
     * function getFirstNode() is called in translateToDesynthesized().
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateFrom(ClassGenerator classGen,
        MethodGenerator methodGen, Class clazz)

    /**
     * Translates an external Java Class into an internal type.
     * Expects the Java object on the stack, pushes the internal type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a node-set into an object of internal type
     * <code>type</code>. The translation to int is undefined
     * since node-sets are always converted to
     * reals in arithmetic expressions.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
public final class NodeSetType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public String getClassName() {

    /**
     * Returns the class name of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    private void getFirstNode(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Some type conversions require gettting the first node from the node-set.
     * This function is defined to avoid code repetition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates a node-set into the Java type denoted by <code>clazz</code>.
     * Expects a node-set on the stack and pushes an object of the appropriate
     * type after coercion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a node-set on the stack and pushes a boxed node-set.
     * Node sets are already boxed so the translation is just a NOP.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates a node-set into a non-synthesized boolean. It does not
     * push a 0 or a 1 but instead returns branchhandle list to be appended
     * to the false list.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ObjectType type) {

    /**
     * Subsume node-set into ObjectType.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeType type) {

    /**
     * Expects a node-set on the stack and pushes a node.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects a node-set on the stack and pushes a real.
     * First the node-set is converted to string, and from string to real.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Translates a node-set into a string. The string value of a node-set is
     * value of its first element.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Translates a node-set into a synthesized boolean.
     * The boolean value of a node-set is "true" if non-empty
     * and "false" otherwise. Notice that the
     * function getFirstNode() is called in translateToDesynthesized().
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateFrom(ClassGenerator classGen,
        MethodGenerator methodGen, Class clazz)

    /**
     * Translates an external Java Class into an internal type.
     * Expects the Java object on the stack, pushes the internal type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a node-set into an object of internal type
     * <code>type</code>. The translation to int is undefined
     * since node-sets are always converted to
     * reals in arithmetic expressions.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/NodeSetType.java
public final class NodeSetType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
