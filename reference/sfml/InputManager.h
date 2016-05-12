_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//InputManager.h
  void getInput();

  /// Get input from the keyboard and mouse.
  /// Pass event along to all interested Objects.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//InputManager.h
  void shutDown();

  /// Revert back to normal window mode.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//InputManager.h
  int startUp();

  /// Get window ready to capture input.  
  /// Return 0 if ok, else return -1;
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//InputManager.h
  bool isValid(std::string event_type) const;

  /// Input manager only accepts keyboard and mouse events.
  /// Return false if not one of them.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//InputManager.h
 public:

  InputManager();                      ///< Private since a singleton.
  InputManager (InputManager const&);  ///< Don't allow copy.
  void operator=(InputManager const&); ///< Don't allow assignment.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//InputManager.h
#ifndef __INPUT_MANAGER_H__

///
/// The SFML input manager
///
