_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/KeyboardManager.java
    class ComponentKeyStrokePair {

    /**
      * This class is used to create keys for a hashtable
      * which looks up topContainers based on component, keystroke pairs
      * This is used to make unregistering KeyStrokes fast
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/KeyboardManager.java
    public boolean fireKeyboardAction(KeyEvent e, boolean pressed, Container topAncestor) {

    /**
      * This method is called when the focused component (and none of
      * its ancestors) want the key event.  This will look up the keystroke
      * to see if any chidren (or subchildren) of the specified container
      * want a crack at the event.
      * If one of them wants it, then it will "DO-THE-RIGHT-THING"
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/KeyboardManager.java
     private static Container getTopAncestor(JComponent c) {

     /**
       * Find the top focusable Window, Applet, or InternalFrame
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/KeyboardManager.java
     public void registerKeyStroke(KeyStroke k, JComponent c) {

    /**
      * register keystrokes here which are for the WHEN_IN_FOCUSED_WINDOW
      * case.
      * Other types of keystrokes will be handled by walking the hierarchy
      * That simplifies some potentially hairy stuff.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/KeyboardManager.java
    Hashtable<ComponentKeyStrokePair, Container> componentKeyStrokeMap = new Hashtable<ComponentKeyStrokePair, Container>();

    /**
      * Maps component/keystroke pairs to a topLevel container
      * This is mainly used for fast unregister operations
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/KeyboardManager.java
    Hashtable<Container, Hashtable> containerMap = new Hashtable<Container, Hashtable>();

    /**
      * maps top-level containers to a sub-hashtable full of keystrokes
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/KeyboardManager.java
class KeyboardManager {

/**
  * The KeyboardManager class is used to help dispatch keyboard actions for the
  * WHEN_IN_FOCUSED_WINDOW style actions.  Actions with other conditions are handled
  * directly in JComponent.
  *
  * Here's a description of the symantics of how keyboard dispatching should work
  * atleast as I understand it.
  *
  * KeyEvents are dispatched to the focused component.  The focus manager gets first
  * crack at processing this event.  If the focus manager doesn't want it, then
  * the JComponent calls super.processKeyEvent() this allows listeners a chance
  * to process the event.
  *
  * If none of the listeners "consumes" the event then the keybindings get a shot.
  * This is where things start to get interesting.  First, KeyStokes defined with the
  * WHEN_FOCUSED condition get a chance.  If none of these want the event, then the component
  * walks though it's parents looked for actions of type WHEN_ANCESTOR_OF_FOCUSED_COMPONENT.
  *
  * If no one has taken it yet, then it winds up here.  We then look for components registered
  * for WHEN_IN_FOCUSED_WINDOW events and fire to them.  Note that if none of those are found
  * then we pass the event to the menubars and let them have a crack at it.  They're handled differently.
  *
  * Lastly, we check if we're looking at an internal frame.  If we are and no one wanted the event
  * then we move up to the InternalFrame's creator and see if anyone wants the event (and so on and so on).
  *
  *
  * @see InputMap
  */
