_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormSubmitEvent.java
    public String getData() {

    /**
     * Gets the form submission data.
     *
     * @return the string representing the form submission data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormSubmitEvent.java
    public MethodType getMethod() {

    /**
     * Gets the form method type.
     *
     * @return the form method type, either
     * <code>Method.GET</code> or <code>Method.POST</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormSubmitEvent.java
    FormSubmitEvent(Object source, EventType type, URL targetURL,
                   Element sourceElement, String targetFrame,
                    MethodType method, String data) {

    /**
     * Creates a new object representing an html form submit event.
     *
     * @param source the object responsible for the event
     * @param type the event type
     * @param actionURL the form action URL
     * @param sourceElement the element that corresponds to the source
     *                      of the event
     * @param targetFrame the Frame to display the document in
     * @param method the form method type
     * @param data the form submission data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormSubmitEvent.java
    public enum MethodType { GET, POST };

    /**
     * Represents an HTML form method type.
     * <UL>
     * <LI><code>GET</code> corresponds to the GET form method</LI>
     * <LI><code>POST</code> corresponds to the POST from method</LI>
     * </UL>
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FormSubmitEvent.java
public class FormSubmitEvent extends HTMLFrameHyperlinkEvent {

/**
 * FormSubmitEvent is used to notify interested
 * parties that a form was submitted.
 *
 * @since 1.5
 * @author    Denis Sharypov
 */
