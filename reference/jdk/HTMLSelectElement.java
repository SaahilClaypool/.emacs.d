_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public void focus();

    /**
     *  Gives keyboard focus to this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public void blur();

    /**
     *  Removes keyboard focus from this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public void remove(int index);

    /**
     *  Remove an element from the collection of <code>OPTION</code> elements
     * for this <code>SELECT</code> . Does nothing if no element has the given
     *  index.
     * @param index  The index of the item to remove, starting from 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public void add(HTMLElement element,
                    HTMLElement before)

    /**
     *  Add a new element to the collection of <code>OPTION</code> elements
     * for this <code>SELECT</code> . This method is the equivalent of the
     * <code>appendChild</code> method of the <code>Node</code> interface if
     * the <code>before</code> parameter is <code>null</code> . It is
     * equivalent to the <code>insertBefore</code> method on the parent of
     * <code>before</code> in all other cases.
     * @param element  The element to add.
     * @param before  The element to insert before, or <code>null</code> for
     *   the tail of the list.
     * @exception DOMException
     *    NOT_FOUND_ERR: Raised if <code>before</code> is not a descendant of
     *   the <code>SELECT</code> element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public int getTabIndex();

    /**
     *  Index that represents the element's position in the tabbing order. See
     * the  tabindex attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public int getSize();

    /**
     *  Number of visible rows. See the  size attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public String getName();

    /**
     *  Form control or object name when submitted with a form. See the  name
     * attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public boolean getMultiple();

    /**
     *  If true, multiple <code>OPTION</code> elements may  be selected in
     * this <code>SELECT</code> . See the  multiple attribute definition in
     * HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public boolean getDisabled();

    /**
     *  The control is unavailable in this context. See the  disabled
     * attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public HTMLCollection getOptions();

    /**
     *  The collection of <code>OPTION</code> elements contained by this
     * element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public HTMLFormElement getForm();

    /**
     *  Returns the <code>FORM</code> element containing this control. Returns
     * <code>null</code> if this control is not within the context of a form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public int getLength();

    /**
     *  The number of options in this <code>SELECT</code> .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public String getValue();

    /**
     *  The current form control value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
    public int getSelectedIndex();

    /**
     *  The ordinal index of the selected option, starting from 0. The value
     * -1 is returned if no element is selected. If multiple options are
     * selected, the index of the first selected option is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLSelectElement.java
public interface HTMLSelectElement extends HTMLElement {

/**
 *  The select element allows the selection of an option. The contained
 * options can be directly accessed through the select element as a
 * collection. See the  SELECT element definition in HTML 4.0.
 * <p>See also the <a href='http://www.w3.org/TR/2000/CR-DOM-Level-2-20000510'>Document Object Model (DOM) Level 2 Specification</a>.
 */
