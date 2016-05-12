_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static void defineEntity( String name, char value )

    /**
     * Defines a new character reference. The reference's name and value are
     * supplied. Nothing happens if the character reference is already defined.
     * <P>
     * Unlike internal entities, character references are a string to single
     * character mapping. They are used to map non-ASCII characters both on
     * parsing and printing, primarily for HTML documents. '&lt;amp;' is an
     * example of a character reference.
     *
     * @param name The entity's name
     * @param value The entity's value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static void initialize()

    /**
     * Initialize upon first access. Will load all the HTML character references
     * into a list that is accessible by name or character value and is optimized
     * for character substitution. This method may be called any number of times
     * but will execute only once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static String fromChar(int value )

    /**
     * Returns the name of an HTML character reference based on its character
     * value. Only valid for entities defined from character references. If no
     * such character value was defined, return null.
     *
     * @param value Character value of entity
     * @return Entity's name or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static int charFromName( String name )

    /**
     * Returns the value of an HTML character reference by its name. If the
     * reference is not found or was not defined as a character reference,
     * returns EOF (-1).
     *
     * @param name Name of character reference
     * @return Character code or EOF (-1)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isBoolean( String tagName, String attrName )

    /**
     * Returns true if the specified attribute is a boolean and should be
     * printed without the value. This applies to attributes that are true
     * if they exist, such as selected (OPTION/INPUT).
     *
     * @param tagName The element's tag name
     * @param attrName The attribute's name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isURI( String tagName, String attrName )

    /**
     * Returns true if the specified attribute it a URI and should be
     * escaped appropriately. In HTML URIs are escaped differently
     * than normal attributes.
     *
     * @param tagName The element's tag name
     * @param attrName The attribute's name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isClosing( String tagName, String openTag )

    /**
     * Returns true if the opening of one element (<tt>tagName</tt>) implies
     * the closing of another open element (<tt>openTag</tt>). For example,
     * every opening <tt>LI</tt> will close the previously open <tt>LI</tt>,
     * and every opening <tt>BODY</tt> will close the previously open <tt>HEAD</tt>.
     *
     * @param tagName The newly opened element
     * @param openTag The already opened element
     * @return True if closing tag closes opening tag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isOnlyOpening( String tagName )

    /**
     * Returns true if element's closing tag is generally not printed.
     * For example, <tt>LI</tt> should not print the closing tag.
     *
     * @param tagName The element tag name (upper case)
     * @return True if only opening tag should be printed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isOptionalClosing( String tagName )

    /**
     * Returns true if element's closing tag is optional and need not
     * exist. An error will not be reported for such elements if they
     * are not closed. For example, <tt>LI</tt> is most often not closed.
     *
     * @param tagName The element tag name (upper case)
     * @return True if closing tag implied
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isPreserveSpace( String tagName )

    /**
     * Returns true if element's textual contents preserves spaces.
     * This only applies to PRE and TEXTAREA, all other HTML elements
     * do not preserve space.
     *
     * @param tagName The element tag name (upper case)
     * @return True if element's text content preserves spaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isElementContent( String tagName )

    /**
     * Returns true if element is declared to have element content.
     * Whitespaces appearing inside element content will be ignored,
     * other text will simply report an error.
     *
     * @param tagName The element tag name (upper case)
     * @return True if element content
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isEmptyTag( String tagName )

    /**
     * Returns true if element is declared to be empty. HTML elements are
     * defines as empty in the DTD, not by the document syntax.
     *
     * @param tagName The element tag name (upper case)
     * @return True if element is empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_TH_TD  = 0x04000;

    /**
     * When opened, closes TH or TD.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_TABLE  = 0x0200;

    /**
     * When opened, closes another table section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_SELF   = 0x0100;

    /**
     * When opened, closes itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_DD_DT  = 0x0080;

    /**
     * When opened, closes DD or DT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_P      = 0x0040;

    /**
     * When opened, closes P.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int ALLOWED_HEAD = 0x0020;

    /**
     * Allowed to appear in head.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int EMPTY        = 0x0010 | ONLY_OPENING;

    /**
     * Element is empty (also means only opening tag)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int OPT_CLOSING  = 0x0008;

    /**
     * Optional closing tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int PRESERVE     = 0x0004;

    /**
     * Element preserve spaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int ELEM_CONTENT = 0x0002;

    /**
     * Element contains element content only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int ONLY_OPENING = 0x0001;

    /**
     * Only opening tag should be printed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final String     ENTITIES_RESOURCE = "HTMLEntities.res";

    /**
     * Locates the HTML entities file that is loaded upon initialization.
     * This file is a resource loaded with the default class loader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final Map<String, Integer> _elemDefs;

    /**
     * Holds element definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static Map<String, Integer> _byName;

    /**
     * Table of entity name to value mapping. Entities are held as strings,
     * character references as <TT>Character</TT> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static Map<Integer, String> _byChar;

    /**
     * Table of reverse character reference mapping. Character codes are held
     * as single-character strings, mapped to their reference name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String XHTMLSystemId =

    /**
     * System identifier for XHTML 1.0 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String XHTMLPublicId =

    /**
     * Public identifier for XHTML 1.0 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String HTMLSystemId =

    /**
     * System identifier for HTML 4.01 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String HTMLPublicId = "-//W3C//DTD HTML 4.01//EN";

    /**
     * Public identifier for HTML 4.01 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
public final class HTMLdtd

/**
 * Utility class for accessing information specific to HTML documents.
 * The HTML DTD is expressed as three utility function groups. Two methods
 * allow for checking whether an element requires an open tag on printing
 * ({@link #isEmptyTag}) or on parsing ({@link #isOptionalClosing}).
 * <P>
 * Two other methods translate character references from name to value and
 * from value to name. A small entities resource is loaded into memory the
 * first time any of these methods is called for fast and efficient access.
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static void defineEntity( String name, char value )

    /**
     * Defines a new character reference. The reference's name and value are
     * supplied. Nothing happens if the character reference is already defined.
     * <P>
     * Unlike internal entities, character references are a string to single
     * character mapping. They are used to map non-ASCII characters both on
     * parsing and printing, primarily for HTML documents. '&lt;amp;' is an
     * example of a character reference.
     *
     * @param name The entity's name
     * @param value The entity's value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static void initialize()

    /**
     * Initialize upon first access. Will load all the HTML character references
     * into a list that is accessible by name or character value and is optimized
     * for character substitution. This method may be called any number of times
     * but will execute only once.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static String fromChar(int value )

    /**
     * Returns the name of an HTML character reference based on its character
     * value. Only valid for entities defined from character references. If no
     * such character value was defined, return null.
     *
     * @param value Character value of entity
     * @return Entity's name or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static int charFromName( String name )

    /**
     * Returns the value of an HTML character reference by its name. If the
     * reference is not found or was not defined as a character reference,
     * returns EOF (-1).
     *
     * @param name Name of character reference
     * @return Character code or EOF (-1)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isBoolean( String tagName, String attrName )

    /**
     * Returns true if the specified attribute is a boolean and should be
     * printed without the value. This applies to attributes that are true
     * if they exist, such as selected (OPTION/INPUT).
     *
     * @param tagName The element's tag name
     * @param attrName The attribute's name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isURI( String tagName, String attrName )

    /**
     * Returns true if the specified attribute it a URI and should be
     * escaped appropriately. In HTML URIs are escaped differently
     * than normal attributes.
     *
     * @param tagName The element's tag name
     * @param attrName The attribute's name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isClosing( String tagName, String openTag )

    /**
     * Returns true if the opening of one element (<tt>tagName</tt>) implies
     * the closing of another open element (<tt>openTag</tt>). For example,
     * every opening <tt>LI</tt> will close the previously open <tt>LI</tt>,
     * and every opening <tt>BODY</tt> will close the previously open <tt>HEAD</tt>.
     *
     * @param tagName The newly opened element
     * @param openTag The already opened element
     * @return True if closing tag closes opening tag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isOnlyOpening( String tagName )

    /**
     * Returns true if element's closing tag is generally not printed.
     * For example, <tt>LI</tt> should not print the closing tag.
     *
     * @param tagName The element tag name (upper case)
     * @return True if only opening tag should be printed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isOptionalClosing( String tagName )

    /**
     * Returns true if element's closing tag is optional and need not
     * exist. An error will not be reported for such elements if they
     * are not closed. For example, <tt>LI</tt> is most often not closed.
     *
     * @param tagName The element tag name (upper case)
     * @return True if closing tag implied
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isPreserveSpace( String tagName )

    /**
     * Returns true if element's textual contents preserves spaces.
     * This only applies to PRE and TEXTAREA, all other HTML elements
     * do not preserve space.
     *
     * @param tagName The element tag name (upper case)
     * @return True if element's text content preserves spaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isElementContent( String tagName )

    /**
     * Returns true if element is declared to have element content.
     * Whitespaces appearing inside element content will be ignored,
     * other text will simply report an error.
     *
     * @param tagName The element tag name (upper case)
     * @return True if element content
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static boolean isEmptyTag( String tagName )

    /**
     * Returns true if element is declared to be empty. HTML elements are
     * defines as empty in the DTD, not by the document syntax.
     *
     * @param tagName The element tag name (upper case)
     * @return True if element is empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_TH_TD  = 0x04000;

    /**
     * When opened, closes TH or TD.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_TABLE  = 0x0200;

    /**
     * When opened, closes another table section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_SELF   = 0x0100;

    /**
     * When opened, closes itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_DD_DT  = 0x0080;

    /**
     * When opened, closes DD or DT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int CLOSE_P      = 0x0040;

    /**
     * When opened, closes P.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int ALLOWED_HEAD = 0x0020;

    /**
     * Allowed to appear in head.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int EMPTY        = 0x0010 | ONLY_OPENING;

    /**
     * Element is empty (also means only opening tag)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int OPT_CLOSING  = 0x0008;

    /**
     * Optional closing tag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int PRESERVE     = 0x0004;

    /**
     * Element preserve spaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int ELEM_CONTENT = 0x0002;

    /**
     * Element contains element content only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final int ONLY_OPENING = 0x0001;

    /**
     * Only opening tag should be printed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final String     ENTITIES_RESOURCE = "HTMLEntities.res";

    /**
     * Locates the HTML entities file that is loaded upon initialization.
     * This file is a resource loaded with the default class loader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static final Map<String, Integer> _elemDefs;

    /**
     * Holds element definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static Map<String, Integer> _byName;

    /**
     * Table of entity name to value mapping. Entities are held as strings,
     * character references as <TT>Character</TT> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    private static Map<Integer, String> _byChar;

    /**
     * Table of reverse character reference mapping. Character codes are held
     * as single-character strings, mapped to their reference name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String XHTMLSystemId =

    /**
     * System identifier for XHTML 1.0 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String XHTMLPublicId =

    /**
     * Public identifier for XHTML 1.0 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String HTMLSystemId =

    /**
     * System identifier for HTML 4.01 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
    public static final String HTMLPublicId = "-//W3C//DTD HTML 4.01//EN";

    /**
     * Public identifier for HTML 4.01 (Strict) document type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/HTMLdtd.java
public final class HTMLdtd

/**
 * Utility class for accessing information specific to HTML documents.
 * The HTML DTD is expressed as three utility function groups. Two methods
 * allow for checking whether an element requires an open tag on printing
 * ({@link #isEmptyTag}) or on parsing ({@link #isOptionalClosing}).
 * <P>
 * Two other methods translate character references from name to value and
 * from value to name. A small entities resource is loaded into memory the
 * first time any of these methods is called for fast and efficient access.
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
