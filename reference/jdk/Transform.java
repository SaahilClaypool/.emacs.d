_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/Transform.java
final public class Transform {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    private TransformSpi initializeTransform(String algorithmURI, NodeList contextNodes)

    /**
     * Initialize the transform object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public XMLSignatureInput performTransform(
        XMLSignatureInput input, OutputStream os
    ) throws IOException, CanonicalizationException,

    /**
     * Transforms the input, and generates {@link XMLSignatureInput} as output.
     *
     * @param input input {@link XMLSignatureInput} which can supplied Octect
     * Stream and NodeSet as Input of Transformation
     * @param os where to output the result of the last transformation
     * @return the {@link XMLSignatureInput} class as the result of
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public XMLSignatureInput performTransform(XMLSignatureInput input)

    /**
     * Transforms the input, and generates {@link XMLSignatureInput} as output.
     *
     * @param input input {@link XMLSignatureInput} which can supplied Octet
     * Stream and NodeSet as Input of Transformation
     * @return the {@link XMLSignatureInput} class as the result of
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public String getURI() {

    /**
     * Returns the URI representation of Transformation algorithm
     *
     * @return the URI representation of Transformation algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public static void register(String algorithmURI, Class<? extends TransformSpi> implementingClass)

    /**
     * Registers implementing class of the Transform algorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>Transform algorithm</code>
     * @param implementingClass <code>implementingClass</code> the implementing
     * class of {@link TransformSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI
     * is already registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the transform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    @SuppressWarnings("unchecked")

    /**
     * Registers implementing class of the Transform algorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>Transform algorithm</code>
     * @param implementingClass <code>implementingClass</code> the implementing
     * class of {@link TransformSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI
     * is already registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the transform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Element element, String BaseURI)

    /**
     * @param element <code>ds:Transform</code> element
     * @param BaseURI the URI of the resource where the XML instance was stored
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Document doc, String algorithmURI, NodeList contextNodes)

    /**
     * Constructs {@link Transform}
     *
     * @param doc the {@link Document} in which <code>Transform</code> will be
     * placed
     * @param algorithmURI URI representation of <code>Transform algorithm</code>
     * @param contextNodes the child node list of <code>Transform</code> element
     * @throws InvalidTransformException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Document doc, String algorithmURI, Element contextChild)

    /**
     * Generates a Transform object that implements the specified
     * <code>Transform algorithm</code> URI.
     *
     * @param algorithmURI <code>Transform algorithm</code> URI representation,
     * such as specified in
     * <a href=http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg>Transform algorithm </a>
     * @param contextChild the child element of <code>Transform</code> element
     * @param doc the proxy {@link Document}
     * @throws InvalidTransformException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Document doc, String algorithmURI) throws InvalidTransformException {

    /**
     * Generates a Transform object that implements the specified
     * <code>Transform algorithm</code> URI.
     *
     * @param doc the proxy {@link Document}
     * @param algorithmURI <code>Transform algorithm</code> URI representation,
     * such as specified in
     * <a href=http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg>Transform algorithm </a>
     * @throws InvalidTransformException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    private static Map<String, Class<? extends TransformSpi>> transformSpiHash =

    /** All available Transform classes are registered here */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
public final class Transform extends SignatureElementProxy {

/**
 * Implements the behaviour of the <code>ds:Transform</code> element.
 *
 * This <code>Transform</code>(Factory) class acts as the Factory and Proxy of
 * the implementing class that supports the functionality of <a
 * href=http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg>a Transform
 * algorithm</a>.
 * Implements the Factory and Proxy pattern for ds:Transform algorithms.
 *
 * @author Christian Geuer-Pollmann
 * @see Transforms
 * @see TransformSpi
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
package com.sun.org.apache.xml.internal.security.transforms;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/cmdline/Transform.java
final public class Transform {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author G. Todd Miller
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    private TransformSpi initializeTransform(String algorithmURI, NodeList contextNodes)

    /**
     * Initialize the transform object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public XMLSignatureInput performTransform(
        XMLSignatureInput input, OutputStream os
    ) throws IOException, CanonicalizationException,

    /**
     * Transforms the input, and generates {@link XMLSignatureInput} as output.
     *
     * @param input input {@link XMLSignatureInput} which can supplied Octect
     * Stream and NodeSet as Input of Transformation
     * @param os where to output the result of the last transformation
     * @return the {@link XMLSignatureInput} class as the result of
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public XMLSignatureInput performTransform(XMLSignatureInput input)

    /**
     * Transforms the input, and generates {@link XMLSignatureInput} as output.
     *
     * @param input input {@link XMLSignatureInput} which can supplied Octet
     * Stream and NodeSet as Input of Transformation
     * @return the {@link XMLSignatureInput} class as the result of
     * transformation
     * @throws CanonicalizationException
     * @throws IOException
     * @throws InvalidCanonicalizerException
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public String getURI() {

    /**
     * Returns the URI representation of Transformation algorithm
     *
     * @return the URI representation of Transformation algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public static void register(String algorithmURI, Class<? extends TransformSpi> implementingClass)

    /**
     * Registers implementing class of the Transform algorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>Transform algorithm</code>
     * @param implementingClass <code>implementingClass</code> the implementing
     * class of {@link TransformSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI
     * is already registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the transform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    @SuppressWarnings("unchecked")

    /**
     * Registers implementing class of the Transform algorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>Transform algorithm</code>
     * @param implementingClass <code>implementingClass</code> the implementing
     * class of {@link TransformSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI
     * is already registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the transform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Element element, String BaseURI)

    /**
     * @param element <code>ds:Transform</code> element
     * @param BaseURI the URI of the resource where the XML instance was stored
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Document doc, String algorithmURI, NodeList contextNodes)

    /**
     * Constructs {@link Transform}
     *
     * @param doc the {@link Document} in which <code>Transform</code> will be
     * placed
     * @param algorithmURI URI representation of <code>Transform algorithm</code>
     * @param contextNodes the child node list of <code>Transform</code> element
     * @throws InvalidTransformException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Document doc, String algorithmURI, Element contextChild)

    /**
     * Generates a Transform object that implements the specified
     * <code>Transform algorithm</code> URI.
     *
     * @param algorithmURI <code>Transform algorithm</code> URI representation,
     * such as specified in
     * <a href=http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg>Transform algorithm </a>
     * @param contextChild the child element of <code>Transform</code> element
     * @param doc the proxy {@link Document}
     * @throws InvalidTransformException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    public Transform(Document doc, String algorithmURI) throws InvalidTransformException {

    /**
     * Generates a Transform object that implements the specified
     * <code>Transform algorithm</code> URI.
     *
     * @param doc the proxy {@link Document}
     * @param algorithmURI <code>Transform algorithm</code> URI representation,
     * such as specified in
     * <a href=http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg>Transform algorithm </a>
     * @throws InvalidTransformException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    private static Map<String, Class<? extends TransformSpi>> transformSpiHash =

    /** All available Transform classes are registered here */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
public final class Transform extends SignatureElementProxy {

/**
 * Implements the behaviour of the <code>ds:Transform</code> element.
 *
 * This <code>Transform</code>(Factory) class acts as the Factory and Proxy of
 * the implementing class that supports the functionality of <a
 * href=http://www.w3.org/TR/xmldsig-core/#sec-TransformAlg>a Transform
 * algorithm</a>.
 * Implements the Factory and Proxy pattern for ds:Transform algorithms.
 *
 * @author Christian Geuer-Pollmann
 * @see Transforms
 * @see TransformSpi
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transform.java
package com.sun.org.apache.xml.internal.security.transforms;

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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    public abstract Data transform

    /**
     * Transforms the specified data using the underlying transform algorithm.
     * If the output of this transform is an <code>OctetStreamData</code>, then
     * this method returns <code>null</code> and the bytes are written to the
     * specified <code>OutputStream</code>. Otherwise, the
     * <code>OutputStream</code> is ignored and the method behaves as if
     * {@link #transform(Data, XMLCryptoContext)} were invoked.
     *
     * @param data the data to be transformed
     * @param context the <code>XMLCryptoContext</code> containing
     *    additional context (may be <code>null</code> if not applicable)
     * @param os the <code>OutputStream</code> that should be used to write
     *    the transformed data to
     * @return the transformed data (or <code>null</code> if the data was
     *    written to the <code>OutputStream</code> parameter)
     * @throws NullPointerException if <code>data</code> or <code>os</code>
     *    is <code>null</code>
     * @throws TransformException if an error occurs while executing the
     *    transform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    public abstract Data transform(Data data, XMLCryptoContext context)

    /**
     * Transforms the specified data using the underlying transform algorithm.
     *
     * @param data the data to be transformed
     * @param context the <code>XMLCryptoContext</code> containing
     *    additional context (may be <code>null</code> if not applicable)
     * @return the transformed data
     * @throws NullPointerException if <code>data</code> is <code>null</code>
     * @throws TransformException if an error occurs while executing the
     *    transform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    AlgorithmParameterSpec getParameterSpec();

    /**
     * Returns the algorithm-specific input parameters associated with this
     * <code>Transform</code>.
     * <p>
     * The returned parameters can be typecast to a
     * {@link TransformParameterSpec} object.
     *
     * @return the algorithm-specific input parameters (may be <code>null</code>
     *    if not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    final static String XSLT = "http://www.w3.org/TR/1999/REC-xslt-19991116";

    /**
     * The <a href="http://www.w3.org/TR/1999/REC-xslt-19991116">XSLT</a>
     * transform algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    final static String XPATH2 = "http://www.w3.org/2002/06/xmldsig-filter2";

    /**
     * The <a href="http://www.w3.org/2002/06/xmldsig-filter2">
     * XPath Filter 2</a> transform algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    final static String XPATH = "http://www.w3.org/TR/1999/REC-xpath-19991116";

    /**
     * The <a href="http://www.w3.org/TR/1999/REC-xpath-19991116">XPath</a>
     * transform algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    final static String ENVELOPED =

    /**
     * The <a href="http://www.w3.org/2000/09/xmldsig#enveloped-signature">
     * Enveloped Signature</a> transform algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
    final static String BASE64 = "http://www.w3.org/2000/09/xmldsig#base64";

    /**
     * The <a href="http://www.w3.org/2000/09/xmldsig#base64">Base64</a>
     * transform algorithm URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Transform.java
public interface Transform extends XMLStructure, AlgorithmMethod {

/**
 * A representation of the XML <code>Transform</code> element as
 * defined in the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * The XML Schema Definition is defined as:
 *
 * <pre>
 * &lt;element name="Transform" type="ds:TransformType"/&gt;
 *   &lt;complexType name="TransformType" mixed="true"&gt;
 *     &lt;choice minOccurs="0" maxOccurs="unbounded"&gt;
 *       &lt;any namespace="##other" processContents="lax"/&gt;
 *       &lt;!-- (1,1) elements from (0,unbounded) namespaces --&gt;
 *       &lt;element name="XPath" type="string"/&gt;
 *     &lt;/choice&gt;
 *     &lt;attribute name="Algorithm" type="anyURI" use="required"/&gt;
 *   &lt;/complexType&gt;
 * </pre>
 *
 * A <code>Transform</code> instance may be created by invoking the
 * {@link XMLSignatureFactory#newTransform newTransform} method
 * of the {@link XMLSignatureFactory} class.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#newTransform(String, TransformParameterSpec)
 */
