_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/ProcessingInstruction.java
final class ProcessingInstruction extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/ProcessingInstruction.java
final class ProcessingInstruction extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/ProcessingInstruction.java
  public String getData();

  /**
   * The data section of the processing instruction
   *
   * @return the String value of the PI's data or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/ProcessingInstruction.java
  public String getTarget();

  /**
   * The target section of the processing instruction
   *
   * @return the String value of the PI or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/ProcessingInstruction.java
public interface ProcessingInstruction extends XMLEvent {

/**
 * An interface that describes the data found in processing instructions
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ProcessingInstruction.java
    public String getData();

    /**
     * The content of this processing instruction. This is from the first non
     * white space character after the target to the character immediately
     * preceding the <code>?&gt;</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ProcessingInstruction.java
public interface ProcessingInstruction extends Node {

/**
 * The <code>ProcessingInstruction</code> interface represents a "processing
 * instruction", used in XML as a way to keep processor-specific information
 * in the text of the document.
 * <p> No lexical check is done on the content of a processing instruction and
 * it is therefore possible to have the character sequence
 * <code>"?&gt;"</code> in the content, which is illegal a processing
 * instruction per section 2.6 of [<a href='http://www.w3.org/TR/2004/REC-xml-20040204'>XML 1.0</a>]. The
 * presence of this character sequence must generate a fatal error during
 * serialization.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */
