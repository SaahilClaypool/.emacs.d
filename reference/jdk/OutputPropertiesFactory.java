_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    static private String fixupPropertyString(String s, boolean doClipping)

    /**
     * Fix up a string in an output properties file according to
     * the rules of {@link #loadPropertiesFile}.
     *
     * @param s non-null reference to string that may need to be fixed up.
     * @return A new string if fixup occured, otherwise the s argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    static private Properties loadPropertiesFile(
        final String resourceName,
        Properties defaults)

    /**
     * Load the properties file from a resource stream.  If a
     * key name such as "org.apache.xslt.xxx", fix up the start of
     * string to be a curly namespace.  If a key name starts with
     * "xslt.output.xxx", clip off "xslt.output.".  If a key name *or* a
     * key value is discovered, check for \u003a in the text, and
     * fix it up to be ":", since earlier versions of the JDK do not
     * handle the escape sequence (at least in key names).
     *
     * @param resourceName non-null reference to resource name.
     * @param defaults Default properties, which may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    static public final Properties getDefaultMethodProperties(String method)

    /**
     * Creates an empty OutputProperties with the property key/value defaults specified by
     * a property file.  The method argument is used to construct a string of
     * the form output_[method].properties (for instance, output_html.properties).
     * The output_xml.properties file is always used as the base.
     *
     * <p>Anything other than 'text', 'xml', and 'html', will
     * use the output_xml.properties file.</p>
     *
     * @param   method non-null reference to method name.
     *
     * @return Properties object that holds the defaults for the given method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_unknown_properties = null;

    /** The properties when method="" for the "unknown" wrapper */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_text_properties = null;

    /** The default properties when method="text". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_html_properties = null;

    /** The default properties when method="html". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_xml_properties = null;

    //************************************************************
    //*  PRIVATE STATIC FIELDS
    //************************************************************

    /** The default properties of all output files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String PROP_FILE_UNKNOWN = "output_unknown.properties";

    /** property file for default UNKNOWN (Either XML or HTML, to be determined later) properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String PROP_FILE_TEXT = "output_text.properties";

    /** property file for default TEXT properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String PROP_DIR = "com/sun/org/apache/xml/internal/serializer/";

    /** the directory in which the various method property files are located */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Integer m_synch_object = new Integer(1);

    //************************************************************
    //*  PRIVATE CONSTANTS
    //************************************************************

    private static final String S_XSLT_PREFIX = "xslt.output.";
    private static final int S_XSLT_PREFIX_LEN = S_XSLT_PREFIX.length();
    private static final String S_XALAN_PREFIX = "org.apache.xslt.";
    private static final int S_XALAN_PREFIX_LEN = S_XALAN_PREFIX.length();

    /** Synchronization object for lazy initialization of the above tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
        /**

    /**
     * This non-standard, Oracle-impl only property key is used as if OutputKeys.STANDALONE is specified but
     * without writing it out in the declaration; It can be used to reverse the change by Xalan patch 1495.
     * Since Xalan patch 1495 can cause incompatible behavior, this property is add for application to neutralize
     * the effect of Xalan patch 1495
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final int S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL_LEN =

    /**
     * This is not a public API, it is only public because it is used
     * by outside of this package,
     * it is the length of the old built-in extension namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL =

    /**
     * The old built-in extension namespace, this is not a public API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_OMIT_META_TAG =

    /**
     * This non-standard property key is used to set a value of "yes" if the META tag should be omitted where it would
     *  otherwise be supplied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_USE_URL_ESCAPING =

    /**
     * This non-standard property key is used to set a value of "yes" if the href values for HTML serialization should
     *  use %xx escaping. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_ENTITIES =

    /**
     * This non-standard property key is used to specify the name of the property file
     * that specifies character to entity reference mappings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_CONTENT_HANDLER =

    /** This non-standard property key is used to set the name of the fully qualified
     * Java class that implements the ContentHandler interface.
     * Fully qualified name of class with a default constructor that
     *  implements the ContentHandler interface, where the result tree events
     *  will be sent to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_LINE_SEPARATOR =

    /**
     * The non-standard property key to use to set the
     * number of whitepaces to indent by, per indentation level,
     * if indent="yes".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_INDENT_AMOUNT =

    /**
     * The non-standard property key to use to set the
     * number of whitepaces to indent by, per indentation level,
     * if indent="yes".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_BUILTIN_EXTENSIONS_UNIVERSAL =

    //************************************************************
    //*  PUBLIC CONSTANTS
    //************************************************************
    /**
     * This is not a public API.
     * This is the built-in extensions namespace,
     * reexpressed in {namespaceURI} syntax
     * suitable for prepending to a localname to produce a "universal
     * name".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String

    /**
     * The old built-in extension url. It is still supported for
     * backward compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String

    /** S_BUILTIN_EXTENSIONS_URL is a mnemonic for the XML Namespace
     *(http://xml.apache.org/xalan) predefined to signify Xalan's
     * built-in XSLT Extensions. When used in stylesheets, this is often
     * bound to the "xalan:" prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
public final class OutputPropertiesFactory

/**
 * This class is a factory to generate a set of default properties
 * of key/value pairs that are used to create a serializer through the
 * factory {@link SerializerFactory SerilizerFactory}.
 * The properties generated by this factory
 * may be modified to non-default values before the SerializerFactory is used to
 * create a Serializer.
 * <p>
 * The given output types supported are "xml", "text", and "html".
 * These type strings can be obtained from the
 * {@link Method Method} class in this package.
 * <p>
 * Other constants defined in this class are the non-standard property keys
 * that can be used to set non-standard property values on a java.util.Properties object
 * that is used to create or configure a serializer. Here are the non-standard keys:
 * <ul>
 * <li> <b>S_KEY_INDENT_AMOUNT </b> -
 * The non-standard property key to use to set the indentation amount.
 * The "indent" key needs to have a value of "yes", and this
 * properties value is a the number of whitespaces to indent by per
 * indentation level.
 *
 * <li> <b>S_KEY_CONTENT_HANDLER </b> -
 * This non-standard property key is used to set the name of the fully qualified
 * Java class that implements the ContentHandler interface.
 * The output of the serializer will be SAX events sent to this an
 * object of this class.
 *
 * <li> <b>S_KEY_ENTITIES </b> -
 * This non-standard property key is used to specify the name of the property file
 * that specifies character to entity reference mappings. A line in such a
 * file is has the name of the entity and the numeric (base 10) value
 * of the corresponding character, like this one: <br> quot=34 <br>
 *
 * <li> <b>S_USE_URL_ESCAPING </b> -
 * This non-standard property key is used to set a value of "yes" if the href values for HTML serialization should
 *  use %xx escaping.
 *
 * <li> <b>S_OMIT_META_TAG </b> -
 * This non-standard property key is used to set a value of "yes" if the META tag should be omitted where it would
 *  otherwise be supplied.
 * </ul>
 *
 * @see SerializerFactory
 * @see Method
 * @see Serializer
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    static private String fixupPropertyString(String s, boolean doClipping)

    /**
     * Fix up a string in an output properties file according to
     * the rules of {@link #loadPropertiesFile}.
     *
     * @param s non-null reference to string that may need to be fixed up.
     * @return A new string if fixup occured, otherwise the s argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    static private Properties loadPropertiesFile(
        final String resourceName,
        Properties defaults)

    /**
     * Load the properties file from a resource stream.  If a
     * key name such as "org.apache.xslt.xxx", fix up the start of
     * string to be a curly namespace.  If a key name starts with
     * "xslt.output.xxx", clip off "xslt.output.".  If a key name *or* a
     * key value is discovered, check for \u003a in the text, and
     * fix it up to be ":", since earlier versions of the JDK do not
     * handle the escape sequence (at least in key names).
     *
     * @param resourceName non-null reference to resource name.
     * @param defaults Default properties, which may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    static public final Properties getDefaultMethodProperties(String method)

    /**
     * Creates an empty OutputProperties with the property key/value defaults specified by
     * a property file.  The method argument is used to construct a string of
     * the form output_[method].properties (for instance, output_html.properties).
     * The output_xml.properties file is always used as the base.
     *
     * <p>Anything other than 'text', 'xml', and 'html', will
     * use the output_xml.properties file.</p>
     *
     * @param   method non-null reference to method name.
     *
     * @return Properties object that holds the defaults for the given method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_unknown_properties = null;

    /** The properties when method="" for the "unknown" wrapper */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_text_properties = null;

    /** The default properties when method="text". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_html_properties = null;

    /** The default properties when method="html". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Properties m_xml_properties = null;

    //************************************************************
    //*  PRIVATE STATIC FIELDS
    //************************************************************

    /** The default properties of all output files. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String PROP_FILE_UNKNOWN = "output_unknown.properties";

    /** property file for default UNKNOWN (Either XML or HTML, to be determined later) properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String PROP_FILE_TEXT = "output_text.properties";

    /** property file for default TEXT properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String PROP_DIR = "com/sun/org/apache/xml/internal/serializer/";

    /** the directory in which the various method property files are located */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static Integer m_synch_object = new Integer(1);

    //************************************************************
    //*  PRIVATE CONSTANTS
    //************************************************************

    private static final String S_XSLT_PREFIX = "xslt.output.";
    private static final int S_XSLT_PREFIX_LEN = S_XSLT_PREFIX.length();
    private static final String S_XALAN_PREFIX = "org.apache.xslt.";
    private static final int S_XALAN_PREFIX_LEN = S_XALAN_PREFIX.length();

    /** Synchronization object for lazy initialization of the above tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
        /**

    /**
     * This non-standard, Oracle-impl only property key is used as if OutputKeys.STANDALONE is specified but
     * without writing it out in the declaration; It can be used to reverse the change by Xalan patch 1495.
     * Since Xalan patch 1495 can cause incompatible behavior, this property is add for application to neutralize
     * the effect of Xalan patch 1495
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final int S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL_LEN =

    /**
     * This is not a public API, it is only public because it is used
     * by outside of this package,
     * it is the length of the old built-in extension namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL =

    /**
     * The old built-in extension namespace, this is not a public API.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_OMIT_META_TAG =

    /**
     * This non-standard property key is used to set a value of "yes" if the META tag should be omitted where it would
     *  otherwise be supplied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_USE_URL_ESCAPING =

    /**
     * This non-standard property key is used to set a value of "yes" if the href values for HTML serialization should
     *  use %xx escaping. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_ENTITIES =

    /**
     * This non-standard property key is used to specify the name of the property file
     * that specifies character to entity reference mappings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_CONTENT_HANDLER =

    /** This non-standard property key is used to set the name of the fully qualified
     * Java class that implements the ContentHandler interface.
     * Fully qualified name of class with a default constructor that
     *  implements the ContentHandler interface, where the result tree events
     *  will be sent to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_LINE_SEPARATOR =

    /**
     * The non-standard property key to use to set the
     * number of whitepaces to indent by, per indentation level,
     * if indent="yes".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_KEY_INDENT_AMOUNT =

    /**
     * The non-standard property key to use to set the
     * number of whitepaces to indent by, per indentation level,
     * if indent="yes".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    public static final String S_BUILTIN_EXTENSIONS_UNIVERSAL =

    //************************************************************
    //*  PUBLIC CONSTANTS
    //************************************************************
    /**
     * This is not a public API.
     * This is the built-in extensions namespace,
     * reexpressed in {namespaceURI} syntax
     * suitable for prepending to a localname to produce a "universal
     * name".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String

    /**
     * The old built-in extension url. It is still supported for
     * backward compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
    private static final String

    /** S_BUILTIN_EXTENSIONS_URL is a mnemonic for the XML Namespace
     *(http://xml.apache.org/xalan) predefined to signify Xalan's
     * built-in XSLT Extensions. When used in stylesheets, this is often
     * bound to the "xalan:" prefix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/OutputPropertiesFactory.java
public final class OutputPropertiesFactory

/**
 * This class is a factory to generate a set of default properties
 * of key/value pairs that are used to create a serializer through the
 * factory {@link SerializerFactory SerilizerFactory}.
 * The properties generated by this factory
 * may be modified to non-default values before the SerializerFactory is used to
 * create a Serializer.
 * <p>
 * The given output types supported are "xml", "text", and "html".
 * These type strings can be obtained from the
 * {@link Method Method} class in this package.
 * <p>
 * Other constants defined in this class are the non-standard property keys
 * that can be used to set non-standard property values on a java.util.Properties object
 * that is used to create or configure a serializer. Here are the non-standard keys:
 * <ul>
 * <li> <b>S_KEY_INDENT_AMOUNT </b> -
 * The non-standard property key to use to set the indentation amount.
 * The "indent" key needs to have a value of "yes", and this
 * properties value is a the number of whitespaces to indent by per
 * indentation level.
 *
 * <li> <b>S_KEY_CONTENT_HANDLER </b> -
 * This non-standard property key is used to set the name of the fully qualified
 * Java class that implements the ContentHandler interface.
 * The output of the serializer will be SAX events sent to this an
 * object of this class.
 *
 * <li> <b>S_KEY_ENTITIES </b> -
 * This non-standard property key is used to specify the name of the property file
 * that specifies character to entity reference mappings. A line in such a
 * file is has the name of the entity and the numeric (base 10) value
 * of the corresponding character, like this one: <br> quot=34 <br>
 *
 * <li> <b>S_USE_URL_ESCAPING </b> -
 * This non-standard property key is used to set a value of "yes" if the href values for HTML serialization should
 *  use %xx escaping.
 *
 * <li> <b>S_OMIT_META_TAG </b> -
 * This non-standard property key is used to set a value of "yes" if the META tag should be omitted where it would
 *  otherwise be supplied.
 * </ul>
 *
 * @see SerializerFactory
 * @see Method
 * @see Serializer
 */
