_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/FileURL.java
    } else {

      return new URL("file:///" + userdir + pathname);
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/FileURL.java
  public static URL makeURL(String pathname) throws MalformedURLException {

  /**
   * Construct a file: URL for a path name.
   *
   * <p>URLs in the file: scheme can be constructed for paths on
   * the local file system. Several possibilities need to be considered:
   * </p>
   *
   * <ul>
   * <li>If the path does not begin with a slash, then it is assumed
   * to reside in the users current working directory
   * (System.getProperty("user.dir")).</li>
   * <li>On Windows machines, the current working directory uses
   * backslashes (\\, instead of /).</li>
   * <li>If the current working directory is "/", don't add an extra
   * slash before the base name.</li>
   * </ul>
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param pathname The path name component for which to construct a URL.
   *
   * @return The appropriate file: URL.
   *
   * @throws MalformedURLException if the pathname can't be turned into
   *         a proper URL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/FileURL.java
public abstract class FileURL {

/**
 * Static method for dealing with file: URLs.
 *
 * <p>This class defines a static method that can be used to construct
 * an appropriate file: URL from parts. It's defined here so that it
 * can be reused throught the resolver.</p>
 *
 * <p>(Yes, I'd rather have called this class FileUR<b>I</b>, but
 * given that a jave.net.URL is returned, it seemed...even more
 * confusing.)</p>
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/FileURL.java
    } else {

      return new URL("file:///" + userdir + pathname);
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/FileURL.java
  public static URL makeURL(String pathname) throws MalformedURLException {

  /**
   * Construct a file: URL for a path name.
   *
   * <p>URLs in the file: scheme can be constructed for paths on
   * the local file system. Several possibilities need to be considered:
   * </p>
   *
   * <ul>
   * <li>If the path does not begin with a slash, then it is assumed
   * to reside in the users current working directory
   * (System.getProperty("user.dir")).</li>
   * <li>On Windows machines, the current working directory uses
   * backslashes (\\, instead of /).</li>
   * <li>If the current working directory is "/", don't add an extra
   * slash before the base name.</li>
   * </ul>
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param pathname The path name component for which to construct a URL.
   *
   * @return The appropriate file: URL.
   *
   * @throws MalformedURLException if the pathname can't be turned into
   *         a proper URL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/FileURL.java
public abstract class FileURL {

/**
 * Static method for dealing with file: URLs.
 *
 * <p>This class defines a static method that can be used to construct
 * an appropriate file: URL from parts. It's defined here so that it
 * can be reused throught the resolver.</p>
 *
 * <p>(Yes, I'd rather have called this class FileUR<b>I</b>, but
 * given that a jave.net.URL is returned, it seemed...even more
 * confusing.)</p>
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
