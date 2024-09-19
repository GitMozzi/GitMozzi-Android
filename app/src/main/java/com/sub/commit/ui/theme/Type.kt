package com.sub.commit.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sub.myapplication.R

object FontSizeTokens {
    val HeadingLg = 24.sp
    val HeadingMd = 20.sp
    val HeadingSmall = 16.sp
    val BodyMd = 16.sp
    val BodySmall = 14.sp
    val BodyXSmall = 12.sp
    val BodyXXSmall = 12.sp
}

object TypeToken {

    private val baseTextStyle = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.pretendard_bold, FontWeight.Bold),
            Font(R.font.pretendard_medium, FontWeight.Medium),
            Font(R.font.pretendard_regular, FontWeight.Normal),
            Font(R.font.pretendard_light, FontWeight.Light),
            Font(R.font.pretendard_thin, FontWeight.Thin)
        )
    )


}