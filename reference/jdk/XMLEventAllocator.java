_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/XMLEventAllocator.java
  public void allocate(XMLStreamReader reader, XMLEventConsumer consumer)

  /**
   * This method allocates an event or set of events
   * given the current
   * state of the XMLStreamReader and adds the event
   * or set of events to the
   * consumer that was passed in.  This method can be used
   * to expand or contract reader states into event states.
   * This method may modify the state of the XMLStreamReader.
   * @param reader The XMLStreamReader to allocate from
   * @param consumer The XMLEventConsumer to add to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/XMLEventAllocator.java
  public XMLEvent allocate(XMLStreamReader reader)

  /**
   * This method allocates an event given the current
   * state of the XMLStreamReader.  If this XMLEventAllocator
   * does not have a one-to-one mapping between reader states
   * and events this method will return null.  This method
   * must not modify the state of the XMLStreamReader.
   * @param reader The XMLStreamReader to allocate from
   * @return the event corresponding to the current reader state
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/XMLEventAllocator.java
  public XMLEventAllocator newInstance();

  /**
   * This method creates an instance of the XMLEventAllocator. This
   * allows the XMLInputFactory to allocate a new instance per reader.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/util/XMLEventAllocator.java
public interface XMLEventAllocator {

/**
 * This interface defines a class that allows a user to register
 * a way to allocate events given an XMLStreamReader.  An implementation
 * is not required to use the XMLEventFactory implementation but this
 * is recommended.  The XMLEventAllocator can be set on an XMLInputFactory
 * using the property "javax.xml.stream.allocator"
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @see javax.xml.stream.XMLInputFactory
 * @see javax.xml.stream.XMLEventFactory
 * @since 1.6
 */
