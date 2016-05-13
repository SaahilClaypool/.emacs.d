_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void revertToPrevious();

  /// Revert to previous state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void changeState(State *p_new_state);

  /// Change current state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void Update();

  /// Update state machine (calling Execute() for current state).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  State *getGlobalState() const;

  /// Get global state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setGlobalState(State *p_new_state);

  /// Set global state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  State *getPreviousState() const;

  /// Get previous state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setPreviousState(State *p_new_state);

  /// Set previous state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  State *getState() const;

  /// Get current state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setState(State *p_new_state);

  /// Set current state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  Object *getOwner() const;

  /// Get owner of state machine.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setOwner(Object *p_new_owner);

  /// Set owner of state machine.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
 public:

  Object *p_owner;         /// Owner of this state machine.
  State *p_state;          /// Current state.
  State *p_previous_state; /// Previous state.
  State *p_global_state;   /// Global state (reachable from any state).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
#ifndef STATEMACHINE_H

///
/// A finite state machine.
///
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void revertToPrevious();

  /// Revert to previous state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void changeState(State *p_new_state);

  /// Change current state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void Update();

  /// Update state machine (calling Execute() for current state).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  State *getGlobalState() const;

  /// Get global state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setGlobalState(State *p_new_state);

  /// Set global state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  State *getPreviousState() const;

  /// Get previous state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setPreviousState(State *p_new_state);

  /// Set previous state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  State *getState() const;

  /// Get current state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setState(State *p_new_state);

  /// Set current state.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  Object *getOwner() const;

  /// Get owner of state machine.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
  void setOwner(Object *p_new_owner);

  /// Set owner of state machine.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
 public:

  Object *p_owner;         /// Owner of this state machine.
  State *p_state;          /// Current state.
  State *p_previous_state; /// Previous state.
  State *p_global_state;   /// Global state (reachable from any state).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//StateMachine.h
#ifndef STATEMACHINE_H

///
/// A finite state machine.
///
