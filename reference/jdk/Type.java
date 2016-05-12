_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    Type getElementType();

    /**
     * If this type is an array type, return the element type of the
     * array. Otherwise, return null.
     *
     * @return a <code>Type</code> representing the element type or null.
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    AnnotationTypeDoc asAnnotationTypeDoc();

    /**
     * Return this type as an <code>AnnotationTypeDoc</code> if it represents
     * an annotation type.  Array dimensions are ignored.
     *
     * @return an <code>AnnotationTypeDoc</code> if the type is an annotation
     *         type, or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    AnnotatedType asAnnotatedType();

    /**
     * Returns this type as a <code>AnnotatedType</code> if it represents
     * an annotated type.
     *
     * @return a <code>AnnotatedType</code> if the type if an annotated type,
     *         or null if it is not
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    WildcardType asWildcardType();

    /**
     * Return this type as a <code>WildcardType</code> if it represents
     * a wildcard type.
     *
     * @return a <code>WildcardType</code> if the type is a wildcard type,
     *         or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    TypeVariable asTypeVariable();

    /**
     * Return this type as a <code>TypeVariable</code> if it represents
     * a type variable.  Array dimensions are ignored.
     *
     * @return a <code>TypeVariable</code> if the type is a type variable,
     *         or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    ParameterizedType asParameterizedType();

    /**
     * Return this type as a <code>ParameterizedType</code> if it represents
     * an invocation of a generic class or interface.  Array dimensions
     * are ignored.
     *
     * @return a <code>ParameterizedType</code> if the type is an
     *         invocation of a generic type, or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    ClassDoc asClassDoc();

    /**
     * Return this type as a <code>ClassDoc</code> if it represents a class
     * or interface.  Array dimensions are ignored.
     * If this type is a <code>ParameterizedType</code>,
     * <code>TypeVariable</code>, or <code>WildcardType</code>, return
     * the <code>ClassDoc</code> of the type's erasure.  If this is an
     * <code>AnnotationTypeDoc</code>, return this as a <code>ClassDoc</code>
     * (but see {@link #asAnnotationTypeDoc()}).
     * If this is a primitive type, return null.
     *
     * @return the <code>ClassDoc</code> of this type,
     *         or null if it is a primitive type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    boolean isPrimitive();

    /**
     * Return true if this type represents a primitive type.
     *
     * @return true if this type represents a primitive type.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String toString();

    /**
     * Return a string representation of the type.
     * This includes any dimension information and type arguments.
     * <p>
     * For example, a two dimensional array of String may return
     * "<code>java.lang.String[][]</code>",
     * and the parameterized type {@code List<Integer>} may return
     * "{@code java.util.List<java.lang.Integer>}".
     *
     * @return a string representation of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String dimension();

    /**
     * Return the type's dimension information, as a string.
     * <p>
     * For example, a two dimensional array of String returns
     * "<code>[][]</code>".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String simpleTypeName();

    /**
     * Return the simple name of this type excluding any dimension information.
     * This is the unqualified name of the type, except that for nested types
     * only the identifier of the innermost type is included.
     * <p>
     * For example, the class {@code Outer.Inner} returns
     * "<code>Inner</code>".
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String qualifiedTypeName();

    /**
     * Return qualified name of type excluding any dimension information.
     *<p>
     * For example, a two dimensional array of String
     * returns "<code>java.lang.String</code>".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String typeName();

    /**
     * Return unqualified name of type excluding any dimension information.
     * <p>
     * For example, a two dimensional array of String returns
     * "<code>String</code>".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
public interface Type {

/**
 * Represents a type.  A type can be a class or interface, an
 * invocation (like {@code List<String>}) of a generic class or interface,
 * a type variable, a wildcard type ("<code>?</code>"),
 * or a primitive data type (like <code>char</code>).
 *
 * @since 1.2
 * @author Kaiyang Liu (original)
 * @author Robert Field (rewrite)
 * @author Scott Seligman (generics)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static Type getType(java.lang.Class cl) {

  /** Convert runtime java.lang.Class to BCEL Type object.
   * @param cl Java class
   * @return corresponding Type object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static Type[] getArgumentTypes(String signature) {

  /**
   * Convert arguments of a method (signature) to an array of Type objects.
   * @param signature signature string such as (Ljava/lang/String;)V
   * @return array of argument types
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static Type getReturnType(String signature) {

  /**
   * Convert return value of a method (signature) to a Type object.
   *
   * @param signature signature string such as (Ljava/lang/String;)V
   * @return return type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static final Type getType(String signature)

  /**
   * Convert signature to a Type object.
   * @param signature signature string such as Ljava/lang/String;
   * @return type object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static String getMethodSignature(Type return_type, Type[] arg_types) {

  /**
   * Convert type to Java method signature, e.g. int[] f(java.lang.String x)
   * becomes (Ljava/lang/String;)[I
   *
   * @param return_type what the method returns
   * @param arg_types what are the argument types
   * @return method signature for given type(s).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public String toString() {

  /**
   * @return Type string, e.g. `int[]'
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public int getSize() {

  /**
   * @return stack size of this type (2 for long and double, 0 for void, 1 otherwise)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public byte getType() { return type; }

  /**
   * @return type as defined in Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public String getSignature() { return signature; }

  /**
   * @return signature for given type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static final BasicType     VOID         = new BasicType(Constants.T_VOID);

  /** Predefined constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
public abstract class Type implements java.io.Serializable {

/**
 * Abstract super class for all possible java types, namely basic types
 * such as int, object types like String and array types, e.g. int[]
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public String getClassName() {

    /**
     * Returns the class name of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external (Java) type denoted by <code>clazz</code> to
     * an object of this type. This method is used to translate return values
     * when external functions are called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an object of this type to the external (Java) type denoted
     * by <code>clazz</code>. This method is used to translate parameters
     * when external functions are called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates an object of this type to an non-synthesized boolean. It
     * does not push a 0 or a 1 but instead returns branchhandle list to be
     * appended to the false list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             Type type) {

    /**
     * Translates object of this type to an object of type <code>type</code>.
     * Expects an object of the former type and pushes an object of the latter
     * if not boolean. If type <code>type</code> is boolean then a branchhandle
     * list (to be appended to the false list) is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates an object of this type to an object of type
     * <code>type</code>.
     * Expects an object of the former type and pushes an object of the latter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public abstract String toSignature();

    /**
     * Returns the signature of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public int distanceTo(Type type) {

    /**
     * Returns the distance between two types. This measure is used to select
     * overloaded functions/operators. This method is typically redefined by
     * the subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public boolean isSimple() {

    /**
     * Returns true if this type is a simple type. Redefined in NumberType,
     * BooleanType and StringType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public boolean implementedAsMethod() {

    /**
     * Returns true if this type has no object representaion. Redefined in
     * ResultTreeType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public boolean isNumber() {

    /**
     * Returns true if this type is a numeric type. Redefined in NumberType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public abstract boolean identicalTo(Type other);

    /**
     * Returns true if this and other are identical types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public abstract String toString();

    /**
     * Returns a string representation of this type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public static Type newObjectType(Class clazz) {

   /**
     * Factory method to instantiate object types. Returns a pre-defined
     * instance for java.lang.Object.class and java.lang.String.class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public static Type newObjectType(String javaClassName) {

    /**
     * Factory method to instantiate object types. Returns a pre-defined
     * instance for "java.lang.Object" and "java.lang.String".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
public abstract class Type implements Constants {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    Type getElementType();

    /**
     * If this type is an array type, return the element type of the
     * array. Otherwise, return null.
     *
     * @return a <code>Type</code> representing the element type or null.
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    AnnotationTypeDoc asAnnotationTypeDoc();

    /**
     * Return this type as an <code>AnnotationTypeDoc</code> if it represents
     * an annotation type.  Array dimensions are ignored.
     *
     * @return an <code>AnnotationTypeDoc</code> if the type is an annotation
     *         type, or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    AnnotatedType asAnnotatedType();

    /**
     * Returns this type as a <code>AnnotatedType</code> if it represents
     * an annotated type.
     *
     * @return a <code>AnnotatedType</code> if the type if an annotated type,
     *         or null if it is not
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    WildcardType asWildcardType();

    /**
     * Return this type as a <code>WildcardType</code> if it represents
     * a wildcard type.
     *
     * @return a <code>WildcardType</code> if the type is a wildcard type,
     *         or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    TypeVariable asTypeVariable();

    /**
     * Return this type as a <code>TypeVariable</code> if it represents
     * a type variable.  Array dimensions are ignored.
     *
     * @return a <code>TypeVariable</code> if the type is a type variable,
     *         or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    ParameterizedType asParameterizedType();

    /**
     * Return this type as a <code>ParameterizedType</code> if it represents
     * an invocation of a generic class or interface.  Array dimensions
     * are ignored.
     *
     * @return a <code>ParameterizedType</code> if the type is an
     *         invocation of a generic type, or null if it is not.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    ClassDoc asClassDoc();

    /**
     * Return this type as a <code>ClassDoc</code> if it represents a class
     * or interface.  Array dimensions are ignored.
     * If this type is a <code>ParameterizedType</code>,
     * <code>TypeVariable</code>, or <code>WildcardType</code>, return
     * the <code>ClassDoc</code> of the type's erasure.  If this is an
     * <code>AnnotationTypeDoc</code>, return this as a <code>ClassDoc</code>
     * (but see {@link #asAnnotationTypeDoc()}).
     * If this is a primitive type, return null.
     *
     * @return the <code>ClassDoc</code> of this type,
     *         or null if it is a primitive type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    boolean isPrimitive();

    /**
     * Return true if this type represents a primitive type.
     *
     * @return true if this type represents a primitive type.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String toString();

    /**
     * Return a string representation of the type.
     * This includes any dimension information and type arguments.
     * <p>
     * For example, a two dimensional array of String may return
     * "<code>java.lang.String[][]</code>",
     * and the parameterized type {@code List<Integer>} may return
     * "{@code java.util.List<java.lang.Integer>}".
     *
     * @return a string representation of the type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String dimension();

    /**
     * Return the type's dimension information, as a string.
     * <p>
     * For example, a two dimensional array of String returns
     * "<code>[][]</code>".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String simpleTypeName();

    /**
     * Return the simple name of this type excluding any dimension information.
     * This is the unqualified name of the type, except that for nested types
     * only the identifier of the innermost type is included.
     * <p>
     * For example, the class {@code Outer.Inner} returns
     * "<code>Inner</code>".
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String qualifiedTypeName();

    /**
     * Return qualified name of type excluding any dimension information.
     *<p>
     * For example, a two dimensional array of String
     * returns "<code>java.lang.String</code>".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
    String typeName();

    /**
     * Return unqualified name of type excluding any dimension information.
     * <p>
     * For example, a two dimensional array of String returns
     * "<code>String</code>".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/Type.java
public interface Type {

/**
 * Represents a type.  A type can be a class or interface, an
 * invocation (like {@code List<String>}) of a generic class or interface,
 * a type variable, a wildcard type ("<code>?</code>"),
 * or a primitive data type (like <code>char</code>).
 *
 * @since 1.2
 * @author Kaiyang Liu (original)
 * @author Robert Field (rewrite)
 * @author Scott Seligman (generics)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static Type getType(java.lang.Class cl) {

  /** Convert runtime java.lang.Class to BCEL Type object.
   * @param cl Java class
   * @return corresponding Type object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static Type[] getArgumentTypes(String signature) {

  /**
   * Convert arguments of a method (signature) to an array of Type objects.
   * @param signature signature string such as (Ljava/lang/String;)V
   * @return array of argument types
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static Type getReturnType(String signature) {

  /**
   * Convert return value of a method (signature) to a Type object.
   *
   * @param signature signature string such as (Ljava/lang/String;)V
   * @return return type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static final Type getType(String signature)

  /**
   * Convert signature to a Type object.
   * @param signature signature string such as Ljava/lang/String;
   * @return type object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static String getMethodSignature(Type return_type, Type[] arg_types) {

  /**
   * Convert type to Java method signature, e.g. int[] f(java.lang.String x)
   * becomes (Ljava/lang/String;)[I
   *
   * @param return_type what the method returns
   * @param arg_types what are the argument types
   * @return method signature for given type(s).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public String toString() {

  /**
   * @return Type string, e.g. `int[]'
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public int getSize() {

  /**
   * @return stack size of this type (2 for long and double, 0 for void, 1 otherwise)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public byte getType() { return type; }

  /**
   * @return type as defined in Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public String getSignature() { return signature; }

  /**
   * @return signature for given type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
  public static final BasicType     VOID         = new BasicType(Constants.T_VOID);

  /** Predefined constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Type.java
public abstract class Type implements java.io.Serializable {

/**
 * Abstract super class for all possible java types, namely basic types
 * such as int, object types like String and array types, e.g. int[]
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public String getClassName() {

    /**
     * Returns the class name of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external (Java) type denoted by <code>clazz</code> to
     * an object of this type. This method is used to translate return values
     * when external functions are called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an object of this type to the external (Java) type denoted
     * by <code>clazz</code>. This method is used to translate parameters
     * when external functions are called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Translates an object of this type to an non-synthesized boolean. It
     * does not push a 0 or a 1 but instead returns branchhandle list to be
     * appended to the false list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             Type type) {

    /**
     * Translates object of this type to an object of type <code>type</code>.
     * Expects an object of the former type and pushes an object of the latter
     * if not boolean. If type <code>type</code> is boolean then a branchhandle
     * list (to be appended to the false list) is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates an object of this type to an object of type
     * <code>type</code>.
     * Expects an object of the former type and pushes an object of the latter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public abstract String toSignature();

    /**
     * Returns the signature of an internal type's external representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public int distanceTo(Type type) {

    /**
     * Returns the distance between two types. This measure is used to select
     * overloaded functions/operators. This method is typically redefined by
     * the subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public boolean isSimple() {

    /**
     * Returns true if this type is a simple type. Redefined in NumberType,
     * BooleanType and StringType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public boolean implementedAsMethod() {

    /**
     * Returns true if this type has no object representaion. Redefined in
     * ResultTreeType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public boolean isNumber() {

    /**
     * Returns true if this type is a numeric type. Redefined in NumberType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public abstract boolean identicalTo(Type other);

    /**
     * Returns true if this and other are identical types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public abstract String toString();

    /**
     * Returns a string representation of this type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public static Type newObjectType(Class clazz) {

   /**
     * Factory method to instantiate object types. Returns a pre-defined
     * instance for java.lang.Object.class and java.lang.String.class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
    public static Type newObjectType(String javaClassName) {

    /**
     * Factory method to instantiate object types. Returns a pre-defined
     * instance for "java.lang.Object" and "java.lang.String".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Type.java
public abstract class Type implements Constants {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/Type.java
public interface Type {

/**
 * Type is the common superinterface for all types in the Java
 * programming language. These include raw types, parameterized types,
 * array types, type variables and primitive types.
 *
 * @since 1.5
 */
