_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return   the span the view would like to be rendered into &gt;= 0.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
    public int viewToModel(float fx, float fy, Shape a, Position.Bias[] bias) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param fx the X coordinate &gt;= 0.0f
     * @param fy the Y coordinate &gt;= 0.0f
     * @param a the allocated region to render into
     * @return the location within the model that best represents the
     *  given point in the view
     * @see View#viewToModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.
     *
     * @param pos the position to convert &gt;= 0
     * @param a the allocated region to render into
     * @return the bounding box of the given position
     * @exception BadLocationException  if the given position does not
     *   represent a valid location in the associated document
     * @see View#modelToView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
    protected int drawEchoCharacter(Graphics g, int x, int y, char c) {

    /**
     * Renders the echo character, or whatever graphic should be used
     * to display the password characters.  The color in the Graphics
     * object is set to the appropriate foreground color for selected
     * or unselected text.
     *
     * @param g the graphics context
     * @param x the starting X coordinate &gt;= 0
     * @param y the starting Y coordinate &gt;= 0
     * @param c the echo character
     * @return the updated X position &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
    protected int drawSelectedText(Graphics g, int x,
                                   int y, int p0, int p1) throws BadLocationException {

    /**
     * Renders the given range in the model as selected text.  This
     * is implemented to render the text in the color specified in
     * the hosting component.  It assumes the highlighter will render
     * the selected background.  Uses the result of getEchoChar() to
     * display the characters.
     *
     * @param g the graphics context
     * @param x the starting X coordinate &gt;= 0
     * @param y the starting Y coordinate &gt;= 0
     * @param p0 the starting offset in the model &gt;= 0
     * @param p1 the ending offset in the model &gt;= p0
     * @return the X location of the end of the range &gt;= 0
     * @exception BadLocationException if p0 or p1 are out of range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
    protected int drawUnselectedText(Graphics g, int x, int y,
                                     int p0, int p1) throws BadLocationException {

    /**
     * Renders the given range in the model as normal unselected
     * text.  This sets the foreground color and echos the characters
     * using the value returned by getEchoChar().
     *
     * @param g the graphics context
     * @param x the starting X coordinate &gt;= 0
     * @param y the starting Y coordinate &gt;= 0
     * @param p0 the starting offset in the model &gt;= 0
     * @param p1 the ending offset in the model &gt;= p0
     * @return the X location of the end of the range &gt;= 0
     * @exception BadLocationException if p0 or p1 are out of range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
    public PasswordView(Element elem) {

    /**
     * Constructs a new view wrapped on an element.
     *
     * @param elem the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/PasswordView.java
public class PasswordView extends FieldView {

/**
 * Implements a View suitable for use in JPasswordField
 * UI implementations.  This is basically a field ui that
 * renders its contents as the echo character specified
 * in the associated component (if it can narrow the
 * component to a JPasswordField).
 *
 * @author  Timothy Prinzing
 * @see     View
 */
