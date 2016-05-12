_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static String trim(String value) {

    /**
     * Trims space characters as defined by production [3] in
     * the XML 1.0 specification from both ends of the given string.
     *
     * @param value the string to be trimmed
     * @return the given string with the space characters trimmed
     * from both ends
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidJavaEncoding(String javaEncoding) {

    /**
     * Returns true if the encoding name is a valid Java encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * Java encoding name.
     *
     * @param javaEncoding The Java encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidIANAEncoding(String ianaEncoding) {

    /**
     * Returns true if the encoding name is a valid IANA encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * IANA encoding name.
     *
     * @param ianaEncoding The IANA encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.0 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.0 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.0 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isPubid(int c) {

    /**
     * Returns true if the specified character is a valid Pubid
     * character as defined by production [13] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isNCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isNCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isName(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isNameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [5] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isSpace(int c) {

    /**
     * Returns true if the specified character is a space character
     * as defined by production [3] in the XML 1.0 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isMarkup(int c) {

    /**
     * Returns true if the specified character can be considered markup.
     * Markup characters include '&lt;', '&amp;', and '%'.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isContent(int c) {

    /**
     * Returns true if the specified character can be considered content.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isInvalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isLowSurrogate(int c) {

    /**
     * Returns whether the given character is a low surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isHighSurrogate(int c) {

    /**
     * Returns whether the given character is a high surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static char lowSurrogate(int c) {

    /**
     * Returns the low surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static char highSurrogate(int c) {

    /**
     * Returns the high surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static int supplemental(char h, char l) {

    /**
     * Returns true the supplemental character corresponding to the given
     * surrogates.
     *
     * @param h The high surrogate.
     * @param l The low surrogate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isSupplemental(int c) {

    /**
     * Returns true if the specified character is a supplemental character.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NCNAME = 0x80;

    /** NCName character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NCNAME_START = 0x40;

    /** NCName start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_CONTENT = 0x20;

    /**
     * Content character mask. Special characters are those that can
     * be considered the start of markup, such as '&lt;' and '&amp;'.
     * The various newline characters are considered special as well.
     * All other valid XML characters can be considered content.
     * <p>
     * This is an optimization for the inner loop of character scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_PUBID = 0x10;

    /** Pubid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NAME = 0x08;

    /** Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NAME_START = 0x04;

    /** Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_SPACE = 0x02;

    /** Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_VALID = 0x01;

    /** Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    private static final byte[] CHARS = new byte[1 << 16];

    /** Character flags. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
public class XMLChar {

/**
 * This class defines the basic XML character properties. The data
 * in this class can be used to verify that a character is a valid
 * XML character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer. Because inlining the checks can improve per
 * character performance, the tables of character properties are
 * public. Using the character as an index into the <code>CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Eric Ye, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Michael Glavassevich, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: XMLChar.java,v 1.7 2010-11-01 04:40:15 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidQName(String str) {

   /**
     * Simple check to determine if qname is legal. If it returns false
     * then <param>str</param> is illegal; if it returns true then
     * <param>str</param> is legal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidJavaEncoding(String javaEncoding) {

    /**
     * Returns true if the encoding name is a valid Java encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * Java encoding name.
     *
     * @param javaEncoding The Java encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidIANAEncoding(String ianaEncoding) {

    /**
     * Returns true if the encoding name is a valid IANA encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * IANA encoding name.
     *
     * @param ianaEncoding The IANA encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.0 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.0 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.0 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isPubid(int c) {

    /**
     * Returns true if the specified character is a valid Pubid
     * character as defined by production [13] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isNCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isNCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isName(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isNameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [5] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isSpace(int c) {

    /**
     * Returns true if the specified character is a space character
     * as defined by production [3] in the XML 1.0 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isMarkup(int c) {

    /**
     * Returns true if the specified character can be considered markup.
     * Markup characters include '&lt;', '&amp;', and '%'.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isContent(int c) {

    /**
     * Returns true if the specified character can be considered content.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isInvalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isLowSurrogate(int c) {

    /**
     * Returns whether the given character is a low surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isHighSurrogate(int c) {

    /**
     * Returns whether the given character is a high surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static char lowSurrogate(int c) {

    /**
     * Returns the low surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static char highSurrogate(int c) {

    /**
     * Returns the high surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static int supplemental(char h, char l) {

    /**
     * Returns true the supplemental character corresponding to the given
     * surrogates.
     *
     * @param h The high surrogate.
     * @param l The low surrogate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isSupplemental(int c) {

    /**
     * Returns true if the specified character is a supplemental character.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NCNAME = 0x80;

    /** NCName character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NCNAME_START = 0x40;

    /** NCName start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_CONTENT = 0x20;

    /**
     * Content character mask. Special characters are those that can
     * be considered the start of markup, such as '&lt;' and '&amp;'.
     * The various newline characters are considered special as well.
     * All other valid XML characters can be considered content.
     * <p>
     * This is an optimization for the inner loop of character scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_PUBID = 0x10;

    /** Pubid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NAME = 0x08;

    /** Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NAME_START = 0x04;

    /** Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_SPACE = 0x02;

    /** Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_VALID = 0x01;

    /** Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    private static final byte[] CHARS = new byte[1 << 16];

    /** Character flags. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
public class XMLChar {

/**
 * This class defines the basic XML character properties. The data
 * in this class can be used to verify that a character is a valid
 * XML character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer. Because inlining the checks can improve per
 * character performance, the tables of character properties are
 * public. Using the character as an index into the <code>CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Eric Ye, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static String trim(String value) {

    /**
     * Trims space characters as defined by production [3] in
     * the XML 1.0 specification from both ends of the given string.
     *
     * @param value the string to be trimmed
     * @return the given string with the space characters trimmed
     * from both ends
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidJavaEncoding(String javaEncoding) {

    /**
     * Returns true if the encoding name is a valid Java encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * Java encoding name.
     *
     * @param javaEncoding The Java encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidIANAEncoding(String ianaEncoding) {

    /**
     * Returns true if the encoding name is a valid IANA encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * IANA encoding name.
     *
     * @param ianaEncoding The IANA encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.0 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.0 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.0 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isPubid(int c) {

    /**
     * Returns true if the specified character is a valid Pubid
     * character as defined by production [13] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isNCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isNCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isName(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isNameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [5] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isSpace(int c) {

    /**
     * Returns true if the specified character is a space character
     * as defined by production [3] in the XML 1.0 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isMarkup(int c) {

    /**
     * Returns true if the specified character can be considered markup.
     * Markup characters include '&lt;', '&amp;', and '%'.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isContent(int c) {

    /**
     * Returns true if the specified character can be considered content.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isInvalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isValid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isLowSurrogate(int c) {

    /**
     * Returns whether the given character is a low surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isHighSurrogate(int c) {

    /**
     * Returns whether the given character is a high surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static char lowSurrogate(int c) {

    /**
     * Returns the low surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static char highSurrogate(int c) {

    /**
     * Returns the high surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static int supplemental(char h, char l) {

    /**
     * Returns true the supplemental character corresponding to the given
     * surrogates.
     *
     * @param h The high surrogate.
     * @param l The low surrogate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static boolean isSupplemental(int c) {

    /**
     * Returns true if the specified character is a supplemental character.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NCNAME = 0x80;

    /** NCName character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NCNAME_START = 0x40;

    /** NCName start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_CONTENT = 0x20;

    /**
     * Content character mask. Special characters are those that can
     * be considered the start of markup, such as '&lt;' and '&amp;'.
     * The various newline characters are considered special as well.
     * All other valid XML characters can be considered content.
     * <p>
     * This is an optimization for the inner loop of character scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_PUBID = 0x10;

    /** Pubid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NAME = 0x08;

    /** Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_NAME_START = 0x04;

    /** Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_SPACE = 0x02;

    /** Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    public static final int MASK_VALID = 0x01;

    /** Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
    private static final byte[] CHARS = new byte[1 << 16];

    /** Character flags. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLChar.java
public class XMLChar {

/**
 * This class defines the basic XML character properties. The data
 * in this class can be used to verify that a character is a valid
 * XML character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer. Because inlining the checks can improve per
 * character performance, the tables of character properties are
 * public. Using the character as an index into the <code>CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Eric Ye, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Michael Glavassevich, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: XMLChar.java,v 1.7 2010-11-01 04:40:15 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidQName(String str) {

   /**
     * Simple check to determine if qname is legal. If it returns false
     * then <param>str</param> is illegal; if it returns true then
     * <param>str</param> is legal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidJavaEncoding(String javaEncoding) {

    /**
     * Returns true if the encoding name is a valid Java encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * Java encoding name.
     *
     * @param javaEncoding The Java encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidIANAEncoding(String ianaEncoding) {

    /**
     * Returns true if the encoding name is a valid IANA encoding.
     * This method does not verify that there is a decoder available
     * for this encoding, only that the characters are valid for an
     * IANA encoding name.
     *
     * @param ianaEncoding The IANA encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.0 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.0 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.0 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isPubid(int c) {

    /**
     * Returns true if the specified character is a valid Pubid
     * character as defined by production [13] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isNCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isNCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isName(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isNameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [5] in the XML 1.0
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isSpace(int c) {

    /**
     * Returns true if the specified character is a space character
     * as defined by production [3] in the XML 1.0 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isMarkup(int c) {

    /**
     * Returns true if the specified character can be considered markup.
     * Markup characters include '&lt;', '&amp;', and '%'.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isContent(int c) {

    /**
     * Returns true if the specified character can be considered content.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isInvalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isValid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isLowSurrogate(int c) {

    /**
     * Returns whether the given character is a low surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isHighSurrogate(int c) {

    /**
     * Returns whether the given character is a high surrogate
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static char lowSurrogate(int c) {

    /**
     * Returns the low surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static char highSurrogate(int c) {

    /**
     * Returns the high surrogate of a supplemental character
     *
     * @param c The supplemental character to "split".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static int supplemental(char h, char l) {

    /**
     * Returns true the supplemental character corresponding to the given
     * surrogates.
     *
     * @param h The high surrogate.
     * @param l The low surrogate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static boolean isSupplemental(int c) {

    /**
     * Returns true if the specified character is a supplemental character.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NCNAME = 0x80;

    /** NCName character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NCNAME_START = 0x40;

    /** NCName start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_CONTENT = 0x20;

    /**
     * Content character mask. Special characters are those that can
     * be considered the start of markup, such as '&lt;' and '&amp;'.
     * The various newline characters are considered special as well.
     * All other valid XML characters can be considered content.
     * <p>
     * This is an optimization for the inner loop of character scanning.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_PUBID = 0x10;

    /** Pubid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NAME = 0x08;

    /** Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_NAME_START = 0x04;

    /** Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_SPACE = 0x02;

    /** Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    public static final int MASK_VALID = 0x01;

    /** Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
    private static final byte[] CHARS = new byte[1 << 16];

    /** Character flags. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XMLChar.java
public class XMLChar {

/**
 * This class defines the basic XML character properties. The data
 * in this class can be used to verify that a character is a valid
 * XML character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer. Because inlining the checks can improve per
 * character performance, the tables of character properties are
 * public. Using the character as an index into the <code>CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Eric Ye, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
