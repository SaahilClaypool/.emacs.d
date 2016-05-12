_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/Class2HTML.java
  static String referenceClass(int index) {

  /**
   * Utility method that converts a class reference in the constant pool,
   * i.e., an index to a string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/Class2HTML.java
  public Class2HTML(JavaClass java_class, String dir) throws IOException {

  /**
   * Write contents of the given JavaClass into HTML files.
   *
   * @param java_class The class to write
   * @param dir The directory to put the files in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/Class2HTML.java
public class Class2HTML implements Constants

/**
 * Read class file(s) and convert them into HTML files.
 *
 * Given a JavaClass object "class" that is in package "package" five files
 * will be created in the specified directory.
 *
 * <OL>
 * <LI> "package"."class".html as the main file which defines the frames for
 * the following subfiles.
 * <LI>  "package"."class"_attributes.html contains all (known) attributes found in the file
 * <LI>  "package"."class"_cp.html contains the constant pool
 * <LI>  "package"."class"_code.html contains the byte code
 * <LI>  "package"."class"_methods.html contains references to all methods and fields of the class
 * </OL>
 *
 * All subfiles reference each other appropiately, e.g. clicking on a
 * method in the Method's frame will jump to the appropiate method in
 * the Code frame.
 *
 * @version $Id: Class2HTML.java,v 1.3 2007-07-19 04:34:52 ofung Exp $
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/Class2HTML.java
  static String referenceClass(int index) {

  /**
   * Utility method that converts a class reference in the constant pool,
   * i.e., an index to a string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/Class2HTML.java
  public Class2HTML(JavaClass java_class, String dir) throws IOException {

  /**
   * Write contents of the given JavaClass into HTML files.
   *
   * @param java_class The class to write
   * @param dir The directory to put the files in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/Class2HTML.java
public class Class2HTML implements Constants

/**
 * Read class file(s) and convert them into HTML files.
 *
 * Given a JavaClass object "class" that is in package "package" five files
 * will be created in the specified directory.
 *
 * <OL>
 * <LI> "package"."class".html as the main file which defines the frames for
 * the following subfiles.
 * <LI>  "package"."class"_attributes.html contains all (known) attributes found in the file
 * <LI>  "package"."class"_cp.html contains the constant pool
 * <LI>  "package"."class"_code.html contains the byte code
 * <LI>  "package"."class"_methods.html contains references to all methods and fields of the class
 * </OL>
 *
 * All subfiles reference each other appropiately, e.g. clicking on a
 * method in the Method's frame will jump to the appropiate method in
 * the Code frame.
 *
 * @version $Id: Class2HTML.java,v 1.3 2007-07-19 04:34:52 ofung Exp $
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
*/
