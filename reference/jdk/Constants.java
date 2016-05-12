_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final byte ITEM_Bogus      = 0;

  /** Constants used in the StackMap attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final byte ATTR_UNKNOWN                                 = -1;

  /** Attributes and their corresponding names.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final int[] PRODUCE_STACK = {

  /**
   * Number of words produced onto operand stack by instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final int[] CONSUME_STACK = {

  /**
   * Number of words consumed on operand stack by instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] OPCODE_NAMES = {

  /**
   * Names of opcodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short[][] TYPE_OF_OPERANDS = {

  /**
   * How the byte code operands are to be interpreted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short[] NO_OF_OPERANDS = {

  /**
   * Number of byte code operands, i.e., number of bytes after the tag byte
   * itself.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] SHORT_TYPE_NAMES = {

  /** The signature characters corresponding to primitive types,
   * e.g., SHORT_TYPE_NAMES[T_INT] = "I"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] CLASS_TYPE_NAMES = {

  /** The primitive class names corresponding to the T_XX constants,
   * e.g., CLASS_TYPE_NAMES[T_INT] = "java.lang.Integer"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] TYPE_NAMES = {

  /** The primitive type names corresponding to the T_XX constants,
   * e.g., TYPE_NAMES[T_INT] = "int"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short  UNDEFINED      = -1;

  /**
   * Illegal codes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short PUSH             = 4711;

  /**
   * For internal purposes only.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short BREAKPOINT                = 202;

  /**
   * Non-legal opcodes, may be used by JVM internally.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short NOP              = 0;

  /** Java VM opcodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final int MAX_CP_ENTRIES     = 65535;

  /**
   * Limitations of the Java Virtual Machine.
   * See The Java Virtual Machine Specification, Second Edition, page 152, chapter 4.10.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static String[] INTERFACES_IMPLEMENTED_BY_ARRAYS = {"java.lang.Cloneable", "java.io.Serializable"};

  /** The names of the interfaces implemented by arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static String CONSTRUCTOR_NAME = "<init>";

  /** The name of every constructor method in a class, also called
   * &quot;instance initialization method&quot;. This is &quot;&lt;init&gt;&quot;.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static String STATIC_INITIALIZER_NAME = "<clinit>";

  /** The name of the static initializer, also called &quot;class
   *  initialization method&quot; or &quot;interface initialization
   *   method&quot;. This is &quot;&lt;clinit&gt;&quot;.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static byte CONSTANT_Utf8               = 1;

  /** Tags in constant pool to denote type of constant.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static short ACC_PUBLIC       = 0x0001;

  /** Access flags for classes, fields and methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static int MAX_BYTE  = 255; // 2^8 - 1

  /** Maximum value for an unsigned byte.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static int MAX_SHORT = 65535; // 2^16 - 1

  /** Maximum value for an unsigned short.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
public interface Constants {

/**
 * Constants for the project, mostly defined in the JVM specification.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRNAME_XXXX = "XXXX";

  /** temp dummy         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_INFINITY = "Infinity",

  /** some stuff for Decimal-format       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int SORTCASEORDER_UPPERFIRST = 1, SORTCASEORDER_LOWERFIRST = 2;

  /** Integer equivelents for CASE-ORDER attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int SORTORDER_ASCENDING = 1, SORTORDER_DESCENDING = 2;

  /** Integer equivelents for ORDER attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int SORTDATATYPE_TEXT = 1, SORTDATATYPE_NUMBER = 2;

 /** Integer equivelents for DATATYPE attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_DATATYPE_TEXT = "text",

  /** Stuff for sorting      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_THIS = ".", ATTRVAL_PARENT = "..",

  /** some stuff for my patterns-by-example         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int NUMBERLEVEL_SINGLE = 1, NUMBERLEVEL_MULTI = 2,

  /** Integer equivelents for above        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int NUMBERLETTER_ALPHABETIC = 1, NUMBERLETTER_TRADITIONAL = 2;

 /** Integer equivalents for above        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_DEFAULT_PREFIX = "#default";

  /** For Stylesheet-prefix and result-prefix in xsl:namespace-alias          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_SINGLE = "single",

  /** For level attribute in xsl:number.          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_ALPHABETIC = "alphabetic",

  /** For letter-value attribute (part of conversion attributes).          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final boolean ATTRVAL_YES = true, ATTRVAL_NO = false;

  /** For indent-result          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_OUTPUT_METHOD_HTML = "html",

  /** Mnemonics for the possible values of the xsl:output element's
   * method= attribute:
   * <ul>
   * <li>ATTRVAL_OUTPUT_METHOD_XML = Use an XML formatter to
   * produce the output document (basic XSLT operation).</li>
   * <li>ATTRVAL_OUTPUT_METHOD_HTML: Use an HTML formatter to
   * produce the output document. When generating HTML documents,
   * this may yield better results; it does things like escaping
   * characters in href attributes.</li>
   * </li>ATTRVAL_OUTPUT_METHOD_TEXT:  Use a Text formatter to
   * produce the output document. Generally the right choice if your
   * stylesheet wants to take over _all_ the details of formatting,
   * most often when producing something that isn't an XML or HTML
   * document.</li>
   * </ul>
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int TATTRNAME_OUTPUT_METHOD = 1, TATTRNAME_AMOUNT = 2,

  /** IDs for XSL attribute types. These are associated
   * with the string literals in the TransformerImpl class.
   * Don't change the numbers. NOTE THAT THESE ARE NOT IN
   * ALPHABETICAL ORDER!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String

  /**
   * Literals for XSL attribute names.  Note that there may be more
   * names than IDs, because some names may map to the same ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String

  /**
   * Literals for EXSLT function elements.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String

  /**
   * Literals for XSL element names.  Note that there are more
   * names than IDs, because some names map to the same ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int ELEMNAME_UNDEFINED = -1, ELEMNAME_WITHPARAM = 2,

  /**
   * IDs for XSL element types. These are associated
   * with the string literals in the TransformerImpl class.
   * Don't change the numbers. NOTE THAT THESE ARE NOT IN
   * ALPHABETICAL ORDER!
   * (It's a pity Java doesn't have a real Enumerated Mnemonic
   * datatype... or a C-like preprocessor in lieu thereof which
   * could be used to generate and maintain synch between these lists.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
public class Constants extends com.sun.org.apache.xml.internal.utils.Constants

/**
 * Primary constants used in the TransformerImpl classes.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Constants.java
public interface Constants extends InstructionConstants {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/Constants.java
public interface Constants {

/**
 * This class defines constants used by both the compiler and the
 * runtime system.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static void print(String header, String prefix, Object[] array) {

    /** Prints a list of features/properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static void main(String[] argv) {

    /** Prints all of the constants to standard output. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        public Object nextElement() {

        /**
         * Returns the next element of this enumeration.
         *
         * @return     the next element of this enumeration.
         * @exception  NoSuchElementException  if no more elements exist.
         * @since      JDK1.0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        public boolean hasMoreElements() {

        /**
         * Tests if this enumeration contains more elements.
         *
         * @return  <code>true</code> if this enumeration contains more elements;
         *          <code>false</code> otherwise.
         * @since   JDK1.0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        public ArrayEnumeration(Object[] array) {

        /** Constructs an array enumeration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        private int index;

        /** Index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        private Object[] array;

        /** Array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    static class ArrayEnumeration

    /**
     * An array enumeration.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getXercesProperties() {

    /** Returns an enumeration of the Xerces properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getXercesFeatures() {

    /** Returns an enumeration of the Xerces features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getSAXProperties() {

    /** Returns an enumeration of the SAX properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getSAXFeatures() {

    /** Returns an enumeration of the SAX features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private Constants() {}

    /** This class cannot be instantiated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final Enumeration fgEmptyEnumeration = new ArrayEnumeration(new Object[] {});

    /** Empty enumeration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgXercesProperties = {

    /** Xerces properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgXercesFeatures = {

    /** Xerces features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgSAXProperties = {

    /** SAX properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgSAXFeatures = {

    /** SAX features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String LAST_ENTITY = "LAST_ENTITY";

    /** Boolean indicating if this entity is the last opened entity.
     *
     *@see com.sun.org.apache.xerces.internal.impl.XMLEntityManager#endEntity()
     *@see com.sun.org.apache.xerces.internal.impl.XMLDocumentScannerImpl#endEntity()
     *@see com.sun.org.apache.xerces.internal.impl.XMLDTDScannerImpl#endEntity()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String CHAR_REF_PROBABLE_WS = "CHAR_REF_PROBABLE_WS";

    /**
     * Boolean indicating whether a character is a probable white space
     * character (ch <= 0x20) that was the replacement text of a character
     * reference is stored in augmentations using the string "CHAR_REF_PROBABLE_WS".
     * The absence of this augmentation indicates that the character is not
     * probable white space and/or was not included from a character reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ENTITY_SKIPPED = "ENTITY_SKIPPED";

    /**
     * Boolean indicating whether an entity referenced in the document has
     * not been read is stored in augmentations using the string "ENTITY_SKIPPED".
     * The absence of this augmentation indicates that the entity had a
     * declaration and was expanded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ID_ATTRIBUTE = "ID_ATTRIBUTE";

    /**
     * Whether an attribute is an id or not is stored in augmentations
     * using this string as the key. The value is {@link Boolean#TRUE}
     * or {@link Boolean#FALSE}.
     *
     * This will ultimately controls {@link com.sun.org.apache.xerces.internal.parsers.AbstractDOMParser}
     * about whether it will mark an attribute as ID or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String TYPEINFO = "org.w3c.dom.TypeInfo";

    /**
     * {@link org.w3c.dom.TypeInfo} associated with current element/attribute
     * is stored in augmentations using this string as the key.
     *
     * This will ultimately controls {@link com.sun.org.apache.xerces.internal.parsers.AbstractDOMParser}
     * regarding what object the DOM will return from
     * {@link org.w3c.dom.Attr#getSchemaTypeInfo()} and
     * {@link org.w3c.dom.Element#getSchemaTypeInfo()} and
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ATTRIBUTE_DECLARED = "ATTRIBUTE_DECLARED";

    /**
     * Boolean indicating whether an attribute is declared in the DTD is stored
     * in augmentations using the string "ATTRIBUTE_DECLARED". The absence of this
     * augmentation indicates that the attribute was not declared in the DTD.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ATTRIBUTE_PSVI = "ATTRIBUTE_PSVI";

    /** Attribute PSVI is stored in augmentations using string "ATTRIBUTE_PSVI" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ELEMENT_PSVI = "ELEMENT_PSVI";

    /** Element PSVI is stored in augmentations using string "ELEMENT_PSVI" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_DV_FACTORY_PROPERTY = "internal/validation/schema/dv-factory";

    /** Schema element declaration for the root element in a document ("internal/validation/schema/dv-factory"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XPOINTER_SCHEMA_PROPERTY = "xpointer-schema";

    /** XPointer Schema property ("xpointer-schema"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATION_MANAGER_PROPERTY = "internal/validation-manager";

    /** Validation manager property ("internal/validation-manager"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_CONTEXT_PROPERTY = "internal/namespace-context";

    /** Namespace context property ("internal/namespace-context"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_BINDER_PROPERTY = "internal/namespace-binder";

    /** Namespace binder property ("internal/namespace-binder"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_NONS_LOCATION = "schema/external-noNamespaceSchemaLocation";

    /** Schema location property ("schema/external-noNamespaceSchemaLocation"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_LOCATION = "schema/external-schemaLocation";

    /** No namespace schema location property ("schema/external-schemaLocation"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_VALIDATOR_PROPERTY = "internal/validator/schema";

    /** Validator property ("internal/validator/schema"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DTD_VALIDATOR_PROPERTY = "internal/validator/dtd";

    /** Validator property ("internal/validator/dtd"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATOR_PROPERTY = "internal/validator";

    /** Validator property ("internal/validator"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DTD_PROCESSOR_PROPERTY = "internal/dtd-processor";

    /** DTD processor property ("internal/dtd-processor"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DTD_SCANNER_PROPERTY = "internal/dtd-scanner";

    /** DTD scanner property ("internal/dtd-scanner"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOCUMENT_SCANNER_PROPERTY = "internal/document-scanner";

    /** Document scanner property ("internal/document-scanner"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DATATYPE_VALIDATOR_FACTORY_PROPERTY = "internal/datatype-validator-factory";

    /** Datatype validator factory ("internal/datatype-validator-factory"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XMLGRAMMAR_POOL_PROPERTY = "internal/grammar-pool";

    /** Grammar pool property ("internal/grammar-pool"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SECURITY_MANAGER =

    /** property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOCALE_PROPERTY = "locale";

    /** Locale property ("locale"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SECURITY_MANAGER_PROPERTY = "security-manager";

    /** Security manager property ("security-manager"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ENTITY_MANAGER_PROPERTY = "internal/entity-manager";

    /** Entity manager property ("internal/entity-manager"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XPOINTER_HANDLER_PROPERTY = "internal/xpointer-handler";

    /** XPointer handler property ("internal/xpointer-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_HANDLER_PROPERTY = "internal/xinclude-handler";

    /** XInclude handler property ("internal/xinclude-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ERROR_HANDLER_PROPERTY = "internal/error-handler";

    /** Error handler property ("internal/error-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ERROR_REPORTER_PROPERTY = "internal/error-reporter";

    /** Error reporter property ("internal/error-reporter"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SYMBOL_TABLE_PROPERTY = "internal/symbol-table";

    /** Symbol table property ("internal/symbol-table"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOCUMENT_CLASS_NAME_PROPERTY = "dom/document-class-name";

    /** Document class name property ("dom/document-class-name"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CURRENT_ELEMENT_NODE_PROPERTY = "dom/current-element-node";

    /** Current element node property ("dom/current-element-node"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XERCES_PROPERTY_PREFIX = "http://apache.org/xml/properties/";

    /** Xerces properties prefix ("http://apache.org/xml/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CHANGE_IGNORABLE_CHARACTERS_INTO_IGNORABLE_WHITESPACES =

    /**
     * When true, the schema processor will change characters events
     * to ignorableWhitespaces events, when characters are expected to
     * only contain ignorable whitespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String IGNORE_SCHEMA_LOCATION_HINTS = "validation/schema/ignore-schema-location-hints";

    /** Ignore xsi:schemaLocation and xsi:noNamespaceSchemaLocation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_AWARE = "xinclude-aware";

    /** Feature to make XML Processor XInclude Aware */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String PARSER_SETTINGS = "internal/parser-settings";

    /** Internal performance related feature:
     * false - the parser settings (features/properties) have not changed between 2 parses
     * true - the parser settings have changed between 2 parses
     * NOTE: this feature should only be set by the parser configuration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_GRAMMAR_POOL_ONLY_FEATURE = "internal/validation/schema/use-grammar-pool-only";

    /**
     * Internal feature. When set to true the schema validator will only use
     * schema components from the grammar pool provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_FIXUP_LANGUAGE_FEATURE = "xinclude/fixup-language";

    /** XInclude fixup language feature ("xinclude/fixup-language"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_FIXUP_BASE_URIS_FEATURE = "xinclude/fixup-base-uris";

    /** XInclude fixup base URIs feature ("xinclude/fixup-base-uris"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_FEATURE = "xinclude";

    /** XInclude processing feature ("xinclude"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String TOLERATE_DUPLICATES_FEATURE = "internal/tolerate-duplicates";

    /** Tolerate duplicates feature ("internal/tolerate-duplicates"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_GROWTH_FEATURE = "namespace-growth";

    /** Namespace growth feature ("namespace-growth"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String HONOUR_ALL_SCHEMALOCATIONS_FEATURE = "honour-all-schemaLocations";

        /** Honour all schemaLocations feature ("honour-all-schemaLocations"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATE_ANNOTATIONS_FEATURE = "validate-annotations";

    /** Validate annotations feature ("validate-annotations"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String GENERATE_SYNTHETIC_ANNOTATIONS_FEATURE = "generate-synthetic-annotations";

    /** Generate synthetic annotations feature ("generate-synthetic-annotations"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String STANDARD_URI_CONFORMANT_FEATURE = "standard-uri-conformant";

    /** Standard URI conformant feature ("standard-uri-conformant"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NOTIFY_BUILTIN_REFS_FEATURE = "scanner/notify-builtin-refs";

    /** Notify built-in (&amp;amp;, etc.) references feature (scanner/notify-builtin-refs"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NOTIFY_CHAR_REFS_FEATURE = "scanner/notify-char-refs";

    /** Notify character references feature (scanner/notify-char-refs"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String BALANCE_SYNTAX_TREES = "validation/balance-syntax-trees";

    /** Balance syntax trees feature ("validation/balance-syntax-trees"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATE_DATATYPES_FEATURE = "validation/validate-datatypes";

    /** Validate datatypes feature ("validation/validate-datatypes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATE_CONTENT_MODELS_FEATURE = "validation/validate-content-models";

    /** Validate content models feature ("validation/validate-content-models"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DEFAULT_ATTRIBUTE_VALUES_FEATURE = "validation/default-attribute-values";

    /** Default attribute values feature ("validation/default-attribute-values"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String INCLUDE_IGNORABLE_WHITESPACE = "dom/include-ignorable-whitespace";

    /** Include ignorable whitespace feature ("dom/include-ignorable-whitespace"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CREATE_ENTITY_REF_NODES_FEATURE = "dom/create-entity-ref-nodes";

    /** Create entity reference nodes feature ("dom/create-entity-ref-nodes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DEFER_NODE_EXPANSION_FEATURE = "dom/defer-node-expansion";

    /** Defer node expansion feature ("dom/defer-node-expansion"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOAD_EXTERNAL_DTD_FEATURE = "nonvalidating/load-external-dtd";

    /** Load external dtd when nonvalidating feature ("nonvalidating/load-external-dtd"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOAD_DTD_GRAMMAR_FEATURE = "nonvalidating/load-dtd-grammar";

    /** Load dtd grammar when nonvalidating feature ("nonvalidating/load-dtd-grammar"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CONTINUE_AFTER_FATAL_ERROR_FEATURE = "continue-after-fatal-error";

    /** Continue after fatal error feature ("continue-after-fatal-error"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DISALLOW_DOCTYPE_DECL_FEATURE = "disallow-doctype-decl";

    /** Disallow DOCTYPE declaration feature ("disallow-doctype-decl"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ALLOW_JAVA_ENCODINGS_FEATURE = "allow-java-encodings";

    /** Allow Java encoding names feature ("allow-java-encodings"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String WARN_ON_DUPLICATE_ENTITYDEF_FEATURE = "warn-on-duplicate-entitydef";

    /** Warn on duplicate entity declaration feature ("warn-on-duplicate-entitydef"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String WARN_ON_UNDECLARED_ELEMDEF_FEATURE = "validation/warn-on-undeclared-elemdef";

    /** Warn on undeclared element feature ("validation/warn-on-undeclared-elemdef"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String WARN_ON_DUPLICATE_ATTDEF_FEATURE = "validation/warn-on-duplicate-attdef";

    /** Warn on duplicate attribute declaration feature ("validation/warn-on-duplicate-attdef"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DYNAMIC_VALIDATION_FEATURE = "validation/dynamic";

    /** Dynamic validation feature ("validation/dynamic"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_AUGMENT_PSVI = "validation/schema/augment-psvi";

    /** Augment Post-Schema-Validation-Infoset */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_FULL_CHECKING = "validation/schema-full-checking";

    /** Schema full constraint checking ("validation/schema-full-checking"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_ELEMENT_DEFAULT = "validation/schema/element-default";

    /** Send schema default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_NORMALIZED_VALUE = "validation/schema/normalized-value";

    /** Expose schema normalized values */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_VALIDATION_FEATURE = "validation/schema";

    /** Schema validation feature ("validation/schema"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XERCES_FEATURE_PREFIX = "http://apache.org/xml/features/";

    /** Xerces features prefix ("http://apache.org/xml/features/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOAD_AS_INFOSET = "load-as-infoset";

    /** Feature id: load as infoset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CREATE_CDATA_NODES_FEATURE = "create-cdata-nodes";

    /** Create cdata nodes feature ("create-cdata-nodes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String INCLUDE_COMMENTS_FEATURE = "include-comments";

    /** Comments feature ("include-comments"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_YES = "yes";

    /**
     * A string "yes" that can be used for properties such as getEntityCountInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_MAX_ELEMENT_DEPTH = "jdk.xml.maxElementDepth";

    /**
     * JDK maxElementDepth limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_XML_NAME_LIMIT = "jdk.xml.maxXMLNameLimit";

    /**
     * JDK maximum XML name limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_GENERAL_ENTITY_SIZE_LIMIT = "jdk.xml.maxGeneralEntitySizeLimit";

    /**
     * JDK maximum general entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_TOTAL_ENTITY_SIZE_LIMIT = "jdk.xml.totalEntitySizeLimit";

    /**
     * JDK total entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_MAX_OCCUR_LIMIT = "jdk.xml.maxOccurLimit";

    /**
     * JDK maxOccur limit; Note that the existing system property
     * "maxOccurLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_ELEMENT_ATTRIBUTE_LIMIT =  "jdk.xml.elementAttributeLimit";

    /**
     * JDK element attribute limit; Note that the existing system property
     * "elementAttributeLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_ENTITY_EXPANSION_LIMIT = "jdk.xml.entityExpansionLimit";

    /**
     * JDK entity expansion limit; Note that the existing system property
     * "entityExpansionLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_ENTITY_COUNT_INFO =

    /**
     * JDK property to allow printing out information from the limit analyzer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_MAX_ELEMENT_DEPTH =

    /**
     * JDK maxElementDepth limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_XML_NAME_LIMIT =

    /**
     * JDK maximum XML name limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_PARAMETER_ENTITY_SIZE_LIMIT =

    /**
     * JDK maximum parameter entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_GENERAL_ENTITY_SIZE_LIMIT =

    /**
     * JDK maximum general entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_TOTAL_ENTITY_SIZE_LIMIT =

    /**
     * JDK total entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_MAX_OCCUR_LIMIT =

    /**
     * JDK maxOccur limit; Note that the existing system property
     * "maxOccurLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_ELEMENT_ATTRIBUTE_LIMIT =

    /**
     * JDK element attribute limit; Note that the existing system property
     * "elementAttributeLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_ENTITY_EXPANSION_LIMIT =

    /**
     * JDK entity expansion limit; Note that the existing system property
     * "entityExpansionLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final boolean IS_JDK8_OR_ABOVE = isJavaVersionAtLeast(8);

    /**
     * Check if we're in jdk8 or above
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_ACCESS_DEFAULT = ACCESS_EXTERNAL_ALL;

    /**
     * FEATURE_SECURE_PROCESSING (FSP) is true by default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_ACCESS_DEFAULT_FSP = "";

    /**
     * Default value when FEATURE_SECURE_PROCESSING (FSP) is set to true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ORACLE_JAXP_PROPERTY_PREFIX =

    /** Oracle JAXP property prefix ("http://www.oracle.com/xml/jaxp/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JAXPAPI_PROPERTY_PREFIX =

    /** JAXP Standard property prefix ("http://javax.xml.XMLConstants/property/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_LANGUAGE = "schemaLanguage";

    /** JAXP schemaSource language: when used internally may include DTD namespace (DOM) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_SOURCE = "schemaSource";

    /** JAXP schemaSource property: when used internally may include DTD sources (DOM) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JAXP_PROPERTY_PREFIX =

    /** JAXP property prefix ("http://java.sun.com/xml/jaxp/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOCUMENT_XML_VERSION_PROPERTY = "document-xml-version";

    /** Document XML version property ("document-xml-version"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ORACLE_FEATURE_SERVICE_MECHANISM = "http://www.oracle.com/feature/use-service-mechanism";

    /**
     * <p>Use Service Mechanism</p>
     *
     * <ul>
     *   <li>
     * {@code true} instruct an object to use service mechanism to
     * find a service implementation. This is the default behavior.
     *   </li>
     *   <li>
     * {@code false} instruct an object to skip service mechanism and
     * use the default implementation for that service.
     *   </li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XML_STRING_PROPERTY = "xml-string";

    /** XML string property ("xml-string"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOM_NODE_PROPERTY = "dom-node";

    /** DOM node property ("dom-node"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LEXICAL_HANDLER_PROPERTY = "lexical-handler";

    /** Lexical handler property ("lexical-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DECLARATION_HANDLER_PROPERTY = "declaration-handler";

    /** Declaration handler property ("declaration-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SAX_PROPERTY_PREFIX = "http://xml.org/sax/properties/";

    /** SAX property prefix ("http://xml.org/sax/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ALLOW_DTD_EVENTS_AFTER_ENDDTD_FEATURE = "allow-dtd-events-after-endDTD";

    /** Allow unparsed entity and notation declaration events to be sent after the end DTD event ("allow-dtd-events-after-endDTD") */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XML_11_FEATURE = "xml-1.1";

    /** XML 1.1 feature ("xml-1.1"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XMLNS_URIS_FEATURE = "xmlns-uris";

    /** xmlns URIs feature ("xmlns-uris"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String UNICODE_NORMALIZATION_CHECKING_FEATURE = "unicode-normalization-checking";

    /** Unicode normalization checking feature ("unicode-normalization-checking"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_ENTITY_RESOLVER2_FEATURE = "use-entity-resolver2";

    /** Use EntityResolver2 feature ("use-entity-resolver2"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_LOCATOR2_FEATURE = "use-locator2";

    /** Use Locator2 feature ("use-locator2"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_ATTRIBUTES2_FEATURE = "use-attributes2";

    /** Use Attributes2 feature ("use-attributes2"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String RESOLVE_DTD_URIS_FEATURE = "resolve-dtd-uris";

    /** Resolve DTD URIs feature ("resolve-dtd-uris"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String IS_STANDALONE_FEATURE = "is-standalone";

    /** Is standalone feature ("is-standalone"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LEXICAL_HANDLER_PARAMETER_ENTITIES_FEATURE = "lexical-handler/parameter-entities";

    /** Lexical handler parameter entities feature ("lexical-handler/parameter-entities"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_PARAMETER_ENTITIES_FEATURE = "external-parameter-entities";

    /** External parameter entities feature ("external-parameter-entities "). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_GENERAL_ENTITIES_FEATURE = "external-general-entities";

    /** External general entities feature ("external-general-entities "). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATION_FEATURE = "validation";

    /** Validation feature ("validation"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String STRING_INTERNING_FEATURE = "string-interning";

    /** String interning feature ("string-interning"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_PREFIXES_FEATURE = "namespace-prefixes";

    /** Namespace prefixes feature ("namespace-prefixes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SAX_FEATURE_PREFIX = "http://xml.org/sax/features/";

    /** SAX feature prefix ("http://xml.org/sax/features/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String IGNORE_EXTERNAL_DTD = "ignore-external-dtd";

    /**
     * If true, ignore DOCTYPE declaration as if it wasn't present at all.
     * Note that this is a violation of the XML recommendation.
     * The full property name is prefixed by {@link #ZEPHYR_PROPERTY_PREFIX}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
public final class Constants {

/**
 * Commonly used constants.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 * @version $Id: Constants.java,v 1.14 2010-11-01 04:39:40 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_CERTICOM =

    /**
     * @see <A HREF="http://www.ietf.org/internet-drafts/draft-blake-wilson-xmldsig-ecdsa-02.txt">
     *  draft-blake-wilson-xmldsig-ecdsa-02.txt</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String ALGO_ID_DIGEST_SHA1 = SignatureSpecNS + "sha1";

    /** Digest - Required SHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SPKISEXP = "SPKISexp";

    /** Tag of Element SPKISexp **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509DIGEST = "X509Digest";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYINFOREFERENCE = "KeyInfoReference";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DERENCODEDKEYVALUE = "DEREncodedKeyValue";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGPKEYPACKET = "PGPKeyPacket";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGPKEYID = "PGPKeyID";

    /** Tag of Element PGPKeyID **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509SERIALNUMBER = "X509SerialNumber";

    /** Tag of Element X509SerialNumber **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509ISSUERNAME = "X509IssuerName";

    /** Tag of Element X509IssuerName **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509CRL = "X509CRL";

    /** Tag of Element X509CRL **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509CERTIFICATE = "X509Certificate";

    /** Tag of Element X509Certificate **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509SUBJECTNAME = "X509SubjectName";

    /** Tag of Element X509SubjectName **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509SKI = "X509SKI";

    /** Tag of Element X509SKI **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509ISSUERSERIAL= "X509IssuerSerial";

    /** Tag of Element X509IssuerSerial **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_RAWX509CERTIFICATE = "rawX509Certificate";

    /** Tag of Element rawX509Certificate **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGENCOUNTER = "PgenCounter";

    /** Tag of Element PgenCounter **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SEED = "Seed";

    /** Tag of Element Seed **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_J = "J";

    /** Tag of Element J **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_Y = "Y";

    /** Tag of Element Y **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_G = "G";

    /** Tag of Element G **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_Q   = "Q";

    /** Tag of Element Q **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_P = "P";

    /** Tag of Element P **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DSAKEYVALUE = "DSAKeyValue";

    /** Tag of Element DSAKeyValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_MODULUS = "Modulus";

    /** Tag of Element Modulus **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_EXPONENT = "Exponent";

    /** Tag of Element Exponent **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_RSAKEYVALUE = "RSAKeyValue";

    /** Tag of Element RSAKeyValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_MGMTDATA = "MgmtData";

    /** Tag of Element MgmtData **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SPKIDATA = "SPKIData";

    /** Tag of Element SPKIData **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGPDATA = "PGPData";

    /** Tag of Element PGPData **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509DATA = "X509Data";

    /** Tag of Element X509Data **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_RETRIEVALMETHOD = "RetrievalMethod";

    /** Tag of Element RetrievalMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYVALUE = "KeyValue";

    /** Tag of Element KeyValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYNAME = "KeyName";

    /** Tag of Element KeyName **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYINFO = "KeyInfo";

    /** Tag of Element KeyInfo **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_XPATH = "XPath";

    /** Tag of Element XPath **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_TRANSFORMS = "Transforms";

    /** Tag of Element Transforms **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_TRANSFORM = "Transform";

    /** Tag of Element Transform **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNEDINFO = "SignedInfo";

    /** Tag of Element SignedInfo **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREVALUE = "SignatureValue";

    /** Tag of Element SignatureValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREPROPERTY = "SignatureProperty";

    /** Tag of Element SignatureProperty **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREPROPERTIES = "SignatureProperties";

    /** Tag of Element SignatureProperties **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_HMACOUTPUTLENGTH = "HMACOutputLength";

    /** Tag of Element HMACOutputLength **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREMETHOD = "SignatureMethod";

    /** Tag of Element SignatureMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATURE = "Signature";

    /** Tag of Element Signature **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_REFERENCE = "Reference";

    /** Tag of Element Reference **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_OBJECT = "Object";

    /** Tag of Element Object **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_METHODS = "Methods";

    /** Tag of Element Methods **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_MANIFEST = "Manifest";

    /** Tag of Element Manifest **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DIGESTVALUE = "DigestValue";

    /** Tag of Element DigestValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DIGESTMETHOD = "DigestMethod";

    /** Tag of Element DigestMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_CANONICALIZATIONMETHOD = "CanonicalizationMethod";

    /** Tag of Element CanonicalizationMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_TARGET = "Target";

    /** Tag of Attr Target**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_ENCODING = "Encoding";

    /** Tag of Attr Encoding**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_MIMETYPE = "MimeType";

    /** Tag of Attr MimeType**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_ID = "Id";

    /** Tag of Attr Id**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_TYPE = "Type";

    /** Tag of Attr Type**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_URI = "URI";

    /** Tag of Attr URI**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_ALGORITHM = "Algorithm";

    /** Tag of Attr Algorithm**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String NamespaceSpecNS = "http://www.w3.org/2000/xmlns/";

    /** The URI for XMLNS spec*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String XML_LANG_SPACE_SpecNS = "http://www.w3.org/XML/1998/namespace";

    /** The URI for XML spec*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String MoreAlgorithmsSpecNS = "http://www.w3.org/2001/04/xmldsig-more#";

    /** The URL for more algorithms **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String SignatureSpec11NS = "http://www.w3.org/2009/xmldsig11#";

    /**
     * The namespace of the
     * <A HREF="http://www.w3.org/TR/xmldsig-core1/">XML Signature specification</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String SignatureSpecNS = "http://www.w3.org/2000/09/xmldsig#";

    /**
     * The namespace of the
     * <A HREF="http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/">XML Signature specification</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String SIGNATURESPECIFICATION_URL =

    /**
     * The URL of the
     * <A HREF="http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/">XML Signature specification</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String exceptionMessagesResourceBundleBase =

    /** Field exceptionMessagesResourceBundleBase is the location of the <CODE>ResourceBundle</CODE> */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String exceptionMessagesResourceBundleDir =

    /** Field exceptionMessagesResourceBundleDir */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String configurationFileNew = ".xmlsecurityconfig";

    /** Field configurationFileNew */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String configurationFile = "data/websig.conf";

    /** Field configurationFile */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
