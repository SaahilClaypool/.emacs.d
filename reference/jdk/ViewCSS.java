_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/css/ViewCSS.java
public interface ViewCSS extends AbstractView {

/**
 *  This interface represents a CSS view. The <code>getComputedStyle</code>
 * method provides a read only access to the computed values of an element.
 * <p> The expectation is that an instance of the <code>ViewCSS</code>
 * interface can be obtained by using binding-specific casting methods on an
 * instance of the <code>AbstractView</code> interface.
 * <p> Since a computed style is related to an <code>Element</code> node, if
 * this element is removed from the document, the associated
 * <code>CSSStyleDeclaration</code> and <code>CSSValue</code> related to
 * this declaration are no longer valid.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
