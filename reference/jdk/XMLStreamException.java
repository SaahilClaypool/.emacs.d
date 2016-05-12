_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public Location getLocation() {

  /**
   * Gets the location of the exception
   *
   * @return the location of the exception, may be null if none is available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public Throwable getNestedException() {

  /**
   * Gets the nested exception.
   *
   * @return Nested exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public XMLStreamException(String msg,
                            Location location) {

  /**
   * Construct an exception with the assocated message, exception and location.
   *
   * @param msg the message to report
   * @param location the location of the error
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public XMLStreamException(String msg, Location location, Throwable th) {

  /**
   * Construct an exception with the assocated message, exception and location.
   *
   * @param th a nested exception
   * @param msg the message to report
   * @param location the location of the error
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public XMLStreamException(String msg, Throwable th) {

  /**
   * Construct an exception with the assocated message and exception
   *
   * @param th a nested exception
   * @param msg the message to report
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public XMLStreamException(Throwable th) {

  /**
   * Construct an exception with the assocated exception
   *
   * @param th a nested exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public XMLStreamException(String msg) {

  /**
   * Construct an exception with the assocated message.
   *
   * @param msg the message to report
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
  public XMLStreamException(){

  /**
   * Default constructor
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamException.java
public class XMLStreamException extends Exception {

/**
 * The base exception for unexpected processing errors.  This Exception
 * class is used to report well-formedness errors as well as unexpected
 * processing conditions.
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
