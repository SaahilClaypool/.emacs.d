_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int ENTITY_DECLARATION=15;

  /**
   * Indicates a Entity Declaration
   * @see javax.xml.stream.events.NotationDeclaration
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int NOTATION_DECLARATION=14;

  /**
   * Indicates a Notation
   * @see javax.xml.stream.events.NotationDeclaration
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int NAMESPACE=13;

  /**
   * Indicates the event is a namespace declaration
   *
   * @see javax.xml.stream.events.Namespace
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int CDATA=12;

  /**
   * Indicates an event is a CDATA section
   * @see javax.xml.stream.events.Characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int DTD=11;

  /**
   * Indicates an event is a DTD
   * @see javax.xml.stream.events.DTD
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int ATTRIBUTE=10;

  /**
   * Indicates an event is an attribute
   * @see javax.xml.stream.events.Attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int ENTITY_REFERENCE=9;

  /**
   * Indicates an event is an entity reference
   * @see javax.xml.stream.events.EntityReference
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int END_DOCUMENT=8;

  /**
   * Indicates an event is an end document
   * @see javax.xml.stream.events.EndDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int START_DOCUMENT=7;

  /**
   * Indicates an event is a start document
   * @see javax.xml.stream.events.StartDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int SPACE=6;

  /**
   * The characters are white space
   * (see [XML], 2.10 "White Space Handling").
   * Events are only reported as SPACE if they are ignorable white
   * space.  Otherwise they are reported as CHARACTERS.
   * @see javax.xml.stream.events.Characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int COMMENT=5;

  /**
   * Indicates an event is a comment
   * @see javax.xml.stream.events.Comment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int CHARACTERS=4;

  /**
   * Indicates an event is characters
   * @see javax.xml.stream.events.Characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
  public static final int END_ELEMENT=2;

  /**
   * Indicates an event is an end element
   * @see javax.xml.stream.events.EndElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLStreamConstants.java
public interface XMLStreamConstants {

/**
 * This interface declares the constants used in this API.
 * Numbers in the range 0 to 256 are reserved for the specification,
 * user defined events must use event codes outside that range.
 *
 * @since 1.6
 */