public class Constants {

/**
 * Provides all constants and some translation functions for i18n.
 *
 * For the used Algorithm identifiers and Namespaces, look at the
 * <A HREF="http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg">XML
 * Signature specification</A>.
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
package com.sun.org.apache.xml.internal.security.utils;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final double XSLTVERSUPPORTED = 1.0;

  /**
   * The minimum version of XSLT supported by this processor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * EXSLT extension namespaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * Xalan extension namespaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * The old built-in extension url. It is still supported for
   * backward compatibility.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /** S_BUILTIN_EXTENSIONS_URL is a mnemonic for the XML Namespace
   *(http://xml.apache.org/xalan) predefined to signify Xalan's
   * built-in XSLT Extensions. When used in stylesheets, this is often
   * bound to the "xalan:" prefix.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /** Authorship mnemonics, as Java Strings. Not standardized,
   * as far as I know.
   * <ul>
   * <li>S_VENDOR -- the name of the organization/individual who published
   * this XSLT processor. </li>
   * <li>S_VENDORURL -- URL where one can attempt to retrieve more
   * information about this publisher and product.</li>
   * </ul>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * Mnemonics for standard XML Namespace URIs, as Java Strings:
   * <ul>
   * <li>S_XMLNAMESPACEURI (http://www.w3.org/XML/1998/namespace) is the
   * URI permanantly assigned to the "xml:" prefix. This is used for some
   * features built into the XML specification itself, such as xml:space
   * and xml:lang. It was defined by the W3C's XML Namespaces spec.</li>
   * <li>S_XSLNAMESPACEURL (http://www.w3.org/1999/XSL/Transform) is the
   * URI which indicates that a name may be an XSLT directive. In most
   * XSLT stylesheets, this is bound to the "xsl:" prefix. It's defined
   * by the W3C's XSLT Recommendation.</li>
   * <li>S_OLDXSLNAMESPACEURL (http://www.w3.org/XSL/Transform/1.0) was
   * used in early prototypes of XSLT processors for much the same purpose
   * as S_XSLNAMESPACEURL. It is now considered obsolete, and the version
   * of XSLT which it signified is not fully compatable with the final
   * XSLT Recommendation, so what it really signifies is a badly obsolete
   * stylesheet.</li>
   * </ul> */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
public class Constants

/**
 * Primary constants used by the XSLT Processor
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final byte ITEM_Bogus      = 0;

  /** Constants used in the StackMap attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final byte ATTR_UNKNOWN                                 = -1;

  /** Attributes and their corresponding names.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final int[] PRODUCE_STACK = {

  /**
   * Number of words produced onto operand stack by instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final int[] CONSUME_STACK = {

  /**
   * Number of words consumed on operand stack by instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] OPCODE_NAMES = {

  /**
   * Names of opcodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short[][] TYPE_OF_OPERANDS = {

  /**
   * How the byte code operands are to be interpreted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short[] NO_OF_OPERANDS = {

  /**
   * Number of byte code operands, i.e., number of bytes after the tag byte
   * itself.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] SHORT_TYPE_NAMES = {

  /** The signature characters corresponding to primitive types,
   * e.g., SHORT_TYPE_NAMES[T_INT] = "I"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] CLASS_TYPE_NAMES = {

  /** The primitive class names corresponding to the T_XX constants,
   * e.g., CLASS_TYPE_NAMES[T_INT] = "java.lang.Integer"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final String[] TYPE_NAMES = {

  /** The primitive type names corresponding to the T_XX constants,
   * e.g., TYPE_NAMES[T_INT] = "int"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short  UNDEFINED      = -1;

  /**
   * Illegal codes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short PUSH             = 4711;

  /**
   * For internal purposes only.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short BREAKPOINT                = 202;

  /**
   * Non-legal opcodes, may be used by JVM internally.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final short NOP              = 0;

  /** Java VM opcodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public static final int MAX_CP_ENTRIES     = 65535;

  /**
   * Limitations of the Java Virtual Machine.
   * See The Java Virtual Machine Specification, Second Edition, page 152, chapter 4.10.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static String[] INTERFACES_IMPLEMENTED_BY_ARRAYS = {"java.lang.Cloneable", "java.io.Serializable"};

  /** The names of the interfaces implemented by arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static String CONSTRUCTOR_NAME = "<init>";

  /** The name of every constructor method in a class, also called
   * &quot;instance initialization method&quot;. This is &quot;&lt;init&gt;&quot;.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static String STATIC_INITIALIZER_NAME = "<clinit>";

  /** The name of the static initializer, also called &quot;class
   *  initialization method&quot; or &quot;interface initialization
   *   method&quot;. This is &quot;&lt;clinit&gt;&quot;.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static byte CONSTANT_Utf8               = 1;

  /** Tags in constant pool to denote type of constant.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static short ACC_PUBLIC       = 0x0001;

  /** Access flags for classes, fields and methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static int MAX_BYTE  = 255; // 2^8 - 1

  /** Maximum value for an unsigned byte.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
  public final static int MAX_SHORT = 65535; // 2^16 - 1

  /** Maximum value for an unsigned short.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/Constants.java
public interface Constants {

/**
 * Constants for the project, mostly defined in the JVM specification.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRNAME_XXXX = "XXXX";

  /** temp dummy         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_INFINITY = "Infinity",

  /** some stuff for Decimal-format       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int SORTCASEORDER_UPPERFIRST = 1, SORTCASEORDER_LOWERFIRST = 2;

  /** Integer equivelents for CASE-ORDER attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int SORTORDER_ASCENDING = 1, SORTORDER_DESCENDING = 2;

  /** Integer equivelents for ORDER attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int SORTDATATYPE_TEXT = 1, SORTDATATYPE_NUMBER = 2;

 /** Integer equivelents for DATATYPE attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_DATATYPE_TEXT = "text",

  /** Stuff for sorting      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_THIS = ".", ATTRVAL_PARENT = "..",

  /** some stuff for my patterns-by-example         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int NUMBERLEVEL_SINGLE = 1, NUMBERLEVEL_MULTI = 2,

  /** Integer equivelents for above        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int NUMBERLETTER_ALPHABETIC = 1, NUMBERLETTER_TRADITIONAL = 2;

 /** Integer equivalents for above        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_DEFAULT_PREFIX = "#default";

  /** For Stylesheet-prefix and result-prefix in xsl:namespace-alias          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_SINGLE = "single",

  /** For level attribute in xsl:number.          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_ALPHABETIC = "alphabetic",

  /** For letter-value attribute (part of conversion attributes).          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final boolean ATTRVAL_YES = true, ATTRVAL_NO = false;

  /** For indent-result          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String ATTRVAL_OUTPUT_METHOD_HTML = "html",

  /** Mnemonics for the possible values of the xsl:output element's
   * method= attribute:
   * <ul>
   * <li>ATTRVAL_OUTPUT_METHOD_XML = Use an XML formatter to
   * produce the output document (basic XSLT operation).</li>
   * <li>ATTRVAL_OUTPUT_METHOD_HTML: Use an HTML formatter to
   * produce the output document. When generating HTML documents,
   * this may yield better results; it does things like escaping
   * characters in href attributes.</li>
   * </li>ATTRVAL_OUTPUT_METHOD_TEXT:  Use a Text formatter to
   * produce the output document. Generally the right choice if your
   * stylesheet wants to take over _all_ the details of formatting,
   * most often when producing something that isn't an XML or HTML
   * document.</li>
   * </ul>
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int TATTRNAME_OUTPUT_METHOD = 1, TATTRNAME_AMOUNT = 2,

  /** IDs for XSL attribute types. These are associated
   * with the string literals in the TransformerImpl class.
   * Don't change the numbers. NOTE THAT THESE ARE NOT IN
   * ALPHABETICAL ORDER!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String

  /**
   * Literals for XSL attribute names.  Note that there may be more
   * names than IDs, because some names may map to the same ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String

  /**
   * Literals for EXSLT function elements.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final String

  /**
   * Literals for XSL element names.  Note that there are more
   * names than IDs, because some names map to the same ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
  public static final int ELEMNAME_UNDEFINED = -1, ELEMNAME_WITHPARAM = 2,

  /**
   * IDs for XSL element types. These are associated
   * with the string literals in the TransformerImpl class.
   * Don't change the numbers. NOTE THAT THESE ARE NOT IN
   * ALPHABETICAL ORDER!
   * (It's a pity Java doesn't have a real Enumerated Mnemonic
   * datatype... or a C-like preprocessor in lieu thereof which
   * could be used to generate and maintain synch between these lists.)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/templates/Constants.java
public class Constants extends com.sun.org.apache.xml.internal.utils.Constants

/**
 * Primary constants used in the TransformerImpl classes.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Constants.java
public interface Constants extends InstructionConstants {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/runtime/Constants.java
public interface Constants {

/**
 * This class defines constants used by both the compiler and the
 * runtime system.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static void print(String header, String prefix, Object[] array) {

    /** Prints a list of features/properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static void main(String[] argv) {

    /** Prints all of the constants to standard output. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        public Object nextElement() {

        /**
         * Returns the next element of this enumeration.
         *
         * @return     the next element of this enumeration.
         * @exception  NoSuchElementException  if no more elements exist.
         * @since      JDK1.0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        public boolean hasMoreElements() {

        /**
         * Tests if this enumeration contains more elements.
         *
         * @return  <code>true</code> if this enumeration contains more elements;
         *          <code>false</code> otherwise.
         * @since   JDK1.0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        public ArrayEnumeration(Object[] array) {

        /** Constructs an array enumeration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        private int index;

        /** Index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
        private Object[] array;

        /** Array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    static class ArrayEnumeration

    /**
     * An array enumeration.
     *
     * @author Andy Clark, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getXercesProperties() {

    /** Returns an enumeration of the Xerces properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getXercesFeatures() {

    /** Returns an enumeration of the Xerces features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getSAXProperties() {

    /** Returns an enumeration of the SAX properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static Enumeration getSAXFeatures() {

    /** Returns an enumeration of the SAX features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private Constants() {}

    /** This class cannot be instantiated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final Enumeration fgEmptyEnumeration = new ArrayEnumeration(new Object[] {});

    /** Empty enumeration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgXercesProperties = {

    /** Xerces properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgXercesFeatures = {

    /** Xerces features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgSAXProperties = {

    /** SAX properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    private static final String[] fgSAXFeatures = {

    /** SAX features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String LAST_ENTITY = "LAST_ENTITY";

    /** Boolean indicating if this entity is the last opened entity.
     *
     *@see com.sun.org.apache.xerces.internal.impl.XMLEntityManager#endEntity()
     *@see com.sun.org.apache.xerces.internal.impl.XMLDocumentScannerImpl#endEntity()
     *@see com.sun.org.apache.xerces.internal.impl.XMLDTDScannerImpl#endEntity()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String CHAR_REF_PROBABLE_WS = "CHAR_REF_PROBABLE_WS";

    /**
     * Boolean indicating whether a character is a probable white space
     * character (ch <= 0x20) that was the replacement text of a character
     * reference is stored in augmentations using the string "CHAR_REF_PROBABLE_WS".
     * The absence of this augmentation indicates that the character is not
     * probable white space and/or was not included from a character reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ENTITY_SKIPPED = "ENTITY_SKIPPED";

    /**
     * Boolean indicating whether an entity referenced in the document has
     * not been read is stored in augmentations using the string "ENTITY_SKIPPED".
     * The absence of this augmentation indicates that the entity had a
     * declaration and was expanded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ID_ATTRIBUTE = "ID_ATTRIBUTE";

    /**
     * Whether an attribute is an id or not is stored in augmentations
     * using this string as the key. The value is {@link Boolean#TRUE}
     * or {@link Boolean#FALSE}.
     *
     * This will ultimately controls {@link com.sun.org.apache.xerces.internal.parsers.AbstractDOMParser}
     * about whether it will mark an attribute as ID or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String TYPEINFO = "org.w3c.dom.TypeInfo";

    /**
     * {@link org.w3c.dom.TypeInfo} associated with current element/attribute
     * is stored in augmentations using this string as the key.
     *
     * This will ultimately controls {@link com.sun.org.apache.xerces.internal.parsers.AbstractDOMParser}
     * regarding what object the DOM will return from
     * {@link org.w3c.dom.Attr#getSchemaTypeInfo()} and
     * {@link org.w3c.dom.Element#getSchemaTypeInfo()} and
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ATTRIBUTE_DECLARED = "ATTRIBUTE_DECLARED";

    /**
     * Boolean indicating whether an attribute is declared in the DTD is stored
     * in augmentations using the string "ATTRIBUTE_DECLARED". The absence of this
     * augmentation indicates that the attribute was not declared in the DTD.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ATTRIBUTE_PSVI = "ATTRIBUTE_PSVI";

    /** Attribute PSVI is stored in augmentations using string "ATTRIBUTE_PSVI" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public final static String ELEMENT_PSVI = "ELEMENT_PSVI";

    /** Element PSVI is stored in augmentations using string "ELEMENT_PSVI" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_DV_FACTORY_PROPERTY = "internal/validation/schema/dv-factory";

    /** Schema element declaration for the root element in a document ("internal/validation/schema/dv-factory"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XPOINTER_SCHEMA_PROPERTY = "xpointer-schema";

    /** XPointer Schema property ("xpointer-schema"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATION_MANAGER_PROPERTY = "internal/validation-manager";

    /** Validation manager property ("internal/validation-manager"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_CONTEXT_PROPERTY = "internal/namespace-context";

    /** Namespace context property ("internal/namespace-context"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_BINDER_PROPERTY = "internal/namespace-binder";

    /** Namespace binder property ("internal/namespace-binder"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_NONS_LOCATION = "schema/external-noNamespaceSchemaLocation";

    /** Schema location property ("schema/external-noNamespaceSchemaLocation"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_LOCATION = "schema/external-schemaLocation";

    /** No namespace schema location property ("schema/external-schemaLocation"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_VALIDATOR_PROPERTY = "internal/validator/schema";

    /** Validator property ("internal/validator/schema"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DTD_VALIDATOR_PROPERTY = "internal/validator/dtd";

    /** Validator property ("internal/validator/dtd"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATOR_PROPERTY = "internal/validator";

    /** Validator property ("internal/validator"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DTD_PROCESSOR_PROPERTY = "internal/dtd-processor";

    /** DTD processor property ("internal/dtd-processor"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DTD_SCANNER_PROPERTY = "internal/dtd-scanner";

    /** DTD scanner property ("internal/dtd-scanner"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOCUMENT_SCANNER_PROPERTY = "internal/document-scanner";

    /** Document scanner property ("internal/document-scanner"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DATATYPE_VALIDATOR_FACTORY_PROPERTY = "internal/datatype-validator-factory";

    /** Datatype validator factory ("internal/datatype-validator-factory"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XMLGRAMMAR_POOL_PROPERTY = "internal/grammar-pool";

    /** Grammar pool property ("internal/grammar-pool"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SECURITY_MANAGER =

    /** property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOCALE_PROPERTY = "locale";

    /** Locale property ("locale"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SECURITY_MANAGER_PROPERTY = "security-manager";

    /** Security manager property ("security-manager"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ENTITY_MANAGER_PROPERTY = "internal/entity-manager";

    /** Entity manager property ("internal/entity-manager"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XPOINTER_HANDLER_PROPERTY = "internal/xpointer-handler";

    /** XPointer handler property ("internal/xpointer-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_HANDLER_PROPERTY = "internal/xinclude-handler";

    /** XInclude handler property ("internal/xinclude-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ERROR_HANDLER_PROPERTY = "internal/error-handler";

    /** Error handler property ("internal/error-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ERROR_REPORTER_PROPERTY = "internal/error-reporter";

    /** Error reporter property ("internal/error-reporter"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SYMBOL_TABLE_PROPERTY = "internal/symbol-table";

    /** Symbol table property ("internal/symbol-table"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOCUMENT_CLASS_NAME_PROPERTY = "dom/document-class-name";

    /** Document class name property ("dom/document-class-name"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CURRENT_ELEMENT_NODE_PROPERTY = "dom/current-element-node";

    /** Current element node property ("dom/current-element-node"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XERCES_PROPERTY_PREFIX = "http://apache.org/xml/properties/";

    /** Xerces properties prefix ("http://apache.org/xml/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CHANGE_IGNORABLE_CHARACTERS_INTO_IGNORABLE_WHITESPACES =

    /**
     * When true, the schema processor will change characters events
     * to ignorableWhitespaces events, when characters are expected to
     * only contain ignorable whitespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String IGNORE_SCHEMA_LOCATION_HINTS = "validation/schema/ignore-schema-location-hints";

    /** Ignore xsi:schemaLocation and xsi:noNamespaceSchemaLocation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_AWARE = "xinclude-aware";

    /** Feature to make XML Processor XInclude Aware */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String PARSER_SETTINGS = "internal/parser-settings";

