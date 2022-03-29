package com.cs.runningappyt.domain.models

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverter // tells room that this functions convert something
    fun fromBitmap(bitmap: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)

        return outputStream.toByteArray()
    }

    @TypeConverter
    fun toBitmap(bytes: ByteArray) = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
}