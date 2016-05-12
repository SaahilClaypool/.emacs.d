_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.1 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.1 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.1 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NameHighSurrogate(int c) {

    /**
     * Returns whether the given character is a valid
     * high surrogate for a name character. This includes
     * all high surrogates for characters [0x10000-0xEFFFF].
     * In other words everything excluding planes 15 and 16.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Name(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4a] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [4] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11InternalEntityContent(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an internal parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Content(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an external parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidLiteral(int c) {

    /**
     * Returns true if the specified character is valid and permitted outside
     * of a character reference.
     * That is, this method will return false for the same set as
     * isXML11Valid, except it also reports false for "control characters".
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Invalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Valid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>XML11CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Space(int c) {

    /**
     * Returns true if the specified character is a space character
     * as amdended in the XML 1.1 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_CONTENT_INTERNAL = MASK_XML11_CONTROL | MASK_XML11_CONTENT;

    /** XML 1.1 content for internal entities (valid - "special" chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NCNAME = 0x80;

    /** XML namespaces 1.1 NCName */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NCNAME_START = 0x40;

    /** XML namespaces 1.1 NCNameStart */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_CONTENT = 0x20;

    /** XML 1.1 content for external entities (valid - "special" chars - control chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_CONTROL = 0x10;

    /** XML 1.1 control character mask */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NAME = 0x08;

    /** XML 1.1 Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NAME_START = 0x04;

    /** XML 1.1 Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_SPACE = 0x02;

    /** XML 1.1 Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_VALID = 0x01;

    /** XML 1.1 Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    private static final byte XML11CHARS [] = new byte [1 << 16];

    /** Character flags for XML 1.1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
public class XML11Char {

/**
 * This class defines the basic properties of characters in XML 1.1. The data
 * in this class can be used to verify that a character is a valid
 * XML 1.1 character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer.  Using the character as an index into the <code>XML11CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Neil Graham, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XML11Char.java,v 1.7 2010-11-01 04:40:15 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
     public static boolean isXML11ValidQName(String str) {

    /**
      * Simple check to determine if qname is legal. If it returns false
      * then <param>str</param> is illegal; if it returns true then
      * <param>str</param> is legal.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.1 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.1 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.1 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NameHighSurrogate(int c) {

    /**
     * Returns whether the given character is a valid
     * high surrogate for a name character. This includes
     * all high surrogates for characters [0x10000-0xEFFFF].
     * In other words everything excluding planes 15 and 16.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Name(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4a] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [4] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11InternalEntityContent(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an internal parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Content(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an external parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidLiteral(int c) {

    /**
     * Returns true if the specified character is valid and permitted outside
     * of a character reference.
     * That is, this method will return false for the same set as
     * isXML11Valid, except it also reports false for "control characters".
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Invalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Valid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>XML11CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Space(int c) {

    /**
     * Returns true if the specified character is a space character
     * as amdended in the XML 1.1 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_CONTENT_INTERNAL = MASK_XML11_CONTROL | MASK_XML11_CONTENT;

    /** XML 1.1 content for internal entities (valid - "special" chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NCNAME = 0x80;

    /** XML namespaces 1.1 NCName */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NCNAME_START = 0x40;

    /** XML namespaces 1.1 NCNameStart */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_CONTENT = 0x20;

    /** XML 1.1 content for external entities (valid - "special" chars - control chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_CONTROL = 0x10;

    /** XML 1.1 control character mask */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NAME = 0x08;

    /** XML 1.1 Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NAME_START = 0x04;

    /** XML 1.1 Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_SPACE = 0x02;

    /** XML 1.1 Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_VALID = 0x01;

    /** XML 1.1 Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    private static final byte XML11CHARS [] = new byte [1 << 16];

    /** Character flags for XML 1.1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
public class XML11Char {

/**
 * THIS IS A COPY OF THE XERCES-2J CLASS com.sun.org.apache.xerces.internal.utls.XMLChar
 *
 * This class defines the basic properties of characters in XML 1.1. The data
 * in this class can be used to verify that a character is a valid
 * XML 1.1 character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer.  Using the character as an index into the <code>XML11CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.1 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.1 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.1 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NameHighSurrogate(int c) {

    /**
     * Returns whether the given character is a valid
     * high surrogate for a name character. This includes
     * all high surrogates for characters [0x10000-0xEFFFF].
     * In other words everything excluding planes 15 and 16.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Name(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4a] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11NameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [4] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11InternalEntityContent(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an internal parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Content(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an external parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11ValidLiteral(int c) {

    /**
     * Returns true if the specified character is valid and permitted outside
     * of a character reference.
     * That is, this method will return false for the same set as
     * isXML11Valid, except it also reports false for "control characters".
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Invalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Valid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>XML11CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static boolean isXML11Space(int c) {

    /**
     * Returns true if the specified character is a space character
     * as amdended in the XML 1.1 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_CONTENT_INTERNAL = MASK_XML11_CONTROL | MASK_XML11_CONTENT;

    /** XML 1.1 content for internal entities (valid - "special" chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NCNAME = 0x80;

    /** XML namespaces 1.1 NCName */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NCNAME_START = 0x40;

    /** XML namespaces 1.1 NCNameStart */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_CONTENT = 0x20;

    /** XML 1.1 content for external entities (valid - "special" chars - control chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_CONTROL = 0x10;

    /** XML 1.1 control character mask */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NAME = 0x08;

    /** XML 1.1 Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_NAME_START = 0x04;

    /** XML 1.1 Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_SPACE = 0x02;

    /** XML 1.1 Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    public static final int MASK_XML11_VALID = 0x01;

    /** XML 1.1 Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
    private static final byte XML11CHARS [] = new byte [1 << 16];

    /** Character flags for XML 1.1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XML11Char.java
public class XML11Char {

/**
 * This class defines the basic properties of characters in XML 1.1. The data
 * in this class can be used to verify that a character is a valid
 * XML 1.1 character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer.  Using the character as an index into the <code>XML11CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 * @author Glenn Marcy, IBM
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Neil Graham, IBM
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XML11Char.java,v 1.7 2010-11-01 04:40:15 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
     public static boolean isXML11ValidQName(String str) {

    /**
      * Simple check to determine if qname is legal. If it returns false
      * then <param>str</param> is illegal; if it returns true then
      * <param>str</param> is legal.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidNmtoken(String nmtoken) {

    /**
     * Check to see if a string is a valid Nmtoken according to [7]
     * in the XML 1.1 Recommendation
     *
     * @param nmtoken string to check
     * @return true if nmtoken is a valid Nmtoken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidNCName(String ncName) {

    /**
     * Check to see if a string is a valid NCName according to [4]
     * from the XML Namespaces 1.1 Recommendation
     *
     * @param ncName string to check
     * @return true if name is a valid NCName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidName(String name) {

    /**
     * Check to see if a string is a valid Name according to [5]
     * in the XML 1.1 Recommendation
     *
     * @param name string to check
     * @return true if name is a valid Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NameHighSurrogate(int c) {

    /**
     * Returns whether the given character is a valid
     * high surrogate for a name character. This includes
     * all high surrogates for characters [0x10000-0xEFFFF].
     * In other words everything excluding planes 15 and 16.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NCName(int c) {

    /**
     * Returns true if the specified character is a valid NCName
     * character as defined by production [5] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NCNameStart(int c) {

    /**
     * Returns true if the specified character is a valid NCName start
     * character as defined by production [4] in Namespaces in XML
     * 1.1 recommendation.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Name(int c) {

    /**
     * Returns true if the specified character is a valid name
     * character as defined by production [4a] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11NameStart(int c) {

    /**
     * Returns true if the specified character is a valid name start
     * character as defined by production [4] in the XML 1.1
     * specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11InternalEntityContent(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an internal parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Content(int c) {

    /**
     * Returns true if the specified character can be considered
     * content in an external parsed entity.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11ValidLiteral(int c) {

    /**
     * Returns true if the specified character is valid and permitted outside
     * of a character reference.
     * That is, this method will return false for the same set as
     * isXML11Valid, except it also reports false for "control characters".
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Invalid(int c) {

    /**
     * Returns true if the specified character is invalid.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Valid(int c) {

    /**
     * Returns true if the specified character is valid. This method
     * also checks the surrogate character range from 0x10000 to 0x10FFFF.
     * <p>
     * If the program chooses to apply the mask directly to the
     * <code>XML11CHARS</code> array, then they are responsible for checking
     * the surrogate character range.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static boolean isXML11Space(int c) {

    /**
     * Returns true if the specified character is a space character
     * as amdended in the XML 1.1 specification.
     *
     * @param c The character to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_CONTENT_INTERNAL = MASK_XML11_CONTROL | MASK_XML11_CONTENT;

    /** XML 1.1 content for internal entities (valid - "special" chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NCNAME = 0x80;

    /** XML namespaces 1.1 NCName */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NCNAME_START = 0x40;

    /** XML namespaces 1.1 NCNameStart */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_CONTENT = 0x20;

    /** XML 1.1 content for external entities (valid - "special" chars - control chars) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_CONTROL = 0x10;

    /** XML 1.1 control character mask */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NAME = 0x08;

    /** XML 1.1 Name character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_NAME_START = 0x04;

    /** XML 1.1 Name start character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_SPACE = 0x02;

    /** XML 1.1 Space character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    public static final int MASK_XML11_VALID = 0x01;

    /** XML 1.1 Valid character mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
    private static final byte XML11CHARS [] = new byte [1 << 16];

    /** Character flags for XML 1.1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/XML11Char.java
public class XML11Char {

/**
 * THIS IS A COPY OF THE XERCES-2J CLASS com.sun.org.apache.xerces.internal.utls.XMLChar
 *
 * This class defines the basic properties of characters in XML 1.1. The data
 * in this class can be used to verify that a character is a valid
 * XML 1.1 character or if the character is a space, name start, or name
 * character.
 * <p>
 * A series of convenience methods are supplied to ease the burden
 * of the developer.  Using the character as an index into the <code>XML11CHARS</code>
 * array and applying the appropriate mask flag (e.g.
 * <code>MASK_VALID</code>), yields the same results as calling the
 * convenience methods. There is one exception: check the comments
 * for the <code>isValid</code> method for details.
 *
 */
