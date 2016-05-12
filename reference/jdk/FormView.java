_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private class BrowseFileAction implements ActionListener {

    /**
     * BrowseFileAction is used for input type == file. When the user
     * clicks the button a JFileChooser is brought up allowing the user
     * to select a file in the file system. The resulting path to the selected
     * file is set in the text field (actually an instance of Document).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    void resetForm() {

    /**
     * Resets the form
     * to its initial state by reinitializing the models
     * associated with each form element to their initial
     * values.
     *
     * param elem the element that triggered the reset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    boolean isLastTextOrPasswordField() {

    /**
     * Iterates over the element hierarchy to determine if
     * the element parameter, which is assumed to be an
     * &lt;INPUT&gt; element of type password or text, is the last
     * one of either kind, in the form to which it belongs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private boolean isControl(Element elem) {

    /**
     * Returns true if the Element <code>elem</code> represents a control.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private void appendBuffer(StringBuilder buffer, String name, String value) {

    /**
     * Appends name / value pairs into the
     * buffer.  Both names and values are encoded using the
     * URLEncoder.encode() method before being added to the
     * buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private void loadSelectData(AttributeSet attr, StringBuilder buffer) {

    /**
     * Loads the buffer with the data associated with the Select
     * form element.  Basically, only items that are selected
     * and have their name attribute set are added to the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private String getTextAreaData(AttributeSet attr) {

    /**
     * Returns the data associated with the &lt;TEXTAREA&gt; form
     * element.  This is done by getting the text stored in the
     * Document model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private String getInputElementData(AttributeSet attr) {

    /**
     * Returns the data associated with an &lt;INPUT&gt; form
     * element.  The value of "type" attributes is
     * used to determine the type of the model associated
     * with the element and then the relevant data is
     * extracted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private void loadElementDataIntoBuffer(Element elem, StringBuilder buffer) {

    /**
     * Loads the data
     * associated with the element into the buffer.
     * The format in which data is appended depends
     * on the type of the form element.  Essentially
     * data is loaded in name/value pairs.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private void getFormData(StringBuilder buffer) {

    /**
     * Iterates over the
     * element hierarchy, extracting data from the
     * models associated with the relevant form elements.
     * "Relevant" means the form elements that are part
     * of the same form whose element triggered the submit
     * action.
     *
     * @param buffer        the buffer that contains that data to submit
     * @param targetElement the element that triggered the
     *                      form submission
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    /**

    /**
     * The following methods provide functionality required to
     * iterate over a the elements of the form and in the case
     * of a form submission, extract the data from each model
     * that is associated with each form element, and in the
     * case of reset, reinitialize the each model to its
     * initial state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private String getImageData(Point point) {

    /**
     * Extracts the value of the name attribute
     * associated with the input element of type
     * image.  If name is defined it is encoded using
     * the URLEncoder.encode() method and the
     * image data is returned in the following format:
     *      name + ".x" +"="+ x +"&"+ name +".y"+"="+ y
     * otherwise,
     *      "x="+ x +"&y="+ y
     *
     * @param point associated with the mouse click.
     * @return the image data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    protected void imageSubmit(String imageData) {

    /**
     * This method is called to submit a form in response
     * to a click on an image -- an &lt;INPUT&gt; form
     * element of type "image".
     *
     * @param imageData the mouse click coordinates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    protected class MouseEventListener extends MouseAdapter {

    /**
     * MouseEventListener class to handle form submissions when
     * an input with type equal to image is clicked on.
     * A MouseListener is necessary since along with the image
     * data the coordinates associated with the mouse click
     * need to be submitted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    protected void submitData(String data) {

    /**
     * This method is responsible for submitting the form data.
     * A thread is forked to undertake the submission.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    public void actionPerformed(ActionEvent evt) {

    /**
     * Responsible for processing the ActionEvent.
     * If the element associated with the FormView,
     * has a type of "submit", "reset", "text" or "password"
     * then the action is processed.  In the case of a "submit"
     * the form is submitted.  In the case of a "reset"
     * the form is reset to its original state.
     * In the case of "text" or "password", if the
     * element is the last one of type "text" or "password",
     * the form is submitted.  Otherwise, focus is transferred
     * to the next component in the form.
     *
     * @param evt the ActionEvent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    public float getMaximumSpan(int axis) {

    /**
     * Determines the maximum span for this view along an
     * axis. For certain components, the maximum and preferred span are the
     * same. For others this will return the value
     * returned by Component.getMaximumSize along the
     * axis of interest.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return   the span the view would like to be rendered into &gt;= 0.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     * @exception IllegalArgumentException for an invalid axis
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private JComponent createInputComponent(AttributeSet attr, Object model) {

    /**
     * Creates a component for an &lt;INPUT&gt; element based on the
     * value of the "type" attribute.
     *
     * @param set of attributes associated with the &lt;INPUT&gt; element.
     * @param model the value of the StyleConstants.ModelAttribute
     * @return the component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    protected Component createComponent() {

    /**
     * Create the component.  This is basically a
     * big switch statement based upon the tag type
     * and html attributes of the associated element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    public FormView(Element elem) {

    /**
     * Creates a new FormView object.
     *
     * @param elem the element to decorate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    private short maxIsPreferred;

    /**
     * Used to indicate if the maximum span should be the same as the
     * preferred span. This is used so that the Component's size doesn't
     * change if there is extra room on a line. The first bit is used for
     * the X direction, and the second for the y direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    final static String PostDataProperty = "javax.swing.JEditorPane.postdata";

    /**
     * Document attribute name for storing POST data. JEditorPane.getPostData()
     * uses the same name, should be kept in sync.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    @Deprecated

    /**
     * If a value attribute is not specified for a FORM input element
     * of type "reset", then this default string is used.
     *
     * @deprecated As of 1.3, value comes from UIManager UIManager property
     *             FormView.resetButtonText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
    @Deprecated

    /**
     * If a value attribute is not specified for a FORM input element
     * of type "submit", then this default string is used.
     *
     * @deprecated As of 1.3, value now comes from UIManager property
     *             FormView.submitButtonText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormView.java
public class FormView extends ComponentView implements ActionListener {

/**
 * Component decorator that implements the view interface
 * for form elements, &lt;input&gt;, &lt;textarea&gt;,
 * and &lt;select&gt;.  The model for the component is stored
 * as an attribute of the the element (using StyleConstants.ModelAttribute),
 * and is used to build the component of the view.  The type
 * of the model is assumed to of the type that would be set by
 * <code>HTMLDocument.HTMLReader.FormAction</code>.  If there are
 * multiple views mapped over the document, they will share the
 * embedded component models.
 * <p>
 * The following table shows what components get built
 * by this view.
 * <table summary="shows what components get built by this view">
 * <tr>
 *   <th>Element Type</th>
 *   <th>Component built</th>
 * </tr>
 * <tr>
 *   <td>input, type button</td>
 *   <td>JButton</td>
 * </tr>
 * <tr>
 *   <td>input, type checkbox</td>
 *   <td>JCheckBox</td>
 * </tr>
 * <tr>
 *   <td>input, type image</td>
 *   <td>JButton</td>
 * </tr>
 * <tr>
 *   <td>input, type password</td>
 *   <td>JPasswordField</td>
 * </tr>
 * <tr>
 *   <td>input, type radio</td>
 *   <td>JRadioButton</td>
 * </tr>
 * <tr>
 *   <td>input, type reset</td>
 *   <td>JButton</td>
 * </tr>
 * <tr>
 *   <td>input, type submit</td>
 *   <td>JButton</td>
 * </tr>
 * <tr>
 *   <td>input, type text</td>
 *   <td>JTextField</td>
 * </tr>
 * <tr>
 *   <td>select, size &gt; 1 or multiple attribute defined</td>
 *   <td>JList in a JScrollPane</td>
 * </tr>
 * <tr>
 *   <td>select, size unspecified or 1</td>
 *   <td>JComboBox</td>
 * </tr>
 * <tr>
 *   <td>textarea</td>
 *   <td>JTextArea in a JScrollPane</td>
 * </tr>
 * <tr>
 *   <td>input, type file</td>
 *   <td>JTextField</td>
 * </tr>
 * </table>
 *
 * @author Timothy Prinzing
 * @author Sunita Mani
 */
