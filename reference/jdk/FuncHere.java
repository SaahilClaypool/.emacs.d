_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
    @SuppressWarnings("rawtypes")

    /**
     * No arguments to process, so this does nothing.
     * @param vars
     * @param globalsSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
        nodeSet.detach();

        /** $todo$ Do I have to do this detach() call? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
    @Override

    /**
     * The here function returns a node-set containing the attribute or
     * processing instruction node or the parent element of the text node
     * that directly bears the XPath expression.  This expression results
     * in an error if the containing XPath expression does not appear in the
     * same XML document against which the XPath expression is being evaluated.
     *
     * @param xctxt
     * @return the xobject
     * @throws javax.xml.transform.TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
    private static final long serialVersionUID = 1L;

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
public class FuncHere extends Function {

/**
 * The 'here()' function returns a node-set containing the attribute or
 * processing instruction node or the parent element of the text node
 * that directly bears the XPath expression.  This expression results
 * in an error if the containing XPath expression does not appear in the
 * same XML document against which the XPath expression is being evaluated.
 *
 * Mainpart is stolen from FuncId.java
 *
 * This does crash under Xalan2.2.D7 and works under Xalan2.2.D9
 *
 * To get this baby to work, a special trick has to be used. The function needs
 * access to the Node where the XPath expression has been defined. This is done
 * by constructing a {@link FuncHere} which has this Node as 'owner'.
 *
 * @see "http://www.w3.org/Signature/Drafts/xmldsig-core/Overview.html#function-here"
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
    @SuppressWarnings("rawtypes")

    /**
     * No arguments to process, so this does nothing.
     * @param vars
     * @param globalsSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
        nodeSet.detach();

        /** $todo$ Do I have to do this detach() call? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
    @Override

    /**
     * The here function returns a node-set containing the attribute or
     * processing instruction node or the parent element of the text node
     * that directly bears the XPath expression.  This expression results
     * in an error if the containing XPath expression does not appear in the
     * same XML document against which the XPath expression is being evaluated.
     *
     * @param xctxt
     * @return the xobject
     * @throws javax.xml.transform.TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
    private static final long serialVersionUID = 1L;

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
public class FuncHere extends Function {

/**
 * The 'here()' function returns a node-set containing the attribute or
 * processing instruction node or the parent element of the text node
 * that directly bears the XPath expression.  This expression results
 * in an error if the containing XPath expression does not appear in the
 * same XML document against which the XPath expression is being evaluated.
 *
 * Mainpart is stolen from FuncId.java
 *
 * This does crash under Xalan2.2.D7 and works under Xalan2.2.D9
 *
 * To get this baby to work, a special trick has to be used. The function needs
 * access to the Node where the XPath expression has been defined. This is done
 * by constructing a {@link FuncHere} which has this Node as 'owner'.
 *
 * @see "http://www.w3.org/Signature/Drafts/xmldsig-core/Overview.html#function-here"
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/implementations/FuncHere.java
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
