package com.example.drawertest.ui.classique;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClassiqueViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ClassiqueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}