_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  bool getDelta() const;

  /// Get delta.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  void setDelta(bool new_delta);

  /// Set delta to new delta.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  int getValue() const;

  /// Get value.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  void setValue(int new_value);

  /// Set value to new value.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  std::string getTag() const;

  /// Get tag.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  void setTag(std::string new_tag);

  /// Set tag to new tag.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  EventView(std::string new_tag, int new_value, bool new_delta);

  /// Create view event with tag, value and delta as indicated.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
 public:

  std::string tag;     ///< Tag to associate.
  int value;	       ///< Value for view.
  bool delta;	       ///< True if change in value, else replace value
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
#ifndef __EVENT_VIEW_H__

///
/// A "view" event
///
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  bool getDelta() const;

  /// Get delta.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  void setDelta(bool new_delta);

  /// Set delta to new delta.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  int getValue() const;

  /// Get value.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  void setValue(int new_value);

  /// Set value to new value.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  std::string getTag() const;

  /// Get tag.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  void setTag(std::string new_tag);

  /// Set tag to new tag.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  EventView(std::string new_tag, int new_value, bool new_delta);

  /// Create view event with tag, value and delta as indicated.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
  EventView();

  /// Create view event with tag VIEW_EVENT, value 0 and delta false.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
 public:

  std::string tag;     ///< Tag to associate.
  int value;	       ///< Value for view.
  bool delta;	       ///< True if change in value, else replace value
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//EventView.h
#ifndef __EVENT_VIEW_H__

///
/// A "view" event
///
