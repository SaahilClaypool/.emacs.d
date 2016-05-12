_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external (primitive) Java type into a real. Expects a java
     * object on the stack and pushes a real (i.e., a double).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            final Class clazz) {

    /**
     * Translates a real into the Java type denoted by <code>clazz</code>.
     * Expects a real on the stack and pushes a number of the appropriate
     * type after coercion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a double on the stack and pushes a boxed double. Boxed
     * double are represented by an instance of <code>java.lang.Double</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates a real into a non-synthesized boolean. It does not push a
     * 0 or a 1 but instead returns branchhandle list to be appended to the
     * false list. A NaN must be converted to "false".
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            IntType type) {

    /**
     * Expects a real on the stack and pushes a truncated integer value
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Expects a real on the stack and pushes a 0 if that number is 0.0 and
     * a 1 otherwise.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects a real on the stack and pushes its string value by calling
     * <code>Double.toString(double d)</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a real into an object of internal type <code>type</code>. The
     * translation to int is undefined since reals are never converted to ints.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public int distanceTo(Type type) {

    /**
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#distanceTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
public final class RealType extends NumberType {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external (primitive) Java type into a real. Expects a java
     * object on the stack and pushes a real (i.e., a double).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            final Class clazz) {

    /**
     * Translates a real into the Java type denoted by <code>clazz</code>.
     * Expects a real on the stack and pushes a number of the appropriate
     * type after coercion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a double on the stack and pushes a boxed double. Boxed
     * double are represented by an instance of <code>java.lang.Double</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates a real into a non-synthesized boolean. It does not push a
     * 0 or a 1 but instead returns branchhandle list to be appended to the
     * false list. A NaN must be converted to "false".
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            IntType type) {

    /**
     * Expects a real on the stack and pushes a truncated integer value
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Expects a real on the stack and pushes a 0 if that number is 0.0 and
     * a 1 otherwise.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects a real on the stack and pushes its string value by calling
     * <code>Double.toString(double d)</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a real into an object of internal type <code>type</code>. The
     * translation to int is undefined since reals are never converted to ints.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
    public int distanceTo(Type type) {

    /**
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#distanceTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/RealType.java
public final class RealType extends NumberType {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
