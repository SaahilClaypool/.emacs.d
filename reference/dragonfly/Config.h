_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
  void setConfig(std::string config);

  /// Set attributes.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
  std::string match(std::string find) const;

  /// Match key:value pair in global configuration, returning value.
  /// Return empty string if no match.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
  std::string getConfig() const;

  /// Get attributes.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
 public:

  Config();			 ///< Private since a singleton.
  Config (Config const&);	 ///< Don't allow copy.
  void operator=(Config const&); ///< Don't allow assignment.
  std::string config;		 ///< Aggregate string from config file.
  int window_horizontal_pixels;  ///< Horizontal pixels in window.
  int window_vertical_pixels;    ///< Vertical pixels in window.
  int window_horizontal_chars;   ///< Horizontal ASCII spaces in window.
  int window_vertical_chars;     ///< Vertical ASCII spaces in window.
  int window_style;		 ///< Style of window titlebar.
  enum Color window_background_color; ///< Window background color.
  int frame_time;		 ///< Target time for 1 game loop (in mlsecs).
  float font_scale;		 ///< Font scale multiplier.
  std::string window_title;	 ///< Title of window.
  bool show_mouse;               ///< True if should show mouse cursor.
  bool headless;                 ///< True if run without graphics or input.
  std::string font_file;	 ///< Filename for graphics fonts.
  std::string logfile;		 ///< Filename for dragonfly log.
  int random_seed;		 ///< Seed for random number generation.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
  void setConfig(std::string config);

  /// Set attributes.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
  std::string match(std::string find) const;

  /// Match key:value pair in global configuration, returning value.
  /// Return empty string if no match.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
  std::string getConfig() const;

  /// Get attributes.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
  static Config &getInstance();

  /// Get the singleton instance of the Config.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Config.h
 public:

  Config();			 ///< Private since a singleton.
  Config (Config const&);	 ///< Don't allow copy.
  void operator=(Config const&); ///< Don't allow assignment.
  std::string config;		 ///< Aggregate string from config file.
  int window_horizontal_pixels;  ///< Horizontal pixels in window.
  int window_vertical_pixels;    ///< Vertical pixels in window.
  int window_horizontal_chars;   ///< Horizontal ASCII spaces in window.
  int window_vertical_chars;     ///< Vertical ASCII spaces in window.
  int window_style;		 ///< Style of window titlebar.
  enum Color window_background_color; ///< Window background color.
  int frame_time;		 ///< Target time for 1 game loop (in mlsecs).
  float font_scale;		 ///< Font scale multiplier.
  std::string window_title;	 ///< Title of window.
  bool show_mouse;               ///< True if should show mouse cursor.
  bool headless;                 ///< True if run without graphics or input.
  std::string font_file;	 ///< Filename for graphics fonts.
  std::string logfile;		 ///< Filename for dragonfly log.
  int random_seed;		 ///< Seed for random number generation.