    /** Internal performance related feature:
     * false - the parser settings (features/properties) have not changed between 2 parses
     * true - the parser settings have changed between 2 parses
     * NOTE: this feature should only be set by the parser configuration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_GRAMMAR_POOL_ONLY_FEATURE = "internal/validation/schema/use-grammar-pool-only";

    /**
     * Internal feature. When set to true the schema validator will only use
     * schema components from the grammar pool provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_FIXUP_LANGUAGE_FEATURE = "xinclude/fixup-language";

    /** XInclude fixup language feature ("xinclude/fixup-language"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_FIXUP_BASE_URIS_FEATURE = "xinclude/fixup-base-uris";

    /** XInclude fixup base URIs feature ("xinclude/fixup-base-uris"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XINCLUDE_FEATURE = "xinclude";

    /** XInclude processing feature ("xinclude"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String TOLERATE_DUPLICATES_FEATURE = "internal/tolerate-duplicates";

    /** Tolerate duplicates feature ("internal/tolerate-duplicates"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_GROWTH_FEATURE = "namespace-growth";

    /** Namespace growth feature ("namespace-growth"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String HONOUR_ALL_SCHEMALOCATIONS_FEATURE = "honour-all-schemaLocations";

        /** Honour all schemaLocations feature ("honour-all-schemaLocations"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATE_ANNOTATIONS_FEATURE = "validate-annotations";

    /** Validate annotations feature ("validate-annotations"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String GENERATE_SYNTHETIC_ANNOTATIONS_FEATURE = "generate-synthetic-annotations";

    /** Generate synthetic annotations feature ("generate-synthetic-annotations"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String STANDARD_URI_CONFORMANT_FEATURE = "standard-uri-conformant";

    /** Standard URI conformant feature ("standard-uri-conformant"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NOTIFY_BUILTIN_REFS_FEATURE = "scanner/notify-builtin-refs";

    /** Notify built-in (&amp;amp;, etc.) references feature (scanner/notify-builtin-refs"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NOTIFY_CHAR_REFS_FEATURE = "scanner/notify-char-refs";

    /** Notify character references feature (scanner/notify-char-refs"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String BALANCE_SYNTAX_TREES = "validation/balance-syntax-trees";

    /** Balance syntax trees feature ("validation/balance-syntax-trees"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATE_DATATYPES_FEATURE = "validation/validate-datatypes";

    /** Validate datatypes feature ("validation/validate-datatypes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATE_CONTENT_MODELS_FEATURE = "validation/validate-content-models";

    /** Validate content models feature ("validation/validate-content-models"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DEFAULT_ATTRIBUTE_VALUES_FEATURE = "validation/default-attribute-values";

    /** Default attribute values feature ("validation/default-attribute-values"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String INCLUDE_IGNORABLE_WHITESPACE = "dom/include-ignorable-whitespace";

    /** Include ignorable whitespace feature ("dom/include-ignorable-whitespace"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CREATE_ENTITY_REF_NODES_FEATURE = "dom/create-entity-ref-nodes";

    /** Create entity reference nodes feature ("dom/create-entity-ref-nodes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DEFER_NODE_EXPANSION_FEATURE = "dom/defer-node-expansion";

    /** Defer node expansion feature ("dom/defer-node-expansion"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOAD_EXTERNAL_DTD_FEATURE = "nonvalidating/load-external-dtd";

    /** Load external dtd when nonvalidating feature ("nonvalidating/load-external-dtd"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOAD_DTD_GRAMMAR_FEATURE = "nonvalidating/load-dtd-grammar";

    /** Load dtd grammar when nonvalidating feature ("nonvalidating/load-dtd-grammar"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CONTINUE_AFTER_FATAL_ERROR_FEATURE = "continue-after-fatal-error";

    /** Continue after fatal error feature ("continue-after-fatal-error"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DISALLOW_DOCTYPE_DECL_FEATURE = "disallow-doctype-decl";

    /** Disallow DOCTYPE declaration feature ("disallow-doctype-decl"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ALLOW_JAVA_ENCODINGS_FEATURE = "allow-java-encodings";

    /** Allow Java encoding names feature ("allow-java-encodings"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String WARN_ON_DUPLICATE_ENTITYDEF_FEATURE = "warn-on-duplicate-entitydef";

    /** Warn on duplicate entity declaration feature ("warn-on-duplicate-entitydef"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String WARN_ON_UNDECLARED_ELEMDEF_FEATURE = "validation/warn-on-undeclared-elemdef";

    /** Warn on undeclared element feature ("validation/warn-on-undeclared-elemdef"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String WARN_ON_DUPLICATE_ATTDEF_FEATURE = "validation/warn-on-duplicate-attdef";

    /** Warn on duplicate attribute declaration feature ("validation/warn-on-duplicate-attdef"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DYNAMIC_VALIDATION_FEATURE = "validation/dynamic";

    /** Dynamic validation feature ("validation/dynamic"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_AUGMENT_PSVI = "validation/schema/augment-psvi";

    /** Augment Post-Schema-Validation-Infoset */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_FULL_CHECKING = "validation/schema-full-checking";

