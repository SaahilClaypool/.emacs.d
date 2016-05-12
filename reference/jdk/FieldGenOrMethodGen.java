_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public abstract String  getSignature();

  /** @return signature of method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public Attribute[] getAttributes() {

  /**
   * @return all attributes of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public void removeAttributes() { attribute_vec.clear(); }

  /**
   * Remove all attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public void removeAttribute(Attribute a) { attribute_vec.remove(a); }

  /**
   * Remove an attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public void addAttribute(Attribute a) { attribute_vec.add(a); }

  /**
   * Add an attribute to this method. Currently, the JVM knows about
   * the `Code', `ConstantValue', `Synthetic' and `Exceptions'
   * attributes. Other attributes will be ignored by the JVM but do no
   * harm.
   *
   * @param a attribute to be added
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public String          getName()            { return name; }

  /** @return name of method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
public abstract class FieldGenOrMethodGen extends AccessFlags

/**
 * Super class for FieldGen and MethodGen objects, since they have
 * some methods in common!
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public abstract String  getSignature();

  /** @return signature of method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public Attribute[] getAttributes() {

  /**
   * @return all attributes of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public void removeAttributes() { attribute_vec.clear(); }

  /**
   * Remove all attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public void removeAttribute(Attribute a) { attribute_vec.remove(a); }

  /**
   * Remove an attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public void addAttribute(Attribute a) { attribute_vec.add(a); }

  /**
   * Add an attribute to this method. Currently, the JVM knows about
   * the `Code', `ConstantValue', `Synthetic' and `Exceptions'
   * attributes. Other attributes will be ignored by the JVM but do no
   * harm.
   *
   * @param a attribute to be added
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
  public String          getName()            { return name; }

  /** @return name of method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldGenOrMethodGen.java
public abstract class FieldGenOrMethodGen extends AccessFlags

/**
 * Super class for FieldGen and MethodGen objects, since they have
 * some methods in common!
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
