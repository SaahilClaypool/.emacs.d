_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getDevelopmentVersionNum()

  /**
   * Development Drop Number.
   * Optional identifier designates development drop of
   *          a specific release. D01 is the first development drop
   *          of a new release.
   *
   *          Development drops are works in progress towards a
   *          compeleted, final release. A specific development drop
   *          may not completely implement all aspects of a new
   *          feature, which may take several development drops to
   *          complete. At the point of the final drop for the
   *          release, the D suffix will be omitted.
   *
   *          Each 'D' drops can contain functional enhancements as
   *          well as defect fixes. 'D' drops may not be as stable as
   *          the final releases.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getMaintenanceVersionNum()

  /**
   * Maintenance Drop Number.
   * Optional identifier used to designate maintenance
   *          drop applied to a specific release and contains
   *          fixes for defects reported. It maintains compatibility
   *          with the release and contains no API changes.
   *          When missing, it designates the final and complete
   *          development drop for a release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getReleaseVersionNum()

  /**
   * Release Number.
   * Release number. This changes when:
   *            -  a new set of functionality is to be added, eg,
   *               implementation of a new W3C specification.
   *            -  API or behaviour change.
   *            -  its designated as a reference release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getMajorVersionNum()

  /**
   * Major version number.
   * Version number. This changes only when there is a
   *          significant, externally apparent enhancement from
   *          the previous release. 'n' represents the n'th
   *          version.
   *
   *          Clients should carefully consider the implications
   *          of new versions as external interfaces and behaviour
   *          may have changed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static String getImplementationLanguage()

  /**
   * Implementation Language: Java.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static String getProduct()

  /**
   * Name of product: Xalan.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static void _main(String argv[])

  /**
   * Print the processor version to the command line.
   *
   * @param argv command line arguments, unused.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static String getVersion()

  /**
   * Get the basic version string for the current Xalan release.
   * Version String formatted like
   * <CODE>"<B>Xalan</B> <B>Java</B> v.r[.dd| <B>D</B>nn]"</CODE>.
   *
   * Futurework: have this read version info from jar manifest.
   *
   * @return String denoting our current version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
public class Version

/**
 * Administrative class to keep track of the version number of
 * the Xalan release.
 * <P>This class implements the upcoming standard of having
 * org.apache.project-name.Version.getVersion() be a standard way
 * to get version information.  This class will replace the older
 * com.sun.org.apache.xalan.internal.processor.Version class.</P>
 * <P>See also: com/sun/org/apache/xalan/internal/res/XSLTInfo.properties for
 * information about the version of the XSLT spec we support.</P>
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Version.java
    public static void main(String argv[]) {

    /**
     * Prints out the version number to System.out. This is needed
     * for the build system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Version.java
    public static final String fVersion = getVersion();

    /** Version string.
     * @deprecated  getVersion() should be used instead.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Version.java
public class Version {

/**
 * This class defines the version number of the parser.
 *
 * @version $Id: Version.java,v 1.4 2010-11-01 04:39:40 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getDevelopmentVersionNum()

  /**
   * Development Drop Number.
   * Optional identifier designates development drop of
   *          a specific release. D01 is the first development drop
   *          of a new release.
   *
   *          Development drops are works in progress towards a
   *          compeleted, final release. A specific development drop
   *          may not completely implement all aspects of a new
   *          feature, which may take several development drops to
   *          complete. At the point of the final drop for the
   *          release, the D suffix will be omitted.
   *
   *          Each 'D' drops can contain functional enhancements as
   *          well as defect fixes. 'D' drops may not be as stable as
   *          the final releases.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getMaintenanceVersionNum()

  /**
   * Maintenance Drop Number.
   * Optional identifier used to designate maintenance
   *          drop applied to a specific release and contains
   *          fixes for defects reported. It maintains compatibility
   *          with the release and contains no API changes.
   *          When missing, it designates the final and complete
   *          development drop for a release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getReleaseVersionNum()

  /**
   * Release Number.
   * Release number. This changes when:
   *            -  a new set of functionality is to be added, eg,
   *               implementation of a new W3C specification.
   *            -  API or behaviour change.
   *            -  its designated as a reference release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getMajorVersionNum()

  /**
   * Major version number.
   * Version number. This changes only when there is a
   *          significant, externally apparent enhancement from
   *          the previous release. 'n' represents the n'th
   *          version.
   *
   *          Clients should carefully consider the implications
   *          of new versions as external interfaces and behaviour
   *          may have changed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static String getImplementationLanguage()

  /**
   * Implementation Language: Java.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static String getProduct()

  /**
   * Name of product: Serializer.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static void _main(String argv[])

  /**
   * Print the processor version to the command line.
   *
   * @param argv command line arguments, unused.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static String getVersion()

  /**
   * Get the basic version string for the current Serializer.
   * Version String formatted like
   * <CODE>"<B>Serializer</B> <B>Java</B> v.r[.dd| <B>D</B>nn]"</CODE>.
   *
   * Futurework: have this read version info from jar manifest.
   *
   * @return String denoting our current version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
public final class Version

/**
 * Administrative class to keep track of the version number of
 * the Serializer release.
 * <P>This class implements the upcoming standard of having
 * org.apache.project-name.Version.getVersion() be a standard way
 * to get version information.</P>
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getDevelopmentVersionNum()

  /**
   * Development Drop Number.
   * Optional identifier designates development drop of
   *          a specific release. D01 is the first development drop
   *          of a new release.
   *
   *          Development drops are works in progress towards a
   *          compeleted, final release. A specific development drop
   *          may not completely implement all aspects of a new
   *          feature, which may take several development drops to
   *          complete. At the point of the final drop for the
   *          release, the D suffix will be omitted.
   *
   *          Each 'D' drops can contain functional enhancements as
   *          well as defect fixes. 'D' drops may not be as stable as
   *          the final releases.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getMaintenanceVersionNum()

  /**
   * Maintenance Drop Number.
   * Optional identifier used to designate maintenance
   *          drop applied to a specific release and contains
   *          fixes for defects reported. It maintains compatibility
   *          with the release and contains no API changes.
   *          When missing, it designates the final and complete
   *          development drop for a release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getReleaseVersionNum()

  /**
   * Release Number.
   * Release number. This changes when:
   *            -  a new set of functionality is to be added, eg,
   *               implementation of a new W3C specification.
   *            -  API or behaviour change.
   *            -  its designated as a reference release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static int getMajorVersionNum()

  /**
   * Major version number.
   * Version number. This changes only when there is a
   *          significant, externally apparent enhancement from
   *          the previous release. 'n' represents the n'th
   *          version.
   *
   *          Clients should carefully consider the implications
   *          of new versions as external interfaces and behaviour
   *          may have changed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static String getImplementationLanguage()

  /**
   * Implementation Language: Java.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static String getProduct()

  /**
   * Name of product: Xalan.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static void _main(String argv[])

  /**
   * Print the processor version to the command line.
   *
   * @param argv command line arguments, unused.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
  public static String getVersion()

  /**
   * Get the basic version string for the current Xalan release.
   * Version String formatted like
   * <CODE>"<B>Xalan</B> <B>Java</B> v.r[.dd| <B>D</B>nn]"</CODE>.
   *
   * Futurework: have this read version info from jar manifest.
   *
   * @return String denoting our current version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/Version.java
public class Version

/**
 * Administrative class to keep track of the version number of
 * the Xalan release.
 * <P>This class implements the upcoming standard of having
 * org.apache.project-name.Version.getVersion() be a standard way
 * to get version information.  This class will replace the older
 * com.sun.org.apache.xalan.internal.processor.Version class.</P>
 * <P>See also: com/sun/org/apache/xalan/internal/res/XSLTInfo.properties for
 * information about the version of the XSLT spec we support.</P>
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Version.java
    public static void main(String argv[]) {

    /**
     * Prints out the version number to System.out. This is needed
     * for the build system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Version.java
    public static final String fVersion = getVersion();

    /** Version string.
     * @deprecated  getVersion() should be used instead.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Version.java
public class Version {

/**
 * This class defines the version number of the parser.
 *
 * @version $Id: Version.java,v 1.4 2010-11-01 04:39:40 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getDevelopmentVersionNum()

  /**
   * Development Drop Number.
   * Optional identifier designates development drop of
   *          a specific release. D01 is the first development drop
   *          of a new release.
   *
   *          Development drops are works in progress towards a
   *          compeleted, final release. A specific development drop
   *          may not completely implement all aspects of a new
   *          feature, which may take several development drops to
   *          complete. At the point of the final drop for the
   *          release, the D suffix will be omitted.
   *
   *          Each 'D' drops can contain functional enhancements as
   *          well as defect fixes. 'D' drops may not be as stable as
   *          the final releases.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getMaintenanceVersionNum()

  /**
   * Maintenance Drop Number.
   * Optional identifier used to designate maintenance
   *          drop applied to a specific release and contains
   *          fixes for defects reported. It maintains compatibility
   *          with the release and contains no API changes.
   *          When missing, it designates the final and complete
   *          development drop for a release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getReleaseVersionNum()

  /**
   * Release Number.
   * Release number. This changes when:
   *            -  a new set of functionality is to be added, eg,
   *               implementation of a new W3C specification.
   *            -  API or behaviour change.
   *            -  its designated as a reference release.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static int getMajorVersionNum()

  /**
   * Major version number.
   * Version number. This changes only when there is a
   *          significant, externally apparent enhancement from
   *          the previous release. 'n' represents the n'th
   *          version.
   *
   *          Clients should carefully consider the implications
   *          of new versions as external interfaces and behaviour
   *          may have changed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static String getImplementationLanguage()

  /**
   * Implementation Language: Java.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static String getProduct()

  /**
   * Name of product: Serializer.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static void _main(String argv[])

  /**
   * Print the processor version to the command line.
   *
   * @param argv command line arguments, unused.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
  public static String getVersion()

  /**
   * Get the basic version string for the current Serializer.
   * Version String formatted like
   * <CODE>"<B>Serializer</B> <B>Java</B> v.r[.dd| <B>D</B>nn]"</CODE>.
   *
   * Futurework: have this read version info from jar manifest.
   *
   * @return String denoting our current version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Version.java
public final class Version

/**
 * Administrative class to keep track of the version number of
 * the Serializer release.
 * <P>This class implements the upcoming standard of having
 * org.apache.project-name.Version.getVersion() be a standard way
 * to get version information.</P>
 * @xsl.usage general
 */
