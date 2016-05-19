_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Fraps.h
  void setLogFrameRate(bool new_do_frame_rate);

  /// Set whether log frame rate or not.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Fraps.h
  void setRecord(bool new_record);

  /// Set whether record or not.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Fraps.h
  int eventHandler(const Event *p_e);

  /// Handle event each step.
  /// Handle keyboard events:
  /// - f9 to show/hide
  /// - f11 to toggle logging frame rate
  /// - f12 to toggle recording
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Fraps.h
  Fraps(bool do_record=false);

  /// Frames per second meter (with option to record screen).
  /// defaults: TOP_RIGHT, green, don't record, don't log frame rate.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Fraps.h
 public:

  bool do_record;         ///< True if recording.
  bool do_frame_rate;	  ///< True if logging frame rate.
  Clock clock;            ///< For computing frame rate.
  FILE *p_screen;	  ///< Output file handle.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Fraps.h
#ifndef __FRAPS_H__

///
/// Fraps (FRAmes Per Second) recorder
/// 
