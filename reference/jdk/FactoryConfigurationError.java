_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    @Override

    /**
     * use the exception chaining mechanism of JDK1.4
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    public Exception getException () {

    /**
     * Return the actual exception (if any) that caused this exception to
     * be raised.
     *
     * @return The encapsulated exception, or null if there is none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    public String getMessage () {

    /**
     * Return the message (if any) for this error . If there is no
     * message for the exception and there is an encapsulated
     * exception then the message of that exception, if it exists will be
     * returned. Else the name of the encapsulated exception will be
     * returned.
     *
     * @return The error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    public FactoryConfigurationError(Exception e, String msg) {

    /**
     * Create a new <code>FactoryConfigurationError</code> with the
     * given <code>Exception</code> base cause and detail message.
     *
     * @param e The exception to be encapsulated in a
     * FactoryConfigurationError
     * @param msg The detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    public FactoryConfigurationError(Exception e) {

    /**
     * Create a new <code>FactoryConfigurationError</code> with a
     * given <code>Exception</code> base cause of the error.
     *
     * @param e The exception to be encapsulated in a
     * FactoryConfigurationError.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    public FactoryConfigurationError(String msg) {

    /**
     * Create a new <code>FactoryConfigurationError</code> with
     * the <code>String </code> specified as an error message.
     *
     * @param msg The error message for the exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    public FactoryConfigurationError() {

    /**
     * Create a new <code>FactoryConfigurationError</code> with no
     * detail mesage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
    private Exception exception;

    /**
     *<code>Exception</code> that represents the error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/parsers/FactoryConfigurationError.java
public class FactoryConfigurationError extends Error {

/**
 * Thrown when a problem with configuration with the Parser Factories
 * exists. This error will typically be thrown when the class of a
 * parser factory specified in the system properties cannot be found
 * or instantiated.
 *
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @version $Revision: 1.7 $, $Date: 2010-11-01 04:36:09 $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
  public String getMessage() {

  /**
   * Report the message associated with this error
   *
   * @return the string value of the message
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
    @Override

    /**
     * use the exception chaining mechanism of JDK1.4
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
  public Exception getException() {

  /**
   * Return the nested exception (if any)
   *
   * @return the nested exception or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
  public FactoryConfigurationError(java.lang.String msg) {

  /**
   * Construct an exception with associated message
   *
   * @param msg the message to report
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
  public FactoryConfigurationError(java.lang.String msg, java.lang.Exception e){

  /**
   * Construct an exception with a nested inner exception
   * and a message
   *
   * @param msg the message to report
   * @param e the exception to nest
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
  public FactoryConfigurationError(java.lang.Exception e, java.lang.String msg){

  /**
   * Construct an exception with a nested inner exception
   * and a message
   *
   * @param e the exception to nest
   * @param msg the message to report
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
  public FactoryConfigurationError(java.lang.Exception e){

  /**
   * Construct an exception with a nested inner exception
   *
   * @param e the exception to nest
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
  public FactoryConfigurationError(){}

  /**
   * Default constructor
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/FactoryConfigurationError.java
public class FactoryConfigurationError extends Error {

/**
 * An error class for reporting factory configuration errors.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
