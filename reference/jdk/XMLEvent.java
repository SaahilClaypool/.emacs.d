_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public void writeAsEncodedUnicode(Writer writer)

  /**
   * This method will write the XMLEvent as per the XML 1.0 specification as Unicode characters.
   * No indentation or whitespace should be outputted.
   *
   * Any user defined event type SHALL have this method
   * called when being written to on an output stream.
   * Built in Event types MUST implement this method,
   * but implementations MAY choose not call these methods
   * for optimizations reasons when writing out built in
   * Events to an output stream.
   * The output generated MUST be equivalent in terms of the
   * infoset expressed.
   *
   * @param writer The writer that will output the data
   * @throws XMLStreamException if there is a fatal error writing the event
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public QName getSchemaType();

  /**
   * This method is provided for implementations to provide
   * optional type information about the associated event.
   * It is optional and will return null if no information
   * is available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public Characters asCharacters();

  /**
   * Returns this event as Characters, may result in
   * a class cast exception if this event is not Characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public EndElement asEndElement();

  /**
   * Returns this event as an end  element event, may result in
   * a class cast exception if this event is not a end element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public StartElement asStartElement();

  /**
   * Returns this event as a start element event, may result in
   * a class cast exception if this event is not a start element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isEndDocument();

  /**
   * A utility function to check if this event is an EndDocument.
   * @see EndDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isStartDocument();

  /**
   * A utility function to check if this event is a StartDocument.
   * @see StartDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isCharacters();

  /**
   * A utility function to check if this event is Characters.
   * @see Characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isProcessingInstruction();

  /**
   * A utility function to check if this event is a ProcessingInstruction.
   * @see ProcessingInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isEntityReference();

  /**
   * A utility function to check if this event is an EntityReference.
   * @see EntityReference
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isEndElement();

  /**
   * A utility function to check if this event is a EndElement.
   * @see EndElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isNamespace();

  /**
   * A utility function to check if this event is a Namespace.
   * @see Namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isAttribute();

  /**
   * A utility function to check if this event is an Attribute.
   * @see Attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public boolean isStartElement();

  /**
   * A utility function to check if this event is a StartElement.
   * @see StartElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  javax.xml.stream.Location getLocation();

  /**
   * Return the location of this event.  The Location
   * returned from this method is non-volatile and
   * will retain its information.
   * @see javax.xml.stream.Location
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
  public int getEventType();

  /**
   * Returns an integer code for this event.
   * @see #START_ELEMENT
   * @see #END_ELEMENT
   * @see #CHARACTERS
   * @see #ATTRIBUTE
   * @see #NAMESPACE
   * @see #PROCESSING_INSTRUCTION
   * @see #COMMENT
   * @see #START_DOCUMENT
   * @see #END_DOCUMENT
   * @see #DTD
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/XMLEvent.java
public interface XMLEvent extends javax.xml.stream.XMLStreamConstants {

/**
 * This is the base event interface for handling markup events.
 * Events are value objects that are used to communicate the
 * XML 1.0 InfoSet to the Application.  Events may be cached
 * and referenced after the parse has completed.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @see javax.xml.stream.XMLEventReader
 * @see Characters
 * @see ProcessingInstruction
 * @see StartElement
 * @see EndElement
 * @see StartDocument
 * @see EndDocument
 * @see EntityReference
 * @see EntityDeclaration
 * @see NotationDeclaration
 * @since 1.6
 */
