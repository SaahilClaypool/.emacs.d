_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/Location.java
  public String getSystemId();

  /**
   * Returns the system ID of the XML
   * @return the system ID, or null if not available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/Location.java
  public String getPublicId();

  /**
   * Returns the public ID of the XML
   * @return the public ID, or null if not available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/Location.java
  int getCharacterOffset();

  /**
   * Return the byte or character offset into the input source this location
   * is pointing to. If the input source is a file or a byte stream then
   * this is the byte offset into that stream, but if the input source is
   * a character media then the offset is the character offset.
   * Returns -1 if there is no offset available.
   * @return the current offset
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/Location.java
  int getColumnNumber();

  /**
   * Return the column number where the current event ends,
   * returns -1 if none is available.
   * @return the current column number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/Location.java
public interface Location {

/**
 * Provides information on the location of an event.
 *
 * All the information provided by a Location is optional.  For example
 * an application may only report line numbers.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
