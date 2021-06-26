package com.latte.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel: BaseObservable() {
    var sound: Sound? = null
        set(sound){
            field = sound
            notifyChange() // 바인딩 속성값이 변경되었음을 알림.
        }

    @get:Bindable
    val title: String?
        get() = sound?.name

}