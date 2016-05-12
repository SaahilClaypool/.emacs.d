_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void logMsg(String s)

  /**
   * Bottleneck output: calls outWriter.println(s).
   * @param s String to print
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected PrintWriter outWriter = new PrintWriter(System.out, true);

  /** Simple PrintWriter we send output to; defaults to System.out.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  static

  /**
   * Static initializer for JARVERSIONS table.
   * Doing this just once saves time and space.
   *
   * @see #getApparentVersion(String, long)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  private static final Map<Long, String> JARVERSIONS;

  /**
   * Manual table of known .jar sizes.
   * Only includes shipped versions of certain projects.
   * key=jarsize, value=jarname ' from ' distro name
   * Note assumption: two jars cannot have the same size!
   *
   * @see #getApparentVersion(String, long)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkSAXVersion(Map<String, Object> h)

  /**
   * Report version info from SAX interfaces.
   *
   * Currently distinguishes between SAX 2, SAX 2.0beta2,
   * SAX1, and not found.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkDOMVersion(Map<String, Object> h)

  /**
   * Report version info from DOM interfaces.
   *
   * Currently distinguishes between pre-DOM level 2, the DOM
   * level 2 working draft, the DOM level 2 final draft,
   * and not found.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean checkDOML3(Map<String, Object> h)

  /**
   * Report version info from DOM interfaces.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkAntVersion(Map<String, Object> h)

  /**
   * Report product version information from Ant.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkParserVersion(Map<String, Object> h)

  /**
   * Report product version information from common parsers.
   *
   * Looks for version info in xerces.jar/xercesImpl.jar/crimson.jar.
   *
   * //@todo actually look up version info in crimson manifest
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkProcessorVersion(Map<String, Object> h)

  /**
   * Report product version information from Xalan-J.
   *
   * Looks for version info in xalan.jar from Xalan-J products.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkJAXPVersion(Map<String, Object> h)

  /**
   * Report version information about JAXP interfaces.
   *
   * Currently distinguishes between JAXP 1.0.1 and JAXP 1.1,
   * and not found; only tests the interfaces, and does not
   * check for reference implementation versions.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected String getApparentVersion(String jarName, long jarSize)

  /**
   * Cheap-o method to determine the product version of a .jar.
   *
   * Currently does a lookup into a local table of some recent
   * shipped Xalan builds to determine where the .jar probably
   * came from.  Note that if you recompile Xalan or Xerces
   * yourself this will likely report a potential error, since
   * we can't certify builds other than the ones we ship.
   * Only reports against selected posted Xalan-J builds.
   *
   * //@todo actually look up version info in manifests
   *
   * @param jarName base filename of the .jarfile
   * @param jarSize size of the .jarfile
   *
   * @return String describing where the .jar file probably
   * came from
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected List<Map> checkPathForJars(String cp, String[] jars)

  /**
   * Cheap-o listing of specified .jars found in the classpath.
   *
   * cp should be separated by the usual File.pathSeparator.  We
   * then do a simplistic search of the path for any requested
   * .jar filenames, and return a listing of their names and
   * where (apparently) they came from.
   *
   * @param cp classpath to search
   * @param jars array of .jar base filenames to look for
   *
   * @return List of Maps filled with info about found .jars
   * @see #jarNames
   * @see #logFoundJars(Map, String)
   * @see #appendFoundJars(Node, Document, Map, String )
   * @see #getApparentVersion(String, long)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkSystemProperties(Map<String, Object> h)

  /**
   * Fillin hash with info about SystemProperties.
   *
   * Logs java.class.path and other likely paths; then attempts
   * to search those paths for .jar files with Xalan-related classes.
   *
   * //@todo NOTE: We don't actually search java.ext.dirs for
   * //  *.jar files therein! This should be updated
   *
   * @param h Map to put information in
   * @see #jarNames
   * @see #checkPathForJars(String, String[])
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean appendFoundJars(Node container, Document factory,
        List<Map> v, String desc)

  /**
   * Print out report of .jars found in a classpath.
   *
   * Takes the information encoded from a checkPathForJars()
   * call and dumps it out to our PrintWriter.
   *
   * @param container Node to append our report to
   * @param factory Document providing createElement, etc. services
   * @param v Map of Maps of .jar file info
   * @param desc description to print out in header
   *
   * @return false if OK, true if any .jars were reported
   * as having errors
   * @see #checkPathForJars(String, String[])
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public void appendEnvironmentReport(Node container, Document factory, Map<String, Object> h)

  /**
   * Stylesheet extension entrypoint: Dump a basic Xalan
   * environment report from getEnvironmentHash() to a Node.
   *
   * <p>Copy of writeEnvironmentReport that creates a Node suitable
   * for other processing instead of a properties-like text output.
   * </p>
   * @param container Node to append our report to
   * @param factory Document providing createElement, etc. services
   * @param h Hash presumably from {@link #getEnvironmentHash()}
   * @see #writeEnvironmentReport(Map)
   * for an equivalent that writes to a PrintWriter instead
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean logFoundJars(List<Map> v, String desc)

  /**
   * Print out report of .jars found in a classpath.
   *
   * Takes the information encoded from a checkPathForJars()
   * call and dumps it out to our PrintWriter.
   *
   * @param v List of Maps of .jar file info
   * @param desc description to print out in header
   *
   * @return false if OK, true if any .jars were reported
   * as having errors
   * @see #checkPathForJars(String, String[])
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public String[] jarNames =

  /** Listing of common .jar files that include Xalan-related classes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String CLASS_NOTPRESENT = "not-present";

  /** Marker that a class or .jar was not found.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String CLASS_PRESENT = "present-unknown-version";

  /** Marker that a class or .jar was found.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String FOUNDCLASSES = "foundclasses.";

  /** Prefixed to hash keys that signify .jars found in classpath.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String VERSION = "version.";

  /** Prefixed to hash keys that signify version numbers.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String ERROR_FOUND = "At least one error was found!";

  /** Value for any error found.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String WARNING = "WARNING.";

  /** Added to descriptions that signify potential problems.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String ERROR = "ERROR.";

  /** Prefixed to hash keys that signify serious problems.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean writeEnvironmentReport(Map<String, Object> h)

  /**
   * Dump a basic Xalan environment report to outWriter.
   *
   * <p>This dumps a simple header and then each of the entries in
   * the Map to our PrintWriter; it does special processing
   * for entries that are .jars found in the classpath.</p>
   *
   * @param h Map of items to report on; presumably
   * filled in by our various check*() methods
   * @return true if your environment appears to have no major
   * problems; false if potential environment problems found
   * @see #appendEnvironmentReport(Node, Document, Map)
   * for an equivalent that appends to a Node instead
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public Map<String, Object> getEnvironmentHash()

  /**
   * Fill a hash with basic environment settings that affect Xalan.
   *
   * <p>Worker method called from various places.</p>
   * <p>Various system and CLASSPATH, etc. properties are put into
   * the hash as keys with a brief description of the current state
   * of that item as the value.  Any serious problems will be put in
   * with a key that is prefixed with {@link #ERROR 'ERROR.'} so it
   * stands out in any resulting report; also a key with just that
   * constant will be set as well for any error.</p>
   * <p>Note that some legitimate cases are flaged as potential
   * errors - namely when a developer recompiles xalan.jar on their
   * own - and even a non-error state doesn't guaruntee that
   * everything in the environment is correct.  But this will help
   * point out the most common classpath and system property
   * problems that we've seen.</p>
   *
   * @return Map full of useful environment info about Xalan and related
   * system properties, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public boolean checkEnvironment(PrintWriter pw)

  /**
   * Programmatic entrypoint: Report on basic Java environment
   * and CLASSPATH settings that affect Xalan.
   *
   * <p>Note that this class is not advanced enough to tell you
   * everything about the environment that affects Xalan, and
   * sometimes reports errors that will not actually affect
   * Xalan's behavior.  Currently, it very simplistically
   * checks the JVM's environment for some basic properties and
   * logs them out; it will report a problem if it finds a setting
   * or .jar file that is <i>likely</i> to cause problems.</p>
   *
   * <p>Advanced users can peruse the code herein to help them
   * investigate potential environment problems found; other users
   * may simply send the output from this tool along with any bugs
   * they submit to help us in the debugging process.</p>
   *
   * @param pw PrintWriter to send output to; can be sent to a
   * file that will look similar to a Properties file; defaults
   * to System.out if null
   * @return true if your environment appears to have no major
   * problems; false if potential environment problems found
   * @see #getEnvironmentHash()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static void main(String[] args)

  /**
   * Command line runnability: checks for [-out outFilename] arg.
   * <p>Command line entrypoint; Sets output and calls
   * {@link #checkEnvironment(PrintWriter)}.</p>
   * @param args command line args
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
public class EnvironmentCheck

/**
 * Utility class to report simple information about the environment.
 * Simplistic reporting about certain classes found in your JVM may
 * help answer some FAQs for simple problems.
 *
 * <p>Usage-command line:
 * <code>
 * java com.sun.org.apache.xalan.internal.xslt.EnvironmentCheck [-out outFile]
 * </code></p>
 *
 * <p>Usage-from program:
 * <code>
 * boolean environmentOK =
 * (new EnvironmentCheck()).checkEnvironment(yourPrintWriter);
 * </code></p>
 *
 * <p>Usage-from stylesheet:
 * <code><pre>
 *    &lt;?xml version="1.0"?&gt;
 *    &lt;xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
 *        xmlns:xalan="http://xml.apache.org/xalan"
 *        exclude-result-prefixes="xalan"&gt;
 *    &lt;xsl:output indent="yes"/&gt;
 *    &lt;xsl:template match="/"&gt;
 *      &lt;xsl:copy-of select="xalan:checkEnvironment()"/&gt;
 *    &lt;/xsl:template&gt;
 *    &lt;/xsl:stylesheet&gt;
 * </pre></code></p>
 *
 * <p>Xalan users reporting problems are encouraged to use this class
 * to see if there are potential problems with their actual
 * Java environment <b>before</b> reporting a bug.  Note that you
 * should both check from the JVM/JRE's command line as well as
 * temporarily calling checkEnvironment() directly from your code,
 * since the classpath may differ (especially for servlets, etc).</p>
 *
 * <p>Also see http://xml.apache.org/xalan-j/faq.html</p>
 *
 * <p>Note: This class is pretty simplistic:
 * results are not necessarily definitive nor will it find all
 * problems related to environment setup.  Also, you should avoid
 * calling this in deployed production code, both because it is
 * quite slow and because it forces classes to get loaded.</p>
 *
 * <p>Note: This class explicitly has very limited compile-time
 * dependencies to enable easy compilation and usage even when
 * Xalan, DOM/SAX/JAXP, etc. are not present.</p>
 *
 * <p>Note: for an improved version of this utility, please see
 * the xml-commons' project Which utility which does the same kind
 * of thing but in a much simpler manner.</p>
 *
 * @author Shane_Curcuru@us.ibm.com
 * @version $Id: EnvironmentCheck.java,v 1.10 2010-11-01 04:34:13 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void logMsg(String s)

  /**
   * Bottleneck output: calls outWriter.println(s).
   * @param s String to print
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected PrintWriter outWriter = new PrintWriter(System.out, true);

  /** Simple PrintWriter we send output to; defaults to System.out.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  static

  /**
   * Static initializer for JARVERSIONS table.
   * Doing this just once saves time and space.
   *
   * @see #getApparentVersion(String, long)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  private static final Map<Long, String> JARVERSIONS;

  /**
   * Manual table of known .jar sizes.
   * Only includes shipped versions of certain projects.
   * key=jarsize, value=jarname ' from ' distro name
   * Note assumption: two jars cannot have the same size!
   *
   * @see #getApparentVersion(String, long)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkSAXVersion(Map<String, Object> h)

  /**
   * Report version info from SAX interfaces.
   *
   * Currently distinguishes between SAX 2, SAX 2.0beta2,
   * SAX1, and not found.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkDOMVersion(Map<String, Object> h)

  /**
   * Report version info from DOM interfaces.
   *
   * Currently distinguishes between pre-DOM level 2, the DOM
   * level 2 working draft, the DOM level 2 final draft,
   * and not found.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean checkDOML3(Map<String, Object> h)

  /**
   * Report version info from DOM interfaces.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkAntVersion(Map<String, Object> h)

  /**
   * Report product version information from Ant.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkParserVersion(Map<String, Object> h)

  /**
   * Report product version information from common parsers.
   *
   * Looks for version info in xerces.jar/xercesImpl.jar/crimson.jar.
   *
   * //@todo actually look up version info in crimson manifest
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkProcessorVersion(Map<String, Object> h)

  /**
   * Report product version information from Xalan-J.
   *
   * Looks for version info in xalan.jar from Xalan-J products.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkJAXPVersion(Map<String, Object> h)

  /**
   * Report version information about JAXP interfaces.
   *
   * Currently distinguishes between JAXP 1.0.1 and JAXP 1.1,
   * and not found; only tests the interfaces, and does not
   * check for reference implementation versions.
   *
   * @param h Map to put information in
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected String getApparentVersion(String jarName, long jarSize)

  /**
   * Cheap-o method to determine the product version of a .jar.
   *
   * Currently does a lookup into a local table of some recent
   * shipped Xalan builds to determine where the .jar probably
   * came from.  Note that if you recompile Xalan or Xerces
   * yourself this will likely report a potential error, since
   * we can't certify builds other than the ones we ship.
   * Only reports against selected posted Xalan-J builds.
   *
   * //@todo actually look up version info in manifests
   *
   * @param jarName base filename of the .jarfile
   * @param jarSize size of the .jarfile
   *
   * @return String describing where the .jar file probably
   * came from
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected List<Map> checkPathForJars(String cp, String[] jars)

  /**
   * Cheap-o listing of specified .jars found in the classpath.
   *
   * cp should be separated by the usual File.pathSeparator.  We
   * then do a simplistic search of the path for any requested
   * .jar filenames, and return a listing of their names and
   * where (apparently) they came from.
   *
   * @param cp classpath to search
   * @param jars array of .jar base filenames to look for
   *
   * @return List of Maps filled with info about found .jars
   * @see #jarNames
   * @see #logFoundJars(Map, String)
   * @see #appendFoundJars(Node, Document, Map, String )
   * @see #getApparentVersion(String, long)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected void checkSystemProperties(Map<String, Object> h)

  /**
   * Fillin hash with info about SystemProperties.
   *
   * Logs java.class.path and other likely paths; then attempts
   * to search those paths for .jar files with Xalan-related classes.
   *
   * //@todo NOTE: We don't actually search java.ext.dirs for
   * //  *.jar files therein! This should be updated
   *
   * @param h Map to put information in
   * @see #jarNames
   * @see #checkPathForJars(String, String[])
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean appendFoundJars(Node container, Document factory,
        List<Map> v, String desc)

  /**
   * Print out report of .jars found in a classpath.
   *
   * Takes the information encoded from a checkPathForJars()
   * call and dumps it out to our PrintWriter.
   *
   * @param container Node to append our report to
   * @param factory Document providing createElement, etc. services
   * @param v Map of Maps of .jar file info
   * @param desc description to print out in header
   *
   * @return false if OK, true if any .jars were reported
   * as having errors
   * @see #checkPathForJars(String, String[])
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public void appendEnvironmentReport(Node container, Document factory, Map<String, Object> h)

  /**
   * Stylesheet extension entrypoint: Dump a basic Xalan
   * environment report from getEnvironmentHash() to a Node.
   *
   * <p>Copy of writeEnvironmentReport that creates a Node suitable
   * for other processing instead of a properties-like text output.
   * </p>
   * @param container Node to append our report to
   * @param factory Document providing createElement, etc. services
   * @param h Hash presumably from {@link #getEnvironmentHash()}
   * @see #writeEnvironmentReport(Map)
   * for an equivalent that writes to a PrintWriter instead
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean logFoundJars(List<Map> v, String desc)

  /**
   * Print out report of .jars found in a classpath.
   *
   * Takes the information encoded from a checkPathForJars()
   * call and dumps it out to our PrintWriter.
   *
   * @param v List of Maps of .jar file info
   * @param desc description to print out in header
   *
   * @return false if OK, true if any .jars were reported
   * as having errors
   * @see #checkPathForJars(String, String[])
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public String[] jarNames =

  /** Listing of common .jar files that include Xalan-related classes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String CLASS_NOTPRESENT = "not-present";

  /** Marker that a class or .jar was not found.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String CLASS_PRESENT = "present-unknown-version";

  /** Marker that a class or .jar was found.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String FOUNDCLASSES = "foundclasses.";

  /** Prefixed to hash keys that signify .jars found in classpath.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String VERSION = "version.";

  /** Prefixed to hash keys that signify version numbers.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String ERROR_FOUND = "At least one error was found!";

  /** Value for any error found.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String WARNING = "WARNING.";

  /** Added to descriptions that signify potential problems.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static final String ERROR = "ERROR.";

  /** Prefixed to hash keys that signify serious problems.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  protected boolean writeEnvironmentReport(Map<String, Object> h)

  /**
   * Dump a basic Xalan environment report to outWriter.
   *
   * <p>This dumps a simple header and then each of the entries in
   * the Map to our PrintWriter; it does special processing
   * for entries that are .jars found in the classpath.</p>
   *
   * @param h Map of items to report on; presumably
   * filled in by our various check*() methods
   * @return true if your environment appears to have no major
   * problems; false if potential environment problems found
   * @see #appendEnvironmentReport(Node, Document, Map)
   * for an equivalent that appends to a Node instead
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public Map<String, Object> getEnvironmentHash()

  /**
   * Fill a hash with basic environment settings that affect Xalan.
   *
   * <p>Worker method called from various places.</p>
   * <p>Various system and CLASSPATH, etc. properties are put into
   * the hash as keys with a brief description of the current state
   * of that item as the value.  Any serious problems will be put in
   * with a key that is prefixed with {@link #ERROR 'ERROR.'} so it
   * stands out in any resulting report; also a key with just that
   * constant will be set as well for any error.</p>
   * <p>Note that some legitimate cases are flaged as potential
   * errors - namely when a developer recompiles xalan.jar on their
   * own - and even a non-error state doesn't guaruntee that
   * everything in the environment is correct.  But this will help
   * point out the most common classpath and system property
   * problems that we've seen.</p>
   *
   * @return Map full of useful environment info about Xalan and related
   * system properties, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public boolean checkEnvironment(PrintWriter pw)

  /**
   * Programmatic entrypoint: Report on basic Java environment
   * and CLASSPATH settings that affect Xalan.
   *
   * <p>Note that this class is not advanced enough to tell you
   * everything about the environment that affects Xalan, and
   * sometimes reports errors that will not actually affect
   * Xalan's behavior.  Currently, it very simplistically
   * checks the JVM's environment for some basic properties and
   * logs them out; it will report a problem if it finds a setting
   * or .jar file that is <i>likely</i> to cause problems.</p>
   *
   * <p>Advanced users can peruse the code herein to help them
   * investigate potential environment problems found; other users
   * may simply send the output from this tool along with any bugs
   * they submit to help us in the debugging process.</p>
   *
   * @param pw PrintWriter to send output to; can be sent to a
   * file that will look similar to a Properties file; defaults
   * to System.out if null
   * @return true if your environment appears to have no major
   * problems; false if potential environment problems found
   * @see #getEnvironmentHash()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
  public static void main(String[] args)

  /**
   * Command line runnability: checks for [-out outFilename] arg.
   * <p>Command line entrypoint; Sets output and calls
   * {@link #checkEnvironment(PrintWriter)}.</p>
   * @param args command line args
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xslt/EnvironmentCheck.java
public class EnvironmentCheck

/**
 * Utility class to report simple information about the environment.
 * Simplistic reporting about certain classes found in your JVM may
 * help answer some FAQs for simple problems.
 *
 * <p>Usage-command line:
 * <code>
 * java com.sun.org.apache.xalan.internal.xslt.EnvironmentCheck [-out outFile]
 * </code></p>
 *
 * <p>Usage-from program:
 * <code>
 * boolean environmentOK =
 * (new EnvironmentCheck()).checkEnvironment(yourPrintWriter);
 * </code></p>
 *
 * <p>Usage-from stylesheet:
 * <code><pre>
 *    &lt;?xml version="1.0"?&gt;
 *    &lt;xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
 *        xmlns:xalan="http://xml.apache.org/xalan"
 *        exclude-result-prefixes="xalan"&gt;
 *    &lt;xsl:output indent="yes"/&gt;
 *    &lt;xsl:template match="/"&gt;
 *      &lt;xsl:copy-of select="xalan:checkEnvironment()"/&gt;
 *    &lt;/xsl:template&gt;
 *    &lt;/xsl:stylesheet&gt;
 * </pre></code></p>
 *
 * <p>Xalan users reporting problems are encouraged to use this class
 * to see if there are potential problems with their actual
 * Java environment <b>before</b> reporting a bug.  Note that you
 * should both check from the JVM/JRE's command line as well as
 * temporarily calling checkEnvironment() directly from your code,
 * since the classpath may differ (especially for servlets, etc).</p>
 *
 * <p>Also see http://xml.apache.org/xalan-j/faq.html</p>
 *
 * <p>Note: This class is pretty simplistic:
 * results are not necessarily definitive nor will it find all
 * problems related to environment setup.  Also, you should avoid
 * calling this in deployed production code, both because it is
 * quite slow and because it forces classes to get loaded.</p>
 *
 * <p>Note: This class explicitly has very limited compile-time
 * dependencies to enable easy compilation and usage even when
 * Xalan, DOM/SAX/JAXP, etc. are not present.</p>
 *
 * <p>Note: for an improved version of this utility, please see
 * the xml-commons' project Which utility which does the same kind
 * of thing but in a much simpler manner.</p>
 *
 * @author Shane_Curcuru@us.ibm.com
 * @version $Id: EnvironmentCheck.java,v 1.10 2010-11-01 04:34:13 joehw Exp $
 */
