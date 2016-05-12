_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Transforms.java
public interface Transforms {

/**
 * A container for <code>ds:Transform</code>s.
 * <p>
 * It is defined as follows:
 * <xmp>
 * <complexType name='TransformsType'>
 *     <sequence>
 *         <element ref='ds:Transform' maxOccurs='unbounded'/>
 *     </sequence>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 * @see com.sun.org.apache.xml.internal.security.encryption.CipherReference
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Transforms.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public Transform item(int i) throws TransformationException {

    /**
     * Return the <it>i</it><sup>th</sup> <code>{@link Transform}</code>.
     * Valid <code>i</code> values are 0 to <code>{@link #getLength}-1</code>.
     *
     * @param i index of {@link Transform} to return
     * @return the <it>i</it><sup>th</sup> Transform
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public int getLength() {

    /**
     * Return the nonnegative number of transformations.
     *
     * @return the number of transformations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public XMLSignatureInput performTransforms(
        XMLSignatureInput xmlSignatureInput, OutputStream os
    ) throws TransformationException {

    /**
     * Applies all included <code>Transform</code>s to xmlSignatureInput and
     * returns the result of these transformations.
     *
     * @param xmlSignatureInput the input for the <code>Transform</code>s
     * @param os where to output the last transformation.
     * @return the result of the <code>Transforms</code>
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public XMLSignatureInput performTransforms(
        XMLSignatureInput xmlSignatureInput
    ) throws TransformationException {

    /**
     * Applies all included <code>Transform</code>s to xmlSignatureInput and
     * returns the result of these transformations.
     *
     * @param xmlSignatureInput the input for the <code>Transform</code>s
     * @return the result of the <code>Transforms</code>
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    private void addTransform(Transform transform) {

    /**
     * Adds a user-provided Transform step.
     *
     * @param transform {@link Transform} object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void addTransform(String transformURI, NodeList contextNodes)

    /**
     * Adds the <code>Transform</code> with the specified <code>Transform
     * algorithm URI</code>.
     *
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @param contextNodes
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void addTransform(String transformURI, Element contextElement)

    /**
     * Adds the <code>Transform</code> with the specified <code>Transform
     * algorithm URI</code>
     *
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @param contextElement
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void addTransform(String transformURI) throws TransformationException {

    /**
     * Adds the <code>Transform</code> with the specified <code>Transform
     * algorithm URI</code>
     *
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure validation is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public Transforms(Element element, String BaseURI)

    /**
     * Constructs {@link Transforms} from {@link Element} which is
     * <code>Transforms</code> Element
     *
     * @param element  is <code>Transforms</code> element
     * @param BaseURI the URI where the XML instance was stored
     * @throws DOMException
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public Transforms(Document doc) {

    /**
     * Constructs {@link Transforms}.
     *
     * @param doc the {@link Document} in which <code>XMLSignature</code> will
     * be placed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XPATH2FILTER

    /** Transform - XPath Filter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XPOINTER

    /** Transform - XPointer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_ENVELOPED_SIGNATURE

    /** Transform - Required Enveloped Signature */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XPATH

    /** Transform - Recommended XPath */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_BASE64_DECODE

    /** Transform - Required base64 decoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XSLT

    /** Transform - Optional XSLT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_EXCL_WITH_COMMENTS

    /** Canonicalization - Recommended Exclusive Canonicalization with Comments */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_EXCL_OMIT_COMMENTS

    /** Canonicalization - Required Exclusive Canonicalization (omits comments) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N11_WITH_COMMENTS

    /** Canonicalization - Recommended Canonical XML 1.1 with Comments */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N11_OMIT_COMMENTS

    /** Canonicalization - Required Canonical XML 1.1 (omits comments) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_WITH_COMMENTS

    /** Canonicalization - Recommended Canonical XML with Comments */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_OMIT_COMMENTS

