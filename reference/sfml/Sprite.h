_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  std::string getLabel() const;

  /// Get label associated with sprite.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  void setLabel(std::string new_label);

  /// Set label associated with sprite.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  Frame getFrame(int frame_number) const;

  /// Get next sprite frame indicated by number.
  /// Return empty frame if out of range [0, frame_count].
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  int addFrame(Frame new_frame);

  /// Add frame to sprite.
  /// Return -1 if frame array full, else 0.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  int getFrameCount() const;

  /// Get total count of frames in sprite.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  Color getColor() const;

  /// Get sprite color.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  void setColor(Color new_color);

  /// Set sprite color.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  int getHeight() const;

  /// Get height of sprite.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  void setHeight(int new_height);

  /// Set height of sprite.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  int getWidth() const;

  /// Get width of sprite.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  void setWidth(int new_width);

  /// Set width of sprite.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
  Sprite(int max_frames);  

  /// Create sprite with indicated maximum number of frames.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
 public:

  int width;            ///< Sprite width.
  int height;           ///< Sprite height.
  int max_frame_count;  ///< Maximum number of frames sprite can have.
  int frame_count;      ///< Actual number of frames sprite has.
  Color color;	        ///< Optional color for entire sprite.
  Frame *frame;         ///< Array of frames.
  std::string label;	///< Text label to identify sprite.
  Sprite();             ///< Sprite constructor always has one arg.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Sprite.h
#ifndef __SPRITE_H__

///
/// The sprite
/// 
