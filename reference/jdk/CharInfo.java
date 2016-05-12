_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public final boolean equals(Object obj)

      /**
       * Override of equals() for this object
       *
       * @param obj to compare to
       *
       * @return True if this object equals this string value
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public final int hashCode()

      /**
       * Get the hash value of the character.
       *
       * @return hash value of the character.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public final void setChar(char c)

      /**
       * Get the hash value of the character.
       *
       * @return hash value of the character.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public CharKey()

      /**
       * Default constructor for a CharKey.
       *
       * @param key char value of this object.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public CharKey(char key)

      /**
       * Constructor CharKey
       *
       * @param key char value of this object.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      private char m_char;

      /** String value          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static class CharKey extends Object

    /**
     * Simple class for fast lookup of char values, when used with
     * hashtables.  You can set the char, then use it as a key.
     *
     * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
     * It exists to cut the serializers dependancy on that package.
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private void setASCIIclean(int j)

    /**
     * If the character is a printable ASCII character then
     * mark it as and not needing replacement with
     * a String on output.
     * @param ch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private void setASCIIdirty(int j)

    /**
     * If the character is a printable ASCII character then
     * mark it as not clean and needing replacement with
     * a String on output.
     * @param ch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private boolean extraEntity(int entityValue)

    /**
     * @return true if the entity
     * @param code The value of the character that has an entity defined
     * for it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private final boolean get(int i) {

    /**
     * Return true if the integer (character)is in the set of integers.
     *
     * This implementation uses an array of integers with 32 bits per
     * integer.  If a bit is set to 1 the corresponding integer is
     * in the set of integers.
     *
     * @param i an integer that is tested to see if it is the
     * set of integers, or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private final void set(int i) {

    /**
     * Adds the integer (character) to the set of integers.
     * @param i the integer to add to the set, valid values are
     * 0, 1, 2 ... up to the maximum that was specified at
     * the creation of the set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private int[] createEmptySetOfIntegers(int max) {

    /**
     * Creates a new empty set of integers (characters)
     * @param max the maximum integer to be in the set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static int bit(int i) {

    /**
     * For a given integer in the set it returns the single bit
     * value used within a given word that represents whether
     * the integer is in the set or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static int arrayIndex(int i) {

    /**
     * Returns the array element holding the bit value for the
     * given integer
     * @param i the integer that might be in the set of integers
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static HashMap m_getCharInfoCache = new HashMap();

    /** Table of user-specified char infos. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    static CharInfo getCharInfo(String entitiesFileName, String method)

    /**
     * Constructs a CharInfo object using the following process to try reading
     * the entitiesFileName parameter:
     *
     *   1) attempt to load it as a ResourceBundle
     *   2) try using the class loader to find the specified file
     *   3) try opening it as an URI
     *
     * In case of 2 and 3, the resource file must be encoded in UTF-8 and have the
     * following format:
     * <pre>
     * # First char # is a comment
     * Entity numericValue
     * quot 34
     * amp 38
     * </pre>
     *
     * @param entitiesFileName Name of entities resource file that should
     * be loaded, which describes the mapping of characters to entity references.
     * @param method the output method type, which should be one of "xml", "html", and "text".
     * @return an instance of CharInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    static CharInfo getCharInfoInternal(String entitiesFileName, String method)

    /**
     * Read an internal resource file that describes the mapping of
     * characters to entity references; Construct a CharInfo object.
     *
     * @param entitiesFileName Name of entities resource file that should
     * be loaded, which describes the mapping of characters to entity references.
     * @param method the output method type, which should be one of "xml", "html", and "text".
     * @return an instance of CharInfo
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean isTextASCIIClean(int value)

    /**
     * This method is used to determine if an ASCII character in
     * a text node (not an attribute value) is "clean".
     * @param value the character to check (0 to 127).
     * @return true if the character can go to the writer as-is
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean isSpecialTextChar(int value)

    /**
     * Tell if the character argument that is from a
     * text node should have special treatment.
     *
     * @param value the value of a character that is in a text node
     * @return true if the character should have any special treatment,
     * such as when writing out attribute values,
     * or entity references.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean isSpecialAttrChar(int value)

    /**
     * Tell if the character argument that is from
     * an attribute value should have special treatment.
     *
     * @param value the value of a character that is in an attribute value
     * @return true if the character should have any special treatment,
     * such as when writing out attribute values,
     * or entity references.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    String getOutputStringForChar(char value)

    /**
     * Map a character to a String. For example given
     * the character '>' this method would return the fully decorated
     * entity name "&lt;".
     * Strings for entity references are loaded from a properties file,
     * but additional mappings defined through calls to defineChar2String()
     * are possible. Such entity reference mappings could be over-ridden.
     *
     * This is reusing a stored key object, in an effort to avoid
     * heap activity. Unfortunately, that introduces a threading risk.
     * Simplest fix for now is to make it a synchronized method, or to give
     * up the reuse; I see very little performance difference between them.
     * Long-term solution would be to replace the hashtable with a sparse array
     * keyed directly from the character's integer value; see DTM's
     * string pool for a related solution.
     *
     * @param value The character that should be resolved to
     * a String, e.g. resolve '>' to  "&lt;".
     *
     * @return The String that the character is mapped to, or null if not found.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private void defineEntity(String name, char value)

    /**
     * Defines a new character reference. The reference's name and value are
     * supplied. Nothing happens if the character reference is already defined.
     * <p>Unlike internal entities, character references are a string to single
     * character mapping. They are used to map non-ASCII characters both on
     * parsing and printing, primarily for HTML documents. '&lt;amp;' is an
     * example of a character reference.</p>
     *
     * @param name The entity's name
     * @param value The entity's value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private CharInfo(String entitiesResource, String method)

    /**
     * Constructor that reads in a resource file that describes the mapping of
     * characters to entity references.
     * This constructor is private, just to force the use
     * of the getCharInfo(entitiesResource) factory
     *
     * Resource files must be encoded in UTF-8 and can either be properties
     * files with a .properties extension assumed.  Alternatively, they can
     * have the following form, with no particular extension assumed:
     *
     * <pre>
     * # First char # is a comment
     * Entity numericValue
     * quot 34
     * amp 38
     * </pre>
     *
     * @param entitiesResource Name of properties or resource file that should
     * be loaded, which describes that mapping of characters to entity
     * references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private int array_of_bits[] = createEmptySetOfIntegers(65535);

    /** An array of bits to record if the character is in the set.
     * Although information in this array is complete, the
     * isSpecialAttrASCII array is used first because access to its values
     * is common and faster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private boolean[] isSpecialTextASCII = new boolean[ASCII_MAX];

    /** Array of values is faster access than a set of bits
     * to quickly check ASCII characters in text nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private boolean[] isSpecialAttrASCII = new boolean[ASCII_MAX];

    /** Array of values is faster access than a set of bits
     * to quickly check ASCII characters in attribute values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static final int ASCII_MAX = 128;

    /** Copy the first 0,1 ... ASCII_MAX values into an array */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean onlyQuotAmpLtGt;

    /** This flag is an optimization for HTML entities. It false if entities
     * other than quot (34), amp (38), lt (60) and gt (62) are defined
     * in the range 0 to 127.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final char S_CARRIAGERETURN = 0x0D;

    /** The carriage return character, which the parser should always normalize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final char S_LINEFEED = 0x0A;

    /** The linefeed character, which the parser should always normalize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final char S_HORIZONAL_TAB = 0x09;

    /** The horizontal tab character, which the parser should always normalize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final String XML_ENTITIES_RESOURCE =

    /**
     * The name of the XML entities file.
     * If specified, the file will be resource loaded with the default class loader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final String HTML_ENTITIES_RESOURCE =

    /**
     * The name of the HTML entities file.
     * If specified, the file will be resource loaded with the default class loader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private HashMap m_charToString = new HashMap();

    /** Given a character, lookup a String to output (e.g. a decorated entity reference). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
final class CharInfo

/**
 * This class provides services that tell if a character should have
 * special treatement, such as entity reference substitution or normalization
 * of a newline character.  It also provides character to entity reference
 * lookup.
 *
 * DEVELOPERS: See Known Issue in the constructor.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public final boolean equals(Object obj)

      /**
       * Override of equals() for this object
       *
       * @param obj to compare to
       *
       * @return True if this object equals this string value
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public final int hashCode()

      /**
       * Get the hash value of the character.
       *
       * @return hash value of the character.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public final void setChar(char c)

      /**
       * Get the hash value of the character.
       *
       * @return hash value of the character.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public CharKey()

      /**
       * Default constructor for a CharKey.
       *
       * @param key char value of this object.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      public CharKey(char key)

      /**
       * Constructor CharKey
       *
       * @param key char value of this object.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
      private char m_char;

      /** String value          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static class CharKey extends Object

    /**
     * Simple class for fast lookup of char values, when used with
     * hashtables.  You can set the char, then use it as a key.
     *
     * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
     * It exists to cut the serializers dependancy on that package.
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private void setASCIIclean(int j)

    /**
     * If the character is a printable ASCII character then
     * mark it as and not needing replacement with
     * a String on output.
     * @param ch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private void setASCIIdirty(int j)

    /**
     * If the character is a printable ASCII character then
     * mark it as not clean and needing replacement with
     * a String on output.
     * @param ch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private boolean extraEntity(int entityValue)

    /**
     * @return true if the entity
     * @param code The value of the character that has an entity defined
     * for it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private final boolean get(int i) {

    /**
     * Return true if the integer (character)is in the set of integers.
     *
     * This implementation uses an array of integers with 32 bits per
     * integer.  If a bit is set to 1 the corresponding integer is
     * in the set of integers.
     *
     * @param i an integer that is tested to see if it is the
     * set of integers, or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private final void set(int i) {

    /**
     * Adds the integer (character) to the set of integers.
     * @param i the integer to add to the set, valid values are
     * 0, 1, 2 ... up to the maximum that was specified at
     * the creation of the set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private int[] createEmptySetOfIntegers(int max) {

    /**
     * Creates a new empty set of integers (characters)
     * @param max the maximum integer to be in the set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static int bit(int i) {

    /**
     * For a given integer in the set it returns the single bit
     * value used within a given word that represents whether
     * the integer is in the set or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static int arrayIndex(int i) {

    /**
     * Returns the array element holding the bit value for the
     * given integer
     * @param i the integer that might be in the set of integers
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static HashMap m_getCharInfoCache = new HashMap();

    /** Table of user-specified char infos. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    static CharInfo getCharInfo(String entitiesFileName, String method)

    /**
     * Constructs a CharInfo object using the following process to try reading
     * the entitiesFileName parameter:
     *
     *   1) attempt to load it as a ResourceBundle
     *   2) try using the class loader to find the specified file
     *   3) try opening it as an URI
     *
     * In case of 2 and 3, the resource file must be encoded in UTF-8 and have the
     * following format:
     * <pre>
     * # First char # is a comment
     * Entity numericValue
     * quot 34
     * amp 38
     * </pre>
     *
     * @param entitiesFileName Name of entities resource file that should
     * be loaded, which describes the mapping of characters to entity references.
     * @param method the output method type, which should be one of "xml", "html", and "text".
     * @return an instance of CharInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    static CharInfo getCharInfoInternal(String entitiesFileName, String method)

    /**
     * Read an internal resource file that describes the mapping of
     * characters to entity references; Construct a CharInfo object.
     *
     * @param entitiesFileName Name of entities resource file that should
     * be loaded, which describes the mapping of characters to entity references.
     * @param method the output method type, which should be one of "xml", "html", and "text".
     * @return an instance of CharInfo
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean isTextASCIIClean(int value)

    /**
     * This method is used to determine if an ASCII character in
     * a text node (not an attribute value) is "clean".
     * @param value the character to check (0 to 127).
     * @return true if the character can go to the writer as-is
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean isSpecialTextChar(int value)

    /**
     * Tell if the character argument that is from a
     * text node should have special treatment.
     *
     * @param value the value of a character that is in a text node
     * @return true if the character should have any special treatment,
     * such as when writing out attribute values,
     * or entity references.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean isSpecialAttrChar(int value)

    /**
     * Tell if the character argument that is from
     * an attribute value should have special treatment.
     *
     * @param value the value of a character that is in an attribute value
     * @return true if the character should have any special treatment,
     * such as when writing out attribute values,
     * or entity references.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    String getOutputStringForChar(char value)

    /**
     * Map a character to a String. For example given
     * the character '>' this method would return the fully decorated
     * entity name "&lt;".
     * Strings for entity references are loaded from a properties file,
     * but additional mappings defined through calls to defineChar2String()
     * are possible. Such entity reference mappings could be over-ridden.
     *
     * This is reusing a stored key object, in an effort to avoid
     * heap activity. Unfortunately, that introduces a threading risk.
     * Simplest fix for now is to make it a synchronized method, or to give
     * up the reuse; I see very little performance difference between them.
     * Long-term solution would be to replace the hashtable with a sparse array
     * keyed directly from the character's integer value; see DTM's
     * string pool for a related solution.
     *
     * @param value The character that should be resolved to
     * a String, e.g. resolve '>' to  "&lt;".
     *
     * @return The String that the character is mapped to, or null if not found.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private void defineEntity(String name, char value)

    /**
     * Defines a new character reference. The reference's name and value are
     * supplied. Nothing happens if the character reference is already defined.
     * <p>Unlike internal entities, character references are a string to single
     * character mapping. They are used to map non-ASCII characters both on
     * parsing and printing, primarily for HTML documents. '&lt;amp;' is an
     * example of a character reference.</p>
     *
     * @param name The entity's name
     * @param value The entity's value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private CharInfo(String entitiesResource, String method)

    /**
     * Constructor that reads in a resource file that describes the mapping of
     * characters to entity references.
     * This constructor is private, just to force the use
     * of the getCharInfo(entitiesResource) factory
     *
     * Resource files must be encoded in UTF-8 and can either be properties
     * files with a .properties extension assumed.  Alternatively, they can
     * have the following form, with no particular extension assumed:
     *
     * <pre>
     * # First char # is a comment
     * Entity numericValue
     * quot 34
     * amp 38
     * </pre>
     *
     * @param entitiesResource Name of properties or resource file that should
     * be loaded, which describes that mapping of characters to entity
     * references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private int array_of_bits[] = createEmptySetOfIntegers(65535);

    /** An array of bits to record if the character is in the set.
     * Although information in this array is complete, the
     * isSpecialAttrASCII array is used first because access to its values
     * is common and faster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private boolean[] isSpecialTextASCII = new boolean[ASCII_MAX];

    /** Array of values is faster access than a set of bits
     * to quickly check ASCII characters in text nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private boolean[] isSpecialAttrASCII = new boolean[ASCII_MAX];

    /** Array of values is faster access than a set of bits
     * to quickly check ASCII characters in attribute values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private static final int ASCII_MAX = 128;

    /** Copy the first 0,1 ... ASCII_MAX values into an array */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    final boolean onlyQuotAmpLtGt;

    /** This flag is an optimization for HTML entities. It false if entities
     * other than quot (34), amp (38), lt (60) and gt (62) are defined
     * in the range 0 to 127.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final char S_CARRIAGERETURN = 0x0D;

    /** The carriage return character, which the parser should always normalize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final char S_LINEFEED = 0x0A;

    /** The linefeed character, which the parser should always normalize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final char S_HORIZONAL_TAB = 0x09;

    /** The horizontal tab character, which the parser should always normalize. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final String XML_ENTITIES_RESOURCE =

    /**
     * The name of the XML entities file.
     * If specified, the file will be resource loaded with the default class loader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    public static final String HTML_ENTITIES_RESOURCE =

    /**
     * The name of the HTML entities file.
     * If specified, the file will be resource loaded with the default class loader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
    private HashMap m_charToString = new HashMap();

    /** Given a character, lookup a String to output (e.g. a decorated entity reference). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/CharInfo.java
final class CharInfo

/**
 * This class provides services that tell if a character should have
 * special treatement, such as entity reference substitution or normalization
 * of a newline character.  It also provides character to entity reference
 * lookup.
 *
 * DEVELOPERS: See Known Issue in the constructor.
 *
 * @xsl.usage internal
 */