    /** Schema full constraint checking ("validation/schema-full-checking"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_ELEMENT_DEFAULT = "validation/schema/element-default";

    /** Send schema default value via characters() */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_NORMALIZED_VALUE = "validation/schema/normalized-value";

    /** Expose schema normalized values */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_VALIDATION_FEATURE = "validation/schema";

    /** Schema validation feature ("validation/schema"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XERCES_FEATURE_PREFIX = "http://apache.org/xml/features/";

    /** Xerces features prefix ("http://apache.org/xml/features/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LOAD_AS_INFOSET = "load-as-infoset";

    /** Feature id: load as infoset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String CREATE_CDATA_NODES_FEATURE = "create-cdata-nodes";

    /** Create cdata nodes feature ("create-cdata-nodes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String INCLUDE_COMMENTS_FEATURE = "include-comments";

    /** Comments feature ("include-comments"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_YES = "yes";

    /**
     * A string "yes" that can be used for properties such as getEntityCountInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_MAX_ELEMENT_DEPTH = "jdk.xml.maxElementDepth";

    /**
     * JDK maxElementDepth limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_XML_NAME_LIMIT = "jdk.xml.maxXMLNameLimit";

    /**
     * JDK maximum XML name limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_GENERAL_ENTITY_SIZE_LIMIT = "jdk.xml.maxGeneralEntitySizeLimit";

    /**
     * JDK maximum general entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_TOTAL_ENTITY_SIZE_LIMIT = "jdk.xml.totalEntitySizeLimit";

    /**
     * JDK total entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_MAX_OCCUR_LIMIT = "jdk.xml.maxOccurLimit";

    /**
     * JDK maxOccur limit; Note that the existing system property
     * "maxOccurLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_ELEMENT_ATTRIBUTE_LIMIT =  "jdk.xml.elementAttributeLimit";

    /**
     * JDK element attribute limit; Note that the existing system property
     * "elementAttributeLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SP_ENTITY_EXPANSION_LIMIT = "jdk.xml.entityExpansionLimit";

    /**
     * JDK entity expansion limit; Note that the existing system property
     * "entityExpansionLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_ENTITY_COUNT_INFO =

    /**
     * JDK property to allow printing out information from the limit analyzer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_MAX_ELEMENT_DEPTH =

    /**
     * JDK maxElementDepth limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_XML_NAME_LIMIT =

    /**
     * JDK maximum XML name limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_PARAMETER_ENTITY_SIZE_LIMIT =

    /**
     * JDK maximum parameter entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_GENERAL_ENTITY_SIZE_LIMIT =

    /**
     * JDK maximum general entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_TOTAL_ENTITY_SIZE_LIMIT =

    /**
     * JDK total entity size limit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_MAX_OCCUR_LIMIT =

    /**
     * JDK maxOccur limit; Note that the existing system property
     * "maxOccurLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_ELEMENT_ATTRIBUTE_LIMIT =

    /**
     * JDK element attribute limit; Note that the existing system property
     * "elementAttributeLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JDK_ENTITY_EXPANSION_LIMIT =

    /**
     * JDK entity expansion limit; Note that the existing system property
     * "entityExpansionLimit" with no prefix is still observed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final boolean IS_JDK8_OR_ABOVE = isJavaVersionAtLeast(8);

    /**
     * Check if we're in jdk8 or above
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_ACCESS_DEFAULT = ACCESS_EXTERNAL_ALL;

    /**
     * FEATURE_SECURE_PROCESSING (FSP) is true by default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_ACCESS_DEFAULT_FSP = "";

    /**
     * Default value when FEATURE_SECURE_PROCESSING (FSP) is set to true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ORACLE_JAXP_PROPERTY_PREFIX =

    /** Oracle JAXP property prefix ("http://www.oracle.com/xml/jaxp/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JAXPAPI_PROPERTY_PREFIX =

    /** JAXP Standard property prefix ("http://javax.xml.XMLConstants/property/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_LANGUAGE = "schemaLanguage";

    /** JAXP schemaSource language: when used internally may include DTD namespace (DOM) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SCHEMA_SOURCE = "schemaSource";

    /** JAXP schemaSource property: when used internally may include DTD sources (DOM) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String JAXP_PROPERTY_PREFIX =

    /** JAXP property prefix ("http://java.sun.com/xml/jaxp/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOCUMENT_XML_VERSION_PROPERTY = "document-xml-version";

    /** Document XML version property ("document-xml-version"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ORACLE_FEATURE_SERVICE_MECHANISM = "http://www.oracle.com/feature/use-service-mechanism";

    /**
     * <p>Use Service Mechanism</p>
     *
     * <ul>
     *   <li>
     * {@code true} instruct an object to use service mechanism to
     * find a service implementation. This is the default behavior.
     *   </li>
     *   <li>
     * {@code false} instruct an object to skip service mechanism and
     * use the default implementation for that service.
     *   </li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XML_STRING_PROPERTY = "xml-string";

    /** XML string property ("xml-string"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DOM_NODE_PROPERTY = "dom-node";

    /** DOM node property ("dom-node"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LEXICAL_HANDLER_PROPERTY = "lexical-handler";

    /** Lexical handler property ("lexical-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String DECLARATION_HANDLER_PROPERTY = "declaration-handler";

    /** Declaration handler property ("declaration-handler"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SAX_PROPERTY_PREFIX = "http://xml.org/sax/properties/";

    /** SAX property prefix ("http://xml.org/sax/properties/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String ALLOW_DTD_EVENTS_AFTER_ENDDTD_FEATURE = "allow-dtd-events-after-endDTD";

    /** Allow unparsed entity and notation declaration events to be sent after the end DTD event ("allow-dtd-events-after-endDTD") */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XML_11_FEATURE = "xml-1.1";

