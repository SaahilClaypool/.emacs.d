_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/CommentView.java
    void _updateModelFromText() {

    /**
     * This is subclassed to put the text on the Comment attribute of
     * the Element's AttributeSet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/CommentView.java
class CommentView extends HiddenTagView {

/**
 * CommentView subclasses HiddenTagView to contain a JTextArea showing
 * a comment. When the textarea is edited the comment is
 * reset. As this inherits from EditableView if the JTextComponent is
 * not editable, the textarea will not be visible.
 *
 * @author  Scott Violet
 */
