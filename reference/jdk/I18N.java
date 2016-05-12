_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public synchronized static void init(String languageCode, String countryCode) {

    /**
     * Method init
     *
     * @param languageCode
     * @param countryCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String getExceptionMessage(String msgID, Object exArgs[]) {

    /**
     * Method getExceptionMessage
     *
     * @param msgID
     * @param exArgs
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String getExceptionMessage(String msgID, Exception originalException) {

    /**
     * Method getExceptionMessage
     *
     * @param msgID
     * @param originalException
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String getExceptionMessage(String msgID) {

    /**
     * Method getExceptionMessage
     *
     * @param msgID
     * @return message translated
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String translate(String message) {

    /**
     * Method translate
     *
     * translates a message ID into an internationalized String, see also
     * <CODE>XMLSecurityException.getExceptionMessage()</CODE>
     *
     * @param message
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String translate(String message, Object[] args) {

    /**
     * Method translate
     *
     * translates a message ID into an internationalized String, see alse
     * <CODE>XMLSecurityException.getExceptionMEssage()</CODE>. The strings are
     * stored in the <CODE>ResourceBundle</CODE>, which is identified in
     * <CODE>exceptionMessagesResourceBundleBase</CODE>
     *
     * @param message
     * @param args is an <CODE>Object[]</CODE> array of strings which are inserted into
     * the String which is retrieved from the <CODE>ResouceBundle</CODE>
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    private I18n() {

    /**
     * Constructor I18n
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    private static boolean alreadyInitialized = false;

    /** Field alreadyInitialized */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    private static ResourceBundle resourceBundle;

    /** Field resourceBundle */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static final String NOT_INITIALIZED_MSG =

    /** Field NOT_INITIALIZED_MSG */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
public class I18n {

/**
 * The Internationalization (I18N) pack.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public synchronized static void init(String languageCode, String countryCode) {

    /**
     * Method init
     *
     * @param languageCode
     * @param countryCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String getExceptionMessage(String msgID, Object exArgs[]) {

    /**
     * Method getExceptionMessage
     *
     * @param msgID
     * @param exArgs
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String getExceptionMessage(String msgID, Exception originalException) {

    /**
     * Method getExceptionMessage
     *
     * @param msgID
     * @param originalException
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String getExceptionMessage(String msgID) {

    /**
     * Method getExceptionMessage
     *
     * @param msgID
     * @return message translated
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String translate(String message) {

    /**
     * Method translate
     *
     * translates a message ID into an internationalized String, see also
     * <CODE>XMLSecurityException.getExceptionMessage()</CODE>
     *
     * @param message
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static String translate(String message, Object[] args) {

    /**
     * Method translate
     *
     * translates a message ID into an internationalized String, see alse
     * <CODE>XMLSecurityException.getExceptionMEssage()</CODE>. The strings are
     * stored in the <CODE>ResourceBundle</CODE>, which is identified in
     * <CODE>exceptionMessagesResourceBundleBase</CODE>
     *
     * @param message
     * @param args is an <CODE>Object[]</CODE> array of strings which are inserted into
     * the String which is retrieved from the <CODE>ResouceBundle</CODE>
     * @return message translated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    private I18n() {

    /**
     * Constructor I18n
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    private static boolean alreadyInitialized = false;

    /** Field alreadyInitialized */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    private static ResourceBundle resourceBundle;

    /** Field resourceBundle */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
    public static final String NOT_INITIALIZED_MSG =

    /** Field NOT_INITIALIZED_MSG */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
public class I18n {

/**
 * The Internationalization (I18N) pack.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/I18n.java
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
