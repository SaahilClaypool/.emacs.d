_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/EntityDeclaration.java
  String getBaseURI();

  /**
   * Get the base URI for this reference
   * or null if this information is not available
   * @return the base URI or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/EntityDeclaration.java
  String getReplacementText();

  /**
   * The replacement text of the entity.
   * This method will only return non-null
   * if this is an internal entity.
   * @return null or the replacment text
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/EntityDeclaration.java
  String getNotationName();

  /**
   * The name of the associated notation.
   * @return the notation name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/EntityDeclaration.java
  String getName();

  /**
   * The entity's name
   * @return the name, may not be null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/EntityDeclaration.java
  String getSystemId();

  /**
   * The entity's system identifier.
   * @return the system ID for this declaration or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/EntityDeclaration.java
  String getPublicId();

  /**
   * The entity's public identifier, or null if none was given
   * @return the public ID for this declaration or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/EntityDeclaration.java
public interface EntityDeclaration extends XMLEvent {

/**
 * An interface for handling Entity Declarations
 *
 * This interface is used to record and report unparsed entity declarations.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
