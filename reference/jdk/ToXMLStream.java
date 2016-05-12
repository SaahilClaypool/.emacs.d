_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    private String getXMLVersion()

    /**
     * This method checks for the XML version of output document.
     * If XML version of output document is not specified, then output
     * document is of version XML 1.0.
     * If XML version of output doucment is specified, but it is not either
     * XML 1.0 or XML 1.1, a warning message is generated, the XML Version of
     * output document is set to XML 1.0 and processing continues.
     * @return string (XML version)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    private void resetToXMLStream()

    /**
     * Reset all of the fields owned by ToStream class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public boolean reset()

    /**
     * Try's to reset the super class and reset this class for
     * re-use, so that you don't need to create a new serializer
     * (mostly for performance reasons).
     *
     * @return true if the class was successfuly reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    protected boolean pushNamespace(String prefix, String uri)

    /**
     * From XSLTC
     * Declare a prefix to point to a namespace URI. Inform SAX handler
     * if this is a new prefix mapping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void namespaceAfterStartElement(
        final String prefix,
        final String uri)

    /**
     * This method is used to notify the serializer of a namespace mapping (or node)
     * that applies to the current element whose startElement() call has already been seen.
     * The official SAX startPrefixMapping(prefix,uri) is to define a mapping for a child
     * element that is soon to be seen with a startElement() call. The official SAX call
     * does not apply to the current element, hence the reason for this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void endElement(String elemName) throws SAXException

    /**
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean xslAttribute)

    /**
     * Add an attribute to the current element.
     * @param uri the URI associated with the element name
     * @param localName local part of the attribute name
     * @param rawName   prefix:localName
     * @param type
     * @param value the value of the attribute
     * @param xslAttribute true if this attribute is from an xsl:attribute,
     * false if declared within the elements opening tag.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void addUniqueAttribute(String name, String value, int flags)

    /**
     * This method is used to add an attribute to the currently open element.
     * The caller has guaranted that this attribute is unique, which means that it
     * not been seen before and will not be seen again.
     *
     * @param name the qualified name of the attribute
     * @param value the value of the attribute which can contain only
     * ASCII printable characters characters in the range 32 to 127 inclusive.
     * @param flags the bit values of this integer give optimization information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void entityReference(String name) throws org.xml.sax.SAXException

    /**
     * Receive notivication of a entityReference.
     *
     * @param name The name of the entity.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
                if (m_elemContext.m_currentElemDepth <= 0 && m_isStandalone)

                /**
                 * Before Xalan 1497, a newline char was printed out if not inside of an
                 * element. The whitespace is not significant is the output is standalone
                */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void processingInstruction(String target, String data)

    /**
     * Receive notification of a processing instruction.
     *
     * @param target The processing instruction target.
     * @param data The processing instruction data, or null if
     *        none was supplied.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void endPreserving() throws org.xml.sax.SAXException

    /**
     * Ends a whitespace preserving section.
     *
     * @see #startPreserving
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void startPreserving() throws org.xml.sax.SAXException

    /**
     * Starts a whitespace preserving section. All characters printed
     * within a preserving section are printed without indentation and
     * without consolidating multiple spaces. This is equivalent to
     * the <tt>xml:space=&quot;preserve&quot;</tt> attribute. Only XML
     * and HTML serializers need to support this method.
     * <p>
     * The contents of the whitespace preserving section will be delivered
     * through the regular <tt>characters</tt> event.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void endDocument() throws org.xml.sax.SAXException

    /**
     * Receive notification of the end of a document.
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void startDocumentInternal() throws org.xml.sax.SAXException

    /**
     * Receive notification of the beginning of a document.
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void CopyFrom(ToXMLStream xmlListener)

    /**
     * Copy properties from another SerializerToXML.
     *
     * @param xmlListener non-null reference to a SerializerToXML object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public ToXMLStream()

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    private static CharInfo m_xmlcharInfo =

    /**
     * Map that tells which XML characters should have special treatment, and it
     *  provides character to entity name lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    boolean m_cdataTagOpen = false;

    /**
     * remembers if we need to write out "]]>" to close the CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
public final class ToXMLStream extends ToStream

/**
 * This class converts SAX or SAX-like calls to a
 * serialized xml document.  The xsl:output method is "xml".
 *
 * This class is used explicitly in code generated by XSLTC,
 * so it is "public", but it should
 * be viewed as internal or package private, this is not an API.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    private String getXMLVersion()

    /**
     * This method checks for the XML version of output document.
     * If XML version of output document is not specified, then output
     * document is of version XML 1.0.
     * If XML version of output doucment is specified, but it is not either
     * XML 1.0 or XML 1.1, a warning message is generated, the XML Version of
     * output document is set to XML 1.0 and processing continues.
     * @return string (XML version)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    private void resetToXMLStream()

    /**
     * Reset all of the fields owned by ToStream class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public boolean reset()

    /**
     * Try's to reset the super class and reset this class for
     * re-use, so that you don't need to create a new serializer
     * (mostly for performance reasons).
     *
     * @return true if the class was successfuly reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    protected boolean pushNamespace(String prefix, String uri)

    /**
     * From XSLTC
     * Declare a prefix to point to a namespace URI. Inform SAX handler
     * if this is a new prefix mapping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void namespaceAfterStartElement(
        final String prefix,
        final String uri)

    /**
     * This method is used to notify the serializer of a namespace mapping (or node)
     * that applies to the current element whose startElement() call has already been seen.
     * The official SAX startPrefixMapping(prefix,uri) is to define a mapping for a child
     * element that is soon to be seen with a startElement() call. The official SAX call
     * does not apply to the current element, hence the reason for this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void endElement(String elemName) throws SAXException

    /**
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean xslAttribute)

    /**
     * Add an attribute to the current element.
     * @param uri the URI associated with the element name
     * @param localName local part of the attribute name
     * @param rawName   prefix:localName
     * @param type
     * @param value the value of the attribute
     * @param xslAttribute true if this attribute is from an xsl:attribute,
     * false if declared within the elements opening tag.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void addUniqueAttribute(String name, String value, int flags)

    /**
     * This method is used to add an attribute to the currently open element.
     * The caller has guaranted that this attribute is unique, which means that it
     * not been seen before and will not be seen again.
     *
     * @param name the qualified name of the attribute
     * @param value the value of the attribute which can contain only
     * ASCII printable characters characters in the range 32 to 127 inclusive.
     * @param flags the bit values of this integer give optimization information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void entityReference(String name) throws org.xml.sax.SAXException

    /**
     * Receive notivication of a entityReference.
     *
     * @param name The name of the entity.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
                if (m_elemContext.m_currentElemDepth <= 0 && m_isStandalone)

                /**
                 * Before Xalan 1497, a newline char was printed out if not inside of an
                 * element. The whitespace is not significant is the output is standalone
                */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void processingInstruction(String target, String data)

    /**
     * Receive notification of a processing instruction.
     *
     * @param target The processing instruction target.
     * @param data The processing instruction data, or null if
     *        none was supplied.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void endPreserving() throws org.xml.sax.SAXException

    /**
     * Ends a whitespace preserving section.
     *
     * @see #startPreserving
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void startPreserving() throws org.xml.sax.SAXException

    /**
     * Starts a whitespace preserving section. All characters printed
     * within a preserving section are printed without indentation and
     * without consolidating multiple spaces. This is equivalent to
     * the <tt>xml:space=&quot;preserve&quot;</tt> attribute. Only XML
     * and HTML serializers need to support this method.
     * <p>
     * The contents of the whitespace preserving section will be delivered
     * through the regular <tt>characters</tt> event.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void endDocument() throws org.xml.sax.SAXException

    /**
     * Receive notification of the end of a document.
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void startDocumentInternal() throws org.xml.sax.SAXException

    /**
     * Receive notification of the beginning of a document.
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public void CopyFrom(ToXMLStream xmlListener)

    /**
     * Copy properties from another SerializerToXML.
     *
     * @param xmlListener non-null reference to a SerializerToXML object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    public ToXMLStream()

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    private static CharInfo m_xmlcharInfo =

    /**
     * Map that tells which XML characters should have special treatment, and it
     *  provides character to entity name lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
    boolean m_cdataTagOpen = false;

    /**
     * remembers if we need to write out "]]>" to close the CDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToXMLStream.java
public final class ToXMLStream extends ToStream

/**
 * This class converts SAX or SAX-like calls to a
 * serialized xml document.  The xsl:output method is "xml".
 *
 * This class is used explicitly in code generated by XSLTC,
 * so it is "public", but it should
 * be viewed as internal or package private, this is not an API.
 *
 * @xsl.usage internal
 */
