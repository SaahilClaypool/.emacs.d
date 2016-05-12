_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/ParserForXMLSchema.java
    protected RangeToken parseCharacterClass(boolean useNrange) throws ParseException {

    /**
     * Parses a character-class-expression, not a character-class-escape.
     *
     * c-c-expression   ::= '[' c-group ']'
     * c-group          ::= positive-c-group | negative-c-group | c-c-subtraction
     * positive-c-group ::= (c-range | c-c-escape)+
     * negative-c-group ::= '^' positive-c-group
     * c-c-subtraction  ::= (positive-c-group | negative-c-group) subtraction
     * subtraction      ::= '-' c-c-expression
     * c-range          ::= single-range | from-to-range
     * single-range     ::= multi-c-escape | category-c-escape | block-c-escape | &lt;any XML char&gt;
     * cc-normal-c      ::= &lt;any character except [, ], \&gt;
     * from-to-range    ::= cc-normal-c '-' cc-normal-c
     *
     * @param useNrage Ignored.
     * @return This returns no NrageToken.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/ParserForXMLSchema.java
class ParserForXMLSchema extends RegexParser {

/**
 * A regular expression parser for the XML Schema.
 *
 * @xerces.internal
 *
 * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;
 * @version $Id: ParserForXMLSchema.java,v 1.9 2010-11-12 18:09:45 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/ParserForXMLSchema.java
    protected RangeToken parseCharacterClass(boolean useNrange) throws ParseException {

    /**
     * Parses a character-class-expression, not a character-class-escape.
     *
     * c-c-expression   ::= '[' c-group ']'
     * c-group          ::= positive-c-group | negative-c-group | c-c-subtraction
     * positive-c-group ::= (c-range | c-c-escape)+
     * negative-c-group ::= '^' positive-c-group
     * c-c-subtraction  ::= (positive-c-group | negative-c-group) subtraction
     * subtraction      ::= '-' c-c-expression
     * c-range          ::= single-range | from-to-range
     * single-range     ::= multi-c-escape | category-c-escape | block-c-escape | &lt;any XML char&gt;
     * cc-normal-c      ::= &lt;any character except [, ], \&gt;
     * from-to-range    ::= cc-normal-c '-' cc-normal-c
     *
     * @param useNrage Ignored.
     * @return This returns no NrageToken.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/regex/ParserForXMLSchema.java
class ParserForXMLSchema extends RegexParser {

/**
 * A regular expression parser for the XML Schema.
 *
 * @xerces.internal
 *
 * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt;
 * @version $Id: ParserForXMLSchema.java,v 1.9 2010-11-12 18:09:45 joehw Exp $
 */
