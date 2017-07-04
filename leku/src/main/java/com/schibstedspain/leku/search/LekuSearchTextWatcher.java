package com.schibstedspain.leku.search;

import android.text.Editable;
import android.text.TextWatcher;

abstract class LekuSearchTextWatcher implements TextWatcher {

  private static final int MIN_CHARACTERS = 2;

  LekuSearchTextWatcher() {

  }

  @Override
  public void beforeTextChanged(CharSequence s, int start, int count, int after) {

  }

  @Override
  public void onTextChanged(CharSequence charSequence, int start, int count, int after) {
    if ("".equals(charSequence.toString())) {
      onEmptyText();
    } else if (charSequence.length() > MIN_CHARACTERS && after > count) {
      onTextChanged(charSequence);
    }
  }

  abstract void onTextChanged(CharSequence charSequence);

  abstract void onEmptyText();

  @Override
  public void afterTextChanged(Editable s) {

  }
}