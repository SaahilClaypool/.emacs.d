_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/helper/AttrCompare.java
    public int compare(Attr attr0, Attr attr1) {

    /**
     * Compares two attributes based on the C14n specification.
     *
     * <UL>
     * <LI>Namespace nodes have a lesser document order position than
     *   attribute nodes.
     * <LI> An element's namespace nodes are sorted lexicographically by
     *   local name (the default namespace node, if one exists, has no
     *   local name and is therefore lexicographically least).
     * <LI> An element's attribute nodes are sorted lexicographically with
     *   namespace URI as the primary key and local name as the secondary
     *   key (an empty namespace URI is lexicographically least).
     * </UL>
     *
     * @param attr0
     * @param attr1
     * @return returns a negative integer, zero, or a positive integer as
     *   obj0 is less than, equal to, or greater than obj1
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/helper/AttrCompare.java
public class AttrCompare implements Comparator<Attr>, Serializable {

/**
 * Compares two attributes based on the C14n specification.
 *
 * <UL>
 * <LI>Namespace nodes have a lesser document order position than attribute
 *   nodes.
 * <LI> An element's namespace nodes are sorted lexicographically by
 *   local name (the default namespace node, if one exists, has no
 *   local name and is therefore lexicographically least).
 * <LI> An element's attribute nodes are sorted lexicographically with
 *   namespace URI as the primary key and local name as the secondary
 *   key (an empty namespace URI is lexicographically least).
 * </UL>
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/helper/AttrCompare.java
package com.sun.org.apache.xml.internal.security.c14n.helper;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/helper/AttrCompare.java
    public int compare(Attr attr0, Attr attr1) {

    /**
     * Compares two attributes based on the C14n specification.
     *
     * <UL>
     * <LI>Namespace nodes have a lesser document order position than
     *   attribute nodes.
     * <LI> An element's namespace nodes are sorted lexicographically by
     *   local name (the default namespace node, if one exists, has no
     *   local name and is therefore lexicographically least).
     * <LI> An element's attribute nodes are sorted lexicographically with
     *   namespace URI as the primary key and local name as the secondary
     *   key (an empty namespace URI is lexicographically least).
     * </UL>
     *
     * @param attr0
     * @param attr1
     * @return returns a negative integer, zero, or a positive integer as
     *   obj0 is less than, equal to, or greater than obj1
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/helper/AttrCompare.java
public class AttrCompare implements Comparator<Attr>, Serializable {

/**
 * Compares two attributes based on the C14n specification.
 *
 * <UL>
 * <LI>Namespace nodes have a lesser document order position than attribute
 *   nodes.
 * <LI> An element's namespace nodes are sorted lexicographically by
 *   local name (the default namespace node, if one exists, has no
 *   local name and is therefore lexicographically least).
 * <LI> An element's attribute nodes are sorted lexicographically with
 *   namespace URI as the primary key and local name as the secondary
 *   key (an empty namespace URI is lexicographically least).
 * </UL>
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/helper/AttrCompare.java
package com.sun.org.apache.xml.internal.security.c14n.helper;

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
