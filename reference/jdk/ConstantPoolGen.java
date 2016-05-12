_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addConstant(Constant c, ConstantPoolGen cp) {

  /** Import constant from another ConstantPool and return new index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPool getFinalConstantPool() {

  /**
   * @return constant pool with proper length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int getSize() {

  /**
   * @return current size of constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPool getConstantPool() {

  /**
   * @return intermediate constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public void setConstant(int i, Constant c) { constants[i] = c; }

  /**
   * Use with care!
   *
   * @param i index in constant pool
   * @param c new constant pool entry at index i
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public Constant getConstant(int i) { return constants[i]; }

  /**
   * @param i index in constant pool
   * @return constant pool entry at index i
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addFieldref(String class_name, String field_name, String signature) {

  /**
   * Add a new Fieldref constant to the ConstantPool, if it is not already
   * in there.
   *
   * @param n Fieldref string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupFieldref(String class_name, String field_name, String signature) {

  /**
   * Look for ConstantFieldref in ConstantPool.
   *
   * @param class_name Where to find method
   * @param field_name Guess what
   * @param signature return and argument types
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addInterfaceMethodref(String class_name, String method_name, String signature) {

  /**
   * Add a new InterfaceMethodref constant to the ConstantPool, if it is not already
   * in there.
   *
   * @param n InterfaceMethodref string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupInterfaceMethodref(String class_name, String method_name, String signature) {

  /**
   * Look for ConstantInterfaceMethodref in ConstantPool.
   *
   * @param class_name Where to find method
   * @param method_name Guess what
   * @param signature return and argument types
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addMethodref(String class_name, String method_name, String signature) {

  /**
   * Add a new Methodref constant to the ConstantPool, if it is not already
   * in there.
   *
   * @param n Methodref string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupMethodref(String class_name, String method_name, String signature) {

  /**
   * Look for ConstantMethodref in ConstantPool.
   *
   * @param class_name Where to find method
   * @param method_name Guess what
   * @param signature return and argument types
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addNameAndType(String name, String signature) {

  /**
   * Add a new NameAndType constant to the ConstantPool if it is not already
   * in there.
   *
   * @param n NameAndType string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupNameAndType(String name, String signature) {

  /**
   * Look for ConstantNameAndType in ConstantPool.
   *
   * @param name of variable/method
   * @param signature of variable/method
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addDouble(double n) {

  /**
   * Add a new double constant to the ConstantPool, if it is not already in there.
   *
   * @param n Double number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupDouble(double n) {

  /**
   * Look for ConstantDouble in ConstantPool.
   *
   * @param n Double number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addLong(long n) {

  /**
   * Add a new long constant to the ConstantPool, if it is not already in there.
   *
   * @param n Long number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupLong(long n) {

  /**
   * Look for ConstantLong in ConstantPool.
   *
   * @param n Long number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addUtf8(String n) {

  /**
   * Add a new Utf8 constant to the ConstantPool, if it is not already in there.
   *
   * @param n Utf8 string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupUtf8(String n) {

  /**
   * Look for ConstantUtf8 in ConstantPool.
   *
   * @param n Utf8 string to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addFloat(float n) {

  /**
   * Add a new Float constant to the ConstantPool, if it is not already in there.
   *
   * @param n Float number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupFloat(float n) {

  /**
   * Look for ConstantFloat in ConstantPool.
   *
   * @param n Float number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addInteger(int n) {

  /**
   * Add a new Integer constant to the ConstantPool, if it is not already in there.
   *
   * @param n integer number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupInteger(int n) {

  /**
   * Look for ConstantInteger in ConstantPool.
   *
   * @param n integer number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addArrayClass(ArrayType type) {

  /**
   * Add a reference to an array class (e.g. String[][]) as needed by MULTIANEWARRAY
   * instruction, e.g. to the ConstantPool.
   *
   * @param type type of array class
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addClass(ObjectType type) {

  /**
   * Add a new Class reference to the ConstantPool for a given type.
   *
   * @param str Class to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addClass(String str) {

  /**
   * Add a new Class reference to the ConstantPool, if it is not already in there.
   *
   * @param str Class to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupClass(String str) {

  /**
   * Look for ConstantClass in ConstantPool named `str'.
   *
   * @param str String to search for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addString(String str) {

  /**
   * Add a new String constant to the ConstantPool, if it is not already in there.
   *
   * @param str String to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupString(String str) {

  /**
   * Look for ConstantString in ConstantPool containing String `str'.
   *
   * @param str String to search for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  protected void adjustSize() {

  /** Resize internal array of constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPoolGen() {}

  /**
   * Create empty constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPoolGen(ConstantPool cp) {

  /**
   * Initialize with given constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPoolGen(Constant[] cs) {

  /**
   * Initialize with given array of constants.
   *
   * @param c array of given constants, new ones will be appended
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
public class ConstantPoolGen implements java.io.Serializable {

/**
 * This class is used to build up a constant pool. The user adds
 * constants via `addXXX' methods, `addString', `addClass',
 * etc.. These methods return an index into the constant
 * pool. Finally, `getFinalConstantPool()' returns the constant pool
 * built up. Intermediate versions of the constant pool can be
 * obtained with `getConstantPool()'. A constant pool has capacity for
 * Constants.MAX_SHORT entries. Note that the first (0) is used by the
 * JVM and that Double and Long constants need two slots.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Constant
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addConstant(Constant c, ConstantPoolGen cp) {

  /** Import constant from another ConstantPool and return new index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPool getFinalConstantPool() {

  /**
   * @return constant pool with proper length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int getSize() {

  /**
   * @return current size of constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPool getConstantPool() {

  /**
   * @return intermediate constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public void setConstant(int i, Constant c) { constants[i] = c; }

  /**
   * Use with care!
   *
   * @param i index in constant pool
   * @param c new constant pool entry at index i
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public Constant getConstant(int i) { return constants[i]; }

  /**
   * @param i index in constant pool
   * @return constant pool entry at index i
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addFieldref(String class_name, String field_name, String signature) {

  /**
   * Add a new Fieldref constant to the ConstantPool, if it is not already
   * in there.
   *
   * @param n Fieldref string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupFieldref(String class_name, String field_name, String signature) {

  /**
   * Look for ConstantFieldref in ConstantPool.
   *
   * @param class_name Where to find method
   * @param field_name Guess what
   * @param signature return and argument types
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addInterfaceMethodref(String class_name, String method_name, String signature) {

  /**
   * Add a new InterfaceMethodref constant to the ConstantPool, if it is not already
   * in there.
   *
   * @param n InterfaceMethodref string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupInterfaceMethodref(String class_name, String method_name, String signature) {

  /**
   * Look for ConstantInterfaceMethodref in ConstantPool.
   *
   * @param class_name Where to find method
   * @param method_name Guess what
   * @param signature return and argument types
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addMethodref(String class_name, String method_name, String signature) {

  /**
   * Add a new Methodref constant to the ConstantPool, if it is not already
   * in there.
   *
   * @param n Methodref string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupMethodref(String class_name, String method_name, String signature) {

  /**
   * Look for ConstantMethodref in ConstantPool.
   *
   * @param class_name Where to find method
   * @param method_name Guess what
   * @param signature return and argument types
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addNameAndType(String name, String signature) {

  /**
   * Add a new NameAndType constant to the ConstantPool if it is not already
   * in there.
   *
   * @param n NameAndType string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupNameAndType(String name, String signature) {

  /**
   * Look for ConstantNameAndType in ConstantPool.
   *
   * @param name of variable/method
   * @param signature of variable/method
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addDouble(double n) {

  /**
   * Add a new double constant to the ConstantPool, if it is not already in there.
   *
   * @param n Double number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupDouble(double n) {

  /**
   * Look for ConstantDouble in ConstantPool.
   *
   * @param n Double number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addLong(long n) {

  /**
   * Add a new long constant to the ConstantPool, if it is not already in there.
   *
   * @param n Long number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupLong(long n) {

  /**
   * Look for ConstantLong in ConstantPool.
   *
   * @param n Long number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addUtf8(String n) {

  /**
   * Add a new Utf8 constant to the ConstantPool, if it is not already in there.
   *
   * @param n Utf8 string to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupUtf8(String n) {

  /**
   * Look for ConstantUtf8 in ConstantPool.
   *
   * @param n Utf8 string to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addFloat(float n) {

  /**
   * Add a new Float constant to the ConstantPool, if it is not already in there.
   *
   * @param n Float number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupFloat(float n) {

  /**
   * Look for ConstantFloat in ConstantPool.
   *
   * @param n Float number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addInteger(int n) {

  /**
   * Add a new Integer constant to the ConstantPool, if it is not already in there.
   *
   * @param n integer number to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupInteger(int n) {

  /**
   * Look for ConstantInteger in ConstantPool.
   *
   * @param n integer number to look for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addArrayClass(ArrayType type) {

  /**
   * Add a reference to an array class (e.g. String[][]) as needed by MULTIANEWARRAY
   * instruction, e.g. to the ConstantPool.
   *
   * @param type type of array class
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addClass(ObjectType type) {

  /**
   * Add a new Class reference to the ConstantPool for a given type.
   *
   * @param str Class to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addClass(String str) {

  /**
   * Add a new Class reference to the ConstantPool, if it is not already in there.
   *
   * @param str Class to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupClass(String str) {

  /**
   * Look for ConstantClass in ConstantPool named `str'.
   *
   * @param str String to search for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int addString(String str) {

  /**
   * Add a new String constant to the ConstantPool, if it is not already in there.
   *
   * @param str String to add
   * @return index of entry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public int lookupString(String str) {

  /**
   * Look for ConstantString in ConstantPool containing String `str'.
   *
   * @param str String to search for
   * @return index on success, -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  protected void adjustSize() {

  /** Resize internal array of constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPoolGen() {}

  /**
   * Create empty constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPoolGen(ConstantPool cp) {

  /**
   * Initialize with given constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
  public ConstantPoolGen(Constant[] cs) {

  /**
   * Initialize with given array of constants.
   *
   * @param c array of given constants, new ones will be appended
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/ConstantPoolGen.java
public class ConstantPoolGen implements java.io.Serializable {

/**
 * This class is used to build up a constant pool. The user adds
 * constants via `addXXX' methods, `addString', `addClass',
 * etc.. These methods return an index into the constant
 * pool. Finally, `getFinalConstantPool()' returns the constant pool
 * built up. Intermediate versions of the constant pool can be
 * obtained with `getConstantPool()'. A constant pool has capacity for
 * Constants.MAX_SHORT entries. Note that the first (0) is used by the
 * JVM and that Double and Long constants need two slots.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Constant
 */
