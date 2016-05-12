_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static void validateGIOPVersion( IIOPEndpointInfo endpointInfo ) {

    /**
     * If GIOP Version is not correct, This method throws a BAD_PARAM
     * Exception.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static int hexOf( char x )

    /**
     *  Converts an Ascii Character into Hexadecimal digit
     *  NOTE: THIS METHOD IS DUPLICATED TO DELIVER NAMING AS A SEPARATE
     *  COMPONENT TO RI.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static String cleanEscapes( String stringToDecode ) {

    /**
     * cleanEscapes removes URL escapes as per IETF 2386 RFP.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
class Utility {

/**
 *  Utility methods for Naming.
 *
 *  @Author Hemanth
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    static int hexOf( char x )

    /** Converts an Ascii Character into Hexadecimal digit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static Object readAbstractAndNarrow(
        org.omg.CORBA_2_3.portable.InputStream in, Class narrowTo)

    /**
     * Read an abstract interface type from the input stream and narrow
     * it to the desired type.
     * @param in the stream to read from.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static Object readObjectAndNarrow(InputStream in,
                                             Class narrowTo)

    /**
     * Read an object reference from the input stream and narrow
     * it to the desired type.
     * @param in the stream to read from.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static String idlStubName(String className)

    /**
     * Create an IDL stub name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static void throwNotSerializableForCorba(String className) {

    /**
     * Throws the CORBA equivalent of a java.io.NotSerializableException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static String tieName (String className)

    /**
     * Create an RMI tie name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static String stubName (String className)

    /**
     * Create an RMI stub name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static ValueFactory getFactory(Class clazz, String codebase,
                               ORB orb, String repId)

    /**
     * Get the factory for an IDLValue
     *
     * Throws MARSHAL exception if no factory found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static BoxedValueHelper getHelper(Class clazz, String codebase,
        String repId)

    /**
     * Get the helper for an IDLValue
     *
     * Throws MARSHAL exception if no helper found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static Object autoConnect(Object obj, ORB orb, boolean convertToStub)

    /**
     * Ensure that stubs, ties, and implementation objects
     * are 'connected' to the runtime. Converts implementation
     * objects to a type suitable for sending on the wire.
     * @param obj the object to connect.
     * @param orb the ORB to connect to if obj is exported to IIOP.
     * @param convertToStub true if implementation types should be
     * converted to Stubs rather than just org.omg.CORBA.Object.
     * @return the connected object.
     * @exception NoSuchObjectException if obj is an implementation
     * which has not been exported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
public final class Utility {

/**
 *  Handy class full of static functions.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String convertString(String label) {

  /**
   * Escape all occurences of newline chars '\n', quotes \", etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  private static class JavaWriter extends FilterWriter {

  /** Encode bytes into valid java identifier characters.
   * Used by <a href="Utility.html#encode(byte[], boolean)">encode()</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  private static class JavaReader extends FilterReader {

  /** Decode characters into bytes.
   * Used by <a href="Utility.html#decode(java.lang.String, boolean)">decode()</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static byte[] decode(String s, boolean uncompress) throws IOException {

  /** Decode a string back to a byte array.
   *
   * @param bytes the byte array to convert
   * @param uncompress use gzip to uncompress the stream of bytes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static String encode(byte[] bytes, boolean compress) throws IOException {

  /** Encode byte array it into Java identifier string, i.e., a string
   * that only contains the following characters: (a, ... z, A, ... Z,
   * 0, ... 9, _, $).  The encoding algorithm itself is not too
   * clever: if the current byte's ASCII value already is a valid Java
   * identifier part, leave it as it is. Otherwise it writes the
   * escape character($) followed by <p><ul><li> the ASCII value as a
   * hexadecimal string, if the value is not in the range
   * 200..247</li> <li>a Java identifier char not used in a lowercase
   * hexadecimal string, if the value is in the range
   * 200..247</li><ul></p>
   *
   * <p>This operation inflates the original byte array by roughly 40-50%</p>
   *
   * @param bytes the byte array to convert
   * @param compress use gzip to minimize string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static boolean isJavaIdentifierPart(char ch) {

  /** @return true, if character is one of (a, ... z, A, ... Z, 0, ... 9, _)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String fillup(String str, int length, boolean left_justify, char fill) {

  /**
   * Fillup char with up to length characters with char `fill' and justify it left or right.
   *
   * @param str string to format
   * @param length length of desired string
   * @param left_justify format left or right
   * @param fill fill character
   * @return formatted string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String format(int i, int length, boolean left_justify, char fill) {

  /**
   * Return a string for an integer justified left or right and filled up with
   * `fill' characters if necessary.
   *
   * @param i integer to format
   * @param length length of desired string
   * @param left_justify format left or right
   * @param fill fill character
   * @return formatted int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String toHexString(byte[] bytes) {

  /** Convert bytes into hexidecimal string
   *
   * @return bytes as hexidecimal string, e.g. 00 FA 12 ...
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  private static final short byteToShort(byte b) {

  /**
   * Convert (signed) byte to (unsigned) short value, i.e., all negative
   * values become positive.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static short searchOpcode(String name) {

  /** Map opcode names to opcode numbers. E.g., return Constants.ALOAD for "aload"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final byte typeOfSignature(String signature)

  /**
   * Return type of signature as a byte value as defined in <em>Constants</em>
   *
   * @param  signature in format described above
   * @return type of signature
   * @see    Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final byte typeOfMethodSignature(String signature)

  /**
   * Return type of method signature as a byte value as defined in <em>Constants</em>
   *
   * @param  signature in format described above
   * @return type of method signature
   * @see    Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static String getSignature(String type) {

  /** Parse Java type such as "char", or "java.lang.String[]" and return the
   * signature in byte code format, e.g. "C" or "[Ljava/lang/String;" respectively.
   *
   * @param  type Java type
   * @return byte code signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String signatureToString(String signature,
                                               boolean chopit)

  /**
   * The field signature represents the value of an argument to a function or
   * the value of a variable. It is a series of bytes generated by the
   * following grammar:
   *
   * <PRE>
   * <field_signature> ::= <field_type>
   * <field_type>      ::= <base_type>|<object_type>|<array_type>
   * <base_type>       ::= B|C|D|F|I|J|S|Z
   * <object_type>     ::= L<fullclassname>;
   * <array_type>      ::= [<field_type>
   *
   * The meaning of the base types is as follows:
   * B byte signed byte
   * C char character
   * D double double precision IEEE float
   * F float single precision IEEE float
   * I int integer
   * J long long integer
   * L<fullclassname>; ... an object of the given class
   * S short signed short
   * Z boolean true or false
   * [<field sig> ... array
   * </PRE>
   *
   * This method converts this string into a Java type declaration such as
   * `String[]' and throws a `ClassFormatException' when the parsed type is
   * invalid.
   *
   * @param  signature  Class signature
   * @param chopit Flag that determines whether chopping is executed or not
   * @return Java type declaration
   * @throws ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String signatureToString(String signature) {

  /**
   * Converts signature to string with all class names compacted.
   *
   * @param signature to convert
   * @return Human readable signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String replace(String str, String old, String new_) {

  /**
   * Replace all occurences of <em>old</em> in <em>str</em> with <em>new</em>.
   *
   * @param str String to permute
   * @param old String to be replaced
   * @param new Replacement string
   * @return new String object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureToString(String signature,
                                                     String name,
                                                     String access,
                                                     boolean chopit,
                                                     LocalVariableTable vars)

  /**
   * A return type signature represents the return value from a method.
   * It is a series of bytes in the following grammar:
   *
   * <return_signature> ::= <field_type> | V
   *
   * The character V indicates that the method returns no value. Otherwise, the
   * signature indicates the type of the return value.
   * An argument signature represents an argument passed to a method:
   *
   * <argument_signature> ::= <field_type>
   *
   * A method signature represents the arguments that the method expects, and
   * the value that it returns.
   * <method_signature> ::= (<arguments_signature>) <return_signature>
   * <arguments_signature>::= <argument_signature>*
   *
   * This method converts such a string into a Java type declaration like
   * `void _main(String[])' and throws a `ClassFormatException' when the parsed
   * type is invalid.
   *
   * @param  signature    Method signature
   * @param  name         Method name
   * @param  access       Method access rights
   * @return Java type declaration
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureToString(String signature,
                                                     String name,
                                                     String access) {

  /**
   * Converts method signature to string with all class names compacted.
   *
   * @param signature to convert
   * @param name of method
   * @param access flags of method
   * @return Human readable signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureReturnType(String signature,
                                                       boolean chopit)

  /**
   * @param  signature    Method signature
   * @param chopit Shorten class names ?
   * @return return type of method
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureReturnType(String signature)

  /**
   * @param  signature    Method signature
   * @return return type of method
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String[] methodSignatureArgumentTypes(String signature,
                                                            boolean chopit)

  /**
   * @param  signature    Method signature
   * @param chopit Shorten class names ?
   * @return Array of argument types
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String[] methodSignatureArgumentTypes(String signature)

  /**
   * @param  signature    Method signature
   * @return Array of argument types
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public final static String methodTypeToSignature(String ret, String[] argv)

  /**
   * Converts string containing the method return and argument types
   * to a byte code method signature.
   *
   * @param  ret Return type of method
   * @param  argv Types of method arguments
   * @return Byte code representation of method signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final boolean isSet(int flag, int i) {

  /**
   * @return true, if bit `i' in `flag' is set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final int clearBit(int flag, int i) {

  /**
   * @return `flag' with bit `i' set to 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final int setBit(int flag, int i) {

  /**
   * @return `flag' with bit `i' set to 1
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String compactClassName(String str, boolean chopit) {

  /**
   * Shorten long class names, <em>java/lang/String</em> becomes
   * <em>java.lang.String</em>,
   * e.g.. If <em>chopit</em> is <em>true</em> the prefix <em>java.lang</em>
   * is also removed.
   *
   * @param str The long class name
   * @param chopit Flag that determines whether chopping is executed or not
   * @return Compacted class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String compactClassName(String str,
                                              String prefix,
                                              boolean chopit)

  /**
   * Shorten long class name <em>str</em>, i.e., chop off the <em>prefix</em>,
   * if the
   * class name starts with this string and the flag <em>chopit</em> is true.
   * Slashes <em>/</em> are converted to dots <em>.</em>.
   *
   * @param str The long class name
   * @param prefix The prefix the get rid off
   * @param chopit Flag that determines whether chopping is executed or not
   * @return Compacted class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String compactClassName(String str) {

  /**
   * Shorten long class names, <em>java/lang/String</em> becomes
   * <em>String</em>.
   *
   * @param str The long class name
   * @return Compacted class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String codeToString(ByteSequence bytes,
                                          ConstantPool constant_pool, boolean verbose)

  /**
   * Disassemble a stream of byte codes and return the
   * string representation.
   *
   * @param  bytes stream of bytes
   * @param  constant_pool Array of constants
   * @param  verbose be verbose, e.g. print constant pool index
   * @return String representation of byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String codeToString(byte[] code,
                                          ConstantPool constant_pool,
                                          int index, int length, boolean verbose)

  /**
   * Disassemble a byte array of JVM byte codes starting from code line
   * `index' and return the disassembled string representation. Decode only
   * `num' opcodes (including their operands), use -1 if you want to
   * decompile everything.
   *
   * @param  code byte code array
   * @param  constant_pool Array of constants
   * @param  index offset in `code' array
   * <EM>(number of opcodes, not bytes!)</EM>
   * @param  length number of opcodes to decompile, -1 for all
   * @param  verbose be verbose, e.g. print constant pool index
   * @return String representation of byte codes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String classOrInterface(int access_flags) {

  /**
   * @return "class" or "interface", depending on the ACC_INTERFACE flag
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String accessToString(int access_flags,
                                            boolean for_class)

  /**
   * Convert bit field of flags into string such as `static final'.
   *
   * Special case: Classes compiled with new compilers and with the
   * `ACC_SUPER' flag would be said to be "synchronized". This is
   * because SUN used the same value for the flags `ACC_SUPER' and
   * `ACC_SYNCHRONIZED'.
   *
   * @param  access_flags Access flags
   * @param  for_class access flags are for class qualifiers ?
   * @return String representation of flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String accessToString(int access_flags) {

  /**
   * Convert bit field of flags into string such as `static final'.
   *
   * @param  access_flags Access flags
   * @return String representation of flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
public abstract class Utility {

/**
 * Utility functions that do not really belong to any class in particular.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static void validateGIOPVersion( IIOPEndpointInfo endpointInfo ) {

    /**
     * If GIOP Version is not correct, This method throws a BAD_PARAM
     * Exception.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static int hexOf( char x )

    /**
     *  Converts an Ascii Character into Hexadecimal digit
     *  NOTE: THIS METHOD IS DUPLICATED TO DELIVER NAMING AS A SEPARATE
     *  COMPONENT TO RI.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static String cleanEscapes( String stringToDecode ) {

    /**
     * cleanEscapes removes URL escapes as per IETF 2386 RFP.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/Utility.java
class Utility {

/**
 *  Utility methods for Naming.
 *
 *  @Author Hemanth
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    static int hexOf( char x )

    /** Converts an Ascii Character into Hexadecimal digit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static Object readAbstractAndNarrow(
        org.omg.CORBA_2_3.portable.InputStream in, Class narrowTo)

    /**
     * Read an abstract interface type from the input stream and narrow
     * it to the desired type.
     * @param in the stream to read from.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static Object readObjectAndNarrow(InputStream in,
                                             Class narrowTo)

    /**
     * Read an object reference from the input stream and narrow
     * it to the desired type.
     * @param in the stream to read from.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static String idlStubName(String className)

    /**
     * Create an IDL stub name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static void throwNotSerializableForCorba(String className) {

    /**
     * Throws the CORBA equivalent of a java.io.NotSerializableException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static String tieName (String className)

    /**
     * Create an RMI tie name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static String stubName (String className)

    /**
     * Create an RMI stub name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static ValueFactory getFactory(Class clazz, String codebase,
                               ORB orb, String repId)

    /**
     * Get the factory for an IDLValue
     *
     * Throws MARSHAL exception if no factory found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static BoxedValueHelper getHelper(Class clazz, String codebase,
        String repId)

    /**
     * Get the helper for an IDLValue
     *
     * Throws MARSHAL exception if no helper found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
    public static Object autoConnect(Object obj, ORB orb, boolean convertToStub)

    /**
     * Ensure that stubs, ties, and implementation objects
     * are 'connected' to the runtime. Converts implementation
     * objects to a type suitable for sending on the wire.
     * @param obj the object to connect.
     * @param orb the ORB to connect to if obj is exported to IIOP.
     * @param convertToStub true if implementation types should be
     * converted to Stubs rather than just org.omg.CORBA.Object.
     * @return the connected object.
     * @exception NoSuchObjectException if obj is an implementation
     * which has not been exported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/util/Utility.java
public final class Utility {

/**
 *  Handy class full of static functions.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String convertString(String label) {

  /**
   * Escape all occurences of newline chars '\n', quotes \", etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  private static class JavaWriter extends FilterWriter {

  /** Encode bytes into valid java identifier characters.
   * Used by <a href="Utility.html#encode(byte[], boolean)">encode()</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  private static class JavaReader extends FilterReader {

  /** Decode characters into bytes.
   * Used by <a href="Utility.html#decode(java.lang.String, boolean)">decode()</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static byte[] decode(String s, boolean uncompress) throws IOException {

  /** Decode a string back to a byte array.
   *
   * @param bytes the byte array to convert
   * @param uncompress use gzip to uncompress the stream of bytes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static String encode(byte[] bytes, boolean compress) throws IOException {

  /** Encode byte array it into Java identifier string, i.e., a string
   * that only contains the following characters: (a, ... z, A, ... Z,
   * 0, ... 9, _, $).  The encoding algorithm itself is not too
   * clever: if the current byte's ASCII value already is a valid Java
   * identifier part, leave it as it is. Otherwise it writes the
   * escape character($) followed by <p><ul><li> the ASCII value as a
   * hexadecimal string, if the value is not in the range
   * 200..247</li> <li>a Java identifier char not used in a lowercase
   * hexadecimal string, if the value is in the range
   * 200..247</li><ul></p>
   *
   * <p>This operation inflates the original byte array by roughly 40-50%</p>
   *
   * @param bytes the byte array to convert
   * @param compress use gzip to minimize string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static boolean isJavaIdentifierPart(char ch) {

  /** @return true, if character is one of (a, ... z, A, ... Z, 0, ... 9, _)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String fillup(String str, int length, boolean left_justify, char fill) {

  /**
   * Fillup char with up to length characters with char `fill' and justify it left or right.
   *
   * @param str string to format
   * @param length length of desired string
   * @param left_justify format left or right
   * @param fill fill character
   * @return formatted string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String format(int i, int length, boolean left_justify, char fill) {

  /**
   * Return a string for an integer justified left or right and filled up with
   * `fill' characters if necessary.
   *
   * @param i integer to format
   * @param length length of desired string
   * @param left_justify format left or right
   * @param fill fill character
   * @return formatted int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String toHexString(byte[] bytes) {

  /** Convert bytes into hexidecimal string
   *
   * @return bytes as hexidecimal string, e.g. 00 FA 12 ...
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  private static final short byteToShort(byte b) {

  /**
   * Convert (signed) byte to (unsigned) short value, i.e., all negative
   * values become positive.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static short searchOpcode(String name) {

  /** Map opcode names to opcode numbers. E.g., return Constants.ALOAD for "aload"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final byte typeOfSignature(String signature)

  /**
   * Return type of signature as a byte value as defined in <em>Constants</em>
   *
   * @param  signature in format described above
   * @return type of signature
   * @see    Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final byte typeOfMethodSignature(String signature)

  /**
   * Return type of method signature as a byte value as defined in <em>Constants</em>
   *
   * @param  signature in format described above
   * @return type of method signature
   * @see    Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static String getSignature(String type) {

  /** Parse Java type such as "char", or "java.lang.String[]" and return the
   * signature in byte code format, e.g. "C" or "[Ljava/lang/String;" respectively.
   *
   * @param  type Java type
   * @return byte code signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String signatureToString(String signature,
                                               boolean chopit)

  /**
   * The field signature represents the value of an argument to a function or
   * the value of a variable. It is a series of bytes generated by the
   * following grammar:
   *
   * <PRE>
   * <field_signature> ::= <field_type>
   * <field_type>      ::= <base_type>|<object_type>|<array_type>
   * <base_type>       ::= B|C|D|F|I|J|S|Z
   * <object_type>     ::= L<fullclassname>;
   * <array_type>      ::= [<field_type>
   *
   * The meaning of the base types is as follows:
   * B byte signed byte
   * C char character
   * D double double precision IEEE float
   * F float single precision IEEE float
   * I int integer
   * J long long integer
   * L<fullclassname>; ... an object of the given class
   * S short signed short
   * Z boolean true or false
   * [<field sig> ... array
   * </PRE>
   *
   * This method converts this string into a Java type declaration such as
   * `String[]' and throws a `ClassFormatException' when the parsed type is
   * invalid.
   *
   * @param  signature  Class signature
   * @param chopit Flag that determines whether chopping is executed or not
   * @return Java type declaration
   * @throws ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String signatureToString(String signature) {

  /**
   * Converts signature to string with all class names compacted.
   *
   * @param signature to convert
   * @return Human readable signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String replace(String str, String old, String new_) {

  /**
   * Replace all occurences of <em>old</em> in <em>str</em> with <em>new</em>.
   *
   * @param str String to permute
   * @param old String to be replaced
   * @param new Replacement string
   * @return new String object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureToString(String signature,
                                                     String name,
                                                     String access,
                                                     boolean chopit,
                                                     LocalVariableTable vars)

  /**
   * A return type signature represents the return value from a method.
   * It is a series of bytes in the following grammar:
   *
   * <return_signature> ::= <field_type> | V
   *
   * The character V indicates that the method returns no value. Otherwise, the
   * signature indicates the type of the return value.
   * An argument signature represents an argument passed to a method:
   *
   * <argument_signature> ::= <field_type>
   *
   * A method signature represents the arguments that the method expects, and
   * the value that it returns.
   * <method_signature> ::= (<arguments_signature>) <return_signature>
   * <arguments_signature>::= <argument_signature>*
   *
   * This method converts such a string into a Java type declaration like
   * `void _main(String[])' and throws a `ClassFormatException' when the parsed
   * type is invalid.
   *
   * @param  signature    Method signature
   * @param  name         Method name
   * @param  access       Method access rights
   * @return Java type declaration
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureToString(String signature,
                                                     String name,
                                                     String access) {

  /**
   * Converts method signature to string with all class names compacted.
   *
   * @param signature to convert
   * @param name of method
   * @param access flags of method
   * @return Human readable signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureReturnType(String signature,
                                                       boolean chopit)

  /**
   * @param  signature    Method signature
   * @param chopit Shorten class names ?
   * @return return type of method
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String methodSignatureReturnType(String signature)

  /**
   * @param  signature    Method signature
   * @return return type of method
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String[] methodSignatureArgumentTypes(String signature,
                                                            boolean chopit)

  /**
   * @param  signature    Method signature
   * @param chopit Shorten class names ?
   * @return Array of argument types
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String[] methodSignatureArgumentTypes(String signature)

  /**
   * @param  signature    Method signature
   * @return Array of argument types
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public final static String methodTypeToSignature(String ret, String[] argv)

  /**
   * Converts string containing the method return and argument types
   * to a byte code method signature.
   *
   * @param  ret Return type of method
   * @param  argv Types of method arguments
   * @return Byte code representation of method signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final boolean isSet(int flag, int i) {

  /**
   * @return true, if bit `i' in `flag' is set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final int clearBit(int flag, int i) {

  /**
   * @return `flag' with bit `i' set to 0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final int setBit(int flag, int i) {

  /**
   * @return `flag' with bit `i' set to 1
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String compactClassName(String str, boolean chopit) {

  /**
   * Shorten long class names, <em>java/lang/String</em> becomes
   * <em>java.lang.String</em>,
   * e.g.. If <em>chopit</em> is <em>true</em> the prefix <em>java.lang</em>
   * is also removed.
   *
   * @param str The long class name
   * @param chopit Flag that determines whether chopping is executed or not
   * @return Compacted class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String compactClassName(String str,
                                              String prefix,
                                              boolean chopit)

  /**
   * Shorten long class name <em>str</em>, i.e., chop off the <em>prefix</em>,
   * if the
   * class name starts with this string and the flag <em>chopit</em> is true.
   * Slashes <em>/</em> are converted to dots <em>.</em>.
   *
   * @param str The long class name
   * @param prefix The prefix the get rid off
   * @param chopit Flag that determines whether chopping is executed or not
   * @return Compacted class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String compactClassName(String str) {

  /**
   * Shorten long class names, <em>java/lang/String</em> becomes
   * <em>String</em>.
   *
   * @param str The long class name
   * @return Compacted class name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String codeToString(ByteSequence bytes,
                                          ConstantPool constant_pool, boolean verbose)

  /**
   * Disassemble a stream of byte codes and return the
   * string representation.
   *
   * @param  bytes stream of bytes
   * @param  constant_pool Array of constants
   * @param  verbose be verbose, e.g. print constant pool index
   * @return String representation of byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String codeToString(byte[] code,
                                          ConstantPool constant_pool,
                                          int index, int length, boolean verbose)

  /**
   * Disassemble a byte array of JVM byte codes starting from code line
   * `index' and return the disassembled string representation. Decode only
   * `num' opcodes (including their operands), use -1 if you want to
   * decompile everything.
   *
   * @param  code byte code array
   * @param  constant_pool Array of constants
   * @param  index offset in `code' array
   * <EM>(number of opcodes, not bytes!)</EM>
   * @param  length number of opcodes to decompile, -1 for all
   * @param  verbose be verbose, e.g. print constant pool index
   * @return String representation of byte codes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String classOrInterface(int access_flags) {

  /**
   * @return "class" or "interface", depending on the ACC_INTERFACE flag
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String accessToString(int access_flags,
                                            boolean for_class)

  /**
   * Convert bit field of flags into string such as `static final'.
   *
   * Special case: Classes compiled with new compilers and with the
   * `ACC_SUPER' flag would be said to be "synchronized". This is
   * because SUN used the same value for the flags `ACC_SUPER' and
   * `ACC_SYNCHRONIZED'.
   *
   * @param  access_flags Access flags
   * @param  for_class access flags are for class qualifiers ?
   * @return String representation of flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
  public static final String accessToString(int access_flags) {

  /**
   * Convert bit field of flags into string such as `static final'.
   *
   * @param  access_flags Access flags
   * @return String representation of flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Utility.java
public abstract class Utility {

/**
 * Utility functions that do not really belong to any class in particular.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
