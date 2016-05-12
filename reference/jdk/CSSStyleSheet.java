_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSStyleSheet.java
    public void deleteRule(int index)

    /**
     *  Used to delete a rule from the style sheet.
     * @param index  The index within the style sheet's rule list of the rule
     *   to remove.
     * @exception DOMException
     *   INDEX_SIZE_ERR: Raised if the specified index does not correspond to
     *   a rule in the style sheet's rule list.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this style sheet is
     *   readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSStyleSheet.java
    public int insertRule(String rule,
                          int index)

    /**
     *  Used to insert a new rule into the style sheet. The new rule now
     * becomes part of the cascade.
     * @param rule  The parsable text representing the rule. For rule sets
     *   this contains both the selector and the style declaration. For
     *   at-rules, this specifies both the at-identifier and the rule
     *   content.
     * @param index  The index within the style sheet's rule list of the rule
     *   before which to insert the specified rule. If the specified index
     *   is equal to the length of the style sheet's rule collection, the
     *   rule will be added to the end of the style sheet.
     * @return  The index within the style sheet's rule collection of the
     *   newly inserted rule.
     * @exception DOMException
     *   HIERARCHY_REQUEST_ERR: Raised if the rule cannot be inserted at the
     *   specified index e.g. if an <code>@import</code> rule is inserted
     *   after a standard rule set or other at-rule.
     *   <br>INDEX_SIZE_ERR: Raised if the specified index is not a valid
     *   insertion point.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this style sheet is
     *   readonly.
     *   <br>SYNTAX_ERR: Raised if the specified rule has a syntax error and
     *   is unparsable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSStyleSheet.java
    public CSSRuleList getCssRules();

    /**
     *  The list of all CSS rules contained within the style sheet. This
     * includes both rule sets and at-rules.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/CSSStyleSheet.java
public interface CSSStyleSheet extends StyleSheet {

/**
 *  The <code>CSSStyleSheet</code> interface is a concrete interface used to
 * represent a CSS style sheet i.e., a style sheet whose content type is
 * "text/css".
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
