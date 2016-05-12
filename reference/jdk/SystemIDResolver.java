_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String urlString, String base)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param urlString SystemID string
   * @param base The URI string used as the base for resolving the systemID
   *
   * @return The resolved absolute URI
   * @throws TransformerException thrown if the string can't be turned into a URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
          {

          if (str.startsWith("///") || !str.startsWith("//"))
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
        // or "file:/". Don't do anything if it only starts with "file://".

        // Resolve the absolute path if the systemId starts with "file:///"
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String systemId)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param systemId A URI string, which may be absolute or relative.
   *
   * @return The resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  private static String replaceChars(String str)

  /**
   * Replace spaces with "%20" and backslashes with forward slashes in
   * the input string to generate a well-formed URI string.
   *
   * @param str The input string
   * @return The string after conversion
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
    private static boolean isWindowsAbsolutePath(String systemId)

   /**
   * Return true if the local path is a Windows absolute path.
   *
   * @param systemId The path string
   * @return true if the path is a Windows absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static boolean isAbsolutePath(String systemId)

  /**
   * Return true if the local path is an absolute path.
   *
   * @param systemId The path string
   * @return true if the path is absolute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
     /**

     /** http://www.ietf.org/rfc/rfc2396.txt
      *   Authors should be aware that a path segment which contains a colon
      * character cannot be used as the first segment of a relative URI path
      * (e.g., "this:that"), because it would be mistaken for a scheme name.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static boolean isAbsoluteURI(String systemId)

  /**
   * Return true if the systemId denotes an absolute URI .
   *
   * @param systemId The systemId string
   * @return true if the systemId is an an absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  private static String getAbsolutePathFromRelativePath(String relativePath)

  /**
   * Return an absolute path from a relative path.
   *
   * @param relativePath A relative path
   * @return The absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
    }

        urlString = "file:///" + absolutePath;
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static String getAbsoluteURIFromRelative(String localPath)

  /**
   * Get an absolute URI from a given relative URI (local path).
   *
   * <p>The relative URI is a local filesystem path. The path can be
   * absolute or relative. If it is a relative path, it is resolved relative
   * to the system property "user.dir" if it is available; if not (i.e. in an
   * Applet perhaps which throws SecurityException) then we just return the
   * relative path. The space and backslash characters are also replaced to
   * generate a good absolute URI.</p>
   *
   * @param localPath The relative URI to resolve
   *
   * @return Resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
public final class SystemIDResolver

/**
 * This class is used to resolve relative URIs and SystemID
 * strings into absolute URIs.
 *
 * <p>This is a generic utility for resolving URIs, other than the
 * fact that it's declared to throw TransformerException.  Please
 * see code comments for details on how resolution is performed.</p>
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String urlString, String base)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param urlString SystemID string
   * @param base The URI string used as the base for resolving the systemID
   *
   * @return The resolved absolute URI
   * @throws TransformerException thrown if the string can't be turned into a URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
          {

          if (str.startsWith("///") || !str.startsWith("//"))
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
        // or "file:/". Don't do anything if it only starts with "file://".

        // Resolve the absolute path if the systemId starts with "file:///"
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String systemId)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param systemId A URI string, which may be absolute or relative.
   *
   * @return The resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  private static String replaceChars(String str)

  /**
   * Replace spaces with "%20" and backslashes with forward slashes in
   * the input string to generate a well-formed URI string.
   *
   * @param str The input string
   * @return The string after conversion
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
    private static boolean isWindowsAbsolutePath(String systemId)

   /**
   * Return true if the local path is a Windows absolute path.
   *
   * @param systemId The path string
   * @return true if the path is a Windows absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static boolean isAbsolutePath(String systemId)

  /**
   * Return true if the local path is an absolute path.
   *
   * @param systemId The path string
   * @return true if the path is absolute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
     /**

     /** http://www.ietf.org/rfc/rfc2396.txt
      *   Authors should be aware that a path segment which contains a colon
      * character cannot be used as the first segment of a relative URI path
      * (e.g., "this:that"), because it would be mistaken for a scheme name.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static boolean isAbsoluteURI(String systemId)

  /**
   * Return true if the systemId denotes an absolute URI .
   *
   * @param systemId The systemId string
   * @return true if the systemId is an an absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  private static String getAbsolutePathFromRelativePath(String relativePath)

  /**
   * Return an absolute path from a relative path.
   *
   * @param relativePath A relative path
   * @return The absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
    }

        urlString = "file:///" + absolutePath;
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static String getAbsoluteURIFromRelative(String localPath)

  /**
   * Get an absolute URI from a given relative URI (local path).
   *
   * <p>The relative URI is a local filesystem path. The path can be
   * absolute or relative. If it is a relative path, it is resolved relative
   * to the system property "user.dir" if it is available; if not (i.e. in an
   * Applet perhaps which throws SecurityException) then we just return the
   * relative path. The space and backslash characters are also replaced to
   * generate a good absolute URI.</p>
   *
   * @param localPath The relative URI to resolve
   *
   * @return Resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
public class SystemIDResolver

/**
 * This class is used to resolve relative URIs and SystemID
 * strings into absolute URIs.
 *
 * <p>This is a generic utility for resolving URIs, other than the
 * fact that it's declared to throw TransformerException.  Please
 * see code comments for details on how resolution is performed.</p>
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String urlString, String base)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param urlString SystemID string
   * @param base The URI string used as the base for resolving the systemID
   *
   * @return The resolved absolute URI
   * @throws TransformerException thrown if the string can't be turned into a URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
          {

          if (str.startsWith("///") || !str.startsWith("//"))
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
        // or "file:/". Don't do anything if it only starts with "file://".

        // Resolve the absolute path if the systemId starts with "file:///"
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String systemId)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param systemId A URI string, which may be absolute or relative.
   *
   * @return The resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  private static String replaceChars(String str)

  /**
   * Replace spaces with "%20" and backslashes with forward slashes in
   * the input string to generate a well-formed URI string.
   *
   * @param str The input string
   * @return The string after conversion
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
    private static boolean isWindowsAbsolutePath(String systemId)

   /**
   * Return true if the local path is a Windows absolute path.
   *
   * @param systemId The path string
   * @return true if the path is a Windows absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static boolean isAbsolutePath(String systemId)

  /**
   * Return true if the local path is an absolute path.
   *
   * @param systemId The path string
   * @return true if the path is absolute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
     /**

     /** http://www.ietf.org/rfc/rfc2396.txt
      *   Authors should be aware that a path segment which contains a colon
      * character cannot be used as the first segment of a relative URI path
      * (e.g., "this:that"), because it would be mistaken for a scheme name.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static boolean isAbsoluteURI(String systemId)

  /**
   * Return true if the systemId denotes an absolute URI .
   *
   * @param systemId The systemId string
   * @return true if the systemId is an an absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  private static String getAbsolutePathFromRelativePath(String relativePath)

  /**
   * Return an absolute path from a relative path.
   *
   * @param relativePath A relative path
   * @return The absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
    }

        urlString = "file:///" + absolutePath;
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
  public static String getAbsoluteURIFromRelative(String localPath)

  /**
   * Get an absolute URI from a given relative URI (local path).
   *
   * <p>The relative URI is a local filesystem path. The path can be
   * absolute or relative. If it is a relative path, it is resolved relative
   * to the system property "user.dir" if it is available; if not (i.e. in an
   * Applet perhaps which throws SecurityException) then we just return the
   * relative path. The space and backslash characters are also replaced to
   * generate a good absolute URI.</p>
   *
   * @param localPath The relative URI to resolve
   *
   * @return Resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/SystemIDResolver.java
public final class SystemIDResolver

/**
 * This class is used to resolve relative URIs and SystemID
 * strings into absolute URIs.
 *
 * <p>This is a generic utility for resolving URIs, other than the
 * fact that it's declared to throw TransformerException.  Please
 * see code comments for details on how resolution is performed.</p>
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String urlString, String base)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param urlString SystemID string
   * @param base The URI string used as the base for resolving the systemID
   *
   * @return The resolved absolute URI
   * @throws TransformerException thrown if the string can't be turned into a URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
          {

          if (str.startsWith("///") || !str.startsWith("//"))
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
        // or "file:/". Don't do anything if it only starts with "file://".

        // Resolve the absolute path if the systemId starts with "file:///"
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static String getAbsoluteURI(String systemId)

  /**
   * Take a SystemID string and try to turn it into a good absolute URI.
   *
   * @param systemId A URI string, which may be absolute or relative.
   *
   * @return The resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  private static String replaceChars(String str)

  /**
   * Replace spaces with "%20" and backslashes with forward slashes in
   * the input string to generate a well-formed URI string.
   *
   * @param str The input string
   * @return The string after conversion
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
    private static boolean isWindowsAbsolutePath(String systemId)

   /**
   * Return true if the local path is a Windows absolute path.
   *
   * @param systemId The path string
   * @return true if the path is a Windows absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static boolean isAbsolutePath(String systemId)

  /**
   * Return true if the local path is an absolute path.
   *
   * @param systemId The path string
   * @return true if the path is absolute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
     /**

     /** http://www.ietf.org/rfc/rfc2396.txt
      *   Authors should be aware that a path segment which contains a colon
      * character cannot be used as the first segment of a relative URI path
      * (e.g., "this:that"), because it would be mistaken for a scheme name.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static boolean isAbsoluteURI(String systemId)

  /**
   * Return true if the systemId denotes an absolute URI .
   *
   * @param systemId The systemId string
   * @return true if the systemId is an an absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  private static String getAbsolutePathFromRelativePath(String relativePath)

  /**
   * Return an absolute path from a relative path.
   *
   * @param relativePath A relative path
   * @return The absolute path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
    }

        urlString = "file:///" + absolutePath;
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
  public static String getAbsoluteURIFromRelative(String localPath)

  /**
   * Get an absolute URI from a given relative URI (local path).
   *
   * <p>The relative URI is a local filesystem path. The path can be
   * absolute or relative. If it is a relative path, it is resolved relative
   * to the system property "user.dir" if it is available; if not (i.e. in an
   * Applet perhaps which throws SecurityException) then we just return the
   * relative path. The space and backslash characters are also replaced to
   * generate a good absolute URI.</p>
   *
   * @param localPath The relative URI to resolve
   *
   * @return Resolved absolute URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SystemIDResolver.java
public class SystemIDResolver

/**
 * This class is used to resolve relative URIs and SystemID
 * strings into absolute URIs.
 *
 * <p>This is a generic utility for resolving URIs, other than the
 * fact that it's declared to throw TransformerException.  Please
 * see code comments for details on how resolution is performed.</p>
 * @xsl.usage internal
 */
