_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean accessibleTo(ObjectType accessor) {

  /**
   * Java Virtual Machine Specification edition 2, 5.4.4 Access Control
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean referencesInterface(){

  /**
   * If "this" doesn't reference an interface, it references a class
   * or a non-existant entity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean referencesClass(){

  /**
   * If "this" doesn't reference a class, it references an interface
   * or a non-existant entity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean equals(Object type) {

  /** @return true if both type objects refer to the same class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public int hashCode()  { return class_name.hashCode(); }

  /** @return a hash code value for the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public String getClassName() { return class_name; }

  /** @return name of referenced class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public ObjectType(String class_name) {

  /**
   * @param class_name fully qualified class name, e.g. java.lang.String
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
public final class ObjectType extends ReferenceType {

/**
 * Denotes reference such as java.lang.String.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public void translateFrom(ClassGenerator classGen,
                              MethodGenerator methodGen, Class clazz) {

    /**
     * Translates an external Java type into an Object type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an object of this type to the external (Java) type denoted
     * by <code>clazz</code>. This method is used to translate parameters
     * when external functions are called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a void into an object of internal type <code>type</code>.
     * This translation is needed when calling external functions
     * that return void.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public int hashCode() {

    /**
     * Must return the same value for all ObjectType instances. This is
     * needed in CastExpr to ensure the mapping table is used correctly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    protected ObjectType(String javaClassName) {

    /**
     * Used to represent a Java Class type such is required to support
     * non-static java functions.
     * @param javaClassName name of the class such as 'com.foo.Processor'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
public final class ObjectType extends Type {

/**
 * @author Todd Miller
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean accessibleTo(ObjectType accessor) {

  /**
   * Java Virtual Machine Specification edition 2, 5.4.4 Access Control
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean referencesInterface(){

  /**
   * If "this" doesn't reference an interface, it references a class
   * or a non-existant entity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean referencesClass(){

  /**
   * If "this" doesn't reference a class, it references an interface
   * or a non-existant entity.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public boolean equals(Object type) {

  /** @return true if both type objects refer to the same class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public int hashCode()  { return class_name.hashCode(); }

  /** @return a hash code value for the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public String getClassName() { return class_name; }

  /** @return name of referenced class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
  public ObjectType(String class_name) {

  /**
   * @param class_name fully qualified class name, e.g. java.lang.String
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ObjectType.java
public final class ObjectType extends ReferenceType {

/**
 * Denotes reference such as java.lang.String.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public void translateFrom(ClassGenerator classGen,
                              MethodGenerator methodGen, Class clazz) {

    /**
     * Translates an external Java type into an Object type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Class clazz) {

    /**
     * Translates an object of this type to the external (Java) type denoted
     * by <code>clazz</code>. This method is used to translate parameters
     * when external functions are called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public void translateTo(ClassGenerator classGen, MethodGenerator methodGen,
                            Type type) {

    /**
     * Translates a void into an object of internal type <code>type</code>.
     * This translation is needed when calling external functions
     * that return void.
     *
     * @see     com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type#translateTo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    public int hashCode() {

    /**
     * Must return the same value for all ObjectType instances. This is
     * needed in CastExpr to ensure the mapping table is used correctly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
    protected ObjectType(String javaClassName) {

    /**
     * Used to represent a Java Class type such is required to support
     * non-static java functions.
     * @param javaClassName name of the class such as 'com.foo.Processor'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/ObjectType.java
public final class ObjectType extends Type {

/**
 * @author Todd Miller
 * @author Santiago Pericas-Geertsen
 */
