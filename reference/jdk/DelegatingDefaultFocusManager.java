_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DelegatingDefaultFocusManager.java
final class DelegatingDefaultFocusManager extends DefaultFocusManager {

/**
 * Provides a javax.swing.DefaultFocusManager view onto an arbitrary
 * java.awt.KeyboardFocusManager. We subclass DefaultFocusManager instead of
 * FocusManager because it seems more backward-compatible. It is likely that
 * some pre-1.4 code assumes that the object returned by
 * FocusManager.getCurrentManager is an instance of DefaultFocusManager unless
 * set explicitly.
 */
