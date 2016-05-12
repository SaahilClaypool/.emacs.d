_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/JavaWrapper.java
  public static void _main(String[] argv) throws Exception {

  /** Default _main method used as wrapper, expects the fully qualified class name
   * of the real class as the first argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/JavaWrapper.java
  public void runMain(String class_name, String[] argv) throws ClassNotFoundException

  /** Runs the _main method of the given class with the arguments passed in argv
   *
   * @param class_name the fully qualified class name
   * @param argv the arguments just as you would pass them directly
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/JavaWrapper.java
public class JavaWrapper {

/**
 * Java interpreter replacement, i.e., wrapper that uses its own ClassLoader
 * to modify/generate classes as they're requested. You can take this as a template
 * for your own applications.<br>
 * Call this wrapper with
 * <pre>java com.sun.org.apache.bcel.internal.util.JavaWrapper &lt;real.class.name&gt; [arguments]</pre>
 * <p>
 * To use your own class loader you can set the "bcel.classloader" system property
 * which defaults to "com.sun.org.apache.bcel.internal.util.ClassLoader", e.g., with
 * <pre>java com.sun.org.apache.bcel.internal.util.JavaWrapper -Dbcel.classloader=foo.MyLoader &lt;real.class.name&gt; [arguments]</pre>
 * </p>
 *
 * @version $Id: JavaWrapper.java,v 1.3 2007-07-19 04:34:52 ofung Exp $
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see ClassLoader
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/JavaWrapper.java
  public static void _main(String[] argv) throws Exception {

  /** Default _main method used as wrapper, expects the fully qualified class name
   * of the real class as the first argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/JavaWrapper.java
  public void runMain(String class_name, String[] argv) throws ClassNotFoundException

  /** Runs the _main method of the given class with the arguments passed in argv
   *
   * @param class_name the fully qualified class name
   * @param argv the arguments just as you would pass them directly
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/JavaWrapper.java
public class JavaWrapper {

/**
 * Java interpreter replacement, i.e., wrapper that uses its own ClassLoader
 * to modify/generate classes as they're requested. You can take this as a template
 * for your own applications.<br>
 * Call this wrapper with
 * <pre>java com.sun.org.apache.bcel.internal.util.JavaWrapper &lt;real.class.name&gt; [arguments]</pre>
 * <p>
 * To use your own class loader you can set the "bcel.classloader" system property
 * which defaults to "com.sun.org.apache.bcel.internal.util.ClassLoader", e.g., with
 * <pre>java com.sun.org.apache.bcel.internal.util.JavaWrapper -Dbcel.classloader=foo.MyLoader &lt;real.class.name&gt; [arguments]</pre>
 * </p>
 *
 * @version $Id: JavaWrapper.java,v 1.3 2007-07-19 04:34:52 ofung Exp $
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see ClassLoader
 */
