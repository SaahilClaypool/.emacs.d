_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
  EventKeyboardAction getKeyboardAction() const;

  /// Get keyboard event action.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
  void setKeyboardAction(EventKeyboardAction new_action);

  /// Set keyboard event action.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
  Keyboard::Key getKey() const;

  /// Get key from event.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
  void setKey(Keyboard::Key new_key);

  /// Set key in event.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
 public:

  Keyboard::Key key_val;	          ///< Key value.
  EventKeyboardAction keyboard_action;    ///< Key action.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
enum Key {

/// Keys Dragonfly recognizes.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
namespace Keyboard {

/// Keyboard namespace.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
};

  UNDEFINED_KEYBOARD_ACTION = -1, ///< Undefined
  KEY_PRESSED,			  ///< Was down
  KEY_RELEASED,			  ///< Was released
  KEY_DOWN,			  ///< Is down
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
enum EventKeyboardAction {

/// Types of keyboard actions Dragonfly recognizes.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventKeyboard.h
#ifndef __EVENT_KEYBOARD_H__

///
/// A "keyboard" event
/// 
