_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Comment.java
final class Comment extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Comment.java
final class Comment extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Comment.java
  public String getText();

  /**
   * Return the string data of the comment, returns empty string if it
   * does not exist
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Comment.java
public interface Comment extends XMLEvent {

/**
 * An interface for comment events
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Comment.java
public interface Comment extends CharacterData {

/**
 * This interface inherits from <code>CharacterData</code> and represents the
 * content of a comment, i.e., all the characters between the starting '
 * <code>&lt;!--</code>' and ending '<code>--&gt;</code>'. Note that this is
 * the definition of a comment in XML, and, in practice, HTML, although some
 * HTML tools may implement the full SGML comment structure.
 * <p> No lexical check is done on the content of a comment and it is
 * therefore possible to have the character sequence <code>"--"</code>
 * (double-hyphen) in the content, which is illegal in a comment per section
 * 2.5 of [<a href='http://www.w3.org/TR/2004/REC-xml-20040204'>XML 1.0</a>]. The
 * presence of this character sequence must generate a fatal error during
 * serialization.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */
