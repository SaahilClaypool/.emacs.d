_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public ReferenceType firstCommonSuperclass(ReferenceType t) {

  /**
   * This commutative operation returns the first common superclass (narrowest ReferenceType
   * referencing a class, not an interface).
   * If one of the types is a superclass of the other, the former is returned.
   * If "this" is Type.NULL, then t is returned.
   * If t is Type.NULL, then "this" is returned.
   * If "this" equals t ['this.equals(t)'] "this" is returned.
   * If "this" or t is an ArrayType, then Type.OBJECT is returned.
   * If "this" or t is a ReferenceType referencing an interface, then Type.OBJECT is returned.
   * If not all of the two classes' superclasses cannot be found, "null" is returned.
   * See the JVM specification edition 2, "4.9.2 The Bytecode Verifier".
   *
   * @deprecated use getFirstCommonSuperclass(ReferenceType t) which has
   *             slightly changed semantics.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public ReferenceType getFirstCommonSuperclass(ReferenceType t) {

  /**
   * This commutative operation returns the first common superclass (narrowest ReferenceType
   * referencing a class, not an interface).
   * If one of the types is a superclass of the other, the former is returned.
   * If "this" is Type.NULL, then t is returned.
   * If t is Type.NULL, then "this" is returned.
   * If "this" equals t ['this.equals(t)'] "this" is returned.
   * If "this" or t is an ArrayType, then Type.OBJECT is returned;
   * unless their dimensions match. Then an ArrayType of the same
   * number of dimensions is returned, with its basic type being the
   * first common super class of the basic types of "this" and t.
   * If "this" or t is a ReferenceType referencing an interface, then Type.OBJECT is returned.
   * If not all of the two classes' superclasses cannot be found, "null" is returned.
   * See the JVM specification edition 2, "4.9.2 The Bytecode Verifier".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public boolean isAssignmentCompatibleWith(Type t) {

  /**
   * Return true iff this is assignment compatible with another type t
   * as defined in the JVM specification; see the AASTORE definition
   * there.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public boolean isCastableTo(Type t) {

  /**
   * Return true iff this type is castable to another type t as defined in
   * the JVM specification.  The case where this is Type.NULL is not
   * defined (see the CHECKCAST definition in the JVM specification).
   * However, because e.g. CHECKCAST doesn't throw a
   * ClassCastException when casting a null reference to any Object,
   * true is returned in this case.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  ReferenceType() {

  /** Class is non-abstract but not instantiable from the outside
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
public abstract class ReferenceType extends Type {

/**
 * Super class for object and array types.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Expects a reference on the stack and translates it to a non-synthesized
     * boolean. It does not push a 0 or a 1 but instead returns branchhandle
     * list to be appended to the false list.
     *
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external Java type into a reference. Only conversion
     * allowed is from java.lang.Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates a reference into the Java type denoted by <code>clazz</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ObjectType type) {

    /**
     * Subsume reference into ObjectType.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ResultTreeType type) {

    /**
     * Casts a reference into a ResultTree.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeType type) {

    /**
     * Casts a reference into a Node.
     *
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeSetType type) {

    /**
     * Casts a reference into a NodeIterator.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Translates a reference to an object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Translates a reference into an object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Translates reference into object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a reference to an object of internal type <code>type</code>.
     * The translation to int is undefined since references
     * are always converted to reals in arithmetic expressions.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
public final class ReferenceType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public ReferenceType firstCommonSuperclass(ReferenceType t) {

  /**
   * This commutative operation returns the first common superclass (narrowest ReferenceType
   * referencing a class, not an interface).
   * If one of the types is a superclass of the other, the former is returned.
   * If "this" is Type.NULL, then t is returned.
   * If t is Type.NULL, then "this" is returned.
   * If "this" equals t ['this.equals(t)'] "this" is returned.
   * If "this" or t is an ArrayType, then Type.OBJECT is returned.
   * If "this" or t is a ReferenceType referencing an interface, then Type.OBJECT is returned.
   * If not all of the two classes' superclasses cannot be found, "null" is returned.
   * See the JVM specification edition 2, "4.9.2 The Bytecode Verifier".
   *
   * @deprecated use getFirstCommonSuperclass(ReferenceType t) which has
   *             slightly changed semantics.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public ReferenceType getFirstCommonSuperclass(ReferenceType t) {

  /**
   * This commutative operation returns the first common superclass (narrowest ReferenceType
   * referencing a class, not an interface).
   * If one of the types is a superclass of the other, the former is returned.
   * If "this" is Type.NULL, then t is returned.
   * If t is Type.NULL, then "this" is returned.
   * If "this" equals t ['this.equals(t)'] "this" is returned.
   * If "this" or t is an ArrayType, then Type.OBJECT is returned;
   * unless their dimensions match. Then an ArrayType of the same
   * number of dimensions is returned, with its basic type being the
   * first common super class of the basic types of "this" and t.
   * If "this" or t is a ReferenceType referencing an interface, then Type.OBJECT is returned.
   * If not all of the two classes' superclasses cannot be found, "null" is returned.
   * See the JVM specification edition 2, "4.9.2 The Bytecode Verifier".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public boolean isAssignmentCompatibleWith(Type t) {

  /**
   * Return true iff this is assignment compatible with another type t
   * as defined in the JVM specification; see the AASTORE definition
   * there.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  public boolean isCastableTo(Type t) {

  /**
   * Return true iff this type is castable to another type t as defined in
   * the JVM specification.  The case where this is Type.NULL is not
   * defined (see the CHECKCAST definition in the JVM specification).
   * However, because e.g. CHECKCAST doesn't throw a
   * ClassCastException when casting a null reference to any Object,
   * true is returned in this case.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
  ReferenceType() {

  /** Class is non-abstract but not instantiable from the outside
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ReferenceType.java
public abstract class ReferenceType extends Type {

/**
 * Super class for object and array types.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateUnBox(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its unboxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateBox(ClassGenerator classGen,
                             MethodGenerator methodGen) {

    /**
     * Translates an object of this type to its boxed representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public FlowList translateToDesynthesized(ClassGenerator classGen,
                                             MethodGenerator methodGen,
                                             BooleanType type) {

    /**
     * Expects a reference on the stack and translates it to a non-synthesized
     * boolean. It does not push a 0 or a 1 but instead returns branchhandle
     * list to be appended to the false list.
     *
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateToDesynthesized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateFrom(ClassGenerator classGen, MethodGenerator methodGen,
                              Class clazz) {

    /**
     * Translates an external Java type into a reference. Only conversion
     * allowed is from java.lang.Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates a reference into the Java type denoted by <code>clazz</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ObjectType type) {

    /**
     * Subsume reference into ObjectType.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            ResultTreeType type) {

    /**
     * Casts a reference into a ResultTree.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeType type) {

    /**
     * Casts a reference into a Node.
     *
     * @see com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            NodeSetType type) {

    /**
     * Casts a reference into a NodeIterator.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            BooleanType type) {

    /**
     * Translates a reference to an object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            RealType type) {

    /**
     * Translates a reference into an object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            StringType type) {

    /**
     * Translates reference into object of internal type <code>type</code>.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a reference to an object of internal type <code>type</code>.
     * The translation to int is undefined since references
     * are always converted to reals in arithmetic expressions.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ReferenceType.java
public final class ReferenceType extends Type {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/ReferenceType.java
public interface ReferenceType extends TypeMirror {

/**
 * Represents a reference type.
 * These include class and interface types, array types, type variables,
 * and the null type.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
