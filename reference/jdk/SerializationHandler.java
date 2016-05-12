_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setIsStandalone(boolean b);

    /**
     * Specify if the output will be treated as a standalone  property
     * @param isStandalone true if the http://www.oracle.com/xml/is-standalone is set to yes
     * @see OutputPropertiesFactory ORACLE_IS_STANDALONE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setDTDEntityExpansion(boolean expand);

    /**
     * Default behavior is to expand DTD entities,
     * that is the initall default value is true.
     * @param expand true if DTD entities are to be expanded,
     * false if they are to be left as DTD entity references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void flushPending() throws SAXException;

    /**
     * Flush any pending events currently queued up in the serializer. This will
     * flush any input that the serializer has which it has not yet sent as
     * output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setNamespaceMappings(NamespaceMappings mappings);

    /**
     * Used only by TransformerSnapshotImpl to restore the serialization
     * to a previous state.
     *
     * @param mappings NamespaceMappings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public Transformer getTransformer();

    /**
     * Get the transformer associated with the serializer.
     * @return Transformer the transformer associated with the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setTransformer(Transformer transformer);

    /**
     * Set the transformer associated with the serializer.
     * @param transformer the transformer associated with the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setIndentAmount(int spaces);

    /**
     * Set the number of spaces to indent for each indentation level.
     * @param spaces the number of spaces to indent for each indentation level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void serialize(Node node) throws IOException;

    /**
     * Notify that the serializer should take this DOM node as input to be
     * serialized.
     *
     * @param node the DOM node to be serialized.
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setContentHandler(ContentHandler ch);

    /**
     * Set the SAX Content handler that the serializer sends its output to. This
     * method only applies to a ToSAXHandler, not to a ToStream serializer.
     *
     * @see Serializer#asContentHandler()
     * @see ToSAXHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
public interface SerializationHandler

/**
 * This interface is the one that a serializer implements. It is a group of
 * other interfaces, such as ExtendedContentHandler, ExtendedLexicalHandler etc.
 * In addition there are other methods, such as reset().
 *
 * This class is public only because it is used in another package,
 * it is not a public API.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setIsStandalone(boolean b);

    /**
     * Specify if the output will be treated as a standalone  property
     * @param isStandalone true if the http://www.oracle.com/xml/is-standalone is set to yes
     * @see OutputPropertiesFactory ORACLE_IS_STANDALONE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setDTDEntityExpansion(boolean expand);

    /**
     * Default behavior is to expand DTD entities,
     * that is the initall default value is true.
     * @param expand true if DTD entities are to be expanded,
     * false if they are to be left as DTD entity references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void flushPending() throws SAXException;

    /**
     * Flush any pending events currently queued up in the serializer. This will
     * flush any input that the serializer has which it has not yet sent as
     * output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setNamespaceMappings(NamespaceMappings mappings);

    /**
     * Used only by TransformerSnapshotImpl to restore the serialization
     * to a previous state.
     *
     * @param mappings NamespaceMappings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public Transformer getTransformer();

    /**
     * Get the transformer associated with the serializer.
     * @return Transformer the transformer associated with the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setTransformer(Transformer transformer);

    /**
     * Set the transformer associated with the serializer.
     * @param transformer the transformer associated with the serializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setIndentAmount(int spaces);

    /**
     * Set the number of spaces to indent for each indentation level.
     * @param spaces the number of spaces to indent for each indentation level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void serialize(Node node) throws IOException;

    /**
     * Notify that the serializer should take this DOM node as input to be
     * serialized.
     *
     * @param node the DOM node to be serialized.
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
    public void setContentHandler(ContentHandler ch);

    /**
     * Set the SAX Content handler that the serializer sends its output to. This
     * method only applies to a ToSAXHandler, not to a ToStream serializer.
     *
     * @see Serializer#asContentHandler()
     * @see ToSAXHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/SerializationHandler.java
public interface SerializationHandler

/**
 * This interface is the one that a serializer implements. It is a group of
 * other interfaces, such as ExtendedContentHandler, ExtendedLexicalHandler etc.
 * In addition there are other methods, such as reset().
 *
 * This class is public only because it is used in another package,
 * it is not a public API.
 *
 * @xsl.usage internal
 */
