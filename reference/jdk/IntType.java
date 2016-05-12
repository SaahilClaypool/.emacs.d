_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an integer into the Java type denoted by <code>clazz</code>.
     * Expects an integer on the stack and pushes a number of the appropriate
     * type after coercion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects an integer on the stack and pushes a boxed integer.
     * Boxed integers are represented by an instance of
     * <code>java.lang.Integer</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Expects an integer on the stack and translates it to a non-synthesized
     * boolean. It does not push a 0 or a 1 but instead returns branchhandle
     * list to be appended to the false list.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Expects an integer on the stack and pushes a 0 if its value is 0 and
     * a 1 otherwise.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects an integer on the stack and pushes its string value by calling
     * <code>Integer.toString(int i)</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects an integer on the stack and pushes a real.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            final Type type) {

    /**
     * Translates an integer into an object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public int distanceTo(Type type) {

    /**
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#distanceTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
public final class IntType extends NumberType {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an integer into the Java type denoted by <code>clazz</code>.
     * Expects an integer on the stack and pushes a number of the appropriate
     * type after coercion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects an integer on the stack and pushes a boxed integer.
     * Boxed integers are represented by an instance of
     * <code>java.lang.Integer</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Expects an integer on the stack and translates it to a non-synthesized
     * boolean. It does not push a 0 or a 1 but instead returns branchhandle
     * list to be appended to the false list.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Expects an integer on the stack and pushes a 0 if its value is 0 and
     * a 1 otherwise.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects an integer on the stack and pushes its string value by calling
     * <code>Integer.toString(int i)</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects an integer on the stack and pushes a real.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            final Type type) {

    /**
     * Translates an integer into an object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
    public int distanceTo(Type type) {

    /**
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#distanceTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/IntType.java
public final class IntType extends NumberType {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
