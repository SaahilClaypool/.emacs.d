_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readVersion() throws IOException, ClassFormatException

  /**
   * Read major and minor version of compiler which created the file.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readMethods() throws IOException, ClassFormatException

  /**
   * Read information about the methods of the class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readInterfaces() throws IOException, ClassFormatException

  /**
   * Read information about the interfaces implemented by this class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  /**

  /******************** Private utility methods **********************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readFields() throws IOException, ClassFormatException

  /**
   * Read information about the fields of the class, i.e., its variables.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readConstantPool() throws IOException, ClassFormatException

  /**
   * Read constant pool entries.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readClassInfo() throws IOException, ClassFormatException

  /**
   * Read information about the class and its super class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readAttributes() throws IOException, ClassFormatException

  /**
   * Read information about the attributes of the class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
    // Read class fields, i.e., the variables of the class

    /****************** Read class fields and methods ***************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
    // Read constant pool entries

    /****************** Read constant pool and related **************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
    // Check magic tag of class file

    /****************** Read headers ********************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public JavaClass parse() throws IOException, ClassFormatException

  /**
   * Parse the given Java class file and return an object that represents
   * the contained data, i.e., constants, methods, fields and commands.
   * A <em>ClassFormatException</em> is raised, if the file is not a valid
   * .class file. (This does not include verification of the byte code as it
   * is performed by the java interpreter).
   *
   * @return Class object representing the parsed class file
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public ClassParser(String zip_file, String file_name) throws IOException

  /** Parse class from given .class file in a ZIP-archive
   *
   * @param file_name file name
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public ClassParser(String file_name) throws IOException

  /** Parse class from given .class file.
   *
   * @param file_name file name
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public ClassParser(InputStream file, String file_name) {

  /**
   * Parse class from the given stream.
   *
   * @param file Input stream
   * @param file_name File name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
public final class ClassParser {

/**
 * Wrapper class that parses a given Java .class file. The method <A
 * href ="#parse">parse</A> returns a <A href ="JavaClass.html">
 * JavaClass</A> object on success. When an I/O error or an
 * inconsistency occurs an appropiate exception is propagated back to
 * the caller.
 *
 * The structure and the names comply, except for a few conveniences,
 * exactly with the <A href="ftp://java.sun.com/docs/specs/vmspec.ps">
 * JVM specification 1.0</a>. See this paper for
 * further details about the structure of a bytecode file.
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readVersion() throws IOException, ClassFormatException

  /**
   * Read major and minor version of compiler which created the file.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readMethods() throws IOException, ClassFormatException

  /**
   * Read information about the methods of the class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readInterfaces() throws IOException, ClassFormatException

  /**
   * Read information about the interfaces implemented by this class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  /**

  /******************** Private utility methods **********************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readFields() throws IOException, ClassFormatException

  /**
   * Read information about the fields of the class, i.e., its variables.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readConstantPool() throws IOException, ClassFormatException

  /**
   * Read constant pool entries.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readClassInfo() throws IOException, ClassFormatException

  /**
   * Read information about the class and its super class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  private final void readAttributes() throws IOException, ClassFormatException

  /**
   * Read information about the attributes of the class.
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
    // Read class fields, i.e., the variables of the class

    /****************** Read class fields and methods ***************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
    // Read constant pool entries

    /****************** Read constant pool and related **************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
    // Check magic tag of class file

    /****************** Read headers ********************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public JavaClass parse() throws IOException, ClassFormatException

  /**
   * Parse the given Java class file and return an object that represents
   * the contained data, i.e., constants, methods, fields and commands.
   * A <em>ClassFormatException</em> is raised, if the file is not a valid
   * .class file. (This does not include verification of the byte code as it
   * is performed by the java interpreter).
   *
   * @return Class object representing the parsed class file
   * @throws  IOException
   * @throws  ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public ClassParser(String zip_file, String file_name) throws IOException

  /** Parse class from given .class file in a ZIP-archive
   *
   * @param file_name file name
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public ClassParser(String file_name) throws IOException

  /** Parse class from given .class file.
   *
   * @param file_name file name
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
  public ClassParser(InputStream file, String file_name) {

  /**
   * Parse class from the given stream.
   *
   * @param file Input stream
   * @param file_name File name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ClassParser.java
public final class ClassParser {

/**
 * Wrapper class that parses a given Java .class file. The method <A
 * href ="#parse">parse</A> returns a <A href ="JavaClass.html">
 * JavaClass</A> object on success. When an I/O error or an
 * inconsistency occurs an appropiate exception is propagated back to
 * the caller.
 *
 * The structure and the names comply, except for a few conveniences,
 * exactly with the <A href="ftp://java.sun.com/docs/specs/vmspec.ps">
 * JVM specification 1.0</a>. See this paper for
 * further details about the structure of a bytecode file.
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
