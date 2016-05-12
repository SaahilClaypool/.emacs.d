_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public int getLongestKeyLength()

        /**
         * Get the length of the longest key used in the table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Object get2(final String key)

        /**
         * Get an object that matches the key.
         * This method is faster than get(), but is not thread-safe.
         *
         * @param key must be a 7-bit ASCII string
         *
         * @return The object that matches the key, or null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Trie(Trie existingTrie)

        /**
         * Construct the trie from another Trie.
         * Both the existing Trie and this new one share the same table for
         * lookup, and it is assumed that the table is fully populated and
         * not changing anymore.
         *
         * @param existingTrie the Trie that this one is a copy of.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
            Object m_Value;

            /** The value.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
            final Node m_nextChar[];

            /** The next nodes.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
            Node()

            /**
             * Constructor, creates a Node[ALPHA_SIZE].
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        private class Node

        /**
         * The node representation for the trie.
         * @xsl.usage internal
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Object get(final String key)

        /**
         * Get an object that matches the key.
         *
         * @param key must be a 7-bit ASCII string
         *
         * @return The object that matches the key, or null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Object put(String key, Object value)

        /**
         * Put an object into the trie for lookup.
         *
         * @param key must be a 7-bit ASCII string
         * @param value any java object.
         *
         * @return The old object that matched key, or null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Trie(boolean lowerCaseOnly)

        /**
         * Construct the trie given the desired case sensitivity with the key.
         * @param lowerCaseOnly true if the search keys are to be loser case only,
         * not case insensitive.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Trie()

        /**
         * Construct the trie that has a case insensitive search.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        private final boolean m_lowerCaseOnly;

        /** true if the search for an object is lower case only with the key */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        private char[] m_charBuffer = new char[0];

        /** helper buffer to convert Strings to char arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        final Node m_Root;

        /** The root node of the tree.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        /** Size of the m_nextChar array.  */

        /**
         * A digital search trie for 7-bit ASCII text
         * The API is a subset of java.util.Hashtable
         * The key must be a 7-bit ASCII string
         * The value may be any Java Object
         * One can get an object stored in a trie from its key,
         * but the search is either case sensitive or case
         * insensitive to the characters in the key, and this
         * choice of sensitivity or insensitivity is made when
         * the Trie is created, before any objects are put in it.
         *
         * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
         * It exists to cut the serializers dependancy on that package.
         *
         * @xsl.usage internal
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void externalEntityDecl(
        String name,
        String publicId,
        String systemId)

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void internalEntityDecl(String name, String value)

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void elementDecl(String name, String model) throws SAXException

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void attributeDecl(
        String eName,
        String aName,
        String type,
        String valueDefault,
        String value)

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void endDTD() throws org.xml.sax.SAXException

    /**
     * Report the end of DTD declarations.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #startDTD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public void namespaceAfterStartElement(String prefix, String uri)

        /**
         * This method is used when a prefix/uri namespace mapping
         * is indicated after the element was started with a
         * startElement() and before and endElement().
         * startPrefixMapping(prefix,uri) would be used before the
         * startElement() call.
         * @param uri the URI of the namespace
         * @param prefix the prefix associated with the given URI.
         *
         * @see ExtendedContentHandler#namespaceAfterStartElement(String, String)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public void setOutputStream(OutputStream output)

        /**
         * Specifies an output stream to which the document should be
         * serialized. This method should not be called while the
         * serializer is in the process of serializing a document.
         * <p>
         * The encoding specified in the output properties is used, or
         * if no encoding was specified, the default for the selected
         * output method.
         *
         * @param output The output stream
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected synchronized void init(OutputStream output, Properties format)

    /**
     * Initialize the serializer with the specified output stream and output
     * format. Must be called before calling any of the serialize methods.
     *
     * @param output The output stream to use
     * @param format The output format
     * @throws UnsupportedEncodingException The encoding specified   in the
     * output format is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected void closeStartTag() throws SAXException

    /**
     * For the enclosing elements starting tag write out out any attributes
     * followed by ">"
     *
     *@throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void processAttributes(java.io.Writer writer, int nAttrs)

    /**
     * Process the attributes, which means to write out the currently
     * collected attributes to the writer. The attributes are not
     * cleared by this method
     *
     * @param writer the writer to write processed attributes to.
     * @param nAttrs the number of attributes in m_attributes
     * to be processed
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void endElement(String elemName) throws SAXException

    /**
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void entityReference(String name)

    /**
     * Receive notivication of a entityReference.
     *
     * @param name non-null reference to entity name string.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void processingInstruction(String target, String data)

    /**
     *  Receive notification of a processing instruction.
     *
     *  @param target The processing instruction target.
     *  @param data The processing instruction data, or null if
     *         none was supplied.
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void cdata(char ch[], int start, int length)

    /**
     *  Receive notification of cdata.
     *
     *  <p>The Parser will call this method to report each chunk of
     *  character data.  SAX parsers may return all contiguous character
     *  data in a single chunk, or they may split it into several
     *  chunks; however, all of the characters in any single event
     *  must come from the same external entity, so that the Locator
     *  provides useful information.</p>
     *
     *  <p>The application must not attempt to read from the array
     *  outside of the specified range.</p>
     *
     *  <p>Note that some parsers will report whitespace using the
     *  ignorableWhitespace() method rather than this one (validating
     *  parsers must do so).</p>
     *
     *  @param ch The characters from the XML document.
     *  @param start The start position in the array.
     *  @param length The number of characters to read from the array.
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     *  @see #ignorableWhitespace
     *  @see org.xml.sax.Locator
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void characters(char chars[], int start, int length)

    /**
     * Receive notification of character data.
     *
     * <p>The Parser will call this method to report each chunk of
     * character data.  SAX parsers may return all contiguous character
     * data in a single chunk, or they may split it into several
     * chunks; however, all of the characters in any single event
     * must come from the same external entity, so that the Locator
     * provides useful information.</p>
     *
     * <p>The application must not attempt to read from the array
     * outside of the specified range.</p>
     *
     * <p>Note that some parsers will report whitespace using the
     * ignorableWhitespace() method rather than this one (validating
     * parsers must do so).</p>
     *
     * @param chars The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #ignorableWhitespace
     * @see org.xml.sax.Locator
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void writeAttrString(
        final java.io.Writer writer, String string, String encoding)

    /**
     * Writes the specified <var>string</var> after substituting <VAR>specials</VAR>,
     * and UTF-16 surrogates for character references <CODE>&amp;#xnn</CODE>.
     *
     * @param   string      String to convert to XML format.
     * @param   encoding    CURRENTLY NOT IMPLEMENTED.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void writeAttrURI(
        final java.io.Writer writer, String string, boolean doURLEscaping)

    /**
     * Write the specified <var>string</var> after substituting non ASCII characters,
     * with <CODE>%HH</CODE>, where HH is the hex of the byte value.
     *
     * @param   string      String to convert to XML format.
     * @param doURLEscaping True if we should try to encode as
     *                      per http://www.ietf.org/rfc/rfc2396.txt.
     *
     * @throws org.xml.sax.SAXException if a bad surrogate pair is detected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean isHHSign(String str)

    /**
    * Dmitri Ilyin: Makes sure if the String is HH encoded sign.
    * @param str must be 2 characters long
    *
    * @return true or false
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private static String makeHHString(int i)

    /**
     * Make an integer into an HH hex value.
     * Does no checking on the size of the input, since this
     * is only meant to be used locally by writeAttrURI.
     *
     * @param i must be a value less than 255.
     *
     * @return should be a two character string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean isASCIIDigit(char c)

    /**
     * Tell if a character is an ASCII digit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected void processAttribute(
        java.io.Writer writer,
        String name,
        String value,
        ElemDesc elemDesc)

    /**
     * Process an attribute.
     * @param   writer The writer to write the processed output to.
     * @param   name   The name of the attribute.
     * @param   value   The value of the attribute.
     * @param   elemDesc The description of the HTML element
     *           that has this attribute.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void endElement(
        final String namespaceURI,
        final String localName,
        final String name)

    /**
     *  Receive notification of the end of an element.
     *
     *
     *  @param namespaceURI
     *  @param localName
     *  @param name The element type name
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void startElement(
        String namespaceURI,
        String localName,
        String name,
        Attributes atts)

    /**
     *  Receive notification of the beginning of an element.
     *
     *
     *  @param namespaceURI
     *  @param localName
     *  @param name The element type name.
     *  @param atts The attributes attached to the element, if any.
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     *  @see #endElement
     *  @see org.xml.sax.AttributeList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void endDocument() throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected void startDocumentInternal() throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
//    private String m_currentElementName = null;

    /** The name of the current element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public ToHTMLStream()

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private Trie m_htmlInfo = new Trie(m_elementFlags);

    /**
     * A Trie that is just a copy of the "static" one.
     * We need this one to be able to use the faster, but not thread-safe
     * method Trie.get2(name)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public static final ElemDesc getElemDesc(String name)

    /**
     * Get a description of the given element.
     *
     * @param name non-null name of element, case insensitive.
     *
     * @return non-null reference to ElemDesc, which may be m_dummy if no
     *         element description matches the given name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private final boolean getOmitMetaTag()

    /**
     * Tells if the formatter should omit the META tag.
     *
     * @return True if the META tag should be omitted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private final boolean getSpecialEscapeURLs()

    /**
     * Tells if the formatter should use special URL escaping.
     *
     * @return True if URLs should be specially escaped with the %xx form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void setOutputFormat(Properties format)

    /**
     * Specifies an output format for this serializer. It the
     * serializer has already been associated with an output format,
     * it will switch to the new format. This method should not be
     * called while the serializer is in the process of serializing
     * a document.
     *
     * This method can be called multiple times before starting
     * the serialization of a particular result-tree. In principle
     * all serialization parameters can be changed, with the exception
     * of method="html" (it must be method="html" otherwise we
     * shouldn't even have a ToHTMLStream object here!)
     *
     * @param format The output format or serialzation parameters
     * to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void setOmitMetaTag(boolean bool)

    /**
     * Tells if the formatter should omit the META tag.
     *
     * @param bool True if the META tag should be omitted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void setSpecialEscapeURLs(boolean bool)

    /**
     * Tells if the formatter should use special URL escaping.
     *
     * @param bool True if URLs should be specially escaped with the %xx form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean m_omitMetaTag = false;

    /** True if the META tag should be omitted. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean m_specialEscapeURLs = true;

    /** True if URLs should be specially escaped with the %xx form. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    static private final ElemDesc m_dummy = new ElemDesc(0 | ElemDesc.BLOCK);

    /**
     * Dummy element for elements not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        m_elementFlags.put("U", new ElemDesc(0 | ElemDesc.FONTSTYLE));

        // file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-U
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        m_elementFlags.put("S", new ElemDesc(0 | ElemDesc.FONTSTYLE));

        // file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-STRIKE
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        m_elementFlags.put("FONT", new ElemDesc(0 | ElemDesc.FONTSTYLE));

        // file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/sgml/loosedtd.html#basefont
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    static final Trie m_elementFlags = new Trie();

    /** A digital search trie for fast, case insensitive lookup of ElemDesc objects. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private static final CharInfo m_htmlcharInfo =

    /**
     * Map that tells which XML characters should have special treatment, and it
     *  provides character to entity name lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean m_inBlockElem = false;

    /** True if the current element is a block element.  (seems like
     *  this needs to be a stack. -sb). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected boolean m_inDTD = false;

    /** This flag is set while receiving events from the DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
public final class ToHTMLStream extends ToStream

/**
 * This serializer takes a series of SAX or
 * SAX-like events and writes its output
 * to the given stream.
 *
 * This class is not a public API, it is public
 * because it is used from another package.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public int getLongestKeyLength()

        /**
         * Get the length of the longest key used in the table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Object get2(final String key)

        /**
         * Get an object that matches the key.
         * This method is faster than get(), but is not thread-safe.
         *
         * @param key must be a 7-bit ASCII string
         *
         * @return The object that matches the key, or null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Trie(Trie existingTrie)

        /**
         * Construct the trie from another Trie.
         * Both the existing Trie and this new one share the same table for
         * lookup, and it is assumed that the table is fully populated and
         * not changing anymore.
         *
         * @param existingTrie the Trie that this one is a copy of.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
            Object m_Value;

            /** The value.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
            final Node m_nextChar[];

            /** The next nodes.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
            Node()

            /**
             * Constructor, creates a Node[ALPHA_SIZE].
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        private class Node

        /**
         * The node representation for the trie.
         * @xsl.usage internal
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Object get(final String key)

        /**
         * Get an object that matches the key.
         *
         * @param key must be a 7-bit ASCII string
         *
         * @return The object that matches the key, or null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Object put(String key, Object value)

        /**
         * Put an object into the trie for lookup.
         *
         * @param key must be a 7-bit ASCII string
         * @param value any java object.
         *
         * @return The old object that matched key, or null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Trie(boolean lowerCaseOnly)

        /**
         * Construct the trie given the desired case sensitivity with the key.
         * @param lowerCaseOnly true if the search keys are to be loser case only,
         * not case insensitive.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public Trie()

        /**
         * Construct the trie that has a case insensitive search.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        private final boolean m_lowerCaseOnly;

        /** true if the search for an object is lower case only with the key */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        private char[] m_charBuffer = new char[0];

        /** helper buffer to convert Strings to char arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        final Node m_Root;

        /** The root node of the tree.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        /** Size of the m_nextChar array.  */

        /**
         * A digital search trie for 7-bit ASCII text
         * The API is a subset of java.util.Hashtable
         * The key must be a 7-bit ASCII string
         * The value may be any Java Object
         * One can get an object stored in a trie from its key,
         * but the search is either case sensitive or case
         * insensitive to the characters in the key, and this
         * choice of sensitivity or insensitivity is made when
         * the Trie is created, before any objects are put in it.
         *
         * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
         * It exists to cut the serializers dependancy on that package.
         *
         * @xsl.usage internal
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void externalEntityDecl(
        String name,
        String publicId,
        String systemId)

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void internalEntityDecl(String name, String value)

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void elementDecl(String name, String model) throws SAXException

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void attributeDecl(
        String eName,
        String aName,
        String type,
        String valueDefault,
        String value)

    /**
     * This method does nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void endDTD() throws org.xml.sax.SAXException

    /**
     * Report the end of DTD declarations.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #startDTD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public void namespaceAfterStartElement(String prefix, String uri)

        /**
         * This method is used when a prefix/uri namespace mapping
         * is indicated after the element was started with a
         * startElement() and before and endElement().
         * startPrefixMapping(prefix,uri) would be used before the
         * startElement() call.
         * @param uri the URI of the namespace
         * @param prefix the prefix associated with the given URI.
         *
         * @see ExtendedContentHandler#namespaceAfterStartElement(String, String)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        public void setOutputStream(OutputStream output)

        /**
         * Specifies an output stream to which the document should be
         * serialized. This method should not be called while the
         * serializer is in the process of serializing a document.
         * <p>
         * The encoding specified in the output properties is used, or
         * if no encoding was specified, the default for the selected
         * output method.
         *
         * @param output The output stream
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected synchronized void init(OutputStream output, Properties format)

    /**
     * Initialize the serializer with the specified output stream and output
     * format. Must be called before calling any of the serialize methods.
     *
     * @param output The output stream to use
     * @param format The output format
     * @throws UnsupportedEncodingException The encoding specified   in the
     * output format is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected void closeStartTag() throws SAXException

    /**
     * For the enclosing elements starting tag write out out any attributes
     * followed by ">"
     *
     *@throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void processAttributes(java.io.Writer writer, int nAttrs)

    /**
     * Process the attributes, which means to write out the currently
     * collected attributes to the writer. The attributes are not
     * cleared by this method
     *
     * @param writer the writer to write processed attributes to.
     * @param nAttrs the number of attributes in m_attributes
     * to be processed
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void endElement(String elemName) throws SAXException

    /**
     * @see ExtendedContentHandler#endElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void entityReference(String name)

    /**
     * Receive notivication of a entityReference.
     *
     * @param name non-null reference to entity name string.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void processingInstruction(String target, String data)

    /**
     *  Receive notification of a processing instruction.
     *
     *  @param target The processing instruction target.
     *  @param data The processing instruction data, or null if
     *         none was supplied.
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void cdata(char ch[], int start, int length)

    /**
     *  Receive notification of cdata.
     *
     *  <p>The Parser will call this method to report each chunk of
     *  character data.  SAX parsers may return all contiguous character
     *  data in a single chunk, or they may split it into several
     *  chunks; however, all of the characters in any single event
     *  must come from the same external entity, so that the Locator
     *  provides useful information.</p>
     *
     *  <p>The application must not attempt to read from the array
     *  outside of the specified range.</p>
     *
     *  <p>Note that some parsers will report whitespace using the
     *  ignorableWhitespace() method rather than this one (validating
     *  parsers must do so).</p>
     *
     *  @param ch The characters from the XML document.
     *  @param start The start position in the array.
     *  @param length The number of characters to read from the array.
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     *  @see #ignorableWhitespace
     *  @see org.xml.sax.Locator
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void characters(char chars[], int start, int length)

    /**
     * Receive notification of character data.
     *
     * <p>The Parser will call this method to report each chunk of
     * character data.  SAX parsers may return all contiguous character
     * data in a single chunk, or they may split it into several
     * chunks; however, all of the characters in any single event
     * must come from the same external entity, so that the Locator
     * provides useful information.</p>
     *
     * <p>The application must not attempt to read from the array
     * outside of the specified range.</p>
     *
     * <p>Note that some parsers will report whitespace using the
     * ignorableWhitespace() method rather than this one (validating
     * parsers must do so).</p>
     *
     * @param chars The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #ignorableWhitespace
     * @see org.xml.sax.Locator
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void writeAttrString(
        final java.io.Writer writer, String string, String encoding)

    /**
     * Writes the specified <var>string</var> after substituting <VAR>specials</VAR>,
     * and UTF-16 surrogates for character references <CODE>&amp;#xnn</CODE>.
     *
     * @param   string      String to convert to XML format.
     * @param   encoding    CURRENTLY NOT IMPLEMENTED.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void writeAttrURI(
        final java.io.Writer writer, String string, boolean doURLEscaping)

    /**
     * Write the specified <var>string</var> after substituting non ASCII characters,
     * with <CODE>%HH</CODE>, where HH is the hex of the byte value.
     *
     * @param   string      String to convert to XML format.
     * @param doURLEscaping True if we should try to encode as
     *                      per http://www.ietf.org/rfc/rfc2396.txt.
     *
     * @throws org.xml.sax.SAXException if a bad surrogate pair is detected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean isHHSign(String str)

    /**
    * Dmitri Ilyin: Makes sure if the String is HH encoded sign.
    * @param str must be 2 characters long
    *
    * @return true or false
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private static String makeHHString(int i)

    /**
     * Make an integer into an HH hex value.
     * Does no checking on the size of the input, since this
     * is only meant to be used locally by writeAttrURI.
     *
     * @param i must be a value less than 255.
     *
     * @return should be a two character string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean isASCIIDigit(char c)

    /**
     * Tell if a character is an ASCII digit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected void processAttribute(
        java.io.Writer writer,
        String name,
        String value,
        ElemDesc elemDesc)

    /**
     * Process an attribute.
     * @param   writer The writer to write the processed output to.
     * @param   name   The name of the attribute.
     * @param   value   The value of the attribute.
     * @param   elemDesc The description of the HTML element
     *           that has this attribute.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void endElement(
        final String namespaceURI,
        final String localName,
        final String name)

    /**
     *  Receive notification of the end of an element.
     *
     *
     *  @param namespaceURI
     *  @param localName
     *  @param name The element type name
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void startElement(
        String namespaceURI,
        String localName,
        String name,
        Attributes atts)

    /**
     *  Receive notification of the beginning of an element.
     *
     *
     *  @param namespaceURI
     *  @param localName
     *  @param name The element type name.
     *  @param atts The attributes attached to the element, if any.
     *  @throws org.xml.sax.SAXException Any SAX exception, possibly
     *             wrapping another exception.
     *  @see #endElement
     *  @see org.xml.sax.AttributeList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public final void endDocument() throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected void startDocumentInternal() throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
//    private String m_currentElementName = null;

    /** The name of the current element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public ToHTMLStream()

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private Trie m_htmlInfo = new Trie(m_elementFlags);

    /**
     * A Trie that is just a copy of the "static" one.
     * We need this one to be able to use the faster, but not thread-safe
     * method Trie.get2(name)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public static final ElemDesc getElemDesc(String name)

    /**
     * Get a description of the given element.
     *
     * @param name non-null name of element, case insensitive.
     *
     * @return non-null reference to ElemDesc, which may be m_dummy if no
     *         element description matches the given name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private final boolean getOmitMetaTag()

    /**
     * Tells if the formatter should omit the META tag.
     *
     * @return True if the META tag should be omitted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private final boolean getSpecialEscapeURLs()

    /**
     * Tells if the formatter should use special URL escaping.
     *
     * @return True if URLs should be specially escaped with the %xx form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void setOutputFormat(Properties format)

    /**
     * Specifies an output format for this serializer. It the
     * serializer has already been associated with an output format,
     * it will switch to the new format. This method should not be
     * called while the serializer is in the process of serializing
     * a document.
     *
     * This method can be called multiple times before starting
     * the serialization of a particular result-tree. In principle
     * all serialization parameters can be changed, with the exception
     * of method="html" (it must be method="html" otherwise we
     * shouldn't even have a ToHTMLStream object here!)
     *
     * @param format The output format or serialzation parameters
     * to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void setOmitMetaTag(boolean bool)

    /**
     * Tells if the formatter should omit the META tag.
     *
     * @param bool True if the META tag should be omitted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    public void setSpecialEscapeURLs(boolean bool)

    /**
     * Tells if the formatter should use special URL escaping.
     *
     * @param bool True if URLs should be specially escaped with the %xx form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean m_omitMetaTag = false;

    /** True if the META tag should be omitted. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean m_specialEscapeURLs = true;

    /** True if URLs should be specially escaped with the %xx form. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    static private final ElemDesc m_dummy = new ElemDesc(0 | ElemDesc.BLOCK);

    /**
     * Dummy element for elements not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        m_elementFlags.put("U", new ElemDesc(0 | ElemDesc.FONTSTYLE));

        // file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-U
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        m_elementFlags.put("S", new ElemDesc(0 | ElemDesc.FONTSTYLE));

        // file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/present/graphics.html#edef-STRIKE
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
        m_elementFlags.put("FONT", new ElemDesc(0 | ElemDesc.FONTSTYLE));

        // file:///C:/Documents%20and%20Settings/sboag.BOAG600E/My%20Documents/html/sgml/loosedtd.html#basefont
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    static final Trie m_elementFlags = new Trie();

    /** A digital search trie for fast, case insensitive lookup of ElemDesc objects. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private static final CharInfo m_htmlcharInfo =

    /**
     * Map that tells which XML characters should have special treatment, and it
     *  provides character to entity name lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    private boolean m_inBlockElem = false;

    /** True if the current element is a block element.  (seems like
     *  this needs to be a stack. -sb). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
    protected boolean m_inDTD = false;

    /** This flag is set while receiving events from the DTD */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToHTMLStream.java
public final class ToHTMLStream extends ToStream

/**
 * This serializer takes a series of SAX or
 * SAX-like events and writes its output
 * to the given stream.
 *
 * This class is not a public API, it is public
 * because it is used from another package.
 *
 * @xsl.usage internal
 */
