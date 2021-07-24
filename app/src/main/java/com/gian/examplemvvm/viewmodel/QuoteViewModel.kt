package com.gian.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gian.examplemvvm.model.QuoteModel
import com.gian.examplemvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentCuote = QuoteProvider.random()
        quoteModel.postValue(currentCuote)

    }


}