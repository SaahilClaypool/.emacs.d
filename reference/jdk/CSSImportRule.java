_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSImportRule.java
    public CSSStyleSheet getStyleSheet();

    /**
     * The style sheet referred to by this rule, if it has been loaded. The
     * value of this attribute is <code>null</code> if the style sheet has
     * not yet been loaded or if it will not be loaded (e.g. if the style
     * sheet is for a media type not supported by the user agent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSImportRule.java
    public MediaList getMedia();

    /**
     *  A list of media types for which this style sheet may be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSImportRule.java
public interface CSSImportRule extends CSSRule {

/**
 *  The <code>CSSImportRule</code> interface represents a @import rule within
 * a CSS style sheet. The <code>@import</code> rule is used to import style
 * rules from other style sheets.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
