_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public void clear() {

    /**
     * clear
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public void setValues(XMLSimpleType simpleType) {

    /** Set values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public void setValues(short type, String name, String[] enumeration,
                          boolean list, short defaultType,
                          String defaultValue, String nonNormalizedDefaultValue,
                          DatatypeValidator datatypeValidator) {

    /**
     * setValues
     *
     * @param type
     * @param name
     * @param enumeration
     * @param list
     * @param defaultType
     * @param defaultValue
     * @param nonNormalizedDefaultValue
     * @param datatypeValidator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public DatatypeValidator datatypeValidator;

    /** datatypeValidator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String nonNormalizedDefaultValue;

    /** non-normalized defaultValue */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String defaultValue;

    /** defaultValue */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public short defaultType;

    /** defaultType */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public boolean list;

    /** list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String[] enumeration;

    /** enumeration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String name;

    /** name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public short type;

    /** type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_REQUIRED = 2;

    /** DEFAULT_TYPE_REQUIRED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_IMPLIED = 0;

    /** DEFAULT_TYPE_IMPLIED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_FIXED = 1;

    /** DEFAULT_TYPE_FIXED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_DEFAULT = 3;

    /** DEFAULT_TYPE_DEFAULT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_NAMED = 7;

    /** TYPE_NAMED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_NOTATION = 6;

    /** TYPE_NOTATION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_NMTOKEN = 5;

    /** TYPE_NMTOKEN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_IDREF = 4;

    /** TYPE_IDREF */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_ID = 3;

    /** TYPE_ID */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_ENUMERATION = 2;

    /** TYPE_ENUMERATION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_ENTITY = 1;

    /** TYPE_ENTITY */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_CDATA = 0;

    /** TYPE_CDATA */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
public class XMLSimpleType {

/**
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public void clear() {

    /**
     * clear
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public void setValues(XMLSimpleType simpleType) {

    /** Set values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public void setValues(short type, String name, String[] enumeration,
                          boolean list, short defaultType,
                          String defaultValue, String nonNormalizedDefaultValue,
                          DatatypeValidator datatypeValidator) {

    /**
     * setValues
     *
     * @param type
     * @param name
     * @param enumeration
     * @param list
     * @param defaultType
     * @param defaultValue
     * @param nonNormalizedDefaultValue
     * @param datatypeValidator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public DatatypeValidator datatypeValidator;

    /** datatypeValidator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String nonNormalizedDefaultValue;

    /** non-normalized defaultValue */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String defaultValue;

    /** defaultValue */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public short defaultType;

    /** defaultType */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public boolean list;

    /** list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String[] enumeration;

    /** enumeration */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public String name;

    /** name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public short type;

    /** type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_REQUIRED = 2;

    /** DEFAULT_TYPE_REQUIRED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_IMPLIED = 0;

    /** DEFAULT_TYPE_IMPLIED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_FIXED = 1;

    /** DEFAULT_TYPE_FIXED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short DEFAULT_TYPE_DEFAULT = 3;

    /** DEFAULT_TYPE_DEFAULT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_NAMED = 7;

    /** TYPE_NAMED */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_NOTATION = 6;

    /** TYPE_NOTATION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_NMTOKEN = 5;

    /** TYPE_NMTOKEN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_IDREF = 4;

    /** TYPE_IDREF */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_ID = 3;

    /** TYPE_ID */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_ENUMERATION = 2;

    /** TYPE_ENUMERATION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_ENTITY = 1;

    /** TYPE_ENTITY */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
    public static final short TYPE_CDATA = 0;

    /** TYPE_CDATA */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLSimpleType.java
public class XMLSimpleType {

/**
 */
