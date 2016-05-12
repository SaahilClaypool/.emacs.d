_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
    protected XMLSignatureInput enginePerformTransform(
        XMLSignatureInput input, Transform transformObject
    ) throws IOException, CanonicalizationException, TransformationException {

    /**
     * Method enginePerformTransform
     *
     * @param input
     * @return {@link XMLSignatureInput} as the result of transformation
     * @inheritDoc
     * @throws CanonicalizationException
     * @throws IOException
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
    protected String engineGetURI() {

    /**
     * Method engineGetURI
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
    public static final String implementedTransformURI =

    /** Field implementedTransformURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
public class TransformBase64Decode extends TransformSpi {

/**
 * Implements the <CODE>http://www.w3.org/2000/09/xmldsig#base64</CODE> decoding
 * transform.
 *
 * <p>The normative specification for base64 decoding transforms is
 * <A HREF="http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/#ref-MIME">[MIME]</A>.
 * The base64 Transform element has no content. The input
 * is decoded by the algorithms. This transform is useful if an
 * application needs to sign the raw data associated with the encoded
 * content of an element. </p>
 *
 * <p>This transform requires an octet stream for input.
 * If an XPath node-set (or sufficiently functional alternative) is
 * given as input, then it is converted to an octet stream by
 * performing operations logically equivalent to 1) applying an XPath
 * transform with expression self::text(), then 2) taking the string-value
 * of the node-set. Thus, if an XML element is identified by a barename
 * XPointer in the Reference URI, and its content consists solely of base64
 * encoded character data, then this transform automatically strips away the
 * start and end tags of the identified element and any of its descendant
 * elements as well as any descendant comments and processing instructions.
 * The output of this transform is an octet stream.</p>
 *
 * @author Christian Geuer-Pollmann
 * @see com.sun.org.apache.xml.internal.security.utils.Base64
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
package com.sun.org.apache.xml.internal.security.transforms.implementations;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
    protected XMLSignatureInput enginePerformTransform(
        XMLSignatureInput input, Transform transformObject
    ) throws IOException, CanonicalizationException, TransformationException {

    /**
     * Method enginePerformTransform
     *
     * @param input
     * @return {@link XMLSignatureInput} as the result of transformation
     * @inheritDoc
     * @throws CanonicalizationException
     * @throws IOException
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
    protected String engineGetURI() {

    /**
     * Method engineGetURI
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
    public static final String implementedTransformURI =

    /** Field implementedTransformURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
public class TransformBase64Decode extends TransformSpi {

/**
 * Implements the <CODE>http://www.w3.org/2000/09/xmldsig#base64</CODE> decoding
 * transform.
 *
 * <p>The normative specification for base64 decoding transforms is
 * <A HREF="http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/#ref-MIME">[MIME]</A>.
 * The base64 Transform element has no content. The input
 * is decoded by the algorithms. This transform is useful if an
 * application needs to sign the raw data associated with the encoded
 * content of an element. </p>
 *
 * <p>This transform requires an octet stream for input.
 * If an XPath node-set (or sufficiently functional alternative) is
 * given as input, then it is converted to an octet stream by
 * performing operations logically equivalent to 1) applying an XPath
 * transform with expression self::text(), then 2) taking the string-value
 * of the node-set. Thus, if an XML element is identified by a barename
 * XPointer in the Reference URI, and its content consists solely of base64
 * encoded character data, then this transform automatically strips away the
 * start and end tags of the identified element and any of its descendant
 * elements as well as any descendant comments and processing instructions.
 * The output of this transform is an octet stream.</p>
 *
 * @author Christian Geuer-Pollmann
 * @see com.sun.org.apache.xml.internal.security.utils.Base64
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformBase64Decode.java
package com.sun.org.apache.xml.internal.security.transforms.implementations;

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
