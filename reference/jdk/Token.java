_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public static final Token newToken(int ofKind)

  /**
   * Returns a new Token object, by default. However, if you want, you
   * can create and return subclass objects based on the value of ofKind.
   * Simply add the cases to the switch for all those special cases.
   * For example, if you have a subclass of Token called IDToken that
   * you want to create if ofKind is ID, simlpy add something like :
   *
   *    case MyParserConstants.ID : return new IDToken();
   *
   * to the following switch statement. Then you can cast matchedToken
   * variable to the appropriate type and use it in your lexical actions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public final String toString()

  /**
   * Returns the image.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public Token specialToken;

  /**
   * This field is used to access special tokens that occur prior to this
   * token, but after the immediately preceding regular (non-special) token.
   * If there are no such special tokens, this field is set to null.
   * When there are more than one such special token, this field refers
   * to the last of these special tokens, which in turn refers to the next
   * previous special token through its specialToken field, and so on
   * until the first special token (whose specialToken field is null).
   * The next fields of special tokens refer to other special tokens that
   * immediately follow it (without an intervening regular token).  If there
   * is no such token, this field is null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public Token next;

  /**
   * A reference to the next regular (non-special) token from the input
   * stream.  If this is the last token from the input stream, or if the
   * token manager has not read tokens beyond this one, this field is
   * set to null.  This is true only if this token is also a regular
   * token.  Otherwise, see below for a description of the contents of
   * this field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public String image;

  /**
   * The string image of the token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public int beginLine, beginColumn, endLine, endColumn;

  /**
   * beginLine and beginColumn describe the position of the first character
   * of this token; endLine and endColumn describe the position of the
   * last character of this token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public int kind;

  /**
   * An integer that describes the kind of this token.  This numbering
   * system is determined by JavaCCParser, and a table of these numbers is
   * stored in the file ...Constants.java.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
class Token {

/**
 * Describes the input token stream.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
        private void writeObject(ObjectOutputStream out) throws IOException {

        /**
         * @serialData Serialized fields. Convert the List to Vector for backward compatibility.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
        private static final ObjectStreamField[] serialPersistentFields =

        /**
         * @serialField children Vector children
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class UnionToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     * for UNION or CONCAT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ModifierToken extends Token implements java.io.Serializable {

    /**
     * (ims-ims: .... )
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ConditionToken extends Token implements java.io.Serializable {

    /**
     * (?(condition)yes-pattern|no-pattern)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ParenToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ClosureToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class CharToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ConcatToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class StringToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static private Token token_ccs = null;

    /**
     * Combing Character Sequence in Perl 5.6.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static protected void registerNonXS(String name) {

    /**
     * This method is called by only getRange().
     * So this method need not MT-safe.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    final int getMinLength() {

    /**
     * How many characters are needed?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    int size() {

    /**
     * A number of children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
class Token implements java.io.Serializable {

/**
 * This class represents a node in parse tree.
 *
 * @xerces.internal
 *
 * @version $Id: Token.java,v 1.7 2010/07/27 05:02:34 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public static final Token newToken(int ofKind)

  /**
   * Returns a new Token object, by default. However, if you want, you
   * can create and return subclass objects based on the value of ofKind.
   * Simply add the cases to the switch for all those special cases.
   * For example, if you have a subclass of Token called IDToken that
   * you want to create if ofKind is ID, simlpy add something like :
   *
   *    case MyParserConstants.ID : return new IDToken();
   *
   * to the following switch statement. Then you can cast matchedToken
   * variable to the appropriate type and use it in your lexical actions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public final String toString()

  /**
   * Returns the image.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public Token specialToken;

  /**
   * This field is used to access special tokens that occur prior to this
   * token, but after the immediately preceding regular (non-special) token.
   * If there are no such special tokens, this field is set to null.
   * When there are more than one such special token, this field refers
   * to the last of these special tokens, which in turn refers to the next
   * previous special token through its specialToken field, and so on
   * until the first special token (whose specialToken field is null).
   * The next fields of special tokens refer to other special tokens that
   * immediately follow it (without an intervening regular token).  If there
   * is no such token, this field is null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public Token next;

  /**
   * A reference to the next regular (non-special) token from the input
   * stream.  If this is the last token from the input stream, or if the
   * token manager has not read tokens beyond this one, this field is
   * set to null.  This is true only if this token is also a regular
   * token.  Otherwise, see below for a description of the contents of
   * this field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public String image;

  /**
   * The string image of the token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public int beginLine, beginColumn, endLine, endColumn;

  /**
   * beginLine and beginColumn describe the position of the first character
   * of this token; endLine and endColumn describe the position of the
   * last character of this token.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
  public int kind;

  /**
   * An integer that describes the kind of this token.  This numbering
   * system is determined by JavaCCParser, and a table of these numbers is
   * stored in the file ...Constants.java.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/IPAcl/Token.java
class Token {

/**
 * Describes the input token stream.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
        private void writeObject(ObjectOutputStream out) throws IOException {

        /**
         * @serialData Serialized fields. Convert the List to Vector for backward compatibility.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
        private static final ObjectStreamField[] serialPersistentFields =

        /**
         * @serialField children Vector children
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class UnionToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     * for UNION or CONCAT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ModifierToken extends Token implements java.io.Serializable {

    /**
     * (ims-ims: .... )
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ConditionToken extends Token implements java.io.Serializable {

    /**
     * (?(condition)yes-pattern|no-pattern)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ParenToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ClosureToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class CharToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class ConcatToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static class StringToken extends Token implements java.io.Serializable {

    /**
     * This class represents a node in parse tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static private Token token_ccs = null;

    /**
     * Combing Character Sequence in Perl 5.6.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    static protected void registerNonXS(String name) {

    /**
     * This method is called by only getRange().
     * So this method need not MT-safe.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    final int getMinLength() {

    /**
     * How many characters are needed?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
    int size() {

    /**
     * A number of children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/Token.java
class Token implements java.io.Serializable {

/**
 * This class represents a node in parse tree.
 *
 * @xerces.internal
 *
 * @version $Id: Token.java,v 1.7 2010/07/27 05:02:34 joehw Exp $
 */
