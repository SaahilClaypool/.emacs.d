_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Clock.h
  long int split() const;

  /// Return time elapsed since delta() was called, -1 if error.
  /// Units are microseconds.
  /// Return -1 if error.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Clock.h
  long int delta();

  /// Return time elapsed since delta() was called, -1 if error.
  /// Units are microseconds.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Clock.h
  Clock();

  /// Sets previous_time to current time.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Clock.h
 public:

  long int previous_time;  /// Previous time delta() called (in microseconds).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Clock.h
#ifndef __CLOCK_H__

///
/// The clock, for timing
///
