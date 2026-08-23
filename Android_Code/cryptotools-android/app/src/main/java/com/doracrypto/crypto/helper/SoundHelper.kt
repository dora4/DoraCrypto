package com.doracrypto.crypto.helper

import android.content.Context
import android.media.MediaPlayer
import com.doracrypto.crypto.AppConfig
import dora.util.SPUtils

object SoundHelper {

    fun playResSound(context: Context, resId: Int) {
        if (SPUtils.readBoolean(context, AppConfig.PREFS_SETTINGS_SOUND_SETTING)) {
            try {
                val mp = MediaPlayer.create(context, resId)
                mp?.let {
                    it.setOnCompletionListener { player -> player.release() }
                    it.setOnErrorListener { player, _, _ ->
                        try {
                            player.release()
                        } catch (_: Exception) {
                        }
                        true
                    }
                    it.start()
                }
            } catch (ignore: Exception) {
                // 忽略播放错误，避免崩溃
            }
        }
    }
}