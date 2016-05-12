_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    int decodeEscaped() throws ParseException {

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    protected RangeToken parseSetOperations() throws ParseException {

    /**
     * '(?[' ... ']' (('-' | '+' | '&') '[' ... ']')? ')'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    protected RangeToken parseCharacterClass(boolean useNrange) throws ParseException {

    /**
     * char-class ::= '[' ( '^'? range ','?)+ ']'
     * range ::= '\d' | '\w' | '\s' | category-block | range-char
     *           | range-char '-' range-char
     * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2
     * bmp-code ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
          case T_LBRACKET:      return this.parseCharacterClass(true);

            /**
             * char-class ::= '[' ( '^'? range ','?)+ ']'
             * range ::= '\d' | '\w' | '\s' | category-block | range-char
             *           | range-char '-' range-char
             * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2
             * bmp-char ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseAtom() throws ParseException {

    /**
     * atom ::= char | '.' | char-class | '(' regex ')' | '(?:' regex ')' | '\' [0-9]
     *          | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block
     *          | '(?>' regex ')'
     * char ::= '\\' | '\' [efnrt] | bmp-code | character-1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseFactor() throws ParseException {

    /**
     * factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>'
     *            | atom (('*' | '+' | '?' | minmax ) '?'? )?)
     *            | '(?=' regex ')'  | '(?!' regex ')'  | '(?&lt;=' regex ')'  | '(?&lt;!' regex ')'
     *            | '(?#' [^)]* ')'
     * minmax ::= '{' min (',' max?)? '}'
     * min ::= [0-9]+
     * max ::= [0-9]+
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseTerm() throws ParseException {

    /**
     * term ::= factor+
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseRegex() throws ParseException {

    /**
     * regex ::= term (`|` term)*
     * term ::= factor+
     * factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>'
     *            | atom (('*' | '+' | '?' | minmax ) '?'? )?)
     *            | '(?=' regex ')'  | '(?!' regex ')'  | '(?&lt;=' regex ')'  | '(?&lt;!' regex ')'
     * atom ::= char | '.' | range | '(' regex ')' | '(?:' regex ')' | '\' [0-9]
     *          | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
class RegexParser {

/**
 * A Regular Expression Parser.
 *
 * @xerces.internal
 *
 * @version $Id: RegexParser.java,v 1.8 2010-11-01 04:39:54 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    int decodeEscaped() throws ParseException {

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    protected RangeToken parseSetOperations() throws ParseException {

    /**
     * '(?[' ... ']' (('-' | '+' | '&') '[' ... ']')? ')'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    protected RangeToken parseCharacterClass(boolean useNrange) throws ParseException {

    /**
     * char-class ::= '[' ( '^'? range ','?)+ ']'
     * range ::= '\d' | '\w' | '\s' | category-block | range-char
     *           | range-char '-' range-char
     * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2
     * bmp-code ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
          case T_LBRACKET:      return this.parseCharacterClass(true);

            /**
             * char-class ::= '[' ( '^'? range ','?)+ ']'
             * range ::= '\d' | '\w' | '\s' | category-block | range-char
             *           | range-char '-' range-char
             * range-char ::= '\[' | '\]' | '\\' | '\' [,-efnrtv] | bmp-code | character-2
             * bmp-char ::= '\' 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseAtom() throws ParseException {

    /**
     * atom ::= char | '.' | char-class | '(' regex ')' | '(?:' regex ')' | '\' [0-9]
     *          | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block
     *          | '(?>' regex ')'
     * char ::= '\\' | '\' [efnrt] | bmp-code | character-1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseFactor() throws ParseException {

    /**
     * factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>'
     *            | atom (('*' | '+' | '?' | minmax ) '?'? )?)
     *            | '(?=' regex ')'  | '(?!' regex ')'  | '(?&lt;=' regex ')'  | '(?&lt;!' regex ')'
     *            | '(?#' [^)]* ')'
     * minmax ::= '{' min (',' max?)? '}'
     * min ::= [0-9]+
     * max ::= [0-9]+
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseTerm() throws ParseException {

    /**
     * term ::= factor+
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
    Token parseRegex() throws ParseException {

    /**
     * regex ::= term (`|` term)*
     * term ::= factor+
     * factor ::= ('^' | '$' | '\A' | '\Z' | '\z' | '\b' | '\B' | '\<' | '\>'
     *            | atom (('*' | '+' | '?' | minmax ) '?'? )?)
     *            | '(?=' regex ')'  | '(?!' regex ')'  | '(?&lt;=' regex ')'  | '(?&lt;!' regex ')'
     * atom ::= char | '.' | range | '(' regex ')' | '(?:' regex ')' | '\' [0-9]
     *          | '\w' | '\W' | '\d' | '\D' | '\s' | '\S' | category-block
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/RegexParser.java
class RegexParser {

/**
 * A Regular Expression Parser.
 *
 * @xerces.internal
 *
 * @version $Id: RegexParser.java,v 1.8 2010-11-01 04:39:54 joehw Exp $
 */
