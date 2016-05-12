_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    public boolean isAttrFlagSet(String name, int flags)

    /**
     * Tell if any of the bits of interest are set for a named attribute type.
     *
     * @param name non-null reference to attribute name, in any case.
     * @param flags flag mask.
     *
     * @return true if any of the flags are set for the named attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    void setAttr(String name, int flags)

    /**
     * Set an attribute name and it's bit properties.
     *
     *
     * @param name non-null name of attribute, in upper case.
     * @param flags flag bits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private boolean is(int flags)

    /**
     * Tell if this element type has the basic bit properties that are passed
     * as an argument.
     *
     * @param flags Bit flags that describe the basic properties of interest.
     *
     * @return true if any of the flag bits are true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    ElemDesc(int flags)

    /**
     * Construct an ElemDesc from a set of bit flags.
     *
     *
     * @param flags Bit flags that describe the basic properties of this element type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    public static final int ATTREMPTY = (1 << 2);

    /** Bit position if this attribute type is an empty type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    public static final int ATTRURL = (1 << 1);

    /** Bit position if this attribute type is a URL. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int HTMLELEM = (1 << 23);

    /** Bit position if this element is the "HTML" element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int HEADELEM = (1 << 22);

    /** Bit position if this element type is a header element (i.e. HEAD). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int WHITESPACESENSITIVE = (1 << 21);

    /** Bit position if this element type is whitespace sensitive. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int PREFORMATTED = (1 << 20);

    /** Bit position if this element type is a preformatted type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int LIST = (1 << 19);

    /** Bit position if this element type is a list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int HEAD = (1 << 18);

    /** Bit position if this element type is a head element (i.e. H1, H2, etc.) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int HEADMISC = (1 << 17);

    /** Bit position if this element type is an odd header element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int ASPECIAL = (1 << 16);

    /** Bit position if this element type is ???. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int SPECIAL = (1 << 15);

    /** Bit position if this element type is ???. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int FORMCTRL = (1 << 14);

    /** Bit position if this element type is a form control. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int PHRASE = (1 << 13);

    /** Bit position if this element type is a phrase. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int FONTSTYLE = (1 << 12);

    /** Bit position if this element type is a font style. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int INLINELABEL = (1 << 11);

    /** Bit position if this element type is an inline label. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int INLINEA = (1 << 10);

    /** Bit position if this element type is INLINEA. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int INLINE = (1 << 9);

    /** Bit position if this element type should be inlined. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int RAW = (1 << 8);

    /** Bit position if this element type is should be raw characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int PCDATA = (1 << 7);

    /** Bit position if this element type is PCDATA. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int CDATA = (1 << 6);

    /** Bit position if this element type is CDATA. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int BLOCKFORMFIELDSET = (1 << 5);

    /** Bit position if this element type is a block form field set. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int BLOCKFORM = (1 << 4);

    /** Bit position if this element type is a block form. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int BLOCK = (1 << 3);

    /** Bit position if this element type is a block. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int FLOW = (1 << 2);

    /** Bit position if this element type is a flow. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int EMPTY = (1 << 1);

    /** Bit position if this element type is empty. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private StringToIntTable m_attrs = null;

    /**
     * Table of attribute names to integers, which contain bit flags telling about
     *  the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private int m_flags;

    /** Bit flags to tell about this element type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
public final class ElemDesc

/**
 * This class has a series of flags (bit values) that describe an HTML element
 *
 * This class is public because XSLTC uses it, it is not a public API.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  boolean isAttrFlagSet(String name, int flags)

  /**
   * Find out if a flag is set in a given attribute of this element
   *
   *
   * @param name Attribute name
   * @param flags Flag to check
   *
   * @return True if the flag is set in the attribute. Returns false
   * if the attribute is not found
   * @see m_flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  void setAttr(String name, int flags)

  /**
   * Set a new attribute for this element
   *
   *
   * @param name Attribute name
   * @param flags Attibute flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  boolean is(int flags)

  /**
   * "is (this element described by these flags)".
   *
   * This might more properly be called areFlagsSet(). It accepts an
   * integer (being used as a bitvector) and checks whether all the
   * corresponding bits are set in our internal flags. Note that this
   * test is performed as a bitwise AND, not an equality test, so a
   * 0 bit in the input means "don't test", not "must be set false".
   *
   * @param flags Vector of flags to compare against this element's flags
   *
   * @return true if the flags set in the parameter are also set in the
   * element's stored flags.
   *
   * @see m_flags
   * @see isAttrFlagSet
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  ElemDesc(int flags)

  /**
   * Construct an ElementDescription with an initial set of flags.
   *
   * @param flags Element flags
   * @see m_flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int ATTREMPTY = (1 << 2);

  /** Defines mnemonic and bit-value for the ATTREMPTY flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int ATTRURL = (1 << 1);

  /** Defines mnemonic and bit-value for the ATTRURL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int WHITESPACESENSITIVE = (1 << 21);

  /** Defines mnemonic and bit-value for the WHITESPACESENSITIVE flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int PREFORMATTED = (1 << 20);

  /** Defines mnemonic and bit-value for the PREFORMATTED flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int LIST = (1 << 19);

  /** Defines mnemonic and bit-value for the LIST flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int HEAD = (1 << 18);

  /** Defines mnemonic and bit-value for the HEAD flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int HEADMISC = (1 << 17);

  /** Defines mnemonic and bit-value for the HEADMISC flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int ASPECIAL = (1 << 16);

  /** Defines mnemonic and bit-value for the ASPECIAL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int SPECIAL = (1 << 15);

  /** Defines mnemonic and bit-value for the SPECIAL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int FORMCTRL = (1 << 14);

  /** Defines mnemonic and bit-value for the FORMCTRL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int PHRASE = (1 << 13);

  /** Defines mnemonic and bit-value for the PHRASE flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int FONTSTYLE = (1 << 12);

  /** Defines mnemonic and bit-value for the FONTSTYLE flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int INLINELABEL = (1 << 11);

  /** Defines mnemonic and bit-value for the INLINELABEL flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int INLINEA = (1 << 10);

  /** Defines mnemonic and bit-value for the INLINEA flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int INLINE = (1 << 9);

  /** Defines mnemonic and bit-value for the INLINE flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int RAW = (1 << 8);

  /** Defines mnemonic and bit-value for the RAW flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int PCDATA = (1 << 7);

  /** Defines mnemonic and bit-value for the PCDATA flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int CDATA = (1 << 6);

  /** Defines mnemonic and bit-value for the CDATA flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int BLOCKFORMFIELDSET = (1 << 5);

  /** Defines mnemonic and bit-value for the BLOCKFORMFIELDSET flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int BLOCKFORM = (1 << 4);

  /** Defines mnemonic and bit-value for the BLOCKFORM  flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int BLOCK = (1 << 3);

  /** Defines mnemonic and bit-value for the BLOCK flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int FLOW = (1 << 2);

  /** Defines mnemonic and bit-value for the FLOW flag  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int EMPTY = (1 << 1);

  /** Defines mnemonic and bit-value for the EMPTY flag */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  int m_flags;

  /** Element's flags, describing the role this element plays during
   * formatting of the document. This is used as a bitvector; more than one flag
   * may be set at a time, bitwise-ORed together. Mnemonic and bits
   * have been assigned to the flag values. NOTE: Some bits are
   * currently assigned multiple mnemonics; it is the caller's
   * responsibility to disambiguate these if necessary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  Map<String, Integer> m_attrs = null;

  /** Table of attributes for the element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
class ElemDesc

/**
 * This class is in support of SerializerToHTML, and acts as a sort
 * of element representative for HTML elements.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    public boolean isAttrFlagSet(String name, int flags)

    /**
     * Tell if any of the bits of interest are set for a named attribute type.
     *
     * @param name non-null reference to attribute name, in any case.
     * @param flags flag mask.
     *
     * @return true if any of the flags are set for the named attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    void setAttr(String name, int flags)

    /**
     * Set an attribute name and it's bit properties.
     *
     *
     * @param name non-null name of attribute, in upper case.
     * @param flags flag bits.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private boolean is(int flags)

    /**
     * Tell if this element type has the basic bit properties that are passed
     * as an argument.
     *
     * @param flags Bit flags that describe the basic properties of interest.
     *
     * @return true if any of the flag bits are true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    ElemDesc(int flags)

    /**
     * Construct an ElemDesc from a set of bit flags.
     *
     *
     * @param flags Bit flags that describe the basic properties of this element type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    public static final int ATTREMPTY = (1 << 2);

    /** Bit position if this attribute type is an empty type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    public static final int ATTRURL = (1 << 1);

    /** Bit position if this attribute type is a URL. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int HTMLELEM = (1 << 23);

    /** Bit position if this element is the "HTML" element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int HEADELEM = (1 << 22);

    /** Bit position if this element type is a header element (i.e. HEAD). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int WHITESPACESENSITIVE = (1 << 21);

    /** Bit position if this element type is whitespace sensitive. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int PREFORMATTED = (1 << 20);

    /** Bit position if this element type is a preformatted type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int LIST = (1 << 19);

    /** Bit position if this element type is a list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int HEAD = (1 << 18);

    /** Bit position if this element type is a head element (i.e. H1, H2, etc.) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int HEADMISC = (1 << 17);

    /** Bit position if this element type is an odd header element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int ASPECIAL = (1 << 16);

    /** Bit position if this element type is ???. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int SPECIAL = (1 << 15);

    /** Bit position if this element type is ???. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int FORMCTRL = (1 << 14);

    /** Bit position if this element type is a form control. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int PHRASE = (1 << 13);

    /** Bit position if this element type is a phrase. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int FONTSTYLE = (1 << 12);

    /** Bit position if this element type is a font style. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int INLINELABEL = (1 << 11);

    /** Bit position if this element type is an inline label. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int INLINEA = (1 << 10);

    /** Bit position if this element type is INLINEA. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int INLINE = (1 << 9);

    /** Bit position if this element type should be inlined. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int RAW = (1 << 8);

    /** Bit position if this element type is should be raw characters. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int PCDATA = (1 << 7);

    /** Bit position if this element type is PCDATA. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int CDATA = (1 << 6);

    /** Bit position if this element type is CDATA. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int BLOCKFORMFIELDSET = (1 << 5);

    /** Bit position if this element type is a block form field set. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int BLOCKFORM = (1 << 4);

    /** Bit position if this element type is a block form. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int BLOCK = (1 << 3);

    /** Bit position if this element type is a block. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private static final int FLOW = (1 << 2);

    /** Bit position if this element type is a flow. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    static final int EMPTY = (1 << 1);

    /** Bit position if this element type is empty. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private StringToIntTable m_attrs = null;

    /**
     * Table of attribute names to integers, which contain bit flags telling about
     *  the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
    private int m_flags;

    /** Bit flags to tell about this element type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ElemDesc.java
public final class ElemDesc

/**
 * This class has a series of flags (bit values) that describe an HTML element
 *
 * This class is public because XSLTC uses it, it is not a public API.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  boolean isAttrFlagSet(String name, int flags)

  /**
   * Find out if a flag is set in a given attribute of this element
   *
   *
   * @param name Attribute name
   * @param flags Flag to check
   *
   * @return True if the flag is set in the attribute. Returns false
   * if the attribute is not found
   * @see m_flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  void setAttr(String name, int flags)

  /**
   * Set a new attribute for this element
   *
   *
   * @param name Attribute name
   * @param flags Attibute flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  boolean is(int flags)

  /**
   * "is (this element described by these flags)".
   *
   * This might more properly be called areFlagsSet(). It accepts an
   * integer (being used as a bitvector) and checks whether all the
   * corresponding bits are set in our internal flags. Note that this
   * test is performed as a bitwise AND, not an equality test, so a
   * 0 bit in the input means "don't test", not "must be set false".
   *
   * @param flags Vector of flags to compare against this element's flags
   *
   * @return true if the flags set in the parameter are also set in the
   * element's stored flags.
   *
   * @see m_flags
   * @see isAttrFlagSet
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  ElemDesc(int flags)

  /**
   * Construct an ElementDescription with an initial set of flags.
   *
   * @param flags Element flags
   * @see m_flags
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int ATTREMPTY = (1 << 2);

  /** Defines mnemonic and bit-value for the ATTREMPTY flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int ATTRURL = (1 << 1);

  /** Defines mnemonic and bit-value for the ATTRURL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int WHITESPACESENSITIVE = (1 << 21);

  /** Defines mnemonic and bit-value for the WHITESPACESENSITIVE flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int PREFORMATTED = (1 << 20);

  /** Defines mnemonic and bit-value for the PREFORMATTED flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int LIST = (1 << 19);

  /** Defines mnemonic and bit-value for the LIST flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int HEAD = (1 << 18);

  /** Defines mnemonic and bit-value for the HEAD flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int HEADMISC = (1 << 17);

  /** Defines mnemonic and bit-value for the HEADMISC flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int ASPECIAL = (1 << 16);

  /** Defines mnemonic and bit-value for the ASPECIAL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int SPECIAL = (1 << 15);

  /** Defines mnemonic and bit-value for the SPECIAL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int FORMCTRL = (1 << 14);

  /** Defines mnemonic and bit-value for the FORMCTRL flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int PHRASE = (1 << 13);

  /** Defines mnemonic and bit-value for the PHRASE flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int FONTSTYLE = (1 << 12);

  /** Defines mnemonic and bit-value for the FONTSTYLE flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int INLINELABEL = (1 << 11);

  /** Defines mnemonic and bit-value for the INLINELABEL flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int INLINEA = (1 << 10);

  /** Defines mnemonic and bit-value for the INLINEA flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int INLINE = (1 << 9);

  /** Defines mnemonic and bit-value for the INLINE flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int RAW = (1 << 8);

  /** Defines mnemonic and bit-value for the RAW flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int PCDATA = (1 << 7);

  /** Defines mnemonic and bit-value for the PCDATA flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int CDATA = (1 << 6);

  /** Defines mnemonic and bit-value for the CDATA flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int BLOCKFORMFIELDSET = (1 << 5);

  /** Defines mnemonic and bit-value for the BLOCKFORMFIELDSET flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int BLOCKFORM = (1 << 4);

  /** Defines mnemonic and bit-value for the BLOCKFORM  flag         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int BLOCK = (1 << 3);

  /** Defines mnemonic and bit-value for the BLOCK flag          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int FLOW = (1 << 2);

  /** Defines mnemonic and bit-value for the FLOW flag  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  static final int EMPTY = (1 << 1);

  /** Defines mnemonic and bit-value for the EMPTY flag */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  int m_flags;

  /** Element's flags, describing the role this element plays during
   * formatting of the document. This is used as a bitvector; more than one flag
   * may be set at a time, bitwise-ORed together. Mnemonic and bits
   * have been assigned to the flag values. NOTE: Some bits are
   * currently assigned multiple mnemonics; it is the caller's
   * responsibility to disambiguate these if necessary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
  Map<String, Integer> m_attrs = null;

  /** Table of attributes for the element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ElemDesc.java
class ElemDesc

/**
 * This class is in support of SerializerToHTML, and acts as a sort
 * of element representative for HTML elements.
 * @xsl.usage internal
 */