    /** Canonicalization - Required Canonical XML (omits comments) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
public class Transforms extends SignatureElementProxy {

/**
 * Holder of the {@link com.sun.org.apache.xml.internal.security.transforms.Transform} steps to
 * be performed on the data.
 * The input to the first Transform is the result of dereferencing the
 * <code>URI</code> attribute of the <code>Reference</code> element.
 * The output from the last Transform is the input for the
 * <code>DigestMethod algorithm</code>
 *
 * @author Christian Geuer-Pollmann
 * @see Transform
 * @see com.sun.org.apache.xml.internal.security.signature.Reference
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Transforms.java
public interface Transforms {

/**
 * A container for <code>ds:Transform</code>s.
 * <p>
 * It is defined as follows:
 * <xmp>
 * <complexType name='TransformsType'>
 *     <sequence>
 *         <element ref='ds:Transform' maxOccurs='unbounded'/>
 *     </sequence>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 * @see com.sun.org.apache.xml.internal.security.encryption.CipherReference
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Transforms.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public Transform item(int i) throws TransformationException {

    /**
     * Return the <it>i</it><sup>th</sup> <code>{@link Transform}</code>.
     * Valid <code>i</code> values are 0 to <code>{@link #getLength}-1</code>.
     *
     * @param i index of {@link Transform} to return
     * @return the <it>i</it><sup>th</sup> Transform
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public int getLength() {

    /**
     * Return the nonnegative number of transformations.
     *
     * @return the number of transformations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public XMLSignatureInput performTransforms(
        XMLSignatureInput xmlSignatureInput, OutputStream os
    ) throws TransformationException {

    /**
     * Applies all included <code>Transform</code>s to xmlSignatureInput and
     * returns the result of these transformations.
     *
     * @param xmlSignatureInput the input for the <code>Transform</code>s
     * @param os where to output the last transformation.
     * @return the result of the <code>Transforms</code>
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public XMLSignatureInput performTransforms(
        XMLSignatureInput xmlSignatureInput
    ) throws TransformationException {

    /**
     * Applies all included <code>Transform</code>s to xmlSignatureInput and
     * returns the result of these transformations.
     *
     * @param xmlSignatureInput the input for the <code>Transform</code>s
     * @return the result of the <code>Transforms</code>
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    private void addTransform(Transform transform) {

    /**
     * Adds a user-provided Transform step.
     *
     * @param transform {@link Transform} object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void addTransform(String transformURI, NodeList contextNodes)

    /**
     * Adds the <code>Transform</code> with the specified <code>Transform
     * algorithm URI</code>.
     *
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @param contextNodes
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void addTransform(String transformURI, Element contextElement)

    /**
     * Adds the <code>Transform</code> with the specified <code>Transform
     * algorithm URI</code>
     *
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @param contextElement
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void addTransform(String transformURI) throws TransformationException {

    /**
     * Adds the <code>Transform</code> with the specified <code>Transform
     * algorithm URI</code>
     *
     * @param transformURI the URI form of transform that indicates which
     * transformation is applied to data
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure validation is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public Transforms(Element element, String BaseURI)

    /**
     * Constructs {@link Transforms} from {@link Element} which is
     * <code>Transforms</code> Element
     *
     * @param element  is <code>Transforms</code> element
     * @param BaseURI the URI where the XML instance was stored
     * @throws DOMException
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public Transforms(Document doc) {

    /**
     * Constructs {@link Transforms}.
     *
     * @param doc the {@link Document} in which <code>XMLSignature</code> will
     * be placed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XPATH2FILTER

    /** Transform - XPath Filter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XPOINTER

    /** Transform - XPointer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_ENVELOPED_SIGNATURE

    /** Transform - Required Enveloped Signature */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XPATH

    /** Transform - Recommended XPath */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_BASE64_DECODE

    /** Transform - Required base64 decoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_XSLT

    /** Transform - Optional XSLT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_EXCL_WITH_COMMENTS

    /** Canonicalization - Recommended Exclusive Canonicalization with Comments */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_EXCL_OMIT_COMMENTS

    /** Canonicalization - Required Exclusive Canonicalization (omits comments) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N11_WITH_COMMENTS

    /** Canonicalization - Recommended Canonical XML 1.1 with Comments */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N11_OMIT_COMMENTS

    /** Canonicalization - Required Canonical XML 1.1 (omits comments) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_WITH_COMMENTS

    /** Canonicalization - Recommended Canonical XML with Comments */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
    public static final String TRANSFORM_C14N_OMIT_COMMENTS

    /** Canonicalization - Required Canonical XML (omits comments) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
public class Transforms extends SignatureElementProxy {

/**
 * Holder of the {@link com.sun.org.apache.xml.internal.security.transforms.Transform} steps to
 * be performed on the data.
 * The input to the first Transform is the result of dereferencing the
 * <code>URI</code> attribute of the <code>Reference</code> element.
 * The output from the last Transform is the input for the
 * <code>DigestMethod algorithm</code>
 *
 * @author Christian Geuer-Pollmann
 * @see Transform
 * @see com.sun.org.apache.xml.internal.security.signature.Reference
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/Transforms.java
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
