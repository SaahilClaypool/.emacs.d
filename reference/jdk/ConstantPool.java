_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public ConstantPool copy() {

  /**
   * @return deep copy of this constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void setConstantPool(Constant[] constant_pool) {

  /**
   * @param constant_pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void setConstant(int index, Constant constant) {

  /**
   * @param constant Constant to set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public int getLength()

  /**
   * @return Length of constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public Constant[] getConstantPool() { return constant_pool;  }

  /**
   * @return Array of constants.
   * @see    Constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public Constant getConstant(int index, byte tag)

  /**
   * Get constant from constant pool and check whether it has the
   * expected type.
   *
   * @param  index Index in constant pool
   * @param  tag Tag of expected constant, i.e., its type
   * @return Constant value
   * @see    Constant
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public Constant getConstant(int index) {

  /**
   * Get constant from constant pool.
   *
   * @param  index Index in constant pool
   * @return Constant value
   * @see    Constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void dump(DataOutputStream file) throws IOException

  /**
   * Dump constant pool to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public String constantToString(int index, byte tag)

  /**
   * Retrieve constant at `index' from constant pool and resolve it to
   * a string representation.
   *
   * @param  index of constant in constant pool
   * @param  tag expected type
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public String constantToString(Constant c)

  /**
   * Resolve constant to a string representation.
   *
   * @param  constant Constant to be printed
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void accept(Visitor v) {

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  ConstantPool(DataInputStream file) throws IOException, ClassFormatException

  /**
   * Read constants from given file stream.
   *
   * @param file Input stream
   * @throws IOException
   * @throws ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public ConstantPool(Constant[] constant_pool)

  /**
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
public class ConstantPool implements Cloneable, Node, Serializable {

/**
 * This class represents the constant pool, i.e., a table of constants, of
 * a parsed classfile. It may contain null references, due to the JVM
 * specification that skips an entry after an 8-byte constant (double,
 * long) entry.  Those interested in generating constant pools
 * programatically should see <a href="../generic/ConstantPoolGen.html">
 * ConstantPoolGen</a>.

 * @see     Constant
 * @see     com.sun.org.apache.bcel.internal.generic.ConstantPoolGen
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public ConstantPool copy() {

  /**
   * @return deep copy of this constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void setConstantPool(Constant[] constant_pool) {

  /**
   * @param constant_pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void setConstant(int index, Constant constant) {

  /**
   * @param constant Constant to set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public int getLength()

  /**
   * @return Length of constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public Constant[] getConstantPool() { return constant_pool;  }

  /**
   * @return Array of constants.
   * @see    Constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public Constant getConstant(int index, byte tag)

  /**
   * Get constant from constant pool and check whether it has the
   * expected type.
   *
   * @param  index Index in constant pool
   * @param  tag Tag of expected constant, i.e., its type
   * @return Constant value
   * @see    Constant
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public Constant getConstant(int index) {

  /**
   * Get constant from constant pool.
   *
   * @param  index Index in constant pool
   * @return Constant value
   * @see    Constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void dump(DataOutputStream file) throws IOException

  /**
   * Dump constant pool to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public String constantToString(int index, byte tag)

  /**
   * Retrieve constant at `index' from constant pool and resolve it to
   * a string representation.
   *
   * @param  index of constant in constant pool
   * @param  tag expected type
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public String constantToString(Constant c)

  /**
   * Resolve constant to a string representation.
   *
   * @param  constant Constant to be printed
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public void accept(Visitor v) {

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  ConstantPool(DataInputStream file) throws IOException, ClassFormatException

  /**
   * Read constants from given file stream.
   *
   * @param file Input stream
   * @throws IOException
   * @throws ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
  public ConstantPool(Constant[] constant_pool)

  /**
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantPool.java
public class ConstantPool implements Cloneable, Node, Serializable {

/**
 * This class represents the constant pool, i.e., a table of constants, of
 * a parsed classfile. It may contain null references, due to the JVM
 * specification that skips an entry after an 8-byte constant (double,
 * long) entry.  Those interested in generating constant pools
 * programatically should see <a href="../generic/ConstantPoolGen.html">
 * ConstantPoolGen</a>.

 * @see     Constant
 * @see     com.sun.org.apache.bcel.internal.generic.ConstantPoolGen
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
