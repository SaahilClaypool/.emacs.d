_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/StreamReaderDelegate.java
  public XMLStreamReader getParent() {

  /**
   * Get the parent of this instance.
   * @return the parent or null if none is set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/StreamReaderDelegate.java
  public void setParent(XMLStreamReader reader) {

  /**
   * Set the parent of this instance.
   * @param reader the new parent
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/StreamReaderDelegate.java
  public StreamReaderDelegate(XMLStreamReader reader) {

  /**
   * Construct an filter with the specified parent.
   * @param reader the parent
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/StreamReaderDelegate.java
  public StreamReaderDelegate(){}

  /**
   * Construct an empty filter with no parent.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/StreamReaderDelegate.java
public class StreamReaderDelegate implements XMLStreamReader {

/**
 * This is the base class for deriving an XMLStreamReader filter
 *
 * This class is designed to sit between an XMLStreamReader and an
 * application's XMLStreamReader.   By default each method
 * does nothing but call the corresponding method on the
 * parent interface.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @see javax.xml.stream.XMLStreamReader
 * @see EventReaderDelegate
 * @since 1.6
 */
