_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  sf::RenderWindow *getWindow() const;

  /// Return pointer to SFML drawing window.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int swapBuffers();

  /// Render current window buffer.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  bool setBackgroundColor(Color new_color);

  /// Set window's background color.
  /// Return true if ok, else false.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int getVerticalPixels() const;

  /// Return window's vertical maximum (in pixels).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int getHorizontalPixels() const;

  /// Return window's horizontal maximum (in pixels).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int getVertical() const;

  /// Return window's vertical maximum (in characters).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int getHorizontal() const;

  /// Return window's horizontal maximum (in characters).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int drawString(Vector world_pos, std::string str, Justification just, 
                 Color color) const;

  /// Draw string at window location (x,y) with color.
  /// Justified left, center or right.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int drawFrame(Vector world_pos, Frame frame, bool centered, 
                Color color, char transparent=0) const;

  /// Draw single sprite frame at window location (x,y) with color.
  /// If centered true, then center frame at (x,y).
  /// Don't draw transparent characters (0 means none).
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int drawCh(Vector world_pos, char ch, Color color) const;

  /// Draw character at window location (x,y) with color.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  void shutDown();

  /// Close graphics window.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  int startUp();

  /// Open graphics window ready for text-based display.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  static GraphicsManager &getInstance();

  /// Get the one and only instance of the GraphicsManager.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
  sf::Text *p_text;

  GraphicsManager();                        ///< Private since a singleton.
  GraphicsManager (GraphicsManager const&); ///< Don't allow copy.
  void operator=(GraphicsManager const&);   ///< Don't allow assignment.
  sf::Font font;		///< Font used for ASCII graphics.
  sf::RenderWindow *p_window;	///< Pointer to SFML window.
  int window_horizontal_pixels;	///< Horizontal pixels in window.
  int window_vertical_pixels;   ///< Vertical pixels in window.
  int window_horizontal_chars;  ///< Horizontal ASCII spaces in window.
  int window_vertical_chars;    ///< Vertical ASCII spaces in window.
  sf::RectangleShape *p_rectangle;   ///< Backing rectangle for under text.
  sf::Color window_background_color; ///< Background color of window.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
Vector pixelsToSpaces(Vector pixels);

/// Convert window pixels (x,y) to ASCII spaces (x,y).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
Vector spacesToPixels(Vector spaces);

/// Convert ASCII spaces (x,y) to window pixels (x,y).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
float charWidth(void);

/// Compute character width, based on window size and font.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
float charHeight(void);

/// Compute character height, based on window size and font.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
const int WINDOW_HORIZONTAL_PIXELS_DEFAULT = 1024;

/// Defaults for SFML window.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
enum Justification {

/// String justifications.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GraphicsManager.h
#ifndef __GRAPHICS_MANAGER_H__

///
/// The SFML graphics manager
///
