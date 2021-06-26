package com.latte.beatbox

private const val TAG = "Sound"
private const val WAV = ".wav"

class Sound (val assetPath: String, var soundId: Int? = null){
    val name = assetPath.split("/").last().removeSuffix(WAV)
}