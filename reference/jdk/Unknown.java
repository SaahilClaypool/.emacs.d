_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final void setBytes(byte[] bytes) {

  /**
   * @param bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final String getName() { return name; }

  /**
   * @return name of attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final byte[] getBytes() { return bytes; }

  /**
   * @return data bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump unknown bytes to file stream.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  Unknown(int name_index, int length, DataInputStream file,
          ConstantPool constant_pool)

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public Unknown(int name_index, int length, byte[] bytes,
                 ConstantPool constant_pool)

  /**
   * Create a non-standard attribute.
   *
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param bytes Attribute contents
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public Unknown(Unknown c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  static Unknown[] getUnknownAttributes() {

  /** @return array of unknown attributes, but just one for each kind.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
public final class Unknown extends Attribute {

/**
 * This class represents a reference to an unknown (i.e.,
 * application-specific) attribute of a class.  It is instantiated from the
 * <em>Attribute.readAttribute()</em> method.  Applications that need to
 * read in application-specific attributes should create an <a
 * href="./AttributeReader.html">AttributeReader</a> implementation and
 * attach it via <a
 * href="./Attribute.html#addAttributeReader(java.lang.String,
 * com.sun.org.apache.bcel.internal.classfile.AttributeReader)">Attribute.addAttributeReader</a>.

 *
 * @see com.sun.org.apache.bcel.internal.classfile.Attribute
 * @see com.sun.org.apache.bcel.internal.classfile.AttributeReader
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final void setBytes(byte[] bytes) {

  /**
   * @param bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final String getName() { return name; }

  /**
   * @return name of attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final byte[] getBytes() { return bytes; }

  /**
   * @return data bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump unknown bytes to file stream.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  Unknown(int name_index, int length, DataInputStream file,
          ConstantPool constant_pool)

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public Unknown(int name_index, int length, byte[] bytes,
                 ConstantPool constant_pool)

  /**
   * Create a non-standard attribute.
   *
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param bytes Attribute contents
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  public Unknown(Unknown c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
  static Unknown[] getUnknownAttributes() {

  /** @return array of unknown attributes, but just one for each kind.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Unknown.java
public final class Unknown extends Attribute {

/**
 * This class represents a reference to an unknown (i.e.,
 * application-specific) attribute of a class.  It is instantiated from the
 * <em>Attribute.readAttribute()</em> method.  Applications that need to
 * read in application-specific attributes should create an <a
 * href="./AttributeReader.html">AttributeReader</a> implementation and
 * attach it via <a
 * href="./Attribute.html#addAttributeReader(java.lang.String,
 * com.sun.org.apache.bcel.internal.classfile.AttributeReader)">Attribute.addAttributeReader</a>.

 *
 * @see com.sun.org.apache.bcel.internal.classfile.Attribute
 * @see com.sun.org.apache.bcel.internal.classfile.AttributeReader
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UNKNOWN.java
    public UNKNOWN(String s, int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>UNKNOWN</code> exception with the specified description
     * message, minor code, and completion status.
     * @param s the String containing a description message
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UNKNOWN.java
    public UNKNOWN(int minor, CompletionStatus completed) {

    /**
     * Constructs an <code>UNKNOWN</code> exception with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed the completion status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UNKNOWN.java
    public UNKNOWN(String s) {

    /**
     * Constructs an <code>UNKNOWN</code> exception with the specified description message,
     * a minor code of 0, and a completion state of COMPLETED_NO.
     * @param s the String containing a detail message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UNKNOWN.java
public final class UNKNOWN extends SystemException {

/**
 * This exception is raised if an operation implementation
 * throws a non-CORBA exception (such as an exception
 * specific to the implementation's programming language),
 * or if an operation raises a user exception that does not
 * appear in the operation's raises expression. UNKNOWN is
 * also raised if the server returns a system exception that
 * is unknown to the client. (This can happen if the server
 * uses a later version of CORBA than the client and new system
 * exceptions have been added to the later version.)<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 * <P>
 * See the section <A href="../../../../technotes/guides/idl/jidlExceptions.html#minorcodemeanings">Minor
 * Code Meanings</A> to see the minor codes for this exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/UNKNOWN.java
  public static final short value = (short)(5);

  /**
   * XXX
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableInterceptor/UNKNOWN.java


/**
* org/omg/PortableInterceptor/UNKNOWN.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, October 6, 2015 4:40:34 PM PDT
*/
