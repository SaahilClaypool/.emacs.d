_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String trim(String str) {

    /**
     * Method trim
     *
     * @param str
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    private static int countQuotes(String s, int i, int j) {

    /**
     * Returns the number of Quotation from i to j
     *
     * @param s
     * @param i
     * @param j
     * @return number of quotes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String removeWSandReplace(String str, String symbol, String replace) {

    /**
     * Method removeWSandReplace
     *
     * @param str
     * @param symbol
     * @param replace
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String removeWhiteSpace(String str, String symbol) {

    /**
     * Method removeWhiteSpace
     *
     * @param str
     * @param symbol
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String semicolonToComma(String str) {

    /**
     * Method semicolonToComma
     *
     * @param str
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeWStoRFC(String string) {

    /**
     * Method changeWStoRFC
     *
     * @param string
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeWStoXML(String string) throws IOException {

    /**
     * Method changeWStoXML
     *
     * @param string
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeLess32toXML(String string) throws IOException {

    /**
     * Method changeLess32toXML
     *
     * @param string
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeLess32toRFC(String string) throws IOException {

    /**
     * Method changeLess32toRFC
     *
     * @param string
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String xmltoRFC(String string) {

    /**
     * Method xmltoRFC
     *
     * @param string
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String rfctoXML(String string) {

    /**
     * Method rfctoXML
     *
     * @param string
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String normalizeV(String str, boolean toXml) throws IOException {

    /**
     * Method normalizeV
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String normalizeAT(String str) {

    /**
     * Method normalizeAT
     *
     * @param str
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String parseATAV(String str, boolean toXml) throws IOException {

    /**
     * Method parseATAV
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String parseRDN(String str, boolean toXml) throws IOException {

    /**
     * Method parseRDN
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String normalize(String dn, boolean toXml) {

    /**
     * Method normalize
     *
     * @param dn
     * @param toXml
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String normalize(String dn) {

    /**
     * Method normalize
     *
     * @param dn
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String xmldsigtoRFC2253(String dn) {

    /**
     * Method xmldsigtoRFC2253
     *
     * @param dn
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String rfc2253toXMLdsig(String dn) {

    /**
     * Method rfc2253toXMLdsig
     *
     * @param dn
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
package com.sun.org.apache.xml.internal.security.utils;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String trim(String str) {

    /**
     * Method trim
     *
     * @param str
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    private static int countQuotes(String s, int i, int j) {

    /**
     * Returns the number of Quotation from i to j
     *
     * @param s
     * @param i
     * @param j
     * @return number of quotes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String removeWSandReplace(String str, String symbol, String replace) {

    /**
     * Method removeWSandReplace
     *
     * @param str
     * @param symbol
     * @param replace
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String removeWhiteSpace(String str, String symbol) {

    /**
     * Method removeWhiteSpace
     *
     * @param str
     * @param symbol
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String semicolonToComma(String str) {

    /**
     * Method semicolonToComma
     *
     * @param str
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeWStoRFC(String string) {

    /**
     * Method changeWStoRFC
     *
     * @param string
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeWStoXML(String string) throws IOException {

    /**
     * Method changeWStoXML
     *
     * @param string
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeLess32toXML(String string) throws IOException {

    /**
     * Method changeLess32toXML
     *
     * @param string
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String changeLess32toRFC(String string) throws IOException {

    /**
     * Method changeLess32toRFC
     *
     * @param string
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String xmltoRFC(String string) {

    /**
     * Method xmltoRFC
     *
     * @param string
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String rfctoXML(String string) {

    /**
     * Method rfctoXML
     *
     * @param string
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String normalizeV(String str, boolean toXml) throws IOException {

    /**
     * Method normalizeV
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String normalizeAT(String str) {

    /**
     * Method normalizeAT
     *
     * @param str
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String parseATAV(String str, boolean toXml) throws IOException {

    /**
     * Method parseATAV
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    static String parseRDN(String str, boolean toXml) throws IOException {

    /**
     * Method parseRDN
     *
     * @param str
     * @param toXml
     * @return normalized string
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String normalize(String dn, boolean toXml) {

    /**
     * Method normalize
     *
     * @param dn
     * @param toXml
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String normalize(String dn) {

    /**
     * Method normalize
     *
     * @param dn
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String xmldsigtoRFC2253(String dn) {

    /**
     * Method xmldsigtoRFC2253
     *
     * @param dn
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
    public static String rfc2253toXMLdsig(String dn) {

    /**
     * Method rfc2253toXMLdsig
     *
     * @param dn
     * @return normalized string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/RFC2253Parser.java
package com.sun.org.apache.xml.internal.security.utils;

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
