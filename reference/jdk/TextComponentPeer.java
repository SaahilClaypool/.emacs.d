_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    InputMethodRequests getInputMethodRequests();

    /**
     * Returns the input method requests.
     *
     * @return the input method requests
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    int getCaretPosition();

    /**
     * Returns the current caret position.
     *
     * @return the current caret position
     *
     * @see TextComponent#getCaretPosition()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void setCaretPosition(int pos);

    /**
     * Sets the caret position of the text component.
     *
     * @param pos the caret position to set
     *
     * @see TextComponent#setCaretPosition(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void select(int selStart, int selEnd);

    /**
     * Selects an area of the text component.
     *
     * @param selStart the start index of the new selection
     * @param selEnd the end index of the new selection
     *
     * @see TextComponent#select(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    int getSelectionEnd();

    /**
     * Returns the end index of the current selection.
     *
     * @return the end index of the current selection
     *
     * @see TextComponent#getSelectionEnd()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    int getSelectionStart();

    /**
     * Returns the start index of the current selection.
     *
     * @return the start index of the current selection
     *
     * @see TextComponent#getSelectionStart()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void setText(String text);

    /**
     * Sets the content for the text component.
     *
     * @param text the content to set
     *
     * @see TextComponent#setText(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    String getText();

    /**
     * Returns the current content of the text component.
     *
     * @return the current content of the text component
     *
     * @see TextComponent#getText()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void setEditable(boolean editable);

    /**
     * Sets if the text component should be editable or not.
     *
     * @param editable {@code true} for editable text components,
     *        {@code false} for non-editable text components
     *
     * @see TextComponent#setEditable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
public interface TextComponentPeer extends ComponentPeer {

/**
 * The peer interface for {@link TextComponent}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    InputMethodRequests getInputMethodRequests();

    /**
     * Returns the input method requests.
     *
     * @return the input method requests
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    int getCaretPosition();

    /**
     * Returns the current caret position.
     *
     * @return the current caret position
     *
     * @see TextComponent#getCaretPosition()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void setCaretPosition(int pos);

    /**
     * Sets the caret position of the text component.
     *
     * @param pos the caret position to set
     *
     * @see TextComponent#setCaretPosition(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void select(int selStart, int selEnd);

    /**
     * Selects an area of the text component.
     *
     * @param selStart the start index of the new selection
     * @param selEnd the end index of the new selection
     *
     * @see TextComponent#select(int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    int getSelectionEnd();

    /**
     * Returns the end index of the current selection.
     *
     * @return the end index of the current selection
     *
     * @see TextComponent#getSelectionEnd()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    int getSelectionStart();

    /**
     * Returns the start index of the current selection.
     *
     * @return the start index of the current selection
     *
     * @see TextComponent#getSelectionStart()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void setText(String text);

    /**
     * Sets the content for the text component.
     *
     * @param text the content to set
     *
     * @see TextComponent#setText(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    String getText();

    /**
     * Returns the current content of the text component.
     *
     * @return the current content of the text component
     *
     * @see TextComponent#getText()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
    void setEditable(boolean editable);

    /**
     * Sets if the text component should be editable or not.
     *
     * @param editable {@code true} for editable text components,
     *        {@code false} for non-editable text components
     *
     * @see TextComponent#setEditable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/peer/TextComponentPeer.java
public interface TextComponentPeer extends ComponentPeer {

/**
 * The peer interface for {@link TextComponent}.
 *
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
