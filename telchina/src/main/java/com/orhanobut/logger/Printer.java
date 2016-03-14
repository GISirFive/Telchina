package com.orhanobut.logger;

public interface Printer {

  Printer t(String tag, int methodCount);

  Settings init(String tag);

  Settings getSettings();

  void d(String tag, String message);

  void e(String tag, String message);

  void e(String tag, Throwable throwable, String message);

  void w(String tag, String message);

  void i(String tag, String message);

  void v(String tag, String message);

  void wtf(String tag, String message);

  void json(String tag, String json);

  void xml(String tag, String xml);

  void clear();
}
