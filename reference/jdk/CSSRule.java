_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public CSSRule getParentRule();

    /**
     *  If this rule is contained inside another rule (e.g. a style rule
     * inside an @media block), this is the containing rule. If this rule is
     * not nested inside any other rules, this returns <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public CSSStyleSheet getParentStyleSheet();

    /**
     *  The style sheet that contains this rule.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public String getCssText();

    /**
     *  The parsable textual representation of the rule. This reflects the
     * current state of the rule and not its initial value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public short getType();

    /**
     *  The type of the rule, as defined above. The expectation is that
     * binding-specific casting methods can be used to cast down from an
     * instance of the <code>CSSRule</code> interface to the specific
     * derived interface implied by the <code>type</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public static final short PAGE_RULE                 = 6;

    /**
     * The rule is a <code>CSSPageRule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public static final short MEDIA_RULE                = 4;

    /**
     * The rule is a <code>CSSMediaRule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public static final short CHARSET_RULE              = 2;

    /**
     * The rule is a <code>CSSCharsetRule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
    public static final short UNKNOWN_RULE              = 0;

    /**
     * The rule is a <code>CSSUnknownRule</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSRule.java
public interface CSSRule {

/**
 *  The <code>CSSRule</code> interface is the abstract base interface for any
 * type of CSS statement. This includes both rule sets and at-rules. An
 * implementation is expected to preserve all rules specified in a CSS style
 * sheet, even if the rule is not recognized by the parser. Unrecognized
 * rules are represented using the <code>CSSUnknownRule</code> interface.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
