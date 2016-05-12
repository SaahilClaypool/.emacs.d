_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setDTDEntityExpansion(boolean expand) {

    /**
     * If set to false the serializer does not expand DTD entities,
     * but leaves them as is, the default value is true;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void DTDprolog() throws SAXException, IOException {

    /**
     * A private helper method to output the
     * @throws SAXException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void unparsedEntityDecl(String name, String pubID, String sysID, String notationName) throws SAXException {

    /**
     * If this method is called, the serializer is used as a
     * DTDHandler, which changes behavior how the serializer
     * handles document entities.
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void notationDecl(String name, String pubID, String sysID) throws SAXException {

    /**
     * If this method is called, the serializer is used as a
     * DTDHandler, which changes behavior how the serializer
     * handles document entities.
     * @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private void grow()

      /**
       * Grows the size of the stack
       *
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public boolean isEmpty()

      /**
       * Tests if this stack is empty.
       *
       * @return  <code>true</code> if this stack is empty;
       *          <code>false</code> otherwise.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean peekOrTrue()

      /**
       * Looks at the object at the top of this stack without removing it
       * from the stack.  If the stack is empty, it returns true.
       *
       * @return     the object at the top of this stack.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean peekOrFalse()

      /**
       * Looks at the object at the top of this stack without removing it
       * from the stack.  If the stack is empty, it returns false.
       *
       * @return     the object at the top of this stack.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean peek()

      /**
       * Looks at the object at the top of this stack without removing it
       * from the stack.
       *
       * @return     the object at the top of this stack.
       * @throws  EmptyStackException  if this stack is empty.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final void setTop(boolean b)

      /**
       * Set the item at the top of this stack
       *
       *
       * @param b Object to set at the top of this stack
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean popAndTop()

      /**
       * Removes the object at the top of this stack and returns the
       * next object at the top as the value of this function.
       *
       *
       * @return Next object to the top or false if none there
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean pop()

      /**
       * Removes the object at the top of this stack and returns that
       * object as the value of this function.
       *
       * @return     The object at the top of this stack.
       * @throws  EmptyStackException  if this stack is empty.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean push(boolean val)

      /**
       * Pushes an item onto the top of this stack.
       *
       *
       * @param val the boolean to be pushed onto this stack.
       * @return  the <code>item</code> argument.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final void clear()

      /**
       * Clears the stack.
       *
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final int size()

      /**
       * Get the length of the list.
       *
       * @return Current length of the list
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public BoolStack(int size)

      /**
       * Construct a IntVector, using the given block size.
       *
       * @param size array size to allocate
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public BoolStack()

      /**
       * Default constructor.  Note that the default
       * block size is very small, for small lists.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private int m_index;

      /** Index into the array of booleans          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private int m_allocatedSize;

      /** Array size allocated           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private boolean m_values[];

      /** Array of boolean values          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    static final class BoolStack

    /**
     * Simple stack for boolean values.
     *
     * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
     * It exists to cut the serializers dependancy on that package.
     * A minor changes from that package are:
     * doesn't implement Clonable
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
     public void setEncoding(String encoding)

    /**
      * Sets the character encoding coming from the xsl:output encoding stylesheet attribute.
      * @param encoding the character encoding
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void resetToStream()

    /**
     * Reset all of the fields owned by ToStream class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setTransformer(Transformer transformer) {

    /**
     * @see SerializationHandler#setTransformer(Transformer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
        public void close() throws IOException

        /**
         * @see java.io.Writer#close()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
        public void flush() throws IOException

        /**
         * @see java.io.Writer#flush()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
        WritertoStringBuffer(StringBuffer sb)

        /**
         * @see java.io.Writer#write(char[], int, int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private class WritertoStringBuffer extends java.io.Writer

    /**
     * This inner class is used only to collect attribute values
     * written by the method writeAttrString() into a string buffer.
     * In this manner trace events, and the real writing of attributes will use
     * the same code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void firePseudoAttributes()

    /**
     * To fire off the pseudo characters of attributes, as they currently
     * exist. This method should be called everytime an attribute is added,
     * or when an attribute value is changed, or an element is created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean addAttributeAlways(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean xslAttribute)

    /**
     * Adds the given attribute to the set of attributes, even if there is
     * no currently open element. This is useful if a SAX startPrefixMapping()
     * should need to add an attribute before the element name is seen.
     *
     * This method is a copy of its super classes method, except that some
     * tracing of events is done.  This is so the tracing is only done for
     * stream serializers, not for SAX ones.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName   the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param xslAttribute true if this attribute is coming from an xsl:attribute element.
     * @return true if the attribute value was added,
     * false if the attribute already existed and the value was
     * replaced with the new value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void flushPending() throws SAXException

    /**
     * This method flushes any pending events, which can be startDocument()
     * closing the opening tag of an element, or closing an open CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected String ensureAttributesNamespaceIsDeclared(
        String ns,
        String localName,
        String rawName)

    /**
     * Makes sure that the namespace URI for the given qualified attribute name
     * is declared.
     * @param ns the namespace URI
     * @param rawName the qualified name
     * @return returns null if no action is taken, otherwise it returns the
     * prefix used in declaring the namespace.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setCdataSectionElements(Vector URI_and_localNames)

    /**
     * Remembers the cdata sections specified in the cdata-section-elements.
     * The "official way to set URI and localName pairs.
     * This method should be used by both Xalan and XSLTC.
     *
     * @param URI_and_localNames a vector of pairs of Strings (URI/local)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void addCdataSectionElement(String URI_and_localName, Vector v)

    /**
     * Adds a URI/LocalName pair of strings to the list.
     *
     * @param URI_and_localName String of the form "{uri}local" or "local"
     *
     * @return a QName object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void setCdataSectionElements(String key, Properties props)

    /**
     * Searches for the list of qname properties with the specified key in the
     * property list. If the key is not found in this property list, the default
     * property list, and its defaults, recursively, are then checked. The
     * method returns <code>null</code> if the property is not found.
     *
     * @param   key   the property key.
     * @param props the list of properties to search in.
     *
     * Sets the vector of local-name/URI pairs of the cdata section elements
     * specified in the cdata-section-elements property.
     *
     * This method is essentially a copy of getQNameProperties() from
     * OutputProperties. Eventually this method should go away and a call
     * to setCdataSectionElements(Vector v) should be made directly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean shouldIndent()

    /**
     * Tell if, based on space preservation constraints and the doIndent property,
     * if an indent should occur.
     *
     * @return True if an indent should occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setIndentAmount(int m_indentAmount)

    /**
     * Sets the m_indentAmount.
     *
     * @param m_indentAmount The m_indentAmount to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public int getIndentAmount()

    /**
     * Returns the m_indentAmount.
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startDTD(String name, String publicId, String systemId)

    /**
     * Report the start of DTD declarations, if any.
     *
     * Any declarations are assumed to be in the internal subset unless
     * otherwise indicated.
     *
     * @param name The document type name.
     * @param publicId The declared public identifier for the
     *        external DTD subset, or null if none was declared.
     * @param systemId The declared system identifier for the
     *        external DTD subset, or null if none was declared.
     * @throws org.xml.sax.SAXException The application may raise an
     *            exception.
     * @see #endDTD
     * @see #startEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void closeStartTag() throws SAXException

    /**
     * For the enclosing elements starting tag write out
     * out any attributes followed by ">"
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startEntity(String name) throws org.xml.sax.SAXException

    /**
     * Report the beginning of an entity.
     *
     * The start and end of the document entity are not reported.
     * The start and end of the external DTD subset are reported
     * using the pseudo-name "[dtd]".  All other events must be
     * properly nested within start/end entity events.
     *
     * @param name The name of the entity.  If it is a parameter
     *        entity, the name will begin with '%'.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #endEntity
     * @see org.xml.sax.ext.DeclHandler#internalEntityDecl
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startCDATA() throws org.xml.sax.SAXException

    /**
     * Report the start of a CDATA section.
     *
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #endCDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void skippedEntity(String name) throws org.xml.sax.SAXException

    /**
     * Receive notification of a skipped entity.
     * @see org.xml.sax.ContentHandler#skippedEntity
     *
     * @param name The name of the skipped entity.  If it is a
     *       parameter                   entity, the name will begin with '%',
     * and if it is the external DTD subset, it will be the string
     * "[dtd]".
     * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping
     * another exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void ignorableWhitespace(char ch[], int start, int length)

    /**
     * Receive notification of ignorable whitespace in element content.
     *
     * Not sure how to get this invoked quite yet.
     *
     * @param ch The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #characters
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endPrefixMapping(String prefix) throws org.xml.sax.SAXException

    /**
     * End the scope of a prefix-URI Namespace mapping.
     * @see org.xml.sax.ContentHandler#endPrefixMapping
     *
     * @param prefix The prefix that was being mapping.
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endDTD() throws org.xml.sax.SAXException

    /**
     * Report the end of DTD declarations.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #startDTD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endCDATA() throws org.xml.sax.SAXException

    /**
     * Report the end of a CDATA section.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     *
     *  @see  #startCDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void comment(char ch[], int start, int length)

    /**
     * Receive notification of an XML comment anywhere in the document. This
     * callback will be used for comments inside or outside the document
     * element, including comments in the external DTD subset (if read).
     * @param ch An array holding the characters in the comment.
     * @param start The starting position in the array.
     * @param length The number of characters to use from the array.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * Handle a prefix/uri mapping, which is associated with a startElement()
     * that is soon to follow. Need to close any open start tag to make
     * sure than any name space attributes due to this event are associated wih
     * the up comming element, not the current one.
     * @see ExtendedContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     * @param shouldFlush true if any open tags need to be closed first, this
     * will impact which element the mapping applies to (open parent, or its up
     * comming child)
     * @return returns true if the call made a change to the current
     * namespace information, false if it did not change anything, e.g. if the
     * prefix/namespace mapping was already in scope from before.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     *
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * Begin the scope of a prefix-URI Namespace mapping
     * just before another element is about to start.
     * This call will close any open tags so that the prefix mapping
     * will not apply to the current element, but the up comming child.
     *
     * @see org.xml.sax.ContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endElement(String name) throws org.xml.sax.SAXException

    /**
     * Receive notification of the end of an element.
     * @param name The element type name
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *     wrapping another exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endElement(String namespaceURI, String localName, String name)

    /**
     * Receive notification of the end of an element.
     *
     *
     * @param namespaceURI The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param name The element type name
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void writeAttrString(
        Writer writer,
        String string,
        String encoding)

    /**
     * Returns the specified <var>string</var> after substituting <VAR>specials</VAR>,
     * and UTF-16 surrogates for chracter references <CODE>&amp;#xnn</CODE>.
     *
     * @param   string      String to convert to XML format.
     * @param   encoding    CURRENTLY NOT IMPLEMENTED.
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void processAttributes(java.io.Writer writer, int nAttrs) throws IOException, SAXException

    /**
     * Process the attributes, which means to write out the currently
     * collected attributes to the writer. The attributes are not
     * cleared by this method
     *
     * @param writer the writer to write processed attributes to.
     * @param nAttrs the number of attributes in m_attributes
     * to be processed
     *
     * @throws java.io.IOException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    void outputDocTypeDecl(String name, boolean closeDecl) throws SAXException

    /**
     * Output the doc type declaration.
     *
     * @param name non-null reference to document type name.
     * NEEDSDOC @param closeDecl
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startElement(
        String elementNamespaceURI,
        String elementLocalName,
        String elementName)

    /**
      * Receive notification of the beginning of an element, additional
      * namespace or attribute information can occur before or after this call,
      * that is associated with this element.
      *
      *
      * @param elementNamespaceURI The Namespace URI, or the empty string if the
      *        element has no Namespace URI or if Namespace
      *        processing is not being performed.
      * @param elementLocalName The local name (without prefix), or the
      *        empty string if Namespace processing is not being
      *        performed.
      * @param elementName The element type name.
      * @throws org.xml.sax.SAXException Any SAX exception, possibly
      *            wrapping another exception.
      * @see org.xml.sax.ContentHandler#startElement
      * @see org.xml.sax.ContentHandler#endElement
      * @see org.xml.sax.AttributeList
      *
      * @throws org.xml.sax.SAXException
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startElement(
        String namespaceURI,
        String localName,
        String name,
        Attributes atts)

    /**
     * Receive notification of the beginning of an element, although this is a
     * SAX method additional namespace or attribute information can occur before
     * or after this call, that is associated with this element.
     *
     *
     * @param namespaceURI The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param name The element type name.
     * @param atts The attributes attached to the element, if any.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startElement
     * @see org.xml.sax.ContentHandler#endElement
     * @see org.xml.sax.AttributeList
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int accumDefaultEscape(
        Writer writer,
        char ch,
        int i,
        char[] chars,
        int len,
        boolean fromTextNode,
        boolean escLF)

    /**
     * Escape and writer.write a character.
     *
     * @param ch character to be escaped.
     * @param i index into character array.
     * @param chars non-null reference to character array.
     * @param len length of chars.
     * @param fromTextNode true if the characters being processed are
     * from a text node, false if the characters being processed are from
     * an attribute value.
     * @param escLF true if the linefeed should be escaped.
     *
     * @return i+1 if a character was written, i+2 if two characters
     * were written out, else return i.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void characters(String s) throws org.xml.sax.SAXException

    /**
     * Receive notification of character data.
     *
     * @param s The string of characters to process.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private int processDirty(
        char[] chars,
        int end,
        int i,
        char ch,
        int lastDirty,
        boolean fromTextNode) throws IOException

    /**
     * Process a dirty character and any preeceding clean characters
     * that were not yet processed.
     * @param chars array of characters being processed
     * @param end one (1) beyond the last character
     * in chars to be processed
     * @param i the index of the dirty character
     * @param ch the character in chars[i]
     * @param lastDirty the last dirty character previous to i
     * @param fromTextNode true if the characters being processed are
     * from a text node, false if they are from an attribute value.
     * @return the index of the last character processed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private static boolean isNELorLSEPCharacter(char ch)

    /**
     * This method checks if a given character either NEL (0x85) or LSEP (0x2028)
     * These are new end of line charcters added in XML 1.1.  These characters must be
     * written as Numeric Character References (NCR) in XML 1.1 output document.
     *
     * @param ch
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private static boolean isCharacterInC0orC1Range(char ch)

    /**
     * This method checks if a given character is between C0 or C1 range
     * of Control characters.
     * This method is added to support Control Characters for XML 1.1
     * If a given character is TAB (0x09), LF (0x0A) or CR (0x0D), this method
     * return false. Since they are whitespace characters, no special processing is needed.
     *
     * @param ch
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void characters(final char chars[], final int start, final int length)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void charactersRaw(char ch[], int start, int length)

    /**
     * If available, when the disable-output-escaping attribute is used,
     * output raw text without escaping.
     *
     * @param ch The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private boolean isEscapingDisabled()

    /**
     * Tell if the character escaping should be disabled for the current state.
     *
     * @return true if the character escaping should be disabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void cdata(char ch[], int start, final int length)

    /**
     * Receive notification of cdata.
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
     * @param ch The characters from the XML document.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startNonEscaping() throws org.xml.sax.SAXException

    /**
     * Starts an un-escaping section. All characters printed within an un-
     * escaping section are printed as is, without escaping special characters
     * into entity references. Only XML and HTML serializers need to support
     * this method.
     * <p> The contents of the un-escaping section will be delivered through the
     * regular <tt>characters</tt> event.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endNonEscaping() throws org.xml.sax.SAXException

    /**
     * Ends an un-escaping section.
     *
     * @see #startNonEscaping
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    void writeNormalizedChars(
        char ch[],
        int start,
        int length,
        boolean isCData,
        boolean useSystemLineSeparator)

    /**
     * Normalize the characters, but don't escape.
     *
     * @param ch The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @param isCData true if a CDATA block should be built around the characters.
     * @param useSystemLineSeparator true if the operating systems
     * end-of-line separator should be output rather than a new-line character.
     *
     * @throws IOException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int accumDefaultEntity(
        java.io.Writer writer,
        char ch,
        int i,
        char[] chars,
        int len,
        boolean fromTextNode,
        boolean escLF)

    /**
     * Handle one of the default entities, return false if it
     * is not a default entity.
     *
     * @param ch character to be escaped.
     * @param i index into character array.
     * @param chars non-null reference to character array.
     * @param len length of chars.
     * @param fromTextNode true if the characters being processed
     * are from a text node, false if they are from an attribute value
     * @param escLF true if the linefeed should be escaped.
     *
     * @return i+1 if the character was written, else i.
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int writeUTF16Surrogate(char c, char ch[], int i, int end)

    /**
     * Once a surrogate has been detected, write out the pair of
     * characters if it is in the encoding, or if there is no
     * encoding, otherwise write out an entity reference
     * of the value of the unicode code point of the character
     * represented by the high/low surrogate pair.
     * <p>
     * An exception is thrown if there is no low surrogate in the pair,
     * because the array ends unexpectely, or if the low char is there
     * but its value is such that it is not a low surrogate.
     *
     * @param c the first (high) part of the surrogate, which
     * must be confirmed before calling this method.
     * @param ch Character array.
     * @param i position Where the surrogate was detected.
     * @param end The end index of the significant characters.
     * @return 0 if the pair of characters was written out as-is,
     * the unicode code point of the character represented by
     * the surrogate pair if an entity reference with that value
     * was written out.
     *
     * @throws IOException
     * @throws org.xml.sax.SAXException if invalid UTF-16 surrogate detected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean escapingNotNeeded(char ch)

    /**
     * Tell if this character can be written without escaping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void externalEntityDecl(
        String name,
        String publicId,
        String systemId)

    /**
     * Report a parsed external entity declaration.
     *
     * <p>Only the effective (first) declaration for each entity
     * will be reported.</p>
     *
     * @param name The name of the entity.  If it is a parameter
     *        entity, the name will begin with '%'.
     * @param publicId The declared public identifier of the entity, or
     *        null if none was declared.
     * @param systemId The declared system identifier of the entity.
     * @exception SAXException The application may raise an exception.
     * @see #internalEntityDecl
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public Writer getWriter()

    /**
     * Get the character stream where the events will be serialized to.
     *
     * @return Reference to the result Writer, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void attributeDecl(
        String eName,
        String aName,
        String type,
        String valueDefault,
        String value)

    /**
     * Report an attribute type declaration.
     *
     * <p>Only the effective (first) declaration for an attribute will
     * be reported.  The type will be one of the strings "CDATA",
     * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY",
     * "ENTITIES", or "NOTATION", or a parenthesized token group with
     * the separator "|" and all whitespace removed.</p>
     *
     * @param eName The name of the associated element.
     * @param aName The name of the attribute.
     * @param type A string representing the attribute type.
     * @param valueDefault A string representing the attribute default
     *        ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if
     *        none of these applies.
     * @param value A string representing the attribute's default value,
     *        or null if there is none.
     * @exception SAXException The application may raise an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void printSpace(int n) throws IOException

    /**
     * Prints <var>n</var> spaces.
     * @param n         Number of spaces to print.
     *
     * @throws org.xml.sax.SAXException if an error occurs when writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void indent() throws IOException

    /**
     * Indent at the current element nesting depth.
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void indent(int depth) throws IOException

    /**
     * Might print a newline character and the indentation amount
     * of the given depth.
     *
     * @param depth the indentation depth (element nesting depth)
     *
     * @throws org.xml.sax.SAXException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean setEscaping(boolean escape)

    /**
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean setLineSepUse(boolean use_sytem_line_break)

    /**
     * Set if the operating systems end-of-line line separator should
     * be used when serializing.  If set false NL character
     * (decimal 10) is left alone, otherwise the new-line will be replaced on
     * output with the systems line separator. For example on UNIX this is
     * NL, while on Windows it is two characters, CR NL, where CR is the
     * carriage-return (decimal 13).
     *
     * @param use_sytem_line_break True if an input NL is replaced with the
     * operating systems end-of-line separator.
     * @return The previously set value of the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setWriter(Writer writer)

    /**
     * Specifies a writer to which the document should be serialized.
     * This method should not be called while the serializer is in
     * the process of serializing a document.
     *
     * @param writer The output writer stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public Properties getOutputFormat()

    /**
     * Returns the output format for this serializer.
     *
     * @return The output format in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected synchronized void init(
        OutputStream output,
        Properties format,
        boolean defaultProperties)

    /**
     * Initialize the serializer with the specified output stream and output
     * format. Must be called before calling any of the serialize methods.
     *
     * @param output The output stream to use
     * @param format The output format
     * @param defaultProperties true if the properties are the default
     * properties
     *
     * @throws UnsupportedEncodingException The encoding specified   in the
     * output format is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private synchronized void init(Writer writer, Properties format)

    /**
     * Initialize the serializer with the specified writer and output format.
     * Must be called before calling any of the serialize methods.
     *
     * @param writer The writer to use
     * @param format The output format
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private synchronized void init(
        Writer writer,
        Properties format,
        boolean defaultProperties,
        boolean shouldFlush)

    /**
     * Initialize the serializer with the specified writer and output format.
     * Must be called before calling any of the serialize methods.
     * This method can be called multiple times and the xsl:output properties
     * passed in the 'format' parameter are accumulated across calls.
     *
     * @param writer The writer to use
     * @param format The output format
     * @param shouldFlush True if the writer should be flushed at EndDocument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setOutputFormat(Properties format)

    /**
     * Specifies an output format for this serializer. It the
     * serializer has already been associated with an output format,
     * it will switch to the new format. This method should not be
     * called while the serializer is in the process of serializing
     * a document.
     *
     * @param format The output format to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected final void outputLineSep() throws IOException

    /**
     * Output a system-dependent line break.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    void outputEntityDecl(String name, String value) throws IOException

    /**
     * Output the doc type declaration.
     *
     * @param name non-null reference to document type name.
     * NEEDSDOC @param value
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void internalEntityDecl(String name, String value)

    /**
     * Report an internal entity declaration.
     *
     * <p>Only the effective (first) declaration for each entity
     * will be reported.</p>
     *
     * @param name The name of the entity.  If it is a parameter
     *        entity, the name will begin with '%'.
     * @param value The replacement text of the entity.
     * @exception SAXException The application may raise an exception.
     * @see #externalEntityDecl
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void elementDecl(String name, String model) throws SAXException

    /**
     *   Report an element type declaration.
     *
     *   <p>The content model will consist of the string "EMPTY", the
     *   string "ANY", or a parenthesised group, optionally followed
     *   by an occurrence indicator.  The model will be normalized so
     *   that all whitespace is removed,and will include the enclosing
     *   parentheses.</p>
     *
     *   @param name The element type name.
     *   @param model The content model as a normalized string.
     *   @exception SAXException The application may raise an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public OutputStream getOutputStream()

    /**
     * Get the output stream where the events will be serialized to.
     *
     * @return reference to the result stream, or null of only a writer was
     * set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected final void flushWriter() throws org.xml.sax.SAXException

    /**
     * Flush the formatter's result stream.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private boolean m_escaping = true;

    /**
     * Taken from XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    static final boolean isUTF16Surrogate(char c)

    /**
     * Return true if the character is the high member of a surrogate pair.
     *
     * NEEDSDOC @param c
     *
     * NEEDSDOC ($objectName$) @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void serialize(Node node) throws IOException

    /**
     * Serializes the DOM node. Throws an exception only if an I/O
     * exception occured while serializing.
     *
     * @param node Node to serialize.
     * @throws IOException An I/O exception occured while serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void closeCDATA() throws org.xml.sax.SAXException

    /**
     * This helper method to writes out "]]>" when closing a CDATA section.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public ToStream()

    /**
     * Default constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private boolean m_expandDTDEntities = true;

    /**
     * If this flag is true DTD entity references are not left as-is,
     * which is exiting older behavior.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_cdataStartCalled = false;

    /**
     * remembers if we are in between the startCDATA() and endCDATA() callbacks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected Properties m_format;

    /** The xsl:output properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_isUTF8 = false;

    /**
       * Flag to quickly tell if the encoding is UTF8.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_inDoctype = false;

    /**
     * Tells if we're in an internal document type subset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_startNewLine;

    /**
     * Flag to signal that a newline should be added.
     *
     * Used only in indent() which is called only if m_doIndent is true.
     * If m_doIndent is false this flag has no impact.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_spaceBeforeClose = false;

    /**
     * Add space before '/>' for XHTML.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_shouldFlush = true;

    /** True if we control the buffer, and we should flush the output on endDocument. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected CharInfo m_charInfo;

    /**
     * Map that tells which characters should have special treatment, and it
     *  provides character to entity name lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int m_lineSepLen = m_lineSep.length;

    /**
     * The length of the line seperator, since the write is done
     * one character at a time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_lineSepUse = true;

    /**
     * True if the the system line separator is to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected char[] m_lineSep =

    /**
     * The system line separator for writing out line breaks.
     * The default value is from the system property,
     * but this value can be set through the xsl:output
     * extension attribute xalan:line-separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int m_maxCharacter = Encodings.getLastPrintable();

    /**
     * The maximum character size before we have to resort
     * to escaping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_isprevtext = false;

    /**
     * State flag that tells if the previous node processed
     * was text, so we can tell if we should preserve whitespace.
     *
     * Used in endDocument() and shouldIndent() but
     * only if m_doIndent is true.
     * If m_doIndent is false this flag has no impact.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_ispreserve = false;

    /**
     * State flag to tell if preservation of whitespace
     * is important.
     *
     * Used only in shouldIndent() but only if m_doIndent is true.
     * If m_doIndent is false this flag has no impact.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected BoolStack m_preserves = new BoolStack();

    /**
     * Stack to keep track of whether or not we need to
     * preserve whitespace.
     *
     * Used to push/pop values used for the field m_ispreserve, but
     * m_ispreserve is only relevant if m_doIndent is true.
     * If m_doIndent is false this field has no impact.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    Object m_charToByteConverter = null;

    /**
     * Opaque reference to the sun.io.CharToByteConverter for this
     * encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_triedToGetConverter = false;

    /**
     * Boolean that tells if we already tried to get the converter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    java.lang.reflect.Method m_canConvertMeth;

    /**
     * Method reference to the sun.io.CharToByteConverter#canConvert method
     * for this encoding.  Invalid if m_charToByteConverter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    EncodingInfo m_encodingInfo = new EncodingInfo(null,null);

    /**
     * The encoding information associated with this serializer.
     * Although initially there is no encoding,
     * there is a dummy EncodingInfo object that will say
     * that every character is in the encoding. This is useful
     * for a serializer that is in temporary output state and has
     * no associated encoding. A serializer in final output state
     * will have an encoding, and will worry about whether
     * single chars or surrogate pairs of high/low chars form
     * characters in the output encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected BoolStack m_disableOutputEscapingStates = new BoolStack();

    /** Stack to keep track of disabling output escaping. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
abstract public class ToStream extends SerializerBase

/**
 * This abstract class is a base class for other stream
 * serializers (xml, html, text ...) that write output to a stream.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setDTDEntityExpansion(boolean expand) {

    /**
     * If set to false the serializer does not expand DTD entities,
     * but leaves them as is, the default value is true;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void DTDprolog() throws SAXException, IOException {

    /**
     * A private helper method to output the
     * @throws SAXException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void unparsedEntityDecl(String name, String pubID, String sysID, String notationName) throws SAXException {

    /**
     * If this method is called, the serializer is used as a
     * DTDHandler, which changes behavior how the serializer
     * handles document entities.
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void notationDecl(String name, String pubID, String sysID) throws SAXException {

    /**
     * If this method is called, the serializer is used as a
     * DTDHandler, which changes behavior how the serializer
     * handles document entities.
     * @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private void grow()

      /**
       * Grows the size of the stack
       *
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public boolean isEmpty()

      /**
       * Tests if this stack is empty.
       *
       * @return  <code>true</code> if this stack is empty;
       *          <code>false</code> otherwise.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean peekOrTrue()

      /**
       * Looks at the object at the top of this stack without removing it
       * from the stack.  If the stack is empty, it returns true.
       *
       * @return     the object at the top of this stack.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean peekOrFalse()

      /**
       * Looks at the object at the top of this stack without removing it
       * from the stack.  If the stack is empty, it returns false.
       *
       * @return     the object at the top of this stack.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean peek()

      /**
       * Looks at the object at the top of this stack without removing it
       * from the stack.
       *
       * @return     the object at the top of this stack.
       * @throws  EmptyStackException  if this stack is empty.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final void setTop(boolean b)

      /**
       * Set the item at the top of this stack
       *
       *
       * @param b Object to set at the top of this stack
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean popAndTop()

      /**
       * Removes the object at the top of this stack and returns the
       * next object at the top as the value of this function.
       *
       *
       * @return Next object to the top or false if none there
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean pop()

      /**
       * Removes the object at the top of this stack and returns that
       * object as the value of this function.
       *
       * @return     The object at the top of this stack.
       * @throws  EmptyStackException  if this stack is empty.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final boolean push(boolean val)

      /**
       * Pushes an item onto the top of this stack.
       *
       *
       * @param val the boolean to be pushed onto this stack.
       * @return  the <code>item</code> argument.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final void clear()

      /**
       * Clears the stack.
       *
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public final int size()

      /**
       * Get the length of the list.
       *
       * @return Current length of the list
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public BoolStack(int size)

      /**
       * Construct a IntVector, using the given block size.
       *
       * @param size array size to allocate
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      public BoolStack()

      /**
       * Default constructor.  Note that the default
       * block size is very small, for small lists.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private int m_index;

      /** Index into the array of booleans          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private int m_allocatedSize;

      /** Array size allocated           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
      private boolean m_values[];

      /** Array of boolean values          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    static final class BoolStack

    /**
     * Simple stack for boolean values.
     *
     * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
     * It exists to cut the serializers dependancy on that package.
     * A minor changes from that package are:
     * doesn't implement Clonable
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
     public void setEncoding(String encoding)

    /**
      * Sets the character encoding coming from the xsl:output encoding stylesheet attribute.
      * @param encoding the character encoding
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void resetToStream()

    /**
     * Reset all of the fields owned by ToStream class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setTransformer(Transformer transformer) {

    /**
     * @see SerializationHandler#setTransformer(Transformer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
        public void close() throws IOException

        /**
         * @see java.io.Writer#close()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
        public void flush() throws IOException

        /**
         * @see java.io.Writer#flush()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
        WritertoStringBuffer(StringBuffer sb)

        /**
         * @see java.io.Writer#write(char[], int, int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private class WritertoStringBuffer extends java.io.Writer

    /**
     * This inner class is used only to collect attribute values
     * written by the method writeAttrString() into a string buffer.
     * In this manner trace events, and the real writing of attributes will use
     * the same code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void firePseudoAttributes()

    /**
     * To fire off the pseudo characters of attributes, as they currently
     * exist. This method should be called everytime an attribute is added,
     * or when an attribute value is changed, or an element is created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean addAttributeAlways(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean xslAttribute)

    /**
     * Adds the given attribute to the set of attributes, even if there is
     * no currently open element. This is useful if a SAX startPrefixMapping()
     * should need to add an attribute before the element name is seen.
     *
     * This method is a copy of its super classes method, except that some
     * tracing of events is done.  This is so the tracing is only done for
     * stream serializers, not for SAX ones.
     *
     * @param uri the URI of the attribute
     * @param localName the local name of the attribute
     * @param rawName   the qualified name of the attribute
     * @param type the type of the attribute (probably CDATA)
     * @param value the value of the attribute
     * @param xslAttribute true if this attribute is coming from an xsl:attribute element.
     * @return true if the attribute value was added,
     * false if the attribute already existed and the value was
     * replaced with the new value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void flushPending() throws SAXException

    /**
     * This method flushes any pending events, which can be startDocument()
     * closing the opening tag of an element, or closing an open CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected String ensureAttributesNamespaceIsDeclared(
        String ns,
        String localName,
        String rawName)

    /**
     * Makes sure that the namespace URI for the given qualified attribute name
     * is declared.
     * @param ns the namespace URI
     * @param rawName the qualified name
     * @return returns null if no action is taken, otherwise it returns the
     * prefix used in declaring the namespace.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setCdataSectionElements(Vector URI_and_localNames)

    /**
     * Remembers the cdata sections specified in the cdata-section-elements.
     * The "official way to set URI and localName pairs.
     * This method should be used by both Xalan and XSLTC.
     *
     * @param URI_and_localNames a vector of pairs of Strings (URI/local)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void addCdataSectionElement(String URI_and_localName, Vector v)

    /**
     * Adds a URI/LocalName pair of strings to the list.
     *
     * @param URI_and_localName String of the form "{uri}local" or "local"
     *
     * @return a QName object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void setCdataSectionElements(String key, Properties props)

    /**
     * Searches for the list of qname properties with the specified key in the
     * property list. If the key is not found in this property list, the default
     * property list, and its defaults, recursively, are then checked. The
     * method returns <code>null</code> if the property is not found.
     *
     * @param   key   the property key.
     * @param props the list of properties to search in.
     *
     * Sets the vector of local-name/URI pairs of the cdata section elements
     * specified in the cdata-section-elements property.
     *
     * This method is essentially a copy of getQNameProperties() from
     * OutputProperties. Eventually this method should go away and a call
     * to setCdataSectionElements(Vector v) should be made directly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean shouldIndent()

    /**
     * Tell if, based on space preservation constraints and the doIndent property,
     * if an indent should occur.
     *
     * @return True if an indent should occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setIndentAmount(int m_indentAmount)

    /**
     * Sets the m_indentAmount.
     *
     * @param m_indentAmount The m_indentAmount to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public int getIndentAmount()

    /**
     * Returns the m_indentAmount.
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startDTD(String name, String publicId, String systemId)

    /**
     * Report the start of DTD declarations, if any.
     *
     * Any declarations are assumed to be in the internal subset unless
     * otherwise indicated.
     *
     * @param name The document type name.
     * @param publicId The declared public identifier for the
     *        external DTD subset, or null if none was declared.
     * @param systemId The declared system identifier for the
     *        external DTD subset, or null if none was declared.
     * @throws org.xml.sax.SAXException The application may raise an
     *            exception.
     * @see #endDTD
     * @see #startEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void closeStartTag() throws SAXException

    /**
     * For the enclosing elements starting tag write out
     * out any attributes followed by ">"
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startEntity(String name) throws org.xml.sax.SAXException

    /**
     * Report the beginning of an entity.
     *
     * The start and end of the document entity are not reported.
     * The start and end of the external DTD subset are reported
     * using the pseudo-name "[dtd]".  All other events must be
     * properly nested within start/end entity events.
     *
     * @param name The name of the entity.  If it is a parameter
     *        entity, the name will begin with '%'.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #endEntity
     * @see org.xml.sax.ext.DeclHandler#internalEntityDecl
     * @see org.xml.sax.ext.DeclHandler#externalEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startCDATA() throws org.xml.sax.SAXException

    /**
     * Report the start of a CDATA section.
     *
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #endCDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void skippedEntity(String name) throws org.xml.sax.SAXException

    /**
     * Receive notification of a skipped entity.
     * @see org.xml.sax.ContentHandler#skippedEntity
     *
     * @param name The name of the skipped entity.  If it is a
     *       parameter                   entity, the name will begin with '%',
     * and if it is the external DTD subset, it will be the string
     * "[dtd]".
     * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping
     * another exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void ignorableWhitespace(char ch[], int start, int length)

    /**
     * Receive notification of ignorable whitespace in element content.
     *
     * Not sure how to get this invoked quite yet.
     *
     * @param ch The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #characters
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endPrefixMapping(String prefix) throws org.xml.sax.SAXException

    /**
     * End the scope of a prefix-URI Namespace mapping.
     * @see org.xml.sax.ContentHandler#endPrefixMapping
     *
     * @param prefix The prefix that was being mapping.
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endDTD() throws org.xml.sax.SAXException

    /**
     * Report the end of DTD declarations.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     * @see #startDTD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endCDATA() throws org.xml.sax.SAXException

    /**
     * Report the end of a CDATA section.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     *
     *  @see  #startCDATA
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void comment(char ch[], int start, int length)

    /**
     * Receive notification of an XML comment anywhere in the document. This
     * callback will be used for comments inside or outside the document
     * element, including comments in the external DTD subset (if read).
     * @param ch An array holding the characters in the comment.
     * @param start The starting position in the array.
     * @param length The number of characters to use from the array.
     * @throws org.xml.sax.SAXException The application may raise an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * Handle a prefix/uri mapping, which is associated with a startElement()
     * that is soon to follow. Need to close any open start tag to make
     * sure than any name space attributes due to this event are associated wih
     * the up comming element, not the current one.
     * @see ExtendedContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     * @param shouldFlush true if any open tags need to be closed first, this
     * will impact which element the mapping applies to (open parent, or its up
     * comming child)
     * @return returns true if the call made a change to the current
     * namespace information, false if it did not change anything, e.g. if the
     * prefix/namespace mapping was already in scope from before.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     *
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * Begin the scope of a prefix-URI Namespace mapping
     * just before another element is about to start.
     * This call will close any open tags so that the prefix mapping
     * will not apply to the current element, but the up comming child.
     *
     * @see org.xml.sax.ContentHandler#startPrefixMapping
     *
     * @param prefix The Namespace prefix being declared.
     * @param uri The Namespace URI the prefix is mapped to.
     *
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endElement(String name) throws org.xml.sax.SAXException

    /**
     * Receive notification of the end of an element.
     * @param name The element type name
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *     wrapping another exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endElement(String namespaceURI, String localName, String name)

    /**
     * Receive notification of the end of an element.
     *
     *
     * @param namespaceURI The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param name The element type name
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void writeAttrString(
        Writer writer,
        String string,
        String encoding)

    /**
     * Returns the specified <var>string</var> after substituting <VAR>specials</VAR>,
     * and UTF-16 surrogates for chracter references <CODE>&amp;#xnn</CODE>.
     *
     * @param   string      String to convert to XML format.
     * @param   encoding    CURRENTLY NOT IMPLEMENTED.
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void processAttributes(java.io.Writer writer, int nAttrs) throws IOException, SAXException

    /**
     * Process the attributes, which means to write out the currently
     * collected attributes to the writer. The attributes are not
     * cleared by this method
     *
     * @param writer the writer to write processed attributes to.
     * @param nAttrs the number of attributes in m_attributes
     * to be processed
     *
     * @throws java.io.IOException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    void outputDocTypeDecl(String name, boolean closeDecl) throws SAXException

    /**
     * Output the doc type declaration.
     *
     * @param name non-null reference to document type name.
     * NEEDSDOC @param closeDecl
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startElement(
        String elementNamespaceURI,
        String elementLocalName,
        String elementName)

    /**
      * Receive notification of the beginning of an element, additional
      * namespace or attribute information can occur before or after this call,
      * that is associated with this element.
      *
      *
      * @param elementNamespaceURI The Namespace URI, or the empty string if the
      *        element has no Namespace URI or if Namespace
      *        processing is not being performed.
      * @param elementLocalName The local name (without prefix), or the
      *        empty string if Namespace processing is not being
      *        performed.
      * @param elementName The element type name.
      * @throws org.xml.sax.SAXException Any SAX exception, possibly
      *            wrapping another exception.
      * @see org.xml.sax.ContentHandler#startElement
      * @see org.xml.sax.ContentHandler#endElement
      * @see org.xml.sax.AttributeList
      *
      * @throws org.xml.sax.SAXException
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startElement(
        String namespaceURI,
        String localName,
        String name,
        Attributes atts)

    /**
     * Receive notification of the beginning of an element, although this is a
     * SAX method additional namespace or attribute information can occur before
     * or after this call, that is associated with this element.
     *
     *
     * @param namespaceURI The Namespace URI, or the empty string if the
     *        element has no Namespace URI or if Namespace
     *        processing is not being performed.
     * @param localName The local name (without prefix), or the
     *        empty string if Namespace processing is not being
     *        performed.
     * @param name The element type name.
     * @param atts The attributes attached to the element, if any.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startElement
     * @see org.xml.sax.ContentHandler#endElement
     * @see org.xml.sax.AttributeList
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int accumDefaultEscape(
        Writer writer,
        char ch,
        int i,
        char[] chars,
        int len,
        boolean fromTextNode,
        boolean escLF)

    /**
     * Escape and writer.write a character.
     *
     * @param ch character to be escaped.
     * @param i index into character array.
     * @param chars non-null reference to character array.
     * @param len length of chars.
     * @param fromTextNode true if the characters being processed are
     * from a text node, false if the characters being processed are from
     * an attribute value.
     * @param escLF true if the linefeed should be escaped.
     *
     * @return i+1 if a character was written, i+2 if two characters
     * were written out, else return i.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void characters(String s) throws org.xml.sax.SAXException

    /**
     * Receive notification of character data.
     *
     * @param s The string of characters to process.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private int processDirty(
        char[] chars,
        int end,
        int i,
        char ch,
        int lastDirty,
        boolean fromTextNode) throws IOException

    /**
     * Process a dirty character and any preeceding clean characters
     * that were not yet processed.
     * @param chars array of characters being processed
     * @param end one (1) beyond the last character
     * in chars to be processed
     * @param i the index of the dirty character
     * @param ch the character in chars[i]
     * @param lastDirty the last dirty character previous to i
     * @param fromTextNode true if the characters being processed are
     * from a text node, false if they are from an attribute value.
     * @return the index of the last character processed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private static boolean isNELorLSEPCharacter(char ch)

    /**
     * This method checks if a given character either NEL (0x85) or LSEP (0x2028)
     * These are new end of line charcters added in XML 1.1.  These characters must be
     * written as Numeric Character References (NCR) in XML 1.1 output document.
     *
     * @param ch
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private static boolean isCharacterInC0orC1Range(char ch)

    /**
     * This method checks if a given character is between C0 or C1 range
     * of Control characters.
     * This method is added to support Control Characters for XML 1.1
     * If a given character is TAB (0x09), LF (0x0A) or CR (0x0D), this method
     * return false. Since they are whitespace characters, no special processing is needed.
     *
     * @param ch
     * @return boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void characters(final char chars[], final int start, final int length)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void charactersRaw(char ch[], int start, int length)

    /**
     * If available, when the disable-output-escaping attribute is used,
     * output raw text without escaping.
     *
     * @param ch The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private boolean isEscapingDisabled()

    /**
     * Tell if the character escaping should be disabled for the current state.
     *
     * @return true if the character escaping should be disabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void cdata(char ch[], int start, final int length)

    /**
     * Receive notification of cdata.
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
     * @param ch The characters from the XML document.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void startNonEscaping() throws org.xml.sax.SAXException

    /**
     * Starts an un-escaping section. All characters printed within an un-
     * escaping section are printed as is, without escaping special characters
     * into entity references. Only XML and HTML serializers need to support
     * this method.
     * <p> The contents of the un-escaping section will be delivered through the
     * regular <tt>characters</tt> event.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void endNonEscaping() throws org.xml.sax.SAXException

    /**
     * Ends an un-escaping section.
     *
     * @see #startNonEscaping
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    void writeNormalizedChars(
        char ch[],
        int start,
        int length,
        boolean isCData,
        boolean useSystemLineSeparator)

    /**
     * Normalize the characters, but don't escape.
     *
     * @param ch The characters from the XML document.
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @param isCData true if a CDATA block should be built around the characters.
     * @param useSystemLineSeparator true if the operating systems
     * end-of-line separator should be output rather than a new-line character.
     *
     * @throws IOException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int accumDefaultEntity(
        java.io.Writer writer,
        char ch,
        int i,
        char[] chars,
        int len,
        boolean fromTextNode,
        boolean escLF)

    /**
     * Handle one of the default entities, return false if it
     * is not a default entity.
     *
     * @param ch character to be escaped.
     * @param i index into character array.
     * @param chars non-null reference to character array.
     * @param len length of chars.
     * @param fromTextNode true if the characters being processed
     * are from a text node, false if they are from an attribute value
     * @param escLF true if the linefeed should be escaped.
     *
     * @return i+1 if the character was written, else i.
     *
     * @throws java.io.IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int writeUTF16Surrogate(char c, char ch[], int i, int end)

    /**
     * Once a surrogate has been detected, write out the pair of
     * characters if it is in the encoding, or if there is no
     * encoding, otherwise write out an entity reference
     * of the value of the unicode code point of the character
     * represented by the high/low surrogate pair.
     * <p>
     * An exception is thrown if there is no low surrogate in the pair,
     * because the array ends unexpectely, or if the low char is there
     * but its value is such that it is not a low surrogate.
     *
     * @param c the first (high) part of the surrogate, which
     * must be confirmed before calling this method.
     * @param ch Character array.
     * @param i position Where the surrogate was detected.
     * @param end The end index of the significant characters.
     * @return 0 if the pair of characters was written out as-is,
     * the unicode code point of the character represented by
     * the surrogate pair if an entity reference with that value
     * was written out.
     *
     * @throws IOException
     * @throws org.xml.sax.SAXException if invalid UTF-16 surrogate detected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean escapingNotNeeded(char ch)

    /**
     * Tell if this character can be written without escaping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void externalEntityDecl(
        String name,
        String publicId,
        String systemId)

    /**
     * Report a parsed external entity declaration.
     *
     * <p>Only the effective (first) declaration for each entity
     * will be reported.</p>
     *
     * @param name The name of the entity.  If it is a parameter
     *        entity, the name will begin with '%'.
     * @param publicId The declared public identifier of the entity, or
     *        null if none was declared.
     * @param systemId The declared system identifier of the entity.
     * @exception SAXException The application may raise an exception.
     * @see #internalEntityDecl
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public Writer getWriter()

    /**
     * Get the character stream where the events will be serialized to.
     *
     * @return Reference to the result Writer, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void attributeDecl(
        String eName,
        String aName,
        String type,
        String valueDefault,
        String value)

    /**
     * Report an attribute type declaration.
     *
     * <p>Only the effective (first) declaration for an attribute will
     * be reported.  The type will be one of the strings "CDATA",
     * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY",
     * "ENTITIES", or "NOTATION", or a parenthesized token group with
     * the separator "|" and all whitespace removed.</p>
     *
     * @param eName The name of the associated element.
     * @param aName The name of the attribute.
     * @param type A string representing the attribute type.
     * @param valueDefault A string representing the attribute default
     *        ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if
     *        none of these applies.
     * @param value A string representing the attribute's default value,
     *        or null if there is none.
     * @exception SAXException The application may raise an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private void printSpace(int n) throws IOException

    /**
     * Prints <var>n</var> spaces.
     * @param n         Number of spaces to print.
     *
     * @throws org.xml.sax.SAXException if an error occurs when writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void indent() throws IOException

    /**
     * Indent at the current element nesting depth.
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void indent(int depth) throws IOException

    /**
     * Might print a newline character and the indentation amount
     * of the given depth.
     *
     * @param depth the indentation depth (element nesting depth)
     *
     * @throws org.xml.sax.SAXException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean setEscaping(boolean escape)

    /**
     * @see SerializationHandler#setEscaping(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public boolean setLineSepUse(boolean use_sytem_line_break)

    /**
     * Set if the operating systems end-of-line line separator should
     * be used when serializing.  If set false NL character
     * (decimal 10) is left alone, otherwise the new-line will be replaced on
     * output with the systems line separator. For example on UNIX this is
     * NL, while on Windows it is two characters, CR NL, where CR is the
     * carriage-return (decimal 13).
     *
     * @param use_sytem_line_break True if an input NL is replaced with the
     * operating systems end-of-line separator.
     * @return The previously set value of the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setWriter(Writer writer)

    /**
     * Specifies a writer to which the document should be serialized.
     * This method should not be called while the serializer is in
     * the process of serializing a document.
     *
     * @param writer The output writer stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public Properties getOutputFormat()

    /**
     * Returns the output format for this serializer.
     *
     * @return The output format in use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected synchronized void init(
        OutputStream output,
        Properties format,
        boolean defaultProperties)

    /**
     * Initialize the serializer with the specified output stream and output
     * format. Must be called before calling any of the serialize methods.
     *
     * @param output The output stream to use
     * @param format The output format
     * @param defaultProperties true if the properties are the default
     * properties
     *
     * @throws UnsupportedEncodingException The encoding specified   in the
     * output format is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private synchronized void init(Writer writer, Properties format)

    /**
     * Initialize the serializer with the specified writer and output format.
     * Must be called before calling any of the serialize methods.
     *
     * @param writer The writer to use
     * @param format The output format
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private synchronized void init(
        Writer writer,
        Properties format,
        boolean defaultProperties,
        boolean shouldFlush)

    /**
     * Initialize the serializer with the specified writer and output format.
     * Must be called before calling any of the serialize methods.
     * This method can be called multiple times and the xsl:output properties
     * passed in the 'format' parameter are accumulated across calls.
     *
     * @param writer The writer to use
     * @param format The output format
     * @param shouldFlush True if the writer should be flushed at EndDocument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void setOutputFormat(Properties format)

    /**
     * Specifies an output format for this serializer. It the
     * serializer has already been associated with an output format,
     * it will switch to the new format. This method should not be
     * called while the serializer is in the process of serializing
     * a document.
     *
     * @param format The output format to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected final void outputLineSep() throws IOException

    /**
     * Output a system-dependent line break.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    void outputEntityDecl(String name, String value) throws IOException

    /**
     * Output the doc type declaration.
     *
     * @param name non-null reference to document type name.
     * NEEDSDOC @param value
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void internalEntityDecl(String name, String value)

    /**
     * Report an internal entity declaration.
     *
     * <p>Only the effective (first) declaration for each entity
     * will be reported.</p>
     *
     * @param name The name of the entity.  If it is a parameter
     *        entity, the name will begin with '%'.
     * @param value The replacement text of the entity.
     * @exception SAXException The application may raise an exception.
     * @see #externalEntityDecl
     * @see org.xml.sax.DTDHandler#unparsedEntityDecl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void elementDecl(String name, String model) throws SAXException

    /**
     *   Report an element type declaration.
     *
     *   <p>The content model will consist of the string "EMPTY", the
     *   string "ANY", or a parenthesised group, optionally followed
     *   by an occurrence indicator.  The model will be normalized so
     *   that all whitespace is removed,and will include the enclosing
     *   parentheses.</p>
     *
     *   @param name The element type name.
     *   @param model The content model as a normalized string.
     *   @exception SAXException The application may raise an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public OutputStream getOutputStream()

    /**
     * Get the output stream where the events will be serialized to.
     *
     * @return reference to the result stream, or null of only a writer was
     * set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected final void flushWriter() throws org.xml.sax.SAXException

    /**
     * Flush the formatter's result stream.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private boolean m_escaping = true;

    /**
     * Taken from XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    static final boolean isUTF16Surrogate(char c)

    /**
     * Return true if the character is the high member of a surrogate pair.
     *
     * NEEDSDOC @param c
     *
     * NEEDSDOC ($objectName$) @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public void serialize(Node node) throws IOException

    /**
     * Serializes the DOM node. Throws an exception only if an I/O
     * exception occured while serializing.
     *
     * @param node Node to serialize.
     * @throws IOException An I/O exception occured while serializing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected void closeCDATA() throws org.xml.sax.SAXException

    /**
     * This helper method to writes out "]]>" when closing a CDATA section.
     *
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    public ToStream()

    /**
     * Default constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    private boolean m_expandDTDEntities = true;

    /**
     * If this flag is true DTD entity references are not left as-is,
     * which is exiting older behavior.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_cdataStartCalled = false;

    /**
     * remembers if we are in between the startCDATA() and endCDATA() callbacks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected Properties m_format;

    /** The xsl:output properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_isUTF8 = false;

    /**
       * Flag to quickly tell if the encoding is UTF8.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_inDoctype = false;

    /**
     * Tells if we're in an internal document type subset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_startNewLine;

    /**
     * Flag to signal that a newline should be added.
     *
     * Used only in indent() which is called only if m_doIndent is true.
     * If m_doIndent is false this flag has no impact.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_spaceBeforeClose = false;

    /**
     * Add space before '/>' for XHTML.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_shouldFlush = true;

    /** True if we control the buffer, and we should flush the output on endDocument. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected CharInfo m_charInfo;

    /**
     * Map that tells which characters should have special treatment, and it
     *  provides character to entity name lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int m_lineSepLen = m_lineSep.length;

    /**
     * The length of the line seperator, since the write is done
     * one character at a time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_lineSepUse = true;

    /**
     * True if the the system line separator is to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected char[] m_lineSep =

    /**
     * The system line separator for writing out line breaks.
     * The default value is from the system property,
     * but this value can be set through the xsl:output
     * extension attribute xalan:line-separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected int m_maxCharacter = Encodings.getLastPrintable();

    /**
     * The maximum character size before we have to resort
     * to escaping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_isprevtext = false;

    /**
     * State flag that tells if the previous node processed
     * was text, so we can tell if we should preserve whitespace.
     *
     * Used in endDocument() and shouldIndent() but
     * only if m_doIndent is true.
     * If m_doIndent is false this flag has no impact.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected boolean m_ispreserve = false;

    /**
     * State flag to tell if preservation of whitespace
     * is important.
     *
     * Used only in shouldIndent() but only if m_doIndent is true.
     * If m_doIndent is false this flag has no impact.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected BoolStack m_preserves = new BoolStack();

    /**
     * Stack to keep track of whether or not we need to
     * preserve whitespace.
     *
     * Used to push/pop values used for the field m_ispreserve, but
     * m_ispreserve is only relevant if m_doIndent is true.
     * If m_doIndent is false this field has no impact.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    Object m_charToByteConverter = null;

    /**
     * Opaque reference to the sun.io.CharToByteConverter for this
     * encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    boolean m_triedToGetConverter = false;

    /**
     * Boolean that tells if we already tried to get the converter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    java.lang.reflect.Method m_canConvertMeth;

    /**
     * Method reference to the sun.io.CharToByteConverter#canConvert method
     * for this encoding.  Invalid if m_charToByteConverter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    EncodingInfo m_encodingInfo = new EncodingInfo(null,null);

    /**
     * The encoding information associated with this serializer.
     * Although initially there is no encoding,
     * there is a dummy EncodingInfo object that will say
     * that every character is in the encoding. This is useful
     * for a serializer that is in temporary output state and has
     * no associated encoding. A serializer in final output state
     * will have an encoding, and will worry about whether
     * single chars or surrogate pairs of high/low chars form
     * characters in the output encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
    protected BoolStack m_disableOutputEscapingStates = new BoolStack();

    /** Stack to keep track of disabling output escaping. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToStream.java
abstract public class ToStream extends SerializerBase

/**
 * This abstract class is a base class for other stream
 * serializers (xml, html, text ...) that write output to a stream.
 *
 * @xsl.usage internal
 */
