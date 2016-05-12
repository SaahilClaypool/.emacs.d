_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final int getIndex(String uri, String localName)

    /**
     * This method gets the index of an attribute given its uri and locanName.
     * @param uri the URI of the attribute name.
     * @param localName the local namer (after the ':' ) of the attribute name.
     * @return the integer index of the attribute.
     * @see org.xml.sax.Attributes#getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final void setAttributes(Attributes atts)

    /**
     * This method sets the attributes, previous attributes are cleared,
     * it also keeps the hashtable up to date for quick lookup via
     * getIndex(qName).
     * @param atts the attributes to copy into these attributes.
     * @see org.xml.sax.helpers.AttributesImpl#setAttributes(Attributes)
     * @see #getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final void clear()

    /**
     * This method clears the accumulated attributes.
     *
     * @see org.xml.sax.helpers.AttributesImpl#clear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private void switchOverToHash(int numAtts)

    /**
     * We are switching over to having a hash table for quick look
     * up of attributes, but up until now we haven't kept any
     * information in the Map, so we now update the Map.
     * Future additional attributes will update the Map as
     * they are added.
     * @param numAtts
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final void addAttribute(
        String uri,
        String local,
        String qname,
        String type,
        String val)

    /**
     * This method adds the attribute, but also records its qName/index pair in
     * the hashtable for fast lookup by getIndex(qName).
     * @param uri the URI of the attribute
     * @param local the local name of the attribute
     * @param qname the qualified name of the attribute
     * @param type the type of the attribute
     * @param val the value of the attribute
     *
     * @see org.xml.sax.helpers.AttributesImpl#addAttribute(String, String, String, String, String)
     * @see #getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final int getIndex(String qname)

    /**
     * This method gets the index of an attribute given its qName.
     * @param qname the qualified name of the attribute, e.g. "prefix1:locName1"
     * @return the integer index of the attribute.
     * @see org.xml.sax.Attributes#getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private static final int MAXMinus1 = MAX - 1;

    /**
     * One less than the number of attributes before switching to
     * the Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private static final int MAX = 12;

    /**
     * This is the number of attributes before switching to the hash table,
     * and can be tuned, but 12 seems good for now - Brian M.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private final Map<String, Integer> m_indexFromQName = new HashMap<>();

    /**
     * Hash table of qName/index values to quickly lookup the index
     * of an attributes qName.  qNames are in uppercase in the hash table
     * to make the search case insensitive.
     *
     * The keys to the hashtable to find the index are either
     * "prefix:localName"  or "{uri}localName".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
public final class AttributesImplSerializer extends AttributesImpl

/**
 * This class extends org.xml.sax.helpers.AttributesImpl which implements org.
 * xml.sax.Attributes. But for optimization this class adds a Map for
 * faster lookup of an index by qName, which is commonly done in the stream
 * serializer.
 *
 * @see org.xml.sax.Attributes
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final int getIndex(String uri, String localName)

    /**
     * This method gets the index of an attribute given its uri and locanName.
     * @param uri the URI of the attribute name.
     * @param localName the local namer (after the ':' ) of the attribute name.
     * @return the integer index of the attribute.
     * @see org.xml.sax.Attributes#getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final void setAttributes(Attributes atts)

    /**
     * This method sets the attributes, previous attributes are cleared,
     * it also keeps the hashtable up to date for quick lookup via
     * getIndex(qName).
     * @param atts the attributes to copy into these attributes.
     * @see org.xml.sax.helpers.AttributesImpl#setAttributes(Attributes)
     * @see #getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final void clear()

    /**
     * This method clears the accumulated attributes.
     *
     * @see org.xml.sax.helpers.AttributesImpl#clear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private void switchOverToHash(int numAtts)

    /**
     * We are switching over to having a hash table for quick look
     * up of attributes, but up until now we haven't kept any
     * information in the Map, so we now update the Map.
     * Future additional attributes will update the Map as
     * they are added.
     * @param numAtts
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final void addAttribute(
        String uri,
        String local,
        String qname,
        String type,
        String val)

    /**
     * This method adds the attribute, but also records its qName/index pair in
     * the hashtable for fast lookup by getIndex(qName).
     * @param uri the URI of the attribute
     * @param local the local name of the attribute
     * @param qname the qualified name of the attribute
     * @param type the type of the attribute
     * @param val the value of the attribute
     *
     * @see org.xml.sax.helpers.AttributesImpl#addAttribute(String, String, String, String, String)
     * @see #getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    public final int getIndex(String qname)

    /**
     * This method gets the index of an attribute given its qName.
     * @param qname the qualified name of the attribute, e.g. "prefix1:locName1"
     * @return the integer index of the attribute.
     * @see org.xml.sax.Attributes#getIndex(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private static final int MAXMinus1 = MAX - 1;

    /**
     * One less than the number of attributes before switching to
     * the Map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private static final int MAX = 12;

    /**
     * This is the number of attributes before switching to the hash table,
     * and can be tuned, but 12 seems good for now - Brian M.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
    private final Map<String, Integer> m_indexFromQName = new HashMap<>();

    /**
     * Hash table of qName/index values to quickly lookup the index
     * of an attributes qName.  qNames are in uppercase in the hash table
     * to make the search case insensitive.
     *
     * The keys to the hashtable to find the index are either
     * "prefix:localName"  or "{uri}localName".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/AttributesImplSerializer.java
public final class AttributesImplSerializer extends AttributesImpl

/**
 * This class extends org.xml.sax.helpers.AttributesImpl which implements org.
 * xml.sax.Attributes. But for optimization this class adds a Map for
 * faster lookup of an index by qName, which is commonly done in the stream
 * serializer.
 *
 * @see org.xml.sax.Attributes
 *
 * @xsl.usage internal
 */
