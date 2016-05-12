_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/NotationDeclaration.java
  String getSystemId();

  /**
   * The notation's system identifier, or null if none was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/NotationDeclaration.java
  String getPublicId();

  /**
   * The notation's public identifier, or null if none was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/NotationDeclaration.java
public interface NotationDeclaration extends XMLEvent {

/**
 * An interface for handling Notation Declarations
 *
 * Receive notification of a notation declaration event.
 * It is up to the application to record the notation for later reference,
 * At least one of publicId and systemId must be non-null.
 * There is no guarantee that the notation declaration
 * will be reported before any unparsed entities that use it.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
