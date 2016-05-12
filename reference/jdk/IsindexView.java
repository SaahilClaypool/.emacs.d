_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/IsindexView.java
    public void actionPerformed(ActionEvent evt) {

    /**
     * Responsible for processing the ActionEvent.
     * In this case this is hitting enter/return
     * in the text field.  This will construct the
     * URL from the base URL of the document.
     * To the URL is appended a '?' followed by the
     * contents of the JTextField.  The search
     * contents are URLEncoded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/IsindexView.java
    public Component createComponent() {

    /**
     * Creates the components necessary to to implement
     * this view.  The component returned is a <code>JPanel</code>,
     * that contains the PROMPT to the left and <code>JTextField</code>
     * to the right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/IsindexView.java
    public IsindexView(Element elem) {

    /**
     * Creates an IsindexView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/IsindexView.java
class IsindexView extends ComponentView implements ActionListener {

/**
 * A view that supports the &lt;ISINDEX&lt; tag.  This is implemented
 * as a JPanel that contains
 *
 * @author Sunita Mani
 */
