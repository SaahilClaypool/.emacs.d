_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external (Java) boolean into internal boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an internal boolean into an external (Java) boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a boolean on the stack and pushes a boxed boolean.
     * Boxed booleans are represented by an instance of
     * <code>java.lang.Boolean</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects a boolean on the stack and pushes a real. The value "true" is
     * converted to 1.0 and the value "false" to 0.0.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects a boolean on the stack and pushes a string. If the value on the
     * stack is zero, then the string 'false' is pushed. Otherwise, the string
     * 'true' is pushed.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a real into an object of internal type <code>type</code>. The
     * translation to int is undefined since booleans are always converted to
     * reals in arithmetic expressions.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
public final class BooleanType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external (Java) boolean into internal boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an internal boolean into an external (Java) boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ReferenceType type) {

    /**
     * Expects a boolean on the stack and pushes a boxed boolean.
     * Boxed booleans are represented by an instance of
     * <code>java.lang.Boolean</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Expects a boolean on the stack and pushes a real. The value "true" is
     * converted to 1.0 and the value "false" to 0.0.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Expects a boolean on the stack and pushes a string. If the value on the
     * stack is zero, then the string 'false' is pushed. Otherwise, the string
     * 'true' is pushed.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a real into an object of internal type <code>type</code>. The
     * translation to int is undefined since booleans are always converted to
     * reals in arithmetic expressions.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/BooleanType.java
public final class BooleanType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
