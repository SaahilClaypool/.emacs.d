_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLElement.java
    public String getClassName();

    /**
     *  The class attribute of the element. This attribute has been renamed
     * due to conflicts with the "class" keyword exposed by many languages.
     * See the  class attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLElement.java
    public String getDir();

    /**
     *  Specifies the base direction of directionally neutral text and the
     * directionality of tables. See the  dir attribute definition in HTML
     * 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLElement.java
    public String getLang();

    /**
     *  Language code defined in RFC 1766. See the  lang attribute definition
     * in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLElement.java
    public String getTitle();

    /**
     *  The element's advisory title. See the  title attribute definition in
     * HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLElement.java
public interface HTMLElement extends Element {

/**
 *  All HTML element interfaces derive from this class. Elements that only
 * expose the HTML core attributes are represented by the base
 * <code>HTMLElement</code> interface. These elements are as follows:  HEAD
 * special: SUB, SUP, SPAN, BDO font: TT, I, B, U, S, STRIKE, BIG, SMALL
 * phrase: EM, STRONG, DFN, CODE, SAMP, KBD, VAR, CITE, ACRONYM, ABBR list:
 * DD, DT NOFRAMES, NOSCRIPT ADDRESS, CENTER The <code>style</code> attribute
 * of an HTML element is accessible through the
 * <code>ElementCSSInlineStyle</code> interface which is defined in the  .
 * <p>See also the <a href='http://www.w3.org/TR/2000/CR-DOM-Level-2-20000510'>Document Object Model (DOM) Level 2 Specification</a>.
 */
