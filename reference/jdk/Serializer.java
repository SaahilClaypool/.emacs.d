_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    Node deserialize(byte[] source, Node ctx) throws XMLEncryptionException;

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    byte[] canonSerializeToByteArray(Node node) throws Exception;

    /**
     * Use the Canonicalizer to serialize the node
     * @param node
     * @return the (byte[]) canonicalization of the node
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    byte[] serializeToByteArray(NodeList content) throws Exception;

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>NodeList</code>.
     *
     * @param content the <code>NodeList</code> to serialize.
     * @return the <code>byte[]</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    byte[] serializeToByteArray(Element element) throws Exception;

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>Element</code>.
     *
     * @param element the <code>Element</code> to serialize.
     * @return the <code>byte[]</code> representation of the serilaized
     *   <code>Element</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    void setCanonicalizer(Canonicalizer canon);

    /**
     * Set the Canonicalizer object to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
public interface Serializer {

/**
 * Converts <code>String</code>s into <code>Node</code>s and visa versa.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
package com.sun.org.apache.xml.internal.security.encryption;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public DOMSerializer asDOMSerializer()

    /**
     * Return a {@link DOMSerializer} interface into this serializer.
     * If the serializer does not support the {@link DOMSerializer}
     * interface, it should return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public ContentHandler asContentHandler()

    /**
     * Return a {@link ContentHandler} interface into this serializer.
     * If the serializer does not support the {@link ContentHandler}
     * interface, it should return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public DocumentHandler asDocumentHandler()

    /**
     * Return a {@link DocumentHandler} interface into this serializer.
     * If the serializer does not support the {@link DocumentHandler}
     * interface, it should return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public void setOutputFormat( OutputFormat format );

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public void setOutputCharStream( Writer output );

    /**
     * Specifies a writer to which the document should be serialized.
     * This method should not be called while the serializer is in
     * the process of serializing a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public void setOutputByteStream(OutputStream output);

    /**
     * Specifies an output stream to which the document should be
     * serialized. This method should not be called while the
     * serializer is in the process of serializing a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
public interface Serializer

/**
 * Interface for a DOM serializer implementation, factory for DOM and SAX
 * serializers, and static methods for serializing DOM documents.
 * <p>
 * To serialize a document using SAX events, create a compatible serializer
 * and pass it around as a {@link
 * org.xml.sax.DocumentHandler}. If an I/O error occurs while serializing, it will
 * be thrown by {@link DocumentHandler#endDocument}. The SAX serializer
 * may also be used as {@link org.xml.sax.DTDHandler}, {@link org.xml.sax.ext.DeclHandler} and
 * {@link org.xml.sax.ext.LexicalHandler}.
 * <p>
 * To serialize a DOM document or DOM element, create a compatible
 * serializer and call it's {@link
 * DOMSerializer#serialize(Document)} or {@link DOMSerializer#serialize(Element)} methods.
 * Both methods would produce a full XML document, to serizlie only
 * the portion of the document use {@link OutputFormat#setOmitXMLDeclaration}
 * and specify no document type.
 * <p>
 * The {@link OutputFormat} dictates what underlying serialized is used
 * to serialize the document based on the specified method. If the output
 * format or method are missing, the default is an XML serializer with
 * UTF-8 encoding and now indentation.
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a>
 * @see DocumentHandler
 * @see ContentHandler
 * @see OutputFormat
 * @see DOMSerializer
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public boolean reset();

    /**
     * This method resets the serializer.
     * If this method returns true, the
     * serializer may be used for subsequent serialization of new
     * documents. It is possible to change the output format and
     * output stream prior to serializing, or to reuse the existing
     * output format and output stream or writer.
     *
     * @return True if serializer has been reset and can be reused
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public DOMSerializer asDOMSerializer() throws IOException;

    /**
     * Return a {@link DOMSerializer} interface into this serializer.
     * Through the returned object the document to be serialized,
     * a DOM, can be provided to the serializer.
     * If the serializer does not support the {@link DOMSerializer}
     * interface, it should return null.
     * <p>
     * In principle only one of asDOMSerializer() or asContentHander()
     * should be called.
     *
     * @return A {@link DOMSerializer} interface into this serializer,
     *  or null if the serializer is not DOM capable
     * @throws IOException An I/O exception occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public ContentHandler asContentHandler() throws IOException;

    /**
     * Return a {@link ContentHandler} interface to provide SAX input to.
     * Through the returned object the document to be serailized,
     * as a series of SAX events, can be provided to the serialzier.
     * If the serializer does not support the {@link ContentHandler}
     * interface, it will return null.
     * <p>
     * In principle only one of asDOMSerializer() or asContentHander()
     * should be called.
     *
     * @return A {@link ContentHandler} interface into this serializer,
     *  or null if the serializer is not SAX 2 capable
     * @throws IOException An I/O exception occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public Properties getOutputFormat();

    /**
     * Returns the output format properties for this serializer.
     *
     * @return The output format key/value pairs in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public void setOutputFormat(Properties format);

    /**
     * Specifies an output format for this serializer. It the
     * serializer has already been associated with an output format,
     * it will switch to the new format. This method should not be
     * called while the serializer is in the process of serializing
     * a document.
     * <p>
     * The standard property keys supported are: "method", "version", "encoding",
     * "omit-xml-declaration", "standalone", doctype-public",
     * "doctype-system", "cdata-section-elements", "indent", "media-type".
     * These property keys and their values are described in the XSLT recommendation,
     * see {@link <a href="http://www.w3.org/TR/1999/REC-xslt-19991116"> XSLT 1.0 recommendation</a>}
     * <p>
     * The non-standard property keys supported are defined in {@link OutputPropertiesFactory}.
     *
     * <p>
     * This method can be called multiple times before a document is serialized. Each
     * time it is called more, or over-riding property values, can be specified. One
     * property value that can not be changed is that of the "method" property key.
     * <p>
     * The value of the "cdata-section-elements" property key is a whitespace
     * separated list of elements. If the element is in a namespace then
     * value is passed in this format: {uri}localName
     * <p>
     * If the "cdata-section-elements" key is specified on multiple calls
     * to this method the set of elements specified in the value
     * is not replaced from one call to the
     * next, but it is cumulative across the calls.
     *
     * @param format The output format to use, as a set of key/value pairs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public Writer getWriter();

    /**
     * Get the character stream where the events will be serialized to.
     *
     * @return Reference to the result Writer, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public void setWriter(Writer writer);

    /**
     * Specifies a writer to which the document should be serialized.
     * This method should not be called while the serializer is in
     * the process of serializing a document.
     * <p>
     * The encoding specified for the output {@link Properties} must be
     * identical to the output format used with the writer.
     *
     * <p>
     * Only one of setWriter() or setOutputStream() should be called.
     *
     * @param writer The output writer stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public OutputStream getOutputStream();

    /**
     * Get the output stream where the events will be serialized to.
     *
     * @return reference to the result stream, or null if only a writer was
     * set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public void setOutputStream(OutputStream output);

    /**
     * Specifies an output stream to which the document should be
     * serialized. This method should not be called while the
     * serializer is in the process of serializing a document.
     * <p>
     * The encoding specified in the output {@link Properties} is used, or
     * if no encoding was specified, the default for the selected
     * output method.
     * <p>
     * Only one of setWriter() or setOutputStream() should be called.
     *
     * @param output The output stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
public interface Serializer {

/**
 * The Serializer interface is implemented by a serializer to enable users to:
 * <ul>
 * <li>get and set streams or writers
 * <li>configure the serializer with key/value properties
 * <li>get an org.xml.sax.ContentHandler or a DOMSerializer to provide input to
 * </ul>
 *
 * <p>
 * Here is an example using the asContentHandler() method:
 * <pre>
 * java.util.Properties props =
 *   OutputPropertiesFactory.getDefaultMethodProperties(Method.TEXT);
 * Serializer ser = SerializerFactory.getSerializer(props);
 * java.io.PrintStream ostream = System.out;
 * ser.setOutputStream(ostream);
 *
 * // Provide the SAX input events
 * ContentHandler handler = ser.asContentHandler();
 * handler.startDocument();
 * char[] chars = { 'a', 'b', 'c' };
 * handler.characters(chars, 0, chars.length);
 * handler.endDocument();
 *
 * ser.reset(); // get ready to use the serializer for another document
 *              // of the same output method (TEXT).
 * </pre>
 *
 * <p>
 * As an alternate to supplying a series of SAX events as input through the
 * ContentHandler interface, the input to serialize may be given as a DOM.
 * <p>
 * For example:
 * <pre>
 * org.w3c.dom.Document     inputDoc;
 * com.sun.org.apache.xml.internal.serializer.Serializer   ser;
 * java.io.Writer owriter;
 *
 * java.util.Properties props =
 *   OutputPropertiesFactory.getDefaultMethodProperties(Method.XML);
 * Serializer ser = SerializerFactory.getSerializer(props);
 * owriter = ...;  // create a writer to serialize the document to
 * ser.setWriter( owriter );
 *
 * inputDoc = ...; // create the DOM document to be serialized
 * DOMSerializer dser = ser.asDOMSerializer(); // a DOM will be serialized
 * dser.serialize(inputDoc); // serialize the DOM, sending output to owriter
 *
 * ser.reset(); // get ready to use the serializer for another document
 *              // of the same output method.
 * </pre>
 *
 * This interface is a public API.
 *
 * @see Method
 * @see OutputPropertiesFactory
 * @see SerializerFactory
 * @see DOMSerializer
 * @see ContentHandler
 *
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    Node deserialize(byte[] source, Node ctx) throws XMLEncryptionException;

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    byte[] canonSerializeToByteArray(Node node) throws Exception;

    /**
     * Use the Canonicalizer to serialize the node
     * @param node
     * @return the (byte[]) canonicalization of the node
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    byte[] serializeToByteArray(NodeList content) throws Exception;

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>NodeList</code>.
     *
     * @param content the <code>NodeList</code> to serialize.
     * @return the <code>byte[]</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    byte[] serializeToByteArray(Element element) throws Exception;

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>Element</code>.
     *
     * @param element the <code>Element</code> to serialize.
     * @return the <code>byte[]</code> representation of the serilaized
     *   <code>Element</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
    void setCanonicalizer(Canonicalizer canon);

    /**
     * Set the Canonicalizer object to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
public interface Serializer {

/**
 * Converts <code>String</code>s into <code>Node</code>s and visa versa.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Serializer.java
package com.sun.org.apache.xml.internal.security.encryption;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public DOMSerializer asDOMSerializer()

    /**
     * Return a {@link DOMSerializer} interface into this serializer.
     * If the serializer does not support the {@link DOMSerializer}
     * interface, it should return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public ContentHandler asContentHandler()

    /**
     * Return a {@link ContentHandler} interface into this serializer.
     * If the serializer does not support the {@link ContentHandler}
     * interface, it should return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public DocumentHandler asDocumentHandler()

    /**
     * Return a {@link DocumentHandler} interface into this serializer.
     * If the serializer does not support the {@link DocumentHandler}
     * interface, it should return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public void setOutputFormat( OutputFormat format );

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public void setOutputCharStream( Writer output );

    /**
     * Specifies a writer to which the document should be serialized.
     * This method should not be called while the serializer is in
     * the process of serializing a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
    public void setOutputByteStream(OutputStream output);

    /**
     * Specifies an output stream to which the document should be
     * serialized. This method should not be called while the
     * serializer is in the process of serializing a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Serializer.java
public interface Serializer

/**
 * Interface for a DOM serializer implementation, factory for DOM and SAX
 * serializers, and static methods for serializing DOM documents.
 * <p>
 * To serialize a document using SAX events, create a compatible serializer
 * and pass it around as a {@link
 * org.xml.sax.DocumentHandler}. If an I/O error occurs while serializing, it will
 * be thrown by {@link DocumentHandler#endDocument}. The SAX serializer
 * may also be used as {@link org.xml.sax.DTDHandler}, {@link org.xml.sax.ext.DeclHandler} and
 * {@link org.xml.sax.ext.LexicalHandler}.
 * <p>
 * To serialize a DOM document or DOM element, create a compatible
 * serializer and call it's {@link
 * DOMSerializer#serialize(Document)} or {@link DOMSerializer#serialize(Element)} methods.
 * Both methods would produce a full XML document, to serizlie only
 * the portion of the document use {@link OutputFormat#setOmitXMLDeclaration}
 * and specify no document type.
 * <p>
 * The {@link OutputFormat} dictates what underlying serialized is used
 * to serialize the document based on the specified method. If the output
 * format or method are missing, the default is an XML serializer with
 * UTF-8 encoding and now indentation.
 *
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a>
 * @see DocumentHandler
 * @see ContentHandler
 * @see OutputFormat
 * @see DOMSerializer
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public boolean reset();

    /**
     * This method resets the serializer.
     * If this method returns true, the
     * serializer may be used for subsequent serialization of new
     * documents. It is possible to change the output format and
     * output stream prior to serializing, or to reuse the existing
     * output format and output stream or writer.
     *
     * @return True if serializer has been reset and can be reused
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public DOMSerializer asDOMSerializer() throws IOException;

    /**
     * Return a {@link DOMSerializer} interface into this serializer.
     * Through the returned object the document to be serialized,
     * a DOM, can be provided to the serializer.
     * If the serializer does not support the {@link DOMSerializer}
     * interface, it should return null.
     * <p>
     * In principle only one of asDOMSerializer() or asContentHander()
     * should be called.
     *
     * @return A {@link DOMSerializer} interface into this serializer,
     *  or null if the serializer is not DOM capable
     * @throws IOException An I/O exception occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public ContentHandler asContentHandler() throws IOException;

    /**
     * Return a {@link ContentHandler} interface to provide SAX input to.
     * Through the returned object the document to be serailized,
     * as a series of SAX events, can be provided to the serialzier.
     * If the serializer does not support the {@link ContentHandler}
     * interface, it will return null.
     * <p>
     * In principle only one of asDOMSerializer() or asContentHander()
     * should be called.
     *
     * @return A {@link ContentHandler} interface into this serializer,
     *  or null if the serializer is not SAX 2 capable
     * @throws IOException An I/O exception occured
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public Properties getOutputFormat();

    /**
     * Returns the output format properties for this serializer.
     *
     * @return The output format key/value pairs in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public void setOutputFormat(Properties format);

    /**
     * Specifies an output format for this serializer. It the
     * serializer has already been associated with an output format,
     * it will switch to the new format. This method should not be
     * called while the serializer is in the process of serializing
     * a document.
     * <p>
     * The standard property keys supported are: "method", "version", "encoding",
     * "omit-xml-declaration", "standalone", doctype-public",
     * "doctype-system", "cdata-section-elements", "indent", "media-type".
     * These property keys and their values are described in the XSLT recommendation,
     * see {@link <a href="http://www.w3.org/TR/1999/REC-xslt-19991116"> XSLT 1.0 recommendation</a>}
     * <p>
     * The non-standard property keys supported are defined in {@link OutputPropertiesFactory}.
     *
     * <p>
     * This method can be called multiple times before a document is serialized. Each
     * time it is called more, or over-riding property values, can be specified. One
     * property value that can not be changed is that of the "method" property key.
     * <p>
     * The value of the "cdata-section-elements" property key is a whitespace
     * separated list of elements. If the element is in a namespace then
     * value is passed in this format: {uri}localName
     * <p>
     * If the "cdata-section-elements" key is specified on multiple calls
     * to this method the set of elements specified in the value
     * is not replaced from one call to the
     * next, but it is cumulative across the calls.
     *
     * @param format The output format to use, as a set of key/value pairs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public Writer getWriter();

    /**
     * Get the character stream where the events will be serialized to.
     *
     * @return Reference to the result Writer, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public void setWriter(Writer writer);

    /**
     * Specifies a writer to which the document should be serialized.
     * This method should not be called while the serializer is in
     * the process of serializing a document.
     * <p>
     * The encoding specified for the output {@link Properties} must be
     * identical to the output format used with the writer.
     *
     * <p>
     * Only one of setWriter() or setOutputStream() should be called.
     *
     * @param writer The output writer stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public OutputStream getOutputStream();

    /**
     * Get the output stream where the events will be serialized to.
     *
     * @return reference to the result stream, or null if only a writer was
     * set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
    public void setOutputStream(OutputStream output);

    /**
     * Specifies an output stream to which the document should be
     * serialized. This method should not be called while the
     * serializer is in the process of serializing a document.
     * <p>
     * The encoding specified in the output {@link Properties} is used, or
     * if no encoding was specified, the default for the selected
     * output method.
     * <p>
     * Only one of setWriter() or setOutputStream() should be called.
     *
     * @param output The output stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Serializer.java
public interface Serializer {

/**
 * The Serializer interface is implemented by a serializer to enable users to:
 * <ul>
 * <li>get and set streams or writers
 * <li>configure the serializer with key/value properties
 * <li>get an org.xml.sax.ContentHandler or a DOMSerializer to provide input to
 * </ul>
 *
 * <p>
 * Here is an example using the asContentHandler() method:
 * <pre>
 * java.util.Properties props =
 *   OutputPropertiesFactory.getDefaultMethodProperties(Method.TEXT);
 * Serializer ser = SerializerFactory.getSerializer(props);
 * java.io.PrintStream ostream = System.out;
 * ser.setOutputStream(ostream);
 *
 * // Provide the SAX input events
 * ContentHandler handler = ser.asContentHandler();
 * handler.startDocument();
 * char[] chars = { 'a', 'b', 'c' };
 * handler.characters(chars, 0, chars.length);
 * handler.endDocument();
 *
 * ser.reset(); // get ready to use the serializer for another document
 *              // of the same output method (TEXT).
 * </pre>
 *
 * <p>
 * As an alternate to supplying a series of SAX events as input through the
 * ContentHandler interface, the input to serialize may be given as a DOM.
 * <p>
 * For example:
 * <pre>
 * org.w3c.dom.Document     inputDoc;
 * com.sun.org.apache.xml.internal.serializer.Serializer   ser;
 * java.io.Writer owriter;
 *
 * java.util.Properties props =
 *   OutputPropertiesFactory.getDefaultMethodProperties(Method.XML);
 * Serializer ser = SerializerFactory.getSerializer(props);
 * owriter = ...;  // create a writer to serialize the document to
 * ser.setWriter( owriter );
 *
 * inputDoc = ...; // create the DOM document to be serialized
 * DOMSerializer dser = ser.asDOMSerializer(); // a DOM will be serialized
 * dser.serialize(inputDoc); // serialize the DOM, sending output to owriter
 *
 * ser.reset(); // get ready to use the serializer for another document
 *              // of the same output method.
 * </pre>
 *
 * This interface is a public API.
 *
 * @see Method
 * @see OutputPropertiesFactory
 * @see SerializerFactory
 * @see DOMSerializer
 * @see ContentHandler
 *
 * @xsl.usage general
 */
