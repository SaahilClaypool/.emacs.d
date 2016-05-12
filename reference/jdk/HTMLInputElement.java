_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public void click();

    /**
     *  Simulate a mouse-click. For <code>INPUT</code> elements whose
     * <code>type</code> attribute has one of the following values: "Button",
     * "Checkbox", "Radio", "Reset", or "Submit".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public void select();

    /**
     *  Select the contents of the text area. For <code>INPUT</code> elements
     * whose <code>type</code> attribute has one of the following values:
     * "Text", "File", or "Password".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public void focus();

    /**
     *  Gives keyboard focus to this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public void blur();

    /**
     *  Removes keyboard focus from this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getValue();

    /**
     *  When the <code>type</code> attribute of the element has the value
     * "Text", "File" or "Password", this represents the current contents of
     * the corresponding form control, in an interactive user agent. Changing
     * this attribute changes the contents of the form control, but does not
     * change the value of the HTML value attribute of the element. When the
     * <code>type</code> attribute of the element has the value "Button",
     * "Hidden", "Submit", "Reset", "Image", "Checkbox" or "Radio", this
     * represents the HTML value attribute of the element. See the  value
     * attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getUseMap();

    /**
     *  Use client-side image map. See the  usemap attribute definition in
     * HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getType();

    /**
     *  The type of control created. See the  type attribute definition in
     * HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public int getTabIndex();

    /**
     *  Index that represents the element's position in the tabbing order. See
     * the  tabindex attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getSrc();

    /**
     *  When the <code>type</code> attribute has the value "Image", this
     * attribute specifies the location of the image to be used to decorate
     * the graphical submit button. See the  src attribute definition in HTML
     * 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getSize();

    /**
     *  Size information. The precise meaning is specific to each type of
     * field.  See the  size attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public boolean getReadOnly();

    /**
     *  This control is read-only. Relevant only when <code>type</code> has
     * the value "Text" or "Password". See the  readonly attribute definition
     * in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getName();

    /**
     *  Form control or object name when submitted with a form. See the  name
     * attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public int getMaxLength();

    /**
     *  Maximum number of characters for text fields, when <code>type</code>
     * has the value "Text" or "Password". See the  maxlength attribute
     * definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public boolean getDisabled();

    /**
     *  The control is unavailable in this context. See the  disabled
     * attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public boolean getChecked();

    /**
     *  When the <code>type</code> attribute of the element has the value
     * "Radio" or "Checkbox", this represents the current state of the form
     * control, in an interactive user agent. Changes to this attribute
     * change the state of the form control, but do not change the value of
     * the HTML value attribute of the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getAlt();

    /**
     *  Alternate text for user agents not rendering the normal content of
     * this element. See the  alt attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getAlign();

    /**
     *  Aligns this object (vertically or horizontally)  with respect to its
     * surrounding text. See the  align attribute definition in HTML 4.0.
     * This attribute is deprecated in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getAccessKey();

    /**
     *  A single character access key to give access to the form control. See
     * the  accesskey attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public String getAccept();

    /**
     *  A comma-separated list of content types that a server processing this
     * form will handle correctly. See the  accept attribute definition in
     * HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public HTMLFormElement getForm();

    /**
     *  Returns the <code>FORM</code> element containing this control. Returns
     * <code>null</code> if this control is not within the context of a form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
    public boolean getDefaultChecked();

    /**
     *  When <code>type</code> has the value "Radio" or "Checkbox", this
     * represents the HTML checked attribute of the element. The value of
     * this attribute does not change if the state of the corresponding form
     * control, in an interactive user agent, changes. Changes to this
     * attribute, however, resets the state of the form control. See the
     * checked attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLInputElement.java
public interface HTMLInputElement extends HTMLElement {

/**
 *  Form control.  Note. Depending upon the environment in which the page is
 * being viewed, the value property may be read-only for the file upload
 * input type. For the "password" input type, the actual value returned may
 * be masked to prevent unauthorized use. See the  INPUT element definition
 * in HTML 4.0.
 * <p>See also the <a href='http://www.w3.org/TR/2000/CR-DOM-Level-2-20000510'>Document Object Model (DOM) Level 2 Specification</a>.
 */
