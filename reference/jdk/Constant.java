_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  static final Constant readConstant(DataInputStream file)

  /**
   * Read one constant from the given file, the type depends on a tag byte.
   *
   * @param file Input stream
   * @return Constant object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public Constant copy() {

  /**
   * @return deep copy of this constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public final byte getTag() { return tag; }

  /**
   * @return Tag of constant, i.e., its type. No setTag() method to avoid
   * confusion.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public abstract void accept(Visitor v);

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
public abstract class Constant implements Cloneable, Node, Serializable {

/**
 * Abstract superclass for classes to represent the different constant types
 * in the constant pool of a class file. The classes keep closely to
 * the JVM specification.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  static final Constant readConstant(DataInputStream file)

  /**
   * Read one constant from the given file, the type depends on a tag byte.
   *
   * @param file Input stream
   * @return Constant object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public Constant copy() {

  /**
   * @return deep copy of this constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public final byte getTag() { return tag; }

  /**
   * @return Tag of constant, i.e., its type. No setTag() method to avoid
   * confusion.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
  public abstract void accept(Visitor v);

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Constant.java
public abstract class Constant implements Cloneable, Node, Serializable {

/**
 * Abstract superclass for classes to represent the different constant types
 * in the constant pool of a class file. The classes keep closely to
 * the JVM specification.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