    /** XML 1.1 feature ("xml-1.1"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String XMLNS_URIS_FEATURE = "xmlns-uris";

    /** xmlns URIs feature ("xmlns-uris"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String UNICODE_NORMALIZATION_CHECKING_FEATURE = "unicode-normalization-checking";

    /** Unicode normalization checking feature ("unicode-normalization-checking"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_ENTITY_RESOLVER2_FEATURE = "use-entity-resolver2";

    /** Use EntityResolver2 feature ("use-entity-resolver2"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_LOCATOR2_FEATURE = "use-locator2";

    /** Use Locator2 feature ("use-locator2"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String USE_ATTRIBUTES2_FEATURE = "use-attributes2";

    /** Use Attributes2 feature ("use-attributes2"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String RESOLVE_DTD_URIS_FEATURE = "resolve-dtd-uris";

    /** Resolve DTD URIs feature ("resolve-dtd-uris"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String IS_STANDALONE_FEATURE = "is-standalone";

    /** Is standalone feature ("is-standalone"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String LEXICAL_HANDLER_PARAMETER_ENTITIES_FEATURE = "lexical-handler/parameter-entities";

    /** Lexical handler parameter entities feature ("lexical-handler/parameter-entities"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_PARAMETER_ENTITIES_FEATURE = "external-parameter-entities";

    /** External parameter entities feature ("external-parameter-entities "). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String EXTERNAL_GENERAL_ENTITIES_FEATURE = "external-general-entities";

    /** External general entities feature ("external-general-entities "). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String VALIDATION_FEATURE = "validation";

    /** Validation feature ("validation"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String STRING_INTERNING_FEATURE = "string-interning";

    /** String interning feature ("string-interning"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String NAMESPACE_PREFIXES_FEATURE = "namespace-prefixes";

    /** Namespace prefixes feature ("namespace-prefixes"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String SAX_FEATURE_PREFIX = "http://xml.org/sax/features/";

    /** SAX feature prefix ("http://xml.org/sax/features/"). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
    public static final String IGNORE_EXTERNAL_DTD = "ignore-external-dtd";

    /**
     * If true, ignore DOCTYPE declaration as if it wasn't present at all.
     * Note that this is a violation of the XML recommendation.
     * The full property name is prefixed by {@link #ZEPHYR_PROPERTY_PREFIX}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/Constants.java
public final class Constants {

/**
 * Commonly used constants.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 * @version $Id: Constants.java,v 1.14 2010-11-01 04:39:40 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_CERTICOM =

    /**
     * @see <A HREF="http://www.ietf.org/internet-drafts/draft-blake-wilson-xmldsig-ecdsa-02.txt">
     *  draft-blake-wilson-xmldsig-ecdsa-02.txt</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String ALGO_ID_DIGEST_SHA1 = SignatureSpecNS + "sha1";

    /** Digest - Required SHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SPKISEXP = "SPKISexp";

    /** Tag of Element SPKISexp **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509DIGEST = "X509Digest";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYINFOREFERENCE = "KeyInfoReference";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DERENCODEDKEYVALUE = "DEREncodedKeyValue";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGPKEYPACKET = "PGPKeyPacket";

    /** Tag of Element PGPKeyPacket **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGPKEYID = "PGPKeyID";

    /** Tag of Element PGPKeyID **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509SERIALNUMBER = "X509SerialNumber";

    /** Tag of Element X509SerialNumber **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509ISSUERNAME = "X509IssuerName";

    /** Tag of Element X509IssuerName **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509CRL = "X509CRL";

    /** Tag of Element X509CRL **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509CERTIFICATE = "X509Certificate";

    /** Tag of Element X509Certificate **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509SUBJECTNAME = "X509SubjectName";

    /** Tag of Element X509SubjectName **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509SKI = "X509SKI";

    /** Tag of Element X509SKI **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509ISSUERSERIAL= "X509IssuerSerial";

    /** Tag of Element X509IssuerSerial **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_RAWX509CERTIFICATE = "rawX509Certificate";

    /** Tag of Element rawX509Certificate **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGENCOUNTER = "PgenCounter";

    /** Tag of Element PgenCounter **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SEED = "Seed";

    /** Tag of Element Seed **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_J = "J";

    /** Tag of Element J **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_Y = "Y";

    /** Tag of Element Y **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_G = "G";

    /** Tag of Element G **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_Q   = "Q";

    /** Tag of Element Q **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_P = "P";

    /** Tag of Element P **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DSAKEYVALUE = "DSAKeyValue";

    /** Tag of Element DSAKeyValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_MODULUS = "Modulus";

    /** Tag of Element Modulus **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_EXPONENT = "Exponent";

    /** Tag of Element Exponent **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_RSAKEYVALUE = "RSAKeyValue";

    /** Tag of Element RSAKeyValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_MGMTDATA = "MgmtData";

    /** Tag of Element MgmtData **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SPKIDATA = "SPKIData";

    /** Tag of Element SPKIData **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_PGPDATA = "PGPData";

    /** Tag of Element PGPData **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_X509DATA = "X509Data";

    /** Tag of Element X509Data **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_RETRIEVALMETHOD = "RetrievalMethod";

    /** Tag of Element RetrievalMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYVALUE = "KeyValue";

    /** Tag of Element KeyValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYNAME = "KeyName";

    /** Tag of Element KeyName **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_KEYINFO = "KeyInfo";

    /** Tag of Element KeyInfo **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_XPATH = "XPath";

    /** Tag of Element XPath **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_TRANSFORMS = "Transforms";

    /** Tag of Element Transforms **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_TRANSFORM = "Transform";

    /** Tag of Element Transform **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNEDINFO = "SignedInfo";

    /** Tag of Element SignedInfo **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREVALUE = "SignatureValue";

    /** Tag of Element SignatureValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREPROPERTY = "SignatureProperty";

    /** Tag of Element SignatureProperty **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREPROPERTIES = "SignatureProperties";

    /** Tag of Element SignatureProperties **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_HMACOUTPUTLENGTH = "HMACOutputLength";

    /** Tag of Element HMACOutputLength **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATUREMETHOD = "SignatureMethod";

    /** Tag of Element SignatureMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_SIGNATURE = "Signature";

    /** Tag of Element Signature **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_REFERENCE = "Reference";

    /** Tag of Element Reference **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_OBJECT = "Object";

    /** Tag of Element Object **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_METHODS = "Methods";

    /** Tag of Element Methods **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_MANIFEST = "Manifest";

    /** Tag of Element Manifest **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DIGESTVALUE = "DigestValue";

    /** Tag of Element DigestValue **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_DIGESTMETHOD = "DigestMethod";

    /** Tag of Element DigestMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _TAG_CANONICALIZATIONMETHOD = "CanonicalizationMethod";

    /** Tag of Element CanonicalizationMethod **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_TARGET = "Target";

    /** Tag of Attr Target**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_ENCODING = "Encoding";

    /** Tag of Attr Encoding**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_MIMETYPE = "MimeType";

    /** Tag of Attr MimeType**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_ID = "Id";

    /** Tag of Attr Id**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_TYPE = "Type";

    /** Tag of Attr Type**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_URI = "URI";

    /** Tag of Attr URI**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String _ATT_ALGORITHM = "Algorithm";

    /** Tag of Attr Algorithm**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String NamespaceSpecNS = "http://www.w3.org/2000/xmlns/";

    /** The URI for XMLNS spec*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String XML_LANG_SPACE_SpecNS = "http://www.w3.org/XML/1998/namespace";

    /** The URI for XML spec*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String MoreAlgorithmsSpecNS = "http://www.w3.org/2001/04/xmldsig-more#";

    /** The URL for more algorithms **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String SignatureSpec11NS = "http://www.w3.org/2009/xmldsig11#";

    /**
     * The namespace of the
     * <A HREF="http://www.w3.org/TR/xmldsig-core1/">XML Signature specification</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String SignatureSpecNS = "http://www.w3.org/2000/09/xmldsig#";

    /**
     * The namespace of the
     * <A HREF="http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/">XML Signature specification</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String SIGNATURESPECIFICATION_URL =

    /**
     * The URL of the
     * <A HREF="http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/">XML Signature specification</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String exceptionMessagesResourceBundleBase =

    /** Field exceptionMessagesResourceBundleBase is the location of the <CODE>ResourceBundle</CODE> */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String exceptionMessagesResourceBundleDir =

