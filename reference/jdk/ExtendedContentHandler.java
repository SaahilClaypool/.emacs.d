_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value)

    /**
     * Add at attribute to the current element, not from an xsl:attribute
     * element.
     * @param uri the namespace URI of the attribute name
     * @param localName the local name of the attribute (without prefix)
     * @param rawName the qualified name of the attribute
     * @param type the attribute type typically character data (CDATA)
     * @param value the value of the attribute
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addXSLAttribute(String qName, final String value, final String uri);

    /**
     * Add an attribute from an xsl:attribute element.
     * @param qName the qualified attribute name (prefix:localName)
     * @param value the attributes value
     * @param uri the uri that the prefix of the qName is mapped to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addUniqueAttribute(String qName, String value, int flags)

    /**
     * Add a unique attribute to the current element.
     * The attribute is guaranteed to be unique here. The serializer can write
     * it out immediately without saving it in a table first. The integer
     * flag contains information about the attribute, which helps the serializer
     * to decide whether a particular processing is needed.
     *
     * @param qName the fully qualified attribute name.
     * @param value the attribute value
     * @param flags a bitwise flag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void setSourceLocator(SourceLocator locator);

    /**
     * This method is used to set the source locator, which might be used to
     * generated an error message.
     * @param locator the source locator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public String getNamespaceURI(String name, boolean isElement);

    /**
     * This method gets the prefix associated with a current element or
     * attribute name.
     * @param name the qualified name of an element, or attribute
     * @param isElement true if it is an element name, false if it is an
     * atttribute name
     * @return String the namespace URI associated with the element or
     * attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public NamespaceMappings getNamespaceMappings();

    /**
     * This method returns an object that has the current namespace mappings in
     * effect.
     *
     * @return NamespaceMappings an object that has the current namespace
     * mappings in effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void entityReference(String entityName) throws SAXException;

    /**
     * Notify of an entity reference.
     * @param entityName the name of the entity
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * This method is used to notify that a prefix maping is to start, which can
     * be for the current element, or for the one to come.
     * @param prefix the prefix that maps to the given URI
     * @param uri the namespace URI of the given prefix
     * @param shouldFlush if true this call is like the SAX
     * startPrefixMapping(prefix,uri) call and the mapping applies to the
     * element to come.  If false the mapping applies to the current element.
     * @return boolean false if the prefix mapping was already in effect (in
     * other words we are just re-declaring), true if this is a new, never
     * before seen mapping for the element.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void startElement(String qName) throws SAXException;

    /**
     * This method is used to notify of the start of an element
     * @param qName the fully qualified name of the element
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void startElement(String uri, String localName, String qName)

    /**
     * This method is used to notify that an element is starting.
     * This method is just like the standard SAX method
     * <pre>
     * startElement(uri,localName,qname,atts)
     * </pre>
     * but without the attributes.
     * @param uri the namespace URI of the element
     * @param localName the local name (without prefix) of the element
     * @param qName the qualified name of the element
     *
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void characters(org.w3c.dom.Node node) throws org.xml.sax.SAXException;

    /**
     * This method is used to notify of a character event, but passing the data
     * as a DOM Node rather than the standard character array.
     * @param node a DOM Node containing text.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void characters(String chars) throws SAXException;

    /**
     * This method is used to notify of a character event, but passing the data
     * as a character String rather than the standard character array.
     * @param chars the character data
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttribute(String qName, String value);

    /**
     * Add an attribute to the current element. The namespace URI of the
     * attribute will be calculated from the prefix of qName. The local name
     * will be derived from qName and the type will be assumed to be "CDATA".
     * @param qName
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttributes(org.xml.sax.Attributes atts)

    /**
     * Add attributes to the current element
     * @param atts the attributes to add.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Add at attribute to the current element
     * @param uri the namespace URI of the attribute name
     * @param localName the local name of the attribute (without prefix)
     * @param rawName the qualified name of the attribute
     * @param type the attribute type typically character data (CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if the added attribute is coming from an xsl:attribute element
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
abstract interface ExtendedContentHandler extends org.xml.sax.ContentHandler

/**
 * This interface describes extensions to the SAX ContentHandler interface.
 * It is intended to be used by a serializer. The methods on this interface will
 * implement SAX- like behavior. This allows the gradual collection of
 * information rather than having it all up front. For example the call
 * <pre>
 * startElement(namespaceURI,localName,qName,atts)
 * </pre>
 * could be replaced with the calls
 * <pre>
 * startElement(namespaceURI,localName,qName)
 * addAttributes(atts)
 * </pre>
 * If there are no attributes the second call can be dropped. If attributes are
 * to be added one at a time with calls to
 * <pre>
 * addAttribute(namespaceURI, localName, qName, type, value)
 * </pre>
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value)

    /**
     * Add at attribute to the current element, not from an xsl:attribute
     * element.
     * @param uri the namespace URI of the attribute name
     * @param localName the local name of the attribute (without prefix)
     * @param rawName the qualified name of the attribute
     * @param type the attribute type typically character data (CDATA)
     * @param value the value of the attribute
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addXSLAttribute(String qName, final String value, final String uri);

    /**
     * Add an attribute from an xsl:attribute element.
     * @param qName the qualified attribute name (prefix:localName)
     * @param value the attributes value
     * @param uri the uri that the prefix of the qName is mapped to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addUniqueAttribute(String qName, String value, int flags)

    /**
     * Add a unique attribute to the current element.
     * The attribute is guaranteed to be unique here. The serializer can write
     * it out immediately without saving it in a table first. The integer
     * flag contains information about the attribute, which helps the serializer
     * to decide whether a particular processing is needed.
     *
     * @param qName the fully qualified attribute name.
     * @param value the attribute value
     * @param flags a bitwise flag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void setSourceLocator(SourceLocator locator);

    /**
     * This method is used to set the source locator, which might be used to
     * generated an error message.
     * @param locator the source locator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public String getNamespaceURI(String name, boolean isElement);

    /**
     * This method gets the prefix associated with a current element or
     * attribute name.
     * @param name the qualified name of an element, or attribute
     * @param isElement true if it is an element name, false if it is an
     * atttribute name
     * @return String the namespace URI associated with the element or
     * attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public NamespaceMappings getNamespaceMappings();

    /**
     * This method returns an object that has the current namespace mappings in
     * effect.
     *
     * @return NamespaceMappings an object that has the current namespace
     * mappings in effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void entityReference(String entityName) throws SAXException;

    /**
     * Notify of an entity reference.
     * @param entityName the name of the entity
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public boolean startPrefixMapping(
        String prefix,
        String uri,
        boolean shouldFlush)

    /**
     * This method is used to notify that a prefix maping is to start, which can
     * be for the current element, or for the one to come.
     * @param prefix the prefix that maps to the given URI
     * @param uri the namespace URI of the given prefix
     * @param shouldFlush if true this call is like the SAX
     * startPrefixMapping(prefix,uri) call and the mapping applies to the
     * element to come.  If false the mapping applies to the current element.
     * @return boolean false if the prefix mapping was already in effect (in
     * other words we are just re-declaring), true if this is a new, never
     * before seen mapping for the element.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void startElement(String qName) throws SAXException;

    /**
     * This method is used to notify of the start of an element
     * @param qName the fully qualified name of the element
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void startElement(String uri, String localName, String qName)

    /**
     * This method is used to notify that an element is starting.
     * This method is just like the standard SAX method
     * <pre>
     * startElement(uri,localName,qname,atts)
     * </pre>
     * but without the attributes.
     * @param uri the namespace URI of the element
     * @param localName the local name (without prefix) of the element
     * @param qName the qualified name of the element
     *
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void characters(org.w3c.dom.Node node) throws org.xml.sax.SAXException;

    /**
     * This method is used to notify of a character event, but passing the data
     * as a DOM Node rather than the standard character array.
     * @param node a DOM Node containing text.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void characters(String chars) throws SAXException;

    /**
     * This method is used to notify of a character event, but passing the data
     * as a character String rather than the standard character array.
     * @param chars the character data
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttribute(String qName, String value);

    /**
     * Add an attribute to the current element. The namespace URI of the
     * attribute will be calculated from the prefix of qName. The local name
     * will be derived from qName and the type will be assumed to be "CDATA".
     * @param qName
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttributes(org.xml.sax.Attributes atts)

    /**
     * Add attributes to the current element
     * @param atts the attributes to add.
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
    public void addAttribute(
        String uri,
        String localName,
        String rawName,
        String type,
        String value,
        boolean XSLAttribute)

    /**
     * Add at attribute to the current element
     * @param uri the namespace URI of the attribute name
     * @param localName the local name of the attribute (without prefix)
     * @param rawName the qualified name of the attribute
     * @param type the attribute type typically character data (CDATA)
     * @param value the value of the attribute
     * @param XSLAttribute true if the added attribute is coming from an xsl:attribute element
     * @throws SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ExtendedContentHandler.java
abstract interface ExtendedContentHandler extends org.xml.sax.ContentHandler

/**
 * This interface describes extensions to the SAX ContentHandler interface.
 * It is intended to be used by a serializer. The methods on this interface will
 * implement SAX- like behavior. This allows the gradual collection of
 * information rather than having it all up front. For example the call
 * <pre>
 * startElement(namespaceURI,localName,qName,atts)
 * </pre>
 * could be replaced with the calls
 * <pre>
 * startElement(namespaceURI,localName,qName)
 * addAttributes(atts)
 * </pre>
 * If there are no attributes the second call can be dropped. If attributes are
 * to be added one at a time with calls to
 * <pre>
 * addAttribute(namespaceURI, localName, qName, type, value)
 * </pre>
 * @xsl.usage internal
 */
