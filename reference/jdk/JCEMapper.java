_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
        public Algorithm(Element el) {

        /**
         * Gets data from element
         * @param el
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static class Algorithm {

    /**
     * Represents the Algorithm xml element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static void setProviderId(String provider) {

    /**
     * Sets the default Provider for obtaining the security algorithms
     * @param provider the default providerId.
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the JCE provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String getProviderId() {

    /**
     * Gets the default Provider for obtaining the security algorithms
     * @return the default providerId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String getJCEKeyAlgorithmFromURI(String algorithmURI) {

    /**
     * Method getJCEKeyAlgorithmFromURI
     *
     * @param algorithmURI
     * @return The KeyAlgorithm for the given URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static int getKeyLengthFromURI(String algorithmURI) {

    /**
     * Returns the keylength in bits for a particular algorithm.
     *
     * @param algorithmURI
     * @return The length of the key used in the algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String getAlgorithmClassFromURI(String algorithmURI) {

    /**
     * Method getAlgorithmClassFromURI
     * @param algorithmURI
     * @return the class name that implements this algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String translateURItoJCEID(String algorithmURI) {

    /**
     * Method translateURItoJCEID
     *
     * @param algorithmURI
     * @return the JCE standard name corresponding to the given URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static void register(String id, Algorithm algorithm) {

    /**
     * Method register
     *
     * @param id
     * @param algorithm
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the JCE algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
public class JCEMapper {

/**
 * This class maps algorithm identifier URIs to JAVA JCE class names.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
package com.sun.org.apache.xml.internal.security.algorithms;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
        public Algorithm(Element el) {

        /**
         * Gets data from element
         * @param el
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static class Algorithm {

    /**
     * Represents the Algorithm xml element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static void setProviderId(String provider) {

    /**
     * Sets the default Provider for obtaining the security algorithms
     * @param provider the default providerId.
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the JCE provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String getProviderId() {

    /**
     * Gets the default Provider for obtaining the security algorithms
     * @return the default providerId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String getJCEKeyAlgorithmFromURI(String algorithmURI) {

    /**
     * Method getJCEKeyAlgorithmFromURI
     *
     * @param algorithmURI
     * @return The KeyAlgorithm for the given URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static int getKeyLengthFromURI(String algorithmURI) {

    /**
     * Returns the keylength in bits for a particular algorithm.
     *
     * @param algorithmURI
     * @return The length of the key used in the algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String getAlgorithmClassFromURI(String algorithmURI) {

    /**
     * Method getAlgorithmClassFromURI
     * @param algorithmURI
     * @return the class name that implements this algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static String translateURItoJCEID(String algorithmURI) {

    /**
     * Method translateURItoJCEID
     *
     * @param algorithmURI
     * @return the JCE standard name corresponding to the given URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    public static void register(String id, Algorithm algorithm) {

    /**
     * Method register
     *
     * @param id
     * @param algorithm
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the JCE algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
public class JCEMapper {

/**
 * This class maps algorithm identifier URIs to JAVA JCE class names.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/JCEMapper.java
package com.sun.org.apache.xml.internal.security.algorithms;

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
