_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  private static String stringReplace(String str,
                                      String oldStr,
                                      String newStr) {

  /**
   * Replace one string with another.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  public static String decodeURN(String urn) {

  /**
   * Decode a "publicid" URN into a public identifier.
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param urn The urn:publicid: URN
   *
   * @return The normalized identifier.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  public static String encodeURN(String publicId) {

  /**
   * Encode a public identifier as a "publicid" URN.
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param publicId The unnormalized public identifier.
   *
   * @return The normalized identifier.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  public static String normalize(String publicId) {

  /**
   * Normalize a public identifier.
   *
   * <p>Public identifiers must be normalized according to the following
   * rules before comparisons between them can be made:</p>
   *
   * <ul>
   * <li>Whitespace characters are normalized to spaces (e.g., line feeds,
   * tabs, etc. become spaces).</li>
   * <li>Leading and trailing whitespace is removed.</li>
   * <li>Multiple internal whitespaces are normalized to a single
   * space.</li>
   * </ul>
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param publicId The unnormalized public identifier.
   *
   * @return The normalized identifier.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
public abstract class PublicId {

/**
 * Static methods for dealing with public identifiers.
 *
 * <p>This class defines a set of static methods that can be called
 * to handle public identifiers.</p>
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  private static String stringReplace(String str,
                                      String oldStr,
                                      String newStr) {

  /**
   * Replace one string with another.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  public static String decodeURN(String urn) {

  /**
   * Decode a "publicid" URN into a public identifier.
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param urn The urn:publicid: URN
   *
   * @return The normalized identifier.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  public static String encodeURN(String publicId) {

  /**
   * Encode a public identifier as a "publicid" URN.
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param publicId The unnormalized public identifier.
   *
   * @return The normalized identifier.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
  public static String normalize(String publicId) {

  /**
   * Normalize a public identifier.
   *
   * <p>Public identifiers must be normalized according to the following
   * rules before comparisons between them can be made:</p>
   *
   * <ul>
   * <li>Whitespace characters are normalized to spaces (e.g., line feeds,
   * tabs, etc. become spaces).</li>
   * <li>Leading and trailing whitespace is removed.</li>
   * <li>Multiple internal whitespaces are normalized to a single
   * space.</li>
   * </ul>
   *
   * <p>This method is declared static so that other classes
   * can use it directly.</p>
   *
   * @param publicId The unnormalized public identifier.
   *
   * @return The normalized identifier.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/helpers/PublicId.java
public abstract class PublicId {

/**
 * Static methods for dealing with public identifiers.
 *
 * <p>This class defines a set of static methods that can be called
 * to handle public identifiers.</p>
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
