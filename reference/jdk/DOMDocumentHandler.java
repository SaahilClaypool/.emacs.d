_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void processingInstruction(ProcessingInstruction node) throws XNIException;

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param node a ProcessingInstruction node
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void comment(Comment node) throws XNIException;

    /**
     * A comment.
     *
     * @param node a Comment node
     *
     * @exception XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void doctypeDecl(DocumentType node) throws XNIException;

    /**
     * A document type declaration.
     *
     * @param node a DocumentType node
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void setDOMResult(DOMResult result);

    /**
     * <p>Sets the <code>DOMResult</code> object which
     * receives the constructed DOM nodes.</p>
     *
     * @param result the object which receives the constructed DOM nodes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
interface DOMDocumentHandler extends XMLDocumentHandler {

/**
 * <p>An extension to XMLDocumentHandler for building DOM structures.</p>
 *
 * @author Michael Glavassevich, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void processingInstruction(ProcessingInstruction node) throws XNIException;

    /**
     * A processing instruction. Processing instructions consist of a
     * target name and, optionally, text data. The data is only meaningful
     * to the application.
     * <p>
     * Typically, a processing instruction's data will contain a series
     * of pseudo-attributes. These pseudo-attributes follow the form of
     * element attributes but are <strong>not</strong> parsed or presented
     * to the application as anything other than text. The application is
     * responsible for parsing the data.
     *
     * @param node a ProcessingInstruction node
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void comment(Comment node) throws XNIException;

    /**
     * A comment.
     *
     * @param node a Comment node
     *
     * @exception XNIException Thrown by application to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void doctypeDecl(DocumentType node) throws XNIException;

    /**
     * A document type declaration.
     *
     * @param node a DocumentType node
     *
     * @exception XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
    public void setDOMResult(DOMResult result);

    /**
     * <p>Sets the <code>DOMResult</code> object which
     * receives the constructed DOM nodes.</p>
     *
     * @param result the object which receives the constructed DOM nodes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMDocumentHandler.java
interface DOMDocumentHandler extends XMLDocumentHandler {

/**
 * <p>An extension to XMLDocumentHandler for building DOM structures.</p>
 *
 * @author Michael Glavassevich, IBM
 */
