_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//State.h
  virtual void Exit(Object *p_obj);

  /// Invoked when state exited.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//State.h
  virtual void Execute(Object *p_obj)=0;

  /// Invoked every game loop step.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//State.h
  virtual void Enter(Object *p_obj);

  /// Invoked when state first entered.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//State.h
  std::string getType() const;

  /// Get name of state.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//State.h
  void setType(std::string new_type);

  /// Set name of state.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//State.h
 public:

  std::string state_type;      /// Name of state.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//State.h
#ifndef STATE_H

///
/// State.h
///
