_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/EventReaderDelegate.java
  public XMLEventReader getParent() {

  /**
   * Get the parent of this instance.
   * @return the parent or null if none is set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/EventReaderDelegate.java
  public void setParent(XMLEventReader reader) {

  /**
   * Set the parent of this instance.
   * @param reader the new parent
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/EventReaderDelegate.java
  public EventReaderDelegate(XMLEventReader reader) {

  /**
   * Construct an filter with the specified parent.
   * @param reader the parent
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/EventReaderDelegate.java
  public EventReaderDelegate(){}

  /**
   * Construct an empty filter with no parent.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/EventReaderDelegate.java
public class EventReaderDelegate implements XMLEventReader {

/**
 * This is the base class for deriving an XMLEventReader
 * filter.
 *
 * This class is designed to sit between an XMLEventReader and an
 * application's XMLEventReader.  By default each method
 * does nothing but call the corresponding method on the
 * parent interface.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @see javax.xml.stream.XMLEventReader
 * @see StreamReaderDelegate
 * @since 1.6
 */
