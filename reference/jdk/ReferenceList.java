_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    Reference newKeyReference(String uri);

    /**
     * <code>KeyReference</code> factory method. Returns a
     * <code>KeyReference</code>.
     * @param uri
     * @return a <code>KeyReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    Reference newDataReference(String uri);

    /**
     * <code>DataReference</code> factory method. Returns a
     * <code>DataReference</code>.
     * @param uri
     * @return a <code>DataReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    Iterator<Reference> getReferences();

    /**
     * Returns an <code>Iterator</code> over all the <code>Reference</code>s
     * contained in this <code>ReferenceList</code>.
     *
     * @return Iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    boolean isEmpty();

    /**
     * Indicates if the <code>ReferenceList</code> is empty.
     *
     * @return <code><b>true</b></code> if the <code>ReferenceList</code> is
     *     empty, else <code><b>false</b></code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    int size();

    /**
     * Returns the size of the <code>ReferenceList</code>.
     *
     * @return the size of the <code>ReferenceList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    void remove(Reference reference);

    /**
     * Removes a reference from the <code>ReferenceList</code>.
     *
     * @param reference the reference to remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    void add(Reference reference);

    /**
     * Adds a reference to this reference list.
     *
     * @param reference the reference to add.
     * @throws IllegalAccessException if the <code>Reference</code> is not an
     *   instance of <code>DataReference</code> or <code>KeyReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    int KEY_REFERENCE  = 0x00000002;

    /** KEY TAG */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    int DATA_REFERENCE = 0x00000001;

    /** DATA TAG */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
public interface ReferenceList {

/**
 * <code>ReferenceList</code> is an element that contains pointers from a key
 * value of an <code>EncryptedKey</code> to items encrypted by that key value
 * (<code>EncryptedData</code> or <code>EncryptedKey</code> elements).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <element name='ReferenceList'>
 *     <complexType>
 *         <choice minOccurs='1' maxOccurs='unbounded'>
 *             <element name='DataReference' type='xenc:ReferenceType'/>
 *             <element name='KeyReference' type='xenc:ReferenceType'/>
 *         </choice>
 *     </complexType>
 * </element>
 * </xmp>
 *
 * @author Axl Mattheus
 * @see Reference
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    Reference newKeyReference(String uri);

    /**
     * <code>KeyReference</code> factory method. Returns a
     * <code>KeyReference</code>.
     * @param uri
     * @return a <code>KeyReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    Reference newDataReference(String uri);

    /**
     * <code>DataReference</code> factory method. Returns a
     * <code>DataReference</code>.
     * @param uri
     * @return a <code>DataReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    Iterator<Reference> getReferences();

    /**
     * Returns an <code>Iterator</code> over all the <code>Reference</code>s
     * contained in this <code>ReferenceList</code>.
     *
     * @return Iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    boolean isEmpty();

    /**
     * Indicates if the <code>ReferenceList</code> is empty.
     *
     * @return <code><b>true</b></code> if the <code>ReferenceList</code> is
     *     empty, else <code><b>false</b></code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    int size();

    /**
     * Returns the size of the <code>ReferenceList</code>.
     *
     * @return the size of the <code>ReferenceList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    void remove(Reference reference);

    /**
     * Removes a reference from the <code>ReferenceList</code>.
     *
     * @param reference the reference to remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    void add(Reference reference);

    /**
     * Adds a reference to this reference list.
     *
     * @param reference the reference to add.
     * @throws IllegalAccessException if the <code>Reference</code> is not an
     *   instance of <code>DataReference</code> or <code>KeyReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    int KEY_REFERENCE  = 0x00000002;

    /** KEY TAG */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
    int DATA_REFERENCE = 0x00000001;

    /** DATA TAG */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
public interface ReferenceList {

/**
 * <code>ReferenceList</code> is an element that contains pointers from a key
 * value of an <code>EncryptedKey</code> to items encrypted by that key value
 * (<code>EncryptedData</code> or <code>EncryptedKey</code> elements).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <element name='ReferenceList'>
 *     <complexType>
 *         <choice minOccurs='1' maxOccurs='unbounded'>
 *             <element name='DataReference' type='xenc:ReferenceType'/>
 *             <element name='KeyReference' type='xenc:ReferenceType'/>
 *         </choice>
 *     </complexType>
 * </element>
 * </xmp>
 *
 * @author Axl Mattheus
 * @see Reference
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/ReferenceList.java
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
