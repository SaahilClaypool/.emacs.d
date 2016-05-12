_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLDocumentScanner.java
    public boolean scanDocument(boolean complete)

    /**
     * Scans a document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLDocumentScanner.java
    public void setInputSource(XMLInputSource inputSource) throws IOException;

    /**
     * Sets the input source.
     *
     * @param inputSource The input source.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLDocumentScanner.java
public interface XMLDocumentScanner

/**
 * This interface defines a generic document scanner. This interface
 * allows a scanner to be used interchangably in existing parser
 * configurations.
 * <p>
 * If the parser configuration uses a document scanner that implements
 * this interface, components should be able to query the scanner
 * instance from the component manager using the following property
 * identifier:
 * <blockquote>
 *  "http://apache.org/xml/properties/internal/document-scanner"
 * </blockquote>
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLDocumentScanner.java
    public boolean scanDocument(boolean complete)

    /**
     * Scans a document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLDocumentScanner.java
    public void setInputSource(XMLInputSource inputSource) throws IOException;

    /**
     * Sets the input source.
     *
     * @param inputSource The input source.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLDocumentScanner.java
public interface XMLDocumentScanner

/**
 * This interface defines a generic document scanner. This interface
 * allows a scanner to be used interchangably in existing parser
 * configurations.
 * <p>
 * If the parser configuration uses a document scanner that implements
 * this interface, components should be able to query the scanner
 * instance from the component manager using the following property
 * identifier:
 * <blockquote>
 *  "http://apache.org/xml/properties/internal/document-scanner"
 * </blockquote>
 *
 * @author Andy Clark, IBM
 *
 */
