_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NameParser.java
public interface NameParser {

/**
  * This interface is used for parsing names from a hierarchical
  * namespace.  The NameParser contains knowledge of the syntactic
  * information (like left-to-right orientation, name separator, etc.)
  * needed to parse names.
  *
  * The equals() method, when used to compare two NameParsers, returns
  * true if and only if they serve the same namespace.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see CompoundName
  * @see Name
  * @since 1.3
  */
