_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getXMLVersion();

    /**
     * Returns the XML version of the current entity. This will normally be the
     * value from the XML or text declaration or defaulted by the parser. Note that
     * that this value may be different than the version of the processing rules
     * applied to the current entity. For instance, an XML 1.1 document may refer to
     * XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire
     * document. Also note that, for a given entity, this value can only be considered
     * final once the XML or text declaration has been read or once it has been
     * determined that there is no such declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getEncoding();

    /**
     * Returns the encoding of the current entity.
     * Note that, for a given entity, this value can only be
     * considered final once the encoding declaration has been read (or once it
     * has been determined that there is no such declaration) since, no encoding
     * having been specified on the XMLInputSource, the parser
     * will make an initial "guess" which could be in error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public int getCharacterOffset();

    /** Returns the character offset, or <code>-1</code> if no character offset is available. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public int getColumnNumber();

    /** Returns the column number, or <code>-1</code> if no column number is available. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public int getLineNumber();

    /** Returns the line number, or <code>-1</code> if no line number is available. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getExpandedSystemId();

    /** Returns the expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getBaseSystemId();

    /** Returns the base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getLiteralSystemId();

    /** Returns the literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getPublicId();

    /** Returns the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
public interface XMLLocator {

/**
 * Location information.
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getXMLVersion();

    /**
     * Returns the XML version of the current entity. This will normally be the
     * value from the XML or text declaration or defaulted by the parser. Note that
     * that this value may be different than the version of the processing rules
     * applied to the current entity. For instance, an XML 1.1 document may refer to
     * XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire
     * document. Also note that, for a given entity, this value can only be considered
     * final once the XML or text declaration has been read or once it has been
     * determined that there is no such declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getEncoding();

    /**
     * Returns the encoding of the current entity.
     * Note that, for a given entity, this value can only be
     * considered final once the encoding declaration has been read (or once it
     * has been determined that there is no such declaration) since, no encoding
     * having been specified on the XMLInputSource, the parser
     * will make an initial "guess" which could be in error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public int getCharacterOffset();

    /** Returns the character offset, or <code>-1</code> if no character offset is available. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public int getColumnNumber();

    /** Returns the column number, or <code>-1</code> if no column number is available. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public int getLineNumber();

    /** Returns the line number, or <code>-1</code> if no line number is available. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getExpandedSystemId();

    /** Returns the expanded system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getBaseSystemId();

    /** Returns the base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getLiteralSystemId();

    /** Returns the literal system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
    public String getPublicId();

    /** Returns the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/XMLLocator.java
public interface XMLLocator {

/**
 * Location information.
 *
 * @author Andy Clark, IBM
 *
 */
