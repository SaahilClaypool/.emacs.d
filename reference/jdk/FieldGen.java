_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public FieldGen copy(ConstantPoolGen cp) {

  /** @return deep copy of this field
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public final String toString() {

  /**
   * Return string representation close to declaration format,
   * `public static final short MAX = 100', e.g..
   *
   * @return String representation of field
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void removeObserver(FieldObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void addObserver(FieldObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public Field getField() {

  /**
   * Get field object after having set up all necessary values.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void cancelInitValue() {

  /** Remove any initial value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void setInitValue(String str) {

  /**
   * Set (optional) initial value of field, otherwise it will be set to null/0/false
   * by the JVM automatically.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public FieldGen(Field field, ConstantPoolGen cp) {

  /**
   * Instantiate from existing field.
   *
   * @param field Field object
   * @param cp constant pool (must contain the same entries as the field's constant pool)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public FieldGen(int access_flags, Type type, String name, ConstantPoolGen cp) {

  /**
   * Declare a field. If it is static (isStatic() == true) and has a
   * basic type like int or String it may have an initial value
   * associated with it as defined by setInitValue().
   *
   * @param access_flags access qualifiers
   * @param type  field type
   * @param name field name
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
public class FieldGen extends FieldGenOrMethodGen {

/**
 * Template class for building up a field.  The only extraordinary thing
 * one can do is to add a constant value attribute to a field (which must of
 * course be compatible with to the declared type).
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Field
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public FieldGen copy(ConstantPoolGen cp) {

  /** @return deep copy of this field
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public final String toString() {

  /**
   * Return string representation close to declaration format,
   * `public static final short MAX = 100', e.g..
   *
   * @return String representation of field
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void removeObserver(FieldObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void addObserver(FieldObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public Field getField() {

  /**
   * Get field object after having set up all necessary values.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void cancelInitValue() {

  /** Remove any initial value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public void setInitValue(String str) {

  /**
   * Set (optional) initial value of field, otherwise it will be set to null/0/false
   * by the JVM automatically.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public FieldGen(Field field, ConstantPoolGen cp) {

  /**
   * Instantiate from existing field.
   *
   * @param field Field object
   * @param cp constant pool (must contain the same entries as the field's constant pool)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
  public FieldGen(int access_flags, Type type, String name, ConstantPoolGen cp) {

  /**
   * Declare a field. If it is static (isStatic() == true) and has a
   * basic type like int or String it may have an initial value
   * associated with it as defined by setInitValue().
   *
   * @param access_flags access qualifiers
   * @param type  field type
   * @param name field name
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGen.java
public class FieldGen extends FieldGenOrMethodGen {

/**
 * Template class for building up a field.  The only extraordinary thing
 * one can do is to add a constant value attribute to a field (which must of
 * course be compatible with to the declared type).
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Field
 */
