_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  virtual bool isModified() const;

  /// Return true if any attribute modified since last serialize.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  virtual bool isModified(enum ViewObjectAttribute attribute) const;

  /// Return true if attribute modified since last serialize.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  virtual int deserialize(std::string s);

  /// Deserialize string to become Object attributes.
  /// Rerturn 0 if no errors, else -1.  
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  virtual std::string serialize(bool all = false);

  /// Serialize ViewObject attributes to a single string.
  /// Only modified attributes (unless all is true).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  std::string getViewString() const;

  /// Get view display string.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  void setViewString(std::string new_view_string);

  /// Set view display string.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  Color getColor() const;

  /// Get view color.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  void setColor(Color new_color);

  /// Set view color.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  bool getBorder() const;

  /// Get view border (true = display border).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  void setBorder(bool new_border);

  /// Set view border (true = display border).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  int getValue() const;

  /// Get view value.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  void setValue(int new_value);

  /// Set view value.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  ViewObjectLocation getLocation() const;

  /// Get general location of ViewObject on screen.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  void setLocation(ViewObjectLocation new_location);

  /// Set general location of ViewObject on screen.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  virtual int eventHandler(const Event *p_e);

  /// Handle "view" event if tag matches view_string (others ignored).
  /// Return 0 if ignored, else 1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  virtual void draw();

  /// Draw view string and value.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
  ViewObject();

  /// Construct ViewObject. 
  /// Object settings: SPECTRAL, max altitude.
  /// ViewObject defaults: border, top_center, default color.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
 public:

  std::string view_string;   ///< Label for value (e.g., "Points").
  int value;                 ///< Value displayed (e.g., points).
  bool border;               ///< True if border around display.
  Color color;               ///< Color for text.
  ViewObjectLocation location; ///< Location of ViewObject.
  bool vmodified[VATTR_COUNT]; ///< Mod. attrib. since serialize().
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
enum ViewObjectLocation {

/// General location of ViewObject on screen.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
enum ViewObjectAttribute {

/// Categories of view object attributes that indicate modification.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
const int VATTR_COUNT = 5;

/// Count of number of view object modified attribute categories.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ViewObject.h
#ifndef __VIEW_OBJECT_H__

///
/// The view object
///
