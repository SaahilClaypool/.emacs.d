_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleHypertext.java
    public abstract int getLinkIndex(int charIndex);

    /**
     * Returns the index into an array of hyperlinks that
     * is associated with this character index, or -1 if there
     * is no hyperlink associated with this index.
     *
     * @param charIndex index within the text
     * @return index into the set of hyperlinks for this hypertext doc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleHypertext.java
    public abstract AccessibleHyperlink getLink(int linkIndex);

    /**
     * Returns the nth Link of this Hypertext document.
     *
     * @param linkIndex within the links of this Hypertext
     * @return Link object encapsulating the nth link(s)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleHypertext.java
    public abstract int getLinkCount();

    /**
     * Returns the number of links within this hypertext document.
     *
     * @return number of links in this hypertext doc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleHypertext.java
public interface AccessibleHypertext extends AccessibleText {

/**
 * <P>The AccessibleHypertext class is the base class for all
 * classes that present hypertext information on the display.  This class
 * provides the standard mechanism for an assistive technology to access
 * that text via its content, attributes, and spatial location.
 * It also provides standard mechanisms for manipulating hyperlinks.
 * Applications can determine if an object supports the AccessibleHypertext
 * interface by first obtaining its AccessibleContext (see {@link Accessible})
 * and then calling the {@link AccessibleContext#getAccessibleText}
 * method of AccessibleContext.  If the return value is a class which extends
 * AccessibleHypertext, then that object supports AccessibleHypertext.
 *
 * @see Accessible
 * @see Accessible#getAccessibleContext
 * @see AccessibleContext
 * @see AccessibleText
 * @see AccessibleContext#getAccessibleText
 *
 * @author      Peter Korn
 */
