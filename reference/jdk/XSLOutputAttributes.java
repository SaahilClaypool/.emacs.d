_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setStandalone(String standalone);

    /**
     * Sets the value coming from the xsl:output standalone stylesheet attribute.
     * @param standalone a value of "yes" indicates that the
     * <code>standalone</code> delaration is to be included in the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setMediaType(String mediatype);

    /**
     * Sets the value coming from the xsl:output media-type stylesheet attribute.
     * @param mediatype the media-type or MIME type associated with the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setEncoding(String encoding);

    /**
     * Sets the character encoding coming from the xsl:output encoding stylesheet attribute.
     * @param encoding the character encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setDoctypePublic(String doctype);

    /** Set the value coming from the xsl:output doctype-public stylesheet attribute.
      * @param doctype the public identifier to be used in the DOCTYPE
      * declaration in the output document.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setDoctype(String system, String pub);

    /** Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties
     * @param system the system identifier to be used in the DOCTYPE declaration
     * in the output document.
     * @param pub the public identifier to be used in the DOCTYPE declaration in
     * the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setCdataSectionElements(Vector URI_and_localNames);

    /**
     * Sets the value coming from the xsl:output cdata-section-elements
     * stylesheet property.
     *
     * This sets the elements whose text elements are to be output as CDATA
     * sections.
     * @param URI_and_localNames pairs of namespace URI and local names that
     * identify elements whose text elements are to be output as CDATA sections.
     * The namespace of the local element must be the given URI to match. The
     * qName is not given because the prefix does not matter, only the namespace
     * URI to which that prefix would map matters, so the prefix itself is not
     * relevant in specifying which elements have their text to be output as
     * CDATA sections.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public String getVersion();

    /**
     * @return the version of the output format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public boolean getOmitXMLDeclaration();

    /**
     * @return true if the XML declaration is to be omitted from the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public int getIndentAmount();

    /**
     * @return the number of spaces to indent for each indentation level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public String getEncoding();

    /**
     * @return the character encoding to be used in the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public String getDoctypePublic();

    /**
     * Returns the previously set value of the value to be used as the public
     * identifier in the document type declaration (DTD).
     *
     *@return the public identifier to be used in the DOCTYPE declaration in the
     * output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
interface XSLOutputAttributes

/**
 * This interface has methods associated with the XSLT xsl:output attribues
 * specified in the stylesheet that effect the format of the document output.
 *
 * In an XSLT stylesheet these attributes appear for example as:
 * <pre>
 * <xsl:output method="xml" omit-xml-declaration="no" indent="yes"/>
 * </pre>
 * The xsl:output attributes covered in this interface are:
 * <pre>
 * version
 * encoding
 * omit-xml-declarations
 * standalone
 * doctype-public
 * doctype-system
 * cdata-section-elements
 * indent
 * media-type
 * </pre>
 *
 * The one attribute not covered in this interface is <code>method</code> as
 * this value is implicitly chosen by the serializer that is created, for
 * example ToXMLStream vs. ToHTMLStream or another one.
 *
 * This interface is only used internally within Xalan.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setStandalone(String standalone);

    /**
     * Sets the value coming from the xsl:output standalone stylesheet attribute.
     * @param standalone a value of "yes" indicates that the
     * <code>standalone</code> delaration is to be included in the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setMediaType(String mediatype);

    /**
     * Sets the value coming from the xsl:output media-type stylesheet attribute.
     * @param mediatype the media-type or MIME type associated with the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setEncoding(String encoding);

    /**
     * Sets the character encoding coming from the xsl:output encoding stylesheet attribute.
     * @param encoding the character encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setDoctypePublic(String doctype);

    /** Set the value coming from the xsl:output doctype-public stylesheet attribute.
      * @param doctype the public identifier to be used in the DOCTYPE
      * declaration in the output document.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setDoctype(String system, String pub);

    /** Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties
     * @param system the system identifier to be used in the DOCTYPE declaration
     * in the output document.
     * @param pub the public identifier to be used in the DOCTYPE declaration in
     * the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public void setCdataSectionElements(Vector URI_and_localNames);

    /**
     * Sets the value coming from the xsl:output cdata-section-elements
     * stylesheet property.
     *
     * This sets the elements whose text elements are to be output as CDATA
     * sections.
     * @param URI_and_localNames pairs of namespace URI and local names that
     * identify elements whose text elements are to be output as CDATA sections.
     * The namespace of the local element must be the given URI to match. The
     * qName is not given because the prefix does not matter, only the namespace
     * URI to which that prefix would map matters, so the prefix itself is not
     * relevant in specifying which elements have their text to be output as
     * CDATA sections.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public String getVersion();

    /**
     * @return the version of the output format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public boolean getOmitXMLDeclaration();

    /**
     * @return true if the XML declaration is to be omitted from the output
     * document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public int getIndentAmount();

    /**
     * @return the number of spaces to indent for each indentation level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public String getEncoding();

    /**
     * @return the character encoding to be used in the output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
    public String getDoctypePublic();

    /**
     * Returns the previously set value of the value to be used as the public
     * identifier in the document type declaration (DTD).
     *
     *@return the public identifier to be used in the DOCTYPE declaration in the
     * output document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/XSLOutputAttributes.java
interface XSLOutputAttributes

/**
 * This interface has methods associated with the XSLT xsl:output attribues
 * specified in the stylesheet that effect the format of the document output.
 *
 * In an XSLT stylesheet these attributes appear for example as:
 * <pre>
 * <xsl:output method="xml" omit-xml-declaration="no" indent="yes"/>
 * </pre>
 * The xsl:output attributes covered in this interface are:
 * <pre>
 * version
 * encoding
 * omit-xml-declarations
 * standalone
 * doctype-public
 * doctype-system
 * cdata-section-elements
 * indent
 * media-type
 * </pre>
 *
 * The one attribute not covered in this interface is <code>method</code> as
 * this value is implicitly chosen by the serializer that is created, for
 * example ToXMLStream vs. ToHTMLStream or another one.
 *
 * This interface is only used internally within Xalan.
 *
 * @xsl.usage internal
 */
