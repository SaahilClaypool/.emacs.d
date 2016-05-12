_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass[] getAllInterfaces() {

  /**
   * Get all interfaces implemented by this JavaClass (transitively).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass[] getInterfaces() {

  /**
   * Get interfaces directly implemented by this JavaClass.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass[] getSuperClasses() {

  /**
   * @return list of super classes of this class in ascending order, i.e.,
   * java.lang.Object is always the last element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass getSuperClass() {

  /**
   * @return the superclass for this JavaClass object, or null if this
   * is java.lang.Object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public boolean implementationOf(JavaClass inter) {

  /**
   * @return true, if clazz is an implementation of interface inter
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public final boolean instanceOf(JavaClass super_class) {

  /** Equivalent to runtime "instanceof" operator.
   *
   * @return true if this JavaClass is derived from teh super class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setRepository(com.sun.org.apache.bcel.internal.util.Repository repository) {

  /**
   * Sets the ClassRepository which loaded the JavaClass.
   * Should be called immediately after parsing is done.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  /**

  /********************* New repository functionality *********************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public final byte getSource() {

  /** @return returns either HEAP (generated), FILE, or ZIP
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass copy() {

  /**
   * @return deep copy of this class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String toString() {

  /**
   * @return String representing class contents.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setSuperclassNameIndex(int superclass_name_index) {

  /**
   * @param superclass_name_index .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setSuperclassName(String superclass_name) {

  /**
   * @param superclass_name .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setSourceFileName(String source_file_name) {

  /**
   * Set absolute path to file this class was read from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setMinor(int minor) {

  /**
   * @param minor .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setMethods(Method[] methods) {

  /**
   * @param methods .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setMajor(int major) {

  /**
   * @param major .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setInterfaces(int[] interfaces) {

  /**
   * @param interfaces .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setInterfaceNames(String[] interface_names) {

  /**
   * @param interface_names .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setFileName(String file_name) {

  /**
   * Set File name of class, aka SourceFile attribute value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setFields(Field[] fields) {

  /**
   * @param fields .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setClassNameIndex(int class_name_index) {

  /**
   * @param class_name_index .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setClassName(String class_name) {

  /**
   * @param class_name .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setAttributes(Attribute[] attributes) {

  /**
   * @param attributes .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int getSuperclassNameIndex() { return superclass_name_index; }

  /**
   * @return Class name index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getSuperclassName()  { return superclass_name; }

  /**
   * @return Superclass name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getSourceFileName()  { return source_file_name; }

  /**
   * @return sbsolute path to file where this class was read from
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int  getMinor()           { return minor; }

  /**
   * @return Minor number of class file version.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Method getMethod(java.lang.reflect.Method m) {

  /**
   * @return A com.sun.org.apache.bcel.internal.classfile.Method corresponding to
   * java.lang.reflect.Method if any
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Method[] getMethods()       { return methods; }

  /**
   * @return Methods of the class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int  getMajor()           { return major; }

  /**
   * @return Major number of class file version.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int[] getInterfaceIndices()     { return interfaces; }

  /**
   * @return Indices in constant pool of implemented interfaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String[] getInterfaceNames()  { return interface_names; }

  /**
   * @return Names of implemented interfaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getFileName()        { return file_name; }

  /**
   * @return File name of class, aka SourceFile attribute value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Field[] getFields()         { return fields; }

  /**
   * @return Fields, i.e., variables of the class. Like the JVM spec
   * mandates for the classfile format, these fields are those specific to
   * this class, and not those of the superclass or superinterfaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int getClassNameIndex()   { return class_name_index; }

  /**
   * @return Class name index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getPackageName()       { return package_name; }

  /**
   * @return Package name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getClassName()       { return class_name; }

  /**
   * @return Class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Attribute[] getAttributes() { return attributes; }

  /**
   * @return Attributes of the class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(DataOutputStream file) throws IOException

  /**
   * Dump Java class to output stream in binary format.
   *
   * @param file Output stream
   * @exception IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(OutputStream file) throws IOException {

  /**
   * Dump Java class to output stream in binary format.
   *
   * @param file Output stream
   * @exception IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public byte[] getBytes() {

  /**
   * @return class in binary format
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(String file_name) throws IOException

  /**
   * Dump class to a file named file_name.
   *
   * @param file_name Output file name
   * @exception IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(File file) throws IOException

  /**
   * Dump class to a file.
   *
   * @param file Output file
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass(int        class_name_index,
                   int        superclass_name_index,
                   String     file_name,
                   int        major,
                   int        minor,
                   int        access_flags,
                   ConstantPool constant_pool,
                   int[]      interfaces,
                   Field[]      fields,
                   Method[]     methods,
                   Attribute[]  attributes) {

  /**
   * Constructor gets all contents as arguments.
   *
   * @param class_name_index Class name
   * @param superclass_name_index Superclass name
   * @param file_name File name
   * @param major Major compiler version
   * @param minor Minor compiler version
   * @param access_flags Access rights defined by bit flags
   * @param constant_pool Array of constants
   * @param interfaces Implemented interfaces
   * @param fields Class fields
   * @param methods Class methods
   * @param attributes Class attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass(int        class_name_index,
                   int        superclass_name_index,
                   String     file_name,
                   int        major,
                   int        minor,
                   int        access_flags,
                   ConstantPool constant_pool,
                   int[]      interfaces,
                   Field[]      fields,
                   Method[]     methods,
                   Attribute[]  attributes,
                   byte          source)

  /**
   * Constructor gets all contents as arguments.
   *
   * @param class_name_index Index into constant pool referencing a
   * ConstantClass that represents this class.
   * @param superclass_name_index Index into constant pool referencing a
   * ConstantClass that represents this class's superclass.
   * @param file_name File name
   * @param major Major compiler version
   * @param minor Minor compiler version
   * @param access_flags Access rights defined by bit flags
   * @param constant_pool Array of constants
   * @param interfaces Implemented interfaces
   * @param fields Class fields
   * @param methods Class methods
   * @param attributes Class attributes
   * @param source Read from file or generated in memory?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  private transient com.sun.org.apache.bcel.internal.util.Repository repository =

  /**
   * In cases where we go ahead and create something,
   * use the default SyntheticRepository, because we
   * don't know any better.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
public class JavaClass extends AccessFlags implements Cloneable, Node {

/**
 * Represents a Java class, i.e., the data structures, constant pool,
 * fields, methods and commands contained in a Java .class file.
 * See <a href="ftp://java.sun.com/docs/specs/">JVM
 * specification</a> for details.

 * The intent of this class is to represent a parsed or otherwise existing
 * class file.  Those interested in programatically generating classes
 * should see the <a href="../generic/ClassGen.html">ClassGen</a> class.

 * @version $Id: JavaClass.java,v 1.4 2007-07-19 04:34:42 ofung Exp $
 * @see com.sun.org.apache.bcel.internal.generic.ClassGen
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass[] getAllInterfaces() {

  /**
   * Get all interfaces implemented by this JavaClass (transitively).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass[] getInterfaces() {

  /**
   * Get interfaces directly implemented by this JavaClass.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass[] getSuperClasses() {

  /**
   * @return list of super classes of this class in ascending order, i.e.,
   * java.lang.Object is always the last element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass getSuperClass() {

  /**
   * @return the superclass for this JavaClass object, or null if this
   * is java.lang.Object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public boolean implementationOf(JavaClass inter) {

  /**
   * @return true, if clazz is an implementation of interface inter
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public final boolean instanceOf(JavaClass super_class) {

  /** Equivalent to runtime "instanceof" operator.
   *
   * @return true if this JavaClass is derived from teh super class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setRepository(com.sun.org.apache.bcel.internal.util.Repository repository) {

  /**
   * Sets the ClassRepository which loaded the JavaClass.
   * Should be called immediately after parsing is done.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  /**

  /********************* New repository functionality *********************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public final byte getSource() {

  /** @return returns either HEAP (generated), FILE, or ZIP
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass copy() {

  /**
   * @return deep copy of this class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String toString() {

  /**
   * @return String representing class contents.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setSuperclassNameIndex(int superclass_name_index) {

  /**
   * @param superclass_name_index .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setSuperclassName(String superclass_name) {

  /**
   * @param superclass_name .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setSourceFileName(String source_file_name) {

  /**
   * Set absolute path to file this class was read from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setMinor(int minor) {

  /**
   * @param minor .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setMethods(Method[] methods) {

  /**
   * @param methods .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setMajor(int major) {

  /**
   * @param major .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setInterfaces(int[] interfaces) {

  /**
   * @param interfaces .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setInterfaceNames(String[] interface_names) {

  /**
   * @param interface_names .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setFileName(String file_name) {

  /**
   * Set File name of class, aka SourceFile attribute value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setFields(Field[] fields) {

  /**
   * @param fields .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setClassNameIndex(int class_name_index) {

  /**
   * @param class_name_index .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setClassName(String class_name) {

  /**
   * @param class_name .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void setAttributes(Attribute[] attributes) {

  /**
   * @param attributes .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int getSuperclassNameIndex() { return superclass_name_index; }

  /**
   * @return Class name index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getSuperclassName()  { return superclass_name; }

  /**
   * @return Superclass name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getSourceFileName()  { return source_file_name; }

  /**
   * @return sbsolute path to file where this class was read from
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int  getMinor()           { return minor; }

  /**
   * @return Minor number of class file version.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Method getMethod(java.lang.reflect.Method m) {

  /**
   * @return A com.sun.org.apache.bcel.internal.classfile.Method corresponding to
   * java.lang.reflect.Method if any
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Method[] getMethods()       { return methods; }

  /**
   * @return Methods of the class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int  getMajor()           { return major; }

  /**
   * @return Major number of class file version.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int[] getInterfaceIndices()     { return interfaces; }

  /**
   * @return Indices in constant pool of implemented interfaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String[] getInterfaceNames()  { return interface_names; }

  /**
   * @return Names of implemented interfaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getFileName()        { return file_name; }

  /**
   * @return File name of class, aka SourceFile attribute value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Field[] getFields()         { return fields; }

  /**
   * @return Fields, i.e., variables of the class. Like the JVM spec
   * mandates for the classfile format, these fields are those specific to
   * this class, and not those of the superclass or superinterfaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public int getClassNameIndex()   { return class_name_index; }

  /**
   * @return Class name index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getPackageName()       { return package_name; }

  /**
   * @return Package name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public String getClassName()       { return class_name; }

  /**
   * @return Class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public Attribute[] getAttributes() { return attributes; }

  /**
   * @return Attributes of the class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(DataOutputStream file) throws IOException

  /**
   * Dump Java class to output stream in binary format.
   *
   * @param file Output stream
   * @exception IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(OutputStream file) throws IOException {

  /**
   * Dump Java class to output stream in binary format.
   *
   * @param file Output stream
   * @exception IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public byte[] getBytes() {

  /**
   * @return class in binary format
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(String file_name) throws IOException

  /**
   * Dump class to a file named file_name.
   *
   * @param file_name Output file name
   * @exception IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public void dump(File file) throws IOException

  /**
   * Dump class to a file.
   *
   * @param file Output file
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass(int        class_name_index,
                   int        superclass_name_index,
                   String     file_name,
                   int        major,
                   int        minor,
                   int        access_flags,
                   ConstantPool constant_pool,
                   int[]      interfaces,
                   Field[]      fields,
                   Method[]     methods,
                   Attribute[]  attributes) {

  /**
   * Constructor gets all contents as arguments.
   *
   * @param class_name_index Class name
   * @param superclass_name_index Superclass name
   * @param file_name File name
   * @param major Major compiler version
   * @param minor Minor compiler version
   * @param access_flags Access rights defined by bit flags
   * @param constant_pool Array of constants
   * @param interfaces Implemented interfaces
   * @param fields Class fields
   * @param methods Class methods
   * @param attributes Class attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  public JavaClass(int        class_name_index,
                   int        superclass_name_index,
                   String     file_name,
                   int        major,
                   int        minor,
                   int        access_flags,
                   ConstantPool constant_pool,
                   int[]      interfaces,
                   Field[]      fields,
                   Method[]     methods,
                   Attribute[]  attributes,
                   byte          source)

  /**
   * Constructor gets all contents as arguments.
   *
   * @param class_name_index Index into constant pool referencing a
   * ConstantClass that represents this class.
   * @param superclass_name_index Index into constant pool referencing a
   * ConstantClass that represents this class's superclass.
   * @param file_name File name
   * @param major Major compiler version
   * @param minor Minor compiler version
   * @param access_flags Access rights defined by bit flags
   * @param constant_pool Array of constants
   * @param interfaces Implemented interfaces
   * @param fields Class fields
   * @param methods Class methods
   * @param attributes Class attributes
   * @param source Read from file or generated in memory?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
  private transient com.sun.org.apache.bcel.internal.util.Repository repository =

  /**
   * In cases where we go ahead and create something,
   * use the default SyntheticRepository, because we
   * don't know any better.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/JavaClass.java
public class JavaClass extends AccessFlags implements Cloneable, Node {

/**
 * Represents a Java class, i.e., the data structures, constant pool,
 * fields, methods and commands contained in a Java .class file.
 * See <a href="ftp://java.sun.com/docs/specs/">JVM
 * specification</a> for details.

 * The intent of this class is to represent a parsed or otherwise existing
 * class file.  Those interested in programatically generating classes
 * should see the <a href="../generic/ClassGen.html">ClassGen</a> class.

 * @version $Id: JavaClass.java,v 1.4 2007-07-19 04:34:42 ofung Exp $
 * @see com.sun.org.apache.bcel.internal.generic.ClassGen
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
