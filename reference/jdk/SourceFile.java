_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final String getSourceFileName() {

  /**
   * @return Source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final void setSourceFileIndex(int sourcefile_index) {

  /**
   * @param sourcefile_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final int getSourceFileIndex() { return sourcefile_index; }

  /**
   * @return Index in constant pool of source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump source file attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public SourceFile(int name_index, int length, int sourcefile_index,
                    ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool to CONSTANT_Utf8, which
   * should represent the string "SourceFile".
   * @param length Content length in bytes, the value should be 2.
   * @param constant_pool The constant pool that this attribute is
   * associated with.
   * @param sourcefile_index Index in constant pool to CONSTANT_Utf8.  This
   * string will be interpreted as the name of the file from which this
   * class was compiled.  It will not be interpreted as indicating the name
   * of the directory contqining the file or an absolute path; this
   * information has to be supplied the consumer of this attribute - in
   * many cases, the JVM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  SourceFile(int name_index, int length, DataInputStream file,
             ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool to CONSTANT_Utf8
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public SourceFile(SourceFile c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
public final class SourceFile extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and represents a reference
 * to the source file of this class.  At most one SourceFile attribute
 * should appear per classfile.  The intention of this class is that it is
 * instantiated from the <em>Attribute.readAttribute()</em> method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final String getSourceFileName() {

  /**
   * @return Source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final void setSourceFileIndex(int sourcefile_index) {

  /**
   * @param sourcefile_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final int getSourceFileIndex() { return sourcefile_index; }

  /**
   * @return Index in constant pool of source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump source file attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public SourceFile(int name_index, int length, int sourcefile_index,
                    ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool to CONSTANT_Utf8, which
   * should represent the string "SourceFile".
   * @param length Content length in bytes, the value should be 2.
   * @param constant_pool The constant pool that this attribute is
   * associated with.
   * @param sourcefile_index Index in constant pool to CONSTANT_Utf8.  This
   * string will be interpreted as the name of the file from which this
   * class was compiled.  It will not be interpreted as indicating the name
   * of the directory contqining the file or an absolute path; this
   * information has to be supplied the consumer of this attribute - in
   * many cases, the JVM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  SourceFile(int name_index, int length, DataInputStream file,
             ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool to CONSTANT_Utf8
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
  public SourceFile(SourceFile c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/SourceFile.java
public final class SourceFile extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and represents a reference
 * to the source file of this class.  At most one SourceFile attribute
 * should appear per classfile.  The intention of this class is that it is
 * instantiated from the <em>Attribute.readAttribute()</em> method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
