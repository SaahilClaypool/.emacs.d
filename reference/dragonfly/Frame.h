_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  std::string getString() const;

  /// Get frame characters (stored as string).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  void setString(std::string new_frame_str);

  /// Set frame characters (stored as string).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  int getHeight() const;

  /// Get height of frame.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  void setHeight(int new_height);

  /// Set height of frame.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  int getWidth() const;

  /// Get width of frame.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  void setWidth(int new_width);

  /// Set width of frame.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  Frame(int new_width, int new_height, std::string frame_str);

  /// Create frame of indicated width and height with string.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
  Frame();

  /// Create empty frame.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
 public:

  int width;             ///< Width of frame
  int height;            ///< Height of frame
  std::string frame_str; ///< All frame characters stored as string.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Frame.h
#ifndef __FRAME_H__

///
/// A sprite frame
///
