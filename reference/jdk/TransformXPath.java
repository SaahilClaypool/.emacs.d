_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
        public int isNodeInclude(Node currentNode) {

        /**
         * @see com.sun.org.apache.xml.internal.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    private boolean needsCircumvent(String str) {

    /**
     * @param str
     * @return true if needs to be circumvent for bug.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
            Element xpathElement =

            /**
             * If the actual input is an octet stream, then the application MUST
             * convert the octet stream to an XPath node-set suitable for use by
             * Canonical XML with Comments. (A subsequent application of the
             * REQUIRED Canonical XML algorithm would strip away these comments.)
             *
             * ...
             *
             * The evaluation of this expression includes all of the document's nodes
             * (including comments) in the node-set representing the octet stream.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    protected XMLSignatureInput enginePerformTransform(
        XMLSignatureInput input, OutputStream os, Transform transformObject
    ) throws TransformationException {

    /**
     * Method enginePerformTransform
     * @inheritDoc
     * @param input
     *
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    protected String engineGetURI() {

    /**
     * Method engineGetURI
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    public static final String implementedTransformURI = Transforms.TRANSFORM_XPATH;

    /** Field implementedTransformURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
public class TransformXPath extends TransformSpi {

/**
 * Class TransformXPath
 *
 * Implements the <CODE>http://www.w3.org/TR/1999/REC-xpath-19991116</CODE>
 * transform.
 *
 * @author Christian Geuer-Pollmann
 * @see <a href="http://www.w3.org/TR/1999/REC-xpath-19991116">XPath</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
        public int isNodeInclude(Node currentNode) {

        /**
         * @see com.sun.org.apache.xml.internal.security.signature.NodeFilter#isNodeInclude(org.w3c.dom.Node)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    private boolean needsCircumvent(String str) {

    /**
     * @param str
     * @return true if needs to be circumvent for bug.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
            Element xpathElement =

            /**
             * If the actual input is an octet stream, then the application MUST
             * convert the octet stream to an XPath node-set suitable for use by
             * Canonical XML with Comments. (A subsequent application of the
             * REQUIRED Canonical XML algorithm would strip away these comments.)
             *
             * ...
             *
             * The evaluation of this expression includes all of the document's nodes
             * (including comments) in the node-set representing the octet stream.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    protected XMLSignatureInput enginePerformTransform(
        XMLSignatureInput input, OutputStream os, Transform transformObject
    ) throws TransformationException {

    /**
     * Method enginePerformTransform
     * @inheritDoc
     * @param input
     *
     * @throws TransformationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    protected String engineGetURI() {

    /**
     * Method engineGetURI
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
    public static final String implementedTransformURI = Transforms.TRANSFORM_XPATH;

    /** Field implementedTransformURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
public class TransformXPath extends TransformSpi {

/**
 * Class TransformXPath
 *
 * Implements the <CODE>http://www.w3.org/TR/1999/REC-xpath-19991116</CODE>
 * transform.
 *
 * @author Christian Geuer-Pollmann
 * @see <a href="http://www.w3.org/TR/1999/REC-xpath-19991116">XPath</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/TransformXPath.java
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
