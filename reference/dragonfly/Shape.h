_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Shape.h
  void draw(Vector world_pos);

  /// Shapes know how to draw themselves at given world position.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Shape.h
  Shape();

  /// Default is circle, white, size 1 cell.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Shape.h
 public:

  Color color;		  ///< Shape color.
  unsigned char r,g,b;	  ///< RGB colors used if color is CUSTOM.
  ShapeType type;	  ///< Type of shape.
  float size;		  ///< Shape radius size (in pixels).
  unsigned char opacity;  ///< Range (transparent) 0 to 255 (opaque).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Shape.h
#ifndef __SHAPE_H__

///
/// A single-space, 2d shape for drawing.
///
