_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/StreamFilter.java
  public boolean accept(XMLStreamReader reader);

  /**
   * Tests whether the current state is part of this stream.  This method
   * will return true if this filter accepts this event and false otherwise.
   *
   * The method should not change the state of the reader when accepting
   * a state.
   *
   * @param reader the event to test
   * @return true if this filter accepts this event, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/StreamFilter.java
public interface StreamFilter {

/**
 * This interface declares a simple filter interface that one can
 * create to filter XMLStreamReaders
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