    /** Field exceptionMessagesResourceBundleDir */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String configurationFileNew = ".xmlsecurityconfig";

    /** Field configurationFileNew */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
    public static final String configurationFile = "data/websig.conf";

    /** Field configurationFile */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
public class Constants {

/**
 * Provides all constants and some translation functions for i18n.
 *
 * For the used Algorithm identifiers and Namespaces, look at the
 * <A HREF="http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg">XML
 * Signature specification</A>.
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Constants.java
package com.sun.org.apache.xml.internal.security.utils;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final double XSLTVERSUPPORTED = 1.0;

  /**
   * The minimum version of XSLT supported by this processor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * EXSLT extension namespaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * Xalan extension namespaces.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * The old built-in extension url. It is still supported for
   * backward compatibility.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /** S_BUILTIN_EXTENSIONS_URL is a mnemonic for the XML Namespace
   *(http://xml.apache.org/xalan) predefined to signify Xalan's
   * built-in XSLT Extensions. When used in stylesheets, this is often
   * bound to the "xalan:" prefix.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /** Authorship mnemonics, as Java Strings. Not standardized,
   * as far as I know.
   * <ul>
   * <li>S_VENDOR -- the name of the organization/individual who published
   * this XSLT processor. </li>
   * <li>S_VENDORURL -- URL where one can attempt to retrieve more
   * information about this publisher and product.</li>
   * </ul>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
  public static final String

  /**
   * Mnemonics for standard XML Namespace URIs, as Java Strings:
   * <ul>
   * <li>S_XMLNAMESPACEURI (http://www.w3.org/XML/1998/namespace) is the
   * URI permanantly assigned to the "xml:" prefix. This is used for some
   * features built into the XML specification itself, such as xml:space
   * and xml:lang. It was defined by the W3C's XML Namespaces spec.</li>
   * <li>S_XSLNAMESPACEURL (http://www.w3.org/1999/XSL/Transform) is the
   * URI which indicates that a name may be an XSLT directive. In most
   * XSLT stylesheets, this is bound to the "xsl:" prefix. It's defined
   * by the W3C's XSLT Recommendation.</li>
   * <li>S_OLDXSLNAMESPACEURL (http://www.w3.org/XSL/Transform/1.0) was
   * used in early prototypes of XSLT processors for much the same purpose
   * as S_XSLNAMESPACEURL. It is now considered obsolete, and the version
   * of XSLT which it signified is not fully compatable with the final
   * XSLT Recommendation, so what it really signifies is a badly obsolete
   * stylesheet.</li>
   * </ul> */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Constants.java
public class Constants

/**
 * Primary constants used by the XSLT Processor
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String StyleHidden = "style:hidden";

    /** Whether the style is hidden from the user */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String StyleAdditive = "style:additive";

    /** Whether the style is additive */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String StyleNext = "style:nextStyle";

    /** The style of the text following this style */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String STCharacter = "character";

    /** Value for StyleType indicating a character style */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String STSection = "section";

    /** Value for StyleType indicating a section style */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String StyleType = "style:type";

    /** Indicates the domain of a Style */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String RTFCharacterSet = "rtfCharacterSet";

    /** The name of the character set the original RTF file was in */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
    static final String Tabs = "tabs";

    /** An array of TabStops */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/rtf/Constants.java
class Constants

/**
   Class to hold dictionary keys used by the RTF reader/writer.
   These should be moved into StyleConstants.
*/
