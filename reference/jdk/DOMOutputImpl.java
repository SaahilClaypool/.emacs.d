_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setEncoding(String encoding){

   /**
    * The character encoding, if known. The encoding must be a string
    * acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3
    * "Character Encoding in Entities"). This attribute has no effect when the
    * application provides a character stream or string data. For other sources
    * of input, an encoding specified by means of this attribute will override
    * any encoding specified in the XML declaration or the Text declaration, or
    * an encoding obtained from a higher level protocol, such as HTTP
    * [IETF RFC 2616].
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public String getEncoding(){

   /**
    * The character encoding, if known. The encoding must be a string
    * acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3
    * "Character Encoding in Entities"). This attribute has no effect when the
    * application provides a character stream or string data. For other sources
    * of input, an encoding specified by means of this attribute will override
    * any encoding specified in the XML declaration or the Text declaration, or
    * an encoding obtained from a higher level protocol, such as HTTP
    * [IETF RFC 2616].
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setSystemId(String systemId){

   /**
    * The system identifier, a URI reference [IETF RFC 2396], for this output
    *  destination. If the application knows the character encoding of the
    *  object pointed to by the system identifier, it can set the encoding
    *  using the encoding attribute. If the system ID is a relative URI
    *  reference (see section 5 in [IETF RFC 2396]), the behavior is
    *  implementation dependent.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public String getSystemId(){

   /**
    * The system identifier, a URI reference [IETF RFC 2396], for this output
    *  destination. If the application knows the character encoding of the
    *  object pointed to by the system identifier, it can set the encoding
    *  using the encoding attribute. If the system ID is a relative URI
    *  reference (see section 5 in [IETF RFC 2396]), the behavior is
    *  implementation dependent.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setByteStream(OutputStream byteStream){

   /**
    * Depending on the language binding in use, this attribute may not be
    * available. An attribute of a language and binding dependent type that
    * represents a writable stream to which 16-bit units can be output. The
    * application must encode the stream using UTF-16 (defined in [Unicode] and
    *  Amendment 1 of [ISO/IEC 10646]).
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public OutputStream getByteStream(){

   /**
    * Depending on the language binding in use, this attribute may not be
    * available. An attribute of a language and binding dependent type that
    * represents a writable stream to which 16-bit units can be output. The
    * application must encode the stream using UTF-16 (defined in [Unicode] and
    *  Amendment 1 of [ISO/IEC 10646]).
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setCharacterStream(Writer characterStream){

   /**
    * An attribute of a language and binding dependent type that represents a
    * writable stream of bytes. If the application knows the character encoding
    * of the byte stream, it should set the encoding attribute. Setting the
    * encoding in this way will override any encoding specified in an XML
    * declaration in the data.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public Writer getCharacterStream(){

   /**
    * An attribute of a language and binding dependent type that represents a
    * writable stream of bytes. If the application knows the character encoding
    * of the byte stream, it should set the encoding attribute. Setting the
    * encoding in this way will override any encoding specified in an XML
    * declaration in the data.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public DOMOutputImpl() {}

   /**
    * Default Constructor
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
public class DOMOutputImpl implements LSOutput {

/**
 * This class represents an output destination for data.
 * This interface allows an application to encapsulate information about an
 * output destination in a single object, which may include a URI, a byte stream
 * (possibly with a specifiedencoding), a base URI, and/or a character stream.
 * The exact definitions of a byte stream and a character stream are binding
 * dependent.
 * The application is expected to provide objects that implement this interface
 * whenever such objects are needed. The application can either provide its
 * own objects that implement this interface, or it can use the generic factory
 * method DOMImplementationLS.createLSOutput() to create objects that
 * implement this interface.
 * The DOMSerializer will use the LSOutput object to determine where to
 * serialize the output to. The DOMSerializer will look at the different
 * outputs specified in the LSOutput in the following order to know which one
 * to output to, the first one that data can be output to will be used:
 * 1.LSOutput.characterStream
 * 2.LSOutput.byteStream
 * 3.LSOutput.systemId
 * LSOutput objects belong to the application. The DOM implementation will
 * never modify them (though it may make copies and modify the copies,
 * if necessary).
 *
 * @xerces.internal
 *
 * @author Arun Yadav, Sun Microsytems
 * @author Gopal Sharma, Sun Microsystems
 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setEncoding(String encoding){

   /**
    * The character encoding, if known. The encoding must be a string
    * acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3
    * "Character Encoding in Entities"). This attribute has no effect when the
    * application provides a character stream or string data. For other sources
    * of input, an encoding specified by means of this attribute will override
    * any encoding specified in the XML declaration or the Text declaration, or
    * an encoding obtained from a higher level protocol, such as HTTP
    * [IETF RFC 2616].
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public String getEncoding(){

   /**
    * The character encoding, if known. The encoding must be a string
    * acceptable for an XML encoding declaration ([XML 1.0] section 4.3.3
    * "Character Encoding in Entities"). This attribute has no effect when the
    * application provides a character stream or string data. For other sources
    * of input, an encoding specified by means of this attribute will override
    * any encoding specified in the XML declaration or the Text declaration, or
    * an encoding obtained from a higher level protocol, such as HTTP
    * [IETF RFC 2616].
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setSystemId(String systemId){

   /**
    * The system identifier, a URI reference [IETF RFC 2396], for this output
    *  destination. If the application knows the character encoding of the
    *  object pointed to by the system identifier, it can set the encoding
    *  using the encoding attribute. If the system ID is a relative URI
    *  reference (see section 5 in [IETF RFC 2396]), the behavior is
    *  implementation dependent.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public String getSystemId(){

   /**
    * The system identifier, a URI reference [IETF RFC 2396], for this output
    *  destination. If the application knows the character encoding of the
    *  object pointed to by the system identifier, it can set the encoding
    *  using the encoding attribute. If the system ID is a relative URI
    *  reference (see section 5 in [IETF RFC 2396]), the behavior is
    *  implementation dependent.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setByteStream(OutputStream byteStream){

   /**
    * Depending on the language binding in use, this attribute may not be
    * available. An attribute of a language and binding dependent type that
    * represents a writable stream to which 16-bit units can be output. The
    * application must encode the stream using UTF-16 (defined in [Unicode] and
    *  Amendment 1 of [ISO/IEC 10646]).
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public OutputStream getByteStream(){

   /**
    * Depending on the language binding in use, this attribute may not be
    * available. An attribute of a language and binding dependent type that
    * represents a writable stream to which 16-bit units can be output. The
    * application must encode the stream using UTF-16 (defined in [Unicode] and
    *  Amendment 1 of [ISO/IEC 10646]).
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public void setCharacterStream(Writer characterStream){

   /**
    * An attribute of a language and binding dependent type that represents a
    * writable stream of bytes. If the application knows the character encoding
    * of the byte stream, it should set the encoding attribute. Setting the
    * encoding in this way will override any encoding specified in an XML
    * declaration in the data.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public Writer getCharacterStream(){

   /**
    * An attribute of a language and binding dependent type that represents a
    * writable stream of bytes. If the application knows the character encoding
    * of the byte stream, it should set the encoding attribute. Setting the
    * encoding in this way will override any encoding specified in an XML
    * declaration in the data.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
    public DOMOutputImpl() {}

   /**
    * Default Constructor
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMOutputImpl.java
public class DOMOutputImpl implements LSOutput {

/**
 * This class represents an output destination for data.
 * This interface allows an application to encapsulate information about an
 * output destination in a single object, which may include a URI, a byte stream
 * (possibly with a specifiedencoding), a base URI, and/or a character stream.
 * The exact definitions of a byte stream and a character stream are binding
 * dependent.
 * The application is expected to provide objects that implement this interface
 * whenever such objects are needed. The application can either provide its
 * own objects that implement this interface, or it can use the generic factory
 * method DOMImplementationLS.createLSOutput() to create objects that
 * implement this interface.
 * The DOMSerializer will use the LSOutput object to determine where to
 * serialize the output to. The DOMSerializer will look at the different
 * outputs specified in the LSOutput in the following order to know which one
 * to output to, the first one that data can be output to will be used:
 * 1.LSOutput.characterStream
 * 2.LSOutput.byteStream
 * 3.LSOutput.systemId
 * LSOutput objects belong to the application. The DOM implementation will
 * never modify them (though it may make copies and modify the copies,
 * if necessary).
 *
 * @xerces.internal
 *
 * @author Arun Yadav, Sun Microsytems
 * @author Gopal Sharma, Sun Microsystems
 **/
